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

public class UserMusicDetail_isSuccess_93805011659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107491;

    public UserMusicDetail_isSuccess_93805011659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107491 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107491, term107491.getClass(), "id", 0L);
        setField(term107491, term107491.getClass(), "user", null);
        setIntField(term107491, term107491.getClass(), "musicId", 0);
        setIntField(term107491, term107491.getClass(), "level", 0);
        setIntField(term107491, term107491.getClass(), "playCount", 0);
        setIntField(term107491, term107491.getClass(), "scoreMax", 0);
        setIntField(term107491, term107491.getClass(), "resRequestCount", 0);
        setIntField(term107491, term107491.getClass(), "resAcceptCount", 0);
        setIntField(term107491, term107491.getClass(), "resSuccessCount", 0);
        setIntField(term107491, term107491.getClass(), "missCount", 0);
        setIntField(term107491, term107491.getClass(), "maxComboCount", 0);
        setBooleanField(term107491, term107491.getClass(), "isFullCombo", false);
        setBooleanField(term107491, term107491.getClass(), "isAllJustice", false);
        setBooleanField(term107491, term107491.getClass(), "isSuccess", false);
        setIntField(term107491, term107491.getClass(), "fullChain", 0);
        setIntField(term107491, term107491.getClass(), "maxChain", 0);
        setIntField(term107491, term107491.getClass(), "scoreRank", 0);
        setBooleanField(term107491, term107491.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term107491, args);
    }

};


