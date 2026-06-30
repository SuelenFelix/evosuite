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

public class UserSurvival_setClear_128909528634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107677;
     Object term107684;

    public UserSurvival_setClear_128909528634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107677 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        setLongField(term107677, term107677.getClass(), "id", 0L);
        setField(term107677, term107677.getClass(), "user", null);
        setIntField(term107677, term107677.getClass(), "survivalId", 0);
        setIntField(term107677, term107677.getClass(), "totalScore", 0);
        setIntField(term107677, term107677.getClass(), "totalAchieve", 0);
        setBooleanField(term107677, term107677.getClass(), "isClear", false);
        setBooleanField(term107677, term107677.getClass(), "isNoDamage", false);
        term107684 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term107684;
        callMethod(klass, "setClear", argTypes, term107677, args);
    }

};


