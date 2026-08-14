package zowe.client.sdk.zosconsole.response;

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
import static zowe.client.sdk.zosconsole.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ConsoleCmdResponse_withCmdResponse_13219441136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666;

    public ConsoleCmdResponse_withCmdResponse_13219441136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term666 = newInstance(Class.forName("zowe.client.sdk.zosconsole.response.ConsoleCmdResponse"));
        setField(term666, term666.getClass(), "cmdResponseKey", "OWDIEULEFu");
        setField(term666, term666.getClass(), "cmdResponseUrl", "dWRymuLBtr");
        setField(term666, term666.getClass(), "cmdResponseUri", "AijpHYOFuy");
        setField(term666, term666.getClass(), "cmdResponse", "SbAoxhfrkn");
        setField(term666, term666.getClass(), "solKeyDetected", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.response.ConsoleCmdResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "withCmdResponse", argTypes, term666, args);
    }

};


