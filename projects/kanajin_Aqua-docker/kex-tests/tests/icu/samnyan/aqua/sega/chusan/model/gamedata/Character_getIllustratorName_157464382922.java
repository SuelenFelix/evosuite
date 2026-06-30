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

public class Character_getIllustratorName_157464382922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4689;

    public Character_getIllustratorName_157464382922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4689 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character"));
        setLongField(term4689, term4689.getClass(), "id", 0L);
        setField(term4689, term4689.getClass(), "name", null);
        setField(term4689, term4689.getClass(), "releaseTag", null);
        setField(term4689, term4689.getClass(), "worksName", null);
        setField(term4689, term4689.getClass(), "illustratorName", null);
        setField(term4689, term4689.getClass(), "addImages", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIllustratorName", argTypes, term4689, args);
    }

};


