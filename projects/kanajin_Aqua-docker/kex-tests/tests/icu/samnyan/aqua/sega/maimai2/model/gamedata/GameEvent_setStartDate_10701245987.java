package icu.samnyan.aqua.sega.maimai2.model.gamedata;

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
import static icu.samnyan.aqua.sega.maimai2.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameEvent_setStartDate_10701245987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327;

    public GameEvent_setStartDate_10701245987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1327 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameEvent"));
        setIntField(term1327, term1327.getClass(), "id", 287287233);
        setIntField(term1327, term1327.getClass(), "type", 962840079);
        setField(term1327, term1327.getClass(), "startDate", "nGKItKLYNC");
        setField(term1327, term1327.getClass(), "endDate", "UiUYnPrcCi");
        setBooleanField(term1327, term1327.getClass(), "enable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setStartDate", argTypes, term1327, args);
    }

};


