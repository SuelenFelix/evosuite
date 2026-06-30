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
     Object term4090727;
     Object term4090804;

    public PvListRequest_setCreationDate_11370708895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4090740 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090744 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090745 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090740, term4090740.getClass(), "PVID", -1628447019);
        setIntField(term4090740, term4090740.getClass(), "Version", 1210605313);
        setIntField(term4090740, term4090740.getClass(), "Edition", 605458323);
        setField(term4090744, term4090744.getClass(), "Start", null);
        setField(term4090744, term4090744.getClass(), "End", null);
        setField(term4090740, term4090740.getClass(), "AdvDemo", term4090744);
        setField(term4090745, term4090745.getClass(), "Start", null);
        setField(term4090745, term4090745.getClass(), "End", null);
        setField(term4090740, term4090740.getClass(), "Playable", term4090745);
        Object term4090746 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090750 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090751 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090746, term4090746.getClass(), "PVID", -1725410433);
        setIntField(term4090746, term4090746.getClass(), "Version", -1767862843);
        setIntField(term4090746, term4090746.getClass(), "Edition", -944223607);
        setField(term4090750, term4090750.getClass(), "Start", null);
        setField(term4090750, term4090750.getClass(), "End", null);
        setField(term4090746, term4090746.getClass(), "AdvDemo", term4090750);
        setField(term4090751, term4090751.getClass(), "Start", null);
        setField(term4090751, term4090751.getClass(), "End", null);
        setField(term4090746, term4090746.getClass(), "Playable", term4090751);
        ArrayList term4090738 = new ArrayList();
        ((ArrayList) term4090738).add(term4090740);
        ((ArrayList) term4090738).add(term4090746);
        Object term4090756 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090760 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090761 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090756, term4090756.getClass(), "PVID", -1200738869);
        setIntField(term4090756, term4090756.getClass(), "Version", -1087021557);
        setIntField(term4090756, term4090756.getClass(), "Edition", -568542100);
        setField(term4090760, term4090760.getClass(), "Start", null);
        setField(term4090760, term4090760.getClass(), "End", null);
        setField(term4090756, term4090756.getClass(), "AdvDemo", term4090760);
        setField(term4090761, term4090761.getClass(), "Start", null);
        setField(term4090761, term4090761.getClass(), "End", null);
        setField(term4090756, term4090756.getClass(), "Playable", term4090761);
        Object term4090762 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090766 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090767 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090762, term4090762.getClass(), "PVID", 353282410);
        setIntField(term4090762, term4090762.getClass(), "Version", 49344216);
        setIntField(term4090762, term4090762.getClass(), "Edition", -294129684);
        setField(term4090766, term4090766.getClass(), "Start", null);
        setField(term4090766, term4090766.getClass(), "End", null);
        setField(term4090762, term4090762.getClass(), "AdvDemo", term4090766);
        setField(term4090767, term4090767.getClass(), "Start", null);
        setField(term4090767, term4090767.getClass(), "End", null);
        setField(term4090762, term4090762.getClass(), "Playable", term4090767);
        Object term4090768 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090772 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090773 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090768, term4090768.getClass(), "PVID", 1098572690);
        setIntField(term4090768, term4090768.getClass(), "Version", 639388774);
        setIntField(term4090768, term4090768.getClass(), "Edition", 123710700);
        setField(term4090772, term4090772.getClass(), "Start", null);
        setField(term4090772, term4090772.getClass(), "End", null);
        setField(term4090768, term4090768.getClass(), "AdvDemo", term4090772);
        setField(term4090773, term4090773.getClass(), "Start", null);
        setField(term4090773, term4090773.getClass(), "End", null);
        setField(term4090768, term4090768.getClass(), "Playable", term4090773);
        Object term4090774 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090774, term4090774.getClass(), "PVID", 1779480988);
        setIntField(term4090774, term4090774.getClass(), "Version", 222818812);
        setIntField(term4090774, term4090774.getClass(), "Edition", -716316121);
        setField(term4090774, term4090774.getClass(), "AdvDemo", term4090767);
        setField(term4090774, term4090774.getClass(), "Playable", term4090772);
        Object term4090778 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090778, term4090778.getClass(), "PVID", -1236958929);
        setIntField(term4090778, term4090778.getClass(), "Version", -766412817);
        setIntField(term4090778, term4090778.getClass(), "Edition", 1423067117);
        setField(term4090778, term4090778.getClass(), "AdvDemo", term4090744);
        setField(term4090778, term4090778.getClass(), "Playable", term4090761);
        Object term4090782 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090782, term4090782.getClass(), "PVID", -2094946704);
        setIntField(term4090782, term4090782.getClass(), "Version", -787737372);
        setIntField(term4090782, term4090782.getClass(), "Edition", -2022057882);
        setField(term4090782, term4090782.getClass(), "AdvDemo", term4090751);
        setField(term4090782, term4090782.getClass(), "Playable", term4090745);
        Object term4090786 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090786, term4090786.getClass(), "PVID", 120219376);
        setIntField(term4090786, term4090786.getClass(), "Version", -1509142379);
        setIntField(term4090786, term4090786.getClass(), "Edition", 1201758410);
        setField(term4090786, term4090786.getClass(), "AdvDemo", term4090745);
        setField(term4090786, term4090786.getClass(), "Playable", term4090773);
        Object term4090790 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090790, term4090790.getClass(), "PVID", -1687302460);
        setIntField(term4090790, term4090790.getClass(), "Version", -417834539);
        setIntField(term4090790, term4090790.getClass(), "Edition", 890893613);
        setField(term4090790, term4090790.getClass(), "AdvDemo", term4090767);
        setField(term4090790, term4090790.getClass(), "Playable", term4090767);
        ArrayList term4090754 = new ArrayList();
        ((ArrayList) term4090754).add(term4090756);
        ((ArrayList) term4090754).add(term4090762);
        ((ArrayList) term4090754).add(term4090768);
        ((ArrayList) term4090754).add(term4090774);
        ((ArrayList) term4090754).add(term4090778);
        ((ArrayList) term4090754).add(term4090782);
        ((ArrayList) term4090754).add(term4090786);
        ((ArrayList) term4090754).add(term4090790);
        ((ArrayList) term4090754).add(term4090768);
        ArrayList term4090796 = new ArrayList();
        ((ArrayList) term4090796).add(term4090790);
        ((ArrayList) term4090796).add(term4090782);
        ((ArrayList) term4090796).add(term4090774);
        ((ArrayList) term4090796).add(term4090756);
        ArrayList term4090800 = new ArrayList();
        ((ArrayList) term4090800).add(term4090768);
        ((ArrayList) term4090800).add(term4090782);
        ((ArrayList) term4090800).add(term4090790);
        term4090727 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4090728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4090729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090733 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4090729, term4090729.getClass(), "year", 2013);
        setShortField(term4090729, term4090729.getClass(), "month", (short) 10);
        setShortField(term4090729, term4090729.getClass(), "day", (short) 13);
        setField(term4090728, term4090728.getClass(), "date", term4090729);
        setByteField(term4090733, term4090733.getClass(), "hour", (byte) 8);
        setByteField(term4090733, term4090733.getClass(), "minute", (byte) 9);
        setByteField(term4090733, term4090733.getClass(), "second", (byte) 41);
        setIntField(term4090733, term4090733.getClass(), "nano", 256447258);
        setField(term4090728, term4090728.getClass(), "time", term4090733);
        setField(term4090727, term4090727.getClass(), "CreationDate", term4090728);
        setField(term4090727, term4090727.getClass(), "Easy", term4090738);
        setField(term4090727, term4090727.getClass(), "Normal", term4090754);
        setField(term4090727, term4090727.getClass(), "Hard", term4090796);
        setField(term4090727, term4090727.getClass(), "Extreme", term4090800);
        term4090804 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4090805 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090809 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4090805, term4090805.getClass(), "year", 2027);
        setShortField(term4090805, term4090805.getClass(), "month", (short) 9);
        setShortField(term4090805, term4090805.getClass(), "day", (short) 11);
        setField(term4090804, term4090804.getClass(), "date", term4090805);
        setByteField(term4090809, term4090809.getClass(), "hour", (byte) 1);
        setByteField(term4090809, term4090809.getClass(), "minute", (byte) 46);
        setByteField(term4090809, term4090809.getClass(), "second", (byte) 7);
        setIntField(term4090809, term4090809.getClass(), "nano", 186046128);
        setField(term4090804, term4090804.getClass(), "time", term4090809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4090804;
        callMethod(klass, "setCreationDate", argTypes, term4090727, args);
    }

};


