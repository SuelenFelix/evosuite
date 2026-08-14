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

public class VariableGetInputData_isLocal_18618147653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1304;

    public VariableGetInputData_isLocal_18618147653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1330 = new ArrayList();
        ((ArrayList) term1330).add("hNxWaHcfhY");
        ((ArrayList) term1330).add("RkybSrpybU");
        ((ArrayList) term1330).add("xOEqzGAmDU");
        ((ArrayList) term1330).add("eZFUvlxvGV");
        Class<? extends Object> term1465 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term1464 = ((Class) term1465).getDeclaredField((String) "VARIABLE");
        ((Field) term1464).setAccessible(true);
        Object enum3 = ((Field) term1464).get((Object) null);
        term1304 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData"));
        setField(term1304, term1304.getClass(), "sysplexName", "HyxfbSQYBe");
        setField(term1304, term1304.getClass(), "systemName", "pCTimMblYc");
        setBooleanField(term1304, term1304.getClass(), "local", false);
        setField(term1304, term1304.getClass(), "variableNames", term1330);
        setField(term1304, term1304.getClass(), "variableType", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLocal", argTypes, term1304, args);
    }

};


