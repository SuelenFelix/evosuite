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

public class UserChapter_setSkipTiming1_185071108350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96031;
     Object term96042;

    public UserChapter_setSkipTiming1_185071108350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96031 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        setLongField(term96031, term96031.getClass(), "id", 0L);
        setField(term96031, term96031.getClass(), "user", null);
        setIntField(term96031, term96031.getClass(), "chapterId", 0);
        setIntField(term96031, term96031.getClass(), "jewelCount", 0);
        setIntField(term96031, term96031.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term96031, term96031.getClass(), "lastPlayMusicId", 0);
        setIntField(term96031, term96031.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term96031, term96031.getClass(), "isStoryWatched", false);
        setBooleanField(term96031, term96031.getClass(), "isClear", false);
        setIntField(term96031, term96031.getClass(), "skipTiming1", 0);
        setIntField(term96031, term96031.getClass(), "skipTiming2", 0);
        term96042 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term96042;
        callMethod(klass, "setSkipTiming1", argTypes, term96031, args);
    }

};


