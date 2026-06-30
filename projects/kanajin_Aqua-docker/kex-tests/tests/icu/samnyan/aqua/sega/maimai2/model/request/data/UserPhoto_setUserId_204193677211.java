package icu.samnyan.aqua.sega.maimai2.model.request.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserPhoto_setUserId_204193677211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817;
     Object term861;

    public UserPhoto_setUserId_204193677211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term817 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term817, term817.getClass(), "orderId", 458147407);
        setLongField(term817, term817.getClass(), "userId", 8059786003080744426L);
        setIntField(term817, term817.getClass(), "divNumber", -184153539);
        setIntField(term817, term817.getClass(), "divLength", 493620644);
        setField(term817, term817.getClass(), "divData", "SbAoxhfrkn");
        setIntField(term817, term817.getClass(), "placeId", 1328271830);
        setField(term817, term817.getClass(), "clientId", "kuTXqwMtDB");
        setField(term817, term817.getClass(), "uploadDate", "Ghbwtircqb");
        setLongField(term817, term817.getClass(), "playlogId", -4365849114644724155L);
        setIntField(term817, term817.getClass(), "trackNo", 1596070772);
        term861 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term861;
        callMethod(klass, "setUserId", argTypes, term817, args);
    }

};


