/**
* The contents of this file are subject to the Mozilla Public License
* Version 1.1 (the "License"); you may not use this file except in
* compliance with the License. You may obtain a copy of the License at
* http://www.mozilla.org/MPL/
*
* Software distributed under the License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
* License for the specific language governing rights and limitations under
* the License.
*
* The Original Code is OpenELIS code.
*
* Copyright (C) The Minnesota Department of Health.  All Rights Reserved.
*
* Contributor(s): CIRG, University of Washington, Seattle WA.
*/
package us.mn.state.health.lims.common.formfields;

import us.mn.state.health.lims.common.action.IActionConstants;
import us.mn.state.health.lims.common.formfields.FormFields.Field;
import us.mn.state.health.lims.common.util.ConfigurationProperties;
import us.mn.state.health.lims.common.util.ConfigurationProperties.Property;

import java.util.HashMap;

public class DefaultFormFields extends AFormFields {
	private HashMap<FormFields.Field, Boolean> defaultAttributes = new HashMap<FormFields.Field, Boolean>();

	{
		/*
		 * The rules for setting the default true or false are:
		 * If you have been asked to hide an existing field then the default should be true
		 * If you have been asked to add a new field then the default should be false
		 * 
		 * The goal is to not break any existing configurations
		 */
		setFieldTrue(Field.StNumber);
		setFieldTrue(Field.AKA);
		setFieldTrue(Field.MothersName);
		setFieldTrue(Field.PatientType);
		setFieldTrue(Field.InsuranceNumber);
		setFieldTrue(Field.CollectionDate);
		setFieldTrue(Field.OrgLocalAbrev);
		setFieldTrue(Field.ProviderInfo);
		setFieldTrue(Field.NationalID);
		setFieldTrue(Field.Occupation);
		setFieldTrue(Field.OrganizationAddressInfo);
		setFieldTrue(Field.OrganizationShortName);
		setFieldTrue(Field.OrganizationMultiUnit);
		setFieldTrue(Field.OrganizationOrgId);
		setFieldTrue(Field.ADDRESS_CITY );
		setFieldTrue(Field.PatientRequired);
        setFieldTrue(Field.QA_FULL_PROVIDER_INFO );
        setFieldTrue(Field.QA_REQUESTER_SAMPLE_ID);
        setFieldTrue(Field.PatientIDRequired);
		setFieldTrue(Field.PatientNameRequired);
		setFieldTrue(Field.SampleEntryRequestingSiteSampleId);
        setFieldTrue( Field.ADDRESS_COMMUNE );
        setFieldTrue( Field.ADDRESS_VILLAGE );
        setFieldTrue( Field.onsetOfDate);//Dung add
        setFieldTrue(Field.SAMPLE_ENTRY_PATIENT_DIAGNOSIS);//Dung add
        setFieldFalse(Field.ADDRESS_DEPARTMENT );
        setFieldFalse(Field.OrgState);
        setFieldFalse(Field.ZipCode);
        setFieldFalse(Field.MLS);
		setFieldFalse(Field.CollectionTime);
		setFieldFalse(Field.RequesterSiteList);
		setFieldFalse(Field.InlineOrganizationTypes);
		setFieldFalse(Field.SubjectNumber);
        setFieldFalse(Field.SubjectNumberRequired );
		//setFieldTrue(Field.ADDRESS_DEPARTMENT );
		setFieldFalse(Field.MotherInitial);
		setFieldFalse(Field.SearchSampleStatus);
		setFieldFalse(Field.DepersonalizedResults);
		setFieldFalse(Field.SEARCH_PATIENT_WITH_LAB_NO);
		setFieldFalse(Field.ResultsReferral);
		setFieldFalse(Field.ValueHozSpaceOnResults);
		setFieldFalse(Field.InitialSampleCondition);
		setFieldFalse(Field.ADDRESS_DISTRICT);
		setFieldFalse(Field.ADDRESS_WARD);
		setFieldFalse(Field.LINK_DISTRICTS_TO_CITIES);
        setFieldFalse(Field.OrganizationCLIA);
        setFieldFalse(Field.OrganizationParent);
		setFieldFalse(Field.PatientRequired_SampleConfirmation);
        setFieldFalse(Field.SampleCondition);
        setFieldFalse(Field.Project);        
        setFieldFalse(Field.PROJECT_OR_NAME);        
        setFieldFalse(Field.PROJECT2_OR_NAME);        
        setFieldFalse(Field.SUBMITTER_NUMBER);        
        setFieldFalse(Field.EXTERNAL_ID);        
        setFieldFalse(Field.EXTERNAL_ID_REQUIRED);        
        setFieldFalse(Field.NON_CONFORMITY_SITE_LIST);
        setFieldFalse(Field.NON_CONFORMITY_SITE_LIST_USER_ADDABLE);
		setFieldFalse(Field.PatientIDRequired_SampleConfirmation);
		setFieldFalse(Field.SampleEntryUseReceptionHour);
		setFieldFalse(Field.SampleEntryUseRequestDate);
		setFieldFalse(Field.SampleEntryNextVisitDate);
		setFieldFalse(Field.SampleEntryReferralSiteNameRequired);
		setFieldFalse(Field.SampleEntryReferralSiteNameCapitialized);
		setFieldFalse(Field.SampleEntryReferralSiteCode);
		setFieldFalse(Field.SampleEntryProviderFax);
		setFieldFalse(Field.SampleEntryProviderEmail);
		setFieldFalse(Field.SampleEntryHealthFacilityAddress);
		setFieldFalse(Field.SampleEntrySampleCollector);
		setFieldFalse(Field.PatientPhone);
		setFieldFalse(Field.PatientHealthRegion);
		setFieldFalse(Field.PatientHealthDistrict);
		setFieldFalse(Field.PatientNationality);
		setFieldFalse(Field.PatientMarriageStatus);
		setFieldFalse(Field.PatientEducation);
		setFieldFalse(Field.SampleEntryPatientClinical);
		setFieldFalse(Field.SampleEntryRequesterLastNameRequired);
		setFieldFalse(Field.QA_DOCUMENT_NUMBER);
		setFieldFalse(Field.QASubjectNumber);
		setFieldFalse(Field.QATimeWithDate);
		setFieldFalse(Field.SAMPLE_ENTRY_USE_REFFERING_PATIENT_NUMBER);
		setFieldFalse(Field.SAMPLE_ENTRY_MODAL_VERSION);
		setFieldFalse(Field.SAMPLE_ENTRY_REJECTION_IN_MODAL_VERSION);
		setFieldFalse(Field.SINGLE_NAME_FIELD);
		setFieldFalse(Field.PATIENT_CITY_PICKLIST);
		setFieldFalse(Field.SAMPLE_ENTRY_REQUESTER_WORK_PHONE_AND_EXT);
		setFieldFalse(Field.SAMPLE_ENTRY_ORDER_URGENCY);
		setFieldFalse(Field.SAMPLE_ENTRY_PATIENT_CLINICAL_DEPT);
		setFieldFalse(Field.SAMPLE_ENTRY_PATIENT_AGE_VALUE_AND_UNITS);
		//Dung fix show for form edit patient
		/*setFieldFalse(Field.SAMPLE_ENTRY_PATIENT_DIAGNOSIS);*/
		setFieldFalse(Field.SAMPLE_ENTRY_PATIENT_BED_NUMBER);
		setFieldFalse(Field.SAMPLE_ENTRY_PATIENT_ROOM_NUMBER);
		setFieldFalse(Field.SAMPLE_ENTRY_PATIENT_EMPLOYER_NAME);
		setFieldFalse(Field.SAMPLE_ENTRY_MEDICAL_RECORD_CHART_NUMBER);
		setFieldFalse(Field.SAMPLE_ENTRY_COMPACT_LAYOUT);
		setFieldFalse(Field.LAB_NUMBER_USED_ONLY_IF_SPECIMENS);
		setFieldFalse(Field.NON_CONFORMITY_PROVIDER_ADDRESS);
        setFieldFalse( Field.TEST_LOCATION_CODE );
        setFieldFalse(Field.PATIENT_SPECIES_NAME);
	}

