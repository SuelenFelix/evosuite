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

public class UserCustomColumn_createPrimaryKeyColumn_81097877521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term924;
     Object term930;

    public UserCustomColumn_createPrimaryKeyColumn_81097877521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term924 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn"));
        setIntField(term924, term924.getClass(), "index", 0);
        setField(term924, term924.getClass(), "name", null);
        setField(term924, term924.getClass(), "max", null);
        setBooleanField(term924, term924.getClass(), "notNull", false);
        setField(term924, term924.getClass(), "defaultValue", null);
        setBooleanField(term924, term924.getClass(), "primaryKey", false);
        setBooleanField(term924, term924.getClass(), "autoincrement", false);
        setBooleanField(term924, term924.getClass(), "unique", false);
        setField(term924, term924.getClass(), "type", null);
        setField(term924, term924.getClass(), "dataType", null);
        setField(term924, term924.getClass(), "constraints", null);
        setField(term924, term924.getClass(), "schema", null);
        term930 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term930;
        args[1] = null;
        callMethod(klass, "createPrimaryKeyColumn", argTypes, term924, args);
    }

};


