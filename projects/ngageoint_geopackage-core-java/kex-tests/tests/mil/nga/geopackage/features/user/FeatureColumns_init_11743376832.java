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

public class FeatureColumns_init_11743376832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108;

    public FeatureColumns_init_11743376832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term183 = new ArrayList();
        HashMap term188 = new HashMap();
        term108 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        Object[] term134 = (Object[]) newArray("java.lang.String", 4);
        setField(term108, term108.getClass(), "geometryColumn", "jJCZpVmanW");
        setIntField(term108, term108.getClass(), "geometryIndex", 568599855);
        setField(term108, term108.getClass(), "tableName", "EGtDIRbSSb");
        setElement(term134, 0, "SzjVpOQTyS");
        setElement(term134, 1, "MjGYSRKTNF");
        setElement(term134, 2, "hRNSzYYIrc");
        setElement(term134, 3, "RMFIsYGgne");
        setField(term108, term108.getClass(), "columnNames", term134);
        setField(term108, term108.getClass(), "columns", term183);
        setBooleanField(term108, term108.getClass(), "custom", false);
        setField(term108, term108.getClass(), "nameToIndex", term188);
        setIntField(term108, term108.getClass(), "pkIndex", 1162663216);
        setBooleanField(term108, term108.getClass(), "pkModifiable", false);
        setBooleanField(term108, term108.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Object[] args = new Object[1];
        args[0] = term108;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


