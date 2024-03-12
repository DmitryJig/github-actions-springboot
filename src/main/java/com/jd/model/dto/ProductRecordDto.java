package com.jd.model.dto;

import lombok.Value;

import java.math.BigDecimal;

public record ProductRecordDto(Long id, String title, BigDecimal price) {
}
