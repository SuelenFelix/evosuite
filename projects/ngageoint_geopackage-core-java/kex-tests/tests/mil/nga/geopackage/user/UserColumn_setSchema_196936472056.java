package mil.nga.geopackage.user;

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
import static mil.nga.geopackage.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserColumn_setSchema_196936472056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1660;

    public UserColumn_setSchema_196936472056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1660 = newInstance(Class.forName("mil.nga.geopackage.extension.schema.columns.DataColumns"));
        setField(term1660, term1660.getClass(), "contents", null);
        setField(term1660, term1660.getClass(), "tableName", "RMFIsYGgne");
        setField(term1660, term1660.getClass(), "columnName", "NRdvgJlhkX");
        setField(term1660, term1660.getClass(), "name", "uuaPigETmJ");
        setField(term1660, term1660.getClass(), "title", "MxlszYVzRf");
        setField(term1660, term1660.getClass(), "description", "LQFpaHEwXR");
        setField(term1660, term1660.getClass(), "mimeType", "oVcInYnLWB");
        setField(term1660, term1660.getClass(), "constraintName", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.schema.columns.DataColumns");
        Object[] args = new Object[1];
        args[0] = term1660;
        callMethod(klass, "setSchema", argTypes, null, args);
    }

};


