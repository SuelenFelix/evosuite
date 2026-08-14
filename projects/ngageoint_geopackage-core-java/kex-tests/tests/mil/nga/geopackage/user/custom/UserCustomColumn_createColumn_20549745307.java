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
import java.lang.Boolean;

public class UserCustomColumn_createColumn_20549745307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299;
     Object term305;
     Object term307;

    public UserCustomColumn_createColumn_20549745307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn"));
        setIntField(term299, term299.getClass(), "index", 0);
        setField(term299, term299.getClass(), "name", null);
        setField(term299, term299.getClass(), "max", null);
        setBooleanField(term299, term299.getClass(), "notNull", false);
        setField(term299, term299.getClass(), "defaultValue", null);
        setBooleanField(term299, term299.getClass(), "primaryKey", false);
        setBooleanField(term299, term299.getClass(), "autoincrement", false);
        setBooleanField(term299, term299.getClass(), "unique", false);
        setField(term299, term299.getClass(), "type", null);
        setField(term299, term299.getClass(), "dataType", null);
        setField(term299, term299.getClass(), "constraints", null);
        setField(term299, term299.getClass(), "schema", null);
        term305 = new Integer(0);
        term307 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term305;
        args[1] = null;
        args[2] = null;
        args[3] = term307;
        callMethod(klass, "createColumn", argTypes, term299, args);
    }

};


