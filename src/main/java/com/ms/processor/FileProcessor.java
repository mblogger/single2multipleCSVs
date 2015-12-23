package com.ms.processor;

import org.springframework.batch.item.ItemProcessor;

import com.ms.model.FileHeader;

public class FileProcessor implements ItemProcessor<FileHeader, FileHeader> {

	public FileHeader process(FileHeader arg0) throws Exception {
		return arg0;
	}

}
