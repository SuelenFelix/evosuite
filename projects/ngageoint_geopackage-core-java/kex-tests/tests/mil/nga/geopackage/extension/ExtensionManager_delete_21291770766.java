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

public class ExtensionManager_delete_21291770766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;

    public ExtensionManager_delete_21291770766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term115 = new ArrayList();
        ((ArrayList) term115).add((Object)null);
        ((ArrayList) term115).add((Object)null);
        ((ArrayList) term115).add((Object)null);
        ((ArrayList) term115).add((Object)null);
        ((ArrayList) term115).add((Object)null);
        ((ArrayList) term115).add((Object)null);
        term114 = newInstance(Class.forName("mil.nga.geopackage.extension.ExtensionManager"));
        setField(term114, term114.getClass(), "communityExtensions", term115);
        setField(term114, term114.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ExtensionManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "delete", argTypes, term114, args);
    }

};


