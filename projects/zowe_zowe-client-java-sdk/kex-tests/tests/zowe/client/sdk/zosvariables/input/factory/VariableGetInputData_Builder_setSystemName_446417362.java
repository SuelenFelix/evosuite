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

public class VariableGetInputData_Builder_setSystemName_446417362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2924;

    public VariableGetInputData_Builder_setSystemName_446417362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2950 = new ArrayList();
        ((ArrayList) term2950).add("gGSMzuGICf");
        ((ArrayList) term2950).add("hxCBltsObl");
        ((ArrayList) term2950).add("BndsHwAFMv");
        ((ArrayList) term2950).add("GzFkzHGYFt");
        ((ArrayList) term2950).add("tShwQLRGNe");
        ((ArrayList) term2950).add("LvtrsXUliU");
        Class<? extends Object> term3137 = Class.forName((String) "zowe.client.sdk.zosvariables.type.VariableType");
        Field term3136 = ((Class) term3137).getDeclaredField((String) "SYMBOL");
        ((Field) term3136).setAccessible(true);
        Object enum7 = ((Field) term3136).get((Object) null);
        term2924 = newInstance(Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder"));
        setField(term2924, term2924.getClass(), "sysplexName", "wSQxaModmm");
        setField(term2924, term2924.getClass(), "systemName", "UlajhuVLaP");
        setBooleanField(term2924, term2924.getClass(), "local", true);
        setField(term2924, term2924.getClass(), "variableNames", term2950);
        setField(term2924, term2924.getClass(), "variableType", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "setSystemName", argTypes, term2924, args);
    }

};


