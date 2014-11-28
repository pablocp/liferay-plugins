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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssetEntrySetSoap implements Serializable {
	public static AssetEntrySetSoap toSoapModel(AssetEntrySet model) {
		AssetEntrySetSoap soapModel = new AssetEntrySetSoap();

		soapModel.setAssetEntrySetId(model.getAssetEntrySetId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateTime(model.getCreateTime());
		soapModel.setModifiedTime(model.getModifiedTime());
		soapModel.setAssetEntryId(model.getAssetEntryId());
		soapModel.setParentAssetEntrySetId(model.getParentAssetEntrySetId());
		soapModel.setCreatorClassNameId(model.getCreatorClassNameId());
		soapModel.setCreatorClassPK(model.getCreatorClassPK());
		soapModel.setContent(model.getContent());
		soapModel.setData(model.getData());

		return soapModel;
	}

	public static AssetEntrySetSoap[] toSoapModels(AssetEntrySet[] models) {
		AssetEntrySetSoap[] soapModels = new AssetEntrySetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetEntrySetSoap[][] toSoapModels(AssetEntrySet[][] models) {
		AssetEntrySetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetEntrySetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetEntrySetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetEntrySetSoap[] toSoapModels(List<AssetEntrySet> models) {
		List<AssetEntrySetSoap> soapModels = new ArrayList<AssetEntrySetSoap>(models.size());

		for (AssetEntrySet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetEntrySetSoap[soapModels.size()]);
	}

	public AssetEntrySetSoap() {
	}

	public long getPrimaryKey() {
		return _assetEntrySetId;
	}

	public void setPrimaryKey(long pk) {
		setAssetEntrySetId(pk);
	}

	public long getAssetEntrySetId() {
		return _assetEntrySetId;
	}

	public void setAssetEntrySetId(long assetEntrySetId) {
		_assetEntrySetId = assetEntrySetId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public long getCreateTime() {
		return _createTime;
	}

	public void setCreateTime(long createTime) {
		_createTime = createTime;
	}

	public long getModifiedTime() {
		return _modifiedTime;
	}

	public void setModifiedTime(long modifiedTime) {
		_modifiedTime = modifiedTime;
	}

	public String getAssetEntryId() {
		return _assetEntryId;
	}

	public void setAssetEntryId(String assetEntryId) {
		_assetEntryId = assetEntryId;
	}

	public long getParentAssetEntrySetId() {
		return _parentAssetEntrySetId;
	}

	public void setParentAssetEntrySetId(long parentAssetEntrySetId) {
		_parentAssetEntrySetId = parentAssetEntrySetId;
	}

	public long getCreatorClassNameId() {
		return _creatorClassNameId;
	}

	public void setCreatorClassNameId(long creatorClassNameId) {
		_creatorClassNameId = creatorClassNameId;
	}

	public long getCreatorClassPK() {
		return _creatorClassPK;
	}

	public void setCreatorClassPK(long creatorClassPK) {
		_creatorClassPK = creatorClassPK;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public String getData() {
		return _data;
	}

	public void setData(String data) {
		_data = data;
	}

	private long _assetEntrySetId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private long _createTime;
	private long _modifiedTime;
	private String _assetEntryId;
	private long _parentAssetEntrySetId;
	private long _creatorClassNameId;
	private long _creatorClassPK;
	private String _content;
	private String _data;
}