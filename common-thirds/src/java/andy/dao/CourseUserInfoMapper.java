package andy.dao;

import andy.model.CourseUserInfo;
import andy.model.CourseUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseUserInfoMapper {
    int countByExample(CourseUserInfoExample example);

    int deleteByExample(CourseUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseUserInfo record);

    int insertSelective(CourseUserInfo record);

    List<CourseUserInfo> selectByExample(CourseUserInfoExample example);

    CourseUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseUserInfo record, @Param("example") CourseUserInfoExample example);

    int updateByExample(@Param("record") CourseUserInfo record, @Param("example") CourseUserInfoExample example);

    int updateByPrimaryKeySelective(CourseUserInfo record);

    int updateByPrimaryKey(CourseUserInfo record);
}