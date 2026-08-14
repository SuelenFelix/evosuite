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

public class PvListRequest_getEasy_18383392391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401137;

    public PvListRequest_getEasy_18383392391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401150 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401154 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401155 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401150, term401150.getClass(), "PVID", 142319119);
        setIntField(term401150, term401150.getClass(), "Version", 1577441405);
        setIntField(term401150, term401150.getClass(), "Edition", -2064361265);
        setField(term401154, term401154.getClass(), "Start", null);
        setField(term401154, term401154.getClass(), "End", null);
        setField(term401150, term401150.getClass(), "AdvDemo", term401154);
        setField(term401155, term401155.getClass(), "Start", null);
        setField(term401155, term401155.getClass(), "End", null);
        setField(term401150, term401150.getClass(), "Playable", term401155);
        Object term401156 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401160 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401161 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401156, term401156.getClass(), "PVID", -214149978);
        setIntField(term401156, term401156.getClass(), "Version", 1036603364);
        setIntField(term401156, term401156.getClass(), "Edition", -1611731811);
        setField(term401160, term401160.getClass(), "Start", null);
        setField(term401160, term401160.getClass(), "End", null);
        setField(term401156, term401156.getClass(), "AdvDemo", term401160);
        setField(term401161, term401161.getClass(), "Start", null);
        setField(term401161, term401161.getClass(), "End", null);
        setField(term401156, term401156.getClass(), "Playable", term401161);
        Object term401162 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401166 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401167 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401162, term401162.getClass(), "PVID", 224206837);
        setIntField(term401162, term401162.getClass(), "Version", 72171854);
        setIntField(term401162, term401162.getClass(), "Edition", -33754432);
        setField(term401166, term401166.getClass(), "Start", null);
        setField(term401166, term401166.getClass(), "End", null);
        setField(term401162, term401162.getClass(), "AdvDemo", term401166);
        setField(term401167, term401167.getClass(), "Start", null);
        setField(term401167, term401167.getClass(), "End", null);
        setField(term401162, term401162.getClass(), "Playable", term401167);
        Object term401168 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401172 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401173 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401168, term401168.getClass(), "PVID", 1711620328);
        setIntField(term401168, term401168.getClass(), "Version", 1536840177);
        setIntField(term401168, term401168.getClass(), "Edition", 1354147403);
        setField(term401172, term401172.getClass(), "Start", null);
        setField(term401172, term401172.getClass(), "End", null);
        setField(term401168, term401168.getClass(), "AdvDemo", term401172);
        setField(term401173, term401173.getClass(), "Start", null);
        setField(term401173, term401173.getClass(), "End", null);
        setField(term401168, term401168.getClass(), "Playable", term401173);
        Object term401174 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401178 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401179 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401174, term401174.getClass(), "PVID", 1656412611);
        setIntField(term401174, term401174.getClass(), "Version", 538479221);
        setIntField(term401174, term401174.getClass(), "Edition", 1738465887);
        setField(term401178, term401178.getClass(), "Start", null);
        setField(term401178, term401178.getClass(), "End", null);
        setField(term401174, term401174.getClass(), "AdvDemo", term401178);
        setField(term401179, term401179.getClass(), "Start", null);
        setField(term401179, term401179.getClass(), "End", null);
        setField(term401174, term401174.getClass(), "Playable", term401179);
        Object term401180 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401180, term401180.getClass(), "PVID", -71550802);
        setIntField(term401180, term401180.getClass(), "Version", 183932184);
        setIntField(term401180, term401180.getClass(), "Edition", 516691847);
        setField(term401180, term401180.getClass(), "AdvDemo", term401173);
        setField(term401180, term401180.getClass(), "Playable", term401178);
        ArrayList term401148 = new ArrayList();
        ((ArrayList) term401148).add(term401150);
        ((ArrayList) term401148).add(term401156);
        ((ArrayList) term401148).add(term401162);
        ((ArrayList) term401148).add(term401168);
        ((ArrayList) term401148).add(term401174);
        ((ArrayList) term401148).add(term401180);
        Object term401188 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401188, term401188.getClass(), "PVID", 915933935);
        setIntField(term401188, term401188.getClass(), "Version", 333388782);
        setIntField(term401188, term401188.getClass(), "Edition", -60877808);
        setField(term401188, term401188.getClass(), "AdvDemo", term401154);
        setField(term401188, term401188.getClass(), "Playable", term401167);
        ArrayList term401186 = new ArrayList();
        ((ArrayList) term401186).add(term401188);
        Object term401196 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401196, term401196.getClass(), "PVID", 1719513307);
        setIntField(term401196, term401196.getClass(), "Version", -1491291103);
        setIntField(term401196, term401196.getClass(), "Edition", -1478650524);
        setField(term401196, term401196.getClass(), "AdvDemo", term401161);
        setField(term401196, term401196.getClass(), "Playable", term401155);
        ArrayList term401194 = new ArrayList();
        ((ArrayList) term401194).add(term401196);
        Object term401204 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401204, term401204.getClass(), "PVID", 1449674127);
        setIntField(term401204, term401204.getClass(), "Version", 615038016);
        setIntField(term401204, term401204.getClass(), "Edition", -1243339185);
        setField(term401204, term401204.getClass(), "AdvDemo", term401155);
        setField(term401204, term401204.getClass(), "Playable", term401179);
        ArrayList term401202 = new ArrayList();
        ((ArrayList) term401202).add(term401204);
        term401137 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401138 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401139 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401143 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401139, term401139.getClass(), "year", 2023);
        setShortField(term401139, term401139.getClass(), "month", (short) 9);
        setShortField(term401139, term401139.getClass(), "day", (short) 20);
        setField(term401138, term401138.getClass(), "date", term401139);
        setByteField(term401143, term401143.getClass(), "hour", (byte) 13);
        setByteField(term401143, term401143.getClass(), "minute", (byte) 10);
        setByteField(term401143, term401143.getClass(), "second", (byte) 14);
        setIntField(term401143, term401143.getClass(), "nano", 574773066);
        setField(term401138, term401138.getClass(), "time", term401143);
        setField(term401137, term401137.getClass(), "CreationDate", term401138);
        setField(term401137, term401137.getClass(), "Easy", term401148);
        setField(term401137, term401137.getClass(), "Normal", term401186);
        setField(term401137, term401137.getClass(), "Hard", term401194);
        setField(term401137, term401137.getClass(), "Extreme", term401202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEasy", argTypes, term401137, args);
    }

};


