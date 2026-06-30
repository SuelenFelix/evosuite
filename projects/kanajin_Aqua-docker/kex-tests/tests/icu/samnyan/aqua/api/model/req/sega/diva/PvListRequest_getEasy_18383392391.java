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
     Object term4090419;

    public PvListRequest_getEasy_18383392391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4090432 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090436 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090437 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090432, term4090432.getClass(), "PVID", -1863210453);
        setIntField(term4090432, term4090432.getClass(), "Version", 356895463);
        setIntField(term4090432, term4090432.getClass(), "Edition", -2073870635);
        setField(term4090436, term4090436.getClass(), "Start", null);
        setField(term4090436, term4090436.getClass(), "End", null);
        setField(term4090432, term4090432.getClass(), "AdvDemo", term4090436);
        setField(term4090437, term4090437.getClass(), "Start", null);
        setField(term4090437, term4090437.getClass(), "End", null);
        setField(term4090432, term4090432.getClass(), "Playable", term4090437);
        Object term4090438 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090442 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090443 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090438, term4090438.getClass(), "PVID", 1044161689);
        setIntField(term4090438, term4090438.getClass(), "Version", 776561912);
        setIntField(term4090438, term4090438.getClass(), "Edition", 1501607216);
        setField(term4090442, term4090442.getClass(), "Start", null);
        setField(term4090442, term4090442.getClass(), "End", null);
        setField(term4090438, term4090438.getClass(), "AdvDemo", term4090442);
        setField(term4090443, term4090443.getClass(), "Start", null);
        setField(term4090443, term4090443.getClass(), "End", null);
        setField(term4090438, term4090438.getClass(), "Playable", term4090443);
        Object term4090444 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090448 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090449 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090444, term4090444.getClass(), "PVID", -1478946949);
        setIntField(term4090444, term4090444.getClass(), "Version", -424564728);
        setIntField(term4090444, term4090444.getClass(), "Edition", 967032764);
        setField(term4090448, term4090448.getClass(), "Start", null);
        setField(term4090448, term4090448.getClass(), "End", null);
        setField(term4090444, term4090444.getClass(), "AdvDemo", term4090448);
        setField(term4090449, term4090449.getClass(), "Start", null);
        setField(term4090449, term4090449.getClass(), "End", null);
        setField(term4090444, term4090444.getClass(), "Playable", term4090449);
        Object term4090450 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090454 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090455 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090450, term4090450.getClass(), "PVID", -1037010005);
        setIntField(term4090450, term4090450.getClass(), "Version", -35407121);
        setIntField(term4090450, term4090450.getClass(), "Edition", 1126999301);
        setField(term4090454, term4090454.getClass(), "Start", null);
        setField(term4090454, term4090454.getClass(), "End", null);
        setField(term4090450, term4090450.getClass(), "AdvDemo", term4090454);
        setField(term4090455, term4090455.getClass(), "Start", null);
        setField(term4090455, term4090455.getClass(), "End", null);
        setField(term4090450, term4090450.getClass(), "Playable", term4090455);
        Object term4090456 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090460 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090461 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090456, term4090456.getClass(), "PVID", -1603321228);
        setIntField(term4090456, term4090456.getClass(), "Version", -1596746893);
        setIntField(term4090456, term4090456.getClass(), "Edition", 1168794860);
        setField(term4090460, term4090460.getClass(), "Start", null);
        setField(term4090460, term4090460.getClass(), "End", null);
        setField(term4090456, term4090456.getClass(), "AdvDemo", term4090460);
        setField(term4090461, term4090461.getClass(), "Start", null);
        setField(term4090461, term4090461.getClass(), "End", null);
        setField(term4090456, term4090456.getClass(), "Playable", term4090461);
        Object term4090462 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090462, term4090462.getClass(), "PVID", -264094169);
        setIntField(term4090462, term4090462.getClass(), "Version", 406608352);
        setIntField(term4090462, term4090462.getClass(), "Edition", 1162488501);
        setField(term4090462, term4090462.getClass(), "AdvDemo", term4090455);
        setField(term4090462, term4090462.getClass(), "Playable", term4090460);
        Object term4090466 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090466, term4090466.getClass(), "PVID", 1841475626);
        setIntField(term4090466, term4090466.getClass(), "Version", -795961910);
        setIntField(term4090466, term4090466.getClass(), "Edition", -2143586423);
        setField(term4090466, term4090466.getClass(), "AdvDemo", term4090436);
        setField(term4090466, term4090466.getClass(), "Playable", term4090449);
        ArrayList term4090430 = new ArrayList();
        ((ArrayList) term4090430).add(term4090432);
        ((ArrayList) term4090430).add(term4090438);
        ((ArrayList) term4090430).add(term4090444);
        ((ArrayList) term4090430).add(term4090450);
        ((ArrayList) term4090430).add(term4090456);
        ((ArrayList) term4090430).add(term4090462);
        ((ArrayList) term4090430).add(term4090466);
        Object term4090474 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090474, term4090474.getClass(), "PVID", -855809441);
        setIntField(term4090474, term4090474.getClass(), "Version", 1336674307);
        setIntField(term4090474, term4090474.getClass(), "Edition", -1081278242);
        setField(term4090474, term4090474.getClass(), "AdvDemo", term4090443);
        setField(term4090474, term4090474.getClass(), "Playable", term4090437);
        Object term4090478 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090478, term4090478.getClass(), "PVID", -2060538363);
        setIntField(term4090478, term4090478.getClass(), "Version", 164884247);
        setIntField(term4090478, term4090478.getClass(), "Edition", -947691430);
        setField(term4090478, term4090478.getClass(), "AdvDemo", term4090437);
        setField(term4090478, term4090478.getClass(), "Playable", term4090461);
        Object term4090482 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090482, term4090482.getClass(), "PVID", -977825029);
        setIntField(term4090482, term4090482.getClass(), "Version", -1524478599);
        setIntField(term4090482, term4090482.getClass(), "Edition", -1239722642);
        setField(term4090482, term4090482.getClass(), "AdvDemo", term4090455);
        setField(term4090482, term4090482.getClass(), "Playable", term4090455);
        ArrayList term4090472 = new ArrayList();
        ((ArrayList) term4090472).add(term4090474);
        ((ArrayList) term4090472).add(term4090478);
        ((ArrayList) term4090472).add(term4090482);
        ((ArrayList) term4090472).add(term4090456);
        ((ArrayList) term4090472).add(term4090482);
        ((ArrayList) term4090472).add(term4090474);
        ((ArrayList) term4090472).add(term4090462);
        ((ArrayList) term4090472).add(term4090444);
        ArrayList term4090488 = new ArrayList();
        ((ArrayList) term4090488).add(term4090456);
        ((ArrayList) term4090488).add(term4090474);
        ((ArrayList) term4090488).add(term4090482);
        ((ArrayList) term4090488).add(term4090482);
        ((ArrayList) term4090488).add(term4090450);
        ((ArrayList) term4090488).add(term4090456);
        ((ArrayList) term4090488).add(term4090456);
        ((ArrayList) term4090488).add(term4090438);
        ArrayList term4090492 = new ArrayList();
        ((ArrayList) term4090492).add(term4090466);
        ((ArrayList) term4090492).add(term4090466);
        ((ArrayList) term4090492).add(term4090478);
        ((ArrayList) term4090492).add(term4090482);
        term4090419 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4090420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4090421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090425 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4090421, term4090421.getClass(), "year", 2019);
        setShortField(term4090421, term4090421.getClass(), "month", (short) 10);
        setShortField(term4090421, term4090421.getClass(), "day", (short) 11);
        setField(term4090420, term4090420.getClass(), "date", term4090421);
        setByteField(term4090425, term4090425.getClass(), "hour", (byte) 2);
        setByteField(term4090425, term4090425.getClass(), "minute", (byte) 28);
        setByteField(term4090425, term4090425.getClass(), "second", (byte) 46);
        setIntField(term4090425, term4090425.getClass(), "nano", 97018112);
        setField(term4090420, term4090420.getClass(), "time", term4090425);
        setField(term4090419, term4090419.getClass(), "CreationDate", term4090420);
        setField(term4090419, term4090419.getClass(), "Easy", term4090430);
        setField(term4090419, term4090419.getClass(), "Normal", term4090472);
        setField(term4090419, term4090419.getClass(), "Hard", term4090488);
        setField(term4090419, term4090419.getClass(), "Extreme", term4090492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEasy", argTypes, term4090419, args);
    }

};


