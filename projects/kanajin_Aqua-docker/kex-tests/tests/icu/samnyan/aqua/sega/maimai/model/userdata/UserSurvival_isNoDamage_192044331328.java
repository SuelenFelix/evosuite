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

public class UserSurvival_isNoDamage_192044331328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107627;

    public UserSurvival_isNoDamage_192044331328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107627 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        setLongField(term107627, term107627.getClass(), "id", 0L);
        setField(term107627, term107627.getClass(), "user", null);
        setIntField(term107627, term107627.getClass(), "survivalId", 0);
        setIntField(term107627, term107627.getClass(), "totalScore", 0);
        setIntField(term107627, term107627.getClass(), "totalAchieve", 0);
        setBooleanField(term107627, term107627.getClass(), "isClear", false);
        setBooleanField(term107627, term107627.getClass(), "isNoDamage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNoDamage", argTypes, term107627, args);
    }

};


