package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMusicDetail_getMusicId_35746407130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70624;

    public UserMusicDetail_getMusicId_35746407130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70624 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        setLongField(term70624, term70624.getClass(), "id", 0L);
        setField(term70624, term70624.getClass(), "user", null);
        setIntField(term70624, term70624.getClass(), "musicId", 0);
        setIntField(term70624, term70624.getClass(), "level", 0);
        setIntField(term70624, term70624.getClass(), "playCount", 0);
        setIntField(term70624, term70624.getClass(), "achievement", 0);
        setIntField(term70624, term70624.getClass(), "comboStatus", 0);
        setIntField(term70624, term70624.getClass(), "syncStatus", 0);
        setIntField(term70624, term70624.getClass(), "deluxscoreMax", 0);
        setIntField(term70624, term70624.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term70624, args);
    }

};


