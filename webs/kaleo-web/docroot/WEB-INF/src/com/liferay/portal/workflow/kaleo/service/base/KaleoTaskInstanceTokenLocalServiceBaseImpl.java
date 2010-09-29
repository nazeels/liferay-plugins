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

package com.liferay.portal.workflow.kaleo.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken;
import com.liferay.portal.workflow.kaleo.service.KaleoActionLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoConditionLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoDefinitionLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoInstanceLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoInstanceTokenLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoLogLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoNodeLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoNotificationLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoNotificationRecipientLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentInstanceLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoTaskInstanceTokenLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoTaskLocalService;
import com.liferay.portal.workflow.kaleo.service.KaleoTransitionLocalService;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoActionPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoConditionPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoDefinitionPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoInstancePersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoInstanceTokenPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoLogPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoNodePersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoNotificationPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoNotificationRecipientPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskAssignmentInstancePersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskAssignmentPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskInstanceTokenFinder;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskInstanceTokenPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTransitionPersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the kaleo task instance token local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.portal.workflow.kaleo.service.impl.KaleoTaskInstanceTokenLocalServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.liferay.portal.workflow.kaleo.service.KaleoTaskInstanceTokenLocalServiceUtil} to access the kaleo task instance token local service.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portal.workflow.kaleo.service.impl.KaleoTaskInstanceTokenLocalServiceImpl
 * @see com.liferay.portal.workflow.kaleo.service.KaleoTaskInstanceTokenLocalServiceUtil
 * @generated
 */
