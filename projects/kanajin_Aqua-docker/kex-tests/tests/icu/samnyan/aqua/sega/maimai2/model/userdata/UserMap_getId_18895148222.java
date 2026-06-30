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

public class UserMap_getId_18895148222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585324;

    public UserMap_getId_18895148222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585324 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        setLongField(term585324, term585324.getClass(), "id", 0L);
        setField(term585324, term585324.getClass(), "user", null);
        setIntField(term585324, term585324.getClass(), "mapId", 0);
        setIntField(term585324, term585324.getClass(), "distance", 0);
        setBooleanField(term585324, term585324.getClass(), "isLock", false);
        setBooleanField(term585324, term585324.getClass(), "isClear", false);
        setBooleanField(term585324, term585324.getClass(), "isComplete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term585324, args);
    }

};


