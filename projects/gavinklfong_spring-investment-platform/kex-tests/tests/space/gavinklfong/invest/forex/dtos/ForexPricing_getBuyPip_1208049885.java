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

public class ForexPricing_getBuyPip_1208049885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;

    public ForexPricing_getBuyPip_1208049885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term766 = new Integer(1227103734);
        Integer term768 = new Integer(-1339778481);
        term741 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing"));
        setField(term741, term741.getClass(), "baseCurrency", "RMFIsYGgne");
        setField(term741, term741.getClass(), "counterCurrency", "NRdvgJlhkX");
        setField(term741, term741.getClass(), "buyPip", term766);
        setField(term741, term741.getClass(), "sellPip", term768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuyPip", argTypes, term741, args);
    }

};


