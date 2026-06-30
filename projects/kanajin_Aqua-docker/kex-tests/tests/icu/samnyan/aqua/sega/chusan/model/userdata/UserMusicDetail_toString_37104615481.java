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

public class UserMusicDetail_toString_37104615481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112973;

    public UserMusicDetail_toString_37104615481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112973 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112973, term112973.getClass(), "id", 0L);
        setField(term112973, term112973.getClass(), "user", null);
        setIntField(term112973, term112973.getClass(), "musicId", 0);
        setIntField(term112973, term112973.getClass(), "level", 0);
        setIntField(term112973, term112973.getClass(), "playCount", 0);
        setIntField(term112973, term112973.getClass(), "scoreMax", 0);
        setIntField(term112973, term112973.getClass(), "missCount", 0);
        setIntField(term112973, term112973.getClass(), "maxComboCount", 0);
        setBooleanField(term112973, term112973.getClass(), "isFullCombo", false);
        setBooleanField(term112973, term112973.getClass(), "isAllJustice", false);
        setBooleanField(term112973, term112973.getClass(), "isSuccess", false);
        setIntField(term112973, term112973.getClass(), "fullChain", 0);
        setIntField(term112973, term112973.getClass(), "maxChain", 0);
        setIntField(term112973, term112973.getClass(), "scoreRank", 0);
        setBooleanField(term112973, term112973.getClass(), "isLock", false);
        setIntField(term112973, term112973.getClass(), "theoryCount", 0);
        setIntField(term112973, term112973.getClass(), "ext1", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term112973, args);
    }

};


