package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMusicDetail_equals_8640301148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70822;

    public UserMusicDetail_equals_8640301148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70822 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        setLongField(term70822, term70822.getClass(), "id", 0L);
        setField(term70822, term70822.getClass(), "user", null);
        setIntField(term70822, term70822.getClass(), "musicId", 0);
        setIntField(term70822, term70822.getClass(), "level", 0);
        setIntField(term70822, term70822.getClass(), "playCount", 0);
        setIntField(term70822, term70822.getClass(), "achievement", 0);
        setIntField(term70822, term70822.getClass(), "comboStatus", 0);
        setIntField(term70822, term70822.getClass(), "syncStatus", 0);
        setIntField(term70822, term70822.getClass(), "deluxscoreMax", 0);
        setIntField(term70822, term70822.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term70822, args);
    }

};


