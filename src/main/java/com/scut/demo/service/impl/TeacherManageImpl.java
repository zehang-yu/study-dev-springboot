package com.scut.demo.service.impl;

import com.scut.demo.entity.TeacherManage;
import com.scut.demo.mapper.TeacherManageMapper;
import com.scut.demo.service.TeacherManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherManageImpl implements TeacherManageService {
    @Autowired
    private TeacherManageMapper teacherManageMapper;

    @Autowired
    DataSource dataSource;

    @Override
    public TeacherManage getJudgeTestById(int Id) {
        return teacherManageMapper.getTeacherManageById(Id);
    }

    @Override
    public List<TeacherManage> getCuoTiByStuID(Integer stu_id) {
        String sql = "SELECT * FROM do_question NATURAL JOIN question NATURAL JOIN student WHERE stu_id=? AND record=0;";
        List result=new ArrayList<TeacherManage>();
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,stu_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int s_id=resultSet.getInt("stu_id");
                int q_id=resultSet.getInt("que_id");
                String s_name=resultSet.getString("name");
                String q_title=resultSet.getString("title");
                System.out.print(s_name);
                String sql2="SELECT * FROM do_question NATURAL JOIN student WHERE record=1 AND que_id=?";
                Connection connection2 = dataSource.getConnection();
                PreparedStatement preparedStatement2 = connection2.prepareStatement(sql2);
                preparedStatement2.setInt(1,q_id);
                ResultSet resultSet2 = preparedStatement2.executeQuery();
                List result2=new ArrayList<String>();
                while (resultSet2.next()){
                    String x=resultSet2.getString("name");
                    result2.add(x);
                }
                result.add(new TeacherManage(s_id,q_id,s_name,q_title,result2));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}

