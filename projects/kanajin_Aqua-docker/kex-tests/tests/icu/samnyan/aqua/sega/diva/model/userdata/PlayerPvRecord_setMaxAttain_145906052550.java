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

public class PlayerPvRecord_setMaxAttain_145906052550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652991;
     Object term652996;

    public PlayerPvRecord_setMaxAttain_145906052550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652991 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        setLongField(term652991, term652991.getClass(), "id", 0L);
        setField(term652991, term652991.getClass(), "pdId", null);
        setIntField(term652991, term652991.getClass(), "pvId", 0);
        setField(term652991, term652991.getClass(), "edition", null);
        setField(term652991, term652991.getClass(), "difficulty", null);
        setField(term652991, term652991.getClass(), "result", null);
        setIntField(term652991, term652991.getClass(), "maxScore", 0);
        setIntField(term652991, term652991.getClass(), "maxAttain", 0);
        setField(term652991, term652991.getClass(), "challengeKind", null);
        setField(term652991, term652991.getClass(), "rgoPurchased", null);
        setField(term652991, term652991.getClass(), "rgoPlayed", null);
        term652996 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term652996;
        callMethod(klass, "setMaxAttain", argTypes, term652991, args);
    }

};


