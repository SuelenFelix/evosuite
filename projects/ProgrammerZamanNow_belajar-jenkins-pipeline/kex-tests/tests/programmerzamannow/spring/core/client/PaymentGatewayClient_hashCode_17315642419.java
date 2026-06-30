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

public class PaymentGatewayClient_hashCode_17315642419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605;

    public PaymentGatewayClient_hashCode_17315642419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605 = newInstance(Class.forName("programmerzamannow.spring.core.client.PaymentGatewayClient"));
        setField(term605, term605.getClass(), "endpoint", "OclPbYPkcH");
        setField(term605, term605.getClass(), "privateKey", "IoAlmYsBwc");
        setField(term605, term605.getClass(), "publicKey", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.client.PaymentGatewayClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term605, args);
    }

};


