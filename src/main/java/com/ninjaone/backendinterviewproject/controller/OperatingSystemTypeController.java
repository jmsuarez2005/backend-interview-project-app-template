package com.ninjaone.backendinterviewproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninjaone.backendinterviewproject.model.OperatingSystemType;
import com.ninjaone.backendinterviewproject.service.api.OperatingSystemTypeServiceInterface;


@RestController
@RequestMapping(path = "api/v1/admin/operatingsystemtype")
public class OperatingSystemTypeController
        extends AbstractController<OperatingSystemType, String, OperatingSystemTypeServiceInterface> {

}
