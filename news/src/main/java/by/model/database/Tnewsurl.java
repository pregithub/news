package by.model.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tnewsurl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tnewsurl", catalog = "news")
public class Tnewsurl implements java.io.Serializable {

	// Fields

	private Integer id;
	private String site;
	private String channel;
	private String url;

	// Constructors

	/** default constructor */
	public Tnewsurl() {
	}

	/** minimal constructor */
	public Tnewsurl(Integer id, String site, String channel) {
		this.id = id;
		this.site = site;
		this.channel = channel;
	}

	/** full constructor */
	public Tnewsurl(Integer id, String site, String channel, String url) {
		this.id = id;
		this.site = site;
		this.channel = channel;
		this.url = url;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "site", nullable = false, length = 20)
	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	@Column(name = "channel", nullable = false, length = 20)
	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Column(name = "url", length = 1000)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}