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

public class PaymentEvent_setFromAccount_141807005711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1199;

    public PaymentEvent_setFromAccount_141807005711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1212 = new Long(-8885298608300233488L);
        term1199 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term1199, term1199.getClass(), "paymentId", "JDswTTCZHV");
        setField(term1199, term1199.getClass(), "amount", term1212);
        setField(term1199, term1199.getClass(), "currency", "onpbIeEKoi");
        setField(term1199, term1199.getClass(), "toAccount", "YRHGsAkhxb");
        setField(term1199, term1199.getClass(), "fromAccount", "ffYhPOzlUs");
        setField(term1199, term1199.getClass(), "rails", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ytSBIKXogI";
        callMethod(klass, "setFromAccount", argTypes, term1199, args);
    }

};


