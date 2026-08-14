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

public class VariableGetInputData_Builder_build_46569003813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5343;

    public VariableGetInputData_Builder_build_46569003813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5343 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder"));
        setField(term5343, term5343.getClass(), "sysplexName", null);
        setField(term5343, term5343.getClass(), "systemName", null);
        setBooleanField(term5343, term5343.getClass(), "local", false);
        setField(term5343, term5343.getClass(), "variableNames", null);
        setField(term5343, term5343.getClass(), "variableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term5343, args);
    }

};


