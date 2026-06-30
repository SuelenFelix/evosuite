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

public class UserMusicDetail_getUser_150681327247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107275;

    public UserMusicDetail_getUser_150681327247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107275 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107275, term107275.getClass(), "id", 0L);
        setField(term107275, term107275.getClass(), "user", null);
        setIntField(term107275, term107275.getClass(), "musicId", 0);
        setIntField(term107275, term107275.getClass(), "level", 0);
        setIntField(term107275, term107275.getClass(), "playCount", 0);
        setIntField(term107275, term107275.getClass(), "scoreMax", 0);
        setIntField(term107275, term107275.getClass(), "resRequestCount", 0);
        setIntField(term107275, term107275.getClass(), "resAcceptCount", 0);
        setIntField(term107275, term107275.getClass(), "resSuccessCount", 0);
        setIntField(term107275, term107275.getClass(), "missCount", 0);
        setIntField(term107275, term107275.getClass(), "maxComboCount", 0);
        setBooleanField(term107275, term107275.getClass(), "isFullCombo", false);
        setBooleanField(term107275, term107275.getClass(), "isAllJustice", false);
        setBooleanField(term107275, term107275.getClass(), "isSuccess", false);
        setIntField(term107275, term107275.getClass(), "fullChain", 0);
        setIntField(term107275, term107275.getClass(), "maxChain", 0);
        setIntField(term107275, term107275.getClass(), "scoreRank", 0);
        setBooleanField(term107275, term107275.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term107275, args);
    }

};


