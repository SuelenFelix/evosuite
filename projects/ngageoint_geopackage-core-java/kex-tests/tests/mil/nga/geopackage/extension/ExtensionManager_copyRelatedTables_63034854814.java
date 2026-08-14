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

public class ExtensionManager_copyRelatedTables_63034854814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public ExtensionManager_copyRelatedTables_63034854814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term238 = new ArrayList();
        ((ArrayList) term238).add((Object)null);
        ((ArrayList) term238).add((Object)null);
        ((ArrayList) term238).add((Object)null);
        ((ArrayList) term238).add((Object)null);
        ((ArrayList) term238).add((Object)null);
        term237 = newInstance(Class.forName("mil.nga.geopackage.extension.ExtensionManager"));
        setField(term237, term237.getClass(), "communityExtensions", term238);
        setField(term237, term237.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ExtensionManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "hRNSzYYIrc";
        args[1] = "RMFIsYGgne";
        callMethod(klass, "copyRelatedTables", argTypes, term237, args);
    }

};


