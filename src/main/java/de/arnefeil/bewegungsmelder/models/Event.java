package de.arnefeil.bewegungsmelder.models;

import java.util.List;

/**
 * Created by arne on 10/3/13.
 */
public class Event {

    private int id;
    private Date date;
    private String title;
    private String description;
    private List<Band> bands;
    private Location location;
    private List<Link> links;
    private Time timeEntry;
    private Time timeStart;
    private String price;
    private String descriptionExtras;
    private List<String> type;
    private boolean cancelled;
    private boolean favorite;
    private boolean isABlank = false;

    public void setIsABlank(boolean isABlank) {
        this.isABlank = isABlank;
    }
    public boolean getIsABlank() {
        return this.isABlank;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBands(List<Band> bands) {
        this.bands = bands;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public void setTimeEntry(Time timeEntry) {
        this.timeEntry = timeEntry;
    }

    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }

    public void setPrice(String price) {
        this.price = price.replace("/", "\n");
    }

    public void setDescriptionExtras(String descriptionExtras) {
        this.descriptionExtras = descriptionExtras;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Band> getBands() {
        return bands;
    }

    public Location getLocation() {
        return location;
    }

    public List<Link> getLinks() {
        return links;
    }

    public Time getTimeEntry() {
        return timeEntry;
    }

    public Time getTimeStart() {
        return timeStart;
    }

    public String getPrice() {
        return price;
    }

    public String getDescriptionExtras() {
        return descriptionExtras;
    }

    public List<String> getType() {
        return type;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean isFavorite() {
        return this.favorite;
    }
}
