package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserEventMusic_getMusicId_21579722532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381334;

    public UserEventMusic_getMusicId_21579722532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381334 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        setLongField(term381334, term381334.getClass(), "id", 0L);
        setField(term381334, term381334.getClass(), "user", null);
        setIntField(term381334, term381334.getClass(), "eventId", 0);
        setIntField(term381334, term381334.getClass(), "type", 0);
        setIntField(term381334, term381334.getClass(), "musicId", 0);
        setIntField(term381334, term381334.getClass(), "level", 0);
        setIntField(term381334, term381334.getClass(), "techScoreMax", 0);
        setIntField(term381334, term381334.getClass(), "platinumScoreMax", 0);
        setField(term381334, term381334.getClass(), "techRecordDate", null);
        setBooleanField(term381334, term381334.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term381334, args);
    }

};


