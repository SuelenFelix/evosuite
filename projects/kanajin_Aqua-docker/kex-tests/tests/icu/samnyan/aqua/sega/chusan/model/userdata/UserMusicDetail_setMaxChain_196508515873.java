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

public class UserMusicDetail_setMaxChain_196508515873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112827;
     Object term112844;

    public UserMusicDetail_setMaxChain_196508515873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112827 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112827, term112827.getClass(), "id", 0L);
        setField(term112827, term112827.getClass(), "user", null);
        setIntField(term112827, term112827.getClass(), "musicId", 0);
        setIntField(term112827, term112827.getClass(), "level", 0);
        setIntField(term112827, term112827.getClass(), "playCount", 0);
        setIntField(term112827, term112827.getClass(), "scoreMax", 0);
        setIntField(term112827, term112827.getClass(), "missCount", 0);
        setIntField(term112827, term112827.getClass(), "maxComboCount", 0);
        setBooleanField(term112827, term112827.getClass(), "isFullCombo", false);
        setBooleanField(term112827, term112827.getClass(), "isAllJustice", false);
        setBooleanField(term112827, term112827.getClass(), "isSuccess", false);
        setIntField(term112827, term112827.getClass(), "fullChain", 0);
        setIntField(term112827, term112827.getClass(), "maxChain", 0);
        setIntField(term112827, term112827.getClass(), "scoreRank", 0);
        setBooleanField(term112827, term112827.getClass(), "isLock", false);
        setIntField(term112827, term112827.getClass(), "theoryCount", 0);
        setIntField(term112827, term112827.getClass(), "ext1", 0);
        term112844 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term112844;
        callMethod(klass, "setMaxChain", argTypes, term112827, args);
    }

};


