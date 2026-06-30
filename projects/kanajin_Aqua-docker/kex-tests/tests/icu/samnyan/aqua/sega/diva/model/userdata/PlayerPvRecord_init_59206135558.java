package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class PlayerPvRecord_init_59206135558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653033;
     Object term653035;
     Object term653037;
     Object term653039;

    public PlayerPvRecord_init_59206135558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653033 = new Long(0L);
        term653035 = new Integer(0);
        term653037 = new Integer(0);
        term653039 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        Object[] args = new Object[11];
        args[0] = term653033;
        args[1] = null;
        args[2] = term653035;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term653037;
        args[7] = term653039;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


