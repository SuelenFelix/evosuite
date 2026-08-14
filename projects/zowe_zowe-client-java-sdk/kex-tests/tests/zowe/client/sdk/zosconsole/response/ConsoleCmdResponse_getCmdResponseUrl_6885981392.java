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

public class ConsoleCmdResponse_getCmdResponseUrl_6885981392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;

    public ConsoleCmdResponse_getCmdResponseUrl_6885981392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("zowe.client.sdk.zosconsole.response.ConsoleCmdResponse"));
        setField(term222, term222.getClass(), "cmdResponseKey", "NRdvgJlhkX");
        setField(term222, term222.getClass(), "cmdResponseUrl", "uuaPigETmJ");
        setField(term222, term222.getClass(), "cmdResponseUri", "MxlszYVzRf");
        setField(term222, term222.getClass(), "cmdResponse", "LQFpaHEwXR");
        setField(term222, term222.getClass(), "solKeyDetected", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.response.ConsoleCmdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmdResponseUrl", argTypes, term222, args);
    }

};


