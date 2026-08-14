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

public class StartTsoInputData_setLogonProcedure_23523979311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1638;

    public StartTsoInputData_setLogonProcedure_23523979311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1638 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term1638, term1638.getClass(), "account", "HqBOwkVqjD");
        setField(term1638, term1638.getClass(), "characterSet", "MAcUBcBckh");
        setField(term1638, term1638.getClass(), "codePage", "oVgzLbrsFr");
        setField(term1638, term1638.getClass(), "columns", "vQVyKLdtaz");
        setField(term1638, term1638.getClass(), "logonProcedure", "OWKQODBLzb");
        setField(term1638, term1638.getClass(), "regionSize", "wGmYcqUkgE");
        setField(term1638, term1638.getClass(), "rows", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VgZnGoIFwQ";
        callMethod(klass, "setLogonProcedure", argTypes, term1638, args);
    }

};


