<%
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
%>

<%@ include file="/aggregator/init.jsp" %>

<liferay-portlet:renderURL varImpl="iteratorURL" />

<liferay-ui:search-container
	delta="<%= articlesDelta %>"
	iteratorURL="<%= iteratorURL %>"
>
	<liferay-ui:search-container-results>

		<%
		if (selectionMethod.equals("articles")) {
			results = KnowledgeBaseUtil.getArticles(resourcePrimKeys, searchContainer.getStart(), searchContainer.getEnd(), true);
			total = resourcePrimKeys.length;
		}
		else if (selectionMethod.equals("parent-group")) {
			Map<String, Object> params = new HashMap<String, Object>();

			params.put("parentGroupId", themeDisplay.getParentGroupId());

			if (!allArticles) {
				params.put("parentResourcePrimKey", ArticleConstants.DEFAULT_PARENT_RESOURCE_PRIM_KEY);
			}

			results = ArticleServiceUtil.getArticles(params, false, searchContainer.getStart(), searchContainer.getEnd(), orderByComparator);
			total = ArticleServiceUtil.getArticlesCount(params, false);
		}
		else if (selectionMethod.equals("scope-groups")) {
			Map<String, Object> params = new HashMap<String, Object>();

			params.put("groupId", ArrayUtil.toArray(scopeGroupIds));

			if (!allArticles) {
				params.put("parentResourcePrimKey", ArticleConstants.DEFAULT_PARENT_RESOURCE_PRIM_KEY);
			}

			results = ArticleServiceUtil.getArticles(params, false, searchContainer.getStart(), searchContainer.getEnd(), orderByComparator);
			total = ArticleServiceUtil.getArticlesCount(params, false);
		}

		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		%>

	</liferay-ui:search-container-results>

	<div class="kb-results-body">

		<%
		for (Article article : (List<Article>)results) {
		%>

			<portlet:renderURL var="viewArticleURL" windowState="<%= articleWindowState %>">
				<portlet:param name="jspPage" value="/aggregator/view_article.jsp" />
				<portlet:param name="resourcePrimKey" value="<%= String.valueOf(article.getResourcePrimKey()) %>" />
			</portlet:renderURL>

			<liferay-ui:icon
				cssClass="kb-title"
				image="../trees/page"
				label="<%= true %>"
				message="<%= article.getTitle() %>"
				method="get"
				url="<%= viewArticleURL %>"
			/>

			<c:choose>
				<c:when test='<%= articlesDisplayStyle.equals("full-content") %>'>
					<%= article.getContent() %>
				</c:when>
				<c:when test='<%= (articlesDisplayStyle.equals("abstract") && Validator.isNotNull(article.getDescription())) %>'>
					<%= article.getDescription() %>
				</c:when>
				<c:when test='<%= articlesDisplayStyle.equals("abstract") %>'>
					<%= StringUtil.shorten(HtmlUtil.extractText(article.getContent()), 500) %>
				</c:when>
			</c:choose>

		<%
		}
		%>

	</div>

	<c:if test="<%= results.isEmpty() || (searchContainer.getDelta() < total) %>">
		<div class="kb-results-footer">
			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		</div>
	</c:if>
</liferay-ui:search-container>