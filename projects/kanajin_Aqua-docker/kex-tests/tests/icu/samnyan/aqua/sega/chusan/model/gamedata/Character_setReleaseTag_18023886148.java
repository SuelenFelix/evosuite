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

public class Character_setReleaseTag_18023886148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3583;

    public Character_setReleaseTag_18023886148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3583 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character"));
        setLongField(term3583, term3583.getClass(), "id", -7612550318181586304L);
        setField(term3583, term3583.getClass(), "name", "vQVyKLdtaz");
        setField(term3583, term3583.getClass(), "releaseTag", "OWKQODBLzb");
        setField(term3583, term3583.getClass(), "worksName", "wGmYcqUkgE");
        setField(term3583, term3583.getClass(), "illustratorName", "idgaQsnJpQ");
        setField(term3583, term3583.getClass(), "addImages", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jUbSRrkrYZ";
        callMethod(klass, "setReleaseTag", argTypes, term3583, args);
    }

};


