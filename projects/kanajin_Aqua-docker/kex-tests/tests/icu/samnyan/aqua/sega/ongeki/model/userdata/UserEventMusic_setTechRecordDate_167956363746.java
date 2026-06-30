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

public class UserEventMusic_setTechRecordDate_167956363746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381474;

    public UserEventMusic_setTechRecordDate_167956363746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381474 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        setLongField(term381474, term381474.getClass(), "id", 0L);
        setField(term381474, term381474.getClass(), "user", null);
        setIntField(term381474, term381474.getClass(), "eventId", 0);
        setIntField(term381474, term381474.getClass(), "type", 0);
        setIntField(term381474, term381474.getClass(), "musicId", 0);
        setIntField(term381474, term381474.getClass(), "level", 0);
        setIntField(term381474, term381474.getClass(), "techScoreMax", 0);
        setIntField(term381474, term381474.getClass(), "platinumScoreMax", 0);
        setField(term381474, term381474.getClass(), "techRecordDate", null);
        setBooleanField(term381474, term381474.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTechRecordDate", argTypes, term381474, args);
    }

};


