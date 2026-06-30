package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMusicDetail_getMusicId_8884959934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188519;

    public UserMusicDetail_getMusicId_8884959934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188519 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188519, term188519.getClass(), "id", 0L);
        setField(term188519, term188519.getClass(), "user", null);
        setIntField(term188519, term188519.getClass(), "musicId", 0);
        setIntField(term188519, term188519.getClass(), "level", 0);
        setIntField(term188519, term188519.getClass(), "playCount", 0);
        setIntField(term188519, term188519.getClass(), "scoreMax", 0);
        setIntField(term188519, term188519.getClass(), "syncRateMax", 0);
        setBooleanField(term188519, term188519.getClass(), "isAllPerfect", false);
        setIntField(term188519, term188519.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188519, term188519.getClass(), "fullCombo", 0);
        setIntField(term188519, term188519.getClass(), "maxFever", 0);
        setIntField(term188519, term188519.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term188519, args);
    }

};


