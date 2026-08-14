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

public class KeyTarConfig_getPassword_7746432892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;

    public KeyTarConfig_getPassword_7746432892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178 = newInstance(Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig"));
        setField(term178, term178.getClass(), "location", "hRNSzYYIrc");
        setField(term178, term178.getClass(), "userName", "RMFIsYGgne");
        setField(term178, term178.getClass(), "password", "NRdvgJlhkX");
        setField(term178, term178.getClass(), "storeName", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term178, args);
    }

};


