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

public class UserChapter_toString_160379745055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96090;

    public UserChapter_toString_160379745055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96090 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        setLongField(term96090, term96090.getClass(), "id", 0L);
        setField(term96090, term96090.getClass(), "user", null);
        setIntField(term96090, term96090.getClass(), "chapterId", 0);
        setIntField(term96090, term96090.getClass(), "jewelCount", 0);
        setIntField(term96090, term96090.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term96090, term96090.getClass(), "lastPlayMusicId", 0);
        setIntField(term96090, term96090.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term96090, term96090.getClass(), "isStoryWatched", false);
        setBooleanField(term96090, term96090.getClass(), "isClear", false);
        setIntField(term96090, term96090.getClass(), "skipTiming1", 0);
        setIntField(term96090, term96090.getClass(), "skipTiming2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term96090, args);
    }

};


