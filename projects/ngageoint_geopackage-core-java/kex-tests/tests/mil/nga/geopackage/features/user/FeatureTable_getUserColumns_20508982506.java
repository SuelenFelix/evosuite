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

public class FeatureTable_getUserColumns_20508982506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2539;

    public FeatureTable_getUserColumns_20508982506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2541 = new ArrayList();
        HashMap term2545 = new HashMap();
        term2539 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureTable"));
        Object term2540 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2539, term2539.getClass(), "columns", null);
        setField(term2540, term2540.getClass(), "constraints", term2541);
        setField(term2540, term2540.getClass(), "typedContraints", term2545);
        setField(term2539, term2539.getClass(), "constraints", term2540);
        setField(term2539, term2539.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserColumns", argTypes, term2539, args);
    }

};


