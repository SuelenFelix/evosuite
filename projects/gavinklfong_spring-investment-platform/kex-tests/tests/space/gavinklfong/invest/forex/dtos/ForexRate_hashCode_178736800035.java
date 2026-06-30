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

public class ForexRate_hashCode_178736800035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25934;

    public ForexRate_hashCode_178736800035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25934 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        setField(term25934, term25934.getClass(), "timestamp", null);
        setField(term25934, term25934.getClass(), "baseCurrency", null);
        setField(term25934, term25934.getClass(), "counterCurrency", null);
        setField(term25934, term25934.getClass(), "buyRate", null);
        setField(term25934, term25934.getClass(), "sellRate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term25934, args);
    }

};


