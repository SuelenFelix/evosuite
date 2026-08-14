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

public class FeatureTable_getIdAndGeometryColumnNames_967571211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2599;

    public FeatureTable_getIdAndGeometryColumnNames_967571211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2601 = new ArrayList();
        HashMap term2605 = new HashMap();
        term2599 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureTable"));
        Object term2600 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2599, term2599.getClass(), "columns", null);
        setField(term2600, term2600.getClass(), "constraints", term2601);
        setField(term2600, term2600.getClass(), "typedContraints", term2605);
        setField(term2599, term2599.getClass(), "constraints", term2600);
        setField(term2599, term2599.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdAndGeometryColumnNames", argTypes, term2599, args);
    }

};


