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

public class UserMusicDetail_setMaxComboCount_14825375674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107779;
     Object term107797;

    public UserMusicDetail_setMaxComboCount_14825375674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107779 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107779, term107779.getClass(), "id", 0L);
        setField(term107779, term107779.getClass(), "user", null);
        setIntField(term107779, term107779.getClass(), "musicId", 0);
        setIntField(term107779, term107779.getClass(), "level", 0);
        setIntField(term107779, term107779.getClass(), "playCount", 0);
        setIntField(term107779, term107779.getClass(), "scoreMax", 0);
        setIntField(term107779, term107779.getClass(), "resRequestCount", 0);
        setIntField(term107779, term107779.getClass(), "resAcceptCount", 0);
        setIntField(term107779, term107779.getClass(), "resSuccessCount", 0);
        setIntField(term107779, term107779.getClass(), "missCount", 0);
        setIntField(term107779, term107779.getClass(), "maxComboCount", 0);
        setBooleanField(term107779, term107779.getClass(), "isFullCombo", false);
        setBooleanField(term107779, term107779.getClass(), "isAllJustice", false);
        setBooleanField(term107779, term107779.getClass(), "isSuccess", false);
        setIntField(term107779, term107779.getClass(), "fullChain", 0);
        setIntField(term107779, term107779.getClass(), "maxChain", 0);
        setIntField(term107779, term107779.getClass(), "scoreRank", 0);
        setBooleanField(term107779, term107779.getClass(), "isLock", false);
        term107797 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107797;
        callMethod(klass, "setMaxComboCount", argTypes, term107779, args);
    }

};


