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

public class UserTechCount_getAllBreakCount_64911749621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368984;

    public UserTechCount_getAllBreakCount_64911749621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368984 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        setLongField(term368984, term368984.getClass(), "id", 0L);
        setField(term368984, term368984.getClass(), "user", null);
        setIntField(term368984, term368984.getClass(), "levelId", 0);
        setIntField(term368984, term368984.getClass(), "allBreakCount", 0);
        setIntField(term368984, term368984.getClass(), "allBreakPlusCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllBreakCount", argTypes, term368984, args);
    }

};


