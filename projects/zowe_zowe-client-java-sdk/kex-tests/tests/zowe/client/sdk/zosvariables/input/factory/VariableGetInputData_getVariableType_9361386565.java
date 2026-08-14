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

public class VariableGetInputData_getVariableType_9361386565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2070;

    public VariableGetInputData_getVariableType_9361386565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2096 = new ArrayList();
        ((ArrayList) term2096).add("TEParAifyi");
        ((ArrayList) term2096).add("OWDIEULEFu");
        ((ArrayList) term2096).add("dWRymuLBtr");
        ((ArrayList) term2096).add("AijpHYOFuy");
        ((ArrayList) term2096).add("SbAoxhfrkn");
        ((ArrayList) term2096).add("kuTXqwMtDB");
        Class<? extends Object> term2271 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term2270 = ((Class) term2271).getDeclaredField((String) "SYMBOL");
        ((Field) term2270).setAccessible(true);
        Object enum5 = ((Field) term2270).get((Object) null);
        term2070 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData"));
        setField(term2070, term2070.getClass(), "sysplexName", "OclPbYPkcH");
        setField(term2070, term2070.getClass(), "systemName", "IoAlmYsBwc");
        setBooleanField(term2070, term2070.getClass(), "local", true);
        setField(term2070, term2070.getClass(), "variableNames", term2096);
        setField(term2070, term2070.getClass(), "variableType", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariableType", argTypes, term2070, args);
    }

};


