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

public class WebsocketConfiguration_getAsyncSendTimeout_10756528332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1528;

    public WebsocketConfiguration_getAsyncSendTimeout_10756528332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1529 = new Integer(1484323161);
        Long term1531 = new Long(-8257434502486459194L);
        Long term1533 = new Long(-8400487765614892086L);
        Integer term1535 = new Integer(391863371);
        term1528 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1528, term1528.getClass(), "maxTextMessageBufferSize", term1529);
        setField(term1528, term1528.getClass(), "asyncSendTimeout", term1531);
        setField(term1528, term1528.getClass(), "maxSessionIdleTimeout", term1533);
        setField(term1528, term1528.getClass(), "maxBinaryMessageBufferSize", term1535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAsyncSendTimeout", argTypes, term1528, args);
    }

};


