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

public class UserPhoto_hashCode_72947448922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1711;

    public UserPhoto_hashCode_72947448922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1711 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1711, term1711.getClass(), "orderId", 691577392);
        setLongField(term1711, term1711.getClass(), "userId", -2170847986967241072L);
        setIntField(term1711, term1711.getClass(), "divNumber", -893623680);
        setIntField(term1711, term1711.getClass(), "divLength", -1963434938);
        setField(term1711, term1711.getClass(), "divData", "bLPjGVBhlX");
        setIntField(term1711, term1711.getClass(), "placeId", 906181092);
        setField(term1711, term1711.getClass(), "clientId", "whBvTVIIlC");
        setField(term1711, term1711.getClass(), "uploadDate", "IgRJUzaCwW");
        setLongField(term1711, term1711.getClass(), "playlogId", 4044358158040652353L);
        setIntField(term1711, term1711.getClass(), "trackNo", 1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1711, args);
    }

};


