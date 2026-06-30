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

public class UserItem_setStock_150392516227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88922;
     Object term88927;

    public UserItem_setStock_150392516227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88922 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        setLongField(term88922, term88922.getClass(), "id", 0L);
        setField(term88922, term88922.getClass(), "user", null);
        setIntField(term88922, term88922.getClass(), "itemKind", 0);
        setIntField(term88922, term88922.getClass(), "itemId", 0);
        setIntField(term88922, term88922.getClass(), "stock", 0);
        term88927 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term88927;
        callMethod(klass, "setStock", argTypes, term88922, args);
    }

};


