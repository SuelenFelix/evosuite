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

public class ExtensionManager_copySchema_205623533721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;

    public ExtensionManager_copySchema_205623533721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term405 = new ArrayList();
        ((ArrayList) term405).add((Object)null);
        ((ArrayList) term405).add((Object)null);
        ((ArrayList) term405).add((Object)null);
        ((ArrayList) term405).add((Object)null);
        ((ArrayList) term405).add((Object)null);
        ((ArrayList) term405).add((Object)null);
        term404 = newInstance(Class.forName("mil.nga.geopackage.extension.ExtensionManager"));
        setField(term404, term404.getClass(), "communityExtensions", term405);
        setField(term404, term404.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ExtensionManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "oVcInYnLWB";
        args[1] = "aJlieCFVtF";
        callMethod(klass, "copySchema", argTypes, term404, args);
    }

};


