package com.xiaofeng.pro.controller;

import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.xiaofeng.pro.base.MyBaseController;
import com.xiaofeng.pro.common.utils.ExportExcelUtil;
import com.xiaofeng.pro.common.utils.PageUtil;
import com.xiaofeng.pro.common.utils.RedisUtil;
import com.xiaofeng.pro.common.utils.ResultUtil;
import com.xiaofeng.pro.common.vo.PageVo;
import com.xiaofeng.pro.common.vo.Result;
import com.xiaofeng.pro.common.vo.SearchVo;
import com.xiaofeng.pro.config.ymlproperties.OrganizationConfigProperties;
import com.xiaofeng.pro.dto.OrganizationDTO;
import com.xiaofeng.pro.entity.Organization;
import com.xiaofeng.pro.entity.OrganizationType;
import com.xiaofeng.pro.entity.User;
import com.xiaofeng.pro.service.OrganizationService;
import com.xiaofeng.pro.service.OrganizationTypeService;
import com.xiaofeng.pro.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/edu/feng/organization")
@Transactional
@Slf4j
public class OrganizationController extends MyBaseController{

    @Resource
    private RedisUtil redisUtil;

    @GetMapping("/testredis")
    public String testredis(HttpServletResponse response){
        redisUtil.set("xxf", "hhhh");
        return String.valueOf(redisUtil.get("xxf"));
    }
}
