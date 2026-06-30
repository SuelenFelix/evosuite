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
import java.lang.Boolean;

public class UserSurvival_setNoDamage_68326060535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107686;
     Object term107693;

    public UserSurvival_setNoDamage_68326060535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107686 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        setLongField(term107686, term107686.getClass(), "id", 0L);
        setField(term107686, term107686.getClass(), "user", null);
        setIntField(term107686, term107686.getClass(), "survivalId", 0);
        setIntField(term107686, term107686.getClass(), "totalScore", 0);
        setIntField(term107686, term107686.getClass(), "totalAchieve", 0);
        setBooleanField(term107686, term107686.getClass(), "isClear", false);
        setBooleanField(term107686, term107686.getClass(), "isNoDamage", false);
        term107693 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term107693;
        callMethod(klass, "setNoDamage", argTypes, term107686, args);
    }

};


