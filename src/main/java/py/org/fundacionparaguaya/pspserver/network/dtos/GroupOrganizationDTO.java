package py.org.fundacionparaguaya.pspserver.network.dtos;

import com.google.common.base.MoreObjects;
import py.org.fundacionparaguaya.pspserver.system.dtos.CountryDTO;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

public class GroupOrganizationDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @NotNull
    private String name;

    private String description;

    private OrganizationDTO master;

    private List<OrganizationDTO> organizations;


    public GroupOrganizationDTO() {
    }

    public GroupOrganizationDTO(Long id, @NotNull String name, String description, OrganizationDTO master, List<OrganizationDTO> organizations) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.master = master;
        this.organizations = organizations;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationDTO getMaster() {
        return master;
    }

    public void setMaster(OrganizationDTO master) {
        this.master = master;
    }

    public List<OrganizationDTO> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<OrganizationDTO> organizations) {
        this.organizations = organizations;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String description;
        private OrganizationDTO master;
        private List<OrganizationDTO> organizations;

        public GroupOrganizationDTO.Builder id(Long groupOrganizationId) {
            this.id = groupOrganizationId; return this;
        }

        public GroupOrganizationDTO.Builder name(String name) {
            this.name = name; return this;
        }

        public GroupOrganizationDTO.Builder description(String description) {
            this.description = description; return this;
        }

        public GroupOrganizationDTO.Builder master(OrganizationDTO master) {
            this.master = master; return this;
        }

        public GroupOrganizationDTO.Builder organizations(List<OrganizationDTO> organizations) {
            this.organizations = organizations; return this;
        }

        public GroupOrganizationDTO build() {
            return new GroupOrganizationDTO(
                    id, name,  description, master, organizations);
        }
    }

    public static GroupOrganizationDTO.Builder builder() {
        return new GroupOrganizationDTO.Builder();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id).add("name", name)
                .add("description", description)
                .add("master", master)
                .toString();
    }
}
