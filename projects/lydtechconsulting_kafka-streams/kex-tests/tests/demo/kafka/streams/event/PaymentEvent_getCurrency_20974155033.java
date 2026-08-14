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

public class PaymentEvent_getCurrency_20974155033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public PaymentEvent_getCurrency_20974155033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240 = new Long(-8257434502486459194L);
        term227 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term227, term227.getClass(), "paymentId", "NRdvgJlhkX");
        setField(term227, term227.getClass(), "amount", term240);
        setField(term227, term227.getClass(), "currency", "uuaPigETmJ");
        setField(term227, term227.getClass(), "toAccount", "MxlszYVzRf");
        setField(term227, term227.getClass(), "fromAccount", "LQFpaHEwXR");
        setField(term227, term227.getClass(), "rails", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term227, args);
    }

};


