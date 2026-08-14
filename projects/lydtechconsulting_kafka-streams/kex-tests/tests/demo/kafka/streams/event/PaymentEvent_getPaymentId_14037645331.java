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

public class PaymentEvent_getPaymentId_14037645331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PaymentEvent_getPaymentId_14037645331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term1, term1.getClass(), "paymentId", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "amount", term14);
        setField(term1, term1.getClass(), "currency", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "toAccount", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "fromAccount", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "rails", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaymentId", argTypes, term1, args);
    }

};


