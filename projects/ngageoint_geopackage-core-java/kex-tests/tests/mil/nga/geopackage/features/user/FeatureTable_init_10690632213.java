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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class FeatureTable_init_10690632213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2506;

    public FeatureTable_init_10690632213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2508 = new ArrayList();
        HashMap term2512 = new HashMap();
        term2506 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureTable"));
        Object term2507 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2506, term2506.getClass(), "columns", null);
        setField(term2507, term2507.getClass(), "constraints", term2508);
        setField(term2507, term2507.getClass(), "typedContraints", term2512);
        setField(term2506, term2506.getClass(), "constraints", term2507);
        setField(term2506, term2506.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Object[] args = new Object[1];
        args[0] = term2506;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


