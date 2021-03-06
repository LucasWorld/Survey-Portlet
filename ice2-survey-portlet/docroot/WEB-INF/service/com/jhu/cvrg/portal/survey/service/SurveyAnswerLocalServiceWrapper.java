/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.jhu.cvrg.portal.survey.service;

/**
 * <p>
 * This class is a wrapper for {@link SurveyAnswerLocalService}.
 * </p>
 *
 * @author    Chris Jurado
 * @see       SurveyAnswerLocalService
 * @generated
 */
public class SurveyAnswerLocalServiceWrapper implements SurveyAnswerLocalService {
	public SurveyAnswerLocalServiceWrapper(
		SurveyAnswerLocalService surveyAnswerLocalService) {
		_surveyAnswerLocalService = surveyAnswerLocalService;
	}

	/**
	* Adds the survey answer to the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswer the survey answer to add
	* @return the survey answer that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer addSurveyAnswer(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.addSurveyAnswer(surveyAnswer);
	}

	/**
	* Creates a new survey answer with the primary key. Does not add the survey answer to the database.
	*
	* @param surveyAnswerId the primary key for the new survey answer
	* @return the new survey answer
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer createSurveyAnswer(
		long surveyAnswerId) {
		return _surveyAnswerLocalService.createSurveyAnswer(surveyAnswerId);
	}

	/**
	* Deletes the survey answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswerId the primary key of the survey answer to delete
	* @throws PortalException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurveyAnswer(long surveyAnswerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_surveyAnswerLocalService.deleteSurveyAnswer(surveyAnswerId);
	}

	/**
	* Deletes the survey answer from the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswer the survey answer to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSurveyAnswer(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer)
		throws com.liferay.portal.kernel.exception.SystemException {
		_surveyAnswerLocalService.deleteSurveyAnswer(surveyAnswer);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the survey answer with the primary key.
	*
	* @param surveyAnswerId the primary key of the survey answer to get
	* @return the survey answer
	* @throws PortalException if a survey answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer getSurveyAnswer(
		long surveyAnswerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.getSurveyAnswer(surveyAnswerId);
	}

	/**
	* Gets a range of all the survey answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of survey answers to return
	* @param end the upper bound of the range of survey answers to return (not inclusive)
	* @return the range of survey answers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> getSurveyAnswers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.getSurveyAnswers(start, end);
	}

	/**
	* Gets the number of survey answers.
	*
	* @return the number of survey answers
	* @throws SystemException if a system exception occurred
	*/
	public int getSurveyAnswersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.getSurveyAnswersCount();
	}

	/**
	* Updates the survey answer in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswer the survey answer to update
	* @return the survey answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer updateSurveyAnswer(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.updateSurveyAnswer(surveyAnswer);
	}

	/**
	* Updates the survey answer in the database. Also notifies the appropriate model listeners.
	*
	* @param surveyAnswer the survey answer to update
	* @param merge whether to merge the survey answer with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the survey answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.jhu.cvrg.portal.survey.model.SurveyAnswer updateSurveyAnswer(
		com.jhu.cvrg.portal.survey.model.SurveyAnswer surveyAnswer,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.updateSurveyAnswer(surveyAnswer, merge);
	}

	public com.jhu.cvrg.portal.survey.model.SurveyAnswer addSurveyAnswer(
		long surveyQuestionId, long surveyId, long userId,
		java.lang.String answer)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.addSurveyAnswer(surveyQuestionId,
			surveyId, userId, answer);
	}

	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurvey(
		long surveyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.findBySurvey(surveyId);
	}

	public java.util.List<com.jhu.cvrg.portal.survey.model.SurveyAnswer> findBySurveyQuestion(
		long surveyQuestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _surveyAnswerLocalService.findBySurveyQuestion(surveyQuestionId);
	}

	public SurveyAnswerLocalService getWrappedSurveyAnswerLocalService() {
		return _surveyAnswerLocalService;
	}

	private SurveyAnswerLocalService _surveyAnswerLocalService;
}