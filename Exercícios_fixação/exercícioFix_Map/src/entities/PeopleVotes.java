package entities;

public class PeopleVotes {

	private String name;
	private Integer vote;
	
	public PeopleVotes(String name, Integer vote) {
		this.name = name;
		this.vote = vote;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVote() {
		return vote;
	}

	public void setVote(Integer vote) {
		this.vote = vote;
	}
	
	
	
	
	
}
