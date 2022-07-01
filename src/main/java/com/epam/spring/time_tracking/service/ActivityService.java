package com.epam.spring.time_tracking.service;

import com.epam.spring.time_tracking.dto.activity.ActivityDto;
import com.epam.spring.time_tracking.dto.activity.ActivityForUserDto;
import com.epam.spring.time_tracking.dto.activity.ActivityInputDto;
import com.epam.spring.time_tracking.dto.user.UserInActivityDto;

import java.util.List;

public interface ActivityService {
    ActivityDto createActivity(ActivityInputDto activityInputDto);

    List<ActivityDto> getActivities();

    ActivityDto getActivity(int activityId);

    ActivityDto updateActivity(int activityId, ActivityInputDto activityInputDto);

    void deleteActivity(int activityId);

    List<ActivityForUserDto> getActivitiesForUser(int userId);

    List<UserInActivityDto> getActivityUsers(int activityId);

    UserInActivityDto addUserToActivity(int activityId, int userId);

    void removeUserFromActivity(int activityId, int userId);

    UserInActivityDto getUserInActivity(int activityId, int userId);
}
