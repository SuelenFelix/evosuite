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
import java.lang.Integer;

public class UserSurvival_setTotalAchieve_52915091833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107668;
     Object term107675;

    public UserSurvival_setTotalAchieve_52915091833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107668 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        setLongField(term107668, term107668.getClass(), "id", 0L);
        setField(term107668, term107668.getClass(), "user", null);
        setIntField(term107668, term107668.getClass(), "survivalId", 0);
        setIntField(term107668, term107668.getClass(), "totalScore", 0);
        setIntField(term107668, term107668.getClass(), "totalAchieve", 0);
        setBooleanField(term107668, term107668.getClass(), "isClear", false);
        setBooleanField(term107668, term107668.getClass(), "isNoDamage", false);
        term107675 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107675;
        callMethod(klass, "setTotalAchieve", argTypes, term107668, args);
    }

};


