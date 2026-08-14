package mil.nga.geopackage.user.custom;

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
import static mil.nga.geopackage.user.custom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserCustomColumn_createColumn_23559787011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516;
     Object term522;

    public UserCustomColumn_createColumn_23559787011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn"));
        setIntField(term516, term516.getClass(), "index", 0);
        setField(term516, term516.getClass(), "name", null);
        setField(term516, term516.getClass(), "max", null);
        setBooleanField(term516, term516.getClass(), "notNull", false);
        setField(term516, term516.getClass(), "defaultValue", null);
        setBooleanField(term516, term516.getClass(), "primaryKey", false);
        setBooleanField(term516, term516.getClass(), "autoincrement", false);
        setBooleanField(term516, term516.getClass(), "unique", false);
        setField(term516, term516.getClass(), "type", null);
        setField(term516, term516.getClass(), "dataType", null);
        setField(term516, term516.getClass(), "constraints", null);
        setField(term516, term516.getClass(), "schema", null);
        term522 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[3] = Class.forName("java.lang.Long");
        Object[] args = new Object[4];
        args[0] = term522;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "createColumn", argTypes, term516, args);
    }

};


