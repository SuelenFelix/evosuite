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

public class ForexRateApiResp_getId_15323851252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13881;

    public ForexRateApiResp_getId_15323851252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13894 = new HashMap();
        term13881 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term13917 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13881, term13881.getClass(), "id", "EeBVbzjcCI");
        setField(term13881, term13881.getClass(), "rates", term13894);
        setField(term13881, term13881.getClass(), "base", "FPvxVzzSvD");
        setIntField(term13917, term13917.getClass(), "year", 2016);
        setShortField(term13917, term13917.getClass(), "month", (short) 11);
        setShortField(term13917, term13917.getClass(), "day", (short) 29);
        setField(term13881, term13881.getClass(), "date", term13917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13881, args);
    }

};


