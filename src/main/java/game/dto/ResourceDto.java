package game.dto;

import game.model.ResourceEntity;

/**
 * @author ruslan.gramatic
 */
public class ResourceDto {
    private Integer id;
    private String name;
    private String description;

    public ResourceDto (ResourceEntity resourceEntity) {
        this.id = resourceEntity.getId();
        this.name = resourceEntity.getName();
        this.description = resourceEntity.getDescription();
    }

    public ResourceDto () {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ResourceDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
