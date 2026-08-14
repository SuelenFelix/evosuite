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

public class VariableCreate_create_310448482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term238;

    public VariableCreate_create_310448482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = newInstance(Class.forName("zowe.client.sdk.zosvariables.methods.VariableCreate"));
        setField(term213, term213.getClass(), "connection", null);
        setField(term213, term213.getClass(), "request", null);
        Object term241 = newInstance(Class.forName("zowe.client.sdk.zosvariables.model.SystemVariable"));
        setField(term241, term241.getClass(), "name", "uuaPigETmJ");
        setField(term241, term241.getClass(), "value", "MxlszYVzRf");
        setField(term241, term241.getClass(), "description", "LQFpaHEwXR");
        Object term279 = newInstance(Class.forName("zowe.client.sdk.zosvariables.model.SystemVariable"));
        setField(term279, term279.getClass(), "name", "");
        setField(term279, term279.getClass(), "value", "");
        setField(term279, term279.getClass(), "description", "");
        Object term284 = newInstance(Class.forName("zowe.client.sdk.zosvariables.model.SystemVariable"));
        setField(term284, term284.getClass(), "name", null);
        setField(term284, term284.getClass(), "value", null);
        setField(term284, term284.getClass(), "description", null);
        term238 = new LinkedList();
        ((LinkedList) term238).add(term241);
        ((LinkedList) term238).add(term279);
        ((LinkedList) term238).add(term284);
        ((LinkedList) term238).add((Object)null);
        ((LinkedList) term238).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.methods.VariableCreate");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "RMFIsYGgne";
        args[1] = "NRdvgJlhkX";
        args[2] = term238;
        callMethod(klass, "create", argTypes, term213, args);
    }

};


