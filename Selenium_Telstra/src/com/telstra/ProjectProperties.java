package com.telstra;

import java.io.FileInputStream;
import java.util.Properties;

public class ProjectProperties {
	private String base_url;
	private String wait_time;
	private String file_name;
	private String log_file;
	private String all_browser;
	private String multiple;
	
	public ProjectProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(Constant.PROPERTIES_FILE));
			
			base_url = properties.getProperty("base_url", "");
			wait_time = properties.getProperty("wait_time", "");
			file_name = properties.getProperty("file_name", "");
			all_browser = properties.getProperty("all_browser", "");
			log_file = properties.getProperty("log_file", "");
			multiple = properties.getProperty("multiple", "");
		} catch (Exception e) { 
		}
	}
		
	public String getBase_url() {
		return base_url;
	}
	public void setBase_url(String base_url) {
		this.base_url = base_url;
	}
	public String getWait_time() {
		return wait_time;
	}
	public void setWait_time(String wait_time) {
		this.wait_time = wait_time;
	}

	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getLog_file() {
		return log_file;
	}

	public void setLog_file(String log_file) {
		this.log_file = log_file;
	}

	public String getAll_browser() {
		return all_browser;
	}

	public void setAll_browser(String all_browser) {
		this.all_browser = all_browser;
	}

	public String getMultiple() {
		return multiple;
	}

	public void setMultiple(String multiple) {
		this.multiple = multiple;
	}
}
