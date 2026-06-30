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

public class UserPhoto_setOrderId_167799753110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;
     Object term785;

    public UserPhoto_setOrderId_167799753110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term741, term741.getClass(), "orderId", 1632125673);
        setLongField(term741, term741.getClass(), "userId", 8428634514691209827L);
        setIntField(term741, term741.getClass(), "divNumber", 454281060);
        setIntField(term741, term741.getClass(), "divLength", -1786399638);
        setField(term741, term741.getClass(), "divData", "OWDIEULEFu");
        setIntField(term741, term741.getClass(), "placeId", 2055867847);
        setField(term741, term741.getClass(), "clientId", "dWRymuLBtr");
        setField(term741, term741.getClass(), "uploadDate", "AijpHYOFuy");
        setLongField(term741, term741.getClass(), "playlogId", -2585684163342970173L);
        setIntField(term741, term741.getClass(), "trackNo", -1048298087);
        term785 = new Integer(292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term785;
        callMethod(klass, "setOrderId", argTypes, term741, args);
    }

};


