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

public class GameMusic_getLevel3_211458251710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13703;

    public GameMusic_getLevel3_211458251710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13703 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term13703, term13703.getClass(), "id", -5963439350418910964L);
        setField(term13703, term13703.getClass(), "name", "EusenEbIoF");
        setField(term13703, term13703.getClass(), "sortName", "SScVQYSvWH");
        setField(term13703, term13703.getClass(), "artistName", "MnovcqFhCl");
        setField(term13703, term13703.getClass(), "genre", "qYtAeLzOhW");
        setIntField(term13703, term13703.getClass(), "bossCardId", -2015854073);
        setIntField(term13703, term13703.getClass(), "bossLevel", 538259104);
        setField(term13703, term13703.getClass(), "level0", "tJzmOfcUnY");
        setField(term13703, term13703.getClass(), "level1", "TKlccZUpjz");
        setField(term13703, term13703.getClass(), "level2", "GGzwMoHZXC");
        setField(term13703, term13703.getClass(), "level3", "IpmgwHTgnG");
        setField(term13703, term13703.getClass(), "level4", "tIpkeYIezR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel3", argTypes, term13703, args);
    }

};


