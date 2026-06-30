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

public class UserMusicDetail_setPlayCount_79501124668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107659;
     Object term107677;

    public UserMusicDetail_setPlayCount_79501124668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107659 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107659, term107659.getClass(), "id", 0L);
        setField(term107659, term107659.getClass(), "user", null);
        setIntField(term107659, term107659.getClass(), "musicId", 0);
        setIntField(term107659, term107659.getClass(), "level", 0);
        setIntField(term107659, term107659.getClass(), "playCount", 0);
        setIntField(term107659, term107659.getClass(), "scoreMax", 0);
        setIntField(term107659, term107659.getClass(), "resRequestCount", 0);
        setIntField(term107659, term107659.getClass(), "resAcceptCount", 0);
        setIntField(term107659, term107659.getClass(), "resSuccessCount", 0);
        setIntField(term107659, term107659.getClass(), "missCount", 0);
        setIntField(term107659, term107659.getClass(), "maxComboCount", 0);
        setBooleanField(term107659, term107659.getClass(), "isFullCombo", false);
        setBooleanField(term107659, term107659.getClass(), "isAllJustice", false);
        setBooleanField(term107659, term107659.getClass(), "isSuccess", false);
        setIntField(term107659, term107659.getClass(), "fullChain", 0);
        setIntField(term107659, term107659.getClass(), "maxChain", 0);
        setIntField(term107659, term107659.getClass(), "scoreRank", 0);
        setBooleanField(term107659, term107659.getClass(), "isLock", false);
        term107677 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107677;
        callMethod(klass, "setPlayCount", argTypes, term107659, args);
    }

};


