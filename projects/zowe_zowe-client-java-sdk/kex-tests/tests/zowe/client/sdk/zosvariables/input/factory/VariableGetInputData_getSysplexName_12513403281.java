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

public class VariableGetInputData_getSysplexName_12513403281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484;

    public VariableGetInputData_getSysplexName_12513403281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term510 = new ArrayList();
        ((ArrayList) term510).add("RMFIsYGgne");
        ((ArrayList) term510).add("NRdvgJlhkX");
        ((ArrayList) term510).add("uuaPigETmJ");
        ((ArrayList) term510).add("MxlszYVzRf");
        Class<? extends Object> term645 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term644 = ((Class) term645).getDeclaredField((String) "VARIABLE");
        ((Field) term644).setAccessible(true);
        Object enum1 = ((Field) term644).get((Object) null);
        term484 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData"));
        setField(term484, term484.getClass(), "sysplexName", "MjGYSRKTNF");
        setField(term484, term484.getClass(), "systemName", "hRNSzYYIrc");
        setBooleanField(term484, term484.getClass(), "local", false);
        setField(term484, term484.getClass(), "variableNames", term510);
        setField(term484, term484.getClass(), "variableType", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSysplexName", argTypes, term484, args);
    }

};


