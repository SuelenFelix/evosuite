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

public class KeyTarConfig_getUserName_63556985411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626;

    public KeyTarConfig_getUserName_63556985411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626 = newInstance(Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig"));
        setField(term626, term626.getClass(), "location", null);
        setField(term626, term626.getClass(), "userName", null);
        setField(term626, term626.getClass(), "password", null);
        setField(term626, term626.getClass(), "storeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term626, args);
    }

};


