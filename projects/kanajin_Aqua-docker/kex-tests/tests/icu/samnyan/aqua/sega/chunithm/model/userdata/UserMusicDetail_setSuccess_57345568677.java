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
import java.lang.Boolean;

public class UserMusicDetail_setSuccess_57345568677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107839;
     Object term107857;

    public UserMusicDetail_setSuccess_57345568677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107839 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107839, term107839.getClass(), "id", 0L);
        setField(term107839, term107839.getClass(), "user", null);
        setIntField(term107839, term107839.getClass(), "musicId", 0);
        setIntField(term107839, term107839.getClass(), "level", 0);
        setIntField(term107839, term107839.getClass(), "playCount", 0);
        setIntField(term107839, term107839.getClass(), "scoreMax", 0);
        setIntField(term107839, term107839.getClass(), "resRequestCount", 0);
        setIntField(term107839, term107839.getClass(), "resAcceptCount", 0);
        setIntField(term107839, term107839.getClass(), "resSuccessCount", 0);
        setIntField(term107839, term107839.getClass(), "missCount", 0);
        setIntField(term107839, term107839.getClass(), "maxComboCount", 0);
        setBooleanField(term107839, term107839.getClass(), "isFullCombo", false);
        setBooleanField(term107839, term107839.getClass(), "isAllJustice", false);
        setBooleanField(term107839, term107839.getClass(), "isSuccess", false);
        setIntField(term107839, term107839.getClass(), "fullChain", 0);
        setIntField(term107839, term107839.getClass(), "maxChain", 0);
        setIntField(term107839, term107839.getClass(), "scoreRank", 0);
        setBooleanField(term107839, term107839.getClass(), "isLock", false);
        term107857 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term107857;
        callMethod(klass, "setSuccess", argTypes, term107839, args);
    }

};


