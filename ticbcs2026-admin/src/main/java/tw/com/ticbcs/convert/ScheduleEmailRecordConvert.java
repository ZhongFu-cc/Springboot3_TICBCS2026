package tw.com.ticbcs.convert;

import org.mapstruct.Mapper;

import tw.com.ticbcs.pojo.DTO.addEntityDTO.AddScheduleEmailRecordDTO;
import tw.com.ticbcs.pojo.entity.ScheduleEmailRecord;

@Mapper(componentModel = "spring")
public interface ScheduleEmailRecordConvert {

	ScheduleEmailRecord addDTOToEntity(AddScheduleEmailRecordDTO addScheduleEmailRecordDTO);

	ScheduleEmailRecord copyEntity(ScheduleEmailRecord scheduleEmailRecord);
	
}
