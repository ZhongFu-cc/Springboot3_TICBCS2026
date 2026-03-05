package tw.com.ticbcs.validation.constraint;

import tw.com.ticbcs.enums.FormFieldTypeEnum;
import tw.com.ticbcs.pojo.DTO.FormFieldOptionDTO;

public interface HasFieldOptions {

	public FormFieldTypeEnum getFieldType();
	
	public FormFieldOptionDTO getOptions();
	
}
