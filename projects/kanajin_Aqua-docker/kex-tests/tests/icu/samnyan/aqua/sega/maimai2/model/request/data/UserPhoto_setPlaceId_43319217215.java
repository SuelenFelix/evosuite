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

public class UserPhoto_setPlaceId_43319217215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1141;
     Object term1185;

    public UserPhoto_setPlaceId_43319217215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1141 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1141, term1141.getClass(), "orderId", 1375330971);
        setLongField(term1141, term1141.getClass(), "userId", -5892135042702373494L);
        setIntField(term1141, term1141.getClass(), "divNumber", -478195677);
        setIntField(term1141, term1141.getClass(), "divLength", 972867650);
        setField(term1141, term1141.getClass(), "divData", "tShwQLRGNe");
        setIntField(term1141, term1141.getClass(), "placeId", 1655935355);
        setField(term1141, term1141.getClass(), "clientId", "LvtrsXUliU");
        setField(term1141, term1141.getClass(), "uploadDate", "xLbjWUgOIL");
        setLongField(term1141, term1141.getClass(), "playlogId", 5262507301787091109L);
        setIntField(term1141, term1141.getClass(), "trackNo", -481533957);
        term1185 = new Integer(1240914516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1185;
        callMethod(klass, "setPlaceId", argTypes, term1141, args);
    }

};


