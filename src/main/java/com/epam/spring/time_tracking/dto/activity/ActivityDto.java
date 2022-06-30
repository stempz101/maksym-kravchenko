package com.epam.spring.time_tracking.dto.activity;

import com.epam.spring.time_tracking.dto.category.CategoryDto;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ActivityDto {
    private int id;
    private String name;
    private List<CategoryDto> categories;
    private String description;
    private String image;
    private int peopleCount;
    private int creatorId;
    private Date createTime;
}
