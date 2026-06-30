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

public class Character_canEqual_144968628513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4232;
     Object term4294;

    public Character_canEqual_144968628513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4232 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character"));
        setLongField(term4232, term4232.getClass(), "id", -5788180182343976541L);
        setField(term4232, term4232.getClass(), "name", "xBsXSDjXYK");
        setField(term4232, term4232.getClass(), "releaseTag", "sEnIVFtZuQ");
        setField(term4232, term4232.getClass(), "worksName", "ZVecLZMLHF");
        setField(term4232, term4232.getClass(), "illustratorName", "fztQhjqwdP");
        setField(term4232, term4232.getClass(), "addImages", "eVpkWxjuki");
        term4294 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4294;
        callMethod(klass, "canEqual", argTypes, term4232, args);
    }

};


