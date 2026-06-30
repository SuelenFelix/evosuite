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

public class GameMusic_setArtistName_198509168615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14759;

    public GameMusic_setArtistName_198509168615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14759 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term14759, term14759.getClass(), "id", -1983291584002806658L);
        setField(term14759, term14759.getClass(), "name", "IApvtmfhnq");
        setField(term14759, term14759.getClass(), "sortName", "VSaNnhMpRc");
        setField(term14759, term14759.getClass(), "artistName", "QNjNTLlUaV");
        setField(term14759, term14759.getClass(), "genre", "hIYsRyOZxk");
        setIntField(term14759, term14759.getClass(), "bossCardId", -1222006000);
        setIntField(term14759, term14759.getClass(), "bossLevel", 2095798786);
        setField(term14759, term14759.getClass(), "level0", "RjNoEywJbC");
        setField(term14759, term14759.getClass(), "level1", "RTTvrwwhou");
        setField(term14759, term14759.getClass(), "level2", "lRORwXipuk");
        setField(term14759, term14759.getClass(), "level3", "fVdTcjgHdw");
        setField(term14759, term14759.getClass(), "level4", "wwAwLLcLPp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nHpMKOmlpQ";
        callMethod(klass, "setArtistName", argTypes, term14759, args);
    }

};


