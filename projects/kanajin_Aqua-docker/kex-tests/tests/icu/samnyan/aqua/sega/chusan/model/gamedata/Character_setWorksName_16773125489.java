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

public class Character_setWorksName_16773125489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3717;

    public Character_setWorksName_16773125489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3717 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character"));
        setLongField(term3717, term3717.getClass(), "id", -2170847986967241072L);
        setField(term3717, term3717.getClass(), "name", "bWWfajKbEX");
        setField(term3717, term3717.getClass(), "releaseTag", "cAPeiZHKGJ");
        setField(term3717, term3717.getClass(), "worksName", "LvJFtLBaxj");
        setField(term3717, term3717.getClass(), "illustratorName", "PHvxnGHptP");
        setField(term3717, term3717.getClass(), "addImages", "TimdotUuNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PkWMRdJcBb";
        callMethod(klass, "setWorksName", argTypes, term3717, args);
    }

};


