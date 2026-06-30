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

public class UserItem_setItemId_71349058626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88915;
     Object term88920;

    public UserItem_setItemId_71349058626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88915 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        setLongField(term88915, term88915.getClass(), "id", 0L);
        setField(term88915, term88915.getClass(), "user", null);
        setIntField(term88915, term88915.getClass(), "itemKind", 0);
        setIntField(term88915, term88915.getClass(), "itemId", 0);
        setIntField(term88915, term88915.getClass(), "stock", 0);
        term88920 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term88920;
        callMethod(klass, "setItemId", argTypes, term88915, args);
    }

};


