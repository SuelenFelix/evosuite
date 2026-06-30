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

public class UserEventMusic_setLevel_184389135543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381441;
     Object term381450;

    public UserEventMusic_setLevel_184389135543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381441 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        setLongField(term381441, term381441.getClass(), "id", 0L);
        setField(term381441, term381441.getClass(), "user", null);
        setIntField(term381441, term381441.getClass(), "eventId", 0);
        setIntField(term381441, term381441.getClass(), "type", 0);
        setIntField(term381441, term381441.getClass(), "musicId", 0);
        setIntField(term381441, term381441.getClass(), "level", 0);
        setIntField(term381441, term381441.getClass(), "techScoreMax", 0);
        setIntField(term381441, term381441.getClass(), "platinumScoreMax", 0);
        setField(term381441, term381441.getClass(), "techRecordDate", null);
        setBooleanField(term381441, term381441.getClass(), "isTechNewRecord", false);
        term381450 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term381450;
        callMethod(klass, "setLevel", argTypes, term381441, args);
    }

};


