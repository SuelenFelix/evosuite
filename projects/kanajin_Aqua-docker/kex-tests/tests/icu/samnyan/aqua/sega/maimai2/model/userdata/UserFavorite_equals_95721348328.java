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

public class UserFavorite_equals_95721348328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573229;

    public UserFavorite_equals_95721348328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573229 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite"));
        setLongField(term573229, term573229.getClass(), "id", 0L);
        setField(term573229, term573229.getClass(), "user", null);
        setLongField(term573229, term573229.getClass(), "favUserId", 0L);
        setIntField(term573229, term573229.getClass(), "itemKind", 0);
        setField(term573229, term573229.getClass(), "itemIdList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term573229, args);
    }

};


