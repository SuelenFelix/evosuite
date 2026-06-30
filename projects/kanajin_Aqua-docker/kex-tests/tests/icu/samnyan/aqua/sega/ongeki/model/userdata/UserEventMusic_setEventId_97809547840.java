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
import java.lang.Integer;

public class UserEventMusic_setEventId_97809547840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381408;
     Object term381417;

    public UserEventMusic_setEventId_97809547840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381408 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        setLongField(term381408, term381408.getClass(), "id", 0L);
        setField(term381408, term381408.getClass(), "user", null);
        setIntField(term381408, term381408.getClass(), "eventId", 0);
        setIntField(term381408, term381408.getClass(), "type", 0);
        setIntField(term381408, term381408.getClass(), "musicId", 0);
        setIntField(term381408, term381408.getClass(), "level", 0);
        setIntField(term381408, term381408.getClass(), "techScoreMax", 0);
        setIntField(term381408, term381408.getClass(), "platinumScoreMax", 0);
        setField(term381408, term381408.getClass(), "techRecordDate", null);
        setBooleanField(term381408, term381408.getClass(), "isTechNewRecord", false);
        term381417 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term381417;
        callMethod(klass, "setEventId", argTypes, term381408, args);
    }

};


