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

public class ForexRate_withBuyRate_163122438838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25936;

    public ForexRate_withBuyRate_163122438838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25936 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        setField(term25936, term25936.getClass(), "timestamp", null);
        setField(term25936, term25936.getClass(), "baseCurrency", null);
        setField(term25936, term25936.getClass(), "counterCurrency", null);
        setField(term25936, term25936.getClass(), "buyRate", null);
        setField(term25936, term25936.getClass(), "sellRate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withBuyRate", argTypes, term25936, args);
    }

};


