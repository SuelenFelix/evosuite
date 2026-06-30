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

public class ForexRateApiResp_hashCode_40142667812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14554;

    public ForexRateApiResp_hashCode_40142667812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14567 = new HashMap();
        term14554 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term14590 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14554, term14554.getClass(), "id", "jXzmYyrnnT");
        setField(term14554, term14554.getClass(), "rates", term14567);
        setField(term14554, term14554.getClass(), "base", "DyiXbeYIaN");
        setIntField(term14590, term14590.getClass(), "year", 2025);
        setShortField(term14590, term14590.getClass(), "month", (short) 4);
        setShortField(term14590, term14590.getClass(), "day", (short) 23);
        setField(term14554, term14554.getClass(), "date", term14590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term14554, args);
    }

};


