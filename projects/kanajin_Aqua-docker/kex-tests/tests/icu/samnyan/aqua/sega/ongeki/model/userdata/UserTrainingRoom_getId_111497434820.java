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

public class UserTrainingRoom_getId_111497434820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21842;

    public UserTrainingRoom_getId_111497434820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21842 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        setLongField(term21842, term21842.getClass(), "id", 0L);
        setField(term21842, term21842.getClass(), "user", null);
        setField(term21842, term21842.getClass(), "authKey", null);
        setIntField(term21842, term21842.getClass(), "roomId", 0);
        setIntField(term21842, term21842.getClass(), "cardId", 0);
        setField(term21842, term21842.getClass(), "valueDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term21842, args);
    }

};


