package tw.com.ticbcs.convert;

import org.mapstruct.Mapper;

import tw.com.ticbcs.pojo.DTO.addEntityDTO.AddPublishFileDTO;
import tw.com.ticbcs.pojo.DTO.putEntityDTO.PutPublishFileDTO;
import tw.com.ticbcs.pojo.entity.PublishFile;

@Mapper(componentModel = "spring")
public interface PublishFileConvert {

	PublishFile addDTOToEntity(AddPublishFileDTO addPublishFileDTO);

	PublishFile putDTOToEntity(PutPublishFileDTO putPublishFileDTO);

}
