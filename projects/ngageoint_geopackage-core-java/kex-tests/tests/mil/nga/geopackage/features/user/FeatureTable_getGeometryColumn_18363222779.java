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

public class FeatureTable_getGeometryColumn_18363222779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2577;

    public FeatureTable_getGeometryColumn_18363222779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2579 = new ArrayList();
        HashMap term2583 = new HashMap();
        term2577 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureTable"));
        Object term2578 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2577, term2577.getClass(), "columns", null);
        setField(term2578, term2578.getClass(), "constraints", term2579);
        setField(term2578, term2578.getClass(), "typedContraints", term2583);
        setField(term2577, term2577.getClass(), "constraints", term2578);
        setField(term2577, term2577.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryColumn", argTypes, term2577, args);
    }

};


