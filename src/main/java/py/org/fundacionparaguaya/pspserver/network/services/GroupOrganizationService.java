package py.org.fundacionparaguaya.pspserver.network.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import py.org.fundacionparaguaya.pspserver.common.pagination.PaginableList;
import py.org.fundacionparaguaya.pspserver.network.dtos.GroupOrganizationDTO;
import py.org.fundacionparaguaya.pspserver.network.dtos.OrganizationDTO;
import py.org.fundacionparaguaya.pspserver.network.entities.OrganizationEntity;
import py.org.fundacionparaguaya.pspserver.security.dtos.UserDetailsDTO;

import java.util.List;

/**
 * Management of organizations groups
 */
public interface GroupOrganizationService {

    /**
     * Creates a new organization group
     * @param groupOrganizationDTO
     * @return
     */
    GroupOrganizationDTO addGroupOrganization(GroupOrganizationDTO groupOrganizationDTO);

    /**
     * Updates the information of the groups
     * @param groupOrganizationId
     * @param groupOrganizationDTO
     * @return
     */
    GroupOrganizationDTO updateGroupOrganization(Long groupOrganizationId, GroupOrganizationDTO groupOrganizationDTO);

    /**
     * Returns the information of a group an his organizations
     * @param groupOrganizationId
     * @return
     */
    GroupOrganizationDTO getGroupOrganizationById(Long groupOrganizationId);
}