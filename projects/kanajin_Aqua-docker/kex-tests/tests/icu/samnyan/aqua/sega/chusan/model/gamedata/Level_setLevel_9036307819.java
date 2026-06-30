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

public class Level_setLevel_9036307819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20134;
     Object term20222;

    public Level_setLevel_9036307819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20255 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term20254 = ((Class) term20255).getDeclaredField((String) "RESERVE2");
        ((Field) term20254).setAccessible(true);
        Object enum36 = ((Field) term20254).get((Object) null);
        HashMap term20208 = new HashMap();
        term20134 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term20136 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term20134, term20134.getClass(), "id", 7735460540091431012L);
        setIntField(term20136, term20136.getClass(), "musicId", 958132675);
        setField(term20136, term20136.getClass(), "name", "eBcTbweeYp");
        setField(term20136, term20136.getClass(), "sortName", "drcmjfQUDq");
        setField(term20136, term20136.getClass(), "artistName", "GjdWUoUSyA");
        setField(term20136, term20136.getClass(), "genre", enum36);
        setField(term20136, term20136.getClass(), "releaseVersion", "YEkxWsWaUl");
        setField(term20136, term20136.getClass(), "levels", term20208);
        setField(term20134, term20134.getClass(), "music", term20136);
        setBooleanField(term20134, term20134.getClass(), "enable", true);
        setIntField(term20134, term20134.getClass(), "level", 613256157);
        setIntField(term20134, term20134.getClass(), "levelDecimal", 454242689);
        setIntField(term20134, term20134.getClass(), "diff", 1798354517);
        term20222 = new Integer(-1495693617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20222;
        callMethod(klass, "setLevel", argTypes, term20134, args);
    }

};


