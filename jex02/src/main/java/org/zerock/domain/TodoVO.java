package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class TodoVO {

  private Long tno;
  private String title;
  private Date regdate;
  private Date updateDate;
}
