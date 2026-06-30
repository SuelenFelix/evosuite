package icu.samnyan.aqua.sega.maimai2.model.request;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UploadUserPhoto_init_2461131516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2685;

    public UploadUserPhoto_init_2461131516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2685 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2685, term2685.getClass(), "orderId", -243422082);
        setLongField(term2685, term2685.getClass(), "userId", 414749984815662075L);
        setIntField(term2685, term2685.getClass(), "divNumber", 1384592638);
        setIntField(term2685, term2685.getClass(), "divLength", -1002370457);
        setField(term2685, term2685.getClass(), "divData", "BKLfkLiZTH");
        setIntField(term2685, term2685.getClass(), "placeId", -2014576105);
        setField(term2685, term2685.getClass(), "clientId", "SPpkrGcPRr");
        setField(term2685, term2685.getClass(), "uploadDate", "sEccwbJKYE");
        setLongField(term2685, term2685.getClass(), "playlogId", 463622836963501975L);
        setIntField(term2685, term2685.getClass(), "trackNo", 1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Object[] args = new Object[1];
        args[0] = term2685;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


