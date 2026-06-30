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

public class UserMusicDetail_getPlayCount_32209999048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112380;

    public UserMusicDetail_getPlayCount_32209999048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112380 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112380, term112380.getClass(), "id", 0L);
        setField(term112380, term112380.getClass(), "user", null);
        setIntField(term112380, term112380.getClass(), "musicId", 0);
        setIntField(term112380, term112380.getClass(), "level", 0);
        setIntField(term112380, term112380.getClass(), "playCount", 0);
        setIntField(term112380, term112380.getClass(), "scoreMax", 0);
        setIntField(term112380, term112380.getClass(), "missCount", 0);
        setIntField(term112380, term112380.getClass(), "maxComboCount", 0);
        setBooleanField(term112380, term112380.getClass(), "isFullCombo", false);
        setBooleanField(term112380, term112380.getClass(), "isAllJustice", false);
        setBooleanField(term112380, term112380.getClass(), "isSuccess", false);
        setIntField(term112380, term112380.getClass(), "fullChain", 0);
        setIntField(term112380, term112380.getClass(), "maxChain", 0);
        setIntField(term112380, term112380.getClass(), "scoreRank", 0);
        setBooleanField(term112380, term112380.getClass(), "isLock", false);
        setIntField(term112380, term112380.getClass(), "theoryCount", 0);
        setIntField(term112380, term112380.getClass(), "ext1", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term112380, args);
    }

};


