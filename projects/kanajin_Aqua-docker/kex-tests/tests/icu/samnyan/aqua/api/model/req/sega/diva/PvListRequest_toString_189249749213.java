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
     Object term402125;

    public PvListRequest_toString_189249749213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term402138 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402142 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402143 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402138, term402138.getClass(), "PVID", -1562883821);
        setIntField(term402138, term402138.getClass(), "Version", 1078092661);
        setIntField(term402138, term402138.getClass(), "Edition", 1783484443);
        setField(term402142, term402142.getClass(), "Start", null);
        setField(term402142, term402142.getClass(), "End", null);
        setField(term402138, term402138.getClass(), "AdvDemo", term402142);
        setField(term402143, term402143.getClass(), "Start", null);
        setField(term402143, term402143.getClass(), "End", null);
        setField(term402138, term402138.getClass(), "Playable", term402143);
        ArrayList term402136 = new ArrayList();
        ((ArrayList) term402136).add(term402138);
        Object term402148 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402152 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402153 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402148, term402148.getClass(), "PVID", -2063477281);
        setIntField(term402148, term402148.getClass(), "Version", 1695573351);
        setIntField(term402148, term402148.getClass(), "Edition", 332663750);
        setField(term402152, term402152.getClass(), "Start", null);
        setField(term402152, term402152.getClass(), "End", null);
        setField(term402148, term402148.getClass(), "AdvDemo", term402152);
        setField(term402153, term402153.getClass(), "Start", null);
        setField(term402153, term402153.getClass(), "End", null);
        setField(term402148, term402148.getClass(), "Playable", term402153);
        Object term402154 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402158 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402159 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402154, term402154.getClass(), "PVID", 1631596788);
        setIntField(term402154, term402154.getClass(), "Version", -1880288852);
        setIntField(term402154, term402154.getClass(), "Edition", 1268042977);
        setField(term402158, term402158.getClass(), "Start", null);
        setField(term402158, term402158.getClass(), "End", null);
        setField(term402154, term402154.getClass(), "AdvDemo", term402158);
        setField(term402159, term402159.getClass(), "Start", null);
        setField(term402159, term402159.getClass(), "End", null);
        setField(term402154, term402154.getClass(), "Playable", term402159);
        Object term402160 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402164 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402165 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402160, term402160.getClass(), "PVID", 488484726);
        setIntField(term402160, term402160.getClass(), "Version", 775858730);
        setIntField(term402160, term402160.getClass(), "Edition", -7794406);
        setField(term402164, term402164.getClass(), "Start", null);
        setField(term402164, term402164.getClass(), "End", null);
        setField(term402160, term402160.getClass(), "AdvDemo", term402164);
        setField(term402165, term402165.getClass(), "Start", null);
        setField(term402165, term402165.getClass(), "End", null);
        setField(term402160, term402160.getClass(), "Playable", term402165);
        Object term402166 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402170 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402171 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402166, term402166.getClass(), "PVID", 1300524286);
        setIntField(term402166, term402166.getClass(), "Version", -1421245231);
        setIntField(term402166, term402166.getClass(), "Edition", -561699814);
        setField(term402170, term402170.getClass(), "Start", null);
        setField(term402170, term402170.getClass(), "End", null);
        setField(term402166, term402166.getClass(), "AdvDemo", term402170);
        setField(term402171, term402171.getClass(), "Start", null);
        setField(term402171, term402171.getClass(), "End", null);
        setField(term402166, term402166.getClass(), "Playable", term402171);
        Object term402172 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402172, term402172.getClass(), "PVID", 1289523747);
        setIntField(term402172, term402172.getClass(), "Version", -553209638);
        setIntField(term402172, term402172.getClass(), "Edition", -1196764593);
        setField(term402172, term402172.getClass(), "AdvDemo", term402165);
        setField(term402172, term402172.getClass(), "Playable", term402170);
        Object term402176 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402176, term402176.getClass(), "PVID", -1416949276);
        setIntField(term402176, term402176.getClass(), "Version", -1587562028);
        setIntField(term402176, term402176.getClass(), "Edition", -223176562);
        setField(term402176, term402176.getClass(), "AdvDemo", term402142);
        setField(term402176, term402176.getClass(), "Playable", term402159);
        Object term402180 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402180, term402180.getClass(), "PVID", 1792457772);
        setIntField(term402180, term402180.getClass(), "Version", -1430916750);
        setIntField(term402180, term402180.getClass(), "Edition", -2135937542);
        setField(term402180, term402180.getClass(), "AdvDemo", term402153);
        setField(term402180, term402180.getClass(), "Playable", term402143);
        Object term402184 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402184, term402184.getClass(), "PVID", -733650221);
        setIntField(term402184, term402184.getClass(), "Version", -368847049);
        setIntField(term402184, term402184.getClass(), "Edition", -1838856264);
        setField(term402184, term402184.getClass(), "AdvDemo", term402143);
        setField(term402184, term402184.getClass(), "Playable", term402171);
        ArrayList term402146 = new ArrayList();
        ((ArrayList) term402146).add(term402148);
        ((ArrayList) term402146).add(term402154);
        ((ArrayList) term402146).add(term402160);
        ((ArrayList) term402146).add(term402166);
        ((ArrayList) term402146).add(term402172);
        ((ArrayList) term402146).add(term402176);
        ((ArrayList) term402146).add(term402180);
        ((ArrayList) term402146).add(term402184);
        Object term402192 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402192, term402192.getClass(), "PVID", -100624867);
        setIntField(term402192, term402192.getClass(), "Version", -605573910);
        setIntField(term402192, term402192.getClass(), "Edition", -296774422);
        setField(term402192, term402192.getClass(), "AdvDemo", term402165);
        setField(term402192, term402192.getClass(), "Playable", term402165);
        ArrayList term402190 = new ArrayList();
        ((ArrayList) term402190).add(term402192);
        ((ArrayList) term402190).add(term402166);
        ((ArrayList) term402190).add(term402192);
        ((ArrayList) term402190).add(term402180);
        ((ArrayList) term402190).add(term402172);
        ((ArrayList) term402190).add(term402154);
        ((ArrayList) term402190).add(term402166);
        ArrayList term402198 = new ArrayList();
        ((ArrayList) term402198).add(term402180);
        ((ArrayList) term402198).add(term402192);
        ((ArrayList) term402198).add(term402192);
        ((ArrayList) term402198).add(term402160);
        ((ArrayList) term402198).add(term402166);
        ((ArrayList) term402198).add(term402166);
        ((ArrayList) term402198).add(term402148);
        ((ArrayList) term402198).add(term402176);
        term402125 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term402126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402131 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term402127, term402127.getClass(), "year", 2022);
        setShortField(term402127, term402127.getClass(), "month", (short) 6);
        setShortField(term402127, term402127.getClass(), "day", (short) 10);
        setField(term402126, term402126.getClass(), "date", term402127);
        setByteField(term402131, term402131.getClass(), "hour", (byte) 20);
        setByteField(term402131, term402131.getClass(), "minute", (byte) 57);
        setByteField(term402131, term402131.getClass(), "second", (byte) 28);
        setIntField(term402131, term402131.getClass(), "nano", 671508114);
        setField(term402126, term402126.getClass(), "time", term402131);
        setField(term402125, term402125.getClass(), "CreationDate", term402126);
        setField(term402125, term402125.getClass(), "Easy", term402136);
        setField(term402125, term402125.getClass(), "Normal", term402146);
        setField(term402125, term402125.getClass(), "Hard", term402190);
        setField(term402125, term402125.getClass(), "Extreme", term402198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term402125, args);
    }

};


