package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMusicDetail_equals_188359790582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107939;

    public UserMusicDetail_equals_188359790582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107939 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107939, term107939.getClass(), "id", 0L);
        setField(term107939, term107939.getClass(), "user", null);
        setIntField(term107939, term107939.getClass(), "musicId", 0);
        setIntField(term107939, term107939.getClass(), "level", 0);
        setIntField(term107939, term107939.getClass(), "playCount", 0);
        setIntField(term107939, term107939.getClass(), "scoreMax", 0);
        setIntField(term107939, term107939.getClass(), "resRequestCount", 0);
        setIntField(term107939, term107939.getClass(), "resAcceptCount", 0);
        setIntField(term107939, term107939.getClass(), "resSuccessCount", 0);
        setIntField(term107939, term107939.getClass(), "missCount", 0);
        setIntField(term107939, term107939.getClass(), "maxComboCount", 0);
        setBooleanField(term107939, term107939.getClass(), "isFullCombo", false);
        setBooleanField(term107939, term107939.getClass(), "isAllJustice", false);
        setBooleanField(term107939, term107939.getClass(), "isSuccess", false);
        setIntField(term107939, term107939.getClass(), "fullChain", 0);
        setIntField(term107939, term107939.getClass(), "maxChain", 0);
        setIntField(term107939, term107939.getClass(), "scoreRank", 0);
        setBooleanField(term107939, term107939.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term107939, args);
    }

};


