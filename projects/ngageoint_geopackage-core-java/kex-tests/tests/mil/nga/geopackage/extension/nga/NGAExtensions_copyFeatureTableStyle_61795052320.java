package mil.nga.geopackage.extension.nga;

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
import static mil.nga.geopackage.extension.nga.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class NGAExtensions_copyFeatureTableStyle_61795052320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3707;
     Object term3744;
     Object term3746;

    public NGAExtensions_copyFeatureTableStyle_61795052320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3707 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.NGAExtensions"));
        setField(term3707, term3707.getClass(), "geoPackage", null);
        term3744 = new Long(-8257434502486459194L);
        term3746 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.NGAExtensions");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.nga.style.FeatureCoreStyleExtension");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = long.class;
        argTypes[5] = long.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = "XqgfKFvPSD";
        args[2] = "JiVRgTZvKc";
        args[3] = "XPKmummaqg";
        args[4] = term3744;
        args[5] = term3746;
        callMethod(klass, "copyFeatureTableStyle", argTypes, term3707, args);
    }

};


