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
import java.lang.Integer;

public class UserMusicDetail_setLevel_198555820141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70738;
     Object term70748;

    public UserMusicDetail_setLevel_198555820141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70738 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        setLongField(term70738, term70738.getClass(), "id", 0L);
        setField(term70738, term70738.getClass(), "user", null);
        setIntField(term70738, term70738.getClass(), "musicId", 0);
        setIntField(term70738, term70738.getClass(), "level", 0);
        setIntField(term70738, term70738.getClass(), "playCount", 0);
        setIntField(term70738, term70738.getClass(), "achievement", 0);
        setIntField(term70738, term70738.getClass(), "comboStatus", 0);
        setIntField(term70738, term70738.getClass(), "syncStatus", 0);
        setIntField(term70738, term70738.getClass(), "deluxscoreMax", 0);
        setIntField(term70738, term70738.getClass(), "scoreRank", 0);
        term70748 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70748;
        callMethod(klass, "setLevel", argTypes, term70738, args);
    }

};


