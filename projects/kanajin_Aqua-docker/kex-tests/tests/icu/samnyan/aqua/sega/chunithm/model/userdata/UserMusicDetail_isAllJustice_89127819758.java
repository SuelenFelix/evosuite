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

public class UserMusicDetail_isAllJustice_89127819758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107473;

    public UserMusicDetail_isAllJustice_89127819758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107473 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107473, term107473.getClass(), "id", 0L);
        setField(term107473, term107473.getClass(), "user", null);
        setIntField(term107473, term107473.getClass(), "musicId", 0);
        setIntField(term107473, term107473.getClass(), "level", 0);
        setIntField(term107473, term107473.getClass(), "playCount", 0);
        setIntField(term107473, term107473.getClass(), "scoreMax", 0);
        setIntField(term107473, term107473.getClass(), "resRequestCount", 0);
        setIntField(term107473, term107473.getClass(), "resAcceptCount", 0);
        setIntField(term107473, term107473.getClass(), "resSuccessCount", 0);
        setIntField(term107473, term107473.getClass(), "missCount", 0);
        setIntField(term107473, term107473.getClass(), "maxComboCount", 0);
        setBooleanField(term107473, term107473.getClass(), "isFullCombo", false);
        setBooleanField(term107473, term107473.getClass(), "isAllJustice", false);
        setBooleanField(term107473, term107473.getClass(), "isSuccess", false);
        setIntField(term107473, term107473.getClass(), "fullChain", 0);
        setIntField(term107473, term107473.getClass(), "maxChain", 0);
        setIntField(term107473, term107473.getClass(), "scoreRank", 0);
        setBooleanField(term107473, term107473.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllJustice", argTypes, term107473, args);
    }

};


