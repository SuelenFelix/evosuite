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

public class VariableGetInputData_Builder_setSysplexName_13903962891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2535;

    public VariableGetInputData_Builder_setSysplexName_13903962891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2561 = new ArrayList();
        ((ArrayList) term2561).add("IDCWpPLRkE");
        ((ArrayList) term2561).add("nyiiPDVjAc");
        Class<? extends Object> term2660 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term2659 = ((Class) term2660).getDeclaredField((String) "SYMBOL");
        ((Field) term2659).setAccessible(true);
        Object enum6 = ((Field) term2659).get((Object) null);
        term2535 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder"));
        setField(term2535, term2535.getClass(), "sysplexName", "Ghbwtircqb");
        setField(term2535, term2535.getClass(), "systemName", "xrwlQZdwCp");
        setBooleanField(term2535, term2535.getClass(), "local", true);
        setField(term2535, term2535.getClass(), "variableNames", term2561);
        setField(term2535, term2535.getClass(), "variableType", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aKnKipADSo";
        callMethod(klass, "setSysplexName", argTypes, term2535, args);
    }

};


