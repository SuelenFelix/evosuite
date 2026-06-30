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

public class Festa_setPvList_87690934517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20161;

    public Festa_setPvList_87690934517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20277 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term20276 = ((Class) term20277).getDeclaredField((String) "PINK_FESTA");
        ((Field) term20276).setAccessible(true);
        Object enum35 = ((Field) term20276).get((Object) null);
        Class<? extends Object> term20559 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term20558 = ((Class) term20559).getDeclaredField((String) "UNDEFINED");
        ((Field) term20558).setAccessible(true);
        Object enum36 = ((Field) term20558).get((Object) null);
        Integer term20237 = new Integer(0);
        Integer term20239 = new Integer(1);
        term20161 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term20241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20257 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term20161, term20161.getClass(), "id", -1);
        setBooleanField(term20161, term20161.getClass(), "enable", true);
        setField(term20161, term20161.getClass(), "name", "xxx");
        setField(term20161, term20161.getClass(), "kind", enum35);
        setField(term20161, term20161.getClass(), "difficulty", enum36);
        setField(term20161, term20161.getClass(), "pvList", "ALL");
        setField(term20161, term20161.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term20161, term20161.getClass(), "addVP", term20237);
        setField(term20161, term20161.getClass(), "vpMultiplier", term20239);
        setIntField(term20242, term20242.getClass(), "year", 2005);
        setShortField(term20242, term20242.getClass(), "month", (short) 1);
        setShortField(term20242, term20242.getClass(), "day", (short) 1);
        setField(term20241, term20241.getClass(), "date", term20242);
        setByteField(term20246, term20246.getClass(), "hour", (byte) 0);
        setByteField(term20246, term20246.getClass(), "minute", (byte) 0);
        setByteField(term20246, term20246.getClass(), "second", (byte) 0);
        setIntField(term20246, term20246.getClass(), "nano", 0);
        setField(term20241, term20241.getClass(), "time", term20246);
        setField(term20161, term20161.getClass(), "start", term20241);
        setIntField(term20252, term20252.getClass(), "year", 2005);
        setShortField(term20252, term20252.getClass(), "month", (short) 1);
        setShortField(term20252, term20252.getClass(), "day", (short) 1);
        setField(term20251, term20251.getClass(), "date", term20252);
        setField(term20251, term20251.getClass(), "time", term20246);
        setField(term20161, term20161.getClass(), "end", term20251);
        setIntField(term20257, term20257.getClass(), "year", 2005);
        setShortField(term20257, term20257.getClass(), "month", (short) 1);
        setShortField(term20257, term20257.getClass(), "day", (short) 1);
        setField(term20256, term20256.getClass(), "date", term20257);
        setField(term20256, term20256.getClass(), "time", term20246);
        setField(term20161, term20161.getClass(), "createDate", term20256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iojOXjfZFr";
        callMethod(klass, "setPvList", argTypes, term20161, args);
    }

};


