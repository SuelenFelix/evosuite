package zowe.client.sdk.zostso.input;

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
import static zowe.client.sdk.zostso.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StartTsoInputData_toString_144995568116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2479;

    public StartTsoInputData_toString_144995568116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2479 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term2479, term2479.getClass(), "account", "OEXDRUKcFl");
        setField(term2479, term2479.getClass(), "characterSet", "RYdKCNNMBR");
        setField(term2479, term2479.getClass(), "codePage", "yGtHPyvYiQ");
        setField(term2479, term2479.getClass(), "columns", "MvRIxilFMJ");
        setField(term2479, term2479.getClass(), "logonProcedure", "iNwOJRBEjp");
        setField(term2479, term2479.getClass(), "regionSize", "XylxrMBraH");
        setField(term2479, term2479.getClass(), "rows", "pORebkoRdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2479, args);
    }

};


