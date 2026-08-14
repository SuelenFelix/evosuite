package demo.kafka.streams.event;

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
import static demo.kafka.streams.event.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class PaymentEvent_getAmount_21441090212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;

    public PaymentEvent_getAmount_21441090212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term127 = new Long(6375119433582206027L);
        term114 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term114, term114.getClass(), "paymentId", "EGtDIRbSSb");
        setField(term114, term114.getClass(), "amount", term127);
        setField(term114, term114.getClass(), "currency", "SzjVpOQTyS");
        setField(term114, term114.getClass(), "toAccount", "MjGYSRKTNF");
        setField(term114, term114.getClass(), "fromAccount", "hRNSzYYIrc");
        setField(term114, term114.getClass(), "rails", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term114, args);
    }

};


