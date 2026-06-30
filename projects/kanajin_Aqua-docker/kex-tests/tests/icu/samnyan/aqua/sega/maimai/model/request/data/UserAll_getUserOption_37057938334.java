package icu.samnyan.aqua.sega.maimai.model.request.data;

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
import static icu.samnyan.aqua.sega.maimai.model.request.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserAll_getUserOption_37057938334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38339;

    public UserAll_getUserOption_37057938334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38339 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll"));
        setField(term38339, term38339.getClass(), "userPlaylogList", null);
        setField(term38339, term38339.getClass(), "userData", null);
        setField(term38339, term38339.getClass(), "userOption", null);
        setField(term38339, term38339.getClass(), "userId", null);
        setField(term38339, term38339.getClass(), "userWebOption", null);
        setField(term38339, term38339.getClass(), "userMusicDetailList", null);
        setField(term38339, term38339.getClass(), "userItemList", null);
        setField(term38339, term38339.getClass(), "userRecentRatingList", null);
        setField(term38339, term38339.getClass(), "userActivityList", null);
        setField(term38339, term38339.getClass(), "userGradeStatusList", null);
        setField(term38339, term38339.getClass(), "userBossList", null);
        setField(term38339, term38339.getClass(), "userCharacterList", null);
        setField(term38339, term38339.getClass(), "isNewCharacterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserOption", argTypes, term38339, args);
    }

};


