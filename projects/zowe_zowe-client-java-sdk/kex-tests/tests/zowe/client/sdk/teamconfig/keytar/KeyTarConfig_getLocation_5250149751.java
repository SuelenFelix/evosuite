package zowe.client.sdk.teamconfig.keytar;

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
import static zowe.client.sdk.teamconfig.keytar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KeyTarConfig_getLocation_5250149751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;

    public KeyTarConfig_getLocation_5250149751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89 = newInstance(Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig"));
        setField(term89, term89.getClass(), "location", "jJCZpVmanW");
        setField(term89, term89.getClass(), "userName", "EGtDIRbSSb");
        setField(term89, term89.getClass(), "password", "SzjVpOQTyS");
        setField(term89, term89.getClass(), "storeName", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term89, args);
    }

};


