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

public class ExtensionManager_deleteRelatedTables_192774185912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public ExtensionManager_deleteRelatedTables_192774185912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term206 = new ArrayList();
        ((ArrayList) term206).add((Object)null);
        ((ArrayList) term206).add((Object)null);
        ((ArrayList) term206).add((Object)null);
        ((ArrayList) term206).add((Object)null);
        ((ArrayList) term206).add((Object)null);
        ((ArrayList) term206).add((Object)null);
        term205 = newInstance(Class.forName("mil.nga.geopackage.extension.ExtensionManager"));
        setField(term205, term205.getClass(), "communityExtensions", term206);
        setField(term205, term205.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ExtensionManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        callMethod(klass, "deleteRelatedTables", argTypes, term205, args);
    }

};


