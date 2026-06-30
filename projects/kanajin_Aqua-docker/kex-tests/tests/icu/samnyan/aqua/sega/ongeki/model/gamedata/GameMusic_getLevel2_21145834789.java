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

public class GameMusic_getLevel2_21145834789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13501;

    public GameMusic_getLevel2_21145834789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13501 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term13501, term13501.getClass(), "id", -7291743527973326814L);
        setField(term13501, term13501.getClass(), "name", "yeSXGqQExb");
        setField(term13501, term13501.getClass(), "sortName", "uXYcXVYJZM");
        setField(term13501, term13501.getClass(), "artistName", "BJhjdJUhkz");
        setField(term13501, term13501.getClass(), "genre", "cdHYQDgUZR");
        setIntField(term13501, term13501.getClass(), "bossCardId", 480137250);
        setIntField(term13501, term13501.getClass(), "bossLevel", -341152642);
        setField(term13501, term13501.getClass(), "level0", "KAORSSPSeV");
        setField(term13501, term13501.getClass(), "level1", "UimMMORkzd");
        setField(term13501, term13501.getClass(), "level2", "huVIXUWLtI");
        setField(term13501, term13501.getClass(), "level3", "vhKzFyKPOT");
        setField(term13501, term13501.getClass(), "level4", "nQhIgWXdRc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel2", argTypes, term13501, args);
    }

};


