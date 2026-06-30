package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Character_getId_131439768118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4681;

    public Character_getId_131439768118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4681 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character"));
        setLongField(term4681, term4681.getClass(), "id", 0L);
        setField(term4681, term4681.getClass(), "name", null);
        setField(term4681, term4681.getClass(), "releaseTag", null);
        setField(term4681, term4681.getClass(), "worksName", null);
        setField(term4681, term4681.getClass(), "illustratorName", null);
        setField(term4681, term4681.getClass(), "addImages", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4681, args);
    }

};


