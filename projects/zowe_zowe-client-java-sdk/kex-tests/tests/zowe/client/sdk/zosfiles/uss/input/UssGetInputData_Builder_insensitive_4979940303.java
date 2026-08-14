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
import java.lang.Boolean;

public class UssGetInputData_Builder_insensitive_4979940303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53982;
     Object term54024;

    public UssGetInputData_Builder_insensitive_4979940303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term54008 = new Integer(-1945706126);
        term53982 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder"));
        setField(term53982, term53982.getClass(), "search", "qphdrqUtNx");
        setField(term53982, term53982.getClass(), "research", "bwlLFAfNWx");
        setBooleanField(term53982, term53982.getClass(), "insensitive", true);
        setField(term53982, term53982.getClass(), "maxreturnsize", term54008);
        setIntField(term53982, term53982.getClass(), "queryCount", 597278769);
        setBooleanField(term53982, term53982.getClass(), "binary", false);
        setField(term53982, term53982.getClass(), "recordsRange", "JWodNQzjjV");
        term54024 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54024;
        callMethod(klass, "insensitive", argTypes, term53982, args);
    }

};


