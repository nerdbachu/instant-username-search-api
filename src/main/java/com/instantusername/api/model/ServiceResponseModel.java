package com.instantusername.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServiceResponseModel {
  String service;
  String url;
  boolean available;
  String message;
}
