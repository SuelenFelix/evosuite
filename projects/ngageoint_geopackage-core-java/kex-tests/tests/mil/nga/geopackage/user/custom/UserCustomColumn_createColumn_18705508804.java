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

public class UserCustomColumn_createColumn_18705508804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;

    public UserCustomColumn_createColumn_18705508804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn"));
        setIntField(term141, term141.getClass(), "index", 0);
        setField(term141, term141.getClass(), "name", null);
        setField(term141, term141.getClass(), "max", null);
        setBooleanField(term141, term141.getClass(), "notNull", false);
        setField(term141, term141.getClass(), "defaultValue", null);
        setBooleanField(term141, term141.getClass(), "primaryKey", false);
        setBooleanField(term141, term141.getClass(), "autoincrement", false);
        setBooleanField(term141, term141.getClass(), "unique", false);
        setField(term141, term141.getClass(), "type", null);
        setField(term141, term141.getClass(), "dataType", null);
        setField(term141, term141.getClass(), "constraints", null);
        setField(term141, term141.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createColumn", argTypes, term141, args);
    }

};


