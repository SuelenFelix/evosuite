package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMusicDetail_canEqual_139256284079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112939;

    public UserMusicDetail_canEqual_139256284079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112939 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112939, term112939.getClass(), "id", 0L);
        setField(term112939, term112939.getClass(), "user", null);
        setIntField(term112939, term112939.getClass(), "musicId", 0);
        setIntField(term112939, term112939.getClass(), "level", 0);
        setIntField(term112939, term112939.getClass(), "playCount", 0);
        setIntField(term112939, term112939.getClass(), "scoreMax", 0);
        setIntField(term112939, term112939.getClass(), "missCount", 0);
        setIntField(term112939, term112939.getClass(), "maxComboCount", 0);
        setBooleanField(term112939, term112939.getClass(), "isFullCombo", false);
        setBooleanField(term112939, term112939.getClass(), "isAllJustice", false);
        setBooleanField(term112939, term112939.getClass(), "isSuccess", false);
        setIntField(term112939, term112939.getClass(), "fullChain", 0);
        setIntField(term112939, term112939.getClass(), "maxChain", 0);
        setIntField(term112939, term112939.getClass(), "scoreRank", 0);
        setBooleanField(term112939, term112939.getClass(), "isLock", false);
        setIntField(term112939, term112939.getClass(), "theoryCount", 0);
        setIntField(term112939, term112939.getClass(), "ext1", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term112939, args);
    }

};


