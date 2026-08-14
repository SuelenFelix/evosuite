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

public class PvListRequest_equals_144302343910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401892;
     Object term401969;

    public PvListRequest_equals_144302343910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401905 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401909 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401910 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401905, term401905.getClass(), "PVID", -1272250882);
        setIntField(term401905, term401905.getClass(), "Version", 295054590);
        setIntField(term401905, term401905.getClass(), "Edition", -872512207);
        setField(term401909, term401909.getClass(), "Start", null);
        setField(term401909, term401909.getClass(), "End", null);
        setField(term401905, term401905.getClass(), "AdvDemo", term401909);
        setField(term401910, term401910.getClass(), "Start", null);
        setField(term401910, term401910.getClass(), "End", null);
        setField(term401905, term401905.getClass(), "Playable", term401910);
        Object term401911 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401915 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401916 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401911, term401911.getClass(), "PVID", -684613915);
        setIntField(term401911, term401911.getClass(), "Version", 595591714);
        setIntField(term401911, term401911.getClass(), "Edition", -824703601);
        setField(term401915, term401915.getClass(), "Start", null);
        setField(term401915, term401915.getClass(), "End", null);
        setField(term401911, term401911.getClass(), "AdvDemo", term401915);
        setField(term401916, term401916.getClass(), "Start", null);
        setField(term401916, term401916.getClass(), "End", null);
        setField(term401911, term401911.getClass(), "Playable", term401916);
        Object term401917 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401921 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401922 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401917, term401917.getClass(), "PVID", -1817039198);
        setIntField(term401917, term401917.getClass(), "Version", -1589925173);
        setIntField(term401917, term401917.getClass(), "Edition", -578203783);
        setField(term401921, term401921.getClass(), "Start", null);
        setField(term401921, term401921.getClass(), "End", null);
        setField(term401917, term401917.getClass(), "AdvDemo", term401921);
        setField(term401922, term401922.getClass(), "Start", null);
        setField(term401922, term401922.getClass(), "End", null);
        setField(term401917, term401917.getClass(), "Playable", term401922);
        Object term401923 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401927 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401928 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401923, term401923.getClass(), "PVID", 1174149848);
        setIntField(term401923, term401923.getClass(), "Version", -1896682613);
        setIntField(term401923, term401923.getClass(), "Edition", -732100962);
        setField(term401927, term401927.getClass(), "Start", null);
        setField(term401927, term401927.getClass(), "End", null);
        setField(term401923, term401923.getClass(), "AdvDemo", term401927);
        setField(term401928, term401928.getClass(), "Start", null);
        setField(term401928, term401928.getClass(), "End", null);
        setField(term401923, term401923.getClass(), "Playable", term401928);
        Object term401929 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401933 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401934 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401929, term401929.getClass(), "PVID", 679683085);
        setIntField(term401929, term401929.getClass(), "Version", -632605817);
        setIntField(term401929, term401929.getClass(), "Edition", 1018960383);
        setField(term401933, term401933.getClass(), "Start", null);
        setField(term401933, term401933.getClass(), "End", null);
        setField(term401929, term401929.getClass(), "AdvDemo", term401933);
        setField(term401934, term401934.getClass(), "Start", null);
        setField(term401934, term401934.getClass(), "End", null);
        setField(term401929, term401929.getClass(), "Playable", term401934);
        Object term401935 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401935, term401935.getClass(), "PVID", -137529845);
        setIntField(term401935, term401935.getClass(), "Version", -1603711664);
        setIntField(term401935, term401935.getClass(), "Edition", 1745932076);
        setField(term401935, term401935.getClass(), "AdvDemo", term401928);
        setField(term401935, term401935.getClass(), "Playable", term401933);
        Object term401939 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401939, term401939.getClass(), "PVID", -682820526);
        setIntField(term401939, term401939.getClass(), "Version", 1850962547);
        setIntField(term401939, term401939.getClass(), "Edition", -2066559389);
        setField(term401939, term401939.getClass(), "AdvDemo", term401909);
        setField(term401939, term401939.getClass(), "Playable", term401922);
        Object term401943 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401943, term401943.getClass(), "PVID", 20056367);
        setIntField(term401943, term401943.getClass(), "Version", 20878079);
        setIntField(term401943, term401943.getClass(), "Edition", 1619314946);
        setField(term401943, term401943.getClass(), "AdvDemo", term401916);
        setField(term401943, term401943.getClass(), "Playable", term401910);
        ArrayList term401903 = new ArrayList();
        ((ArrayList) term401903).add(term401905);
        ((ArrayList) term401903).add(term401911);
        ((ArrayList) term401903).add(term401917);
        ((ArrayList) term401903).add(term401923);
        ((ArrayList) term401903).add(term401929);
        ((ArrayList) term401903).add(term401935);
        ((ArrayList) term401903).add(term401939);
        ((ArrayList) term401903).add(term401943);
        Object term401951 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401951, term401951.getClass(), "PVID", -1762974059);
        setIntField(term401951, term401951.getClass(), "Version", -547670268);
        setIntField(term401951, term401951.getClass(), "Edition", -821907252);
        setField(term401951, term401951.getClass(), "AdvDemo", term401910);
        setField(term401951, term401951.getClass(), "Playable", term401934);
        Object term401955 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401955, term401955.getClass(), "PVID", -1121286656);
        setIntField(term401955, term401955.getClass(), "Version", -757400535);
        setIntField(term401955, term401955.getClass(), "Edition", -1012091492);
        setField(term401955, term401955.getClass(), "AdvDemo", term401928);
        setField(term401955, term401955.getClass(), "Playable", term401928);
        ArrayList term401949 = new ArrayList();
        ((ArrayList) term401949).add(term401951);
        ((ArrayList) term401949).add(term401955);
        ((ArrayList) term401949).add(term401929);
        ((ArrayList) term401949).add(term401955);
        ((ArrayList) term401949).add(term401943);
        ((ArrayList) term401949).add(term401935);
        ((ArrayList) term401949).add(term401917);
        ((ArrayList) term401949).add(term401929);
        ((ArrayList) term401949).add(term401943);
        ArrayList term401961 = new ArrayList();
        ((ArrayList) term401961).add(term401955);
        ((ArrayList) term401961).add(term401955);
        ((ArrayList) term401961).add(term401923);
        ((ArrayList) term401961).add(term401929);
        ((ArrayList) term401961).add(term401929);
        ((ArrayList) term401961).add(term401911);
        ((ArrayList) term401961).add(term401939);
        ((ArrayList) term401961).add(term401939);
        ((ArrayList) term401961).add(term401951);
        ArrayList term401965 = new ArrayList();
        ((ArrayList) term401965).add(term401955);
        ((ArrayList) term401965).add(term401917);
        ((ArrayList) term401965).add(term401939);
        ((ArrayList) term401965).add(term401935);
        term401892 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401898 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401894, term401894.getClass(), "year", 2018);
        setShortField(term401894, term401894.getClass(), "month", (short) 2);
        setShortField(term401894, term401894.getClass(), "day", (short) 10);
        setField(term401893, term401893.getClass(), "date", term401894);
        setByteField(term401898, term401898.getClass(), "hour", (byte) 8);
        setByteField(term401898, term401898.getClass(), "minute", (byte) 23);
        setByteField(term401898, term401898.getClass(), "second", (byte) 28);
        setIntField(term401898, term401898.getClass(), "nano", 674245132);
        setField(term401893, term401893.getClass(), "time", term401898);
        setField(term401892, term401892.getClass(), "CreationDate", term401893);
        setField(term401892, term401892.getClass(), "Easy", term401903);
        setField(term401892, term401892.getClass(), "Normal", term401949);
        setField(term401892, term401892.getClass(), "Hard", term401961);
        setField(term401892, term401892.getClass(), "Extreme", term401965);
        term401969 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term401969;
        callMethod(klass, "equals", argTypes, term401892, args);
    }

};


