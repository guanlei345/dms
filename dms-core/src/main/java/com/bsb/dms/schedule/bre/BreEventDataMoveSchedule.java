package com.bsb.dms.schedule.bre;

/**
 * Created by guanlei on 2017/11/22.
 */

import com.smy.smyx.scheduler.dto.TaskRequest;
import com.smy.smyx.scheduler.dto.TaskResponse;
import com.smy.smyx.scheduler.service.TaskService;
import org.springframework.stereotype.Service;

/**
 * @author
 * @create 2017-11-22 15:14
 **/
@Service("breEventDataMoveSchedule")
public class BreEventDataMoveSchedule implements TaskService {

    @Override
    public TaskResponse execute(TaskRequest taskRequest) {

        return null;
    }
}