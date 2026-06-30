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
import java.lang.Boolean;

public class UserMusicDetail_setAllPerfect_47971939951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188735;
     Object term188747;

    public UserMusicDetail_setAllPerfect_47971939951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188735 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188735, term188735.getClass(), "id", 0L);
        setField(term188735, term188735.getClass(), "user", null);
        setIntField(term188735, term188735.getClass(), "musicId", 0);
        setIntField(term188735, term188735.getClass(), "level", 0);
        setIntField(term188735, term188735.getClass(), "playCount", 0);
        setIntField(term188735, term188735.getClass(), "scoreMax", 0);
        setIntField(term188735, term188735.getClass(), "syncRateMax", 0);
        setBooleanField(term188735, term188735.getClass(), "isAllPerfect", false);
        setIntField(term188735, term188735.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188735, term188735.getClass(), "fullCombo", 0);
        setIntField(term188735, term188735.getClass(), "maxFever", 0);
        setIntField(term188735, term188735.getClass(), "achievement", 0);
        term188747 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term188747;
        callMethod(klass, "setAllPerfect", argTypes, term188735, args);
    }

};


