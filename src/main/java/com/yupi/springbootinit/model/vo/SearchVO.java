package com.yupi.springbootinit.model.vo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yupi.springbootinit.model.entity.Picture;
import com.yupi.springbootinit.model.entity.Post;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
public class SearchVO implements Serializable {

    private final static Gson GSON = new Gson();
    List<UserVO> userList;
    List<PostVO> postList;
    List<Picture> pictureList;
    private static final long serialVersionUID = 1L;
}
