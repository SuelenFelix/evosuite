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

public class ForexPricing_ForexPricingBuilder_buyPip_5131109683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45919;
     Object term45948;

    public ForexPricing_ForexPricingBuilder_buyPip_5131109683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45944 = new Integer(1193880199);
        Integer term45946 = new Integer(-1087774327);
        term45919 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder"));
        setField(term45919, term45919.getClass(), "baseCurrency", "VoghngXfsK");
        setField(term45919, term45919.getClass(), "counterCurrency", "GbahCBMvct");
        setField(term45919, term45919.getClass(), "buyPip", term45944);
        setField(term45919, term45919.getClass(), "sellPip", term45946);
        term45948 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing$ForexPricingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term45948;
        callMethod(klass, "buyPip", argTypes, term45919, args);
    }

};


