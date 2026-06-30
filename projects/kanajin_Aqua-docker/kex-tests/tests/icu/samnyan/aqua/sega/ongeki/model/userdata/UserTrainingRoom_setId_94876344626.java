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
import java.lang.Long;

public class UserTrainingRoom_setId_94876344626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21866;
     Object term21870;

    public UserTrainingRoom_setId_94876344626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21866 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        setLongField(term21866, term21866.getClass(), "id", 0L);
        setField(term21866, term21866.getClass(), "user", null);
        setField(term21866, term21866.getClass(), "authKey", null);
        setIntField(term21866, term21866.getClass(), "roomId", 0);
        setIntField(term21866, term21866.getClass(), "cardId", 0);
        setField(term21866, term21866.getClass(), "valueDate", null);
        term21870 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term21870;
        callMethod(klass, "setId", argTypes, term21866, args);
    }

};


