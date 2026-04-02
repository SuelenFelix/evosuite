package io.puzpuzpuz.lock;

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
import static io.puzpuzpuz.lock.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class TicketSpinLock_tryLock_13988658264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880;
     Object term899;
     Object enum3;

    public TicketSpinLock_tryLock_13988658264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term880 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock"));
        Object term881 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        Object term890 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        setLongField(term881, term881.getClass(), "l1", 0L);
        setLongField(term881, term881.getClass(), "l2", 0L);
        setLongField(term881, term881.getClass(), "l3", 0L);
        setLongField(term881, term881.getClass(), "l4", 0L);
        setLongField(term881, term881.getClass(), "l5", 0L);
        setLongField(term881, term881.getClass(), "l6", 0L);
        setLongField(term881, term881.getClass(), "l7", 0L);
        setLongField(term881, term881.getClass(), "value", 0L);
        setField(term880, term880.getClass(), "nextTicket", term881);
        setLongField(term890, term890.getClass(), "l1", 0L);
        setLongField(term890, term890.getClass(), "l2", 0L);
        setLongField(term890, term890.getClass(), "l3", 0L);
        setLongField(term890, term890.getClass(), "l4", 0L);
        setLongField(term890, term890.getClass(), "l5", 0L);
        setLongField(term890, term890.getClass(), "l6", 0L);
        setLongField(term890, term890.getClass(), "l7", 0L);
        setLongField(term890, term890.getClass(), "value", 0L);
        setField(term880, term880.getClass(), "servedTicket", term890);
        term899 = new Long(-8400487765614892086L);
        Class<? extends Object> term919 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term918 = ((Class) term919).getDeclaredField((String) "HOURS");
        ((Field) term918).setAccessible(true);
        enum3 = ((Field) term918).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.TicketSpinLock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term899;
        args[1] = enum3;
        callMethod(klass, "tryLock", argTypes, term880, args);
    }

};


