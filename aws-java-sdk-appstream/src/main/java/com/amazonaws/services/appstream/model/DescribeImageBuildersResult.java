/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImageBuilders" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageBuildersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the image builders.
     * </p>
     */
    private java.util.List<ImageBuilder> imageBuilders;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the image builders.
     * </p>
     * 
     * @return Information about the image builders.
     */

    public java.util.List<ImageBuilder> getImageBuilders() {
        return imageBuilders;
    }

    /**
     * <p>
     * Information about the image builders.
     * </p>
     * 
     * @param imageBuilders
     *        Information about the image builders.
     */

    public void setImageBuilders(java.util.Collection<ImageBuilder> imageBuilders) {
        if (imageBuilders == null) {
            this.imageBuilders = null;
            return;
        }

        this.imageBuilders = new java.util.ArrayList<ImageBuilder>(imageBuilders);
    }

    /**
     * <p>
     * Information about the image builders.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageBuilders(java.util.Collection)} or {@link #withImageBuilders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param imageBuilders
     *        Information about the image builders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageBuildersResult withImageBuilders(ImageBuilder... imageBuilders) {
        if (this.imageBuilders == null) {
            setImageBuilders(new java.util.ArrayList<ImageBuilder>(imageBuilders.length));
        }
        for (ImageBuilder ele : imageBuilders) {
            this.imageBuilders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the image builders.
     * </p>
     * 
     * @param imageBuilders
     *        Information about the image builders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageBuildersResult withImageBuilders(java.util.Collection<ImageBuilder> imageBuilders) {
        setImageBuilders(imageBuilders);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageBuildersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageBuilders() != null)
            sb.append("ImageBuilders: ").append(getImageBuilders()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImageBuildersResult == false)
            return false;
        DescribeImageBuildersResult other = (DescribeImageBuildersResult) obj;
        if (other.getImageBuilders() == null ^ this.getImageBuilders() == null)
            return false;
        if (other.getImageBuilders() != null && other.getImageBuilders().equals(this.getImageBuilders()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageBuilders() == null) ? 0 : getImageBuilders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImageBuildersResult clone() {
        try {
            return (DescribeImageBuildersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
