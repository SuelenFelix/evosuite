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

public class UssGetInputData_toString_15352064058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10127;

    public UssGetInputData_toString_15352064058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10153 = new Integer(1227103734);
        term10127 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term10127, term10127.getClass(), "search", "cAPeiZHKGJ");
        setField(term10127, term10127.getClass(), "research", "LvJFtLBaxj");
        setBooleanField(term10127, term10127.getClass(), "insensitive", true);
        setField(term10127, term10127.getClass(), "maxreturnsize", term10153);
        setIntField(term10127, term10127.getClass(), "queryCount", 1227103734);
        setBooleanField(term10127, term10127.getClass(), "binary", false);
        setField(term10127, term10127.getClass(), "recordsRange", "PHvxnGHptP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10127, args);
    }

};


