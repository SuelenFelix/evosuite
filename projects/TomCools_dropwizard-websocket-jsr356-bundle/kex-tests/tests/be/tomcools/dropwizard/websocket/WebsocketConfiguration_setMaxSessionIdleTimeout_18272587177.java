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

public class WebsocketConfiguration_setMaxSessionIdleTimeout_18272587177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577;
     Object term1586;

    public WebsocketConfiguration_setMaxSessionIdleTimeout_18272587177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1578 = new Integer(-883034806);
        Long term1580 = new Long(2535595959091595249L);
        Long term1582 = new Long(-5476826692763582090L);
        Integer term1584 = new Integer(1585847225);
        term1577 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1577, term1577.getClass(), "maxTextMessageBufferSize", term1578);
        setField(term1577, term1577.getClass(), "asyncSendTimeout", term1580);
        setField(term1577, term1577.getClass(), "maxSessionIdleTimeout", term1582);
        setField(term1577, term1577.getClass(), "maxBinaryMessageBufferSize", term1584);
        term1586 = new Long(-872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1586;
        callMethod(klass, "setMaxSessionIdleTimeout", argTypes, term1577, args);
    }

};


