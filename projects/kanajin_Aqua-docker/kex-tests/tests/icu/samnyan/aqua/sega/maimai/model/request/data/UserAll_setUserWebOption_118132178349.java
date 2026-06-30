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

public class UserAll_setUserWebOption_118132178349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38354;

    public UserAll_setUserWebOption_118132178349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38354 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll"));
        setField(term38354, term38354.getClass(), "userPlaylogList", null);
        setField(term38354, term38354.getClass(), "userData", null);
        setField(term38354, term38354.getClass(), "userOption", null);
        setField(term38354, term38354.getClass(), "userId", null);
        setField(term38354, term38354.getClass(), "userWebOption", null);
        setField(term38354, term38354.getClass(), "userMusicDetailList", null);
        setField(term38354, term38354.getClass(), "userItemList", null);
        setField(term38354, term38354.getClass(), "userRecentRatingList", null);
        setField(term38354, term38354.getClass(), "userActivityList", null);
        setField(term38354, term38354.getClass(), "userGradeStatusList", null);
        setField(term38354, term38354.getClass(), "userBossList", null);
        setField(term38354, term38354.getClass(), "userCharacterList", null);
        setField(term38354, term38354.getClass(), "isNewCharacterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserWebOption", argTypes, term38354, args);
    }

};


