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

public class UserPhoto_getTrackNo_12469327569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667;

    public UserPhoto_getTrackNo_12469327569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term667, term667.getClass(), "orderId", -817164822);
        setLongField(term667, term667.getClass(), "userId", -6573104506744284592L);
        setIntField(term667, term667.getClass(), "divNumber", -1016503459);
        setIntField(term667, term667.getClass(), "divLength", -1968847291);
        setField(term667, term667.getClass(), "divData", "OclPbYPkcH");
        setIntField(term667, term667.getClass(), "placeId", 579005622);
        setField(term667, term667.getClass(), "clientId", "IoAlmYsBwc");
        setField(term667, term667.getClass(), "uploadDate", "TEParAifyi");
        setLongField(term667, term667.getClass(), "playlogId", -4920224193275732920L);
        setIntField(term667, term667.getClass(), "trackNo", -14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackNo", argTypes, term667, args);
    }

};


