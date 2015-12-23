package com.ms.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.ms.model.FileHeader;

public class FileHeaderMapper implements FieldSetMapper<FileHeader> {

	public FileHeader mapFieldSet(FieldSet fields) throws BindException {
		FileHeader header = new FileHeader();

		header.setSku(fields.readString(0));
		header.setCategory(fields.readString(1));
		header.setName(fields.readString(2));
		header.setDescription(fields.readString(3));
		return header;
	}

}
