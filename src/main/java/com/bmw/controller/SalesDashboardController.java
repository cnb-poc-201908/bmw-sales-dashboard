package com.bmw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmw.entity.response.RestResponse;

import io.swagger.annotations.ApiOperation;

@RestController("Sales dashboard endpoints")
@RequestMapping("/charts")
public class SalesDashboardController {
	@GetMapping(value = "", produces = "application/json")
	@ApiOperation(value = "图表列表接口")
	public RestResponse<Object> getCharts(
			@PathVariable(value = "dearlerId", required = true) String dearlerId) {

		return new RestResponse<>();
	}
}
