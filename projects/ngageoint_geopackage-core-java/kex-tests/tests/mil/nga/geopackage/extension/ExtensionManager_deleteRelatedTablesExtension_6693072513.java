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

public class ExtensionManager_deleteRelatedTablesExtension_6693072513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232;

    public ExtensionManager_deleteRelatedTablesExtension_6693072513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term233 = new ArrayList();
        ((ArrayList) term233).add((Object)null);
        ((ArrayList) term233).add((Object)null);
        ((ArrayList) term233).add((Object)null);
        ((ArrayList) term233).add((Object)null);
        ((ArrayList) term233).add((Object)null);
        term232 = newInstance(Class.forName("mil.nga.geopackage.extension.ExtensionManager"));
        setField(term232, term232.getClass(), "communityExtensions", term233);
        setField(term232, term232.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ExtensionManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deleteRelatedTablesExtension", argTypes, term232, args);
    }

};


