package com.scut.demo.dao.impl;

import com.scut.demo.dao.UserDao;
import com.scut.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    DataSource dataSource;

    @Override
    public User handleLogin(User user) {

        String sql = "select * from user where name = ? and password = ?";
        User userDb = null;
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            // 这里只有1条或0条两种情况
            if (resultSet.next()){
                userDb = new User();
                userDb.setId(resultSet.getInt("id"));
                userDb.setName(resultSet.getString("name"));
                userDb.setPassword(resultSet.getString("password"));
                userDb.setCreateTime(resultSet.getTimestamp("create_time"));
                userDb.setLastLoginTime(resultSet.getTimestamp("last_login_time"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return userDb;
    }

    @Override
    public int queryByName(String name) {
        String sql = "select count(*) from user where name = ?";
        int result = 0;
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            // 这里只有1条或0条两种情况
            if (resultSet.next()){
                result = resultSet.getInt(1);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int save(User user) {
        String sql = "insert into user values(null,?, ?, ?, ?)";
        int result = 0;
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setTimestamp(3, new Timestamp(user.getCreateTime().getTime()));
            preparedStatement.setTimestamp(4,new Timestamp(user.getLastLoginTime().getTime()));
            result = preparedStatement.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int update(User user) {
        String sql = "update user set last_login_time = ? where id = ?";
        int result = 0;
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setTimestamp(1,new Timestamp(user.getLastLoginTime().getTime()));
            preparedStatement.setInt(2,user.getId());
            result = preparedStatement.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
