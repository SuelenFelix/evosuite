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

public class PvListRequest_setExtreme_5280114519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4091078;
     Object term4091155;

    public PvListRequest_setExtreme_5280114519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4091091 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091095 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091096 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091091, term4091091.getClass(), "PVID", -186654335);
        setIntField(term4091091, term4091091.getClass(), "Version", 1862944063);
        setIntField(term4091091, term4091091.getClass(), "Edition", -389114895);
        setField(term4091095, term4091095.getClass(), "Start", null);
        setField(term4091095, term4091095.getClass(), "End", null);
        setField(term4091091, term4091091.getClass(), "AdvDemo", term4091095);
        setField(term4091096, term4091096.getClass(), "Start", null);
        setField(term4091096, term4091096.getClass(), "End", null);
        setField(term4091091, term4091091.getClass(), "Playable", term4091096);
        ArrayList term4091089 = new ArrayList();
        ((ArrayList) term4091089).add(term4091091);
        Object term4091101 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091105 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091106 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091101, term4091101.getClass(), "PVID", -1994899182);
        setIntField(term4091101, term4091101.getClass(), "Version", -11186931);
        setIntField(term4091101, term4091101.getClass(), "Edition", 495811897);
        setField(term4091105, term4091105.getClass(), "Start", null);
        setField(term4091105, term4091105.getClass(), "End", null);
        setField(term4091101, term4091101.getClass(), "AdvDemo", term4091105);
        setField(term4091106, term4091106.getClass(), "Start", null);
        setField(term4091106, term4091106.getClass(), "End", null);
        setField(term4091101, term4091101.getClass(), "Playable", term4091106);
        Object term4091107 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091111 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091112 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091107, term4091107.getClass(), "PVID", -1705558364);
        setIntField(term4091107, term4091107.getClass(), "Version", 1841945044);
        setIntField(term4091107, term4091107.getClass(), "Edition", 992200093);
        setField(term4091111, term4091111.getClass(), "Start", null);
        setField(term4091111, term4091111.getClass(), "End", null);
        setField(term4091107, term4091107.getClass(), "AdvDemo", term4091111);
        setField(term4091112, term4091112.getClass(), "Start", null);
        setField(term4091112, term4091112.getClass(), "End", null);
        setField(term4091107, term4091107.getClass(), "Playable", term4091112);
        Object term4091113 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091117 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091118 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091113, term4091113.getClass(), "PVID", 17875129);
        setIntField(term4091113, term4091113.getClass(), "Version", 1444969911);
        setIntField(term4091113, term4091113.getClass(), "Edition", -1754948076);
        setField(term4091117, term4091117.getClass(), "Start", null);
        setField(term4091117, term4091117.getClass(), "End", null);
        setField(term4091113, term4091113.getClass(), "AdvDemo", term4091117);
        setField(term4091118, term4091118.getClass(), "Start", null);
        setField(term4091118, term4091118.getClass(), "End", null);
        setField(term4091113, term4091113.getClass(), "Playable", term4091118);
        Object term4091119 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091123 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091124 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091119, term4091119.getClass(), "PVID", 455912892);
        setIntField(term4091119, term4091119.getClass(), "Version", 1381743248);
        setIntField(term4091119, term4091119.getClass(), "Edition", 484357977);
        setField(term4091123, term4091123.getClass(), "Start", null);
        setField(term4091123, term4091123.getClass(), "End", null);
        setField(term4091119, term4091119.getClass(), "AdvDemo", term4091123);
        setField(term4091124, term4091124.getClass(), "Start", null);
        setField(term4091124, term4091124.getClass(), "End", null);
        setField(term4091119, term4091119.getClass(), "Playable", term4091124);
        Object term4091125 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091125, term4091125.getClass(), "PVID", -1771550963);
        setIntField(term4091125, term4091125.getClass(), "Version", 1940999672);
        setIntField(term4091125, term4091125.getClass(), "Edition", 1751792938);
        setField(term4091125, term4091125.getClass(), "AdvDemo", term4091118);
        setField(term4091125, term4091125.getClass(), "Playable", term4091123);
        Object term4091129 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091129, term4091129.getClass(), "PVID", 196061781);
        setIntField(term4091129, term4091129.getClass(), "Version", 1802951978);
        setIntField(term4091129, term4091129.getClass(), "Edition", -1938404190);
        setField(term4091129, term4091129.getClass(), "AdvDemo", term4091095);
        setField(term4091129, term4091129.getClass(), "Playable", term4091112);
        Object term4091133 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091133, term4091133.getClass(), "PVID", -1345300222);
        setIntField(term4091133, term4091133.getClass(), "Version", -388745869);
        setIntField(term4091133, term4091133.getClass(), "Edition", -473139821);
        setField(term4091133, term4091133.getClass(), "AdvDemo", term4091106);
        setField(term4091133, term4091133.getClass(), "Playable", term4091096);
        Object term4091137 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091137, term4091137.getClass(), "PVID", 809524689);
        setIntField(term4091137, term4091137.getClass(), "Version", 77915735);
        setIntField(term4091137, term4091137.getClass(), "Edition", 775205150);
        setField(term4091137, term4091137.getClass(), "AdvDemo", term4091096);
        setField(term4091137, term4091137.getClass(), "Playable", term4091124);
        ArrayList term4091099 = new ArrayList();
        ((ArrayList) term4091099).add(term4091101);
        ((ArrayList) term4091099).add(term4091107);
        ((ArrayList) term4091099).add(term4091113);
        ((ArrayList) term4091099).add(term4091119);
        ((ArrayList) term4091099).add(term4091125);
        ((ArrayList) term4091099).add(term4091129);
        ((ArrayList) term4091099).add(term4091133);
        ((ArrayList) term4091099).add(term4091137);
        Object term4091145 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091145, term4091145.getClass(), "PVID", -682773237);
        setIntField(term4091145, term4091145.getClass(), "Version", 371027885);
        setIntField(term4091145, term4091145.getClass(), "Edition", 186545695);
        setField(term4091145, term4091145.getClass(), "AdvDemo", term4091118);
        setField(term4091145, term4091145.getClass(), "Playable", term4091118);
        ArrayList term4091143 = new ArrayList();
        ((ArrayList) term4091143).add(term4091145);
        ((ArrayList) term4091143).add(term4091119);
        ((ArrayList) term4091143).add(term4091145);
        ((ArrayList) term4091143).add(term4091133);
        ((ArrayList) term4091143).add(term4091125);
        ArrayList term4091151 = new ArrayList();
        ((ArrayList) term4091151).add(term4091107);
        term4091078 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4091079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4091084 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4091080, term4091080.getClass(), "year", 2010);
        setShortField(term4091080, term4091080.getClass(), "month", (short) 6);
        setShortField(term4091080, term4091080.getClass(), "day", (short) 17);
        setField(term4091079, term4091079.getClass(), "date", term4091080);
        setByteField(term4091084, term4091084.getClass(), "hour", (byte) 23);
        setByteField(term4091084, term4091084.getClass(), "minute", (byte) 50);
        setByteField(term4091084, term4091084.getClass(), "second", (byte) 13);
        setIntField(term4091084, term4091084.getClass(), "nano", 157383441);
        setField(term4091079, term4091079.getClass(), "time", term4091084);
        setField(term4091078, term4091078.getClass(), "CreationDate", term4091079);
        setField(term4091078, term4091078.getClass(), "Easy", term4091089);
        setField(term4091078, term4091078.getClass(), "Normal", term4091099);
        setField(term4091078, term4091078.getClass(), "Hard", term4091143);
        setField(term4091078, term4091078.getClass(), "Extreme", term4091151);
        term4091155 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4091155;
        callMethod(klass, "setExtreme", argTypes, term4091078, args);
    }

};


