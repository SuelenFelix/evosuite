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

public class PlayerPvRecord_getRgoPlayed_137455029042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652945;

    public PlayerPvRecord_getRgoPlayed_137455029042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652945 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        setLongField(term652945, term652945.getClass(), "id", 0L);
        setField(term652945, term652945.getClass(), "pdId", null);
        setIntField(term652945, term652945.getClass(), "pvId", 0);
        setField(term652945, term652945.getClass(), "edition", null);
        setField(term652945, term652945.getClass(), "difficulty", null);
        setField(term652945, term652945.getClass(), "result", null);
        setIntField(term652945, term652945.getClass(), "maxScore", 0);
        setIntField(term652945, term652945.getClass(), "maxAttain", 0);
        setField(term652945, term652945.getClass(), "challengeKind", null);
        setField(term652945, term652945.getClass(), "rgoPurchased", null);
        setField(term652945, term652945.getClass(), "rgoPlayed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRgoPlayed", argTypes, term652945, args);
    }

};


