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

public class PlayerPvRecord_equals_97063679654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653013;

    public PlayerPvRecord_equals_97063679654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653013 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        setLongField(term653013, term653013.getClass(), "id", 0L);
        setField(term653013, term653013.getClass(), "pdId", null);
        setIntField(term653013, term653013.getClass(), "pvId", 0);
        setField(term653013, term653013.getClass(), "edition", null);
        setField(term653013, term653013.getClass(), "difficulty", null);
        setField(term653013, term653013.getClass(), "result", null);
        setIntField(term653013, term653013.getClass(), "maxScore", 0);
        setIntField(term653013, term653013.getClass(), "maxAttain", 0);
        setField(term653013, term653013.getClass(), "challengeKind", null);
        setField(term653013, term653013.getClass(), "rgoPurchased", null);
        setField(term653013, term653013.getClass(), "rgoPlayed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term653013, args);
    }

};


