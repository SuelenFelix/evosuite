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

public class WebsocketConfiguration_setMaxTextMessageBufferSize_15436974435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555;
     Object term1564;

    public WebsocketConfiguration_setMaxTextMessageBufferSize_15436974435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1556 = new Integer(1227103734);
        Long term1558 = new Long(-7237588299778557629L);
        Long term1560 = new Long(6967924379644551255L);
        Integer term1562 = new Integer(-1339778481);
        term1555 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1555, term1555.getClass(), "maxTextMessageBufferSize", term1556);
        setField(term1555, term1555.getClass(), "asyncSendTimeout", term1558);
        setField(term1555, term1555.getClass(), "maxSessionIdleTimeout", term1560);
        setField(term1555, term1555.getClass(), "maxBinaryMessageBufferSize", term1562);
        term1564 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1564;
        callMethod(klass, "setMaxTextMessageBufferSize", argTypes, term1555, args);
    }

};


