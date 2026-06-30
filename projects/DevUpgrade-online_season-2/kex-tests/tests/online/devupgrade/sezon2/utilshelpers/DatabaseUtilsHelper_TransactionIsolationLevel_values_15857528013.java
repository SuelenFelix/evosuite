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

public class DatabaseUtilsHelper_TransactionIsolationLevel_values_15857528013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public DatabaseUtilsHelper_TransactionIsolationLevel_values_15857528013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term985 = Class.forName((String) "online.devupgrade.sezon2.utilshelpers.DatabaseUtilsHelper$TransactionIsolationLevel");
        Field term984 = ((Class) term985).getDeclaredField((String) "DWA");
        ((Field) term984).setAccessible(true);
        enum2 = ((Field) term984).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.utilshelpers.DatabaseUtilsHelper$TransactionIsolationLevel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum2, args);
    }

};


