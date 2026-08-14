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

public class UssGetInputData_getSearch_17351998581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9623;

    public UssGetInputData_getSearch_17351998581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9649 = new Integer(1162663216);
        term9623 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term9623, term9623.getClass(), "search", "eqJfYWRaEL");
        setField(term9623, term9623.getClass(), "research", "fhkbdRViHi");
        setBooleanField(term9623, term9623.getClass(), "insensitive", true);
        setField(term9623, term9623.getClass(), "maxreturnsize", term9649);
        setIntField(term9623, term9623.getClass(), "queryCount", 1162663216);
        setBooleanField(term9623, term9623.getClass(), "binary", false);
        setField(term9623, term9623.getClass(), "recordsRange", "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSearch", argTypes, term9623, args);
    }

};


