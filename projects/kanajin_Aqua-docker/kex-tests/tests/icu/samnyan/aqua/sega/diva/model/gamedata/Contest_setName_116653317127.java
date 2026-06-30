package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Contest_setName_116653317127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54348;

    public Contest_setName_116653317127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54542 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term54541 = ((Class) term54542).getDeclaredField((String) "BEGINNER");
        ((Field) term54541).setAccessible(true);
        Object enum113 = ((Field) term54541).get((Object) null);
        Class<? extends Object> term54848 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term54847 = ((Class) term54848).getDeclaredField((String) "SCORE");
        ((Field) term54847).setAccessible(true);
        Object enum114 = ((Field) term54847).get((Object) null);
        term54348 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term54351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54366 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54348, term54348.getClass(), "id", -1780848958);
        setBooleanField(term54348, term54348.getClass(), "enable", true);
        setIntField(term54352, term54352.getClass(), "year", 2010);
        setShortField(term54352, term54352.getClass(), "month", (short) 3);
        setShortField(term54352, term54352.getClass(), "day", (short) 11);
        setField(term54351, term54351.getClass(), "date", term54352);
        setByteField(term54356, term54356.getClass(), "hour", (byte) 0);
        setByteField(term54356, term54356.getClass(), "minute", (byte) 21);
        setByteField(term54356, term54356.getClass(), "second", (byte) 25);
        setIntField(term54356, term54356.getClass(), "nano", 201315999);
        setField(term54351, term54351.getClass(), "time", term54356);
        setField(term54348, term54348.getClass(), "startTime", term54351);
        setIntField(term54362, term54362.getClass(), "year", 2016);
        setShortField(term54362, term54362.getClass(), "month", (short) 8);
        setShortField(term54362, term54362.getClass(), "day", (short) 24);
        setField(term54361, term54361.getClass(), "date", term54362);
        setByteField(term54366, term54366.getClass(), "hour", (byte) 22);
        setByteField(term54366, term54366.getClass(), "minute", (byte) 25);
        setByteField(term54366, term54366.getClass(), "second", (byte) 3);
        setIntField(term54366, term54366.getClass(), "nano", 185613519);
        setField(term54361, term54361.getClass(), "time", term54366);
        setField(term54348, term54348.getClass(), "endTime", term54361);
        setField(term54348, term54348.getClass(), "name", "UrLisdyvVs");
        setField(term54348, term54348.getClass(), "description", "VckRXyiShh");
        setField(term54348, term54348.getClass(), "league", enum113);
        setIntField(term54348, term54348.getClass(), "stars", 1235045850);
        setIntField(term54348, term54348.getClass(), "minComplexity", -75143033);
        setIntField(term54348, term54348.getClass(), "maxComplexity", 797015478);
        setIntField(term54348, term54348.getClass(), "stages", 717574276);
        setField(term54348, term54348.getClass(), "stageLimit", "ZKwDTklKHb");
        setField(term54348, term54348.getClass(), "normaType", enum114);
        setIntField(term54348, term54348.getClass(), "bronzeBorders", 1795369860);
        setIntField(term54348, term54348.getClass(), "sliverBorders", -570164389);
        setIntField(term54348, term54348.getClass(), "goldBorders", 43200329);
        setField(term54348, term54348.getClass(), "pvList", "tQMlnMStsQ");
        setField(term54348, term54348.getClass(), "pvDiffList", "OYJvKAMFEk");
        setField(term54348, term54348.getClass(), "bronzeContestReward", "puNAveVBkA");
        setField(term54348, term54348.getClass(), "sliverContestReward", "BcZKUIbuQL");
        setField(term54348, term54348.getClass(), "goldContestReward", "YvjPnZyRnw");
        setField(term54348, term54348.getClass(), "contestEntryReward", "IKmMfqFPku");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NACnGDmVPl";
        callMethod(klass, "setName", argTypes, term54348, args);
    }

};


