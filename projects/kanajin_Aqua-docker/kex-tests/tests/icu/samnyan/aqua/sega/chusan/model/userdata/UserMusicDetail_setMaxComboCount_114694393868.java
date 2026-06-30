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

public class UserMusicDetail_setMaxComboCount_114694393868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112732;
     Object term112749;

    public UserMusicDetail_setMaxComboCount_114694393868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112732 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112732, term112732.getClass(), "id", 0L);
        setField(term112732, term112732.getClass(), "user", null);
        setIntField(term112732, term112732.getClass(), "musicId", 0);
        setIntField(term112732, term112732.getClass(), "level", 0);
        setIntField(term112732, term112732.getClass(), "playCount", 0);
        setIntField(term112732, term112732.getClass(), "scoreMax", 0);
        setIntField(term112732, term112732.getClass(), "missCount", 0);
        setIntField(term112732, term112732.getClass(), "maxComboCount", 0);
        setBooleanField(term112732, term112732.getClass(), "isFullCombo", false);
        setBooleanField(term112732, term112732.getClass(), "isAllJustice", false);
        setBooleanField(term112732, term112732.getClass(), "isSuccess", false);
        setIntField(term112732, term112732.getClass(), "fullChain", 0);
        setIntField(term112732, term112732.getClass(), "maxChain", 0);
        setIntField(term112732, term112732.getClass(), "scoreRank", 0);
        setBooleanField(term112732, term112732.getClass(), "isLock", false);
        setIntField(term112732, term112732.getClass(), "theoryCount", 0);
        setIntField(term112732, term112732.getClass(), "ext1", 0);
        term112749 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term112749;
        callMethod(klass, "setMaxComboCount", argTypes, term112732, args);
    }

};


