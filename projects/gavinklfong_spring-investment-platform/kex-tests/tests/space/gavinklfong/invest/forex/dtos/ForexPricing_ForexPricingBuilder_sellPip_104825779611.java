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

public class ForexPricing_ForexPricingBuilder_sellPip_104825779611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46122;

    public ForexPricing_ForexPricingBuilder_sellPip_104825779611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46122 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder"));
        setField(term46122, term46122.getClass(), "baseCurrency", null);
        setField(term46122, term46122.getClass(), "counterCurrency", null);
        setField(term46122, term46122.getClass(), "buyPip", null);
        setField(term46122, term46122.getClass(), "sellPip", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "sellPip", argTypes, term46122, args);
    }

};


