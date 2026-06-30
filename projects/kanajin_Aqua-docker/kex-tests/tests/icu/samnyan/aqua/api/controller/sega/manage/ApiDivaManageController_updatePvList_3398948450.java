package icu.samnyan.aqua.api.controller.sega.manage;

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
import static icu.samnyan.aqua.api.controller.sega.manage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class ApiDivaManageController_updatePvList_3398948450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ApiDivaManageController_updatePvList_3398948450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term18 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term19 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term14, term14.getClass(), "PVID", 568599855);
        setIntField(term14, term14.getClass(), "Version", 1162663216);
        setIntField(term14, term14.getClass(), "Edition", 1484323161);
        setField(term18, term18.getClass(), "Start", null);
        setField(term18, term18.getClass(), "End", null);
        setField(term14, term14.getClass(), "AdvDemo", term18);
        setField(term19, term19.getClass(), "Start", null);
        setField(term19, term19.getClass(), "End", null);
        setField(term14, term14.getClass(), "Playable", term19);
        Object term20 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term24 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term25 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term20, term20.getClass(), "PVID", 391863371);
        setIntField(term20, term20.getClass(), "Version", -1922583790);
        setIntField(term20, term20.getClass(), "Edition", -616727354);
        setField(term24, term24.getClass(), "Start", null);
        setField(term24, term24.getClass(), "End", null);
        setField(term20, term20.getClass(), "AdvDemo", term24);
        setField(term25, term25.getClass(), "Start", null);
        setField(term25, term25.getClass(), "End", null);
        setField(term20, term20.getClass(), "Playable", term25);
        Object term26 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term30 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term31 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term26, term26.getClass(), "PVID", -1955890973);
        setIntField(term26, term26.getClass(), "Version", -2038273078);
        setIntField(term26, term26.getClass(), "Edition", 1227103734);
        setField(term30, term30.getClass(), "Start", null);
        setField(term30, term30.getClass(), "End", null);
        setField(term26, term26.getClass(), "AdvDemo", term30);
        setField(term31, term31.getClass(), "Start", null);
        setField(term31, term31.getClass(), "End", null);
        setField(term26, term26.getClass(), "Playable", term31);
        Object term32 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term36 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term37 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term32, term32.getClass(), "PVID", -1339778481);
        setIntField(term32, term32.getClass(), "Version", 1725571209);
        setIntField(term32, term32.getClass(), "Edition", -522618178);
        setField(term36, term36.getClass(), "Start", null);
        setField(term36, term36.getClass(), "End", null);
        setField(term32, term32.getClass(), "AdvDemo", term36);
        setField(term37, term37.getClass(), "Start", null);
        setField(term37, term37.getClass(), "End", null);
        setField(term32, term32.getClass(), "Playable", term37);
        Object term38 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term42 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term43 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term38, term38.getClass(), "PVID", 1134449235);
        setIntField(term38, term38.getClass(), "Version", -883034806);
        setIntField(term38, term38.getClass(), "Edition", 1585847225);
        setField(term42, term42.getClass(), "Start", null);
        setField(term42, term42.getClass(), "End", null);
        setField(term38, term38.getClass(), "AdvDemo", term42);
        setField(term43, term43.getClass(), "Start", null);
        setField(term43, term43.getClass(), "End", null);
        setField(term38, term38.getClass(), "Playable", term43);
        ArrayList term12 = new ArrayList();
        ((ArrayList) term12).add(term14);
        ((ArrayList) term12).add(term20);
        ((ArrayList) term12).add(term26);
        ((ArrayList) term12).add(term32);
        ((ArrayList) term12).add(term38);
        Object term48 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term48, term48.getClass(), "PVID", 597278769);
        setIntField(term48, term48.getClass(), "Version", -1685132342);
        setIntField(term48, term48.getClass(), "Edition", -1456670397);
        setField(term48, term48.getClass(), "AdvDemo", term37);
        setField(term48, term48.getClass(), "Playable", term42);
        Object term52 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term52, term52.getClass(), "PVID", 1622346318);
        setIntField(term52, term52.getClass(), "Version", 1048535127);
        setIntField(term52, term52.getClass(), "Edition", -655067527);
        setField(term52, term52.getClass(), "AdvDemo", term18);
        setField(term52, term52.getClass(), "Playable", term31);
        Object term56 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term56, term56.getClass(), "PVID", -6029667);
        setIntField(term56, term56.getClass(), "Version", -2068769794);
        setIntField(term56, term56.getClass(), "Edition", -117576464);
        setField(term56, term56.getClass(), "AdvDemo", term25);
        setField(term56, term56.getClass(), "Playable", term19);
        Object term60 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term60, term60.getClass(), "PVID", -1007160944);
        setIntField(term60, term60.getClass(), "Version", 1135664017);
        setIntField(term60, term60.getClass(), "Edition", 590364439);
        setField(term60, term60.getClass(), "AdvDemo", term19);
        setField(term60, term60.getClass(), "Playable", term43);
        ArrayList term46 = new ArrayList();
        ((ArrayList) term46).add(term48);
        ((ArrayList) term46).add(term52);
        ((ArrayList) term46).add(term56);
        ((ArrayList) term46).add(term60);
        Object term68 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term68, term68.getClass(), "PVID", 865208305);
        setIntField(term68, term68.getClass(), "Version", -1275173084);
        setIntField(term68, term68.getClass(), "Edition", -244121226);
        setField(term68, term68.getClass(), "AdvDemo", term37);
        setField(term68, term68.getClass(), "Playable", term37);
        ArrayList term66 = new ArrayList();
        ((ArrayList) term66).add(term68);
        ((ArrayList) term66).add(term38);
        ((ArrayList) term66).add(term68);
        ArrayList term74 = new ArrayList();
        ((ArrayList) term74).add(term56);
        ((ArrayList) term74).add(term48);
        ((ArrayList) term74).add(term26);
        ((ArrayList) term74).add(term38);
        term1 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term2 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3, term3.getClass(), "year", 2012);
        setShortField(term3, term3.getClass(), "month", (short) 8);
        setShortField(term3, term3.getClass(), "day", (short) 25);
        setField(term2, term2.getClass(), "date", term3);
        setByteField(term7, term7.getClass(), "hour", (byte) 5);
        setByteField(term7, term7.getClass(), "minute", (byte) 20);
        setByteField(term7, term7.getClass(), "second", (byte) 50);
        setIntField(term7, term7.getClass(), "nano", 345595912);
        setField(term2, term2.getClass(), "time", term7);
        setField(term1, term1.getClass(), "CreationDate", term2);
        setField(term1, term1.getClass(), "Easy", term12);
        setField(term1, term1.getClass(), "Normal", term46);
        setField(term1, term1.getClass(), "Hard", term66);
        setField(term1, term1.getClass(), "Extreme", term74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.manage.ApiDivaManageController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "updatePvList", argTypes, null, args);
    }

};


