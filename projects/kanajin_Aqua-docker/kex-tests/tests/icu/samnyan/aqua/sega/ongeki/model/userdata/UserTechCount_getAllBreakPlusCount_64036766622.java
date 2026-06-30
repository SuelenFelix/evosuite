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

public class UserTechCount_getAllBreakPlusCount_64036766622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368989;

    public UserTechCount_getAllBreakPlusCount_64036766622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368989 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        setLongField(term368989, term368989.getClass(), "id", 0L);
        setField(term368989, term368989.getClass(), "user", null);
        setIntField(term368989, term368989.getClass(), "levelId", 0);
        setIntField(term368989, term368989.getClass(), "allBreakCount", 0);
        setIntField(term368989, term368989.getClass(), "allBreakPlusCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllBreakPlusCount", argTypes, term368989, args);
    }

};


