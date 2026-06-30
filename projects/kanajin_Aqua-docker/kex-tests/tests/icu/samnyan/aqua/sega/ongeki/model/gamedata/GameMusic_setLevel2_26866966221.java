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

public class GameMusic_setLevel2_26866966221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16063;

    public GameMusic_setLevel2_26866966221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16063 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term16063, term16063.getClass(), "id", -8876856890348836498L);
        setField(term16063, term16063.getClass(), "name", "mfHtgSbdjD");
        setField(term16063, term16063.getClass(), "sortName", "cmuaUiHMVL");
        setField(term16063, term16063.getClass(), "artistName", "xjoSGPWUgu");
        setField(term16063, term16063.getClass(), "genre", "uzmqjnOUXu");
        setIntField(term16063, term16063.getClass(), "bossCardId", 2098647989);
        setIntField(term16063, term16063.getClass(), "bossLevel", 1598895173);
        setField(term16063, term16063.getClass(), "level0", "xeyjTOCOJb");
        setField(term16063, term16063.getClass(), "level1", "DGRqjjdhzy");
        setField(term16063, term16063.getClass(), "level2", "lQFkjJUPAR");
        setField(term16063, term16063.getClass(), "level3", "BsuVlGUUjV");
        setField(term16063, term16063.getClass(), "level4", "bHHjfDCntT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEphiduvkv";
        callMethod(klass, "setLevel2", argTypes, term16063, args);
    }

};


