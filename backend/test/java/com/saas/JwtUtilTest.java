package com.saas.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JwtUtilTest {

    @Test
    void testGenerateAndValidateToken() {
        JwtUtil jwtUtil = new JwtUtil();
        String token = jwtUtil.generateToken("testUser");
        assertNotNull(token);

        String username = jwtUtil.extractUsername(token);
        assertEquals("testUser", username);
    }
}
