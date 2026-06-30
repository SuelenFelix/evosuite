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
import java.lang.Long;
import java.lang.Integer;

public class GameCard_init_49762145131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7281;
     Object term7319;
     Object term7369;
     Object term7371;

    public GameCard_init_49762145131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7281 = new Long(-7612550318181586304L);
        term7319 = new Integer(-344842608);
        term7369 = new Integer(941650513);
        term7371 = new Integer(444029505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[13];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        Object[] args = new Object[13];
        args[0] = term7281;
        args[1] = "BbNeQJpYPr";
        args[2] = "riMtzCoxNj";
        args[3] = "YAXkVjQZcV";
        args[4] = term7319;
        args[5] = "pumvwBWvpy";
        args[6] = "HwLHeGLyhe";
        args[7] = "RDnkgWkcbz";
        args[8] = "IBpaxltauX";
        args[9] = term7369;
        args[10] = term7371;
        args[11] = "hePqROaplw";
        args[12] = "PJcSNDruWd";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


