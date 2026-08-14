package zowe.client.sdk.zosvariables.methods;

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
import static zowe.client.sdk.zosvariables.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Boolean;

public class VariableDelete_deleteCommon_841811734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612;
     Object term637;
     Object term653;

    public VariableDelete_deleteCommon_841811734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term612 = newInstance(Class.forName("zowe.client.sdk.zosvariables.methods.VariableDelete"));
        setField(term612, term612.getClass(), "connection", null);
        setField(term612, term612.getClass(), "request", null);
        term637 = new LinkedList();
        ((LinkedList) term637).add("UlajhuVLaP");
        term653 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.methods.VariableDelete");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "aKnKipADSo";
        args[1] = "wSQxaModmm";
        args[2] = term637;
        args[3] = term653;
        callMethod(klass, "deleteCommon", argTypes, term612, args);
    }

};


