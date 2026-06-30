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

public class UserPresentEvent_getPresentCount_152831824224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101797;

    public UserPresentEvent_getPresentCount_152831824224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101797 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        setLongField(term101797, term101797.getClass(), "id", 0L);
        setField(term101797, term101797.getClass(), "user", null);
        setIntField(term101797, term101797.getClass(), "presentEventId", 0);
        setIntField(term101797, term101797.getClass(), "point", 0);
        setIntField(term101797, term101797.getClass(), "presentCount", 0);
        setIntField(term101797, term101797.getClass(), "rate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPresentCount", argTypes, term101797, args);
    }

};


