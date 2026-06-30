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

public class Character_setAddImages_129032503211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3985;

    public Character_setAddImages_129032503211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3985 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character"));
        setLongField(term3985, term3985.getClass(), "id", -4443169559037975007L);
        setField(term3985, term3985.getClass(), "name", "DfISiziTgG");
        setField(term3985, term3985.getClass(), "releaseTag", "XqgfKFvPSD");
        setField(term3985, term3985.getClass(), "worksName", "JiVRgTZvKc");
        setField(term3985, term3985.getClass(), "illustratorName", "XPKmummaqg");
        setField(term3985, term3985.getClass(), "addImages", "BKLfkLiZTH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPpkrGcPRr";
        callMethod(klass, "setAddImages", argTypes, term3985, args);
    }

};


