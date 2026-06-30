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

public class UserItem_isValid_24724770825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129295;

    public UserItem_isValid_24724770825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129295 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        setLongField(term129295, term129295.getClass(), "id", 0L);
        setField(term129295, term129295.getClass(), "user", null);
        setIntField(term129295, term129295.getClass(), "itemKind", 0);
        setIntField(term129295, term129295.getClass(), "itemId", 0);
        setIntField(term129295, term129295.getClass(), "stock", 0);
        setBooleanField(term129295, term129295.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term129295, args);
    }

};


