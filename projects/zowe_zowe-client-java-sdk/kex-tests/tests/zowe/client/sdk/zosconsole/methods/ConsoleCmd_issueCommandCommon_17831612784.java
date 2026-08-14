package zowe.client.sdk.zosconsole.methods;

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
import static zowe.client.sdk.zosconsole.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ConsoleCmd_issueCommandCommon_17831612784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term82;

    public ConsoleCmd_issueCommandCommon_17831612784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("zowe.client.sdk.zosconsole.methods.ConsoleCmd"));
        setField(term69, term69.getClass(), "connection", null);
        setField(term69, term69.getClass(), "request", null);
        term82 = newInstance(Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData"));
        setField(term82, term82.getClass(), "cmd", "jJCZpVmanW");
        setField(term82, term82.getClass(), "solKey", "EGtDIRbSSb");
        setField(term82, term82.getClass(), "system", "SzjVpOQTyS");
        setBooleanField(term82, term82.getClass(), "processResponse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.methods.ConsoleCmd");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData");
        Object[] args = new Object[2];
        args[0] = "xxtlPwDYFs";
        args[1] = term82;
        callMethod(klass, "issueCommandCommon", argTypes, term69, args);
    }

};


