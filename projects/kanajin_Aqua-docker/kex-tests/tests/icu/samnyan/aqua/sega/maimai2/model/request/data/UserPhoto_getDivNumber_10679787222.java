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

public class UserPhoto_getDivNumber_10679787222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;

    public UserPhoto_getDivNumber_10679787222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term149, term149.getClass(), "orderId", 1725571209);
        setLongField(term149, term149.getClass(), "userId", 5270370404989704783L);
        setIntField(term149, term149.getClass(), "divNumber", -522618178);
        setIntField(term149, term149.getClass(), "divLength", 1134449235);
        setField(term149, term149.getClass(), "divData", "SzjVpOQTyS");
        setIntField(term149, term149.getClass(), "placeId", -883034806);
        setField(term149, term149.getClass(), "clientId", "MjGYSRKTNF");
        setField(term149, term149.getClass(), "uploadDate", "hRNSzYYIrc");
        setLongField(term149, term149.getClass(), "playlogId", 7411271909051562686L);
        setIntField(term149, term149.getClass(), "trackNo", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDivNumber", argTypes, term149, args);
    }

};


