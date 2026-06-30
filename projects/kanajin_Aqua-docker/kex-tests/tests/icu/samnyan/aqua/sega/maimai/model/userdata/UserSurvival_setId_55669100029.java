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
import java.lang.Long;

public class UserSurvival_setId_55669100029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107634;
     Object term107641;

    public UserSurvival_setId_55669100029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107634 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        setLongField(term107634, term107634.getClass(), "id", 0L);
        setField(term107634, term107634.getClass(), "user", null);
        setIntField(term107634, term107634.getClass(), "survivalId", 0);
        setIntField(term107634, term107634.getClass(), "totalScore", 0);
        setIntField(term107634, term107634.getClass(), "totalAchieve", 0);
        setBooleanField(term107634, term107634.getClass(), "isClear", false);
        setBooleanField(term107634, term107634.getClass(), "isNoDamage", false);
        term107641 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term107641;
        callMethod(klass, "setId", argTypes, term107634, args);
    }

};


