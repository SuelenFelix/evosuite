package org.mozilla.universalchardet.prober;

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
import static org.mozilla.universalchardet.prober.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class SingleByteCharsetProber_handleData_8623242936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147371;
     Object term147394;
     Object term147403;
     Object term147405;

    public SingleByteCharsetProber_handleData_8623242936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147408 = Class.forName((String) "org.mozilla.universalchardet.prober.CharsetProber$ProbingState");
        Field term147407 = ((Class) term147408).getDeclaredField((String) "DETECTING");
        ((Field) term147407).setAccessible(true);
        Object enum22 = ((Field) term147407).get((Object) null);
        term147371 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber"));
        int[] term147388 = (int[]) newIntArray(2);
        setField(term147371, term147371.getClass(), "state", enum22);
        setField(term147371, term147371.getClass(), "model", null);
        setBooleanField(term147371, term147371.getClass(), "reversed", false);
        setShortField(term147371, term147371.getClass(), "lastOrder", (short) -16335);
        setIntField(term147371, term147371.getClass(), "totalSeqs", 1551099402);
        setIntElement(term147388, 0, -2027534003);
        setIntElement(term147388, 1, 1063420942);
        setField(term147371, term147371.getClass(), "seqCounters", term147388);
        setIntField(term147371, term147371.getClass(), "totalChar", 1375330971);
        setIntField(term147371, term147371.getClass(), "freqChar", -478195677);
        setField(term147371, term147371.getClass(), "nameProber", null);
        setBooleanField(term147371, term147371.getClass(), "active", true);
        term147394 = (byte[]) newByteArray(8);
        setByteElement(term147394, 0, (byte) -123);
        setByteElement(term147394, 1, (byte) -23);
        setByteElement(term147394, 2, (byte) 100);
        setByteElement(term147394, 3, (byte) 106);
        setByteElement(term147394, 4, (byte) -57);
        setByteElement(term147394, 5, (byte) -103);
        setByteElement(term147394, 6, (byte) 98);
        setByteElement(term147394, 7, (byte) 79);
        term147403 = new Integer(972867650);
        term147405 = new Integer(1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term147394;
        args[1] = term147403;
        args[2] = term147405;
        callMethod(klass, "handleData", argTypes, term147371, args);
    }

};


