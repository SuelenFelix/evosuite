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
import java.util.LinkedList;
import java.lang.Object;

public class ApiDivaManageController_updateModuleList_3024178811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;

    public ApiDivaManageController_updateModuleList_3024178811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term96 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term81, term81.getClass(), "ID", -203030934);
        setField(term81, term81.getClass(), "Name", "PAEBtnZtTD");
        setIntField(term81, term81.getClass(), "Price", -1179120542);
        setIntField(term97, term97.getClass(), "year", 2023);
        setShortField(term97, term97.getClass(), "month", (short) 3);
        setShortField(term97, term97.getClass(), "day", (short) 7);
        setField(term96, term96.getClass(), "date", term97);
        setByteField(term101, term101.getClass(), "hour", (byte) 21);
        setByteField(term101, term101.getClass(), "minute", (byte) 15);
        setByteField(term101, term101.getClass(), "second", (byte) 43);
        setIntField(term101, term101.getClass(), "nano", 639721472);
        setField(term96, term96.getClass(), "time", term101);
        setField(term81, term81.getClass(), "ReleaseDate", term96);
        setIntField(term107, term107.getClass(), "year", 2015);
        setShortField(term107, term107.getClass(), "month", (short) 3);
        setShortField(term107, term107.getClass(), "day", (short) 10);
        setField(term106, term106.getClass(), "date", term107);
        setByteField(term111, term111.getClass(), "hour", (byte) 23);
        setByteField(term111, term111.getClass(), "minute", (byte) 34);
        setByteField(term111, term111.getClass(), "second", (byte) 44);
        setIntField(term111, term111.getClass(), "nano", 587322824);
        setField(term106, term106.getClass(), "time", term111);
        setField(term81, term81.getClass(), "EndDate", term106);
        setIntField(term81, term81.getClass(), "SortOrder", -73683645);
        Object term118 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term118, term118.getClass(), "ID", -226514366);
        setField(term118, term118.getClass(), "Name", "");
        setIntField(term118, term118.getClass(), "Price", 1193880199);
        setField(term122, term122.getClass(), "date", null);
        setField(term122, term122.getClass(), "time", null);
        setField(term118, term118.getClass(), "ReleaseDate", term122);
        setField(term123, term123.getClass(), "date", null);
        setField(term123, term123.getClass(), "time", null);
        setField(term118, term118.getClass(), "EndDate", term123);
        setIntField(term118, term118.getClass(), "SortOrder", -1087774327);
        Object term126 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        setIntField(term126, term126.getClass(), "ID", -1530420153);
        setField(term126, term126.getClass(), "Name", null);
        setIntField(term126, term126.getClass(), "Price", -469968304);
        setField(term126, term126.getClass(), "ReleaseDate", null);
        setField(term126, term126.getClass(), "EndDate", null);
        setIntField(term126, term126.getClass(), "SortOrder", -1145578966);
        term78 = new LinkedList();
        ((LinkedList) term78).add(term81);
        ((LinkedList) term78).add(term118);
        ((LinkedList) term78).add(term126);
        ((LinkedList) term78).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.manage.ApiDivaManageController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term78;
        callMethod(klass, "updateModuleList", argTypes, null, args);
    }

};


