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

public class UserMusicDetail_setResSuccessCount_85007106972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107739;
     Object term107757;

    public UserMusicDetail_setResSuccessCount_85007106972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107739 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107739, term107739.getClass(), "id", 0L);
        setField(term107739, term107739.getClass(), "user", null);
        setIntField(term107739, term107739.getClass(), "musicId", 0);
        setIntField(term107739, term107739.getClass(), "level", 0);
        setIntField(term107739, term107739.getClass(), "playCount", 0);
        setIntField(term107739, term107739.getClass(), "scoreMax", 0);
        setIntField(term107739, term107739.getClass(), "resRequestCount", 0);
        setIntField(term107739, term107739.getClass(), "resAcceptCount", 0);
        setIntField(term107739, term107739.getClass(), "resSuccessCount", 0);
        setIntField(term107739, term107739.getClass(), "missCount", 0);
        setIntField(term107739, term107739.getClass(), "maxComboCount", 0);
        setBooleanField(term107739, term107739.getClass(), "isFullCombo", false);
        setBooleanField(term107739, term107739.getClass(), "isAllJustice", false);
        setBooleanField(term107739, term107739.getClass(), "isSuccess", false);
        setIntField(term107739, term107739.getClass(), "fullChain", 0);
        setIntField(term107739, term107739.getClass(), "maxChain", 0);
        setIntField(term107739, term107739.getClass(), "scoreRank", 0);
        setBooleanField(term107739, term107739.getClass(), "isLock", false);
        term107757 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107757;
        callMethod(klass, "setResSuccessCount", argTypes, term107739, args);
    }

};


