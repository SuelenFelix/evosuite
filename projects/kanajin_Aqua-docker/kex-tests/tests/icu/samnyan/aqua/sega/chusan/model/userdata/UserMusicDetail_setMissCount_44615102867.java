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
import java.lang.Integer;

public class UserMusicDetail_setMissCount_44615102867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112713;
     Object term112730;

    public UserMusicDetail_setMissCount_44615102867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112713 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112713, term112713.getClass(), "id", 0L);
        setField(term112713, term112713.getClass(), "user", null);
        setIntField(term112713, term112713.getClass(), "musicId", 0);
        setIntField(term112713, term112713.getClass(), "level", 0);
        setIntField(term112713, term112713.getClass(), "playCount", 0);
        setIntField(term112713, term112713.getClass(), "scoreMax", 0);
        setIntField(term112713, term112713.getClass(), "missCount", 0);
        setIntField(term112713, term112713.getClass(), "maxComboCount", 0);
        setBooleanField(term112713, term112713.getClass(), "isFullCombo", false);
        setBooleanField(term112713, term112713.getClass(), "isAllJustice", false);
        setBooleanField(term112713, term112713.getClass(), "isSuccess", false);
        setIntField(term112713, term112713.getClass(), "fullChain", 0);
        setIntField(term112713, term112713.getClass(), "maxChain", 0);
        setIntField(term112713, term112713.getClass(), "scoreRank", 0);
        setBooleanField(term112713, term112713.getClass(), "isLock", false);
        setIntField(term112713, term112713.getClass(), "theoryCount", 0);
        setIntField(term112713, term112713.getClass(), "ext1", 0);
        term112730 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term112730;
        callMethod(klass, "setMissCount", argTypes, term112713, args);
    }

};


