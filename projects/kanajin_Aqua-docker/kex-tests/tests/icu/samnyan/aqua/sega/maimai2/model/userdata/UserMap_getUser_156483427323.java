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

public class UserMap_getUser_156483427323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585331;

    public UserMap_getUser_156483427323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585331 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        setLongField(term585331, term585331.getClass(), "id", 0L);
        setField(term585331, term585331.getClass(), "user", null);
        setIntField(term585331, term585331.getClass(), "mapId", 0);
        setIntField(term585331, term585331.getClass(), "distance", 0);
        setBooleanField(term585331, term585331.getClass(), "isLock", false);
        setBooleanField(term585331, term585331.getClass(), "isClear", false);
        setBooleanField(term585331, term585331.getClass(), "isComplete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term585331, args);
    }

};


