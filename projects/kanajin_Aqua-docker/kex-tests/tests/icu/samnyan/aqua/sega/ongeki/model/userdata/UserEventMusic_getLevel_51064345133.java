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

public class UserEventMusic_getLevel_51064345133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381343;

    public UserEventMusic_getLevel_51064345133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381343 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        setLongField(term381343, term381343.getClass(), "id", 0L);
        setField(term381343, term381343.getClass(), "user", null);
        setIntField(term381343, term381343.getClass(), "eventId", 0);
        setIntField(term381343, term381343.getClass(), "type", 0);
        setIntField(term381343, term381343.getClass(), "musicId", 0);
        setIntField(term381343, term381343.getClass(), "level", 0);
        setIntField(term381343, term381343.getClass(), "techScoreMax", 0);
        setIntField(term381343, term381343.getClass(), "platinumScoreMax", 0);
        setField(term381343, term381343.getClass(), "techRecordDate", null);
        setBooleanField(term381343, term381343.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term381343, args);
    }

};


