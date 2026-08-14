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

public class KeyTarConfig_getUser_9091190173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public KeyTarConfig_getUser_9091190173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267 = newInstance(Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig"));
        setField(term267, term267.getClass(), "location", "MxlszYVzRf");
        setField(term267, term267.getClass(), "userName", "LQFpaHEwXR");
        setField(term267, term267.getClass(), "password", "oVcInYnLWB");
        setField(term267, term267.getClass(), "storeName", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term267, args);
    }

};


