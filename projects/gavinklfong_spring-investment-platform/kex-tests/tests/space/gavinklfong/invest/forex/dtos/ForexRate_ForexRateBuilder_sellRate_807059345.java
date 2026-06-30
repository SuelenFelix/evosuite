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

public class ForexRate_ForexRateBuilder_sellRate_807059345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13667;
     Object term13699;

    public ForexRate_ForexRateBuilder_sellRate_807059345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13695 = new Double(0.7559240768573477);
        Double term13697 = new Double(0.10667076642995188);
        term13667 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder"));
        Object term13668 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13668, term13668.getClass(), "seconds", 1515890130L);
        setIntField(term13668, term13668.getClass(), "nanos", 18000000);
        setField(term13667, term13667.getClass(), "timestamp", term13668);
        setField(term13667, term13667.getClass(), "baseCurrency", "VMeAzAHwZj");
        setField(term13667, term13667.getClass(), "counterCurrency", "PznxWXsZME");
        setField(term13667, term13667.getClass(), "buyRate", term13695);
        setField(term13667, term13667.getClass(), "sellRate", term13697);
        term13699 = new Double(0.11493000848982304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term13699;
        callMethod(klass, "sellRate", argTypes, term13667, args);
    }

};


