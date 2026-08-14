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
     Object term401528;
     Object term401585;

    public PvListRequest_setEasy_16474239056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401541 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401545 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401546 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401541, term401541.getClass(), "PVID", -138536229);
        setIntField(term401541, term401541.getClass(), "Version", -1291654851);
        setIntField(term401541, term401541.getClass(), "Edition", -166103285);
        setField(term401545, term401545.getClass(), "Start", null);
        setField(term401545, term401545.getClass(), "End", null);
        setField(term401541, term401541.getClass(), "AdvDemo", term401545);
        setField(term401546, term401546.getClass(), "Start", null);
        setField(term401546, term401546.getClass(), "End", null);
        setField(term401541, term401541.getClass(), "Playable", term401546);
        ArrayList term401539 = new ArrayList();
        ((ArrayList) term401539).add(term401541);
        ArrayList term401549 = new ArrayList();
        Object term401555 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401559 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401560 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401555, term401555.getClass(), "PVID", -2085876526);
        setIntField(term401555, term401555.getClass(), "Version", 847851935);
        setIntField(term401555, term401555.getClass(), "Edition", -1689303419);
        setField(term401559, term401559.getClass(), "Start", null);
        setField(term401559, term401559.getClass(), "End", null);
        setField(term401555, term401555.getClass(), "AdvDemo", term401559);
        setField(term401560, term401560.getClass(), "Start", null);
        setField(term401560, term401560.getClass(), "End", null);
        setField(term401555, term401555.getClass(), "Playable", term401560);
        Object term401561 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401565 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401566 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401561, term401561.getClass(), "PVID", 1499794086);
        setIntField(term401561, term401561.getClass(), "Version", 85547310);
        setIntField(term401561, term401561.getClass(), "Edition", -21851346);
        setField(term401565, term401565.getClass(), "Start", null);
        setField(term401565, term401565.getClass(), "End", null);
        setField(term401561, term401561.getClass(), "AdvDemo", term401565);
        setField(term401566, term401566.getClass(), "Start", null);
        setField(term401566, term401566.getClass(), "End", null);
        setField(term401561, term401561.getClass(), "Playable", term401566);
        ArrayList term401553 = new ArrayList();
        ((ArrayList) term401553).add(term401555);
        ((ArrayList) term401553).add(term401561);
        Object term401571 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401575 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401576 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401571, term401571.getClass(), "PVID", 1118969087);
        setIntField(term401571, term401571.getClass(), "Version", -172523530);
        setIntField(term401571, term401571.getClass(), "Edition", 1052255369);
        setField(term401575, term401575.getClass(), "Start", null);
        setField(term401575, term401575.getClass(), "End", null);
        setField(term401571, term401571.getClass(), "AdvDemo", term401575);
        setField(term401576, term401576.getClass(), "Start", null);
        setField(term401576, term401576.getClass(), "End", null);
        setField(term401571, term401571.getClass(), "Playable", term401576);
        Object term401577 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401581 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401582 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401577, term401577.getClass(), "PVID", -387673050);
        setIntField(term401577, term401577.getClass(), "Version", -1205495331);
        setIntField(term401577, term401577.getClass(), "Edition", 1374099474);
        setField(term401581, term401581.getClass(), "Start", null);
        setField(term401581, term401581.getClass(), "End", null);
        setField(term401577, term401577.getClass(), "AdvDemo", term401581);
        setField(term401582, term401582.getClass(), "Start", null);
        setField(term401582, term401582.getClass(), "End", null);
        setField(term401577, term401577.getClass(), "Playable", term401582);
        ArrayList term401569 = new ArrayList();
        ((ArrayList) term401569).add(term401571);
        ((ArrayList) term401569).add(term401577);
        term401528 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401534 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401530, term401530.getClass(), "year", 2024);
        setShortField(term401530, term401530.getClass(), "month", (short) 2);
        setShortField(term401530, term401530.getClass(), "day", (short) 3);
        setField(term401529, term401529.getClass(), "date", term401530);
        setByteField(term401534, term401534.getClass(), "hour", (byte) 23);
        setByteField(term401534, term401534.getClass(), "minute", (byte) 15);
        setByteField(term401534, term401534.getClass(), "second", (byte) 48);
        setIntField(term401534, term401534.getClass(), "nano", 175077566);
        setField(term401529, term401529.getClass(), "time", term401534);
        setField(term401528, term401528.getClass(), "CreationDate", term401529);
        setField(term401528, term401528.getClass(), "Easy", term401539);
        setField(term401528, term401528.getClass(), "Normal", term401549);
        setField(term401528, term401528.getClass(), "Hard", term401553);
        setField(term401528, term401528.getClass(), "Extreme", term401569);
        Object term401588 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401592 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401594 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401595 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401597 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term401588, term401588.getClass(), "PVID", -1578210495);
        setIntField(term401588, term401588.getClass(), "Version", 199377754);
        setIntField(term401588, term401588.getClass(), "Edition", 312176907);
        setField(term401593, term401593.getClass(), "date", null);
        setField(term401593, term401593.getClass(), "time", null);
        setField(term401592, term401592.getClass(), "Start", term401593);
        setField(term401594, term401594.getClass(), "date", null);
        setField(term401594, term401594.getClass(), "time", null);
        setField(term401592, term401592.getClass(), "End", term401594);
        setField(term401588, term401588.getClass(), "AdvDemo", term401592);
        setField(term401596, term401596.getClass(), "date", null);
        setField(term401596, term401596.getClass(), "time", null);
        setField(term401595, term401595.getClass(), "Start", term401596);
        setField(term401597, term401597.getClass(), "date", null);
        setField(term401597, term401597.getClass(), "time", null);
        setField(term401595, term401595.getClass(), "End", term401597);
        setField(term401588, term401588.getClass(), "Playable", term401595);
        Object term401599 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401603 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401604 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401599, term401599.getClass(), "PVID", -1284716836);
        setIntField(term401599, term401599.getClass(), "Version", 180597402);
        setIntField(term401599, term401599.getClass(), "Edition", 1813908050);
        setField(term401603, term401603.getClass(), "Start", null);
        setField(term401603, term401603.getClass(), "End", null);
        setField(term401599, term401599.getClass(), "AdvDemo", term401603);
        setField(term401604, term401604.getClass(), "Start", null);
        setField(term401604, term401604.getClass(), "End", null);
        setField(term401599, term401599.getClass(), "Playable", term401604);
        Object term401606 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401606, term401606.getClass(), "PVID", 1194813074);
        setIntField(term401606, term401606.getClass(), "Version", 1290832538);
        setIntField(term401606, term401606.getClass(), "Edition", -1128183106);
        setField(term401606, term401606.getClass(), "AdvDemo", null);
        setField(term401606, term401606.getClass(), "Playable", null);
        term401585 = new LinkedList();
        ((LinkedList) term401585).add(term401588);
        ((LinkedList) term401585).add(term401599);
        ((LinkedList) term401585).add(term401606);
        ((LinkedList) term401585).add((Object)null);
        ((LinkedList) term401585).add((Object)null);
        ((LinkedList) term401585).add((Object)null);
        ((LinkedList) term401585).add((Object)null);
        ((LinkedList) term401585).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term401585;
        callMethod(klass, "setEasy", argTypes, term401528, args);
    }

};


