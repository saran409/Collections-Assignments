package model0;

import java.util.Objects;

public class Review {
	private String cusName;
	private int rating;
	private String feedBack;
	public Review() {
		super();
	}
	public Review(String cusName, int rating, String feedBack) {
		super();
		this.cusName = cusName;
		this.rating = rating;
		this.feedBack = feedBack;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedBack() {
		return feedBack;
	}
	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cusName, feedBack, rating);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return Objects.equals(cusName, other.cusName) && Objects.equals(feedBack, other.feedBack)
				&& rating == other.rating;
	}
	@Override
	public String toString() {
		return "Review [cusName=" + cusName + ", rating=" + rating + ", feedBack=" + feedBack + "]";
	}
	
	

}
