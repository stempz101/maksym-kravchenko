package com.epam.spring.time_tracking.controller;

import com.epam.spring.time_tracking.dto.activity.ActivityDto;
import com.epam.spring.time_tracking.dto.activity.ActivityInputDto;
import com.epam.spring.time_tracking.dto.activity.ActivityViewDto;
import com.epam.spring.time_tracking.dto.user.UserInActivityDto;
import com.epam.spring.time_tracking.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityService activityService;

    @PostMapping("/activity")
    public ActivityDto createActivity(@RequestBody ActivityInputDto activityInputDto) {
        return activityService.createActivity(activityInputDto);
    }

    @GetMapping("/activity")
    public List<ActivityDto> getActivities() {
        return activityService.getActivities();
    }

    @GetMapping("/activity/{activityId}")
    public ActivityDto getActivity(@PathVariable int activityId) {
        return activityService.getActivity(activityId);
    }

    @GetMapping("/activity/{activityId}/user")
    public List<UserInActivityDto> getActivityUsers(@PathVariable int activityId) {
        return activityService.getActivityUsers(activityId);
    }

    @PostMapping("/activity/{activityId}/user/{userId}")
    public UserInActivityDto addUserToActivity(@PathVariable int activityId, @PathVariable int userId) {
        return activityService.addUserToActivity(activityId, userId);
    }

    @DeleteMapping("/activity/{activityId}/user/{userId}")
    public ResponseEntity<Void> removeUserFromActivity(@PathVariable int activityId, @PathVariable int userId) {
        activityService.removeUserFromActivity(activityId, userId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/activity/{activityId}")
    public ActivityDto updateActivity(@PathVariable int activityId, @RequestBody ActivityInputDto activityInputDto) {
        return activityService.updateActivity(activityId, activityInputDto);
    }

    @DeleteMapping("/activity/{activityId}")
    public ResponseEntity<Void> deleteActivity(@PathVariable int activityId) {
        activityService.deleteActivity(activityId);
        return ResponseEntity.noContent().build();
    }

}