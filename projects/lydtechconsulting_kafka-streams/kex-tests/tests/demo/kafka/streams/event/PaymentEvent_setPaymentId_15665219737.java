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

public class PaymentEvent_setPaymentId_15665219737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;

    public PaymentEvent_setPaymentId_15665219737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term692 = new Long(4872422362414183754L);
        term679 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term679, term679.getClass(), "paymentId", "OWDIEULEFu");
        setField(term679, term679.getClass(), "amount", term692);
        setField(term679, term679.getClass(), "currency", "dWRymuLBtr");
        setField(term679, term679.getClass(), "toAccount", "AijpHYOFuy");
        setField(term679, term679.getClass(), "fromAccount", "SbAoxhfrkn");
        setField(term679, term679.getClass(), "rails", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "setPaymentId", argTypes, term679, args);
    }

};


