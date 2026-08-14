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
import java.lang.Object;

public class VariableDelete_delete_4477514083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;
     Object term514;

    public VariableDelete_delete_4477514083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489 = newInstance(Class.forName("zowe.client.sdk.zosvariables.methods.VariableDelete"));
        setField(term489, term489.getClass(), "connection", null);
        setField(term489, term489.getClass(), "request", null);
        term514 = new LinkedList();
        ((LinkedList) term514).add("SbAoxhfrkn");
        ((LinkedList) term514).add("kuTXqwMtDB");
        ((LinkedList) term514).add("");
        ((LinkedList) term514).add((Object)null);
        ((LinkedList) term514).add((Object)null);
        ((LinkedList) term514).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.methods.VariableDelete");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "dWRymuLBtr";
        args[1] = "AijpHYOFuy";
        args[2] = term514;
        callMethod(klass, "delete", argTypes, term489, args);
    }

};


