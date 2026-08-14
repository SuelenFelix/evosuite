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

public class TicketSpinLock_unlock_3625239075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1085;

    public TicketSpinLock_unlock_3625239075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1085 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock"));
        Object term1086 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        Object term1095 = newInstance(Class.forName("io.puzpuzpuz.lock.TicketSpinLock$PaddedAtomicLong"));
        setLongField(term1086, term1086.getClass(), "l1", 0L);
        setLongField(term1086, term1086.getClass(), "l2", 0L);
        setLongField(term1086, term1086.getClass(), "l3", 0L);
        setLongField(term1086, term1086.getClass(), "l4", 0L);
        setLongField(term1086, term1086.getClass(), "l5", 0L);
        setLongField(term1086, term1086.getClass(), "l6", 0L);
        setLongField(term1086, term1086.getClass(), "l7", 0L);
        setLongField(term1086, term1086.getClass(), "value", 0L);
        setField(term1085, term1085.getClass(), "nextTicket", term1086);
        setLongField(term1095, term1095.getClass(), "l1", 0L);
        setLongField(term1095, term1095.getClass(), "l2", 0L);
        setLongField(term1095, term1095.getClass(), "l3", 0L);
        setLongField(term1095, term1095.getClass(), "l4", 0L);
        setLongField(term1095, term1095.getClass(), "l5", 0L);
        setLongField(term1095, term1095.getClass(), "l6", 0L);
        setLongField(term1095, term1095.getClass(), "l7", 0L);
        setLongField(term1095, term1095.getClass(), "value", 0L);
        setField(term1085, term1085.getClass(), "servedTicket", term1095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.puzpuzpuz.lock.TicketSpinLock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unlock", argTypes, term1085, args);
    }

};


