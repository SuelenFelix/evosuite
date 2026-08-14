package zowe.client.sdk.zosmfinfo.methods;

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
import static zowe.client.sdk.zosmfinfo.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZosmfStatus_safeParsePlugin_20356760043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;

    public ZosmfStatus_safeParsePlugin_20356760043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.methods.ZosmfStatus"));
        setField(term4, term4.getClass(), "connection", null);
        setField(term4, term4.getClass(), "request", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.methods.ZosmfStatus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = null;
        callMethod(klass, "safeParsePlugin", argTypes, term4, args);
    }

};


