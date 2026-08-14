package zowe.client.sdk.zosconsole.input;

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
import static zowe.client.sdk.zosconsole.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ConsoleCmdInputData_getSystem_18117909134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249;

    public ConsoleCmdInputData_getSystem_18117909134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249 = newInstance(Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData"));
        setField(term249, term249.getClass(), "cmd", "uuaPigETmJ");
        setField(term249, term249.getClass(), "solKey", "MxlszYVzRf");
        setField(term249, term249.getClass(), "system", "LQFpaHEwXR");
        setBooleanField(term249, term249.getClass(), "processResponse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystem", argTypes, term249, args);
    }

};


