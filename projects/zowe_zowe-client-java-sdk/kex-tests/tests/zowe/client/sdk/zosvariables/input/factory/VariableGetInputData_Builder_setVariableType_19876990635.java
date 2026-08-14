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

public class VariableGetInputData_Builder_setVariableType_19876990635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4238;
     Object enum11;

    public VariableGetInputData_Builder_setVariableType_19876990635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4264 = new ArrayList();
        ((ArrayList) term4264).add("eqJfYWRaEL");
        ((ArrayList) term4264).add("fhkbdRViHi");
        ((ArrayList) term4264).add("uWHnvSvaPl");
        ((ArrayList) term4264).add("kBdSllIBVz");
        ((ArrayList) term4264).add("TJmVBGfTML");
        ((ArrayList) term4264).add("tPlsykYBqO");
        ((ArrayList) term4264).add("bLPjGVBhlX");
        Class<? extends Object> term4483 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term4482 = ((Class) term4483).getDeclaredField((String) "VARIABLE");
        ((Field) term4482).setAccessible(true);
        Object enum10 = ((Field) term4482).get((Object) null);
        term4238 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder"));
        setField(term4238, term4238.getClass(), "sysplexName", "dEnhdmILtU");
        setField(term4238, term4238.getClass(), "systemName", "hoicvmsovO");
        setBooleanField(term4238, term4238.getClass(), "local", true);
        setField(term4238, term4238.getClass(), "variableNames", term4264);
        setField(term4238, term4238.getClass(), "variableType", enum10);
        Class<? extends Object> term4744 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term4743 = ((Class) term4744).getDeclaredField((String) "SYMBOL");
        ((Field) term4743).setAccessible(true);
        enum11 = ((Field) term4743).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosvariables.type.VariableType");
        Object[] args = new Object[1];
        args[0] = enum11;
        callMethod(klass, "setVariableType", argTypes, term4238, args);
    }

};


