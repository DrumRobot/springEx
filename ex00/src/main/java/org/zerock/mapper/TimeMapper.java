package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

  @Select("SELECT CURRENT_TIMESTAMP()")
  public String getTime();

}
