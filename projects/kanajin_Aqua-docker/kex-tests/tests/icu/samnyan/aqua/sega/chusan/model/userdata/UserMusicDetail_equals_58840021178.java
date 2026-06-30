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

public class UserMusicDetail_equals_58840021178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112922;

    public UserMusicDetail_equals_58840021178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112922 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112922, term112922.getClass(), "id", 0L);
        setField(term112922, term112922.getClass(), "user", null);
        setIntField(term112922, term112922.getClass(), "musicId", 0);
        setIntField(term112922, term112922.getClass(), "level", 0);
        setIntField(term112922, term112922.getClass(), "playCount", 0);
        setIntField(term112922, term112922.getClass(), "scoreMax", 0);
        setIntField(term112922, term112922.getClass(), "missCount", 0);
        setIntField(term112922, term112922.getClass(), "maxComboCount", 0);
        setBooleanField(term112922, term112922.getClass(), "isFullCombo", false);
        setBooleanField(term112922, term112922.getClass(), "isAllJustice", false);
        setBooleanField(term112922, term112922.getClass(), "isSuccess", false);
        setIntField(term112922, term112922.getClass(), "fullChain", 0);
        setIntField(term112922, term112922.getClass(), "maxChain", 0);
        setIntField(term112922, term112922.getClass(), "scoreRank", 0);
        setBooleanField(term112922, term112922.getClass(), "isLock", false);
        setIntField(term112922, term112922.getClass(), "theoryCount", 0);
        setIntField(term112922, term112922.getClass(), "ext1", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term112922, args);
    }

};


