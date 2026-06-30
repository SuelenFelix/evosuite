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

public class ForexRate_withSellRate_79961162819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25866;
     Object term25898;

    public ForexRate_withSellRate_79961162819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25894 = new Double(0.19625398866403143);
        Double term25896 = new Double(0.45069204793711093);
        term25866 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25867 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25867, term25867.getClass(), "seconds", 1450865259L);
        setIntField(term25867, term25867.getClass(), "nanos", 896000000);
        setField(term25866, term25866.getClass(), "timestamp", term25867);
        setField(term25866, term25866.getClass(), "baseCurrency", "VVNNlAePXF");
        setField(term25866, term25866.getClass(), "counterCurrency", "jnwVnmKAFv");
        setField(term25866, term25866.getClass(), "buyRate", term25894);
        setField(term25866, term25866.getClass(), "sellRate", term25896);
        term25898 = new Double(0.9341364461850963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term25898;
        callMethod(klass, "withSellRate", argTypes, term25866, args);
    }

};


