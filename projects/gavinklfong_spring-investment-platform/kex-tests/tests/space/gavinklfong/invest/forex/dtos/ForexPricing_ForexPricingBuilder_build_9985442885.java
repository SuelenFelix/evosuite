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

public class ForexPricing_ForexPricingBuilder_build_9985442885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46021;

    public ForexPricing_ForexPricingBuilder_build_9985442885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term46046 = new Integer(1962444399);
        Integer term46048 = new Integer(767834723);
        term46021 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder"));
        setField(term46021, term46021.getClass(), "baseCurrency", "XtiurrVYKw");
        setField(term46021, term46021.getClass(), "counterCurrency", "rsumfoDNHa");
        setField(term46021, term46021.getClass(), "buyPip", term46046);
        setField(term46021, term46021.getClass(), "sellPip", term46048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term46021, args);
    }

};


