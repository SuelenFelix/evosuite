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
import java.util.LinkedList;
import java.lang.Object;

public class VariableGetInputFactory_createZosVariableInput_16266175792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5413;

    public VariableGetInputFactory_createZosVariableInput_16266175792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5413 = new LinkedList();
        ((LinkedList) term5413).add("oVgzLbrsFr");
        ((LinkedList) term5413).add("vQVyKLdtaz");
        ((LinkedList) term5413).add("");
        ((LinkedList) term5413).add((Object)null);
        ((LinkedList) term5413).add((Object)null);
        ((LinkedList) term5413).add((Object)null);
        ((LinkedList) term5413).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "HqBOwkVqjD";
        args[1] = "MAcUBcBckh";
        args[2] = term5413;
        callMethod(klass, "createZosVariableInput", argTypes, null, args);
    }

};


