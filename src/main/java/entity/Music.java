package entity;

import org.hibernate.annotations.OptimisticLockType;

import javax.persistence.*;
import java.util.Date;

/**
 * create music in database
 */

@Entity
@org.hibernate.annotations.Entity(optimisticLock = OptimisticLockType.ALL, dynamicUpdate = true)
@Table(name="music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "song_name", length = 40)
    private String song_name;

    @Column(name = "date")
    @Temporal(value = TemporalType.DATE)
    private Date date;

    @Column(name = "singer")
    private String singer;

    @Column(name = "genre")
    private String genre;

    @Column(name = "size")
    private Long size;

    public Music() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}