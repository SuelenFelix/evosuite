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

public class Contest_getString_16185843510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30676;

    public Contest_getString_16185843510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30923 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term30922 = ((Class) term30923).getDeclaredField((String) "BEGINNER");
        ((Field) term30922).setAccessible(true);
        Object enum59 = ((Field) term30922).get((Object) null);
        Class<? extends Object> term31274 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term31273 = ((Class) term31274).getDeclaredField((String) "PERCENTAGE");
        ((Field) term31273).setAccessible(true);
        Object enum60 = ((Field) term31273).get((Object) null);
        term30676 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term30679 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30680 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30684 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30689 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30690 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30694 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30676, term30676.getClass(), "id", 1349815364);
        setBooleanField(term30676, term30676.getClass(), "enable", false);
        setIntField(term30680, term30680.getClass(), "year", 2021);
        setShortField(term30680, term30680.getClass(), "month", (short) 3);
        setShortField(term30680, term30680.getClass(), "day", (short) 13);
        setField(term30679, term30679.getClass(), "date", term30680);
        setByteField(term30684, term30684.getClass(), "hour", (byte) 6);
        setByteField(term30684, term30684.getClass(), "minute", (byte) 25);
        setByteField(term30684, term30684.getClass(), "second", (byte) 42);
        setIntField(term30684, term30684.getClass(), "nano", 282924199);
        setField(term30679, term30679.getClass(), "time", term30684);
        setField(term30676, term30676.getClass(), "startTime", term30679);
        setIntField(term30690, term30690.getClass(), "year", 2020);
        setShortField(term30690, term30690.getClass(), "month", (short) 10);
        setShortField(term30690, term30690.getClass(), "day", (short) 25);
        setField(term30689, term30689.getClass(), "date", term30690);
        setByteField(term30694, term30694.getClass(), "hour", (byte) 18);
        setByteField(term30694, term30694.getClass(), "minute", (byte) 22);
        setByteField(term30694, term30694.getClass(), "second", (byte) 30);
        setIntField(term30694, term30694.getClass(), "nano", 948592965);
        setField(term30689, term30689.getClass(), "time", term30694);
        setField(term30676, term30676.getClass(), "endTime", term30689);
        setField(term30676, term30676.getClass(), "name", "DHbGOjJfEz");
        setField(term30676, term30676.getClass(), "description", "OuyHNwADel");
        setField(term30676, term30676.getClass(), "league", enum59);
        setIntField(term30676, term30676.getClass(), "stars", 2128383340);
        setIntField(term30676, term30676.getClass(), "minComplexity", 1238598518);
        setIntField(term30676, term30676.getClass(), "maxComplexity", -558146961);
        setIntField(term30676, term30676.getClass(), "stages", 1505480070);
        setField(term30676, term30676.getClass(), "stageLimit", "shazlRAQrB");
        setField(term30676, term30676.getClass(), "normaType", enum60);
        setIntField(term30676, term30676.getClass(), "bronzeBorders", -829088844);
        setIntField(term30676, term30676.getClass(), "sliverBorders", -31751777);
        setIntField(term30676, term30676.getClass(), "goldBorders", -246967963);
        setField(term30676, term30676.getClass(), "pvList", "PNJdNWkxgW");
        setField(term30676, term30676.getClass(), "pvDiffList", "aCTJvzQZSQ");
        setField(term30676, term30676.getClass(), "bronzeContestReward", "hcvedmWnmW");
        setField(term30676, term30676.getClass(), "sliverContestReward", "rBZaHWidIS");
        setField(term30676, term30676.getClass(), "goldContestReward", "xneQCADwGB");
        setField(term30676, term30676.getClass(), "contestEntryReward", "luSCmxphxi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getString", argTypes, term30676, args);
    }

};


