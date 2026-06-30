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

public class ForexRateApiResp_getDate_1823853855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14061;

    public ForexRateApiResp_getDate_1823853855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14074 = new HashMap();
        term14061 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term14097 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14061, term14061.getClass(), "id", "XkIoWJRNwN");
        setField(term14061, term14061.getClass(), "rates", term14074);
        setField(term14061, term14061.getClass(), "base", "HHmNoYxIGj");
        setIntField(term14097, term14097.getClass(), "year", 2015);
        setShortField(term14097, term14097.getClass(), "month", (short) 9);
        setShortField(term14097, term14097.getClass(), "day", (short) 19);
        setField(term14061, term14061.getClass(), "date", term14097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term14061, args);
    }

};


