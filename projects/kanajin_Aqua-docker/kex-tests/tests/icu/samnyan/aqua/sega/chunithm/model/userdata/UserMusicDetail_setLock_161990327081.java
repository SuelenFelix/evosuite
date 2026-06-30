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
import java.lang.Boolean;

public class UserMusicDetail_setLock_161990327081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107919;
     Object term107937;

    public UserMusicDetail_setLock_161990327081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107919 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107919, term107919.getClass(), "id", 0L);
        setField(term107919, term107919.getClass(), "user", null);
        setIntField(term107919, term107919.getClass(), "musicId", 0);
        setIntField(term107919, term107919.getClass(), "level", 0);
        setIntField(term107919, term107919.getClass(), "playCount", 0);
        setIntField(term107919, term107919.getClass(), "scoreMax", 0);
        setIntField(term107919, term107919.getClass(), "resRequestCount", 0);
        setIntField(term107919, term107919.getClass(), "resAcceptCount", 0);
        setIntField(term107919, term107919.getClass(), "resSuccessCount", 0);
        setIntField(term107919, term107919.getClass(), "missCount", 0);
        setIntField(term107919, term107919.getClass(), "maxComboCount", 0);
        setBooleanField(term107919, term107919.getClass(), "isFullCombo", false);
        setBooleanField(term107919, term107919.getClass(), "isAllJustice", false);
        setBooleanField(term107919, term107919.getClass(), "isSuccess", false);
        setIntField(term107919, term107919.getClass(), "fullChain", 0);
        setIntField(term107919, term107919.getClass(), "maxChain", 0);
        setIntField(term107919, term107919.getClass(), "scoreRank", 0);
        setBooleanField(term107919, term107919.getClass(), "isLock", false);
        term107937 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term107937;
        callMethod(klass, "setLock", argTypes, term107919, args);
    }

};


