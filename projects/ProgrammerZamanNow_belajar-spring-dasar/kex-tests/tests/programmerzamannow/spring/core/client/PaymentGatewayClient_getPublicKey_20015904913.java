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

public class PaymentGatewayClient_getPublicKey_20015904913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public PaymentGatewayClient_getPublicKey_20015904913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("programmerzamannow.spring.core.client.PaymentGatewayClient"));
        setField(term135, term135.getClass(), "endpoint", "SzjVpOQTyS");
        setField(term135, term135.getClass(), "privateKey", "MjGYSRKTNF");
        setField(term135, term135.getClass(), "publicKey", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.client.PaymentGatewayClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublicKey", argTypes, term135, args);
    }

};


