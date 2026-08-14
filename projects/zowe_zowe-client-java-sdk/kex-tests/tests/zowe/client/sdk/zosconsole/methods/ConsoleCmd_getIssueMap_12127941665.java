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

public class ConsoleCmd_getIssueMap_12127941665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160;
     Object term161;

    public ConsoleCmd_getIssueMap_12127941665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160 = newInstance(Class.forName("zowe.client.sdk.zosconsole.methods.ConsoleCmd"));
        setField(term160, term160.getClass(), "connection", null);
        setField(term160, term160.getClass(), "request", null);
        term161 = newInstance(Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData"));
        setField(term161, term161.getClass(), "cmd", "MjGYSRKTNF");
        setField(term161, term161.getClass(), "solKey", "hRNSzYYIrc");
        setField(term161, term161.getClass(), "system", "RMFIsYGgne");
        setBooleanField(term161, term161.getClass(), "processResponse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.methods.ConsoleCmd");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosconsole.input.ConsoleCmdInputData");
        Object[] args = new Object[1];
        args[0] = term161;
        callMethod(klass, "getIssueMap", argTypes, term160, args);
    }

};


