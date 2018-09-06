package py.org.fundacionparaguaya.pspserver.surveys.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import py.org.fundacionparaguaya.pspserver.families.dtos.FamilyDTO;
import py.org.fundacionparaguaya.pspserver.security.dtos.UserDTO;

/**
 * Created by rodrigovillalba on 10/17/17.
 */
public class Snapshot {

    @JsonProperty("survey_id")
    private Long surveyId = null;

    @JsonProperty("snapshot_economic_id")
    private Long snapshotEconomicId = null;

    @JsonProperty("personal_survey_data")
    private SurveyData personalSurveyData = null;

    @JsonProperty("economic_survey_data")
    private SurveyData economicSurveyData = null;

    @JsonProperty("indicator_survey_data")
    private SurveyData indicatorSurveyData = null;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("user_id")
    private Long userId = null;

    @JsonProperty("user")
    private UserDTO user = null;

    @JsonProperty("family")
    private FamilyDTO family = null;

    @JsonProperty("term_cond_id")
    private Long termCondId = null;

    @JsonProperty("priv_pol_id")
    private Long privPolId = null;

    @JsonProperty("snapshot_indicator_id")
    private Long snapshotIndicatorId= null;

    @JsonProperty("survey_version_id")
    private Long surveyVersionId;

    public Long getSurveyVersionId() {
        return surveyVersionId;
    }

    public void setSurveyVersionId(Long surveyVersionId) {
        this.surveyVersionId = surveyVersionId;
    }

    public Snapshot personalSurveyData(SurveyData surveyData) {
        this.personalSurveyData = surveyData;
        return this;
    }

    public Snapshot economicSurveyData(SurveyData surveyData) {
        this.economicSurveyData = surveyData;
        return this;
    }

    public Snapshot indicatorSurveyData(SurveyData surveyData) {
        this.indicatorSurveyData = surveyData;
        return this;
    }

    /**
     * Key/value pairs representing the filled out 'Socio Economics' survey
     * @return surveyData
     **/
    @ApiModelProperty(value = "Key/value pairs representing"
            + " the filled out 'Personal' survey")
    public SurveyData getPersonalSurveyData() {
        return personalSurveyData;
    }

    public void setPersonalSurveyData(SurveyData surveyData) {
        this.personalSurveyData = surveyData;
    }

    /**
     * Key/value pairs representing the filled out 'Socio Economics' survey
     * @return surveyData
     **/
    @ApiModelProperty(value = "Key/value pairs representing"
            + " the filled out 'Socio Economics' survey")
    public SurveyData getEconomicSurveyData() {
        return economicSurveyData;
    }

    public void setEconomicSurveyData(SurveyData surveyData) {
        this.economicSurveyData = surveyData;
    }

    /**
     * The survey's id that this snapshot belongs to.
     * @return the survey id number respresentation
     */
    @ApiModelProperty(value = "The survey's id that this snapshot belongs to.")
    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    /**
     * The survey's id that this snapshot belongs to.
     * @return the survey id number respresentation
     */
    @ApiModelProperty(value = "The id that this snapshot belongs to.")
    public Long getSnapshotEconomicId() {
        return snapshotEconomicId;
    }

    public void setSnapshotEconomicId(Long snapshotEconomicId) {
        this.snapshotEconomicId = snapshotEconomicId;
    }

    /**
     * Key/value pairs representing the filled out 'Indicators' survey
     * @return surveyData
     **/
    @ApiModelProperty(value = "Key/value pairs representing"
            + " the filled out 'Indicators' survey")
    public SurveyData getIndicatorSurveyData() {
        return indicatorSurveyData;
    }

    public void setIndicatorSurveyData(SurveyData indicatorSurveyData) {
        this.indicatorSurveyData = indicatorSurveyData;
    }

    /**
     * [ISO 8601](https://es.wikipedia.org/wiki/ISO_8601)
     * formatted creation date
     * @return
     */
    @ApiModelProperty(value = " [ISO 8601]"
            + "(https://es.wikipedia.org/wiki/ISO_8601)"
            + " formatted creation date")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public FamilyDTO getFamily() {
        return family;
    }

    public void setFamily(FamilyDTO family) {
        this.family = family;
    }

    public Long getTermCondId() {
        return termCondId;
    }

    public void setTermCondId(Long termCondId) {
        this.termCondId = termCondId;
    }

    public Long getPrivPolId() {
        return privPolId;
    }

    public void setPrivPolId(Long privPolId) {
        this.privPolId = privPolId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Snapshot {\n");
        sb.append("    surveyId: ")
        .append(toIndentedString(surveyId))
        .append("\n");
        sb.append("    surveyVersionId: ")
                .append(this.surveyVersionId)
                .append("\n");
        sb.append("    snapshotEconomicId: ")
        .append(toIndentedString(snapshotEconomicId))
        .append("\n");
        sb.append("    personalSurveyData: ")
        .append(toIndentedString(personalSurveyData))
        .append("\n");
        sb.append("    economicSurveyData: ")
        .append(toIndentedString(economicSurveyData))
        .append("\n");
        sb.append("    indicatorSurveyData: ")
        .append(toIndentedString(indicatorSurveyData))
        .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Snapshot that = (Snapshot) o;

        return com.google.common.base.Objects.equal(this.surveyId,
                that.surveyId)
                && com.google.common.base.Objects.equal(this.snapshotEconomicId,
                        that.snapshotEconomicId)
                && com.google.common.base.Objects.equal(this.personalSurveyData,
                        that.personalSurveyData)
                && com.google.common.base.Objects.equal(this.economicSurveyData,
                        that.economicSurveyData)
                && com.google.common.base.Objects.equal(this.createdAt,
                        that.createdAt)
                && com.google.common.base.Objects.equal(
                        this.indicatorSurveyData,
                        that.indicatorSurveyData)
                && com.google.common.base.Objects.equal(this.userId,
                        that.userId)
                && com.google.common.base.Objects.equal(this.termCondId,
                        that.termCondId)
                && com.google.common.base.Objects.equal(this.privPolId,
                        that.privPolId);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(surveyId,
                snapshotEconomicId, personalSurveyData,
                economicSurveyData, indicatorSurveyData, createdAt,
                userId, termCondId, privPolId);
    }

    public Snapshot snapshotEconomicId(Long id) {
        this.snapshotEconomicId = id;
        return this;
    }

    public Snapshot surveyId(Long surveyId) {
        this.surveyId = surveyId;
        return this;
    }

    public Snapshot snapshotIndicatorId(Long snapshotIndicatorId){
        this.snapshotIndicatorId = snapshotIndicatorId;
        return this;
    }

    public Snapshot createdAt(String createdAtAsISOString) {
        this.createdAt = createdAtAsISOString;
        return this;
    }

    public Snapshot userId(Long userId) {
        this.userId = userId;
        return this;
    }
    
    public Snapshot user(UserDTO user) {
        this.user = user;
        return this;
    }

    public Snapshot family(FamilyDTO family) {
        this.family = family;
        return this;
    }

    public Snapshot termCondId(Long termCondId) {
        this.termCondId = termCondId;
        return this;
    }
    
    public Snapshot privPolId(Long privPolId) {
        this.privPolId = privPolId;
        return this;
    }

    public Snapshot surveyVersionId(Long surveyVersionId){
        this.surveyVersionId = surveyVersionId;
        return this;
    }

    public Long getSnapshotIndicatorId() {
        return snapshotIndicatorId;
    }

    public void setSnapshotIndicatorId(Long snapshotIndicatorId) {
        this.snapshotIndicatorId = snapshotIndicatorId;
    }
}
