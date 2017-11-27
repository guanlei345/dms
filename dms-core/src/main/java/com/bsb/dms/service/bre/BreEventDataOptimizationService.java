package com.bsb.dms.service.bre;
/**
 * Created by guanlei on 2017/11/22.
 */

import com.bsb.bre.domain.BreEvent;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @create 2017-11-22 17:12
 **/
@RestController
@RequestMapping("/bre")
public class BreEventDataOptimizationService {

    @ApiOperation(value="获取BreEvent列表", notes="")
    @RequestMapping(value = "/breEvent", method = RequestMethod.GET)
    List<BreEvent> getBreEventList(){
        List<BreEvent> datas = new ArrayList<>();
        BreEvent event1 = new BreEvent();
        event1.setBusinessId("bus1");
        event1.setCustNo("custNo1");
        event1.setRequestId("request1");
        datas.add(event1);

        BreEvent event2 = new BreEvent();
        event2.setBusinessId("bus2");
        event2.setCustNo("custNo2");
        event2.setRequestId("request2");
        datas.add(event2);

        return datas;
    }
}