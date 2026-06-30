package programmerzamannow.spring.core.client;

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
import static programmerzamannow.spring.core.client.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PaymentGatewayClient_toString_122080455110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;

    public PaymentGatewayClient_toString_122080455110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672 = newInstance(Class.forName("programmerzamannow.spring.core.client.PaymentGatewayClient"));
        setField(term672, term672.getClass(), "endpoint", "OWDIEULEFu");
        setField(term672, term672.getClass(), "privateKey", "dWRymuLBtr");
        setField(term672, term672.getClass(), "publicKey", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.client.PaymentGatewayClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term672, args);
    }

};


