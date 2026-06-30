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

public class ForexPriceReq_ForexPriceReqBuilder_rate_11974066283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10868;
     Object term10895;

    public ForexPriceReq_ForexPriceReqBuilder_rate_11974066283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term10893 = new Double(0.7031006357544823);
        term10868 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq$ForexPriceReqBuilder"));
        setField(term10868, term10868.getClass(), "baseCurrency", "qxSDVejjiY");
        setField(term10868, term10868.getClass(), "counterCurrency", "xBsXSDjXYK");
        setField(term10868, term10868.getClass(), "rate", term10893);
        term10895 = new Double(0.9527281779865117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq$ForexPriceReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term10895;
        callMethod(klass, "rate", argTypes, term10868, args);
    }

};


