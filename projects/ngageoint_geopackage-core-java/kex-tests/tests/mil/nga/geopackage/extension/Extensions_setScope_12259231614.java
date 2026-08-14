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
import java.lang.String;
import java.lang.Object;

public class Extensions_setScope_12259231614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16337;
     Object enum27;

    public Extensions_setScope_12259231614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16337 = newInstance(Class.forName("mil.nga.geopackage.extension.Extensions"));
        setField(term16337, term16337.getClass(), "tableName", "FjOiNAfBOc");
        setField(term16337, term16337.getClass(), "columnName", "iCCsaLHohG");
        setField(term16337, term16337.getClass(), "extensionName", "NJhGgctbdj");
        setField(term16337, term16337.getClass(), "definition", "MYWYUeLGOp");
        setField(term16337, term16337.getClass(), "scope", "tsTGdgQYUL");
        Class<? extends Object> term16527 = Class.forName((String) "mil.nga.geopackage.extension.ExtensionScopeType");
        Field term16526 = ((Class) term16527).getDeclaredField((String) "READ_WRITE");
        ((Field) term16526).setAccessible(true);
        enum27 = ((Field) term16526).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.Extensions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.ExtensionScopeType");
        Object[] args = new Object[1];
        args[0] = enum27;
        callMethod(klass, "setScope", argTypes, term16337, args);
    }

};


