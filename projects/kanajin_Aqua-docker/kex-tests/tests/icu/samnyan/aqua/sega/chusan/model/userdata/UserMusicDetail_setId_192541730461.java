package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserMusicDetail_setId_192541730461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112601;
     Object term112618;

    public UserMusicDetail_setId_192541730461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112601 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112601, term112601.getClass(), "id", 0L);
        setField(term112601, term112601.getClass(), "user", null);
        setIntField(term112601, term112601.getClass(), "musicId", 0);
        setIntField(term112601, term112601.getClass(), "level", 0);
        setIntField(term112601, term112601.getClass(), "playCount", 0);
        setIntField(term112601, term112601.getClass(), "scoreMax", 0);
        setIntField(term112601, term112601.getClass(), "missCount", 0);
        setIntField(term112601, term112601.getClass(), "maxComboCount", 0);
        setBooleanField(term112601, term112601.getClass(), "isFullCombo", false);
        setBooleanField(term112601, term112601.getClass(), "isAllJustice", false);
        setBooleanField(term112601, term112601.getClass(), "isSuccess", false);
        setIntField(term112601, term112601.getClass(), "fullChain", 0);
        setIntField(term112601, term112601.getClass(), "maxChain", 0);
        setIntField(term112601, term112601.getClass(), "scoreRank", 0);
        setBooleanField(term112601, term112601.getClass(), "isLock", false);
        setIntField(term112601, term112601.getClass(), "theoryCount", 0);
        setIntField(term112601, term112601.getClass(), "ext1", 0);
        term112618 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term112618;
        callMethod(klass, "setId", argTypes, term112601, args);
    }

};


