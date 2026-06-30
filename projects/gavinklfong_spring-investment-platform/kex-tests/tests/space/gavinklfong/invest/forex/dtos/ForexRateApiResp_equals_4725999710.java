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

public class ForexRateApiResp_equals_4725999710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14432;
     Object term14472;

    public ForexRateApiResp_equals_4725999710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14445 = new HashMap();
        term14432 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp"));
        Object term14468 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14432, term14432.getClass(), "id", "zUlRdimJtU");
        setField(term14432, term14432.getClass(), "rates", term14445);
        setField(term14432, term14432.getClass(), "base", "xtftXXMbem");
        setIntField(term14468, term14468.getClass(), "year", 2026);
        setShortField(term14468, term14468.getClass(), "month", (short) 12);
        setShortField(term14468, term14468.getClass(), "day", (short) 13);
        setField(term14432, term14432.getClass(), "date", term14468);
        term14472 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateApiResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14472;
        callMethod(klass, "equals", argTypes, term14432, args);
    }

};


