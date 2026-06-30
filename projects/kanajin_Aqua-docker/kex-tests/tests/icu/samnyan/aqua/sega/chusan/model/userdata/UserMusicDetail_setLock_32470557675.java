package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserMusicDetail_setLock_32470557675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112865;
     Object term112882;

    public UserMusicDetail_setLock_32470557675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112865 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112865, term112865.getClass(), "id", 0L);
        setField(term112865, term112865.getClass(), "user", null);
        setIntField(term112865, term112865.getClass(), "musicId", 0);
        setIntField(term112865, term112865.getClass(), "level", 0);
        setIntField(term112865, term112865.getClass(), "playCount", 0);
        setIntField(term112865, term112865.getClass(), "scoreMax", 0);
        setIntField(term112865, term112865.getClass(), "missCount", 0);
        setIntField(term112865, term112865.getClass(), "maxComboCount", 0);
        setBooleanField(term112865, term112865.getClass(), "isFullCombo", false);
        setBooleanField(term112865, term112865.getClass(), "isAllJustice", false);
        setBooleanField(term112865, term112865.getClass(), "isSuccess", false);
        setIntField(term112865, term112865.getClass(), "fullChain", 0);
        setIntField(term112865, term112865.getClass(), "maxChain", 0);
        setIntField(term112865, term112865.getClass(), "scoreRank", 0);
        setBooleanField(term112865, term112865.getClass(), "isLock", false);
        setIntField(term112865, term112865.getClass(), "theoryCount", 0);
        setIntField(term112865, term112865.getClass(), "ext1", 0);
        term112882 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term112882;
        callMethod(klass, "setLock", argTypes, term112865, args);
    }

};


