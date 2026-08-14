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
import java.lang.Long;

public class TicketSpinLock_tryLock_139886582611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1126;
     Object term1127;

    public TicketSpinLock_tryLock_139886582611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1126 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock"));
        setField(term1126, term1126.getClass(), "nextTicket", null);
        setField(term1126, term1126.getClass(), "servedTicket", null);
        term1127 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.TicketSpinLock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = term1127;
        args[1] = null;
        callMethod(klass, "tryLock", argTypes, term1126, args);
    }

};


