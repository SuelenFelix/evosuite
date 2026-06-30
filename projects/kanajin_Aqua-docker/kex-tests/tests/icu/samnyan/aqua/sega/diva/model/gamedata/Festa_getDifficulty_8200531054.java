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

public class Festa_getDifficulty_8200531054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10697;

    public Festa_getDifficulty_8200531054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10801 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term10800 = ((Class) term10801).getDeclaredField((String) "PINK_FESTA");
        ((Field) term10800).setAccessible(true);
        Object enum8 = ((Field) term10800).get((Object) null);
        Class<? extends Object> term11083 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term11082 = ((Class) term11083).getDeclaredField((String) "UNDEFINED");
        ((Field) term11082).setAccessible(true);
        Object enum9 = ((Field) term11082).get((Object) null);
        Integer term10773 = new Integer(0);
        Integer term10775 = new Integer(1);
        term10697 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term10777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10782 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10793 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term10697, term10697.getClass(), "id", -1);
        setBooleanField(term10697, term10697.getClass(), "enable", true);
        setField(term10697, term10697.getClass(), "name", "xxx");
        setField(term10697, term10697.getClass(), "kind", enum8);
        setField(term10697, term10697.getClass(), "difficulty", enum9);
        setField(term10697, term10697.getClass(), "pvList", "ALL");
        setField(term10697, term10697.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term10697, term10697.getClass(), "addVP", term10773);
        setField(term10697, term10697.getClass(), "vpMultiplier", term10775);
        setIntField(term10778, term10778.getClass(), "year", 2005);
        setShortField(term10778, term10778.getClass(), "month", (short) 1);
        setShortField(term10778, term10778.getClass(), "day", (short) 1);
        setField(term10777, term10777.getClass(), "date", term10778);
        setByteField(term10782, term10782.getClass(), "hour", (byte) 0);
        setByteField(term10782, term10782.getClass(), "minute", (byte) 0);
        setByteField(term10782, term10782.getClass(), "second", (byte) 0);
        setIntField(term10782, term10782.getClass(), "nano", 0);
        setField(term10777, term10777.getClass(), "time", term10782);
        setField(term10697, term10697.getClass(), "start", term10777);
        setIntField(term10788, term10788.getClass(), "year", 2005);
        setShortField(term10788, term10788.getClass(), "month", (short) 1);
        setShortField(term10788, term10788.getClass(), "day", (short) 1);
        setField(term10787, term10787.getClass(), "date", term10788);
        setField(term10787, term10787.getClass(), "time", term10782);
        setField(term10697, term10697.getClass(), "end", term10787);
        setIntField(term10793, term10793.getClass(), "year", 2005);
        setShortField(term10793, term10793.getClass(), "month", (short) 1);
        setShortField(term10793, term10793.getClass(), "day", (short) 1);
        setField(term10792, term10792.getClass(), "date", term10793);
        setField(term10792, term10792.getClass(), "time", term10782);
        setField(term10697, term10697.getClass(), "createDate", term10792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDifficulty", argTypes, term10697, args);
    }

};


