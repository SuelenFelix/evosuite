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
import java.lang.Long;

public class GamePoint_setId_20906442016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23760;
     Object term23823;

    public GamePoint_setId_20906442016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23826 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term23825 = ((Class) term23826).getDeclaredField((String) "A_Credit2");
        ((Field) term23825).setAccessible(true);
        Object enum19 = ((Field) term23825).get((Object) null);
        term23760 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term23760, term23760.getClass(), "id", 855932984568615096L);
        setField(term23760, term23760.getClass(), "type", enum19);
        setIntField(term23760, term23760.getClass(), "cost", 1045547089);
        setField(term23760, term23760.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term23760, term23760.getClass(), "endDate", "2099-01-01 05:00:00.0");
        term23823 = new Long(-1616722610139554082L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term23823;
        callMethod(klass, "setId", argTypes, term23760, args);
    }

};


