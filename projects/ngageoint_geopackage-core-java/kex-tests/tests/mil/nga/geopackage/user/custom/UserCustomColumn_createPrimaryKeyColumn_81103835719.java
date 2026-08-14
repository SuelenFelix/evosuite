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

public class UserCustomColumn_createPrimaryKeyColumn_81103835719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910;

    public UserCustomColumn_createPrimaryKeyColumn_81103835719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term910 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn"));
        setIntField(term910, term910.getClass(), "index", 0);
        setField(term910, term910.getClass(), "name", null);
        setField(term910, term910.getClass(), "max", null);
        setBooleanField(term910, term910.getClass(), "notNull", false);
        setField(term910, term910.getClass(), "defaultValue", null);
        setBooleanField(term910, term910.getClass(), "primaryKey", false);
        setBooleanField(term910, term910.getClass(), "autoincrement", false);
        setBooleanField(term910, term910.getClass(), "unique", false);
        setField(term910, term910.getClass(), "type", null);
        setField(term910, term910.getClass(), "dataType", null);
        setField(term910, term910.getClass(), "constraints", null);
        setField(term910, term910.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createPrimaryKeyColumn", argTypes, term910, args);
    }

};


