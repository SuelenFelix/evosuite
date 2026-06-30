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

public class UserPhoto_getPlaylogId_20134406858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593;

    public UserPhoto_getPlaylogId_20134406858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term593 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term593, term593.getClass(), "orderId", 1962444399);
        setLongField(term593, term593.getClass(), "userId", -316468845751588286L);
        setIntField(term593, term593.getClass(), "divNumber", 767834723);
        setIntField(term593, term593.getClass(), "divLength", -602026508);
        setField(term593, term593.getClass(), "divData", "BYqFIqCKAV");
        setIntField(term593, term593.getClass(), "placeId", -157887805);
        setField(term593, term593.getClass(), "clientId", "vrQLuWIDJX");
        setField(term593, term593.getClass(), "uploadDate", "flxyYxBRtu");
        setLongField(term593, term593.getClass(), "playlogId", 5127676408959197577L);
        setIntField(term593, term593.getClass(), "trackNo", 1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaylogId", argTypes, term593, args);
    }

};


