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

public class ForexRate_setSellRate_182284497012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25548;
     Object term25580;

    public ForexRate_setSellRate_182284497012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25576 = new Double(0.9628647861255637);
        Double term25578 = new Double(0.623231822150205);
        term25548 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25549 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25549, term25549.getClass(), "seconds", 1285661498L);
        setIntField(term25549, term25549.getClass(), "nanos", 273000000);
        setField(term25548, term25548.getClass(), "timestamp", term25549);
        setField(term25548, term25548.getClass(), "baseCurrency", "rIPMBcrNqB");
        setField(term25548, term25548.getClass(), "counterCurrency", "UDaboHZHhz");
        setField(term25548, term25548.getClass(), "buyRate", term25576);
        setField(term25548, term25548.getClass(), "sellRate", term25578);
        term25580 = new Double(0.09037487793444521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term25580;
        callMethod(klass, "setSellRate", argTypes, term25548, args);
    }

};


