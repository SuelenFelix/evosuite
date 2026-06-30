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

public class PlayerPvRecord_setResult_204072650048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652979;

    public PlayerPvRecord_setResult_204072650048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652979 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        setLongField(term652979, term652979.getClass(), "id", 0L);
        setField(term652979, term652979.getClass(), "pdId", null);
        setIntField(term652979, term652979.getClass(), "pvId", 0);
        setField(term652979, term652979.getClass(), "edition", null);
        setField(term652979, term652979.getClass(), "difficulty", null);
        setField(term652979, term652979.getClass(), "result", null);
        setIntField(term652979, term652979.getClass(), "maxScore", 0);
        setIntField(term652979, term652979.getClass(), "maxAttain", 0);
        setField(term652979, term652979.getClass(), "challengeKind", null);
        setField(term652979, term652979.getClass(), "rgoPurchased", null);
        setField(term652979, term652979.getClass(), "rgoPlayed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResult", argTypes, term652979, args);
    }

};


