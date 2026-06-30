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

public class PlayerPvRecord_canEqual_16647416755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653018;

    public PlayerPvRecord_canEqual_16647416755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653018 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        setLongField(term653018, term653018.getClass(), "id", 0L);
        setField(term653018, term653018.getClass(), "pdId", null);
        setIntField(term653018, term653018.getClass(), "pvId", 0);
        setField(term653018, term653018.getClass(), "edition", null);
        setField(term653018, term653018.getClass(), "difficulty", null);
        setField(term653018, term653018.getClass(), "result", null);
        setIntField(term653018, term653018.getClass(), "maxScore", 0);
        setIntField(term653018, term653018.getClass(), "maxAttain", 0);
        setField(term653018, term653018.getClass(), "challengeKind", null);
        setField(term653018, term653018.getClass(), "rgoPurchased", null);
        setField(term653018, term653018.getClass(), "rgoPlayed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term653018, args);
    }

};


