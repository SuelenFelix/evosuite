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

public class UssGetInputData_getRecordsRange_67743497116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10223;

    public UssGetInputData_getRecordsRange_67743497116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10223 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term10223, term10223.getClass(), "search", null);
        setField(term10223, term10223.getClass(), "research", null);
        setBooleanField(term10223, term10223.getClass(), "insensitive", false);
        setField(term10223, term10223.getClass(), "maxreturnsize", null);
        setIntField(term10223, term10223.getClass(), "queryCount", 0);
        setBooleanField(term10223, term10223.getClass(), "binary", false);
        setField(term10223, term10223.getClass(), "recordsRange", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecordsRange", argTypes, term10223, args);
    }

};


