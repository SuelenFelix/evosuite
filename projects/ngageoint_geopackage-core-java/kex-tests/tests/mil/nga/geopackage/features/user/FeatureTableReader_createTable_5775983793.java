package mil.nga.geopackage.features.user;

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
import static mil.nga.geopackage.features.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class FeatureTableReader_createTable_5775983793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2213;
     Object term2250;

    public FeatureTableReader_createTable_5775983793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2213 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureTableReader"));
        setField(term2213, term2213.getClass(), "columnName", "jiKYgYHqIS");
        setField(term2213, term2213.getClass(), "tableName", "DfISiziTgG");
        term2250 = new LinkedList();
        ((LinkedList) term2250).add((Object)null);
        ((LinkedList) term2250).add((Object)null);
        ((LinkedList) term2250).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTableReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "XqgfKFvPSD";
        args[1] = term2250;
        callMethod(klass, "createTable", argTypes, term2213, args);
    }

};


