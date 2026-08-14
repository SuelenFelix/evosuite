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
     Object term401740;
     Object term401817;

    public PvListRequest_setHard_15615864248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401753 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401757 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401758 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401753, term401753.getClass(), "PVID", -1106191060);
        setIntField(term401753, term401753.getClass(), "Version", -1729043011);
        setIntField(term401753, term401753.getClass(), "Edition", -8065457);
        setField(term401757, term401757.getClass(), "Start", null);
        setField(term401757, term401757.getClass(), "End", null);
        setField(term401753, term401753.getClass(), "AdvDemo", term401757);
        setField(term401758, term401758.getClass(), "Start", null);
        setField(term401758, term401758.getClass(), "End", null);
        setField(term401753, term401753.getClass(), "Playable", term401758);
        Object term401759 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401763 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401764 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401759, term401759.getClass(), "PVID", -1403375765);
        setIntField(term401759, term401759.getClass(), "Version", -1836429225);
        setIntField(term401759, term401759.getClass(), "Edition", 1699754984);
        setField(term401763, term401763.getClass(), "Start", null);
        setField(term401763, term401763.getClass(), "End", null);
        setField(term401759, term401759.getClass(), "AdvDemo", term401763);
        setField(term401764, term401764.getClass(), "Start", null);
        setField(term401764, term401764.getClass(), "End", null);
        setField(term401759, term401759.getClass(), "Playable", term401764);
        ArrayList term401751 = new ArrayList();
        ((ArrayList) term401751).add(term401753);
        ((ArrayList) term401751).add(term401759);
        Object term401769 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401773 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401774 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401769, term401769.getClass(), "PVID", -627771679);
        setIntField(term401769, term401769.getClass(), "Version", -1382476267);
        setIntField(term401769, term401769.getClass(), "Edition", -770483866);
        setField(term401773, term401773.getClass(), "Start", null);
        setField(term401773, term401773.getClass(), "End", null);
        setField(term401769, term401769.getClass(), "AdvDemo", term401773);
        setField(term401774, term401774.getClass(), "Start", null);
        setField(term401774, term401774.getClass(), "End", null);
        setField(term401769, term401769.getClass(), "Playable", term401774);
        Object term401775 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401779 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401780 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401775, term401775.getClass(), "PVID", 979675431);
        setIntField(term401775, term401775.getClass(), "Version", 551563340);
        setIntField(term401775, term401775.getClass(), "Edition", -1527331132);
        setField(term401779, term401779.getClass(), "Start", null);
        setField(term401779, term401779.getClass(), "End", null);
        setField(term401775, term401775.getClass(), "AdvDemo", term401779);
        setField(term401780, term401780.getClass(), "Start", null);
        setField(term401780, term401780.getClass(), "End", null);
        setField(term401775, term401775.getClass(), "Playable", term401780);
        Object term401781 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401785 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401786 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401781, term401781.getClass(), "PVID", -2021163697);
        setIntField(term401781, term401781.getClass(), "Version", 309191538);
        setIntField(term401781, term401781.getClass(), "Edition", -829994821);
        setField(term401785, term401785.getClass(), "Start", null);
        setField(term401785, term401785.getClass(), "End", null);
        setField(term401781, term401781.getClass(), "AdvDemo", term401785);
        setField(term401786, term401786.getClass(), "Start", null);
        setField(term401786, term401786.getClass(), "End", null);
        setField(term401781, term401781.getClass(), "Playable", term401786);
        Object term401787 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401787, term401787.getClass(), "PVID", 695087767);
        setIntField(term401787, term401787.getClass(), "Version", -868393197);
        setIntField(term401787, term401787.getClass(), "Edition", -2079883108);
        setField(term401787, term401787.getClass(), "AdvDemo", term401780);
        setField(term401787, term401787.getClass(), "Playable", term401785);
        Object term401791 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401791, term401791.getClass(), "PVID", 405710607);
        setIntField(term401791, term401791.getClass(), "Version", 262988013);
        setIntField(term401791, term401791.getClass(), "Edition", 224488993);
        setField(term401791, term401791.getClass(), "AdvDemo", term401757);
        setField(term401791, term401791.getClass(), "Playable", term401774);
        Object term401795 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401795, term401795.getClass(), "PVID", 1050883820);
        setIntField(term401795, term401795.getClass(), "Version", 494918111);
        setIntField(term401795, term401795.getClass(), "Edition", -2070098921);
        setField(term401795, term401795.getClass(), "AdvDemo", term401764);
        setField(term401795, term401795.getClass(), "Playable", term401758);
        Object term401799 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401799, term401799.getClass(), "PVID", -1025337604);
        setIntField(term401799, term401799.getClass(), "Version", -1556913428);
        setIntField(term401799, term401799.getClass(), "Edition", -1130073408);
        setField(term401799, term401799.getClass(), "AdvDemo", term401758);
        setField(term401799, term401799.getClass(), "Playable", term401786);
        Object term401803 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401803, term401803.getClass(), "PVID", -1805462194);
        setIntField(term401803, term401803.getClass(), "Version", 48683547);
        setIntField(term401803, term401803.getClass(), "Edition", 512761472);
        setField(term401803, term401803.getClass(), "AdvDemo", term401780);
        setField(term401803, term401803.getClass(), "Playable", term401780);
        ArrayList term401767 = new ArrayList();
        ((ArrayList) term401767).add(term401769);
        ((ArrayList) term401767).add(term401775);
        ((ArrayList) term401767).add(term401781);
        ((ArrayList) term401767).add(term401787);
        ((ArrayList) term401767).add(term401791);
        ((ArrayList) term401767).add(term401795);
        ((ArrayList) term401767).add(term401799);
        ((ArrayList) term401767).add(term401803);
        ArrayList term401809 = new ArrayList();
        ArrayList term401813 = new ArrayList();
        ((ArrayList) term401813).add(term401781);
        ((ArrayList) term401813).add(term401803);
        ((ArrayList) term401813).add(term401795);
        ((ArrayList) term401813).add(term401787);
        ((ArrayList) term401813).add(term401769);
        ((ArrayList) term401813).add(term401781);
        ((ArrayList) term401813).add(term401795);
        ((ArrayList) term401813).add(term401803);
        ((ArrayList) term401813).add(term401803);
        term401740 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401746 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401742, term401742.getClass(), "year", 2019);
        setShortField(term401742, term401742.getClass(), "month", (short) 12);
        setShortField(term401742, term401742.getClass(), "day", (short) 13);
        setField(term401741, term401741.getClass(), "date", term401742);
        setByteField(term401746, term401746.getClass(), "hour", (byte) 13);
        setByteField(term401746, term401746.getClass(), "minute", (byte) 34);
        setByteField(term401746, term401746.getClass(), "second", (byte) 10);
        setIntField(term401746, term401746.getClass(), "nano", 993653551);
        setField(term401741, term401741.getClass(), "time", term401746);
        setField(term401740, term401740.getClass(), "CreationDate", term401741);
        setField(term401740, term401740.getClass(), "Easy", term401751);
        setField(term401740, term401740.getClass(), "Normal", term401767);
        setField(term401740, term401740.getClass(), "Hard", term401809);
        setField(term401740, term401740.getClass(), "Extreme", term401813);
        term401817 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term401817;
        callMethod(klass, "setHard", argTypes, term401740, args);
    }

};


