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

public class UserChapter_hashCode_211455714054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96079;

    public UserChapter_hashCode_211455714054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96079 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        setLongField(term96079, term96079.getClass(), "id", 0L);
        setField(term96079, term96079.getClass(), "user", null);
        setIntField(term96079, term96079.getClass(), "chapterId", 0);
        setIntField(term96079, term96079.getClass(), "jewelCount", 0);
        setIntField(term96079, term96079.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term96079, term96079.getClass(), "lastPlayMusicId", 0);
        setIntField(term96079, term96079.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term96079, term96079.getClass(), "isStoryWatched", false);
        setBooleanField(term96079, term96079.getClass(), "isClear", false);
        setIntField(term96079, term96079.getClass(), "skipTiming1", 0);
        setIntField(term96079, term96079.getClass(), "skipTiming2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term96079, args);
    }

};


