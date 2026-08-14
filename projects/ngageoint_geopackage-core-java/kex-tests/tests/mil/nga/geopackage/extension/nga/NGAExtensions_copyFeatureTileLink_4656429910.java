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

public class NGAExtensions_copyFeatureTileLink_4656429910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3499;

    public NGAExtensions_copyFeatureTileLink_4656429910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3499 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.NGAExtensions"));
        setField(term3499, term3499.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.NGAExtensions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "TimdotUuNC";
        args[1] = "PkWMRdJcBb";
        callMethod(klass, "copyFeatureTileLink", argTypes, term3499, args);
    }

};


