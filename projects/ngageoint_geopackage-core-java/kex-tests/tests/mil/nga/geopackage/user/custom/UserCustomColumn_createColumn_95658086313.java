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

public class UserCustomColumn_createColumn_95658086313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624;
     Object term630;
     Object term632;

    public UserCustomColumn_createColumn_95658086313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn"));
        setIntField(term624, term624.getClass(), "index", 0);
        setField(term624, term624.getClass(), "name", null);
        setField(term624, term624.getClass(), "max", null);
        setBooleanField(term624, term624.getClass(), "notNull", false);
        setField(term624, term624.getClass(), "defaultValue", null);
        setBooleanField(term624, term624.getClass(), "primaryKey", false);
        setBooleanField(term624, term624.getClass(), "autoincrement", false);
        setBooleanField(term624, term624.getClass(), "unique", false);
        setField(term624, term624.getClass(), "type", null);
        setField(term624, term624.getClass(), "dataType", null);
        setField(term624, term624.getClass(), "constraints", null);
        setField(term624, term624.getClass(), "schema", null);
        term630 = new Integer(0);
        term632 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[3] = Class.forName("java.lang.Long");
        argTypes[4] = boolean.class;
        argTypes[5] = Class.forName("java.lang.Object");
        Object[] args = new Object[6];
        args[0] = term630;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term632;
        args[5] = null;
        callMethod(klass, "createColumn", argTypes, term624, args);
    }

};


