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

public class ForexRateApiResp_setId_12320210536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14121;

    public ForexRateApiResp_setId_12320210536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14134 = new HashMap();
        term14121 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term14157 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14121, term14121.getClass(), "id", "PtirvZmsGt");
        setField(term14121, term14121.getClass(), "rates", term14134);
        setField(term14121, term14121.getClass(), "base", "hMmaoREuCK");
        setIntField(term14157, term14157.getClass(), "year", 2018);
        setShortField(term14157, term14157.getClass(), "month", (short) 1);
        setShortField(term14157, term14157.getClass(), "day", (short) 13);
        setField(term14121, term14121.getClass(), "date", term14157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VeDtgDzGAN";
        callMethod(klass, "setId", argTypes, term14121, args);
    }

};


