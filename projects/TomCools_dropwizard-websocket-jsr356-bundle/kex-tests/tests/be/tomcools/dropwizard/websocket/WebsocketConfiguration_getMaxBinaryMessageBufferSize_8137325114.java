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

public class WebsocketConfiguration_getMaxBinaryMessageBufferSize_8137325114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1546;

    public WebsocketConfiguration_getMaxBinaryMessageBufferSize_8137325114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1547 = new Integer(-1955890973);
        Long term1549 = new Long(4872422362414183754L);
        Long term1551 = new Long(6811161968424632369L);
        Integer term1553 = new Integer(-2038273078);
        term1546 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1546, term1546.getClass(), "maxTextMessageBufferSize", term1547);
        setField(term1546, term1546.getClass(), "asyncSendTimeout", term1549);
        setField(term1546, term1546.getClass(), "maxSessionIdleTimeout", term1551);
        setField(term1546, term1546.getClass(), "maxBinaryMessageBufferSize", term1553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxBinaryMessageBufferSize", argTypes, term1546, args);
    }

};


