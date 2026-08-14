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
import java.lang.Boolean;

public class UssGetInputData_Builder_binary_69641529413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54390;
     Object term54394;

    public UssGetInputData_Builder_binary_69641529413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54390 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder"));
        setField(term54390, term54390.getClass(), "search", null);
        setField(term54390, term54390.getClass(), "research", null);
        setBooleanField(term54390, term54390.getClass(), "insensitive", false);
        setField(term54390, term54390.getClass(), "maxreturnsize", null);
        setIntField(term54390, term54390.getClass(), "queryCount", 0);
        setBooleanField(term54390, term54390.getClass(), "binary", false);
        setField(term54390, term54390.getClass(), "recordsRange", null);
        term54394 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54394;
        callMethod(klass, "binary", argTypes, term54390, args);
    }

};


