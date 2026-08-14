package mil.nga.geopackage.extension;

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
import static mil.nga.geopackage.extension.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ExtensionManager_2_init_2684914710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24035;

    public ExtensionManager_2_init_2684914710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24036 = new ArrayList();
        ((ArrayList) term24036).add((Object)null);
        term24035 = newInstance(Class.forName("mil.nga.geopackage.extension.ExtensionManager"));
        setField(term24035, term24035.getClass(), "communityExtensions", term24036);
        setField(term24035, term24035.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ExtensionManager$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.ExtensionManager");
        argTypes[1] = Class.forName("mil.nga.geopackage.GeoPackageCore");
        Object[] args = new Object[2];
        args[0] = term24035;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


