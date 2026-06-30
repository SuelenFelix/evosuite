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

public class UserAll_getUserRecentRatingList_132256488639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38344;

    public UserAll_getUserRecentRatingList_132256488639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38344 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll"));
        setField(term38344, term38344.getClass(), "userPlaylogList", null);
        setField(term38344, term38344.getClass(), "userData", null);
        setField(term38344, term38344.getClass(), "userOption", null);
        setField(term38344, term38344.getClass(), "userId", null);
        setField(term38344, term38344.getClass(), "userWebOption", null);
        setField(term38344, term38344.getClass(), "userMusicDetailList", null);
        setField(term38344, term38344.getClass(), "userItemList", null);
        setField(term38344, term38344.getClass(), "userRecentRatingList", null);
        setField(term38344, term38344.getClass(), "userActivityList", null);
        setField(term38344, term38344.getClass(), "userGradeStatusList", null);
        setField(term38344, term38344.getClass(), "userBossList", null);
        setField(term38344, term38344.getClass(), "userCharacterList", null);
        setField(term38344, term38344.getClass(), "isNewCharacterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserRecentRatingList", argTypes, term38344, args);
    }

};


