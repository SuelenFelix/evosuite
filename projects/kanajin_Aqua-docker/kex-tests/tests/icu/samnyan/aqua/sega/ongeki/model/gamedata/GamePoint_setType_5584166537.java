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

public class GamePoint_setType_5584166537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24166;
     Object enum21;

    public GamePoint_setType_5584166537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24244 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term24243 = ((Class) term24244).getDeclaredField((String) "A_Credit2");
        ((Field) term24243).setAccessible(true);
        Object enum20 = ((Field) term24243).get((Object) null);
        term24166 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term24166, term24166.getClass(), "id", 7495904023107549024L);
        setField(term24166, term24166.getClass(), "type", enum20);
        setIntField(term24166, term24166.getClass(), "cost", -1122880881);
        setField(term24166, term24166.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term24166, term24166.getClass(), "endDate", "2099-01-01 05:00:00.0");
        Class<? extends Object> term24585 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term24584 = ((Class) term24585).getDeclaredField((String) "B_Credit3");
        ((Field) term24584).setAccessible(true);
        enum21 = ((Field) term24584).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Object[] args = new Object[1];
        args[0] = enum21;
        callMethod(klass, "setType", argTypes, term24166, args);
    }

};


