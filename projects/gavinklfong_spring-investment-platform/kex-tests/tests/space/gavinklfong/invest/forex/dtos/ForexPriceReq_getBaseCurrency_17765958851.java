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

public class ForexPriceReq_getBaseCurrency_17765958851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14686;

    public ForexPriceReq_getBaseCurrency_17765958851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term14711 = new Double(0.7591353014991907);
        term14686 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq"));
        setField(term14686, term14686.getClass(), "baseCurrency", "RbVQXSpxXy");
        setField(term14686, term14686.getClass(), "counterCurrency", "YpJbIgJWWv");
        setField(term14686, term14686.getClass(), "rate", term14711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrency", argTypes, term14686, args);
    }

};


