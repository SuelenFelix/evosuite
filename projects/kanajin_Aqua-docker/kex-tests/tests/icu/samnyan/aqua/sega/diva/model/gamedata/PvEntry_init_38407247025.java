package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PvEntry_init_38407247025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90640;
     Object term90642;

    public PvEntry_init_38407247025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90640 = new Integer(0);
        term90642 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.time.LocalDateTime");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = term90640;
        args[1] = null;
        args[2] = term90642;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


