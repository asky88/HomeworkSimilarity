package pers.hdq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 文本类
 *
 * @Author: HuDaoquan
 * @Email: hudaoquan@enn.cn
 * @Date: 2022/6/14 14:25
 * @Version 1.0
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class DocFileEntity {
    /**
     * 绝对路径
     **/
    private String absolutePath;
    /**
     * 文件名
     **/
    private String fileName;
    
    /**
     * 本文所有图片的父路径
     **/
    private String pictureParentPath;
    
    /**
     * 无数字无子母文本
     **/
    private String chineseText;
    
    /**
     * 分词结果
     **/
    private List<String> wordList;
    
    /**
     * 图片hash指纹
     **/
    private List<String> pictureHash;
    
}