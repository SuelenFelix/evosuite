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

public class PaymentEvent_getToAccount_4953355264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340;

    public PaymentEvent_getToAccount_4953355264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term353 = new Long(-8400487765614892086L);
        term340 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term340, term340.getClass(), "paymentId", "aJlieCFVtF");
        setField(term340, term340.getClass(), "amount", term353);
        setField(term340, term340.getClass(), "currency", "ZiaGIbnzTs");
        setField(term340, term340.getClass(), "toAccount", "tbcdzjIfER");
        setField(term340, term340.getClass(), "fromAccount", "HyxfbSQYBe");
        setField(term340, term340.getClass(), "rails", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToAccount", argTypes, term340, args);
    }

};


