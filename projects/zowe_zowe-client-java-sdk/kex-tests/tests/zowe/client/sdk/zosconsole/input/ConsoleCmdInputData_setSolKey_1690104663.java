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

public class ConsoleCmdInputData_setSolKey_1690104663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;

    public ConsoleCmdInputData_setSolKey_1690104663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159 = newInstance(Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData"));
        setField(term159, term159.getClass(), "cmd", "MjGYSRKTNF");
        setField(term159, term159.getClass(), "solKey", "hRNSzYYIrc");
        setField(term159, term159.getClass(), "system", "RMFIsYGgne");
        setBooleanField(term159, term159.getClass(), "processResponse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        callMethod(klass, "setSolKey", argTypes, term159, args);
    }

};


