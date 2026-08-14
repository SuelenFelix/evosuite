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

public class Extensions_getExtensionNameNoAuthor_148582378810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15871;

    public Extensions_getExtensionNameNoAuthor_148582378810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15871 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term15871, term15871.getClass(), "tableName", "ZKMLioamsY");
        setField(term15871, term15871.getClass(), "columnName", "WVbxuoDBcn");
        setField(term15871, term15871.getClass(), "extensionName", "pvDEABOxLt");
        setField(term15871, term15871.getClass(), "definition", "beAMpkroCQ");
        setField(term15871, term15871.getClass(), "scope", "uSUvKAyuvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtensionNameNoAuthor", argTypes, term15871, args);
    }

};


