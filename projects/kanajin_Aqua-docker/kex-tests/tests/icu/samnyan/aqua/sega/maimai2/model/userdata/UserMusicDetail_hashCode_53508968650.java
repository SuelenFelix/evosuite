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

public class UserMusicDetail_hashCode_53508968650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70842;

    public UserMusicDetail_hashCode_53508968650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70842 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        setLongField(term70842, term70842.getClass(), "id", 0L);
        setField(term70842, term70842.getClass(), "user", null);
        setIntField(term70842, term70842.getClass(), "musicId", 0);
        setIntField(term70842, term70842.getClass(), "level", 0);
        setIntField(term70842, term70842.getClass(), "playCount", 0);
        setIntField(term70842, term70842.getClass(), "achievement", 0);
        setIntField(term70842, term70842.getClass(), "comboStatus", 0);
        setIntField(term70842, term70842.getClass(), "syncStatus", 0);
        setIntField(term70842, term70842.getClass(), "deluxscoreMax", 0);
        setIntField(term70842, term70842.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term70842, args);
    }

};


