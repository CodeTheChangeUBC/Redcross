/*
 * This file is generated by jOOQ.
*/
package com.redcross.generated.schema;


import com.redcross.generated.schema.tables.TestTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Redcross extends SchemaImpl {

    private static final long serialVersionUID = -1463021515;

    /**
     * The reference instance of <code>redcross</code>
     */
    public static final Redcross REDCROSS = new Redcross();

    /**
     * The table <code>redcross.test_table</code>.
     */
    public final TestTable TEST_TABLE = com.redcross.generated.schema.tables.TestTable.TEST_TABLE;

    /**
     * No further instances allowed
     */
    private Redcross() {
        super("redcross", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            TestTable.TEST_TABLE);
    }
}