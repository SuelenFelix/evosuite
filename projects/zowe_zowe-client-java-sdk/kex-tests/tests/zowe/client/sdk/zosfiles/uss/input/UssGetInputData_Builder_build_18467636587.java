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

public class UssGetInputData_Builder_build_18467636587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54298;

    public UssGetInputData_Builder_build_18467636587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term54324 = new Integer(1102721075);
        term54298 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder"));
        setField(term54298, term54298.getClass(), "search", "YgQvdcBQKw");
        setField(term54298, term54298.getClass(), "research", "FiYYLuailz");
        setBooleanField(term54298, term54298.getClass(), "insensitive", true);
        setField(term54298, term54298.getClass(), "maxreturnsize", term54324);
        setIntField(term54298, term54298.getClass(), "queryCount", -655067527);
        setBooleanField(term54298, term54298.getClass(), "binary", true);
        setField(term54298, term54298.getClass(), "recordsRange", "XebAeSnCKZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term54298, args);
    }

};


