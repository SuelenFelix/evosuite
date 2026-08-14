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
import java.lang.Boolean;

public class VariableGetInputData_Builder_setLocal_17312609703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3401;
     Object term3537;

    public VariableGetInputData_Builder_setLocal_17312609703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3427 = new ArrayList();
        ((ArrayList) term3427).add("UiUYnPrcCi");
        ((ArrayList) term3427).add("UoYtihxVaS");
        ((ArrayList) term3427).add("JDswTTCZHV");
        ((ArrayList) term3427).add("onpbIeEKoi");
        ((ArrayList) term3427).add("YRHGsAkhxb");
        ((ArrayList) term3427).add("ffYhPOzlUs");
        ((ArrayList) term3427).add("MLqYREekMl");
        Class<? extends Object> term3630 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term3629 = ((Class) term3630).getDeclaredField((String) "VARIABLE");
        ((Field) term3629).setAccessible(true);
        Object enum8 = ((Field) term3629).get((Object) null);
        term3401 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder"));
        setField(term3401, term3401.getClass(), "sysplexName", "jDtqGUpnZN");
        setField(term3401, term3401.getClass(), "systemName", "nGKItKLYNC");
        setBooleanField(term3401, term3401.getClass(), "local", false);
        setField(term3401, term3401.getClass(), "variableNames", term3427);
        setField(term3401, term3401.getClass(), "variableType", enum8);
        term3537 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3537;
        callMethod(klass, "setLocal", argTypes, term3401, args);
    }

};


