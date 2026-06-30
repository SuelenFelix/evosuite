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

public class ForexPricing_setCounterCurrency_10521682418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910;

    public ForexPricing_setCounterCurrency_10521682418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term935 = new Integer(1585847225);
        Integer term937 = new Integer(597278769);
        term910 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing"));
        setField(term910, term910.getClass(), "baseCurrency", "ZiaGIbnzTs");
        setField(term910, term910.getClass(), "counterCurrency", "tbcdzjIfER");
        setField(term910, term910.getClass(), "buyPip", term935);
        setField(term910, term910.getClass(), "sellPip", term937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setCounterCurrency", argTypes, term910, args);
    }

};


