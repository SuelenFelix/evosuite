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
import java.lang.Integer;

public class UserMusicDetail_setMusicId_112981056966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107619;
     Object term107637;

    public UserMusicDetail_setMusicId_112981056966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107619 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107619, term107619.getClass(), "id", 0L);
        setField(term107619, term107619.getClass(), "user", null);
        setIntField(term107619, term107619.getClass(), "musicId", 0);
        setIntField(term107619, term107619.getClass(), "level", 0);
        setIntField(term107619, term107619.getClass(), "playCount", 0);
        setIntField(term107619, term107619.getClass(), "scoreMax", 0);
        setIntField(term107619, term107619.getClass(), "resRequestCount", 0);
        setIntField(term107619, term107619.getClass(), "resAcceptCount", 0);
        setIntField(term107619, term107619.getClass(), "resSuccessCount", 0);
        setIntField(term107619, term107619.getClass(), "missCount", 0);
        setIntField(term107619, term107619.getClass(), "maxComboCount", 0);
        setBooleanField(term107619, term107619.getClass(), "isFullCombo", false);
        setBooleanField(term107619, term107619.getClass(), "isAllJustice", false);
        setBooleanField(term107619, term107619.getClass(), "isSuccess", false);
        setIntField(term107619, term107619.getClass(), "fullChain", 0);
        setIntField(term107619, term107619.getClass(), "maxChain", 0);
        setIntField(term107619, term107619.getClass(), "scoreRank", 0);
        setBooleanField(term107619, term107619.getClass(), "isLock", false);
        term107637 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107637;
        callMethod(klass, "setMusicId", argTypes, term107619, args);
    }

};


