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

public class PaymentGatewayClient_setPrivateKey_6047386935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;

    public PaymentGatewayClient_setPrivateKey_6047386935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291 = newInstance(Class.forName("programmerzamannow.spring.core.client.PaymentGatewayClient"));
        setField(term291, term291.getClass(), "endpoint", "LQFpaHEwXR");
        setField(term291, term291.getClass(), "privateKey", "oVcInYnLWB");
        setField(term291, term291.getClass(), "publicKey", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.client.PaymentGatewayClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "setPrivateKey", argTypes, term291, args);
    }

};


