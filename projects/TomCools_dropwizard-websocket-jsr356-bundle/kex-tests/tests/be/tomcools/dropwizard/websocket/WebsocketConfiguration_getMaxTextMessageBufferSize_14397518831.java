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

public class WebsocketConfiguration_getMaxTextMessageBufferSize_14397518831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1519;

    public WebsocketConfiguration_getMaxTextMessageBufferSize_14397518831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1520 = new Integer(568599855);
        Long term1522 = new Long(2442117782898005296L);
        Long term1524 = new Long(6375119433582206027L);
        Integer term1526 = new Integer(1162663216);
        term1519 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1519, term1519.getClass(), "maxTextMessageBufferSize", term1520);
        setField(term1519, term1519.getClass(), "asyncSendTimeout", term1522);
        setField(term1519, term1519.getClass(), "maxSessionIdleTimeout", term1524);
        setField(term1519, term1519.getClass(), "maxBinaryMessageBufferSize", term1526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxTextMessageBufferSize", argTypes, term1519, args);
    }

};


