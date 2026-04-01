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
import java.lang.String;
import java.lang.Object;

public class DatabaseUtilsHelper_save_18605003192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499;
     Object enum1;

    public DatabaseUtilsHelper_save_18605003192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term499 = newInstance(Class.forName("online.devupgrade.sezon2.dto.ProductCommand"));
        Class<? extends Object> term519 = Class.forName((String) "online.devupgrade.sezon2.utilshelpers.DatabaseUtilsHelper$TransactionIsolationLevel");
        Field term518 = ((Class) term519).getDeclaredField((String) "TRZY");
        ((Field) term518).setAccessible(true);
        enum1 = ((Field) term518).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.utilshelpers.DatabaseUtilsHelper");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("online.devupgrade.sezon2.dto.ProductCommand");
        argTypes[2] = Class.forName("online.devupgrade.sezon2.utilshelpers.DatabaseUtilsHelper$TransactionIsolationLevel");
        Object[] args = new Object[3];
        args[0] = "sjlJAEtRrb";
        args[1] = term499;
        args[2] = enum1;
        callMethod(klass, "save", argTypes, null, args);
    }

};


