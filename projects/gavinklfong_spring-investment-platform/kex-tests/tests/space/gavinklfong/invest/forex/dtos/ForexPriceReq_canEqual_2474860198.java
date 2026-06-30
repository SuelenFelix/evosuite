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
import java.lang.Double;

public class ForexPriceReq_canEqual_2474860198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15062;
     Object term15089;

    public ForexPriceReq_canEqual_2474860198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term15087 = new Double(0.5804948995371725);
        term15062 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq"));
        setField(term15062, term15062.getClass(), "baseCurrency", "iikZEapDlu");
        setField(term15062, term15062.getClass(), "counterCurrency", "nhoHrZfnIN");
        setField(term15062, term15062.getClass(), "rate", term15087);
        term15089 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15089;
        callMethod(klass, "canEqual", argTypes, term15062, args);
    }

};


