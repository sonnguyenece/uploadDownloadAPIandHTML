package com.example.uploaddownloadfile;

import com.example.uploaddownloadfile.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class UploaddownloadfileApplication {
    public static void main(String[] args) {
        SpringApplication.run(UploaddownloadfileApplication.class, args);
    }

}
