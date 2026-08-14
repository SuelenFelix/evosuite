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

public class FeatureTable_validateContents_21991074012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2610;

    public FeatureTable_validateContents_21991074012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2612 = new ArrayList();
        HashMap term2616 = new HashMap();
        term2610 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureTable"));
        Object term2611 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2610, term2610.getClass(), "columns", null);
        setField(term2611, term2611.getClass(), "constraints", term2612);
        setField(term2611, term2611.getClass(), "typedContraints", term2616);
        setField(term2610, term2610.getClass(), "constraints", term2611);
        setField(term2610, term2610.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.contents.Contents");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "validateContents", argTypes, term2610, args);
    }

};


