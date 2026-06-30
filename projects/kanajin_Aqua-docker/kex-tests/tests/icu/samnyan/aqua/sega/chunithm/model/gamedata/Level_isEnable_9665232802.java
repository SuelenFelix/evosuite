package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Level_isEnable_9665232802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2821;

    public Level_isEnable_9665232802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2962 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term2961 = ((Class) term2962).getDeclaredField((String) "RESERVE2");
        ((Field) term2961).setAccessible(true);
        Object enum2 = ((Field) term2961).get((Object) null);
        HashMap term2907 = new HashMap();
        term2821 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term2823 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term2821, term2821.getClass(), "id", -484994522244390100L);
        setIntField(term2823, term2823.getClass(), "musicId", -2014576105);
        setField(term2823, term2823.getClass(), "name", "nGKItKLYNC");
        setField(term2823, term2823.getClass(), "sortName", "UiUYnPrcCi");
        setField(term2823, term2823.getClass(), "copyright", "UoYtihxVaS");
        setField(term2823, term2823.getClass(), "artistName", "JDswTTCZHV");
        setField(term2823, term2823.getClass(), "genre", enum2);
        setField(term2823, term2823.getClass(), "releaseVersion", "onpbIeEKoi");
        setField(term2823, term2823.getClass(), "levels", term2907);
        setField(term2821, term2821.getClass(), "music", term2823);
        setBooleanField(term2821, term2821.getClass(), "enable", true);
        setIntField(term2821, term2821.getClass(), "level", -507387516);
        setIntField(term2821, term2821.getClass(), "levelDecimal", -1970452551);
        setIntField(term2821, term2821.getClass(), "diff", -1896376975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnable", argTypes, term2821, args);
    }

};


