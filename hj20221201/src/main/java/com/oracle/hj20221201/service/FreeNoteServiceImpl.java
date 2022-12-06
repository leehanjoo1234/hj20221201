package com.oracle.hj20221201.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.hj20221201.dao.FreeNoteDao;
import com.oracle.hj20221201.dto.NoticeCateGory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FreeNoteServiceImpl implements FreeNoteService {
	private final FreeNoteDao fnd;

	@Override
	public List<NoticeCateGory> noteCateGory() {
		List<NoticeCateGory> noteCate = null;
		System.out.println("FreeNoteServiceImpl NoticeCateGory Start...");
		noteCate = fnd.NoticeCateGory();
		System.out.println("FreeNoteServiceImpl FreeNoteServiceImpl->"+noteCate.size());
		
		return noteCate;
	}
}
