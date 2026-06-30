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

public class GamePoint_getStartDate_6391446834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22952;

    public GamePoint_getStartDate_6391446834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23016 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term23015 = ((Class) term23016).getDeclaredField((String) "B_Credit3");
        ((Field) term23015).setAccessible(true);
        Object enum17 = ((Field) term23015).get((Object) null);
        term22952 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term22952, term22952.getClass(), "id", 6843866297465638866L);
        setField(term22952, term22952.getClass(), "type", enum17);
        setIntField(term22952, term22952.getClass(), "cost", -860131894);
        setField(term22952, term22952.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term22952, term22952.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term22952, args);
    }

};


