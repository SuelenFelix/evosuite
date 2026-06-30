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

public class UserMap_setMapId_21687889231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585389;
     Object term585396;

    public UserMap_setMapId_21687889231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585389 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        setLongField(term585389, term585389.getClass(), "id", 0L);
        setField(term585389, term585389.getClass(), "user", null);
        setIntField(term585389, term585389.getClass(), "mapId", 0);
        setIntField(term585389, term585389.getClass(), "distance", 0);
        setBooleanField(term585389, term585389.getClass(), "isLock", false);
        setBooleanField(term585389, term585389.getClass(), "isClear", false);
        setBooleanField(term585389, term585389.getClass(), "isComplete", false);
        term585396 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term585396;
        callMethod(klass, "setMapId", argTypes, term585389, args);
    }

};


