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

public class PaymentEvent_getFromAccount_15211208735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453;

    public PaymentEvent_getFromAccount_15211208735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term466 = new Long(5270370404989704783L);
        term453 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term453, term453.getClass(), "paymentId", "hNxWaHcfhY");
        setField(term453, term453.getClass(), "amount", term466);
        setField(term453, term453.getClass(), "currency", "RkybSrpybU");
        setField(term453, term453.getClass(), "toAccount", "xOEqzGAmDU");
        setField(term453, term453.getClass(), "fromAccount", "eZFUvlxvGV");
        setField(term453, term453.getClass(), "rails", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromAccount", argTypes, term453, args);
    }

};


