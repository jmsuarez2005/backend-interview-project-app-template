package com.ninjaone.backendinterviewproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninjaone.backendinterviewproject.model.OperatingSystem;
import com.ninjaone.backendinterviewproject.service.api.OperatingSystemServiceInterface;


@RestController
@RequestMapping(path = "api/v1/admin/operatingsystem")
public class OperatingSystemController
        extends AbstractController<OperatingSystem, String, OperatingSystemServiceInterface> {

}
