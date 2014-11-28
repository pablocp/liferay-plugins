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

package com.liferay.asset.entry.set.model;

import com.liferay.asset.entry.set.service.AssetEntrySetLocalServiceUtil;
import com.liferay.asset.entry.set.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class AssetEntrySetClp extends BaseModelImpl<AssetEntrySet>
	implements AssetEntrySet {
	public AssetEntrySetClp() {
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

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetEntrySetId", long.class);

				method.invoke(_assetEntrySetRemoteModel, assetEntrySetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_assetEntrySetRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_assetEntrySetRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
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
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_assetEntrySetRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreateTime() {
		return _createTime;
	}

	@Override
	public void setCreateTime(long createTime) {
		_createTime = createTime;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateTime", long.class);

				method.invoke(_assetEntrySetRemoteModel, createTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifiedTime() {
		return _modifiedTime;
	}

	@Override
	public void setModifiedTime(long modifiedTime) {
		_modifiedTime = modifiedTime;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedTime", long.class);

				method.invoke(_assetEntrySetRemoteModel, modifiedTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAssetEntryId() {
		return _assetEntryId;
	}

	@Override
	public void setAssetEntryId(String assetEntryId) {
		_assetEntryId = assetEntryId;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetEntryId", String.class);

				method.invoke(_assetEntrySetRemoteModel, assetEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParentAssetEntrySetId() {
		return _parentAssetEntrySetId;
	}

	@Override
	public void setParentAssetEntrySetId(long parentAssetEntrySetId) {
		_parentAssetEntrySetId = parentAssetEntrySetId;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setParentAssetEntrySetId",
						long.class);

				method.invoke(_assetEntrySetRemoteModel, parentAssetEntrySetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatorClassNameId() {
		return _creatorClassNameId;
	}

	@Override
	public void setCreatorClassNameId(long creatorClassNameId) {
		_creatorClassNameId = creatorClassNameId;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatorClassNameId",
						long.class);

				method.invoke(_assetEntrySetRemoteModel, creatorClassNameId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatorClassPK() {
		return _creatorClassPK;
	}

	@Override
	public void setCreatorClassPK(long creatorClassPK) {
		_creatorClassPK = creatorClassPK;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatorClassPK", long.class);

				method.invoke(_assetEntrySetRemoteModel, creatorClassPK);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContent() {
		return _content;
	}

	@Override
	public void setContent(String content) {
		_content = content;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setContent", String.class);

				method.invoke(_assetEntrySetRemoteModel, content);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getData() {
		return _data;
	}

	@Override
	public void setData(String data) {
		_data = data;

		if (_assetEntrySetRemoteModel != null) {
			try {
				Class<?> clazz = _assetEntrySetRemoteModel.getClass();

				Method method = clazz.getMethod("setData", String.class);

				method.invoke(_assetEntrySetRemoteModel, data);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssetEntrySetRemoteModel() {
		return _assetEntrySetRemoteModel;
	}

	public void setAssetEntrySetRemoteModel(
		BaseModel<?> assetEntrySetRemoteModel) {
		_assetEntrySetRemoteModel = assetEntrySetRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _assetEntrySetRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_assetEntrySetRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssetEntrySetLocalServiceUtil.addAssetEntrySet(this);
		}
		else {
			AssetEntrySetLocalServiceUtil.updateAssetEntrySet(this);
		}
	}

	@Override
	public AssetEntrySet toEscapedModel() {
		return (AssetEntrySet)ProxyUtil.newProxyInstance(AssetEntrySet.class.getClassLoader(),
			new Class[] { AssetEntrySet.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssetEntrySetClp clone = new AssetEntrySetClp();

		clone.setAssetEntrySetId(getAssetEntrySetId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateTime(getCreateTime());
		clone.setModifiedTime(getModifiedTime());
		clone.setAssetEntryId(getAssetEntryId());
		clone.setParentAssetEntrySetId(getParentAssetEntrySetId());
		clone.setCreatorClassNameId(getCreatorClassNameId());
		clone.setCreatorClassPK(getCreatorClassPK());
		clone.setContent(getContent());
		clone.setData(getData());

		return clone;
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

		if (!(obj instanceof AssetEntrySetClp)) {
			return false;
		}

		AssetEntrySetClp assetEntrySet = (AssetEntrySetClp)obj;

		long primaryKey = assetEntrySet.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
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
	private BaseModel<?> _assetEntrySetRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.asset.entry.set.service.ClpSerializer.class;
}