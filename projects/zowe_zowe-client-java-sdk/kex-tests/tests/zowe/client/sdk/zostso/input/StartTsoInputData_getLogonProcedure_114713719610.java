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

public class StartTsoInputData_getLogonProcedure_114713719610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1483;

    public StartTsoInputData_getLogonProcedure_114713719610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1483 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term1483, term1483.getClass(), "account", "TJmVBGfTML");
        setField(term1483, term1483.getClass(), "characterSet", "tPlsykYBqO");
        setField(term1483, term1483.getClass(), "codePage", "bLPjGVBhlX");
        setField(term1483, term1483.getClass(), "columns", "whBvTVIIlC");
        setField(term1483, term1483.getClass(), "logonProcedure", "IgRJUzaCwW");
        setField(term1483, term1483.getClass(), "regionSize", "JUmudUmaaV");
        setField(term1483, term1483.getClass(), "rows", "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogonProcedure", argTypes, term1483, args);
    }

};


