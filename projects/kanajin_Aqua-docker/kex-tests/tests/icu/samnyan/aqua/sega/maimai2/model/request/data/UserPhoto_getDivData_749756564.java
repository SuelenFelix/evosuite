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

public class UserPhoto_getDivData_749756564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297;

    public UserPhoto_getDivData_749756564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term297, term297.getClass(), "orderId", -655067527);
        setLongField(term297, term297.getClass(), "userId", -7237588299778557629L);
        setIntField(term297, term297.getClass(), "divNumber", -6029667);
        setIntField(term297, term297.getClass(), "divLength", -2068769794);
        setField(term297, term297.getClass(), "divData", "MxlszYVzRf");
        setIntField(term297, term297.getClass(), "placeId", -117576464);
        setField(term297, term297.getClass(), "clientId", "LQFpaHEwXR");
        setField(term297, term297.getClass(), "uploadDate", "oVcInYnLWB");
        setLongField(term297, term297.getClass(), "playlogId", 6967924379644551255L);
        setIntField(term297, term297.getClass(), "trackNo", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDivData", argTypes, term297, args);
    }

};


