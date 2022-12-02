package com.oracle.hj20221201.service;

import org.springframework.stereotype.Service;

import com.oracle.hj20221201.dao.MainDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {
	private final MainDao md;

}
