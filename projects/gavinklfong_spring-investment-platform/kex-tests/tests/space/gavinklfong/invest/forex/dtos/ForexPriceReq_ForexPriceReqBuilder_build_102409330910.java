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

public class ForexPriceReq_ForexPriceReqBuilder_build_102409330910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11014;

    public ForexPriceReq_ForexPriceReqBuilder_build_102409330910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11014 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq$ForexPriceReqBuilder"));
        setField(term11014, term11014.getClass(), "baseCurrency", null);
        setField(term11014, term11014.getClass(), "counterCurrency", null);
        setField(term11014, term11014.getClass(), "rate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq$ForexPriceReqBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term11014, args);
    }

};


