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
import java.lang.Integer;

public class UserPhoto_setOrderId_167799753136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2019;
     Object term2027;

    public UserPhoto_setOrderId_167799753136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2019 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2019, term2019.getClass(), "orderId", 0);
        setLongField(term2019, term2019.getClass(), "userId", 0L);
        setIntField(term2019, term2019.getClass(), "divNumber", 0);
        setIntField(term2019, term2019.getClass(), "divLength", 0);
        setField(term2019, term2019.getClass(), "divData", null);
        setIntField(term2019, term2019.getClass(), "placeId", 0);
        setField(term2019, term2019.getClass(), "clientId", null);
        setField(term2019, term2019.getClass(), "uploadDate", null);
        setLongField(term2019, term2019.getClass(), "playlogId", 0L);
        setIntField(term2019, term2019.getClass(), "trackNo", 0);
        term2027 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2027;
        callMethod(klass, "setOrderId", argTypes, term2019, args);
    }

};


