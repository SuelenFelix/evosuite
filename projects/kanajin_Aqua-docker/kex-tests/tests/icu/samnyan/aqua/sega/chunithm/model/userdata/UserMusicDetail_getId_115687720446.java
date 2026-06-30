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

public class UserMusicDetail_getId_115687720446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107257;

    public UserMusicDetail_getId_115687720446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107257 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        setLongField(term107257, term107257.getClass(), "id", 0L);
        setField(term107257, term107257.getClass(), "user", null);
        setIntField(term107257, term107257.getClass(), "musicId", 0);
        setIntField(term107257, term107257.getClass(), "level", 0);
        setIntField(term107257, term107257.getClass(), "playCount", 0);
        setIntField(term107257, term107257.getClass(), "scoreMax", 0);
        setIntField(term107257, term107257.getClass(), "resRequestCount", 0);
        setIntField(term107257, term107257.getClass(), "resAcceptCount", 0);
        setIntField(term107257, term107257.getClass(), "resSuccessCount", 0);
        setIntField(term107257, term107257.getClass(), "missCount", 0);
        setIntField(term107257, term107257.getClass(), "maxComboCount", 0);
        setBooleanField(term107257, term107257.getClass(), "isFullCombo", false);
        setBooleanField(term107257, term107257.getClass(), "isAllJustice", false);
        setBooleanField(term107257, term107257.getClass(), "isSuccess", false);
        setIntField(term107257, term107257.getClass(), "fullChain", 0);
        setIntField(term107257, term107257.getClass(), "maxChain", 0);
        setIntField(term107257, term107257.getClass(), "scoreRank", 0);
        setBooleanField(term107257, term107257.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term107257, args);
    }

};


