package com.kp.design.patterns.builder;

public class User {
	private final String userId;
	private final String userName;
	private final String emailId;

	private User(UserBuilder userbuilder) {
		this.userId = userbuilder.userId;
		this.userName = userbuilder.userName;
		this.emailId = userbuilder.emailId;
	}

	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + "]";
	}


	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}

	static class UserBuilder {
		private String userId;
		private String userName;
		private String emailId;

		public UserBuilder() {
			super();
		}
		
		public static UserBuilder builder() {
			return new UserBuilder();
		}

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}
}
