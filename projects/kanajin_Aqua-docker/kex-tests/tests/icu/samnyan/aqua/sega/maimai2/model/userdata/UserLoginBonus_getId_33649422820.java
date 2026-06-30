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

public class UserLoginBonus_getId_33649422820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54853;

    public UserLoginBonus_getId_33649422820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54853 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus"));
        setLongField(term54853, term54853.getClass(), "id", 0L);
        setField(term54853, term54853.getClass(), "user", null);
        setIntField(term54853, term54853.getClass(), "bonusId", 0);
        setIntField(term54853, term54853.getClass(), "point", 0);
        setBooleanField(term54853, term54853.getClass(), "isCurrent", false);
        setBooleanField(term54853, term54853.getClass(), "isComplete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term54853, args);
    }

};


