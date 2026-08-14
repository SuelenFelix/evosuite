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

public class Extensions_getColumnName_4646200614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15117;

    public Extensions_getColumnName_4646200614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15117 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term15117, term15117.getClass(), "tableName", "AHbZyFOmlo");
        setField(term15117, term15117.getClass(), "columnName", "TwfWVQGiIj");
        setField(term15117, term15117.getClass(), "extensionName", "gUvcueTURF");
        setField(term15117, term15117.getClass(), "definition", "EwQBhZjCIT");
        setField(term15117, term15117.getClass(), "scope", "aSkmSwTnEw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumnName", argTypes, term15117, args);
    }

};


