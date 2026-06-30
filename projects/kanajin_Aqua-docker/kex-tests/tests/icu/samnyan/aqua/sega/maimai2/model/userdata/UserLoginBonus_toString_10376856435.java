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

public class UserLoginBonus_toString_10376856435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54953;

    public UserLoginBonus_toString_10376856435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54953 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus"));
        setLongField(term54953, term54953.getClass(), "id", 0L);
        setField(term54953, term54953.getClass(), "user", null);
        setIntField(term54953, term54953.getClass(), "bonusId", 0);
        setIntField(term54953, term54953.getClass(), "point", 0);
        setBooleanField(term54953, term54953.getClass(), "isCurrent", false);
        setBooleanField(term54953, term54953.getClass(), "isComplete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term54953, args);
    }

};