public abstract class KaleoTaskInstanceTokenLocalServiceBaseImpl
	implements KaleoTaskInstanceTokenLocalService {
	/**
	 * Adds the kaleo task instance token to the database. Also notifies the appropriate model listeners.
	 *
	 * @param kaleoTaskInstanceToken the kaleo task instance token to add
	 * @return the kaleo task instance token that was added
	 * @throws SystemException if a system exception occurred
	 */
	public KaleoTaskInstanceToken addKaleoTaskInstanceToken(
		KaleoTaskInstanceToken kaleoTaskInstanceToken)
		throws SystemException {
		kaleoTaskInstanceToken.setNew(true);

		return kaleoTaskInstanceTokenPersistence.update(kaleoTaskInstanceToken,
			false);
	}

	/**
	 * Creates a new kaleo task instance token with the primary key. Does not add the kaleo task instance token to the database.
	 *
	 * @param kaleoTaskInstanceTokenId the primary key for the new kaleo task instance token
	 * @return the new kaleo task instance token
	 */
	public KaleoTaskInstanceToken createKaleoTaskInstanceToken(
		long kaleoTaskInstanceTokenId) {
		return kaleoTaskInstanceTokenPersistence.create(kaleoTaskInstanceTokenId);
	}

	/**
	 * Deletes the kaleo task instance token with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param kaleoTaskInstanceTokenId the primary key of the kaleo task instance token to delete
	 * @throws PortalException if a kaleo task instance token with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteKaleoTaskInstanceToken(long kaleoTaskInstanceTokenId)
		throws PortalException, SystemException {
		kaleoTaskInstanceTokenPersistence.remove(kaleoTaskInstanceTokenId);
	}

	/**
	 * Deletes the kaleo task instance token from the database. Also notifies the appropriate model listeners.
	 *
	 * @param kaleoTaskInstanceToken the kaleo task instance token to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteKaleoTaskInstanceToken(
		KaleoTaskInstanceToken kaleoTaskInstanceToken)
		throws SystemException {
		kaleoTaskInstanceTokenPersistence.remove(kaleoTaskInstanceToken);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return kaleoTaskInstanceTokenPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return kaleoTaskInstanceTokenPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return kaleoTaskInstanceTokenPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return kaleoTaskInstanceTokenPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the kaleo task instance token with the primary key.
	 *
	 * @param kaleoTaskInstanceTokenId the primary key of the kaleo task instance token to get
	 * @return the kaleo task instance token
	 * @throws PortalException if a kaleo task instance token with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public KaleoTaskInstanceToken getKaleoTaskInstanceToken(
		long kaleoTaskInstanceTokenId) throws PortalException, SystemException {
		return kaleoTaskInstanceTokenPersistence.findByPrimaryKey(kaleoTaskInstanceTokenId);
	}

	/**
	 * Gets a range of all the kaleo task instance tokens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of kaleo task instance tokens to return
	 * @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	 * @return the range of kaleo task instance tokens
	 * @throws SystemException if a system exception occurred
	 */
	public List<KaleoTaskInstanceToken> getKaleoTaskInstanceTokens(int start,
		int end) throws SystemException {
		return kaleoTaskInstanceTokenPersistence.findAll(start, end);
	}

	/**
	 * Gets the number of kaleo task instance tokens.
	 *
	 * @return the number of kaleo task instance tokens
	 * @throws SystemException if a system exception occurred
	 */
	public int getKaleoTaskInstanceTokensCount() throws SystemException {
		return kaleoTaskInstanceTokenPersistence.countAll();
	}

	/**
	 * Updates the kaleo task instance token in the database. Also notifies the appropriate model listeners.
	 *
	 * @param kaleoTaskInstanceToken the kaleo task instance token to update
	 * @return the kaleo task instance token that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public KaleoTaskInstanceToken updateKaleoTaskInstanceToken(
		KaleoTaskInstanceToken kaleoTaskInstanceToken)
		throws SystemException {
		kaleoTaskInstanceToken.setNew(false);

		return kaleoTaskInstanceTokenPersistence.update(kaleoTaskInstanceToken,
			true);
	}

	/**
	 * Updates the kaleo task instance token in the database. Also notifies the appropriate model listeners.
	 *
	 * @param kaleoTaskInstanceToken the kaleo task instance token to update
	 * @param merge whether to merge the kaleo task instance token with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the kaleo task instance token that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public KaleoTaskInstanceToken updateKaleoTaskInstanceToken(
		KaleoTaskInstanceToken kaleoTaskInstanceToken, boolean merge)
		throws SystemException {
		kaleoTaskInstanceToken.setNew(false);

		return kaleoTaskInstanceTokenPersistence.update(kaleoTaskInstanceToken,
			merge);
	}

	/**
	 * Gets the kaleo action local service.
	 *
	 * @return the kaleo action local service
	 */
	public KaleoActionLocalService getKaleoActionLocalService() {
		return kaleoActionLocalService;
	}

	/**
	 * Sets the kaleo action local service.
	 *
	 * @param kaleoActionLocalService the kaleo action local service
	 */
	public void setKaleoActionLocalService(
		KaleoActionLocalService kaleoActionLocalService) {
		this.kaleoActionLocalService = kaleoActionLocalService;
	}

	/**
	 * Gets the kaleo action persistence.
	 *
	 * @return the kaleo action persistence
	 */
	public KaleoActionPersistence getKaleoActionPersistence() {
		return kaleoActionPersistence;
	}

	/**
	 * Sets the kaleo action persistence.
	 *
	 * @param kaleoActionPersistence the kaleo action persistence
	 */
	public void setKaleoActionPersistence(
		KaleoActionPersistence kaleoActionPersistence) {
		this.kaleoActionPersistence = kaleoActionPersistence;
	}

	/**
	 * Gets the kaleo condition local service.
	 *
	 * @return the kaleo condition local service
	 */
	public KaleoConditionLocalService getKaleoConditionLocalService() {
		return kaleoConditionLocalService;
	}

	/**
	 * Sets the kaleo condition local service.
	 *
	 * @param kaleoConditionLocalService the kaleo condition local service
	 */
	public void setKaleoConditionLocalService(
		KaleoConditionLocalService kaleoConditionLocalService) {
		this.kaleoConditionLocalService = kaleoConditionLocalService;
	}

	/**
	 * Gets the kaleo condition persistence.
	 *
	 * @return the kaleo condition persistence
	 */
	public KaleoConditionPersistence getKaleoConditionPersistence() {
		return kaleoConditionPersistence;
	}

	/**
	 * Sets the kaleo condition persistence.
	 *
	 * @param kaleoConditionPersistence the kaleo condition persistence
	 */
	public void setKaleoConditionPersistence(
		KaleoConditionPersistence kaleoConditionPersistence) {
		this.kaleoConditionPersistence = kaleoConditionPersistence;
	}

	/**
	 * Gets the kaleo definition local service.
	 *
	 * @return the kaleo definition local service
	 */
	public KaleoDefinitionLocalService getKaleoDefinitionLocalService() {
		return kaleoDefinitionLocalService;
	}

	/**
	 * Sets the kaleo definition local service.
	 *
	 * @param kaleoDefinitionLocalService the kaleo definition local service
	 */
	public void setKaleoDefinitionLocalService(
		KaleoDefinitionLocalService kaleoDefinitionLocalService) {
		this.kaleoDefinitionLocalService = kaleoDefinitionLocalService;
	}

	/**
	 * Gets the kaleo definition persistence.
	 *
	 * @return the kaleo definition persistence
	 */
	public KaleoDefinitionPersistence getKaleoDefinitionPersistence() {
		return kaleoDefinitionPersistence;
	}

	/**
	 * Sets the kaleo definition persistence.
	 *
	 * @param kaleoDefinitionPersistence the kaleo definition persistence
	 */
	public void setKaleoDefinitionPersistence(
		KaleoDefinitionPersistence kaleoDefinitionPersistence) {
		this.kaleoDefinitionPersistence = kaleoDefinitionPersistence;
	}

	/**
	 * Gets the kaleo instance local service.
	 *
	 * @return the kaleo instance local service
	 */
	public KaleoInstanceLocalService getKaleoInstanceLocalService() {
		return kaleoInstanceLocalService;
	}

	/**
	 * Sets the kaleo instance local service.
	 *
	 * @param kaleoInstanceLocalService the kaleo instance local service
	 */
	public void setKaleoInstanceLocalService(
		KaleoInstanceLocalService kaleoInstanceLocalService) {
		this.kaleoInstanceLocalService = kaleoInstanceLocalService;
	}

	/**
	 * Gets the kaleo instance persistence.
	 *
	 * @return the kaleo instance persistence
	 */
	public KaleoInstancePersistence getKaleoInstancePersistence() {
		return kaleoInstancePersistence;
	}

	/**
	 * Sets the kaleo instance persistence.
	 *
	 * @param kaleoInstancePersistence the kaleo instance persistence
	 */
	public void setKaleoInstancePersistence(
		KaleoInstancePersistence kaleoInstancePersistence) {
		this.kaleoInstancePersistence = kaleoInstancePersistence;
	}

	/**
	 * Gets the kaleo instance token local service.
	 *
	 * @return the kaleo instance token local service
	 */
	public KaleoInstanceTokenLocalService getKaleoInstanceTokenLocalService() {
		return kaleoInstanceTokenLocalService;
	}

	/**
	 * Sets the kaleo instance token local service.
	 *
	 * @param kaleoInstanceTokenLocalService the kaleo instance token local service
	 */
	public void setKaleoInstanceTokenLocalService(
		KaleoInstanceTokenLocalService kaleoInstanceTokenLocalService) {
		this.kaleoInstanceTokenLocalService = kaleoInstanceTokenLocalService;
	}

	/**
	 * Gets the kaleo instance token persistence.
	 *
	 * @return the kaleo instance token persistence
	 */
	public KaleoInstanceTokenPersistence getKaleoInstanceTokenPersistence() {
		return kaleoInstanceTokenPersistence;
	}

	/**
	 * Sets the kaleo instance token persistence.
	 *
	 * @param kaleoInstanceTokenPersistence the kaleo instance token persistence
	 */
	public void setKaleoInstanceTokenPersistence(
		KaleoInstanceTokenPersistence kaleoInstanceTokenPersistence) {
		this.kaleoInstanceTokenPersistence = kaleoInstanceTokenPersistence;
	}

	/**
	 * Gets the kaleo log local service.
	 *
	 * @return the kaleo log local service
	 */
	public KaleoLogLocalService getKaleoLogLocalService() {
		return kaleoLogLocalService;
	}

	/**
	 * Sets the kaleo log local service.
	 *
	 * @param kaleoLogLocalService the kaleo log local service
	 */
	public void setKaleoLogLocalService(
		KaleoLogLocalService kaleoLogLocalService) {
		this.kaleoLogLocalService = kaleoLogLocalService;
	}

	/**
	 * Gets the kaleo log persistence.
	 *
	 * @return the kaleo log persistence
	 */
	public KaleoLogPersistence getKaleoLogPersistence() {
		return kaleoLogPersistence;
	}

	/**
	 * Sets the kaleo log persistence.
	 *
	 * @param kaleoLogPersistence the kaleo log persistence
	 */
	public void setKaleoLogPersistence(KaleoLogPersistence kaleoLogPersistence) {
		this.kaleoLogPersistence = kaleoLogPersistence;
	}

	/**
	 * Gets the kaleo node local service.
	 *
	 * @return the kaleo node local service
	 */
	public KaleoNodeLocalService getKaleoNodeLocalService() {
		return kaleoNodeLocalService;
	}

	/**
	 * Sets the kaleo node local service.
	 *
	 * @param kaleoNodeLocalService the kaleo node local service
	 */
	public void setKaleoNodeLocalService(
		KaleoNodeLocalService kaleoNodeLocalService) {
		this.kaleoNodeLocalService = kaleoNodeLocalService;
	}

	/**
	 * Gets the kaleo node persistence.
	 *
	 * @return the kaleo node persistence
	 */
	public KaleoNodePersistence getKaleoNodePersistence() {
		return kaleoNodePersistence;
	}

	/**
	 * Sets the kaleo node persistence.
	 *
	 * @param kaleoNodePersistence the kaleo node persistence
	 */
	public void setKaleoNodePersistence(
		KaleoNodePersistence kaleoNodePersistence) {
		this.kaleoNodePersistence = kaleoNodePersistence;
	}

	/**
	 * Gets the kaleo notification local service.
	 *
	 * @return the kaleo notification local service
	 */
	public KaleoNotificationLocalService getKaleoNotificationLocalService() {
		return kaleoNotificationLocalService;
	}

	/**
	 * Sets the kaleo notification local service.
	 *
	 * @param kaleoNotificationLocalService the kaleo notification local service
	 */
	public void setKaleoNotificationLocalService(
		KaleoNotificationLocalService kaleoNotificationLocalService) {
		this.kaleoNotificationLocalService = kaleoNotificationLocalService;
	}

	/**
	 * Gets the kaleo notification persistence.
	 *
	 * @return the kaleo notification persistence
	 */
	public KaleoNotificationPersistence getKaleoNotificationPersistence() {
		return kaleoNotificationPersistence;
	}

	/**
	 * Sets the kaleo notification persistence.
	 *
	 * @param kaleoNotificationPersistence the kaleo notification persistence
	 */
	public void setKaleoNotificationPersistence(
		KaleoNotificationPersistence kaleoNotificationPersistence) {
		this.kaleoNotificationPersistence = kaleoNotificationPersistence;
	}

	/**
	 * Gets the kaleo notification recipient local service.
	 *
	 * @return the kaleo notification recipient local service
	 */
	public KaleoNotificationRecipientLocalService getKaleoNotificationRecipientLocalService() {
		return kaleoNotificationRecipientLocalService;
	}

	/**
	 * Sets the kaleo notification recipient local service.
	 *
	 * @param kaleoNotificationRecipientLocalService the kaleo notification recipient local service
	 */
	public void setKaleoNotificationRecipientLocalService(
		KaleoNotificationRecipientLocalService kaleoNotificationRecipientLocalService) {
		this.kaleoNotificationRecipientLocalService = kaleoNotificationRecipientLocalService;
	}

	/**
	 * Gets the kaleo notification recipient persistence.
	 *
	 * @return the kaleo notification recipient persistence
	 */
	public KaleoNotificationRecipientPersistence getKaleoNotificationRecipientPersistence() {
		return kaleoNotificationRecipientPersistence;
	}

	/**
	 * Sets the kaleo notification recipient persistence.
	 *
	 * @param kaleoNotificationRecipientPersistence the kaleo notification recipient persistence
	 */
	public void setKaleoNotificationRecipientPersistence(
		KaleoNotificationRecipientPersistence kaleoNotificationRecipientPersistence) {
		this.kaleoNotificationRecipientPersistence = kaleoNotificationRecipientPersistence;
	}

	/**
	 * Gets the kaleo task local service.
	 *
	 * @return the kaleo task local service
	 */
	public KaleoTaskLocalService getKaleoTaskLocalService() {
		return kaleoTaskLocalService;
	}

	/**
	 * Sets the kaleo task local service.
	 *
	 * @param kaleoTaskLocalService the kaleo task local service
	 */
	public void setKaleoTaskLocalService(
		KaleoTaskLocalService kaleoTaskLocalService) {
		this.kaleoTaskLocalService = kaleoTaskLocalService;
	}

	/**
	 * Gets the kaleo task persistence.
	 *
	 * @return the kaleo task persistence
	 */
	public KaleoTaskPersistence getKaleoTaskPersistence() {
		return kaleoTaskPersistence;
	}

	/**
	 * Sets the kaleo task persistence.
	 *
	 * @param kaleoTaskPersistence the kaleo task persistence
	 */
	public void setKaleoTaskPersistence(
		KaleoTaskPersistence kaleoTaskPersistence) {
		this.kaleoTaskPersistence = kaleoTaskPersistence;
	}

	/**
	 * Gets the kaleo task assignment local service.
	 *
	 * @return the kaleo task assignment local service
	 */
	public KaleoTaskAssignmentLocalService getKaleoTaskAssignmentLocalService() {
		return kaleoTaskAssignmentLocalService;
	}

	/**
	 * Sets the kaleo task assignment local service.
	 *
	 * @param kaleoTaskAssignmentLocalService the kaleo task assignment local service
	 */
	public void setKaleoTaskAssignmentLocalService(
		KaleoTaskAssignmentLocalService kaleoTaskAssignmentLocalService) {
		this.kaleoTaskAssignmentLocalService = kaleoTaskAssignmentLocalService;
	}

	/**
	 * Gets the kaleo task assignment persistence.
	 *
	 * @return the kaleo task assignment persistence
	 */
	public KaleoTaskAssignmentPersistence getKaleoTaskAssignmentPersistence() {
		return kaleoTaskAssignmentPersistence;
	}

	/**
	 * Sets the kaleo task assignment persistence.
	 *
	 * @param kaleoTaskAssignmentPersistence the kaleo task assignment persistence
	 */
	public void setKaleoTaskAssignmentPersistence(
		KaleoTaskAssignmentPersistence kaleoTaskAssignmentPersistence) {
		this.kaleoTaskAssignmentPersistence = kaleoTaskAssignmentPersistence;
	}

	/**
	 * Gets the kaleo task assignment instance local service.
	 *
	 * @return the kaleo task assignment instance local service
	 */
	public KaleoTaskAssignmentInstanceLocalService getKaleoTaskAssignmentInstanceLocalService() {
		return kaleoTaskAssignmentInstanceLocalService;
	}

	/**
	 * Sets the kaleo task assignment instance local service.
	 *
	 * @param kaleoTaskAssignmentInstanceLocalService the kaleo task assignment instance local service
	 */
	public void setKaleoTaskAssignmentInstanceLocalService(
		KaleoTaskAssignmentInstanceLocalService kaleoTaskAssignmentInstanceLocalService) {
		this.kaleoTaskAssignmentInstanceLocalService = kaleoTaskAssignmentInstanceLocalService;
	}

	/**
	 * Gets the kaleo task assignment instance persistence.
	 *
	 * @return the kaleo task assignment instance persistence
	 */
	public KaleoTaskAssignmentInstancePersistence getKaleoTaskAssignmentInstancePersistence() {
		return kaleoTaskAssignmentInstancePersistence;
	}

	/**
	 * Sets the kaleo task assignment instance persistence.
	 *
	 * @param kaleoTaskAssignmentInstancePersistence the kaleo task assignment instance persistence
	 */
	public void setKaleoTaskAssignmentInstancePersistence(
		KaleoTaskAssignmentInstancePersistence kaleoTaskAssignmentInstancePersistence) {
		this.kaleoTaskAssignmentInstancePersistence = kaleoTaskAssignmentInstancePersistence;
	}

	/**
	 * Gets the kaleo task instance token local service.
	 *
	 * @return the kaleo task instance token local service
	 */
	public KaleoTaskInstanceTokenLocalService getKaleoTaskInstanceTokenLocalService() {
		return kaleoTaskInstanceTokenLocalService;
	}

	/**
	 * Sets the kaleo task instance token local service.
	 *
	 * @param kaleoTaskInstanceTokenLocalService the kaleo task instance token local service
	 */
	public void setKaleoTaskInstanceTokenLocalService(
		KaleoTaskInstanceTokenLocalService kaleoTaskInstanceTokenLocalService) {
		this.kaleoTaskInstanceTokenLocalService = kaleoTaskInstanceTokenLocalService;
	}

	/**
	 * Gets the kaleo task instance token persistence.
	 *
	 * @return the kaleo task instance token persistence
	 */
	public KaleoTaskInstanceTokenPersistence getKaleoTaskInstanceTokenPersistence() {
		return kaleoTaskInstanceTokenPersistence;
	}

	/**
	 * Sets the kaleo task instance token persistence.
	 *
	 * @param kaleoTaskInstanceTokenPersistence the kaleo task instance token persistence
	 */
	public void setKaleoTaskInstanceTokenPersistence(
		KaleoTaskInstanceTokenPersistence kaleoTaskInstanceTokenPersistence) {
		this.kaleoTaskInstanceTokenPersistence = kaleoTaskInstanceTokenPersistence;
	}

	/**
	 * Gets the kaleo task instance token finder.
	 *
	 * @return the kaleo task instance token finder
	 */
	public KaleoTaskInstanceTokenFinder getKaleoTaskInstanceTokenFinder() {
		return kaleoTaskInstanceTokenFinder;
	}

	/**
	 * Sets the kaleo task instance token finder.
	 *
	 * @param kaleoTaskInstanceTokenFinder the kaleo task instance token finder
	 */
	public void setKaleoTaskInstanceTokenFinder(
		KaleoTaskInstanceTokenFinder kaleoTaskInstanceTokenFinder) {
		this.kaleoTaskInstanceTokenFinder = kaleoTaskInstanceTokenFinder;
	}

	/**
	 * Gets the kaleo transition local service.
	 *
	 * @return the kaleo transition local service
	 */
	public KaleoTransitionLocalService getKaleoTransitionLocalService() {
		return kaleoTransitionLocalService;
	}

	/**
	 * Sets the kaleo transition local service.
	 *
	 * @param kaleoTransitionLocalService the kaleo transition local service
	 */
	public void setKaleoTransitionLocalService(
		KaleoTransitionLocalService kaleoTransitionLocalService) {
		this.kaleoTransitionLocalService = kaleoTransitionLocalService;
	}

	/**
	 * Gets the kaleo transition persistence.
	 *
	 * @return the kaleo transition persistence
	 */
	public KaleoTransitionPersistence getKaleoTransitionPersistence() {
		return kaleoTransitionPersistence;
	}

	/**
	 * Sets the kaleo transition persistence.
	 *
	 * @param kaleoTransitionPersistence the kaleo transition persistence
	 */
	public void setKaleoTransitionPersistence(
		KaleoTransitionPersistence kaleoTransitionPersistence) {
		this.kaleoTransitionPersistence = kaleoTransitionPersistence;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = kaleoTaskInstanceTokenPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = KaleoActionLocalService.class)
	protected KaleoActionLocalService kaleoActionLocalService;
	@BeanReference(type = KaleoActionPersistence.class)
	protected KaleoActionPersistence kaleoActionPersistence;
	@BeanReference(type = KaleoConditionLocalService.class)
	protected KaleoConditionLocalService kaleoConditionLocalService;
	@BeanReference(type = KaleoConditionPersistence.class)
	protected KaleoConditionPersistence kaleoConditionPersistence;
	@BeanReference(type = KaleoDefinitionLocalService.class)
	protected KaleoDefinitionLocalService kaleoDefinitionLocalService;
	@BeanReference(type = KaleoDefinitionPersistence.class)
	protected KaleoDefinitionPersistence kaleoDefinitionPersistence;
	@BeanReference(type = KaleoInstanceLocalService.class)
	protected KaleoInstanceLocalService kaleoInstanceLocalService;
	@BeanReference(type = KaleoInstancePersistence.class)
	protected KaleoInstancePersistence kaleoInstancePersistence;
	@BeanReference(type = KaleoInstanceTokenLocalService.class)
	protected KaleoInstanceTokenLocalService kaleoInstanceTokenLocalService;
	@BeanReference(type = KaleoInstanceTokenPersistence.class)
	protected KaleoInstanceTokenPersistence kaleoInstanceTokenPersistence;
	@BeanReference(type = KaleoLogLocalService.class)
	protected KaleoLogLocalService kaleoLogLocalService;
	@BeanReference(type = KaleoLogPersistence.class)
	protected KaleoLogPersistence kaleoLogPersistence;
	@BeanReference(type = KaleoNodeLocalService.class)
	protected KaleoNodeLocalService kaleoNodeLocalService;
	@BeanReference(type = KaleoNodePersistence.class)
	protected KaleoNodePersistence kaleoNodePersistence;
	@BeanReference(type = KaleoNotificationLocalService.class)
	protected KaleoNotificationLocalService kaleoNotificationLocalService;
	@BeanReference(type = KaleoNotificationPersistence.class)
	protected KaleoNotificationPersistence kaleoNotificationPersistence;
	@BeanReference(type = KaleoNotificationRecipientLocalService.class)
	protected KaleoNotificationRecipientLocalService kaleoNotificationRecipientLocalService;
	@BeanReference(type = KaleoNotificationRecipientPersistence.class)
	protected KaleoNotificationRecipientPersistence kaleoNotificationRecipientPersistence;
	@BeanReference(type = KaleoTaskLocalService.class)
	protected KaleoTaskLocalService kaleoTaskLocalService;
	@BeanReference(type = KaleoTaskPersistence.class)
	protected KaleoTaskPersistence kaleoTaskPersistence;
	@BeanReference(type = KaleoTaskAssignmentLocalService.class)
	protected KaleoTaskAssignmentLocalService kaleoTaskAssignmentLocalService;
	@BeanReference(type = KaleoTaskAssignmentPersistence.class)
	protected KaleoTaskAssignmentPersistence kaleoTaskAssignmentPersistence;
	@BeanReference(type = KaleoTaskAssignmentInstanceLocalService.class)
	protected KaleoTaskAssignmentInstanceLocalService kaleoTaskAssignmentInstanceLocalService;
	@BeanReference(type = KaleoTaskAssignmentInstancePersistence.class)
	protected KaleoTaskAssignmentInstancePersistence kaleoTaskAssignmentInstancePersistence;
	@BeanReference(type = KaleoTaskInstanceTokenLocalService.class)
	protected KaleoTaskInstanceTokenLocalService kaleoTaskInstanceTokenLocalService;
	@BeanReference(type = KaleoTaskInstanceTokenPersistence.class)
	protected KaleoTaskInstanceTokenPersistence kaleoTaskInstanceTokenPersistence;
	@BeanReference(type = KaleoTaskInstanceTokenFinder.class)
	protected KaleoTaskInstanceTokenFinder kaleoTaskInstanceTokenFinder;
	@BeanReference(type = KaleoTransitionLocalService.class)
	protected KaleoTransitionLocalService kaleoTransitionLocalService;
	@BeanReference(type = KaleoTransitionPersistence.class)
	protected KaleoTransitionPersistence kaleoTransitionPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}