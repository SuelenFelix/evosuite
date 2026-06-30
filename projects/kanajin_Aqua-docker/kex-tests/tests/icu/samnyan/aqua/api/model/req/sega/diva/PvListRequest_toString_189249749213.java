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

public class PvListRequest_toString_189249749213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4091391;

    public PvListRequest_toString_189249749213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4091404 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091408 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091409 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091404, term4091404.getClass(), "PVID", 1561871999);
        setIntField(term4091404, term4091404.getClass(), "Version", -383448280);
        setIntField(term4091404, term4091404.getClass(), "Edition", -155210319);
        setField(term4091408, term4091408.getClass(), "Start", null);
        setField(term4091408, term4091408.getClass(), "End", null);
        setField(term4091404, term4091404.getClass(), "AdvDemo", term4091408);
        setField(term4091409, term4091409.getClass(), "Start", null);
        setField(term4091409, term4091409.getClass(), "End", null);
        setField(term4091404, term4091404.getClass(), "Playable", term4091409);
        Object term4091410 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091414 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091415 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091410, term4091410.getClass(), "PVID", -180785898);
        setIntField(term4091410, term4091410.getClass(), "Version", -1327353793);
        setIntField(term4091410, term4091410.getClass(), "Edition", 1048638573);
        setField(term4091414, term4091414.getClass(), "Start", null);
        setField(term4091414, term4091414.getClass(), "End", null);
        setField(term4091410, term4091410.getClass(), "AdvDemo", term4091414);
        setField(term4091415, term4091415.getClass(), "Start", null);
        setField(term4091415, term4091415.getClass(), "End", null);
        setField(term4091410, term4091410.getClass(), "Playable", term4091415);
        Object term4091416 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091420 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091421 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091416, term4091416.getClass(), "PVID", -556436515);
        setIntField(term4091416, term4091416.getClass(), "Version", -874138036);
        setIntField(term4091416, term4091416.getClass(), "Edition", 993227151);
        setField(term4091420, term4091420.getClass(), "Start", null);
        setField(term4091420, term4091420.getClass(), "End", null);
        setField(term4091416, term4091416.getClass(), "AdvDemo", term4091420);
        setField(term4091421, term4091421.getClass(), "Start", null);
        setField(term4091421, term4091421.getClass(), "End", null);
        setField(term4091416, term4091416.getClass(), "Playable", term4091421);
        Object term4091422 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091426 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091427 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091422, term4091422.getClass(), "PVID", -304696206);
        setIntField(term4091422, term4091422.getClass(), "Version", -1506352817);
        setIntField(term4091422, term4091422.getClass(), "Edition", 262262110);
        setField(term4091426, term4091426.getClass(), "Start", null);
        setField(term4091426, term4091426.getClass(), "End", null);
        setField(term4091422, term4091422.getClass(), "AdvDemo", term4091426);
        setField(term4091427, term4091427.getClass(), "Start", null);
        setField(term4091427, term4091427.getClass(), "End", null);
        setField(term4091422, term4091422.getClass(), "Playable", term4091427);
        Object term4091428 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091432 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091433 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091428, term4091428.getClass(), "PVID", 288615951);
        setIntField(term4091428, term4091428.getClass(), "Version", 115634262);
        setIntField(term4091428, term4091428.getClass(), "Edition", -1159851975);
        setField(term4091432, term4091432.getClass(), "Start", null);
        setField(term4091432, term4091432.getClass(), "End", null);
        setField(term4091428, term4091428.getClass(), "AdvDemo", term4091432);
        setField(term4091433, term4091433.getClass(), "Start", null);
        setField(term4091433, term4091433.getClass(), "End", null);
        setField(term4091428, term4091428.getClass(), "Playable", term4091433);
        Object term4091434 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091434, term4091434.getClass(), "PVID", 2010750034);
        setIntField(term4091434, term4091434.getClass(), "Version", -1215054568);
        setIntField(term4091434, term4091434.getClass(), "Edition", 708369449);
        setField(term4091434, term4091434.getClass(), "AdvDemo", term4091427);
        setField(term4091434, term4091434.getClass(), "Playable", term4091432);
        ArrayList term4091402 = new ArrayList();
        ((ArrayList) term4091402).add(term4091404);
        ((ArrayList) term4091402).add(term4091410);
        ((ArrayList) term4091402).add(term4091416);
        ((ArrayList) term4091402).add(term4091422);
        ((ArrayList) term4091402).add(term4091428);
        ((ArrayList) term4091402).add(term4091434);
        Object term4091442 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091442, term4091442.getClass(), "PVID", -1916828710);
        setIntField(term4091442, term4091442.getClass(), "Version", -347000975);
        setIntField(term4091442, term4091442.getClass(), "Edition", -274021122);
        setField(term4091442, term4091442.getClass(), "AdvDemo", term4091408);
        setField(term4091442, term4091442.getClass(), "Playable", term4091421);
        Object term4091446 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091446, term4091446.getClass(), "PVID", 1607954150);
        setIntField(term4091446, term4091446.getClass(), "Version", -95322261);
        setIntField(term4091446, term4091446.getClass(), "Edition", -16413599);
        setField(term4091446, term4091446.getClass(), "AdvDemo", term4091415);
        setField(term4091446, term4091446.getClass(), "Playable", term4091409);
        Object term4091450 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091450, term4091450.getClass(), "PVID", 1558202004);
        setIntField(term4091450, term4091450.getClass(), "Version", -1588108895);
        setIntField(term4091450, term4091450.getClass(), "Edition", 1257727807);
        setField(term4091450, term4091450.getClass(), "AdvDemo", term4091409);
        setField(term4091450, term4091450.getClass(), "Playable", term4091433);
        Object term4091454 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091454, term4091454.getClass(), "PVID", 375088754);
        setIntField(term4091454, term4091454.getClass(), "Version", 1140923636);
        setIntField(term4091454, term4091454.getClass(), "Edition", -1885934084);
        setField(term4091454, term4091454.getClass(), "AdvDemo", term4091427);
        setField(term4091454, term4091454.getClass(), "Playable", term4091427);
        ArrayList term4091440 = new ArrayList();
        ((ArrayList) term4091440).add(term4091442);
        ((ArrayList) term4091440).add(term4091446);
        ((ArrayList) term4091440).add(term4091450);
        ((ArrayList) term4091440).add(term4091454);
        ((ArrayList) term4091440).add(term4091428);
        ((ArrayList) term4091440).add(term4091454);
        ((ArrayList) term4091440).add(term4091446);
        ((ArrayList) term4091440).add(term4091434);
        ((ArrayList) term4091440).add(term4091416);
        ArrayList term4091460 = new ArrayList();
        ((ArrayList) term4091460).add(term4091428);
        ((ArrayList) term4091460).add(term4091446);
        ((ArrayList) term4091460).add(term4091454);
        ((ArrayList) term4091460).add(term4091454);
        ((ArrayList) term4091460).add(term4091422);
        ((ArrayList) term4091460).add(term4091428);
        ((ArrayList) term4091460).add(term4091428);
        ArrayList term4091464 = new ArrayList();
        ((ArrayList) term4091464).add(term4091410);
        ((ArrayList) term4091464).add(term4091442);
        term4091391 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4091392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4091397 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4091393, term4091393.getClass(), "year", 2020);
        setShortField(term4091393, term4091393.getClass(), "month", (short) 2);
        setShortField(term4091393, term4091393.getClass(), "day", (short) 17);
        setField(term4091392, term4091392.getClass(), "date", term4091393);
        setByteField(term4091397, term4091397.getClass(), "hour", (byte) 10);
        setByteField(term4091397, term4091397.getClass(), "minute", (byte) 4);
        setByteField(term4091397, term4091397.getClass(), "second", (byte) 45);
        setIntField(term4091397, term4091397.getClass(), "nano", 608967040);
        setField(term4091392, term4091392.getClass(), "time", term4091397);
        setField(term4091391, term4091391.getClass(), "CreationDate", term4091392);
        setField(term4091391, term4091391.getClass(), "Easy", term4091402);
        setField(term4091391, term4091391.getClass(), "Normal", term4091440);
        setField(term4091391, term4091391.getClass(), "Hard", term4091460);
        setField(term4091391, term4091391.getClass(), "Extreme", term4091464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4091391, args);
    }

};


