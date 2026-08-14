package mil.nga.geopackage.extension;

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
import static mil.nga.geopackage.extension.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Extensions_getScope_48097852013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16226;

    public Extensions_getScope_48097852013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16226 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term16226, term16226.getClass(), "tableName", "pXdglvyrQe");
        setField(term16226, term16226.getClass(), "columnName", "OcfNzHYdki");
        setField(term16226, term16226.getClass(), "extensionName", "uPuCVuZYOI");
        setField(term16226, term16226.getClass(), "definition", "TweMFhxNdj");
        setField(term16226, term16226.getClass(), "scope", "NBrvVzvQHe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScope", argTypes, term16226, args);
    }

};


