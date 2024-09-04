package in.vishal.dto;

public class ResetPwdFormDTO {

	  private String email;
	    private String newPwd;
	    private String confirmPwd;
	    // Getters and Setters
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNewPwd() {
			return newPwd;
		}
		public void setNewPwd(String newPwd) {
			this.newPwd = newPwd;
		}
		public String getConfirmPwd() {
			return confirmPwd;
		}
		public void setConfirmPwd(String confirmPwd) {
			this.confirmPwd = confirmPwd;
		}
	    
}
