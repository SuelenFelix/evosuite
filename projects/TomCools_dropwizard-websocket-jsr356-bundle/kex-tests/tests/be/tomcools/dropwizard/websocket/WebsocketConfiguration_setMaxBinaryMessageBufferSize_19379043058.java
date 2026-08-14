package be.tomcools.dropwizard.websocket;

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
import static be.tomcools.dropwizard.websocket.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;

public class WebsocketConfiguration_setMaxBinaryMessageBufferSize_19379043058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1588;
     Object term1597;

    public WebsocketConfiguration_setMaxBinaryMessageBufferSize_19379043058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1589 = new Integer(597278769);
        Long term1591 = new Long(-316468845751588286L);
        Long term1593 = new Long(5127676408959197577L);
        Integer term1595 = new Integer(-1685132342);
        term1588 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1588, term1588.getClass(), "maxTextMessageBufferSize", term1589);
        setField(term1588, term1588.getClass(), "asyncSendTimeout", term1591);
        setField(term1588, term1588.getClass(), "maxSessionIdleTimeout", term1593);
        setField(term1588, term1588.getClass(), "maxBinaryMessageBufferSize", term1595);
        term1597 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1597;
        callMethod(klass, "setMaxBinaryMessageBufferSize", argTypes, term1588, args);
    }

};


