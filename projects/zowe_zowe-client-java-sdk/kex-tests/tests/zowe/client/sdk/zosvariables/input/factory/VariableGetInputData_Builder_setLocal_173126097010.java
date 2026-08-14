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
import java.lang.Boolean;

public class VariableGetInputData_Builder_setLocal_173126097010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5335;
     Object term5337;

    public VariableGetInputData_Builder_setLocal_173126097010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5335 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder"));
        setField(term5335, term5335.getClass(), "sysplexName", null);
        setField(term5335, term5335.getClass(), "systemName", null);
        setBooleanField(term5335, term5335.getClass(), "local", false);
        setField(term5335, term5335.getClass(), "variableNames", null);
        setField(term5335, term5335.getClass(), "variableType", null);
        term5337 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5337;
        callMethod(klass, "setLocal", argTypes, term5335, args);
    }

};


