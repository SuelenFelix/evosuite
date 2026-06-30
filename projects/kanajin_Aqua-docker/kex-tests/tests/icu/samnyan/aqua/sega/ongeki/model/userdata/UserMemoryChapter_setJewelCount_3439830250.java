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

public class UserMemoryChapter_setJewelCount_3439830250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403522;
     Object term403535;

    public UserMemoryChapter_setJewelCount_3439830250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403522 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403522, term403522.getClass(), "id", 0L);
        setField(term403522, term403522.getClass(), "user", null);
        setIntField(term403522, term403522.getClass(), "chapterId", 0);
        setIntField(term403522, term403522.getClass(), "jewelCount", 0);
        setIntField(term403522, term403522.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403522, term403522.getClass(), "lastPlayMusicId", 0);
        setIntField(term403522, term403522.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403522, term403522.getClass(), "isDialogWatched", false);
        setBooleanField(term403522, term403522.getClass(), "isStoryWatched", false);
        setBooleanField(term403522, term403522.getClass(), "isBossWatched", false);
        setBooleanField(term403522, term403522.getClass(), "isClear", false);
        setIntField(term403522, term403522.getClass(), "gaugeId", 0);
        setIntField(term403522, term403522.getClass(), "gaugeNum", 0);
        term403535 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term403535;
        callMethod(klass, "setJewelCount", argTypes, term403522, args);
    }

};


