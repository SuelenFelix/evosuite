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

public class UserMusicDetail_getMaxChain_155212367256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112516;

    public UserMusicDetail_getMaxChain_155212367256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112516 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112516, term112516.getClass(), "id", 0L);
        setField(term112516, term112516.getClass(), "user", null);
        setIntField(term112516, term112516.getClass(), "musicId", 0);
        setIntField(term112516, term112516.getClass(), "level", 0);
        setIntField(term112516, term112516.getClass(), "playCount", 0);
        setIntField(term112516, term112516.getClass(), "scoreMax", 0);
        setIntField(term112516, term112516.getClass(), "missCount", 0);
        setIntField(term112516, term112516.getClass(), "maxComboCount", 0);
        setBooleanField(term112516, term112516.getClass(), "isFullCombo", false);
        setBooleanField(term112516, term112516.getClass(), "isAllJustice", false);
        setBooleanField(term112516, term112516.getClass(), "isSuccess", false);
        setIntField(term112516, term112516.getClass(), "fullChain", 0);
        setIntField(term112516, term112516.getClass(), "maxChain", 0);
        setIntField(term112516, term112516.getClass(), "scoreRank", 0);
        setBooleanField(term112516, term112516.getClass(), "isLock", false);
        setIntField(term112516, term112516.getClass(), "theoryCount", 0);
        setIntField(term112516, term112516.getClass(), "ext1", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxChain", argTypes, term112516, args);
    }

};


