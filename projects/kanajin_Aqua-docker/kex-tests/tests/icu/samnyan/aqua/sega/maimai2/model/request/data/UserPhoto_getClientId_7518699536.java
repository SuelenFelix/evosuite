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

public class UserPhoto_getClientId_7518699536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public UserPhoto_getClientId_7518699536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term445, term445.getClass(), "orderId", -203030934);
        setLongField(term445, term445.getClass(), "userId", -4325723315152823407L);
        setIntField(term445, term445.getClass(), "divNumber", -1179120542);
        setIntField(term445, term445.getClass(), "divLength", -73683645);
        setField(term445, term445.getClass(), "divData", "HyxfbSQYBe");
        setIntField(term445, term445.getClass(), "placeId", -226514366);
        setField(term445, term445.getClass(), "clientId", "pCTimMblYc");
        setField(term445, term445.getClass(), "uploadDate", "hNxWaHcfhY");
        setLongField(term445, term445.getClass(), "playlogId", 2535595959091595249L);
        setIntField(term445, term445.getClass(), "trackNo", 1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientId", argTypes, term445, args);
    }

};


