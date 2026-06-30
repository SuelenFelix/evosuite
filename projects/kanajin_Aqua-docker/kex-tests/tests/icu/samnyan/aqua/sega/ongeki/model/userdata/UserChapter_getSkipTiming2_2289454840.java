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

public class UserChapter_getSkipTiming2_2289454840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95905;

    public UserChapter_getSkipTiming2_2289454840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95905 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        setLongField(term95905, term95905.getClass(), "id", 0L);
        setField(term95905, term95905.getClass(), "user", null);
        setIntField(term95905, term95905.getClass(), "chapterId", 0);
        setIntField(term95905, term95905.getClass(), "jewelCount", 0);
        setIntField(term95905, term95905.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term95905, term95905.getClass(), "lastPlayMusicId", 0);
        setIntField(term95905, term95905.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term95905, term95905.getClass(), "isStoryWatched", false);
        setBooleanField(term95905, term95905.getClass(), "isClear", false);
        setIntField(term95905, term95905.getClass(), "skipTiming1", 0);
        setIntField(term95905, term95905.getClass(), "skipTiming2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkipTiming2", argTypes, term95905, args);
    }

};


