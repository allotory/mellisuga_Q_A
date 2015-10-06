package com.mellisuga.dao;

import java.util.List;

import com.mellisuga.model.Answers;
import com.mellisuga.model.Question;

public interface AnswersDAO {

	// 插入答案
	public void insertAnswer(Answers answers);
	
	// 由问题ID查询答案
	public List<Answers> queryAnswerByQuestionId(Question question);
	
	// 由问题ID和用户ID查询答案
	public Answers queryAnswerByQUid(Answers answers);
	
	// 由答案ID查询答案
	public Answers queryAnswerById(Answers answers);
	
	// 更新答案
	public void updateAnswer(Answers answers);
}
