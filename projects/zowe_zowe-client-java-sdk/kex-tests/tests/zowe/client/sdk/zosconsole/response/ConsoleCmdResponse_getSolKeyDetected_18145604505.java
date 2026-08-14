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

public class ConsoleCmdResponse_getSolKeyDetected_18145604505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555;

    public ConsoleCmdResponse_getSolKeyDetected_18145604505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555 = newInstance(Class.forName("zowe.client.sdk.zosconsole.response.ConsoleCmdResponse"));
        setField(term555, term555.getClass(), "cmdResponseKey", "vrQLuWIDJX");
        setField(term555, term555.getClass(), "cmdResponseUrl", "flxyYxBRtu");
        setField(term555, term555.getClass(), "cmdResponseUri", "OclPbYPkcH");
        setField(term555, term555.getClass(), "cmdResponse", "IoAlmYsBwc");
        setField(term555, term555.getClass(), "solKeyDetected", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.response.ConsoleCmdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSolKeyDetected", argTypes, term555, args);
    }

};


