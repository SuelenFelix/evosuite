package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Level_isEnable_12945257102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16872;

    public Level_isEnable_12945257102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16991 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term16990 = ((Class) term16991).getDeclaredField((String) "ORIGINAL");
        ((Field) term16990).setAccessible(true);
        Object enum28 = ((Field) term16990).get((Object) null);
        HashMap term16946 = new HashMap();
        term16872 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term16874 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term16872, term16872.getClass(), "id", -4714000263923324167L);
        setIntField(term16874, term16874.getClass(), "musicId", 335780735);
        setField(term16874, term16874.getClass(), "name", "QTefjRuiez");
        setField(term16874, term16874.getClass(), "sortName", "SQZVNkAVBB");
        setField(term16874, term16874.getClass(), "artistName", "mrSAYJlddZ");
        setField(term16874, term16874.getClass(), "genre", enum28);
        setField(term16874, term16874.getClass(), "releaseVersion", "KbwxawvYsw");
        setField(term16874, term16874.getClass(), "levels", term16946);
        setField(term16872, term16872.getClass(), "music", term16874);
        setBooleanField(term16872, term16872.getClass(), "enable", true);
        setIntField(term16872, term16872.getClass(), "level", -1398142433);
        setIntField(term16872, term16872.getClass(), "levelDecimal", -1112119058);
        setIntField(term16872, term16872.getClass(), "diff", 2073858334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnable", argTypes, term16872, args);
    }

};


