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

public class PvListRequest_getHard_17525017583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4090573;

    public PvListRequest_getHard_17525017583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4090586 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090590 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090591 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090586, term4090586.getClass(), "PVID", 1733508837);
        setIntField(term4090586, term4090586.getClass(), "Version", -1205791300);
        setIntField(term4090586, term4090586.getClass(), "Edition", 1073167565);
        setField(term4090590, term4090590.getClass(), "Start", null);
        setField(term4090590, term4090590.getClass(), "End", null);
        setField(term4090586, term4090586.getClass(), "AdvDemo", term4090590);
        setField(term4090591, term4090591.getClass(), "Start", null);
        setField(term4090591, term4090591.getClass(), "End", null);
        setField(term4090586, term4090586.getClass(), "Playable", term4090591);
        Object term4090592 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090596 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090597 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090592, term4090592.getClass(), "PVID", -1569143838);
        setIntField(term4090592, term4090592.getClass(), "Version", -594189153);
        setIntField(term4090592, term4090592.getClass(), "Edition", 840504863);
        setField(term4090596, term4090596.getClass(), "Start", null);
        setField(term4090596, term4090596.getClass(), "End", null);
        setField(term4090592, term4090592.getClass(), "AdvDemo", term4090596);
        setField(term4090597, term4090597.getClass(), "Start", null);
        setField(term4090597, term4090597.getClass(), "End", null);
        setField(term4090592, term4090592.getClass(), "Playable", term4090597);
        Object term4090598 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090602 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090603 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090598, term4090598.getClass(), "PVID", -44197635);
        setIntField(term4090598, term4090598.getClass(), "Version", -2133974512);
        setIntField(term4090598, term4090598.getClass(), "Edition", -1985213705);
        setField(term4090602, term4090602.getClass(), "Start", null);
        setField(term4090602, term4090602.getClass(), "End", null);
        setField(term4090598, term4090598.getClass(), "AdvDemo", term4090602);
        setField(term4090603, term4090603.getClass(), "Start", null);
        setField(term4090603, term4090603.getClass(), "End", null);
        setField(term4090598, term4090598.getClass(), "Playable", term4090603);
        Object term4090604 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090608 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090609 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090604, term4090604.getClass(), "PVID", 1145309640);
        setIntField(term4090604, term4090604.getClass(), "Version", 1520627688);
        setIntField(term4090604, term4090604.getClass(), "Edition", 1712602133);
        setField(term4090608, term4090608.getClass(), "Start", null);
        setField(term4090608, term4090608.getClass(), "End", null);
        setField(term4090604, term4090604.getClass(), "AdvDemo", term4090608);
        setField(term4090609, term4090609.getClass(), "Start", null);
        setField(term4090609, term4090609.getClass(), "End", null);
        setField(term4090604, term4090604.getClass(), "Playable", term4090609);
        Object term4090610 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090614 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090615 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090610, term4090610.getClass(), "PVID", -198398772);
        setIntField(term4090610, term4090610.getClass(), "Version", 828600139);
        setIntField(term4090610, term4090610.getClass(), "Edition", 1020062258);
        setField(term4090614, term4090614.getClass(), "Start", null);
        setField(term4090614, term4090614.getClass(), "End", null);
        setField(term4090610, term4090610.getClass(), "AdvDemo", term4090614);
        setField(term4090615, term4090615.getClass(), "Start", null);
        setField(term4090615, term4090615.getClass(), "End", null);
        setField(term4090610, term4090610.getClass(), "Playable", term4090615);
        Object term4090616 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090616, term4090616.getClass(), "PVID", -167424365);
        setIntField(term4090616, term4090616.getClass(), "Version", 1036344382);
        setIntField(term4090616, term4090616.getClass(), "Edition", 827319578);
        setField(term4090616, term4090616.getClass(), "AdvDemo", term4090609);
        setField(term4090616, term4090616.getClass(), "Playable", term4090614);
        ArrayList term4090584 = new ArrayList();
        ((ArrayList) term4090584).add(term4090586);
        ((ArrayList) term4090584).add(term4090592);
        ((ArrayList) term4090584).add(term4090598);
        ((ArrayList) term4090584).add(term4090604);
        ((ArrayList) term4090584).add(term4090610);
        ((ArrayList) term4090584).add(term4090616);
        Object term4090624 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090624, term4090624.getClass(), "PVID", 1777843289);
        setIntField(term4090624, term4090624.getClass(), "Version", 1565407126);
        setIntField(term4090624, term4090624.getClass(), "Edition", -1565389196);
        setField(term4090624, term4090624.getClass(), "AdvDemo", term4090590);
        setField(term4090624, term4090624.getClass(), "Playable", term4090603);
        Object term4090628 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090628, term4090628.getClass(), "PVID", 2074903539);
        setIntField(term4090628, term4090628.getClass(), "Version", 904389145);
        setIntField(term4090628, term4090628.getClass(), "Edition", 841422893);
        setField(term4090628, term4090628.getClass(), "AdvDemo", term4090597);
        setField(term4090628, term4090628.getClass(), "Playable", term4090591);
        Object term4090632 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090632, term4090632.getClass(), "PVID", -2007736423);
        setIntField(term4090632, term4090632.getClass(), "Version", 72412314);
        setIntField(term4090632, term4090632.getClass(), "Edition", -1116623855);
        setField(term4090632, term4090632.getClass(), "AdvDemo", term4090591);
        setField(term4090632, term4090632.getClass(), "Playable", term4090615);
        ArrayList term4090622 = new ArrayList();
        ((ArrayList) term4090622).add(term4090624);
        ((ArrayList) term4090622).add(term4090628);
        ((ArrayList) term4090622).add(term4090632);
        Object term4090640 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090640, term4090640.getClass(), "PVID", -1814299845);
        setIntField(term4090640, term4090640.getClass(), "Version", 1404375846);
        setIntField(term4090640, term4090640.getClass(), "Edition", 1616510152);
        setField(term4090640, term4090640.getClass(), "AdvDemo", term4090609);
        setField(term4090640, term4090640.getClass(), "Playable", term4090609);
        ArrayList term4090638 = new ArrayList();
        ((ArrayList) term4090638).add(term4090640);
        ((ArrayList) term4090638).add(term4090610);
        ((ArrayList) term4090638).add(term4090640);
        ((ArrayList) term4090638).add(term4090628);
        ((ArrayList) term4090638).add(term4090616);
        ((ArrayList) term4090638).add(term4090598);
        ArrayList term4090646 = new ArrayList();
        ((ArrayList) term4090646).add(term4090610);
        ((ArrayList) term4090646).add(term4090628);
        ((ArrayList) term4090646).add(term4090640);
        ((ArrayList) term4090646).add(term4090640);
        ((ArrayList) term4090646).add(term4090604);
        ((ArrayList) term4090646).add(term4090610);
        ((ArrayList) term4090646).add(term4090610);
        term4090573 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4090574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4090575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090579 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4090575, term4090575.getClass(), "year", 2016);
        setShortField(term4090575, term4090575.getClass(), "month", (short) 5);
        setShortField(term4090575, term4090575.getClass(), "day", (short) 2);
        setField(term4090574, term4090574.getClass(), "date", term4090575);
        setByteField(term4090579, term4090579.getClass(), "hour", (byte) 13);
        setByteField(term4090579, term4090579.getClass(), "minute", (byte) 0);
        setByteField(term4090579, term4090579.getClass(), "second", (byte) 30);
        setIntField(term4090579, term4090579.getClass(), "nano", 660316023);
        setField(term4090574, term4090574.getClass(), "time", term4090579);
        setField(term4090573, term4090573.getClass(), "CreationDate", term4090574);
        setField(term4090573, term4090573.getClass(), "Easy", term4090584);
        setField(term4090573, term4090573.getClass(), "Normal", term4090622);
        setField(term4090573, term4090573.getClass(), "Hard", term4090638);
        setField(term4090573, term4090573.getClass(), "Extreme", term4090646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHard", argTypes, term4090573, args);
    }

};


