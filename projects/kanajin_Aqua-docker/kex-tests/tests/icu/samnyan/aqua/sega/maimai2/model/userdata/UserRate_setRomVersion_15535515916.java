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

public class UserRate_setRomVersion_15535515916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166295;
     Object term166300;

    public UserRate_setRomVersion_15535515916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166295 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserRate"));
        setIntField(term166295, term166295.getClass(), "musicId", -570039168);
        setIntField(term166295, term166295.getClass(), "level", -43796344);
        setIntField(term166295, term166295.getClass(), "romVersion", 297571645);
        setIntField(term166295, term166295.getClass(), "achievement", 2088590010);
        term166300 = new Integer(-1799691099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term166300;
        callMethod(klass, "setRomVersion", argTypes, term166295, args);
    }

};


