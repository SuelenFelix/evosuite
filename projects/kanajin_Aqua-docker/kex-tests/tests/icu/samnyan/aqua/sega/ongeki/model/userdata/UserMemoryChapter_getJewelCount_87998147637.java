package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMemoryChapter_getJewelCount_87998147637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403349;

    public UserMemoryChapter_getJewelCount_87998147637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403349 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403349, term403349.getClass(), "id", 0L);
        setField(term403349, term403349.getClass(), "user", null);
        setIntField(term403349, term403349.getClass(), "chapterId", 0);
        setIntField(term403349, term403349.getClass(), "jewelCount", 0);
        setIntField(term403349, term403349.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403349, term403349.getClass(), "lastPlayMusicId", 0);
        setIntField(term403349, term403349.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403349, term403349.getClass(), "isDialogWatched", false);
        setBooleanField(term403349, term403349.getClass(), "isStoryWatched", false);
        setBooleanField(term403349, term403349.getClass(), "isBossWatched", false);
        setBooleanField(term403349, term403349.getClass(), "isClear", false);
        setIntField(term403349, term403349.getClass(), "gaugeId", 0);
        setIntField(term403349, term403349.getClass(), "gaugeNum", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJewelCount", argTypes, term403349, args);
    }

};


