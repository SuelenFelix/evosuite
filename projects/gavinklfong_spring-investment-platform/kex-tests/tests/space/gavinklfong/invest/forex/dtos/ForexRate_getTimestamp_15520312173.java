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
import java.lang.Object;
import java.lang.Double;

public class ForexRate_getTimestamp_15520312173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25031;

    public ForexRate_getTimestamp_15520312173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25059 = new Double(0.8819646072665548);
        Double term25061 = new Double(0.5412182593116958);
        term25031 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25032 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25032, term25032.getClass(), "seconds", 1332871705L);
        setIntField(term25032, term25032.getClass(), "nanos", 432000000);
        setField(term25031, term25031.getClass(), "timestamp", term25032);
        setField(term25031, term25031.getClass(), "baseCurrency", "yUGCjlqgJE");
        setField(term25031, term25031.getClass(), "counterCurrency", "PXdVZyoJyC");
        setField(term25031, term25031.getClass(), "buyRate", term25059);
        setField(term25031, term25031.getClass(), "sellRate", term25061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term25031, args);
    }

};


