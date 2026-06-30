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

public class UserMusicDetail_getScoreMax_179367896551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107347;

    public UserMusicDetail_getScoreMax_179367896551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107347 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107347, term107347.getClass(), "id", 0L);
        setField(term107347, term107347.getClass(), "user", null);
        setIntField(term107347, term107347.getClass(), "musicId", 0);
        setIntField(term107347, term107347.getClass(), "level", 0);
        setIntField(term107347, term107347.getClass(), "playCount", 0);
        setIntField(term107347, term107347.getClass(), "scoreMax", 0);
        setIntField(term107347, term107347.getClass(), "resRequestCount", 0);
        setIntField(term107347, term107347.getClass(), "resAcceptCount", 0);
        setIntField(term107347, term107347.getClass(), "resSuccessCount", 0);
        setIntField(term107347, term107347.getClass(), "missCount", 0);
        setIntField(term107347, term107347.getClass(), "maxComboCount", 0);
        setBooleanField(term107347, term107347.getClass(), "isFullCombo", false);
        setBooleanField(term107347, term107347.getClass(), "isAllJustice", false);
        setBooleanField(term107347, term107347.getClass(), "isSuccess", false);
        setIntField(term107347, term107347.getClass(), "fullChain", 0);
        setIntField(term107347, term107347.getClass(), "maxChain", 0);
        setIntField(term107347, term107347.getClass(), "scoreRank", 0);
        setBooleanField(term107347, term107347.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreMax", argTypes, term107347, args);
    }

};


