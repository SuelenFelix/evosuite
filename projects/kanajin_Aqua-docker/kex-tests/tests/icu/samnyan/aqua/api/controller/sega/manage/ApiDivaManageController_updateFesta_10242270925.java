package icu.samnyan.aqua.api.controller.sega.manage;

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
import static icu.samnyan.aqua.api.controller.sega.manage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class ApiDivaManageController_updateFesta_10242270925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532;

    public ApiDivaManageController_updateFesta_10242270925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term667 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term666 = ((Class) term667).getDeclaredField((String) "PINK_FESTA");
        ((Field) term666).setAccessible(true);
        Object enum1 = ((Field) term666).get((Object) null);
        Class<? extends Object> term949 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term948 = ((Class) term949).getDeclaredField((String) "UNDEFINED");
        ((Field) term948).setAccessible(true);
        Object enum2 = ((Field) term948).get((Object) null);
        Integer term608 = new Integer(0);
        Integer term610 = new Integer(1);
        term532 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term628 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term532, term532.getClass(), "id", -1);
        setBooleanField(term532, term532.getClass(), "enable", true);
        setField(term532, term532.getClass(), "name", "xxx");
        setField(term532, term532.getClass(), "kind", enum1);
        setField(term532, term532.getClass(), "difficulty", enum2);
        setField(term532, term532.getClass(), "pvList", "ALL");
        setField(term532, term532.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term532, term532.getClass(), "addVP", term608);
        setField(term532, term532.getClass(), "vpMultiplier", term610);
        setIntField(term613, term613.getClass(), "year", 2005);
        setShortField(term613, term613.getClass(), "month", (short) 1);
        setShortField(term613, term613.getClass(), "day", (short) 1);
        setField(term612, term612.getClass(), "date", term613);
        setByteField(term617, term617.getClass(), "hour", (byte) 0);
        setByteField(term617, term617.getClass(), "minute", (byte) 0);
        setByteField(term617, term617.getClass(), "second", (byte) 0);
        setIntField(term617, term617.getClass(), "nano", 0);
        setField(term612, term612.getClass(), "time", term617);
        setField(term532, term532.getClass(), "start", term612);
        setIntField(term623, term623.getClass(), "year", 2005);
        setShortField(term623, term623.getClass(), "month", (short) 1);
        setShortField(term623, term623.getClass(), "day", (short) 1);
        setField(term622, term622.getClass(), "date", term623);
        setField(term622, term622.getClass(), "time", term617);
        setField(term532, term532.getClass(), "end", term622);
        setIntField(term628, term628.getClass(), "year", 2005);
        setShortField(term628, term628.getClass(), "month", (short) 1);
        setShortField(term628, term628.getClass(), "day", (short) 1);
        setField(term627, term627.getClass(), "date", term628);
        setField(term627, term627.getClass(), "time", term617);
        setField(term532, term532.getClass(), "createDate", term627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.manage.ApiDivaManageController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Object[] args = new Object[1];
        args[0] = term532;
        callMethod(klass, "updateFesta", argTypes, null, args);
    }

};


