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

public class UserItem_hashCode_19380755134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43888;

    public UserItem_hashCode_19380755134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43888 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        setLongField(term43888, term43888.getClass(), "id", 0L);
        setField(term43888, term43888.getClass(), "user", null);
        setIntField(term43888, term43888.getClass(), "itemKind", 0);
        setIntField(term43888, term43888.getClass(), "itemId", 0);
        setIntField(term43888, term43888.getClass(), "stock", 0);
        setBooleanField(term43888, term43888.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term43888, args);
    }

};


