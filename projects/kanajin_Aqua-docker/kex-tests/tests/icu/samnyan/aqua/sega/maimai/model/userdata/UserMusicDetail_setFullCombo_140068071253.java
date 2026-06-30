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
import java.lang.Integer;

public class UserMusicDetail_setFullCombo_140068071253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188763;
     Object term188775;

    public UserMusicDetail_setFullCombo_140068071253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188763 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188763, term188763.getClass(), "id", 0L);
        setField(term188763, term188763.getClass(), "user", null);
        setIntField(term188763, term188763.getClass(), "musicId", 0);
        setIntField(term188763, term188763.getClass(), "level", 0);
        setIntField(term188763, term188763.getClass(), "playCount", 0);
        setIntField(term188763, term188763.getClass(), "scoreMax", 0);
        setIntField(term188763, term188763.getClass(), "syncRateMax", 0);
        setBooleanField(term188763, term188763.getClass(), "isAllPerfect", false);
        setIntField(term188763, term188763.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188763, term188763.getClass(), "fullCombo", 0);
        setIntField(term188763, term188763.getClass(), "maxFever", 0);
        setIntField(term188763, term188763.getClass(), "achievement", 0);
        term188775 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term188775;
        callMethod(klass, "setFullCombo", argTypes, term188763, args);
    }

};


