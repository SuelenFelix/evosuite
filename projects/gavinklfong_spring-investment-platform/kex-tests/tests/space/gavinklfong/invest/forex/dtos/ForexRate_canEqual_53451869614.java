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

public class ForexRate_canEqual_53451869614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25655;
     Object term25687;

    public ForexRate_canEqual_53451869614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25683 = new Double(0.7618164754425794);
        Double term25685 = new Double(0.7385589312559342);
        term25655 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25656 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25656, term25656.getClass(), "seconds", 1689428810L);
        setIntField(term25656, term25656.getClass(), "nanos", 999000000);
        setField(term25655, term25655.getClass(), "timestamp", term25656);
        setField(term25655, term25655.getClass(), "baseCurrency", "riMtzCoxNj");
        setField(term25655, term25655.getClass(), "counterCurrency", "YAXkVjQZcV");
        setField(term25655, term25655.getClass(), "buyRate", term25683);
        setField(term25655, term25655.getClass(), "sellRate", term25685);
        term25687 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25687;
        callMethod(klass, "canEqual", argTypes, term25655, args);
    }

};


