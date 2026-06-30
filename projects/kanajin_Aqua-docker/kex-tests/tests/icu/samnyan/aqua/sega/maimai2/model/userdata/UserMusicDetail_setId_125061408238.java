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
import java.lang.Long;

public class UserMusicDetail_setId_125061408238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70704;
     Object term70714;

    public UserMusicDetail_setId_125061408238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70704 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        setLongField(term70704, term70704.getClass(), "id", 0L);
        setField(term70704, term70704.getClass(), "user", null);
        setIntField(term70704, term70704.getClass(), "musicId", 0);
        setIntField(term70704, term70704.getClass(), "level", 0);
        setIntField(term70704, term70704.getClass(), "playCount", 0);
        setIntField(term70704, term70704.getClass(), "achievement", 0);
        setIntField(term70704, term70704.getClass(), "comboStatus", 0);
        setIntField(term70704, term70704.getClass(), "syncStatus", 0);
        setIntField(term70704, term70704.getClass(), "deluxscoreMax", 0);
        setIntField(term70704, term70704.getClass(), "scoreRank", 0);
        term70714 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term70714;
        callMethod(klass, "setId", argTypes, term70704, args);
    }

};


