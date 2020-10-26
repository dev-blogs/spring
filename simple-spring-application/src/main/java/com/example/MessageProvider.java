package com.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MessageProvider {
	private List<Object> list;
	private Set<Object> set;
	private Map<String, Object> map;
	private Properties props;
	
	public List<Object> getList() {
		return list;
	}
	
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public Set<Object> getSet() {
		return set;
	}
	
	public void setSet(Set<Object> set) {
		this.set = set;
	}
	
	public Map<String, Object> getMap() {
		return map;
	}
	
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	public Properties getProps() {
		return props;
	}
	
	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "MessageProvider [list=" + list + ", set=" + set + ", map=" + map + ", props=" + props + "]";
	}
}