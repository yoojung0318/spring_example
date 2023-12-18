package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
	@Autowired
	private ReviewMapper reviewMapper;
	// input: id  output: Review ( 리스트 아닌 하나만 리턴 하니까)//ReviewMapper에서 받아옴
	public Review getReview(int id) { // null 허용 없음: int
		return reviewMapper.selectReview(id);
	}
}
