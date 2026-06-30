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

public class ForexRate_ForexRateBuilder_build_27216412614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13830;

    public ForexRate_ForexRateBuilder_build_27216412614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13830 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder"));
        setField(term13830, term13830.getClass(), "timestamp", null);
        setField(term13830, term13830.getClass(), "baseCurrency", null);
        setField(term13830, term13830.getClass(), "counterCurrency", null);
        setField(term13830, term13830.getClass(), "buyRate", null);
        setField(term13830, term13830.getClass(), "sellRate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term13830, args);
    }

};


