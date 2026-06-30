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

public class PlayerPvRecord_hashCode_141932347156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653023;

    public PlayerPvRecord_hashCode_141932347156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653023 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        setLongField(term653023, term653023.getClass(), "id", 0L);
        setField(term653023, term653023.getClass(), "pdId", null);
        setIntField(term653023, term653023.getClass(), "pvId", 0);
        setField(term653023, term653023.getClass(), "edition", null);
        setField(term653023, term653023.getClass(), "difficulty", null);
        setField(term653023, term653023.getClass(), "result", null);
        setIntField(term653023, term653023.getClass(), "maxScore", 0);
        setIntField(term653023, term653023.getClass(), "maxAttain", 0);
        setField(term653023, term653023.getClass(), "challengeKind", null);
        setField(term653023, term653023.getClass(), "rgoPurchased", null);
        setField(term653023, term653023.getClass(), "rgoPlayed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term653023, args);
    }

};


