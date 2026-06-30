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
import java.lang.Long;

public class UserEventPoint_setId_147233467723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388850;
     Object term388855;

    public UserEventPoint_setId_147233467723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388850 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        setLongField(term388850, term388850.getClass(), "id", 0L);
        setField(term388850, term388850.getClass(), "user", null);
        setIntField(term388850, term388850.getClass(), "eventId", 0);
        setLongField(term388850, term388850.getClass(), "point", 0L);
        setBooleanField(term388850, term388850.getClass(), "isRankingRewarded", false);
        term388855 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term388855;
        callMethod(klass, "setId", argTypes, term388850, args);
    }

};


