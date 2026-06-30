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

public class ForexRate_toString_199683960616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25760;

    public ForexRate_toString_199683960616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25788 = new Double(0.3074693824288357);
        Double term25790 = new Double(0.1245258965512791);
        term25760 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25761 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25761, term25761.getClass(), "seconds", 1531331402L);
        setIntField(term25761, term25761.getClass(), "nanos", 53000000);
        setField(term25760, term25760.getClass(), "timestamp", term25761);
        setField(term25760, term25760.getClass(), "baseCurrency", "RDnkgWkcbz");
        setField(term25760, term25760.getClass(), "counterCurrency", "IBpaxltauX");
        setField(term25760, term25760.getClass(), "buyRate", term25788);
        setField(term25760, term25760.getClass(), "sellRate", term25790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25760, args);
    }

};


