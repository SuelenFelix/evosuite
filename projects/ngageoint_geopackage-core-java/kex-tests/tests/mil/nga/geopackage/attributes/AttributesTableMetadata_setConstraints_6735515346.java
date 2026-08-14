package mil.nga.geopackage.attributes;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static mil.nga.geopackage.attributes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTableMetadata_setConstraints_6735515346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138467;
     Object term138547;

    public AttributesTableMetadata_setConstraints_6735515346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term138469 = new ArrayList();
        HashMap term138473 = new HashMap();
        ArrayList term138539 = new ArrayList();
        ArrayList term138543 = new ArrayList();
        term138467 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        Object term138468 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term138468, term138468.getClass(), "constraints", term138469);
        setField(term138468, term138468.getClass(), "typedContraints", term138473);
        setField(term138467, term138467.getClass(), "constraints", term138468);
        setField(term138467, term138467.getClass(), "tableName", "LACfLkaJjq");
        setField(term138467, term138467.getClass(), "dataType", "OhYEjeUQkK");
        setField(term138467, term138467.getClass(), "identifier", "rgZeldfAMO");
        setField(term138467, term138467.getClass(), "description", "btsBDylBZe");
        setField(term138467, term138467.getClass(), "idColumnName", "eAWJddaxnT");
        setBooleanField(term138467, term138467.getClass(), "autoincrement", true);
        setField(term138467, term138467.getClass(), "additionalColumns", term138539);
        setField(term138467, term138467.getClass(), "columns", term138543);
        ArrayList term138548 = new ArrayList();
        HashMap term138552 = new HashMap();
        term138547 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term138547, term138547.getClass(), "constraints", term138548);
        setField(term138547, term138547.getClass(), "typedContraints", term138552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[1];
        args[0] = term138547;
        callMethod(klass, "setConstraints", argTypes, term138467, args);
    }

};


