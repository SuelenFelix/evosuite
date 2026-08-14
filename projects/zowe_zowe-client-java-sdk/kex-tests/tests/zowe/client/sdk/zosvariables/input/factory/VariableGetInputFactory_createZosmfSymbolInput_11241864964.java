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

public class VariableGetInputFactory_createZosmfSymbolInput_11241864964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5581;

    public VariableGetInputFactory_createZosmfSymbolInput_11241864964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5581 = new LinkedList();
        ((LinkedList) term5581).add("TimdotUuNC");
        ((LinkedList) term5581).add("PkWMRdJcBb");
        ((LinkedList) term5581).add("");
        ((LinkedList) term5581).add((Object)null);
        ((LinkedList) term5581).add((Object)null);
        ((LinkedList) term5581).add((Object)null);
        ((LinkedList) term5581).add((Object)null);
        ((LinkedList) term5581).add((Object)null);
        ((LinkedList) term5581).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.input.factory.VariableGetInputFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "LvJFtLBaxj";
        args[1] = "PHvxnGHptP";
        args[2] = term5581;
        callMethod(klass, "createZosmfSymbolInput", argTypes, null, args);
    }

};


