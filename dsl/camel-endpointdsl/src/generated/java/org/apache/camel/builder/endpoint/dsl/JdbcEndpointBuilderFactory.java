/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Access databases through SQL and JDBC.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JdbcEndpointBuilderFactory {


    /**
     * Builder for endpoint for the JDBC component.
     */
    public interface JdbcEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedJdbcEndpointBuilder advanced() {
            return (AdvancedJdbcEndpointBuilder) this;
        }
        /**
         * Whether to allow using named parameters in the queries.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param allowNamedParameters the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder allowNamedParameters(
                boolean allowNamedParameters) {
            doSetProperty("allowNamedParameters", allowNamedParameters);
            return this;
        }
        /**
         * Whether to allow using named parameters in the queries.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param allowNamedParameters the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder allowNamedParameters(
                String allowNamedParameters) {
            doSetProperty("allowNamedParameters", allowNamedParameters);
            return this;
        }
        /**
         * Specify the full package and class name to use as conversion when
         * outputType=SelectOne or SelectList.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param outputClass the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder outputClass(String outputClass) {
            doSetProperty("outputClass", outputClass);
            return this;
        }
        /**
         * Determines the output the producer should use.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jdbc.JdbcOutputType&lt;/code&gt; type.
         * 
         * Default: SelectList
         * Group: producer
         * 
         * @param outputType the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder outputType(
                org.apache.camel.component.jdbc.JdbcOutputType outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * Determines the output the producer should use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.jdbc.JdbcOutputType&lt;/code&gt; type.
         * 
         * Default: SelectList
         * Group: producer
         * 
         * @param outputType the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder outputType(String outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * Optional parameters to the java.sql.Statement. For example to set
         * maxRows, fetchSize etc.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the parameters(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: producer
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default JdbcEndpointBuilder parameters(String key, Object value) {
            doSetMultiValueProperty("parameters", "statement." + key, value);
            return this;
        }
        /**
         * Optional parameters to the java.sql.Statement. For example to set
         * maxRows, fetchSize etc.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the parameters(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: producer
         * 
         * @param values the values
         * @return the dsl builder
         */
        default JdbcEndpointBuilder parameters(Map values) {
            doSetMultiValueProperties("parameters", "statement.", values);
            return this;
        }
        /**
         * The default maximum number of rows that can be read by a polling
         * query. The default value is 0.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param readSize the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder readSize(int readSize) {
            doSetProperty("readSize", readSize);
            return this;
        }
        /**
         * The default maximum number of rows that can be read by a polling
         * query. The default value is 0.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param readSize the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder readSize(String readSize) {
            doSetProperty("readSize", readSize);
            return this;
        }
        /**
         * Camel will set the autoCommit on the JDBC connection to be false,
         * commit the change after executed the statement and reset the
         * autoCommit flag of the connection at the end, if the resetAutoCommit
         * is true. If the JDBC connection doesn't support to reset the
         * autoCommit flag, you can set the resetAutoCommit flag to be false,
         * and Camel will not try to reset the autoCommit flag. When used with
         * XA transactions you most likely need to set it to false so that the
         * transaction manager is in charge of committing this tx.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param resetAutoCommit the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder resetAutoCommit(boolean resetAutoCommit) {
            doSetProperty("resetAutoCommit", resetAutoCommit);
            return this;
        }
        /**
         * Camel will set the autoCommit on the JDBC connection to be false,
         * commit the change after executed the statement and reset the
         * autoCommit flag of the connection at the end, if the resetAutoCommit
         * is true. If the JDBC connection doesn't support to reset the
         * autoCommit flag, you can set the resetAutoCommit flag to be false,
         * and Camel will not try to reset the autoCommit flag. When used with
         * XA transactions you most likely need to set it to false so that the
         * transaction manager is in charge of committing this tx.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param resetAutoCommit the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder resetAutoCommit(String resetAutoCommit) {
            doSetProperty("resetAutoCommit", resetAutoCommit);
            return this;
        }
        /**
         * Whether transactions are in use.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param transacted the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder transacted(boolean transacted) {
            doSetProperty("transacted", transacted);
            return this;
        }
        /**
         * Whether transactions are in use.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param transacted the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder transacted(String transacted) {
            doSetProperty("transacted", transacted);
            return this;
        }
        /**
         * To read BLOB columns as bytes instead of string data. This may be
         * needed for certain databases such as Oracle where you must read BLOB
         * columns as bytes.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useGetBytesForBlob the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder useGetBytesForBlob(
                boolean useGetBytesForBlob) {
            doSetProperty("useGetBytesForBlob", useGetBytesForBlob);
            return this;
        }
        /**
         * To read BLOB columns as bytes instead of string data. This may be
         * needed for certain databases such as Oracle where you must read BLOB
         * columns as bytes.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useGetBytesForBlob the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder useGetBytesForBlob(String useGetBytesForBlob) {
            doSetProperty("useGetBytesForBlob", useGetBytesForBlob);
            return this;
        }
        /**
         * Set this option to true to use the prepareStatementStrategy with
         * named parameters. This allows to define queries with named
         * placeholders, and use headers with the dynamic values for the query
         * placeholders.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useHeadersAsParameters the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder useHeadersAsParameters(
                boolean useHeadersAsParameters) {
            doSetProperty("useHeadersAsParameters", useHeadersAsParameters);
            return this;
        }
        /**
         * Set this option to true to use the prepareStatementStrategy with
         * named parameters. This allows to define queries with named
         * placeholders, and use headers with the dynamic values for the query
         * placeholders.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useHeadersAsParameters the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder useHeadersAsParameters(
                String useHeadersAsParameters) {
            doSetProperty("useHeadersAsParameters", useHeadersAsParameters);
            return this;
        }
        /**
         * Sets whether to use JDBC 4 or JDBC 3.0 or older semantic when
         * retrieving column name. JDBC 4.0 uses columnLabel to get the column
         * name where as JDBC 3.0 uses both columnName or columnLabel.
         * Unfortunately JDBC drivers behave differently so you can use this
         * option to work out issues around your JDBC driver if you get problem
         * using this component This option is default true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param useJDBC4ColumnNameAndLabelSemantics the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder useJDBC4ColumnNameAndLabelSemantics(
                boolean useJDBC4ColumnNameAndLabelSemantics) {
            doSetProperty("useJDBC4ColumnNameAndLabelSemantics", useJDBC4ColumnNameAndLabelSemantics);
            return this;
        }
        /**
         * Sets whether to use JDBC 4 or JDBC 3.0 or older semantic when
         * retrieving column name. JDBC 4.0 uses columnLabel to get the column
         * name where as JDBC 3.0 uses both columnName or columnLabel.
         * Unfortunately JDBC drivers behave differently so you can use this
         * option to work out issues around your JDBC driver if you get problem
         * using this component This option is default true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param useJDBC4ColumnNameAndLabelSemantics the value to set
         * @return the dsl builder
         */
        default JdbcEndpointBuilder useJDBC4ColumnNameAndLabelSemantics(
                String useJDBC4ColumnNameAndLabelSemantics) {
            doSetProperty("useJDBC4ColumnNameAndLabelSemantics", useJDBC4ColumnNameAndLabelSemantics);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JDBC component.
     */
    public interface AdvancedJdbcEndpointBuilder
            extends
                EndpointProducerBuilder {
        default JdbcEndpointBuilder basic() {
            return (JdbcEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedJdbcEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedJdbcEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use a custom org.apache.camel.component.jdbc.BeanRowMapper when
         * using outputClass. The default implementation will lower case the row
         * names and skip underscores, and dashes. For example CUST_ID is mapped
         * as custId.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jdbc.BeanRowMapper&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param beanRowMapper the value to set
         * @return the dsl builder
         */
        default AdvancedJdbcEndpointBuilder beanRowMapper(
                org.apache.camel.component.jdbc.BeanRowMapper beanRowMapper) {
            doSetProperty("beanRowMapper", beanRowMapper);
            return this;
        }
        /**
         * To use a custom org.apache.camel.component.jdbc.BeanRowMapper when
         * using outputClass. The default implementation will lower case the row
         * names and skip underscores, and dashes. For example CUST_ID is mapped
         * as custId.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.jdbc.BeanRowMapper&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param beanRowMapper the value to set
         * @return the dsl builder
         */
        default AdvancedJdbcEndpointBuilder beanRowMapper(String beanRowMapper) {
            doSetProperty("beanRowMapper", beanRowMapper);
            return this;
        }
        /**
         * To use a custom strategy for working with connections. Do not use a
         * custom strategy when using the spring-jdbc component because a
         * special Spring ConnectionStrategy is used by default to support
         * Spring Transactions.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jdbc.ConnectionStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param connectionStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedJdbcEndpointBuilder connectionStrategy(
                org.apache.camel.component.jdbc.ConnectionStrategy connectionStrategy) {
            doSetProperty("connectionStrategy", connectionStrategy);
            return this;
        }
        /**
         * To use a custom strategy for working with connections. Do not use a
         * custom strategy when using the spring-jdbc component because a
         * special Spring ConnectionStrategy is used by default to support
         * Spring Transactions.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.jdbc.ConnectionStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param connectionStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedJdbcEndpointBuilder connectionStrategy(
                String connectionStrategy) {
            doSetProperty("connectionStrategy", connectionStrategy);
            return this;
        }
        /**
         * Allows the plugin to use a custom
         * org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy to
         * control preparation of the query and prepared statement.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param prepareStatementStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedJdbcEndpointBuilder prepareStatementStrategy(
                org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy prepareStatementStrategy) {
            doSetProperty("prepareStatementStrategy", prepareStatementStrategy);
            return this;
        }
        /**
         * Allows the plugin to use a custom
         * org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy to
         * control preparation of the query and prepared statement.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param prepareStatementStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedJdbcEndpointBuilder prepareStatementStrategy(
                String prepareStatementStrategy) {
            doSetProperty("prepareStatementStrategy", prepareStatementStrategy);
            return this;
        }
    }

    public interface JdbcBuilders {
        /**
         * JDBC (camel-jdbc)
         * Access databases through SQL and JDBC.
         * 
         * Category: database,sql
         * Since: 1.2
         * Maven coordinates: org.apache.camel:camel-jdbc
         * 
         * @return the dsl builder for the headers' name.
         */
        default JdbcHeaderNameBuilder jdbc() {
            return JdbcHeaderNameBuilder.INSTANCE;
        }
        /**
         * JDBC (camel-jdbc)
         * Access databases through SQL and JDBC.
         * 
         * Category: database,sql
         * Since: 1.2
         * Maven coordinates: org.apache.camel:camel-jdbc
         * 
         * Syntax: <code>jdbc:dataSourceName</code>
         * 
         * Path parameter: dataSourceName (required)
         * Name of DataSource to lookup in the Registry. If the name is
         * dataSource or default, then Camel will attempt to lookup a default
         * DataSource from the registry, meaning if there is a only one instance
         * of DataSource found, then this DataSource will be used.
         * 
         * @param path dataSourceName
         * @return the dsl builder
         */
        default JdbcEndpointBuilder jdbc(String path) {
            return JdbcEndpointBuilderFactory.endpointBuilder("jdbc", path);
        }
        /**
         * JDBC (camel-jdbc)
         * Access databases through SQL and JDBC.
         * 
         * Category: database,sql
         * Since: 1.2
         * Maven coordinates: org.apache.camel:camel-jdbc
         * 
         * Syntax: <code>jdbc:dataSourceName</code>
         * 
         * Path parameter: dataSourceName (required)
         * Name of DataSource to lookup in the Registry. If the name is
         * dataSource or default, then Camel will attempt to lookup a default
         * DataSource from the registry, meaning if there is a only one instance
         * of DataSource found, then this DataSource will be used.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path dataSourceName
         * @return the dsl builder
         */
        default JdbcEndpointBuilder jdbc(String componentName, String path) {
            return JdbcEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the JDBC component.
     */
    public static class JdbcHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final JdbcHeaderNameBuilder INSTANCE = new JdbcHeaderNameBuilder();

        /**
         * If the query is an UPDATE, query the update count is returned in this
         * OUT header.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JdbcUpdateCount}.
         */
        public String jdbcUpdateCount() {
            return "JdbcUpdateCount";
        }

        /**
         * If the query is a SELECT, query the row count is returned in this OUT
         * header.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JdbcRowCount}.
         */
        public String jdbcRowCount() {
            return "JdbcRowCount";
        }

        /**
         * The column names from the ResultSet as a java.util.Set type.
         * 
         * The option is a: {@code Set<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JdbcColumnNames}.
         */
        public String jdbcColumnNames() {
            return "JdbcColumnNames";
        }

        /**
         * A java.util.Map which has the headers to be used if
         * useHeadersAsParameters has been enabled.
         * 
         * The option is a: {@code Map} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JdbcParameters}.
         */
        public String jdbcParameters() {
            return "JdbcParameters";
        }

        /**
         * Set its value to true to retrieve generated keys.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Default: false
         * Group: producer
         * 
         * @return the name of the header {@code RetrieveGeneratedKeys}.
         */
        public String retrieveGeneratedKeys() {
            return "RetrieveGeneratedKeys";
        }

        /**
         * Set it to specify the expected generated columns.
         * 
         * The option is a: {@code String[] or int[]} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code GeneratedColumns}.
         */
        public String generatedColumns() {
            return "GeneratedColumns";
        }

        /**
         * The number of rows in the header that contains generated keys.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code GeneratedKeysRowCount}.
         */
        public String generatedKeysRowCount() {
            return "GeneratedKeysRowCount";
        }

        /**
         * Rows that contains the generated keys.
         * 
         * The option is a: {@code List<Map<String, Object>>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code GeneratedKeysRows}.
         */
        public String generatedKeysRows() {
            return "GeneratedKeysRows";
        }
    }
    static JdbcEndpointBuilder endpointBuilder(String componentName, String path) {
        class JdbcEndpointBuilderImpl extends AbstractEndpointBuilder implements JdbcEndpointBuilder, AdvancedJdbcEndpointBuilder {
            public JdbcEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new JdbcEndpointBuilderImpl(path);
    }
}