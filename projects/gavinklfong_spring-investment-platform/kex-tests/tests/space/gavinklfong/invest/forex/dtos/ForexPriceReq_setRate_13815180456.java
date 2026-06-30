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

public class ForexPriceReq_setRate_13815180456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14965;
     Object term14992;

    public ForexPriceReq_setRate_13815180456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term14990 = new Double(0.8454723071922143);
        term14965 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq"));
        setField(term14965, term14965.getClass(), "baseCurrency", "wzsPSPcRdj");
        setField(term14965, term14965.getClass(), "counterCurrency", "kGMQdqJYyB");
        setField(term14965, term14965.getClass(), "rate", term14990);
        term14992 = new Double(0.8566567697571895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term14992;
        callMethod(klass, "setRate", argTypes, term14965, args);
    }

};


