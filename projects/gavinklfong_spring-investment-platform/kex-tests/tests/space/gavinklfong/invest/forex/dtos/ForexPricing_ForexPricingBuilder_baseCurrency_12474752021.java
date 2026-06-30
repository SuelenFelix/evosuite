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
import java.lang.Integer;

public class ForexPricing_ForexPricingBuilder_baseCurrency_12474752021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45777;

    public ForexPricing_ForexPricingBuilder_baseCurrency_12474752021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45802 = new Integer(-203030934);
        Integer term45804 = new Integer(-1179120542);
        term45777 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder"));
        setField(term45777, term45777.getClass(), "baseCurrency", "IlBhdrCvHq");
        setField(term45777, term45777.getClass(), "counterCurrency", "OirVUQhauU");
        setField(term45777, term45777.getClass(), "buyPip", term45802);
        setField(term45777, term45777.getClass(), "sellPip", term45804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GLbyDfbNZI";
        callMethod(klass, "baseCurrency", argTypes, term45777, args);
    }

};


