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

public class PvListRequest_getNormal_13854949102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4090496;

    public PvListRequest_getNormal_13854949102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4090509 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090513 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090514 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090509, term4090509.getClass(), "PVID", -229077064);
        setIntField(term4090509, term4090509.getClass(), "Version", -1559570505);
        setIntField(term4090509, term4090509.getClass(), "Edition", 863257694);
        setField(term4090513, term4090513.getClass(), "Start", null);
        setField(term4090513, term4090513.getClass(), "End", null);
        setField(term4090509, term4090509.getClass(), "AdvDemo", term4090513);
        setField(term4090514, term4090514.getClass(), "Start", null);
        setField(term4090514, term4090514.getClass(), "End", null);
        setField(term4090509, term4090509.getClass(), "Playable", term4090514);
        Object term4090515 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090519 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090520 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090515, term4090515.getClass(), "PVID", -112446123);
        setIntField(term4090515, term4090515.getClass(), "Version", 947693495);
        setIntField(term4090515, term4090515.getClass(), "Edition", -906277572);
        setField(term4090519, term4090519.getClass(), "Start", null);
        setField(term4090519, term4090519.getClass(), "End", null);
        setField(term4090515, term4090515.getClass(), "AdvDemo", term4090519);
        setField(term4090520, term4090520.getClass(), "Start", null);
        setField(term4090520, term4090520.getClass(), "End", null);
        setField(term4090515, term4090515.getClass(), "Playable", term4090520);
        Object term4090521 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090525 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090526 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090521, term4090521.getClass(), "PVID", 401229960);
        setIntField(term4090521, term4090521.getClass(), "Version", -184330033);
        setIntField(term4090521, term4090521.getClass(), "Edition", -1129123933);
        setField(term4090525, term4090525.getClass(), "Start", null);
        setField(term4090525, term4090525.getClass(), "End", null);
        setField(term4090521, term4090521.getClass(), "AdvDemo", term4090525);
        setField(term4090526, term4090526.getClass(), "Start", null);
        setField(term4090526, term4090526.getClass(), "End", null);
        setField(term4090521, term4090521.getClass(), "Playable", term4090526);
        ArrayList term4090507 = new ArrayList();
        ((ArrayList) term4090507).add(term4090509);
        ((ArrayList) term4090507).add(term4090515);
        ((ArrayList) term4090507).add(term4090521);
        Object term4090531 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090535 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090536 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090531, term4090531.getClass(), "PVID", -5278700);
        setIntField(term4090531, term4090531.getClass(), "Version", -1592587164);
        setIntField(term4090531, term4090531.getClass(), "Edition", -1057981976);
        setField(term4090535, term4090535.getClass(), "Start", null);
        setField(term4090535, term4090535.getClass(), "End", null);
        setField(term4090531, term4090531.getClass(), "AdvDemo", term4090535);
        setField(term4090536, term4090536.getClass(), "Start", null);
        setField(term4090536, term4090536.getClass(), "End", null);
        setField(term4090531, term4090531.getClass(), "Playable", term4090536);
        Object term4090537 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090541 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090542 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090537, term4090537.getClass(), "PVID", 1000629597);
        setIntField(term4090537, term4090537.getClass(), "Version", -802518970);
        setIntField(term4090537, term4090537.getClass(), "Edition", 1395590273);
        setField(term4090541, term4090541.getClass(), "Start", null);
        setField(term4090541, term4090541.getClass(), "End", null);
        setField(term4090537, term4090537.getClass(), "AdvDemo", term4090541);
        setField(term4090542, term4090542.getClass(), "Start", null);
        setField(term4090542, term4090542.getClass(), "End", null);
        setField(term4090537, term4090537.getClass(), "Playable", term4090542);
        Object term4090543 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090543, term4090543.getClass(), "PVID", 857142245);
        setIntField(term4090543, term4090543.getClass(), "Version", -493885310);
        setIntField(term4090543, term4090543.getClass(), "Edition", 994129831);
        setField(term4090543, term4090543.getClass(), "AdvDemo", term4090536);
        setField(term4090543, term4090543.getClass(), "Playable", term4090541);
        Object term4090547 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090547, term4090547.getClass(), "PVID", 1436647761);
        setIntField(term4090547, term4090547.getClass(), "Version", -825502788);
        setIntField(term4090547, term4090547.getClass(), "Edition", 388985805);
        setField(term4090547, term4090547.getClass(), "AdvDemo", term4090513);
        setField(term4090547, term4090547.getClass(), "Playable", term4090526);
        Object term4090551 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090551, term4090551.getClass(), "PVID", 1660086633);
        setIntField(term4090551, term4090551.getClass(), "Version", 968040751);
        setIntField(term4090551, term4090551.getClass(), "Edition", -1415578682);
        setField(term4090551, term4090551.getClass(), "AdvDemo", term4090520);
        setField(term4090551, term4090551.getClass(), "Playable", term4090514);
        Object term4090555 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090555, term4090555.getClass(), "PVID", 661457081);
        setIntField(term4090555, term4090555.getClass(), "Version", 1515678455);
        setIntField(term4090555, term4090555.getClass(), "Edition", -897917277);
        setField(term4090555, term4090555.getClass(), "AdvDemo", term4090514);
        setField(term4090555, term4090555.getClass(), "Playable", term4090542);
        Object term4090559 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090559, term4090559.getClass(), "PVID", 2099007154);
        setIntField(term4090559, term4090559.getClass(), "Version", -737660566);
        setIntField(term4090559, term4090559.getClass(), "Edition", 1459230213);
        setField(term4090559, term4090559.getClass(), "AdvDemo", term4090536);
        setField(term4090559, term4090559.getClass(), "Playable", term4090536);
        ArrayList term4090529 = new ArrayList();
        ((ArrayList) term4090529).add(term4090531);
        ((ArrayList) term4090529).add(term4090537);
        ((ArrayList) term4090529).add(term4090543);
        ((ArrayList) term4090529).add(term4090547);
        ((ArrayList) term4090529).add(term4090551);
        ((ArrayList) term4090529).add(term4090555);
        ((ArrayList) term4090529).add(term4090559);
        ((ArrayList) term4090529).add(term4090537);
        ArrayList term4090565 = new ArrayList();
        ((ArrayList) term4090565).add(term4090559);
        ((ArrayList) term4090565).add(term4090551);
        ((ArrayList) term4090565).add(term4090543);
        ((ArrayList) term4090565).add(term4090521);
        ((ArrayList) term4090565).add(term4090537);
        ArrayList term4090569 = new ArrayList();
        ((ArrayList) term4090569).add(term4090551);
        term4090496 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4090497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4090498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090502 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4090498, term4090498.getClass(), "year", 2010);
        setShortField(term4090498, term4090498.getClass(), "month", (short) 12);
        setShortField(term4090498, term4090498.getClass(), "day", (short) 12);
        setField(term4090497, term4090497.getClass(), "date", term4090498);
        setByteField(term4090502, term4090502.getClass(), "hour", (byte) 4);
        setByteField(term4090502, term4090502.getClass(), "minute", (byte) 24);
        setByteField(term4090502, term4090502.getClass(), "second", (byte) 27);
        setIntField(term4090502, term4090502.getClass(), "nano", 308606835);
        setField(term4090497, term4090497.getClass(), "time", term4090502);
        setField(term4090496, term4090496.getClass(), "CreationDate", term4090497);
        setField(term4090496, term4090496.getClass(), "Easy", term4090507);
        setField(term4090496, term4090496.getClass(), "Normal", term4090529);
        setField(term4090496, term4090496.getClass(), "Hard", term4090565);
        setField(term4090496, term4090496.getClass(), "Extreme", term4090569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNormal", argTypes, term4090496, args);
    }

};


