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

public class UserAll_getUserItemList_110207869338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38343;

    public UserAll_getUserItemList_110207869338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38343 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll"));
        setField(term38343, term38343.getClass(), "userPlaylogList", null);
        setField(term38343, term38343.getClass(), "userData", null);
        setField(term38343, term38343.getClass(), "userOption", null);
        setField(term38343, term38343.getClass(), "userId", null);
        setField(term38343, term38343.getClass(), "userWebOption", null);
        setField(term38343, term38343.getClass(), "userMusicDetailList", null);
        setField(term38343, term38343.getClass(), "userItemList", null);
        setField(term38343, term38343.getClass(), "userRecentRatingList", null);
        setField(term38343, term38343.getClass(), "userActivityList", null);
        setField(term38343, term38343.getClass(), "userGradeStatusList", null);
        setField(term38343, term38343.getClass(), "userBossList", null);
        setField(term38343, term38343.getClass(), "userCharacterList", null);
        setField(term38343, term38343.getClass(), "isNewCharacterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserItemList", argTypes, term38343, args);
    }

};


