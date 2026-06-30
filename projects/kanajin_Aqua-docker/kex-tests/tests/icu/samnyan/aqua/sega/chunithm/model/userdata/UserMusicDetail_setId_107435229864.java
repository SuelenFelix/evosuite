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
import java.lang.Long;

public class UserMusicDetail_setId_107435229864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107581;
     Object term107599;

    public UserMusicDetail_setId_107435229864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107581 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107581, term107581.getClass(), "id", 0L);
        setField(term107581, term107581.getClass(), "user", null);
        setIntField(term107581, term107581.getClass(), "musicId", 0);
        setIntField(term107581, term107581.getClass(), "level", 0);
        setIntField(term107581, term107581.getClass(), "playCount", 0);
        setIntField(term107581, term107581.getClass(), "scoreMax", 0);
        setIntField(term107581, term107581.getClass(), "resRequestCount", 0);
        setIntField(term107581, term107581.getClass(), "resAcceptCount", 0);
        setIntField(term107581, term107581.getClass(), "resSuccessCount", 0);
        setIntField(term107581, term107581.getClass(), "missCount", 0);
        setIntField(term107581, term107581.getClass(), "maxComboCount", 0);
        setBooleanField(term107581, term107581.getClass(), "isFullCombo", false);
        setBooleanField(term107581, term107581.getClass(), "isAllJustice", false);
        setBooleanField(term107581, term107581.getClass(), "isSuccess", false);
        setIntField(term107581, term107581.getClass(), "fullChain", 0);
        setIntField(term107581, term107581.getClass(), "maxChain", 0);
        setIntField(term107581, term107581.getClass(), "scoreRank", 0);
        setBooleanField(term107581, term107581.getClass(), "isLock", false);
        term107599 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term107599;
        callMethod(klass, "setId", argTypes, term107581, args);
    }

};


