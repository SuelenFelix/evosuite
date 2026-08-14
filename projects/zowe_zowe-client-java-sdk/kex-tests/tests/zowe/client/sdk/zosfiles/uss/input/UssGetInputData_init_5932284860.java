package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UssGetInputData_init_5932284860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9551;

    public UssGetInputData_init_5932284860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9577 = new Integer(568599855);
        term9551 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder"));
        setField(term9551, term9551.getClass(), "search", "ieCtQFdkii");
        setField(term9551, term9551.getClass(), "research", "dEnhdmILtU");
        setBooleanField(term9551, term9551.getClass(), "insensitive", true);
        setField(term9551, term9551.getClass(), "maxreturnsize", term9577);
        setIntField(term9551, term9551.getClass(), "queryCount", 568599855);
        setBooleanField(term9551, term9551.getClass(), "binary", true);
        setField(term9551, term9551.getClass(), "recordsRange", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term9551;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


