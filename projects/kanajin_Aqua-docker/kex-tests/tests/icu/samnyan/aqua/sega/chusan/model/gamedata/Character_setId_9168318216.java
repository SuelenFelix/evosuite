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
import java.lang.Long;

public class Character_setId_9168318216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3335;
     Object term3397;

    public Character_setId_9168318216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3335 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character"));
        setLongField(term3335, term3335.getClass(), "id", -6292278961887936280L);
        setField(term3335, term3335.getClass(), "name", "kBdSllIBVz");
        setField(term3335, term3335.getClass(), "releaseTag", "TJmVBGfTML");
        setField(term3335, term3335.getClass(), "worksName", "tPlsykYBqO");
        setField(term3335, term3335.getClass(), "illustratorName", "bLPjGVBhlX");
        setField(term3335, term3335.getClass(), "addImages", "whBvTVIIlC");
        term3397 = new Long(-6645965768855543712L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3397;
        callMethod(klass, "setId", argTypes, term3335, args);
    }

};


