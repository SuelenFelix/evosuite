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

public class UserMusicDetail_getLevel_36897660531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70634;

    public UserMusicDetail_getLevel_36897660531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70634 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        setLongField(term70634, term70634.getClass(), "id", 0L);
        setField(term70634, term70634.getClass(), "user", null);
        setIntField(term70634, term70634.getClass(), "musicId", 0);
        setIntField(term70634, term70634.getClass(), "level", 0);
        setIntField(term70634, term70634.getClass(), "playCount", 0);
        setIntField(term70634, term70634.getClass(), "achievement", 0);
        setIntField(term70634, term70634.getClass(), "comboStatus", 0);
        setIntField(term70634, term70634.getClass(), "syncStatus", 0);
        setIntField(term70634, term70634.getClass(), "deluxscoreMax", 0);
        setIntField(term70634, term70634.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term70634, args);
    }

};


