package com.jtravel.api.file.domain.upload.entity.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author ThinkPad
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileMessage {
    private String status;
    private Map<String,Object> data;
}
