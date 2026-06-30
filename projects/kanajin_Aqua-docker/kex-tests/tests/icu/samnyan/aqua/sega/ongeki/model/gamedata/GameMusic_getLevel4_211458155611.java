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

public class GameMusic_getLevel4_211458155611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13905;

    public GameMusic_getLevel4_211458155611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13905 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term13905, term13905.getClass(), "id", 9013624480170062917L);
        setField(term13905, term13905.getClass(), "name", "YkZtEtthvz");
        setField(term13905, term13905.getClass(), "sortName", "dwlZSxlXOo");
        setField(term13905, term13905.getClass(), "artistName", "lKrEAkypza");
        setField(term13905, term13905.getClass(), "genre", "KtuuNAqGCQ");
        setIntField(term13905, term13905.getClass(), "bossCardId", 96566506);
        setIntField(term13905, term13905.getClass(), "bossLevel", -343325701);
        setField(term13905, term13905.getClass(), "level0", "OGQsfjmReM");
        setField(term13905, term13905.getClass(), "level1", "YsUtbngnRO");
        setField(term13905, term13905.getClass(), "level2", "JisaWUxcNb");
        setField(term13905, term13905.getClass(), "level3", "NxgmYPzWCI");
        setField(term13905, term13905.getClass(), "level4", "SqjyKmayBx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel4", argTypes, term13905, args);
    }

};


