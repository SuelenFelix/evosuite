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
     Object term4091158;
     Object term4091235;

    public PvListRequest_equals_144302343910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4091171 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091175 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091176 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091171, term4091171.getClass(), "PVID", 2107555654);
        setIntField(term4091171, term4091171.getClass(), "Version", -1915671560);
        setIntField(term4091171, term4091171.getClass(), "Edition", 1046337257);
        setField(term4091175, term4091175.getClass(), "Start", null);
        setField(term4091175, term4091175.getClass(), "End", null);
        setField(term4091171, term4091171.getClass(), "AdvDemo", term4091175);
        setField(term4091176, term4091176.getClass(), "Start", null);
        setField(term4091176, term4091176.getClass(), "End", null);
        setField(term4091171, term4091171.getClass(), "Playable", term4091176);
        Object term4091177 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091181 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091182 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091177, term4091177.getClass(), "PVID", 626646588);
        setIntField(term4091177, term4091177.getClass(), "Version", 3519879);
        setIntField(term4091177, term4091177.getClass(), "Edition", 1921572803);
        setField(term4091181, term4091181.getClass(), "Start", null);
        setField(term4091181, term4091181.getClass(), "End", null);
        setField(term4091177, term4091177.getClass(), "AdvDemo", term4091181);
        setField(term4091182, term4091182.getClass(), "Start", null);
        setField(term4091182, term4091182.getClass(), "End", null);
        setField(term4091177, term4091177.getClass(), "Playable", term4091182);
        ArrayList term4091169 = new ArrayList();
        ((ArrayList) term4091169).add(term4091171);
        ((ArrayList) term4091169).add(term4091177);
        Object term4091187 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091191 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091192 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091187, term4091187.getClass(), "PVID", -1722466415);
        setIntField(term4091187, term4091187.getClass(), "Version", -1199516435);
        setIntField(term4091187, term4091187.getClass(), "Edition", 1853687178);
        setField(term4091191, term4091191.getClass(), "Start", null);
        setField(term4091191, term4091191.getClass(), "End", null);
        setField(term4091187, term4091187.getClass(), "AdvDemo", term4091191);
        setField(term4091192, term4091192.getClass(), "Start", null);
        setField(term4091192, term4091192.getClass(), "End", null);
        setField(term4091187, term4091187.getClass(), "Playable", term4091192);
        Object term4091193 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091197 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091198 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091193, term4091193.getClass(), "PVID", -831875742);
        setIntField(term4091193, term4091193.getClass(), "Version", 825452037);
        setIntField(term4091193, term4091193.getClass(), "Edition", -1141223545);
        setField(term4091197, term4091197.getClass(), "Start", null);
        setField(term4091197, term4091197.getClass(), "End", null);
        setField(term4091193, term4091193.getClass(), "AdvDemo", term4091197);
        setField(term4091198, term4091198.getClass(), "Start", null);
        setField(term4091198, term4091198.getClass(), "End", null);
        setField(term4091193, term4091193.getClass(), "Playable", term4091198);
        Object term4091199 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091203 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091204 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091199, term4091199.getClass(), "PVID", -487176277);
        setIntField(term4091199, term4091199.getClass(), "Version", 2050601266);
        setIntField(term4091199, term4091199.getClass(), "Edition", 113302596);
        setField(term4091203, term4091203.getClass(), "Start", null);
        setField(term4091203, term4091203.getClass(), "End", null);
        setField(term4091199, term4091199.getClass(), "AdvDemo", term4091203);
        setField(term4091204, term4091204.getClass(), "Start", null);
        setField(term4091204, term4091204.getClass(), "End", null);
        setField(term4091199, term4091199.getClass(), "Playable", term4091204);
        Object term4091205 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091205, term4091205.getClass(), "PVID", 565549155);
        setIntField(term4091205, term4091205.getClass(), "Version", -1933390884);
        setIntField(term4091205, term4091205.getClass(), "Edition", 1605287945);
        setField(term4091205, term4091205.getClass(), "AdvDemo", term4091198);
        setField(term4091205, term4091205.getClass(), "Playable", term4091203);
        Object term4091209 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091209, term4091209.getClass(), "PVID", 1254907757);
        setIntField(term4091209, term4091209.getClass(), "Version", -767799270);
        setIntField(term4091209, term4091209.getClass(), "Edition", 1683150024);
        setField(term4091209, term4091209.getClass(), "AdvDemo", term4091175);
        setField(term4091209, term4091209.getClass(), "Playable", term4091192);
        ArrayList term4091185 = new ArrayList();
        ((ArrayList) term4091185).add(term4091187);
        ((ArrayList) term4091185).add(term4091193);
        ((ArrayList) term4091185).add(term4091199);
        ((ArrayList) term4091185).add(term4091205);
        ((ArrayList) term4091185).add(term4091209);
        Object term4091217 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091217, term4091217.getClass(), "PVID", -1805255285);
        setIntField(term4091217, term4091217.getClass(), "Version", -807829117);
        setIntField(term4091217, term4091217.getClass(), "Edition", 2034683375);
        setField(term4091217, term4091217.getClass(), "AdvDemo", term4091182);
        setField(term4091217, term4091217.getClass(), "Playable", term4091176);
        Object term4091221 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091221, term4091221.getClass(), "PVID", 405463355);
        setIntField(term4091221, term4091221.getClass(), "Version", -906007620);
        setIntField(term4091221, term4091221.getClass(), "Edition", -1318474896);
        setField(term4091221, term4091221.getClass(), "AdvDemo", term4091176);
        setField(term4091221, term4091221.getClass(), "Playable", term4091204);
        ArrayList term4091215 = new ArrayList();
        ((ArrayList) term4091215).add(term4091217);
        ((ArrayList) term4091215).add(term4091221);
        Object term4091229 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091229, term4091229.getClass(), "PVID", -1420717172);
        setIntField(term4091229, term4091229.getClass(), "Version", 359245760);
        setIntField(term4091229, term4091229.getClass(), "Edition", -2106568745);
        setField(term4091229, term4091229.getClass(), "AdvDemo", term4091198);
        setField(term4091229, term4091229.getClass(), "Playable", term4091198);
        ArrayList term4091227 = new ArrayList();
        ((ArrayList) term4091227).add(term4091229);
        ((ArrayList) term4091227).add(term4091199);
        ((ArrayList) term4091227).add(term4091229);
        ((ArrayList) term4091227).add(term4091217);
        ((ArrayList) term4091227).add(term4091205);
        ((ArrayList) term4091227).add(term4091187);
        ((ArrayList) term4091227).add(term4091199);
        ((ArrayList) term4091227).add(term4091217);
        ((ArrayList) term4091227).add(term4091229);
        term4091158 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4091159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4091164 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4091160, term4091160.getClass(), "year", 2020);
        setShortField(term4091160, term4091160.getClass(), "month", (short) 11);
        setShortField(term4091160, term4091160.getClass(), "day", (short) 4);
        setField(term4091159, term4091159.getClass(), "date", term4091160);
        setByteField(term4091164, term4091164.getClass(), "hour", (byte) 18);
        setByteField(term4091164, term4091164.getClass(), "minute", (byte) 18);
        setByteField(term4091164, term4091164.getClass(), "second", (byte) 35);
        setIntField(term4091164, term4091164.getClass(), "nano", 861066);
        setField(term4091159, term4091159.getClass(), "time", term4091164);
        setField(term4091158, term4091158.getClass(), "CreationDate", term4091159);
        setField(term4091158, term4091158.getClass(), "Easy", term4091169);
        setField(term4091158, term4091158.getClass(), "Normal", term4091185);
        setField(term4091158, term4091158.getClass(), "Hard", term4091215);
        setField(term4091158, term4091158.getClass(), "Extreme", term4091227);
        term4091235 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4091235;
        callMethod(klass, "equals", argTypes, term4091158, args);
    }

};


