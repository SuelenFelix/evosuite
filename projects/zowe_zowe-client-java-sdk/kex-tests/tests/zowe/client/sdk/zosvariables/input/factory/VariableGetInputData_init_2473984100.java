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

public class VariableGetInputData_init_2473984100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public VariableGetInputData_init_2473984100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27 = new ArrayList();
        ((ArrayList) term27).add("MuLcgQHgqz");
        ((ArrayList) term27).add("xxtlPwDYFs");
        ((ArrayList) term27).add("jJCZpVmanW");
        ((ArrayList) term27).add("EGtDIRbSSb");
        ((ArrayList) term27).add("SzjVpOQTyS");
        Class<? extends Object> term224 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term223 = ((Class) term224).getDeclaredField((String) "VARIABLE");
        ((Field) term223).setAccessible(true);
        Object enum0 = ((Field) term223).get((Object) null);
        term1 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder"));
        setField(term1, term1.getClass(), "sysplexName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "systemName", "sjlJAEtRrb");
        setBooleanField(term1, term1.getClass(), "local", false);
        setField(term1, term1.getClass(), "variableNames", term27);
        setField(term1, term1.getClass(), "variableType", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


