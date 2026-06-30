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
import java.lang.Integer;

public class PlayerPvRecord_setMaxScore_195604514849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652984;
     Object term652989;

    public PlayerPvRecord_setMaxScore_195604514849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652984 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        setLongField(term652984, term652984.getClass(), "id", 0L);
        setField(term652984, term652984.getClass(), "pdId", null);
        setIntField(term652984, term652984.getClass(), "pvId", 0);
        setField(term652984, term652984.getClass(), "edition", null);
        setField(term652984, term652984.getClass(), "difficulty", null);
        setField(term652984, term652984.getClass(), "result", null);
        setIntField(term652984, term652984.getClass(), "maxScore", 0);
        setIntField(term652984, term652984.getClass(), "maxAttain", 0);
        setField(term652984, term652984.getClass(), "challengeKind", null);
        setField(term652984, term652984.getClass(), "rgoPurchased", null);
        setField(term652984, term652984.getClass(), "rgoPlayed", null);
        term652989 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term652989;
        callMethod(klass, "setMaxScore", argTypes, term652984, args);
    }

};


