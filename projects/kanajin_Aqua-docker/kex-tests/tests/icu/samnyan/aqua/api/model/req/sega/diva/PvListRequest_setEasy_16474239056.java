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

public class PvListRequest_setEasy_16474239056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4090814;
     Object term4090891;

    public PvListRequest_setEasy_16474239056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4090827 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090831 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090832 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090827, term4090827.getClass(), "PVID", 1404010180);
        setIntField(term4090827, term4090827.getClass(), "Version", 167981026);
        setIntField(term4090827, term4090827.getClass(), "Edition", -793700104);
        setField(term4090831, term4090831.getClass(), "Start", null);
        setField(term4090831, term4090831.getClass(), "End", null);
        setField(term4090827, term4090827.getClass(), "AdvDemo", term4090831);
        setField(term4090832, term4090832.getClass(), "Start", null);
        setField(term4090832, term4090832.getClass(), "End", null);
        setField(term4090827, term4090827.getClass(), "Playable", term4090832);
        Object term4090833 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090837 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090838 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090833, term4090833.getClass(), "PVID", -414265595);
        setIntField(term4090833, term4090833.getClass(), "Version", 1112371643);
        setIntField(term4090833, term4090833.getClass(), "Edition", 1796056511);
        setField(term4090837, term4090837.getClass(), "Start", null);
        setField(term4090837, term4090837.getClass(), "End", null);
        setField(term4090833, term4090833.getClass(), "AdvDemo", term4090837);
        setField(term4090838, term4090838.getClass(), "Start", null);
        setField(term4090838, term4090838.getClass(), "End", null);
        setField(term4090833, term4090833.getClass(), "Playable", term4090838);
        Object term4090839 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090843 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090844 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090839, term4090839.getClass(), "PVID", -1608028472);
        setIntField(term4090839, term4090839.getClass(), "Version", 1234641750);
        setIntField(term4090839, term4090839.getClass(), "Edition", -904263741);
        setField(term4090843, term4090843.getClass(), "Start", null);
        setField(term4090843, term4090843.getClass(), "End", null);
        setField(term4090839, term4090839.getClass(), "AdvDemo", term4090843);
        setField(term4090844, term4090844.getClass(), "Start", null);
        setField(term4090844, term4090844.getClass(), "End", null);
        setField(term4090839, term4090839.getClass(), "Playable", term4090844);
        Object term4090845 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090849 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090850 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090845, term4090845.getClass(), "PVID", 1949126875);
        setIntField(term4090845, term4090845.getClass(), "Version", -1389879161);
        setIntField(term4090845, term4090845.getClass(), "Edition", -1638615750);
        setField(term4090849, term4090849.getClass(), "Start", null);
        setField(term4090849, term4090849.getClass(), "End", null);
        setField(term4090845, term4090845.getClass(), "AdvDemo", term4090849);
        setField(term4090850, term4090850.getClass(), "Start", null);
        setField(term4090850, term4090850.getClass(), "End", null);
        setField(term4090845, term4090845.getClass(), "Playable", term4090850);
        Object term4090851 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090855 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090856 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090851, term4090851.getClass(), "PVID", 1461729916);
        setIntField(term4090851, term4090851.getClass(), "Version", 198552260);
        setIntField(term4090851, term4090851.getClass(), "Edition", 1288265550);
        setField(term4090855, term4090855.getClass(), "Start", null);
        setField(term4090855, term4090855.getClass(), "End", null);
        setField(term4090851, term4090851.getClass(), "AdvDemo", term4090855);
        setField(term4090856, term4090856.getClass(), "Start", null);
        setField(term4090856, term4090856.getClass(), "End", null);
        setField(term4090851, term4090851.getClass(), "Playable", term4090856);
        Object term4090857 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090857, term4090857.getClass(), "PVID", -141853604);
        setIntField(term4090857, term4090857.getClass(), "Version", -503926342);
        setIntField(term4090857, term4090857.getClass(), "Edition", -666403344);
        setField(term4090857, term4090857.getClass(), "AdvDemo", term4090850);
        setField(term4090857, term4090857.getClass(), "Playable", term4090855);
        Object term4090861 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090861, term4090861.getClass(), "PVID", -1777220268);
        setIntField(term4090861, term4090861.getClass(), "Version", -1634299153);
        setIntField(term4090861, term4090861.getClass(), "Edition", -1702736792);
        setField(term4090861, term4090861.getClass(), "AdvDemo", term4090831);
        setField(term4090861, term4090861.getClass(), "Playable", term4090844);
        Object term4090865 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090865, term4090865.getClass(), "PVID", -1517156659);
        setIntField(term4090865, term4090865.getClass(), "Version", -1432657041);
        setIntField(term4090865, term4090865.getClass(), "Edition", 1835634401);
        setField(term4090865, term4090865.getClass(), "AdvDemo", term4090838);
        setField(term4090865, term4090865.getClass(), "Playable", term4090832);
        ArrayList term4090825 = new ArrayList();
        ((ArrayList) term4090825).add(term4090827);
        ((ArrayList) term4090825).add(term4090833);
        ((ArrayList) term4090825).add(term4090839);
        ((ArrayList) term4090825).add(term4090845);
        ((ArrayList) term4090825).add(term4090851);
        ((ArrayList) term4090825).add(term4090857);
        ((ArrayList) term4090825).add(term4090861);
        ((ArrayList) term4090825).add(term4090865);
        Object term4090873 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090873, term4090873.getClass(), "PVID", -220343383);
        setIntField(term4090873, term4090873.getClass(), "Version", -1839427050);
        setIntField(term4090873, term4090873.getClass(), "Edition", -1172593959);
        setField(term4090873, term4090873.getClass(), "AdvDemo", term4090832);
        setField(term4090873, term4090873.getClass(), "Playable", term4090856);
        Object term4090877 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090877, term4090877.getClass(), "PVID", 2096216655);
        setIntField(term4090877, term4090877.getClass(), "Version", -630768577);
        setIntField(term4090877, term4090877.getClass(), "Edition", 494611560);
        setField(term4090877, term4090877.getClass(), "AdvDemo", term4090850);
        setField(term4090877, term4090877.getClass(), "Playable", term4090850);
        ArrayList term4090871 = new ArrayList();
        ((ArrayList) term4090871).add(term4090873);
        ((ArrayList) term4090871).add(term4090877);
        ArrayList term4090883 = new ArrayList();
        ((ArrayList) term4090883).add(term4090851);
        ((ArrayList) term4090883).add(term4090877);
        ((ArrayList) term4090883).add(term4090865);
        ((ArrayList) term4090883).add(term4090857);
        ((ArrayList) term4090883).add(term4090839);
        ((ArrayList) term4090883).add(term4090851);
        ArrayList term4090887 = new ArrayList();
        ((ArrayList) term4090887).add(term4090865);
        ((ArrayList) term4090887).add(term4090877);
        term4090814 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4090815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4090816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090820 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4090816, term4090816.getClass(), "year", 2017);
        setShortField(term4090816, term4090816.getClass(), "month", (short) 6);
        setShortField(term4090816, term4090816.getClass(), "day", (short) 6);
        setField(term4090815, term4090815.getClass(), "date", term4090816);
        setByteField(term4090820, term4090820.getClass(), "hour", (byte) 14);
        setByteField(term4090820, term4090820.getClass(), "minute", (byte) 47);
        setByteField(term4090820, term4090820.getClass(), "second", (byte) 18);
        setIntField(term4090820, term4090820.getClass(), "nano", 404476316);
        setField(term4090815, term4090815.getClass(), "time", term4090820);
        setField(term4090814, term4090814.getClass(), "CreationDate", term4090815);
        setField(term4090814, term4090814.getClass(), "Easy", term4090825);
        setField(term4090814, term4090814.getClass(), "Normal", term4090871);
        setField(term4090814, term4090814.getClass(), "Hard", term4090883);
        setField(term4090814, term4090814.getClass(), "Extreme", term4090887);
        term4090891 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4090891;
        callMethod(klass, "setEasy", argTypes, term4090814, args);
    }

};


