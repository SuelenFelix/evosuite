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
import java.lang.Integer;

public class UserMemoryChapter_setGaugeNum_13189065559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403657;
     Object term403670;

    public UserMemoryChapter_setGaugeNum_13189065559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403657 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403657, term403657.getClass(), "id", 0L);
        setField(term403657, term403657.getClass(), "user", null);
        setIntField(term403657, term403657.getClass(), "chapterId", 0);
        setIntField(term403657, term403657.getClass(), "jewelCount", 0);
        setIntField(term403657, term403657.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403657, term403657.getClass(), "lastPlayMusicId", 0);
        setIntField(term403657, term403657.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403657, term403657.getClass(), "isDialogWatched", false);
        setBooleanField(term403657, term403657.getClass(), "isStoryWatched", false);
        setBooleanField(term403657, term403657.getClass(), "isBossWatched", false);
        setBooleanField(term403657, term403657.getClass(), "isClear", false);
        setIntField(term403657, term403657.getClass(), "gaugeId", 0);
        setIntField(term403657, term403657.getClass(), "gaugeNum", 0);
        term403670 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term403670;
        callMethod(klass, "setGaugeNum", argTypes, term403657, args);
    }

};


