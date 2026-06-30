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

public class UserMemoryChapter_isClear_28320786944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403440;

    public UserMemoryChapter_isClear_28320786944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403440 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403440, term403440.getClass(), "id", 0L);
        setField(term403440, term403440.getClass(), "user", null);
        setIntField(term403440, term403440.getClass(), "chapterId", 0);
        setIntField(term403440, term403440.getClass(), "jewelCount", 0);
        setIntField(term403440, term403440.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403440, term403440.getClass(), "lastPlayMusicId", 0);
        setIntField(term403440, term403440.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403440, term403440.getClass(), "isDialogWatched", false);
        setBooleanField(term403440, term403440.getClass(), "isStoryWatched", false);
        setBooleanField(term403440, term403440.getClass(), "isBossWatched", false);
        setBooleanField(term403440, term403440.getClass(), "isClear", false);
        setIntField(term403440, term403440.getClass(), "gaugeId", 0);
        setIntField(term403440, term403440.getClass(), "gaugeNum", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term403440, args);
    }

};


