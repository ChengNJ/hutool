package com.xiaoleilu.hutool.demo;

import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;

import com.xiaoleilu.hutool.GroupedSet;
import com.xiaoleilu.hutool.Log;

/**
 * 分组集合Demo
 * @author Looly
 *
 */
public class GroupedSetDemo {
	private final static Logger log = Log.get();
	
	public static void main(String[] args) {
		GroupedSet set = new GroupedSet("config/demo.set");
		log.debug("path: {}", set.getPath());
		log.debug("groups: {}", set.getGroups());
		
		log.debug("特殊分组是否包含字符1: {}", set.contains("特殊分组", "1"));
		
		Set<Entry<String,LinkedHashSet<String>>> entrySet = set.entrySet();
		for (Entry<String, LinkedHashSet<String>> entry : entrySet) {
			log.debug(entry.toString());
		}
	}
}
