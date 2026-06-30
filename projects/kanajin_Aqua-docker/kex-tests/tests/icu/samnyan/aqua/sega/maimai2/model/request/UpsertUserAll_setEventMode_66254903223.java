package icu.samnyan.aqua.sega.maimai2.model.request;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UpsertUserAll_setEventMode_66254903223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21547;
     Object term21552;

    public UpsertUserAll_setEventMode_66254903223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21547 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll"));
        setLongField(term21547, term21547.getClass(), "userId", 0L);
        setLongField(term21547, term21547.getClass(), "playlogId", 0L);
        setBooleanField(term21547, term21547.getClass(), "isEventMode", false);
        setBooleanField(term21547, term21547.getClass(), "isFreePlay", false);
        setField(term21547, term21547.getClass(), "upsertUserAll", null);
        term21552 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term21552;
        callMethod(klass, "setEventMode", argTypes, term21547, args);
    }

};


