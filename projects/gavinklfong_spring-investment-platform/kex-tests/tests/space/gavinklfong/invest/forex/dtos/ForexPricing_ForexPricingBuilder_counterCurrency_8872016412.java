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

public class ForexPricing_ForexPricingBuilder_counterCurrency_8872016412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45848;

    public ForexPricing_ForexPricingBuilder_counterCurrency_8872016412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45873 = new Integer(-73683645);
        Integer term45875 = new Integer(-226514366);
        term45848 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder"));
        setField(term45848, term45848.getClass(), "baseCurrency", "oNLcCYDAsO");
        setField(term45848, term45848.getClass(), "counterCurrency", "CNqMxLvtcJ");
        setField(term45848, term45848.getClass(), "buyPip", term45873);
        setField(term45848, term45848.getClass(), "sellPip", term45875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ktbqerIaKW";
        callMethod(klass, "counterCurrency", argTypes, term45848, args);
    }

};


