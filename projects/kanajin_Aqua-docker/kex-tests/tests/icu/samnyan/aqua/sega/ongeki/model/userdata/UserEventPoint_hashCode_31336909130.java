package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserEventPoint_hashCode_31336909130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388893;

    public UserEventPoint_hashCode_31336909130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388893 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        setLongField(term388893, term388893.getClass(), "id", 0L);
        setField(term388893, term388893.getClass(), "user", null);
        setIntField(term388893, term388893.getClass(), "eventId", 0);
        setLongField(term388893, term388893.getClass(), "point", 0L);
        setBooleanField(term388893, term388893.getClass(), "isRankingRewarded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term388893, args);
    }

};


