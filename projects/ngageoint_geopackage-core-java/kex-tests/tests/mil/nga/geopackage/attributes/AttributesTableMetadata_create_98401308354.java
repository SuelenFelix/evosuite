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

public class AttributesTableMetadata_create_98401308354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4752;

    public AttributesTableMetadata_create_98401308354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4752 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        setField(term4752, term4752.getClass(), "constraints", null);
        setField(term4752, term4752.getClass(), "tableName", null);
        setField(term4752, term4752.getClass(), "dataType", null);
        setField(term4752, term4752.getClass(), "identifier", null);
        setField(term4752, term4752.getClass(), "description", null);
        setField(term4752, term4752.getClass(), "idColumnName", null);
        setBooleanField(term4752, term4752.getClass(), "autoincrement", false);
        setField(term4752, term4752.getClass(), "additionalColumns", null);
        setField(term4752, term4752.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "create", argTypes, term4752, args);
    }

};


