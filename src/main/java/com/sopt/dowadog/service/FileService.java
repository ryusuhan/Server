package com.sopt.dowadog.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    void fileUpload(MultipartFile multipartFile, String filePath);
    void fileDownload(String filePath);
}
