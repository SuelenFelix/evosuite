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

public class UserItem_setStock_69619448030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43860;
     Object term43866;

    public UserItem_setStock_69619448030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43860 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        setLongField(term43860, term43860.getClass(), "id", 0L);
        setField(term43860, term43860.getClass(), "user", null);
        setIntField(term43860, term43860.getClass(), "itemKind", 0);
        setIntField(term43860, term43860.getClass(), "itemId", 0);
        setIntField(term43860, term43860.getClass(), "stock", 0);
        setBooleanField(term43860, term43860.getClass(), "isValid", false);
        term43866 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43866;
        callMethod(klass, "setStock", argTypes, term43860, args);
    }

};


