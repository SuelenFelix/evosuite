package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class PvListRequest_setHard_15615864248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4090998;
     Object term4091075;

    public PvListRequest_setHard_15615864248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4091009 = new ArrayList();
        ArrayList term4091013 = new ArrayList();
        Object term4091019 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091023 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091024 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091019, term4091019.getClass(), "PVID", -54787122);
        setIntField(term4091019, term4091019.getClass(), "Version", 717235190);
        setIntField(term4091019, term4091019.getClass(), "Edition", 1162446480);
        setField(term4091023, term4091023.getClass(), "Start", null);
        setField(term4091023, term4091023.getClass(), "End", null);
        setField(term4091019, term4091019.getClass(), "AdvDemo", term4091023);
        setField(term4091024, term4091024.getClass(), "Start", null);
        setField(term4091024, term4091024.getClass(), "End", null);
        setField(term4091019, term4091019.getClass(), "Playable", term4091024);
        Object term4091025 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091029 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091030 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091025, term4091025.getClass(), "PVID", 1687492218);
        setIntField(term4091025, term4091025.getClass(), "Version", -258620710);
        setIntField(term4091025, term4091025.getClass(), "Edition", 143491792);
        setField(term4091029, term4091029.getClass(), "Start", null);
        setField(term4091029, term4091029.getClass(), "End", null);
        setField(term4091025, term4091025.getClass(), "AdvDemo", term4091029);
        setField(term4091030, term4091030.getClass(), "Start", null);
        setField(term4091030, term4091030.getClass(), "End", null);
        setField(term4091025, term4091025.getClass(), "Playable", term4091030);
        Object term4091031 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091035 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091036 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091031, term4091031.getClass(), "PVID", -753135221);
        setIntField(term4091031, term4091031.getClass(), "Version", -1912616098);
        setIntField(term4091031, term4091031.getClass(), "Edition", 833358360);
        setField(term4091035, term4091035.getClass(), "Start", null);
        setField(term4091035, term4091035.getClass(), "End", null);
        setField(term4091031, term4091031.getClass(), "AdvDemo", term4091035);
        setField(term4091036, term4091036.getClass(), "Start", null);
        setField(term4091036, term4091036.getClass(), "End", null);
        setField(term4091031, term4091031.getClass(), "Playable", term4091036);
        Object term4091037 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091041 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091042 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091037, term4091037.getClass(), "PVID", 861203653);
        setIntField(term4091037, term4091037.getClass(), "Version", 1446658028);
        setIntField(term4091037, term4091037.getClass(), "Edition", -527103620);
        setField(term4091041, term4091041.getClass(), "Start", null);
        setField(term4091041, term4091041.getClass(), "End", null);
        setField(term4091037, term4091037.getClass(), "AdvDemo", term4091041);
        setField(term4091042, term4091042.getClass(), "Start", null);
        setField(term4091042, term4091042.getClass(), "End", null);
        setField(term4091037, term4091037.getClass(), "Playable", term4091042);
        Object term4091043 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091047 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091048 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091043, term4091043.getClass(), "PVID", -2027954443);
        setIntField(term4091043, term4091043.getClass(), "Version", -536044427);
        setIntField(term4091043, term4091043.getClass(), "Edition", -1830086996);
        setField(term4091047, term4091047.getClass(), "Start", null);
        setField(term4091047, term4091047.getClass(), "End", null);
        setField(term4091043, term4091043.getClass(), "AdvDemo", term4091047);
        setField(term4091048, term4091048.getClass(), "Start", null);
        setField(term4091048, term4091048.getClass(), "End", null);
        setField(term4091043, term4091043.getClass(), "Playable", term4091048);
        Object term4091049 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091049, term4091049.getClass(), "PVID", 645181974);
        setIntField(term4091049, term4091049.getClass(), "Version", -1157261991);
        setIntField(term4091049, term4091049.getClass(), "Edition", -1174926320);
        setField(term4091049, term4091049.getClass(), "AdvDemo", term4091042);
        setField(term4091049, term4091049.getClass(), "Playable", term4091047);
        Object term4091053 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091053, term4091053.getClass(), "PVID", 1730777450);
        setIntField(term4091053, term4091053.getClass(), "Version", -639550498);
        setIntField(term4091053, term4091053.getClass(), "Edition", 612111628);
        setField(term4091053, term4091053.getClass(), "AdvDemo", term4091023);
        setField(term4091053, term4091053.getClass(), "Playable", term4091036);
        ArrayList term4091017 = new ArrayList();
        ((ArrayList) term4091017).add(term4091019);
        ((ArrayList) term4091017).add(term4091025);
        ((ArrayList) term4091017).add(term4091031);
        ((ArrayList) term4091017).add(term4091037);
        ((ArrayList) term4091017).add(term4091043);
        ((ArrayList) term4091017).add(term4091049);
        ((ArrayList) term4091017).add(term4091053);
        Object term4091061 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091061, term4091061.getClass(), "PVID", 1192777960);
        setIntField(term4091061, term4091061.getClass(), "Version", -1402601362);
        setIntField(term4091061, term4091061.getClass(), "Edition", 582767272);
        setField(term4091061, term4091061.getClass(), "AdvDemo", term4091030);
        setField(term4091061, term4091061.getClass(), "Playable", term4091024);
        Object term4091065 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091065, term4091065.getClass(), "PVID", -550989483);
        setIntField(term4091065, term4091065.getClass(), "Version", 839306305);
        setIntField(term4091065, term4091065.getClass(), "Edition", -68107543);
        setField(term4091065, term4091065.getClass(), "AdvDemo", term4091024);
        setField(term4091065, term4091065.getClass(), "Playable", term4091048);
        Object term4091069 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091069, term4091069.getClass(), "PVID", 167853665);
        setIntField(term4091069, term4091069.getClass(), "Version", 801347299);
        setIntField(term4091069, term4091069.getClass(), "Edition", 1521393003);
        setField(term4091069, term4091069.getClass(), "AdvDemo", term4091042);
        setField(term4091069, term4091069.getClass(), "Playable", term4091042);
        ArrayList term4091059 = new ArrayList();
        ((ArrayList) term4091059).add(term4091061);
        ((ArrayList) term4091059).add(term4091065);
        ((ArrayList) term4091059).add(term4091069);
        ((ArrayList) term4091059).add(term4091043);
        ((ArrayList) term4091059).add(term4091069);
        term4090998 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4090999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4091004 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4091000, term4091000.getClass(), "year", 2028);
        setShortField(term4091000, term4091000.getClass(), "month", (short) 6);
        setShortField(term4091000, term4091000.getClass(), "day", (short) 30);
        setField(term4090999, term4090999.getClass(), "date", term4091000);
        setByteField(term4091004, term4091004.getClass(), "hour", (byte) 16);
        setByteField(term4091004, term4091004.getClass(), "minute", (byte) 2);
        setByteField(term4091004, term4091004.getClass(), "second", (byte) 9);
        setIntField(term4091004, term4091004.getClass(), "nano", 263989974);
        setField(term4090999, term4090999.getClass(), "time", term4091004);
        setField(term4090998, term4090998.getClass(), "CreationDate", term4090999);
        setField(term4090998, term4090998.getClass(), "Easy", term4091009);
        setField(term4090998, term4090998.getClass(), "Normal", term4091013);
        setField(term4090998, term4090998.getClass(), "Hard", term4091017);
        setField(term4090998, term4090998.getClass(), "Extreme", term4091059);
        term4091075 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4091075;
        callMethod(klass, "setHard", argTypes, term4090998, args);
    }

};


