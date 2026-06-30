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

public class ForexPriceReq_ForexPriceReqBuilder_baseCurrency_13736731501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10730;

    public ForexPriceReq_ForexPriceReqBuilder_baseCurrency_13736731501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term10755 = new Double(0.7655020693602768);
        term10730 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq$ForexPriceReqBuilder"));
        setField(term10730, term10730.getClass(), "baseCurrency", "BKLfkLiZTH");
        setField(term10730, term10730.getClass(), "counterCurrency", "SPpkrGcPRr");
        setField(term10730, term10730.getClass(), "rate", term10755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq$ForexPriceReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        callMethod(klass, "baseCurrency", argTypes, term10730, args);
    }

};


