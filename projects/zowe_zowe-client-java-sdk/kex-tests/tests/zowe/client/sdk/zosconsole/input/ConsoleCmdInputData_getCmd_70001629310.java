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

public class ConsoleCmdInputData_getCmd_70001629310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611;

    public ConsoleCmdInputData_getCmd_70001629310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611 = newInstance(Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData"));
        setField(term611, term611.getClass(), "cmd", null);
        setField(term611, term611.getClass(), "solKey", null);
        setField(term611, term611.getClass(), "system", null);
        setBooleanField(term611, term611.getClass(), "processResponse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmd", argTypes, term611, args);
    }

};


