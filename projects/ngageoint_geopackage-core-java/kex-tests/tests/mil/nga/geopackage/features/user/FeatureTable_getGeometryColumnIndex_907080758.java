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

public class FeatureTable_getGeometryColumnIndex_907080758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2566;

    public FeatureTable_getGeometryColumnIndex_907080758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2568 = new ArrayList();
        HashMap term2572 = new HashMap();
        term2566 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureTable"));
        Object term2567 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2566, term2566.getClass(), "columns", null);
        setField(term2567, term2567.getClass(), "constraints", term2568);
        setField(term2567, term2567.getClass(), "typedContraints", term2572);
        setField(term2566, term2566.getClass(), "constraints", term2567);
        setField(term2566, term2566.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryColumnIndex", argTypes, term2566, args);
    }

};


