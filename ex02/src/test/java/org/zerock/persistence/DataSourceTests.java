package org.zerock.persistence;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	public void testMyBatis() {

		try (SqlSession session = sqlSessionFactory.openSession();
				Connection con = session.getConnection();) {

			log.info(session);
			log.info(con);

		} catch (Exception e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testConnection() {

		try (Connection con = dataSource.getConnection()) {

			log.info(con);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM tbl_board WHERE bno > 0");

			while (rs.next()) {
				BoardVO board = new BoardVO();
				board.setBno(rs.getLong("bno"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
//				board.setRegdate(rs.getDate("bno"));
//				board.setUpdateDate(rs.getDate("bno"));
				log.info(board);
			}
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
