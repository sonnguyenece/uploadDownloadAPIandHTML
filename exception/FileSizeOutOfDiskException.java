package com.example.uploaddownloadfile.exception;

import lombok.Data;

@Data
public class FileSizeOutOfDiskException extends RuntimeException {
    String error;
    public FileSizeOutOfDiskException( String cause) {
        this.error = cause;
    }
}
