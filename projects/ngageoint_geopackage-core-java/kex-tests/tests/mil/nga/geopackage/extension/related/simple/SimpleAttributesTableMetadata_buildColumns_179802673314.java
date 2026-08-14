package mil.nga.geopackage.extension.related.simple;

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
import static mil.nga.geopackage.extension.related.simple.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class SimpleAttributesTableMetadata_buildColumns_179802673314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69929;

    public SimpleAttributesTableMetadata_buildColumns_179802673314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term69991 = new ArrayList();
        ArrayList term69995 = new ArrayList();
        term69929 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term69929, term69929.getClass(), "tableName", "PFpWKxDIRz");
        setField(term69929, term69929.getClass(), "dataType", "qePuOCwoCf");
        setField(term69929, term69929.getClass(), "identifier", "vJPujDInGq");
        setField(term69929, term69929.getClass(), "description", "cHZGcMhatT");
        setField(term69929, term69929.getClass(), "idColumnName", "OZGyrUPedG");
        setBooleanField(term69929, term69929.getClass(), "autoincrement", true);
        setField(term69929, term69929.getClass(), "additionalColumns", term69991);
        setField(term69929, term69929.getClass(), "columns", term69995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term69929, args);
    }

};


