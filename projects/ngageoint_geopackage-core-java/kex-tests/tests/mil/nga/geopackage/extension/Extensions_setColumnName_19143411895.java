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

public class Extensions_setColumnName_19143411895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15228;

    public Extensions_setColumnName_19143411895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15228 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term15228, term15228.getClass(), "tableName", "xvkbvaEGYd");
        setField(term15228, term15228.getClass(), "columnName", "HBGNxdNURv");
        setField(term15228, term15228.getClass(), "extensionName", "mfCpTPPQQm");
        setField(term15228, term15228.getClass(), "definition", "OcJCIDNIXA");
        setField(term15228, term15228.getClass(), "scope", "XfRABIFVEp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MHGKyEnwKc";
        callMethod(klass, "setColumnName", argTypes, term15228, args);
    }

};


