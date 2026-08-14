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

public class Extensions_getAuthor_20311329099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15760;

    public Extensions_getAuthor_20311329099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15760 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term15760, term15760.getClass(), "tableName", "doQLHkjpNm");
        setField(term15760, term15760.getClass(), "columnName", "lCyLIcSuom");
        setField(term15760, term15760.getClass(), "extensionName", "CGOpQSZZwI");
        setField(term15760, term15760.getClass(), "definition", "ypEdrstygY");
        setField(term15760, term15760.getClass(), "scope", "sNQFlATEeQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthor", argTypes, term15760, args);
    }

};


