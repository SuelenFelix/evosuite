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

public class UserMusicDetail_setMaxChain_66988746479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107879;
     Object term107897;

    public UserMusicDetail_setMaxChain_66988746479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107879 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107879, term107879.getClass(), "id", 0L);
        setField(term107879, term107879.getClass(), "user", null);
        setIntField(term107879, term107879.getClass(), "musicId", 0);
        setIntField(term107879, term107879.getClass(), "level", 0);
        setIntField(term107879, term107879.getClass(), "playCount", 0);
        setIntField(term107879, term107879.getClass(), "scoreMax", 0);
        setIntField(term107879, term107879.getClass(), "resRequestCount", 0);
        setIntField(term107879, term107879.getClass(), "resAcceptCount", 0);
        setIntField(term107879, term107879.getClass(), "resSuccessCount", 0);
        setIntField(term107879, term107879.getClass(), "missCount", 0);
        setIntField(term107879, term107879.getClass(), "maxComboCount", 0);
        setBooleanField(term107879, term107879.getClass(), "isFullCombo", false);
        setBooleanField(term107879, term107879.getClass(), "isAllJustice", false);
        setBooleanField(term107879, term107879.getClass(), "isSuccess", false);
        setIntField(term107879, term107879.getClass(), "fullChain", 0);
        setIntField(term107879, term107879.getClass(), "maxChain", 0);
        setIntField(term107879, term107879.getClass(), "scoreRank", 0);
        setBooleanField(term107879, term107879.getClass(), "isLock", false);
        term107897 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107897;
        callMethod(klass, "setMaxChain", argTypes, term107879, args);
    }

};


