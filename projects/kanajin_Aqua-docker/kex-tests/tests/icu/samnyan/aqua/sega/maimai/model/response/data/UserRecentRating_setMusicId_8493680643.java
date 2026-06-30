package icu.samnyan.aqua.sega.maimai.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserRecentRating_setMusicId_8493680643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;
     Object term505;

    public UserRecentRating_setMusicId_8493680643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserRecentRating"));
        setIntField(term501, term501.getClass(), "musicId", 1324040357);
        setIntField(term501, term501.getClass(), "level", -1588772968);
        setIntField(term501, term501.getClass(), "achieve", -93135961);
        term505 = new Integer(-112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserRecentRating");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term505;
        callMethod(klass, "setMusicId", argTypes, term501, args);
    }

};


