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
import java.util.HashMap;
import java.lang.Object;

public class ForexRateApiResp_setBase_6674386058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14286;

    public ForexRateApiResp_setBase_6674386058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14299 = new HashMap();
        term14286 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term14322 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14286, term14286.getClass(), "id", "PapWxkhEWe");
        setField(term14286, term14286.getClass(), "rates", term14299);
        setField(term14286, term14286.getClass(), "base", "XYtryyobou");
        setIntField(term14322, term14322.getClass(), "year", 2017);
        setShortField(term14322, term14322.getClass(), "month", (short) 5);
        setShortField(term14322, term14322.getClass(), "day", (short) 21);
        setField(term14286, term14286.getClass(), "date", term14322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OYbzXylRWW";
        callMethod(klass, "setBase", argTypes, term14286, args);
    }

};


