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

public class PvListRequest_getCreationDate_16378634010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4090342;

    public PvListRequest_getCreationDate_16378634010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4090355 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090359 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090360 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090355, term4090355.getClass(), "PVID", 1129276624);
        setIntField(term4090355, term4090355.getClass(), "Version", 1919596863);
        setIntField(term4090355, term4090355.getClass(), "Edition", 1366996864);
        setField(term4090359, term4090359.getClass(), "Start", null);
        setField(term4090359, term4090359.getClass(), "End", null);
        setField(term4090355, term4090355.getClass(), "AdvDemo", term4090359);
        setField(term4090360, term4090360.getClass(), "Start", null);
        setField(term4090360, term4090360.getClass(), "End", null);
        setField(term4090355, term4090355.getClass(), "Playable", term4090360);
        Object term4090361 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090365 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090366 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090361, term4090361.getClass(), "PVID", 1027248579);
        setIntField(term4090361, term4090361.getClass(), "Version", -1959115416);
        setIntField(term4090361, term4090361.getClass(), "Edition", 1937007243);
        setField(term4090365, term4090365.getClass(), "Start", null);
        setField(term4090365, term4090365.getClass(), "End", null);
        setField(term4090361, term4090361.getClass(), "AdvDemo", term4090365);
        setField(term4090366, term4090366.getClass(), "Start", null);
        setField(term4090366, term4090366.getClass(), "End", null);
        setField(term4090361, term4090361.getClass(), "Playable", term4090366);
        Object term4090367 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090371 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090372 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090367, term4090367.getClass(), "PVID", 1654872461);
        setIntField(term4090367, term4090367.getClass(), "Version", -901301011);
        setIntField(term4090367, term4090367.getClass(), "Edition", 719734879);
        setField(term4090371, term4090371.getClass(), "Start", null);
        setField(term4090371, term4090371.getClass(), "End", null);
        setField(term4090367, term4090367.getClass(), "AdvDemo", term4090371);
        setField(term4090372, term4090372.getClass(), "Start", null);
        setField(term4090372, term4090372.getClass(), "End", null);
        setField(term4090367, term4090367.getClass(), "Playable", term4090372);
        Object term4090373 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090377 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090378 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090373, term4090373.getClass(), "PVID", -510902041);
        setIntField(term4090373, term4090373.getClass(), "Version", -928637872);
        setIntField(term4090373, term4090373.getClass(), "Edition", 6207902);
        setField(term4090377, term4090377.getClass(), "Start", null);
        setField(term4090377, term4090377.getClass(), "End", null);
        setField(term4090373, term4090373.getClass(), "AdvDemo", term4090377);
        setField(term4090378, term4090378.getClass(), "Start", null);
        setField(term4090378, term4090378.getClass(), "End", null);
        setField(term4090373, term4090373.getClass(), "Playable", term4090378);
        Object term4090379 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090383 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090384 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090379, term4090379.getClass(), "PVID", 1890053773);
        setIntField(term4090379, term4090379.getClass(), "Version", -320302927);
        setIntField(term4090379, term4090379.getClass(), "Edition", -1148073511);
        setField(term4090383, term4090383.getClass(), "Start", null);
        setField(term4090383, term4090383.getClass(), "End", null);
        setField(term4090379, term4090379.getClass(), "AdvDemo", term4090383);
        setField(term4090384, term4090384.getClass(), "Start", null);
        setField(term4090384, term4090384.getClass(), "End", null);
        setField(term4090379, term4090379.getClass(), "Playable", term4090384);
        Object term4090385 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090385, term4090385.getClass(), "PVID", -286587849);
        setIntField(term4090385, term4090385.getClass(), "Version", -1781650521);
        setIntField(term4090385, term4090385.getClass(), "Edition", -1241963415);
        setField(term4090385, term4090385.getClass(), "AdvDemo", term4090378);
        setField(term4090385, term4090385.getClass(), "Playable", term4090383);
        Object term4090389 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090389, term4090389.getClass(), "PVID", -184354850);
        setIntField(term4090389, term4090389.getClass(), "Version", 441055550);
        setIntField(term4090389, term4090389.getClass(), "Edition", 752684519);
        setField(term4090389, term4090389.getClass(), "AdvDemo", term4090359);
        setField(term4090389, term4090389.getClass(), "Playable", term4090372);
        Object term4090393 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090393, term4090393.getClass(), "PVID", -1305600633);
        setIntField(term4090393, term4090393.getClass(), "Version", 1581199874);
        setIntField(term4090393, term4090393.getClass(), "Edition", -200840114);
        setField(term4090393, term4090393.getClass(), "AdvDemo", term4090366);
        setField(term4090393, term4090393.getClass(), "Playable", term4090360);
        Object term4090397 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090397, term4090397.getClass(), "PVID", 1138277356);
        setIntField(term4090397, term4090397.getClass(), "Version", 1815142024);
        setIntField(term4090397, term4090397.getClass(), "Edition", -1805515687);
        setField(term4090397, term4090397.getClass(), "AdvDemo", term4090360);
        setField(term4090397, term4090397.getClass(), "Playable", term4090384);
        ArrayList term4090353 = new ArrayList();
        ((ArrayList) term4090353).add(term4090355);
        ((ArrayList) term4090353).add(term4090361);
        ((ArrayList) term4090353).add(term4090367);
        ((ArrayList) term4090353).add(term4090373);
        ((ArrayList) term4090353).add(term4090379);
        ((ArrayList) term4090353).add(term4090385);
        ((ArrayList) term4090353).add(term4090389);
        ((ArrayList) term4090353).add(term4090393);
        ((ArrayList) term4090353).add(term4090397);
        Object term4090405 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090405, term4090405.getClass(), "PVID", -1020446129);
        setIntField(term4090405, term4090405.getClass(), "Version", 514321630);
        setIntField(term4090405, term4090405.getClass(), "Edition", 1358006857);
        setField(term4090405, term4090405.getClass(), "AdvDemo", term4090378);
        setField(term4090405, term4090405.getClass(), "Playable", term4090378);
        ArrayList term4090403 = new ArrayList();
        ((ArrayList) term4090403).add(term4090405);
        ArrayList term4090411 = new ArrayList();
        ((ArrayList) term4090411).add(term4090379);
        ((ArrayList) term4090411).add(term4090405);
        ArrayList term4090415 = new ArrayList();
        term4090342 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4090343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4090344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090348 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4090344, term4090344.getClass(), "year", 2022);
        setShortField(term4090344, term4090344.getClass(), "month", (short) 8);
        setShortField(term4090344, term4090344.getClass(), "day", (short) 28);
        setField(term4090343, term4090343.getClass(), "date", term4090344);
        setByteField(term4090348, term4090348.getClass(), "hour", (byte) 11);
        setByteField(term4090348, term4090348.getClass(), "minute", (byte) 6);
        setByteField(term4090348, term4090348.getClass(), "second", (byte) 59);
        setIntField(term4090348, term4090348.getClass(), "nano", 920988167);
        setField(term4090343, term4090343.getClass(), "time", term4090348);
        setField(term4090342, term4090342.getClass(), "CreationDate", term4090343);
        setField(term4090342, term4090342.getClass(), "Easy", term4090353);
        setField(term4090342, term4090342.getClass(), "Normal", term4090403);
        setField(term4090342, term4090342.getClass(), "Hard", term4090411);
        setField(term4090342, term4090342.getClass(), "Extreme", term4090415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreationDate", argTypes, term4090342, args);
    }

};


