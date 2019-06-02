package com.infosys.contactmanager.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.infosys.contactmanager.dto.PhoneDTO;
import com.infosys.contactmanager.entity.Phone;

public class PhoneMapper {

	@Autowired
	ModelMapper modelMapper;
	
	public PhoneDTO convertToDTO(Phone phone) {
		PhoneDTO phoneDTO = modelMapper.map(phone, PhoneDTO.class);
		return phoneDTO;
	}
	
	/*private Post convertToEntity(PostDto postDto) throws ParseException {
	    Post post = modelMapper.map(postDto, Post.class);
	    post.setSubmissionDate(postDto.getSubmissionDateConverted(
	      userService.getCurrentUser().getPreference().getTimezone()));
	  
	    if (postDto.getId() != null) {
	        Post oldPost = postService.getPostById(postDto.getId());
	        post.setRedditID(oldPost.getRedditID());
	        post.setSent(oldPost.isSent());
	    }
	    return post;
	}*/
}
