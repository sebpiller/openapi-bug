package com.temp.demo;

import org.openapitools.api.DemoApi;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class DemoController implements DemoApi {
  /*  @Override
    public ResponseEntity<UploadResponseModel> ok(UploadFilesRequestModel uploadFilesRequestModel) {
        return ResponseEntity.ok(new UploadResponseModel().accepted(true));
    }
*/
    @Override
    public ResponseEntity<UploadResponseModel> ok(List<UploadFileKoModel> files) {
        return null;
    }
}
