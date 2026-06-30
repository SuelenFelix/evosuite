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

public class UserAll_getUserCharacterList_58049309543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38348;

    public UserAll_getUserCharacterList_58049309543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38348 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll"));
        setField(term38348, term38348.getClass(), "userPlaylogList", null);
        setField(term38348, term38348.getClass(), "userData", null);
        setField(term38348, term38348.getClass(), "userOption", null);
        setField(term38348, term38348.getClass(), "userId", null);
        setField(term38348, term38348.getClass(), "userWebOption", null);
        setField(term38348, term38348.getClass(), "userMusicDetailList", null);
        setField(term38348, term38348.getClass(), "userItemList", null);
        setField(term38348, term38348.getClass(), "userRecentRatingList", null);
        setField(term38348, term38348.getClass(), "userActivityList", null);
        setField(term38348, term38348.getClass(), "userGradeStatusList", null);
        setField(term38348, term38348.getClass(), "userBossList", null);
        setField(term38348, term38348.getClass(), "userCharacterList", null);
        setField(term38348, term38348.getClass(), "isNewCharacterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCharacterList", argTypes, term38348, args);
    }

};


