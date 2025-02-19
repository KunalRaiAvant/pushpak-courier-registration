package com.pushpak.registration.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Service
public class SupabaseAuthService {

    private final String SUPABASE_AUTH_URL = "https://sbzejrhepdceuyvyvsmy.supabase.co/auth/v1/token?grant_type=password";
    private final String SUPABASE_API_KEY = "YOUR_SUPABASE_ANON_KEY"; // Replace with an environment variable

    private final RestTemplate restTemplate = new RestTemplate();

    public String loginUser(String email, String password) {
        Map<String, String> request = new HashMap<>();
        request.put("email", email);
        request.put("password", password);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("apikey", SUPABASE_API_KEY);

        HttpEntity<Map<String, String>> entity = new HttpEntity<>(request, headers);

        ResponseEntity<String> response = restTemplate.exchange(SUPABASE_AUTH_URL, HttpMethod.POST, entity, String.class);
        return response.getBody();
    }
}
