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

public class FeatureTable_copy_3575259964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2517;

    public FeatureTable_copy_3575259964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2519 = new ArrayList();
        HashMap term2523 = new HashMap();
        term2517 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureTable"));
        Object term2518 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2517, term2517.getClass(), "columns", null);
        setField(term2518, term2518.getClass(), "constraints", term2519);
        setField(term2518, term2518.getClass(), "typedContraints", term2523);
        setField(term2517, term2517.getClass(), "constraints", term2518);
        setField(term2517, term2517.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term2517, args);
    }

};


