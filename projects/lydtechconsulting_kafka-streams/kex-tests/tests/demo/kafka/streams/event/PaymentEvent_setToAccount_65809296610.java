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

public class PaymentEvent_setToAccount_65809296610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1064;

    public PaymentEvent_setToAccount_65809296610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1077 = new Long(-2813493605142626659L);
        term1064 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term1064, term1064.getClass(), "paymentId", "LvtrsXUliU");
        setField(term1064, term1064.getClass(), "amount", term1077);
        setField(term1064, term1064.getClass(), "currency", "xLbjWUgOIL");
        setField(term1064, term1064.getClass(), "toAccount", "jDtqGUpnZN");
        setField(term1064, term1064.getClass(), "fromAccount", "nGKItKLYNC");
        setField(term1064, term1064.getClass(), "rails", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setToAccount", argTypes, term1064, args);
    }

};


