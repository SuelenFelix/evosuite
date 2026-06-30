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

public class Festa_setAttributes_140064683418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20887;

    public Festa_setAttributes_140064683418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21003 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term21002 = ((Class) term21003).getDeclaredField((String) "PINK_FESTA");
        ((Field) term21002).setAccessible(true);
        Object enum37 = ((Field) term21002).get((Object) null);
        Class<? extends Object> term21285 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term21284 = ((Class) term21285).getDeclaredField((String) "UNDEFINED");
        ((Field) term21284).setAccessible(true);
        Object enum38 = ((Field) term21284).get((Object) null);
        Integer term20963 = new Integer(0);
        Integer term20965 = new Integer(1);
        term20887 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term20967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20972 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20983 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term20887, term20887.getClass(), "id", -1);
        setBooleanField(term20887, term20887.getClass(), "enable", true);
        setField(term20887, term20887.getClass(), "name", "xxx");
        setField(term20887, term20887.getClass(), "kind", enum37);
        setField(term20887, term20887.getClass(), "difficulty", enum38);
        setField(term20887, term20887.getClass(), "pvList", "ALL");
        setField(term20887, term20887.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term20887, term20887.getClass(), "addVP", term20963);
        setField(term20887, term20887.getClass(), "vpMultiplier", term20965);
        setIntField(term20968, term20968.getClass(), "year", 2005);
        setShortField(term20968, term20968.getClass(), "month", (short) 1);
        setShortField(term20968, term20968.getClass(), "day", (short) 1);
        setField(term20967, term20967.getClass(), "date", term20968);
        setByteField(term20972, term20972.getClass(), "hour", (byte) 0);
        setByteField(term20972, term20972.getClass(), "minute", (byte) 0);
        setByteField(term20972, term20972.getClass(), "second", (byte) 0);
        setIntField(term20972, term20972.getClass(), "nano", 0);
        setField(term20967, term20967.getClass(), "time", term20972);
        setField(term20887, term20887.getClass(), "start", term20967);
        setIntField(term20978, term20978.getClass(), "year", 2005);
        setShortField(term20978, term20978.getClass(), "month", (short) 1);
        setShortField(term20978, term20978.getClass(), "day", (short) 1);
        setField(term20977, term20977.getClass(), "date", term20978);
        setField(term20977, term20977.getClass(), "time", term20972);
        setField(term20887, term20887.getClass(), "end", term20977);
        setIntField(term20983, term20983.getClass(), "year", 2005);
        setShortField(term20983, term20983.getClass(), "month", (short) 1);
        setShortField(term20983, term20983.getClass(), "day", (short) 1);
        setField(term20982, term20982.getClass(), "date", term20983);
        setField(term20982, term20982.getClass(), "time", term20972);
        setField(term20887, term20887.getClass(), "createDate", term20982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yyrkuIYJKj";
        callMethod(klass, "setAttributes", argTypes, term20887, args);
    }

};


