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
import java.lang.Boolean;

public class UserLoginBonus_setComplete_35075013231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54927;
     Object term54933;

    public UserLoginBonus_setComplete_35075013231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54927 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus"));
        setLongField(term54927, term54927.getClass(), "id", 0L);
        setField(term54927, term54927.getClass(), "user", null);
        setIntField(term54927, term54927.getClass(), "bonusId", 0);
        setIntField(term54927, term54927.getClass(), "point", 0);
        setBooleanField(term54927, term54927.getClass(), "isCurrent", false);
        setBooleanField(term54927, term54927.getClass(), "isComplete", false);
        term54933 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54933;
        callMethod(klass, "setComplete", argTypes, term54927, args);
    }

};


