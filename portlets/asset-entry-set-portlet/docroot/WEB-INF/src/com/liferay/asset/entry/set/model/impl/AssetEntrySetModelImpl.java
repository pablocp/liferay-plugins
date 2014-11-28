/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.asset.entry.set.model.impl;

import com.liferay.asset.entry.set.model.AssetEntrySet;
import com.liferay.asset.entry.set.model.AssetEntrySetModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the AssetEntrySet service. Represents a row in the &quot;AssetEntrySet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.asset.entry.set.model.AssetEntrySetModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssetEntrySetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetEntrySetImpl
 * @see com.liferay.asset.entry.set.model.AssetEntrySet
 * @see com.liferay.asset.entry.set.model.AssetEntrySetModel
 * @generated
 */
public class AssetEntrySetModelImpl extends BaseModelImpl<AssetEntrySet>
	implements AssetEntrySetModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a asset entry set model instance should use the {@link com.liferay.asset.entry.set.model.AssetEntrySet} interface instead.
	 */
	public static final String TABLE_NAME = "AssetEntrySet";
	public static final Object[][] TABLE_COLUMNS = {
			{ "assetEntrySetId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createTime", Types.BIGINT },
			{ "modifiedTime", Types.BIGINT },
			{ "assetEntryId", Types.VARCHAR },
			{ "parentAssetEntrySetId", Types.BIGINT },
			{ "creatorClassNameId", Types.BIGINT },
			{ "creatorClassPK", Types.BIGINT },
			{ "content", Types.VARCHAR },
			{ "data_", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table AssetEntrySet (assetEntrySetId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createTime LONG,modifiedTime LONG,assetEntryId VARCHAR(75) null,parentAssetEntrySetId LONG,creatorClassNameId LONG,creatorClassPK LONG,content VARCHAR(75) null,data_ VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table AssetEntrySet";
	public static final String ORDER_BY_JPQL = " ORDER BY assetEntrySet.createTime DESC";
	public static final String ORDER_BY_SQL = " ORDER BY AssetEntrySet.createTime DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.asset.entry.set.model.AssetEntrySet"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.asset.entry.set.model.AssetEntrySet"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.asset.entry.set.model.AssetEntrySet"));

	public AssetEntrySetModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _assetEntrySetId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetEntrySetId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetEntrySetId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AssetEntrySet.class;
	}

	@Override
	public String getModelClassName() {
		return AssetEntrySet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assetEntrySetId", getAssetEntrySetId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createTime", getCreateTime());
		attributes.put("modifiedTime", getModifiedTime());
		attributes.put("assetEntryId", getAssetEntryId());
		attributes.put("parentAssetEntrySetId", getParentAssetEntrySetId());
		attributes.put("creatorClassNameId", getCreatorClassNameId());
		attributes.put("creatorClassPK", getCreatorClassPK());
		attributes.put("content", getContent());
		attributes.put("data", getData());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetEntrySetId = (Long)attributes.get("assetEntrySetId");

		if (assetEntrySetId != null) {
			setAssetEntrySetId(assetEntrySetId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Long createTime = (Long)attributes.get("createTime");

		if (createTime != null) {
			setCreateTime(createTime);
		}

		Long modifiedTime = (Long)attributes.get("modifiedTime");

		if (modifiedTime != null) {
			setModifiedTime(modifiedTime);
		}

		String assetEntryId = (String)attributes.get("assetEntryId");

		if (assetEntryId != null) {
			setAssetEntryId(assetEntryId);
		}

		Long parentAssetEntrySetId = (Long)attributes.get(
				"parentAssetEntrySetId");

		if (parentAssetEntrySetId != null) {
			setParentAssetEntrySetId(parentAssetEntrySetId);
		}

		Long creatorClassNameId = (Long)attributes.get("creatorClassNameId");

		if (creatorClassNameId != null) {
			setCreatorClassNameId(creatorClassNameId);
		}

		Long creatorClassPK = (Long)attributes.get("creatorClassPK");

		if (creatorClassPK != null) {
			setCreatorClassPK(creatorClassPK);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String data = (String)attributes.get("data");

		if (data != null) {
			setData(data);
		}
	}

	@Override
	public long getAssetEntrySetId() {
		return _assetEntrySetId;
	}

	@Override
	public void setAssetEntrySetId(long assetEntrySetId) {
		_assetEntrySetId = assetEntrySetId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public long getCreateTime() {
		return _createTime;
	}

	@Override
	public void setCreateTime(long createTime) {
		_createTime = createTime;
	}

	@Override
	public long getModifiedTime() {
		return _modifiedTime;
	}

	@Override
	public void setModifiedTime(long modifiedTime) {
		_modifiedTime = modifiedTime;
	}

	@Override
	public String getAssetEntryId() {
		if (_assetEntryId == null) {
			return StringPool.BLANK;
		}
		else {
			return _assetEntryId;
		}
	}

	@Override
	public void setAssetEntryId(String assetEntryId) {
		_assetEntryId = assetEntryId;
	}

	@Override
	public long getParentAssetEntrySetId() {
		return _parentAssetEntrySetId;
	}

	@Override
	public void setParentAssetEntrySetId(long parentAssetEntrySetId) {
		_parentAssetEntrySetId = parentAssetEntrySetId;
	}

	@Override
	public long getCreatorClassNameId() {
		return _creatorClassNameId;
	}

	@Override
	public void setCreatorClassNameId(long creatorClassNameId) {
		_creatorClassNameId = creatorClassNameId;
	}

	@Override
	public long getCreatorClassPK() {
		return _creatorClassPK;
	}

	@Override
	public void setCreatorClassPK(long creatorClassPK) {
		_creatorClassPK = creatorClassPK;
	}

	@Override
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@Override
	public String getData() {
		if (_data == null) {
			return StringPool.BLANK;
		}
		else {
			return _data;
		}
	}

	@Override
	public void setData(String data) {
		_data = data;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			AssetEntrySet.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AssetEntrySet toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AssetEntrySet)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AssetEntrySetImpl assetEntrySetImpl = new AssetEntrySetImpl();

		assetEntrySetImpl.setAssetEntrySetId(getAssetEntrySetId());
		assetEntrySetImpl.setCompanyId(getCompanyId());
		assetEntrySetImpl.setUserId(getUserId());
		assetEntrySetImpl.setUserName(getUserName());
		assetEntrySetImpl.setCreateTime(getCreateTime());
		assetEntrySetImpl.setModifiedTime(getModifiedTime());
		assetEntrySetImpl.setAssetEntryId(getAssetEntryId());
		assetEntrySetImpl.setParentAssetEntrySetId(getParentAssetEntrySetId());
		assetEntrySetImpl.setCreatorClassNameId(getCreatorClassNameId());
		assetEntrySetImpl.setCreatorClassPK(getCreatorClassPK());
		assetEntrySetImpl.setContent(getContent());
		assetEntrySetImpl.setData(getData());

		assetEntrySetImpl.resetOriginalValues();

		return assetEntrySetImpl;
	}

	@Override
	public int compareTo(AssetEntrySet assetEntrySet) {
		int value = 0;

		if (getCreateTime() < assetEntrySet.getCreateTime()) {
			value = -1;
		}
		else if (getCreateTime() > assetEntrySet.getCreateTime()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetEntrySet)) {
			return false;
		}

		AssetEntrySet assetEntrySet = (AssetEntrySet)obj;

		long primaryKey = assetEntrySet.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<AssetEntrySet> toCacheModel() {
		AssetEntrySetCacheModel assetEntrySetCacheModel = new AssetEntrySetCacheModel();

		assetEntrySetCacheModel.assetEntrySetId = getAssetEntrySetId();

		assetEntrySetCacheModel.companyId = getCompanyId();

		assetEntrySetCacheModel.userId = getUserId();

		assetEntrySetCacheModel.userName = getUserName();

		String userName = assetEntrySetCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			assetEntrySetCacheModel.userName = null;
		}

		assetEntrySetCacheModel.createTime = getCreateTime();

		assetEntrySetCacheModel.modifiedTime = getModifiedTime();

		assetEntrySetCacheModel.assetEntryId = getAssetEntryId();

		String assetEntryId = assetEntrySetCacheModel.assetEntryId;

		if ((assetEntryId != null) && (assetEntryId.length() == 0)) {
			assetEntrySetCacheModel.assetEntryId = null;
		}

		assetEntrySetCacheModel.parentAssetEntrySetId = getParentAssetEntrySetId();

		assetEntrySetCacheModel.creatorClassNameId = getCreatorClassNameId();

		assetEntrySetCacheModel.creatorClassPK = getCreatorClassPK();

		assetEntrySetCacheModel.content = getContent();

		String content = assetEntrySetCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			assetEntrySetCacheModel.content = null;
		}

		assetEntrySetCacheModel.data = getData();

		String data = assetEntrySetCacheModel.data;

		if ((data != null) && (data.length() == 0)) {
			assetEntrySetCacheModel.data = null;
		}

		return assetEntrySetCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{assetEntrySetId=");
		sb.append(getAssetEntrySetId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createTime=");
		sb.append(getCreateTime());
		sb.append(", modifiedTime=");
		sb.append(getModifiedTime());
		sb.append(", assetEntryId=");
		sb.append(getAssetEntryId());
		sb.append(", parentAssetEntrySetId=");
		sb.append(getParentAssetEntrySetId());
		sb.append(", creatorClassNameId=");
		sb.append(getCreatorClassNameId());
		sb.append(", creatorClassPK=");
		sb.append(getCreatorClassPK());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", data=");
		sb.append(getData());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.liferay.asset.entry.set.model.AssetEntrySet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assetEntrySetId</column-name><column-value><![CDATA[");
		sb.append(getAssetEntrySetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createTime</column-name><column-value><![CDATA[");
		sb.append(getCreateTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedTime</column-name><column-value><![CDATA[");
		sb.append(getModifiedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetEntryId</column-name><column-value><![CDATA[");
		sb.append(getAssetEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentAssetEntrySetId</column-name><column-value><![CDATA[");
		sb.append(getParentAssetEntrySetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creatorClassNameId</column-name><column-value><![CDATA[");
		sb.append(getCreatorClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creatorClassPK</column-name><column-value><![CDATA[");
		sb.append(getCreatorClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data</column-name><column-value><![CDATA[");
		sb.append(getData());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = AssetEntrySet.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			AssetEntrySet.class
		};
	private long _assetEntrySetId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private long _createTime;
	private long _modifiedTime;
	private String _assetEntryId;
	private long _parentAssetEntrySetId;
	private long _creatorClassNameId;
	private long _creatorClassPK;
	private String _content;
	private String _data;
	private AssetEntrySet _escapedModel;
}