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

public class PaymentEvent_PaymentEventBuilder_rails_20594196836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2707;

    public PaymentEvent_PaymentEventBuilder_rails_20594196836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2720 = new Long(2486810210675247493L);
        term2707 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder"));
        setField(term2707, term2707.getClass(), "paymentId", "mXGCWJDOqA");
        setField(term2707, term2707.getClass(), "amount", term2720);
        setField(term2707, term2707.getClass(), "currency", "dpNsDgfPso");
        setField(term2707, term2707.getClass(), "toAccount", "hCWPJQKpdc");
        setField(term2707, term2707.getClass(), "fromAccount", "WzMEhMXkKx");
        setField(term2707, term2707.getClass(), "rails", "XOiDvlDhdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdxvLJhNLe";
        callMethod(klass, "rails", argTypes, term2707, args);
    }

};


