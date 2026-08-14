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

public class VariableGetInputData_Builder_build_4656900386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4998;

    public VariableGetInputData_Builder_build_4656900386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5024 = new ArrayList();
        Class<? extends Object> term5071 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term5070 = ((Class) term5071).getDeclaredField((String) "VARIABLE");
        ((Field) term5070).setAccessible(true);
        Object enum12 = ((Field) term5070).get((Object) null);
        term4998 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder"));
        setField(term4998, term4998.getClass(), "sysplexName", "whBvTVIIlC");
        setField(term4998, term4998.getClass(), "systemName", "IgRJUzaCwW");
        setBooleanField(term4998, term4998.getClass(), "local", false);
        setField(term4998, term4998.getClass(), "variableNames", term5024);
        setField(term4998, term4998.getClass(), "variableType", enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4998, args);
    }

};


