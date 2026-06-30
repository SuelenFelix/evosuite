package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;

public class Level_setDiff_199036473411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20946;
     Object term21034;

    public Level_setDiff_199036473411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21067 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term21066 = ((Class) term21067).getDeclaredField((String) "RESERVE2");
        ((Field) term21066).setAccessible(true);
        Object enum38 = ((Field) term21066).get((Object) null);
        HashMap term21020 = new HashMap();
        term20946 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term20948 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term20946, term20946.getClass(), "id", 2022482096970820459L);
        setIntField(term20948, term20948.getClass(), "musicId", -965421502);
        setField(term20948, term20948.getClass(), "name", "oApgdbwnti");
        setField(term20948, term20948.getClass(), "sortName", "YcgHACNgyo");
        setField(term20948, term20948.getClass(), "artistName", "MrUPJzBTEn");
        setField(term20948, term20948.getClass(), "genre", enum38);
        setField(term20948, term20948.getClass(), "releaseVersion", "IaSymdfFGa");
        setField(term20948, term20948.getClass(), "levels", term21020);
        setField(term20946, term20946.getClass(), "music", term20948);
        setBooleanField(term20946, term20946.getClass(), "enable", false);
        setIntField(term20946, term20946.getClass(), "level", -1527326823);
        setIntField(term20946, term20946.getClass(), "levelDecimal", 469871899);
        setIntField(term20946, term20946.getClass(), "diff", -1348703436);
        term21034 = new Integer(-2027012650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21034;
        callMethod(klass, "setDiff", argTypes, term20946, args);
    }

};


