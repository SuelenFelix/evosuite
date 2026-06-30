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

public class UserMusicDetail_setSuccess_186865338071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112789;
     Object term112806;

    public UserMusicDetail_setSuccess_186865338071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112789 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail"));
        setLongField(term112789, term112789.getClass(), "id", 0L);
        setField(term112789, term112789.getClass(), "user", null);
        setIntField(term112789, term112789.getClass(), "musicId", 0);
        setIntField(term112789, term112789.getClass(), "level", 0);
        setIntField(term112789, term112789.getClass(), "playCount", 0);
        setIntField(term112789, term112789.getClass(), "scoreMax", 0);
        setIntField(term112789, term112789.getClass(), "missCount", 0);
        setIntField(term112789, term112789.getClass(), "maxComboCount", 0);
        setBooleanField(term112789, term112789.getClass(), "isFullCombo", false);
        setBooleanField(term112789, term112789.getClass(), "isAllJustice", false);
        setBooleanField(term112789, term112789.getClass(), "isSuccess", false);
        setIntField(term112789, term112789.getClass(), "fullChain", 0);
        setIntField(term112789, term112789.getClass(), "maxChain", 0);
        setIntField(term112789, term112789.getClass(), "scoreRank", 0);
        setBooleanField(term112789, term112789.getClass(), "isLock", false);
        setIntField(term112789, term112789.getClass(), "theoryCount", 0);
        setIntField(term112789, term112789.getClass(), "ext1", 0);
        term112806 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term112806;
        callMethod(klass, "setSuccess", argTypes, term112789, args);
    }

};


