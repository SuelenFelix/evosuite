package space.gavinklfong.invest.forex.dtos;

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
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Double;

public class ForexRateBooking_init_14968372860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15261;
     Object term15263;
     Object term15290;
     Object term15304;
     Object term15307;

    public ForexRateBooking_init_14968372860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15261 = new Long(-4443169559037975007L);
        term15263 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term15263, term15263.getClass(), "seconds", 1645834034L);
        setIntField(term15263, term15263.getClass(), "nanos", 896000000);
        term15290 = new Double(0.3227335400819148);
        term15304 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term15304, term15304.getClass(), "seconds", 1500721068L);
        setIntField(term15304, term15304.getClass(), "nanos", 23000000);
        term15307 = new Long(-3842548265506930260L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.time.Instant");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.Double");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.time.Instant");
        argTypes[7] = Class.forName("java.lang.Long");
        Object[] args = new Object[8];
        args[0] = term15261;
        args[1] = term15263;
        args[2] = "RMsXuyzKJV";
        args[3] = "FwPbDZcHmB";
        args[4] = term15290;
        args[5] = "hOncybyCAH";
        args[6] = term15304;
        args[7] = term15307;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


