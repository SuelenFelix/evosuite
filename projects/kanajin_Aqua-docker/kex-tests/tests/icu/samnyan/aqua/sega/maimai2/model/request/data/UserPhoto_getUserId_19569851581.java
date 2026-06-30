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

public class UserPhoto_getUserId_19569851581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;

    public UserPhoto_getUserId_19569851581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term75, term75.getClass(), "orderId", -616727354);
        setLongField(term75, term75.getClass(), "userId", -8257434502486459194L);
        setIntField(term75, term75.getClass(), "divNumber", -1955890973);
        setIntField(term75, term75.getClass(), "divLength", -2038273078);
        setField(term75, term75.getClass(), "divData", "xxtlPwDYFs");
        setIntField(term75, term75.getClass(), "placeId", 1227103734);
        setField(term75, term75.getClass(), "clientId", "jJCZpVmanW");
        setField(term75, term75.getClass(), "uploadDate", "EGtDIRbSSb");
        setLongField(term75, term75.getClass(), "playlogId", -8400487765614892086L);
        setIntField(term75, term75.getClass(), "trackNo", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term75, args);
    }

};


