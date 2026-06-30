package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Festa_getAttributes_14445993346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12105;

    public Festa_getAttributes_14445993346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12209 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term12208 = ((Class) term12209).getDeclaredField((String) "PINK_FESTA");
        ((Field) term12208).setAccessible(true);
        Object enum12 = ((Field) term12208).get((Object) null);
        Class<? extends Object> term12491 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term12490 = ((Class) term12491).getDeclaredField((String) "UNDEFINED");
        ((Field) term12490).setAccessible(true);
        Object enum13 = ((Field) term12490).get((Object) null);
        Integer term12181 = new Integer(0);
        Integer term12183 = new Integer(1);
        term12105 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term12185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12190 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12200 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12201 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12105, term12105.getClass(), "id", -1);
        setBooleanField(term12105, term12105.getClass(), "enable", true);
        setField(term12105, term12105.getClass(), "name", "xxx");
        setField(term12105, term12105.getClass(), "kind", enum12);
        setField(term12105, term12105.getClass(), "difficulty", enum13);
        setField(term12105, term12105.getClass(), "pvList", "ALL");
        setField(term12105, term12105.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term12105, term12105.getClass(), "addVP", term12181);
        setField(term12105, term12105.getClass(), "vpMultiplier", term12183);
        setIntField(term12186, term12186.getClass(), "year", 2005);
        setShortField(term12186, term12186.getClass(), "month", (short) 1);
        setShortField(term12186, term12186.getClass(), "day", (short) 1);
        setField(term12185, term12185.getClass(), "date", term12186);
        setByteField(term12190, term12190.getClass(), "hour", (byte) 0);
        setByteField(term12190, term12190.getClass(), "minute", (byte) 0);
        setByteField(term12190, term12190.getClass(), "second", (byte) 0);
        setIntField(term12190, term12190.getClass(), "nano", 0);
        setField(term12185, term12185.getClass(), "time", term12190);
        setField(term12105, term12105.getClass(), "start", term12185);
        setIntField(term12196, term12196.getClass(), "year", 2005);
        setShortField(term12196, term12196.getClass(), "month", (short) 1);
        setShortField(term12196, term12196.getClass(), "day", (short) 1);
        setField(term12195, term12195.getClass(), "date", term12196);
        setField(term12195, term12195.getClass(), "time", term12190);
        setField(term12105, term12105.getClass(), "end", term12195);
        setIntField(term12201, term12201.getClass(), "year", 2005);
        setShortField(term12201, term12201.getClass(), "month", (short) 1);
        setShortField(term12201, term12201.getClass(), "day", (short) 1);
        setField(term12200, term12200.getClass(), "date", term12201);
        setField(term12200, term12200.getClass(), "time", term12190);
        setField(term12105, term12105.getClass(), "createDate", term12200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttributes", argTypes, term12105, args);
    }

};


