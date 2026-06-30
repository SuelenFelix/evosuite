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

public class UserPhoto_setClientId_195675490316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217;

    public UserPhoto_setClientId_195675490316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1217 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1217, term1217.getClass(), "orderId", -1465035361);
        setLongField(term1217, term1217.getClass(), "userId", -6823727938421990489L);
        setIntField(term1217, term1217.getClass(), "divNumber", 1090617576);
        setIntField(term1217, term1217.getClass(), "divLength", -1547384488);
        setField(term1217, term1217.getClass(), "divData", "jDtqGUpnZN");
        setIntField(term1217, term1217.getClass(), "placeId", 1442160736);
        setField(term1217, term1217.getClass(), "clientId", "nGKItKLYNC");
        setField(term1217, term1217.getClass(), "uploadDate", "UiUYnPrcCi");
        setLongField(term1217, term1217.getClass(), "playlogId", -484994522244390100L);
        setIntField(term1217, term1217.getClass(), "trackNo", 1114000454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setClientId", argTypes, term1217, args);
    }

};


