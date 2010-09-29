/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.workflow.kaleo.service;

/**
 * <p>
 * This class is a wrapper for {@link KaleoConditionLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoConditionLocalService
 * @generated
 */
public class KaleoConditionLocalServiceWrapper
	implements KaleoConditionLocalService {
	public KaleoConditionLocalServiceWrapper(
		KaleoConditionLocalService kaleoConditionLocalService) {
		_kaleoConditionLocalService = kaleoConditionLocalService;
	}

	/**
	* Adds the kaleo condition to the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoCondition the kaleo condition to add
	* @return the kaleo condition that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoCondition addKaleoCondition(
		com.liferay.portal.workflow.kaleo.model.KaleoCondition kaleoCondition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoConditionLocalService.addKaleoCondition(kaleoCondition);
	}

	/**
	* Creates a new kaleo condition with the primary key. Does not add the kaleo condition to the database.
	*
	* @param kaleoConditionId the primary key for the new kaleo condition
	* @return the new kaleo condition
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoCondition createKaleoCondition(
		long kaleoConditionId) {
		return _kaleoConditionLocalService.createKaleoCondition(kaleoConditionId);
	}

	/**
	* Deletes the kaleo condition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoConditionId the primary key of the kaleo condition to delete
	* @throws PortalException if a kaleo condition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteKaleoCondition(long kaleoConditionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_kaleoConditionLocalService.deleteKaleoCondition(kaleoConditionId);
	}

	/**
	* Deletes the kaleo condition from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoCondition the kaleo condition to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteKaleoCondition(
		com.liferay.portal.workflow.kaleo.model.KaleoCondition kaleoCondition)
		throws com.liferay.portal.kernel.exception.SystemException {
		_kaleoConditionLocalService.deleteKaleoCondition(kaleoCondition);
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
		return _kaleoConditionLocalService.dynamicQuery(dynamicQuery);
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
		return _kaleoConditionLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _kaleoConditionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _kaleoConditionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the kaleo condition with the primary key.
	*
	* @param kaleoConditionId the primary key of the kaleo condition to get
	* @return the kaleo condition
	* @throws PortalException if a kaleo condition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoCondition getKaleoCondition(
		long kaleoConditionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoConditionLocalService.getKaleoCondition(kaleoConditionId);
	}

	/**
	* Gets a range of all the kaleo conditions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo conditions to return
	* @param end the upper bound of the range of kaleo conditions to return (not inclusive)
	* @return the range of kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoCondition> getKaleoConditions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoConditionLocalService.getKaleoConditions(start, end);
	}

	/**
	* Gets the number of kaleo conditions.
	*
	* @return the number of kaleo conditions
	* @throws SystemException if a system exception occurred
	*/
	public int getKaleoConditionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoConditionLocalService.getKaleoConditionsCount();
	}

	/**
	* Updates the kaleo condition in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoCondition the kaleo condition to update
	* @return the kaleo condition that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoCondition updateKaleoCondition(
		com.liferay.portal.workflow.kaleo.model.KaleoCondition kaleoCondition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoConditionLocalService.updateKaleoCondition(kaleoCondition);
	}

	/**
	* Updates the kaleo condition in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoCondition the kaleo condition to update
	* @param merge whether to merge the kaleo condition with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the kaleo condition that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoCondition updateKaleoCondition(
		com.liferay.portal.workflow.kaleo.model.KaleoCondition kaleoCondition,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoConditionLocalService.updateKaleoCondition(kaleoCondition,
			merge);
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoCondition addKaleoCondition(
		com.liferay.portal.workflow.kaleo.definition.Condition condition,
		java.lang.String className, long classPK,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoConditionLocalService.addKaleoCondition(condition,
			className, classPK, serviceContext);
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoCondition getKaleoCondition(
		java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoConditionLocalService.getKaleoCondition(className, classPK);
	}

	public KaleoConditionLocalService getWrappedKaleoConditionLocalService() {
		return _kaleoConditionLocalService;
	}

	private KaleoConditionLocalService _kaleoConditionLocalService;
}