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

public class UserMusicDetail_getResRequestCount_193187953352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107365;

    public UserMusicDetail_getResRequestCount_193187953352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107365 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107365, term107365.getClass(), "id", 0L);
        setField(term107365, term107365.getClass(), "user", null);
        setIntField(term107365, term107365.getClass(), "musicId", 0);
        setIntField(term107365, term107365.getClass(), "level", 0);
        setIntField(term107365, term107365.getClass(), "playCount", 0);
        setIntField(term107365, term107365.getClass(), "scoreMax", 0);
        setIntField(term107365, term107365.getClass(), "resRequestCount", 0);
        setIntField(term107365, term107365.getClass(), "resAcceptCount", 0);
        setIntField(term107365, term107365.getClass(), "resSuccessCount", 0);
        setIntField(term107365, term107365.getClass(), "missCount", 0);
        setIntField(term107365, term107365.getClass(), "maxComboCount", 0);
        setBooleanField(term107365, term107365.getClass(), "isFullCombo", false);
        setBooleanField(term107365, term107365.getClass(), "isAllJustice", false);
        setBooleanField(term107365, term107365.getClass(), "isSuccess", false);
        setIntField(term107365, term107365.getClass(), "fullChain", 0);
        setIntField(term107365, term107365.getClass(), "maxChain", 0);
        setIntField(term107365, term107365.getClass(), "scoreRank", 0);
        setBooleanField(term107365, term107365.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResRequestCount", argTypes, term107365, args);
    }

};


