package com.usthe.performance.springsecuritydemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tomsun28
 * @date 2021/1/24 14:17
 */
@RestController
public class SimulateController {

    /** access success message **/
    public static final String SUCCESS_ACCESS_RESOURCE = "access this resource success";

    @GetMapping("/api/v1/source1")
    public ResponseEntity<String> api1Mock1() {
        return ResponseEntity.ok(SUCCESS_ACCESS_RESOURCE);
    }

    @PutMapping("/api/v1/source1")
    public ResponseEntity<String> api1Mock3() {
        return ResponseEntity.ok(SUCCESS_ACCESS_RESOURCE);
    }

    @DeleteMapping("/api/v1/source1")
    public ResponseEntity<String> api1Mock4() {
        return ResponseEntity.ok(SUCCESS_ACCESS_RESOURCE);
    }

    @GetMapping("/api/v1/source2")
    public ResponseEntity<String> api1Mock5() {
        return ResponseEntity.ok(SUCCESS_ACCESS_RESOURCE);
    }

    @GetMapping("/api/v1/source2/{var1}/{var2}")
    public ResponseEntity<String> api1Mock6(@PathVariable String var1, @PathVariable Integer var2 ) {
        return ResponseEntity.ok(SUCCESS_ACCESS_RESOURCE);
    }

    @PostMapping("/api/v2/source3/{var1}")
    public ResponseEntity<String> api1Mock7(@PathVariable String var1) {
        return ResponseEntity.ok(SUCCESS_ACCESS_RESOURCE);
    }

    @GetMapping("/api/v1/source3")
    public ResponseEntity<String> api1Mock11(HttpServletRequest request) {
        return ResponseEntity.ok(SUCCESS_ACCESS_RESOURCE);
    }

}

