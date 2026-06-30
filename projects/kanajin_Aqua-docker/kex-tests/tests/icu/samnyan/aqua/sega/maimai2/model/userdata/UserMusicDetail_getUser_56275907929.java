package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMusicDetail_getUser_56275907929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70614;

    public UserMusicDetail_getUser_56275907929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70614 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        setLongField(term70614, term70614.getClass(), "id", 0L);
        setField(term70614, term70614.getClass(), "user", null);
        setIntField(term70614, term70614.getClass(), "musicId", 0);
        setIntField(term70614, term70614.getClass(), "level", 0);
        setIntField(term70614, term70614.getClass(), "playCount", 0);
        setIntField(term70614, term70614.getClass(), "achievement", 0);
        setIntField(term70614, term70614.getClass(), "comboStatus", 0);
        setIntField(term70614, term70614.getClass(), "syncStatus", 0);
        setIntField(term70614, term70614.getClass(), "deluxscoreMax", 0);
        setIntField(term70614, term70614.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term70614, args);
    }

};


