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
import java.util.LinkedList;

public class FeatureTable_createUserColumns_7680178647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2550;
     Object term2561;

    public FeatureTable_createUserColumns_7680178647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2552 = new ArrayList();
        HashMap term2556 = new HashMap();
        term2550 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureTable"));
        Object term2551 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2550, term2550.getClass(), "columns", null);
        setField(term2551, term2551.getClass(), "constraints", term2552);
        setField(term2551, term2551.getClass(), "typedContraints", term2556);
        setField(term2550, term2550.getClass(), "constraints", term2551);
        setField(term2550, term2550.getClass(), "contents", null);
        term2561 = new LinkedList();
        ((LinkedList) term2561).add((Object)null);
        ((LinkedList) term2561).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2561;
        callMethod(klass, "createUserColumns", argTypes, term2550, args);
    }

};


