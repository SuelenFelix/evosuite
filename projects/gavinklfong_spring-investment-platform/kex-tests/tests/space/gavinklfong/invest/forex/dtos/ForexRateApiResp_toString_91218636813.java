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

public class ForexRateApiResp_toString_91218636813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14614;

    public ForexRateApiResp_toString_91218636813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14627 = new HashMap();
        term14614 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term14650 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14614, term14614.getClass(), "id", "VGizxZnyHX");
        setField(term14614, term14614.getClass(), "rates", term14627);
        setField(term14614, term14614.getClass(), "base", "ekxGuOYIwi");
        setIntField(term14650, term14650.getClass(), "year", 2012);
        setShortField(term14650, term14650.getClass(), "month", (short) 10);
        setShortField(term14650, term14650.getClass(), "day", (short) 1);
        setField(term14614, term14614.getClass(), "date", term14650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14614, args);
    }

};


