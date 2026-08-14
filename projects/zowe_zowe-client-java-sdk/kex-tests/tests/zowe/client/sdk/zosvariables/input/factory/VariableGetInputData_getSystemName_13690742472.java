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

public class VariableGetInputData_getSystemName_13690742472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905;

    public VariableGetInputData_getSystemName_13690742472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term931 = new ArrayList();
        ((ArrayList) term931).add("aJlieCFVtF");
        ((ArrayList) term931).add("ZiaGIbnzTs");
        ((ArrayList) term931).add("tbcdzjIfER");
        Class<? extends Object> term1044 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term1043 = ((Class) term1044).getDeclaredField((String) "VARIABLE");
        ((Field) term1043).setAccessible(true);
        Object enum2 = ((Field) term1043).get((Object) null);
        term905 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData"));
        setField(term905, term905.getClass(), "sysplexName", "LQFpaHEwXR");
        setField(term905, term905.getClass(), "systemName", "oVcInYnLWB");
        setBooleanField(term905, term905.getClass(), "local", false);
        setField(term905, term905.getClass(), "variableNames", term931);
        setField(term905, term905.getClass(), "variableType", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystemName", argTypes, term905, args);
    }

};


