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

public class Extensions_getDefinition_24846123711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15982;

    public Extensions_getDefinition_24846123711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15982 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term15982, term15982.getClass(), "tableName", "onQLVONGuf");
        setField(term15982, term15982.getClass(), "columnName", "SOrEHbcbmn");
        setField(term15982, term15982.getClass(), "extensionName", "bnsyeQXFdu");
        setField(term15982, term15982.getClass(), "definition", "BwtdjiefJn");
        setField(term15982, term15982.getClass(), "scope", "jDmhBrIoDa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefinition", argTypes, term15982, args);
    }

};


