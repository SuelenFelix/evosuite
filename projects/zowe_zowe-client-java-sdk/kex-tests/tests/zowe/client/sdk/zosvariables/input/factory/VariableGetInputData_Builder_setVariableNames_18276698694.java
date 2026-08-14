package zowe.client.sdk.zosvariables.input.factory;

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
import static zowe.client.sdk.zosvariables.input.factory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class VariableGetInputData_Builder_setVariableNames_18276698694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3890;
     Object term3950;

    public VariableGetInputData_Builder_setVariableNames_18276698694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3916 = new ArrayList();
        ((ArrayList) term3916).add("ieCtQFdkii");
        Class<? extends Object> term3984 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term3983 = ((Class) term3984).getDeclaredField((String) "SYMBOL");
        ((Field) term3983).setAccessible(true);
        Object enum9 = ((Field) term3983).get((Object) null);
        term3890 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder"));
        setField(term3890, term3890.getClass(), "sysplexName", "ytSBIKXogI");
        setField(term3890, term3890.getClass(), "systemName", "nHXjMycHlU");
        setBooleanField(term3890, term3890.getClass(), "local", false);
        setField(term3890, term3890.getClass(), "variableNames", term3916);
        setField(term3890, term3890.getClass(), "variableType", enum9);
        term3950 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3950;
        callMethod(klass, "setVariableNames", argTypes, term3890, args);
    }

};


