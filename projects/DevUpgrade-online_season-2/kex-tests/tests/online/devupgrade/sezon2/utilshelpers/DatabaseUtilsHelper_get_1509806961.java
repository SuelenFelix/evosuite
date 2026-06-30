package online.devupgrade.sezon2.utilshelpers;

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
import static online.devupgrade.sezon2.utilshelpers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class DatabaseUtilsHelper_get_1509806961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object enum0;

    public DatabaseUtilsHelper_get_1509806961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Integer(568599855);
        Class<? extends Object> term57 = Class.forName((String) "online.devupgrade.sezon2.utilshelpers.DatabaseUtilsHelper$TransactionIsolationLevel");
        Field term56 = ((Class) term57).getDeclaredField((String) "DWA");
        ((Field) term56).setAccessible(true);
        enum0 = ((Field) term56).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.utilshelpers.DatabaseUtilsHelper");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("online.devupgrade.sezon2.utilshelpers.DatabaseUtilsHelper$TransactionIsolationLevel");
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        args[2] = enum0;
        callMethod(klass, "get", argTypes, null, args);
    }

};


