package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserItem_hashCode_115444009634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110837;

    public UserItem_hashCode_115444009634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110837 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        setLongField(term110837, term110837.getClass(), "id", 0L);
        setField(term110837, term110837.getClass(), "user", null);
        setIntField(term110837, term110837.getClass(), "itemKind", 0);
        setIntField(term110837, term110837.getClass(), "itemId", 0);
        setIntField(term110837, term110837.getClass(), "stock", 0);
        setBooleanField(term110837, term110837.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term110837, args);
    }

};


