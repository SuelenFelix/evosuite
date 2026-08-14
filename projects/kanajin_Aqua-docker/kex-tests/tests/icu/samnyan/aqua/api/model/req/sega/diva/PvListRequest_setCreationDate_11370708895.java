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

public class PvListRequest_setCreationDate_11370708895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401441;
     Object term401518;

    public PvListRequest_setCreationDate_11370708895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401454 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401458 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401459 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401454, term401454.getClass(), "PVID", -1389891320);
        setIntField(term401454, term401454.getClass(), "Version", 341700709);
        setIntField(term401454, term401454.getClass(), "Edition", -68303543);
        setField(term401458, term401458.getClass(), "Start", null);
        setField(term401458, term401458.getClass(), "End", null);
        setField(term401454, term401454.getClass(), "AdvDemo", term401458);
        setField(term401459, term401459.getClass(), "Start", null);
        setField(term401459, term401459.getClass(), "End", null);
        setField(term401454, term401454.getClass(), "Playable", term401459);
        Object term401460 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401464 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401465 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401460, term401460.getClass(), "PVID", -55104859);
        setIntField(term401460, term401460.getClass(), "Version", -347765593);
        setIntField(term401460, term401460.getClass(), "Edition", -384624068);
        setField(term401464, term401464.getClass(), "Start", null);
        setField(term401464, term401464.getClass(), "End", null);
        setField(term401460, term401460.getClass(), "AdvDemo", term401464);
        setField(term401465, term401465.getClass(), "Start", null);
        setField(term401465, term401465.getClass(), "End", null);
        setField(term401460, term401460.getClass(), "Playable", term401465);
        Object term401466 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401470 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401471 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401466, term401466.getClass(), "PVID", -1273002081);
        setIntField(term401466, term401466.getClass(), "Version", 96725105);
        setIntField(term401466, term401466.getClass(), "Edition", 1455402311);
        setField(term401470, term401470.getClass(), "Start", null);
        setField(term401470, term401470.getClass(), "End", null);
        setField(term401466, term401466.getClass(), "AdvDemo", term401470);
        setField(term401471, term401471.getClass(), "Start", null);
        setField(term401471, term401471.getClass(), "End", null);
        setField(term401466, term401466.getClass(), "Playable", term401471);
        Object term401472 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401476 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401477 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401472, term401472.getClass(), "PVID", -482985770);
        setIntField(term401472, term401472.getClass(), "Version", 178614128);
        setIntField(term401472, term401472.getClass(), "Edition", -1633989856);
        setField(term401476, term401476.getClass(), "Start", null);
        setField(term401476, term401476.getClass(), "End", null);
        setField(term401472, term401472.getClass(), "AdvDemo", term401476);
        setField(term401477, term401477.getClass(), "Start", null);
        setField(term401477, term401477.getClass(), "End", null);
        setField(term401472, term401472.getClass(), "Playable", term401477);
        Object term401478 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401482 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401483 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401478, term401478.getClass(), "PVID", -82724764);
        setIntField(term401478, term401478.getClass(), "Version", 429863938);
        setIntField(term401478, term401478.getClass(), "Edition", 1387306344);
        setField(term401482, term401482.getClass(), "Start", null);
        setField(term401482, term401482.getClass(), "End", null);
        setField(term401478, term401478.getClass(), "AdvDemo", term401482);
        setField(term401483, term401483.getClass(), "Start", null);
        setField(term401483, term401483.getClass(), "End", null);
        setField(term401478, term401478.getClass(), "Playable", term401483);
        Object term401484 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401484, term401484.getClass(), "PVID", -832904515);
        setIntField(term401484, term401484.getClass(), "Version", -1211349335);
        setIntField(term401484, term401484.getClass(), "Edition", 1143735630);
        setField(term401484, term401484.getClass(), "AdvDemo", term401477);
        setField(term401484, term401484.getClass(), "Playable", term401482);
        Object term401488 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401488, term401488.getClass(), "PVID", -1284959165);
        setIntField(term401488, term401488.getClass(), "Version", -1964559535);
        setIntField(term401488, term401488.getClass(), "Edition", -2142287489);
        setField(term401488, term401488.getClass(), "AdvDemo", term401458);
        setField(term401488, term401488.getClass(), "Playable", term401471);
        ArrayList term401452 = new ArrayList();
        ((ArrayList) term401452).add(term401454);
        ((ArrayList) term401452).add(term401460);
        ((ArrayList) term401452).add(term401466);
        ((ArrayList) term401452).add(term401472);
        ((ArrayList) term401452).add(term401478);
        ((ArrayList) term401452).add(term401484);
        ((ArrayList) term401452).add(term401488);
        Object term401496 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401496, term401496.getClass(), "PVID", 338995221);
        setIntField(term401496, term401496.getClass(), "Version", -1231125890);
        setIntField(term401496, term401496.getClass(), "Edition", 1499025029);
        setField(term401496, term401496.getClass(), "AdvDemo", term401465);
        setField(term401496, term401496.getClass(), "Playable", term401459);
        Object term401500 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401500, term401500.getClass(), "PVID", -38943258);
        setIntField(term401500, term401500.getClass(), "Version", 922715580);
        setIntField(term401500, term401500.getClass(), "Edition", -1269861551);
        setField(term401500, term401500.getClass(), "AdvDemo", term401459);
        setField(term401500, term401500.getClass(), "Playable", term401483);
        Object term401504 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401504, term401504.getClass(), "PVID", 1165616010);
        setIntField(term401504, term401504.getClass(), "Version", -594907000);
        setIntField(term401504, term401504.getClass(), "Edition", -346430920);
        setField(term401504, term401504.getClass(), "AdvDemo", term401477);
        setField(term401504, term401504.getClass(), "Playable", term401477);
        ArrayList term401494 = new ArrayList();
        ((ArrayList) term401494).add(term401496);
        ((ArrayList) term401494).add(term401500);
        ((ArrayList) term401494).add(term401504);
        ArrayList term401510 = new ArrayList();
        ((ArrayList) term401510).add(term401478);
        ((ArrayList) term401510).add(term401504);
        ((ArrayList) term401510).add(term401496);
        ((ArrayList) term401510).add(term401484);
        ArrayList term401514 = new ArrayList();
        ((ArrayList) term401514).add(term401466);
        ((ArrayList) term401514).add(term401478);
        ((ArrayList) term401514).add(term401496);
        ((ArrayList) term401514).add(term401504);
        ((ArrayList) term401514).add(term401504);
        ((ArrayList) term401514).add(term401472);
        term401441 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401447 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401443, term401443.getClass(), "year", 2023);
        setShortField(term401443, term401443.getClass(), "month", (short) 9);
        setShortField(term401443, term401443.getClass(), "day", (short) 30);
        setField(term401442, term401442.getClass(), "date", term401443);
        setByteField(term401447, term401447.getClass(), "hour", (byte) 22);
        setByteField(term401447, term401447.getClass(), "minute", (byte) 37);
        setByteField(term401447, term401447.getClass(), "second", (byte) 5);
        setIntField(term401447, term401447.getClass(), "nano", 468946407);
        setField(term401442, term401442.getClass(), "time", term401447);
        setField(term401441, term401441.getClass(), "CreationDate", term401442);
        setField(term401441, term401441.getClass(), "Easy", term401452);
        setField(term401441, term401441.getClass(), "Normal", term401494);
        setField(term401441, term401441.getClass(), "Hard", term401510);
        setField(term401441, term401441.getClass(), "Extreme", term401514);
        term401518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401523 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401519, term401519.getClass(), "year", 2016);
        setShortField(term401519, term401519.getClass(), "month", (short) 3);
        setShortField(term401519, term401519.getClass(), "day", (short) 18);
        setField(term401518, term401518.getClass(), "date", term401519);
        setByteField(term401523, term401523.getClass(), "hour", (byte) 13);
        setByteField(term401523, term401523.getClass(), "minute", (byte) 51);
        setByteField(term401523, term401523.getClass(), "second", (byte) 17);
        setIntField(term401523, term401523.getClass(), "nano", 309677112);
        setField(term401518, term401518.getClass(), "time", term401523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term401518;
        callMethod(klass, "setCreationDate", argTypes, term401441, args);
    }

};


