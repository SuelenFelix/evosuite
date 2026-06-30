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

public class UserEventMusic_canEqual_85942646449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381503;

    public UserEventMusic_canEqual_85942646449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381503 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        setLongField(term381503, term381503.getClass(), "id", 0L);
        setField(term381503, term381503.getClass(), "user", null);
        setIntField(term381503, term381503.getClass(), "eventId", 0);
        setIntField(term381503, term381503.getClass(), "type", 0);
        setIntField(term381503, term381503.getClass(), "musicId", 0);
        setIntField(term381503, term381503.getClass(), "level", 0);
        setIntField(term381503, term381503.getClass(), "techScoreMax", 0);
        setIntField(term381503, term381503.getClass(), "platinumScoreMax", 0);
        setField(term381503, term381503.getClass(), "techRecordDate", null);
        setBooleanField(term381503, term381503.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term381503, args);
    }

};


