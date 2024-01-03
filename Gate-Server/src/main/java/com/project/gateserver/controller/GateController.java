package com.project.gateserver.controller;


import com.project.gateserver.dto.ResultDTO;
import com.project.gateserver.dto.TransferDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

@RestController
@RequestMapping(method = RequestMethod.GET)
public class GateController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/{a}/{b}/{jenisPerhitungan}")
    public ResponseEntity<ResultDTO> calculatorEndPoint(@PathVariable("a") Integer a,
                                                        @PathVariable("b") Integer b,
                                                        @PathVariable("jenisPerhitungan") String jenisPerhitungan)
    {
        ServiceInstance serviceInstance = new ServiceInstance() {
            @Override
            public String getServiceId() {
                return null;
            }

            @Override
            public String getHost() {
                return null;
            }

            @Override
            public int getPort() {
                return 0;
            }

            @Override
            public boolean isSecure() {
                return false;
            }

            @Override
            public URI getUri() {
                return null;
            }

            @Override
            public Map<String, String> getMetadata() {
                return null;
            }
        };
        TransferDTO transferDto = new TransferDTO();
        transferDto.setA(a);
        transferDto.setB(b);
        if(jenisPerhitungan.equals("LayangLayang")){
            serviceInstance = loadBalancerClient.choose("layang-layang-server");
        } else if (jenisPerhitungan.equals("Segitiga")) {
            serviceInstance = loadBalancerClient.choose("segitiga-server");
        } else if (jenisPerhitungan.equals("PersegiPanjang")) {
            serviceInstance = loadBalancerClient.choose("persegi-panjang-Server");

        }
        String selectedUrl = serviceInstance.getUri().toString();
        String baseUrl = selectedUrl+"/calc";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultDTO> response = restTemplate.postForEntity(baseUrl, transferDto, ResultDTO.class);
        ResultDTO resultDto = response.getBody();
        return ResponseEntity.ok(resultDto);
    }
}
