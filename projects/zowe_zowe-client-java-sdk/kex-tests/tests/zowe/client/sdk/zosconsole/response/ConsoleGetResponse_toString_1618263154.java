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

public class ConsoleGetResponse_toString_1618263154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1035;

    public ConsoleGetResponse_toString_1618263154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1035 = newInstance(Class.forName("zowe.client.sdk.zosconsole.response.ConsoleGetResponse"));
        setField(term1035, term1035.getClass(), "cmdResponse", "tShwQLRGNe");
        setBooleanField(term1035, term1035.getClass(), "keywordDetected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.response.ConsoleGetResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1035, args);
    }

};


