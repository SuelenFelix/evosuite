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

public class PlayerPvRecord_setId_36638029743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652950;
     Object term652955;

    public PlayerPvRecord_setId_36638029743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652950 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        setLongField(term652950, term652950.getClass(), "id", 0L);
        setField(term652950, term652950.getClass(), "pdId", null);
        setIntField(term652950, term652950.getClass(), "pvId", 0);
        setField(term652950, term652950.getClass(), "edition", null);
        setField(term652950, term652950.getClass(), "difficulty", null);
        setField(term652950, term652950.getClass(), "result", null);
        setIntField(term652950, term652950.getClass(), "maxScore", 0);
        setIntField(term652950, term652950.getClass(), "maxAttain", 0);
        setField(term652950, term652950.getClass(), "challengeKind", null);
        setField(term652950, term652950.getClass(), "rgoPurchased", null);
        setField(term652950, term652950.getClass(), "rgoPlayed", null);
        term652955 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term652955;
        callMethod(klass, "setId", argTypes, term652950, args);
    }

};


