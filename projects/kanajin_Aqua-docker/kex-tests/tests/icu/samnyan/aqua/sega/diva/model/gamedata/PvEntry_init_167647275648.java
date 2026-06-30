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
import java.lang.Long;
import java.lang.Integer;

public class PvEntry_init_167647275648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90738;
     Object term90740;
     Object term90742;

    public PvEntry_init_167647275648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90738 = new Long(0L);
        term90740 = new Integer(0);
        term90742 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        argTypes[5] = Class.forName("java.time.LocalDateTime");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        argTypes[8] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[9];
        args[0] = term90738;
        args[1] = term90740;
        args[2] = null;
        args[3] = term90742;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


