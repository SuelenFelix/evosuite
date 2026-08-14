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

public class UssGetInputData_Builder_maxreturnsize_142916500212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54384;
     Object term54388;

    public UssGetInputData_Builder_maxreturnsize_142916500212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54384 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder"));
        setField(term54384, term54384.getClass(), "search", null);
        setField(term54384, term54384.getClass(), "research", null);
        setBooleanField(term54384, term54384.getClass(), "insensitive", false);
        setField(term54384, term54384.getClass(), "maxreturnsize", null);
        setIntField(term54384, term54384.getClass(), "queryCount", 0);
        setBooleanField(term54384, term54384.getClass(), "binary", false);
        setField(term54384, term54384.getClass(), "recordsRange", null);
        term54388 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54388;
        callMethod(klass, "maxreturnsize", argTypes, term54384, args);
    }

};


