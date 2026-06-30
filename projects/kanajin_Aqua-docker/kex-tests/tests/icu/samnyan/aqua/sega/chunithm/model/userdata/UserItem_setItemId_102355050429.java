package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserItem_setItemId_102355050429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129323;
     Object term129329;

    public UserItem_setItemId_102355050429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129323 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        setLongField(term129323, term129323.getClass(), "id", 0L);
        setField(term129323, term129323.getClass(), "user", null);
        setIntField(term129323, term129323.getClass(), "itemKind", 0);
        setIntField(term129323, term129323.getClass(), "itemId", 0);
        setIntField(term129323, term129323.getClass(), "stock", 0);
        setBooleanField(term129323, term129323.getClass(), "isValid", false);
        term129329 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term129329;
        callMethod(klass, "setItemId", argTypes, term129323, args);
    }

};