	@Override
	protected HashMap<Field, Boolean> getDefaultAttributes() {
		return defaultAttributes;
	}

	private void setFieldFalse(Field field) {
		defaultAttributes.put(field, Boolean.FALSE);
	}
	
	private void setFieldTrue(Field field) {
		defaultAttributes.put(field, Boolean.TRUE);
	}

	@Override
	protected HashMap<Field, Boolean> getSetAttributes() {
		String fieldSet = ConfigurationProperties.getInstance().getPropertyValueUpperCase(Property.FormFieldSet);

		if(IActionConstants.FORM_FIELD_SET_LNSP_HAITI.equals(fieldSet)){
			return new HT_LNSPFormFields().getImplementationAttributes();
		}else if(IActionConstants.FORM_FIELD_SET_HAITI.equals(fieldSet)){
			return new HT_ClinicalFormFields().getImplementationAttributes();
		}else if(IActionConstants.FORM_FIELD_SET_LNSP_CI.equals(fieldSet)){
			return new CI_LNSPFormFields().getImplementationAttributes();
		}else if(IActionConstants.FORM_FIELD_SET_CDI.equals(fieldSet)){
			return new CI_RETROFormFields().getImplementationAttributes();
		}else if(IActionConstants.FORM_FIELD_SET_CI_IPCI.equals(fieldSet)){
			return new CI_IPCIFormFields().getImplementationAttributes();
		}else if(IActionConstants.FORM_FIELD_SET_CI_REGIONAL.equals(fieldSet)){
			return new CI_RegionalFormFields().getImplementationAttributes();
		}else if(IActionConstants.FORM_FIELD_SET_VN_APHL.equals(fieldSet)){
			return new VN_APHLFormFields().getImplementationAttributes();
		}

		return null;
	}
}