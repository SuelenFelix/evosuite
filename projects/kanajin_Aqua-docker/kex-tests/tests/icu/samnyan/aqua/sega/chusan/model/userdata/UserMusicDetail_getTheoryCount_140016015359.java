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

public class UserMusicDetail_getTheoryCount_140016015359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112567;

    public UserMusicDetail_getTheoryCount_140016015359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112567 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112567, term112567.getClass(), "id", 0L);
        setField(term112567, term112567.getClass(), "user", null);
        setIntField(term112567, term112567.getClass(), "musicId", 0);
        setIntField(term112567, term112567.getClass(), "level", 0);
        setIntField(term112567, term112567.getClass(), "playCount", 0);
        setIntField(term112567, term112567.getClass(), "scoreMax", 0);
        setIntField(term112567, term112567.getClass(), "missCount", 0);
        setIntField(term112567, term112567.getClass(), "maxComboCount", 0);
        setBooleanField(term112567, term112567.getClass(), "isFullCombo", false);
        setBooleanField(term112567, term112567.getClass(), "isAllJustice", false);
        setBooleanField(term112567, term112567.getClass(), "isSuccess", false);
        setIntField(term112567, term112567.getClass(), "fullChain", 0);
        setIntField(term112567, term112567.getClass(), "maxChain", 0);
        setIntField(term112567, term112567.getClass(), "scoreRank", 0);
        setBooleanField(term112567, term112567.getClass(), "isLock", false);
        setIntField(term112567, term112567.getClass(), "theoryCount", 0);
        setIntField(term112567, term112567.getClass(), "ext1", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTheoryCount", argTypes, term112567, args);
    }

};


