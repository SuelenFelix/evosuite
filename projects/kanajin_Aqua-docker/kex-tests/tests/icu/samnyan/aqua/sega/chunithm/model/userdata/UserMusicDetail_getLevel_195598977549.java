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

public class UserMusicDetail_getLevel_195598977549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107311;

    public UserMusicDetail_getLevel_195598977549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107311 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107311, term107311.getClass(), "id", 0L);
        setField(term107311, term107311.getClass(), "user", null);
        setIntField(term107311, term107311.getClass(), "musicId", 0);
        setIntField(term107311, term107311.getClass(), "level", 0);
        setIntField(term107311, term107311.getClass(), "playCount", 0);
        setIntField(term107311, term107311.getClass(), "scoreMax", 0);
        setIntField(term107311, term107311.getClass(), "resRequestCount", 0);
        setIntField(term107311, term107311.getClass(), "resAcceptCount", 0);
        setIntField(term107311, term107311.getClass(), "resSuccessCount", 0);
        setIntField(term107311, term107311.getClass(), "missCount", 0);
        setIntField(term107311, term107311.getClass(), "maxComboCount", 0);
        setBooleanField(term107311, term107311.getClass(), "isFullCombo", false);
        setBooleanField(term107311, term107311.getClass(), "isAllJustice", false);
        setBooleanField(term107311, term107311.getClass(), "isSuccess", false);
        setIntField(term107311, term107311.getClass(), "fullChain", 0);
        setIntField(term107311, term107311.getClass(), "maxChain", 0);
        setIntField(term107311, term107311.getClass(), "scoreRank", 0);
        setBooleanField(term107311, term107311.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term107311, args);
    }

};


