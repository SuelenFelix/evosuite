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

public class UserMusicDetail_getId_81312371228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70604;

    public UserMusicDetail_getId_81312371228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70604 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        setLongField(term70604, term70604.getClass(), "id", 0L);
        setField(term70604, term70604.getClass(), "user", null);
        setIntField(term70604, term70604.getClass(), "musicId", 0);
        setIntField(term70604, term70604.getClass(), "level", 0);
        setIntField(term70604, term70604.getClass(), "playCount", 0);
        setIntField(term70604, term70604.getClass(), "achievement", 0);
        setIntField(term70604, term70604.getClass(), "comboStatus", 0);
        setIntField(term70604, term70604.getClass(), "syncStatus", 0);
        setIntField(term70604, term70604.getClass(), "deluxscoreMax", 0);
        setIntField(term70604, term70604.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term70604, args);
    }

};


