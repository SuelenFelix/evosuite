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

public class UserCustomColumn_createColumn_191091982714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;

    public UserCustomColumn_createColumn_191091982714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn"));
        setIntField(term681, term681.getClass(), "index", 0);
        setField(term681, term681.getClass(), "name", null);
        setField(term681, term681.getClass(), "max", null);
        setBooleanField(term681, term681.getClass(), "notNull", false);
        setField(term681, term681.getClass(), "defaultValue", null);
        setBooleanField(term681, term681.getClass(), "primaryKey", false);
        setBooleanField(term681, term681.getClass(), "autoincrement", false);
        setBooleanField(term681, term681.getClass(), "unique", false);
        setField(term681, term681.getClass(), "type", null);
        setField(term681, term681.getClass(), "dataType", null);
        setField(term681, term681.getClass(), "constraints", null);
        setField(term681, term681.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.TableColumn");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createColumn", argTypes, term681, args);
    }

};


