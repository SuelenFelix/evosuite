package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GamePoint_getEndDate_8280890105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23356;

    public GamePoint_getEndDate_8280890105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23420 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term23419 = ((Class) term23420).getDeclaredField((String) "B_Credit1");
        ((Field) term23419).setAccessible(true);
        Object enum18 = ((Field) term23419).get((Object) null);
        term23356 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term23356, term23356.getClass(), "id", -4023935540989049732L);
        setField(term23356, term23356.getClass(), "type", enum18);
        setIntField(term23356, term23356.getClass(), "cost", -1022990421);
        setField(term23356, term23356.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term23356, term23356.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term23356, args);
    }

};


