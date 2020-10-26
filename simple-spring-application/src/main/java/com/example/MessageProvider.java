package com.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class MessageProvider {
	@Resource(name="list")
	private List<Object> list;
	@Resource(name="set")
	private Set<Object> set;
	@Resource(name="map")
	private Map<String, Object> map;
	@Resource(name="props")
	private Properties props;
	
	@Override
	public String toString() {
		return "MessageProvider [list=" + list + ", set=" + set + ", map=" + map + ", props=" + props + "]";
	}
}