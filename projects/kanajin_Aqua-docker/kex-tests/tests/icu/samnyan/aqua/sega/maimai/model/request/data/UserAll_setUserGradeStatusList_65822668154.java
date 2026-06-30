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

public class UserAll_setUserGradeStatusList_65822668154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38359;

    public UserAll_setUserGradeStatusList_65822668154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38359 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll"));
        setField(term38359, term38359.getClass(), "userPlaylogList", null);
        setField(term38359, term38359.getClass(), "userData", null);
        setField(term38359, term38359.getClass(), "userOption", null);
        setField(term38359, term38359.getClass(), "userId", null);
        setField(term38359, term38359.getClass(), "userWebOption", null);
        setField(term38359, term38359.getClass(), "userMusicDetailList", null);
        setField(term38359, term38359.getClass(), "userItemList", null);
        setField(term38359, term38359.getClass(), "userRecentRatingList", null);
        setField(term38359, term38359.getClass(), "userActivityList", null);
        setField(term38359, term38359.getClass(), "userGradeStatusList", null);
        setField(term38359, term38359.getClass(), "userBossList", null);
        setField(term38359, term38359.getClass(), "userCharacterList", null);
        setField(term38359, term38359.getClass(), "isNewCharacterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserGradeStatusList", argTypes, term38359, args);
    }

};


