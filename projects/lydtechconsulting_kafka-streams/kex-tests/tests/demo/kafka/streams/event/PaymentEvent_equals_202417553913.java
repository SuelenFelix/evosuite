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

public class PaymentEvent_equals_202417553913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1469;
     Object term1532;

    public PaymentEvent_equals_202417553913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1482 = new Long(2535595959091595249L);
        term1469 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term1469, term1469.getClass(), "paymentId", "uWHnvSvaPl");
        setField(term1469, term1469.getClass(), "amount", term1482);
        setField(term1469, term1469.getClass(), "currency", "kBdSllIBVz");
        setField(term1469, term1469.getClass(), "toAccount", "TJmVBGfTML");
        setField(term1469, term1469.getClass(), "fromAccount", "tPlsykYBqO");
        setField(term1469, term1469.getClass(), "rails", "bLPjGVBhlX");
        term1532 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1532;
        callMethod(klass, "equals", argTypes, term1469, args);
    }

};


