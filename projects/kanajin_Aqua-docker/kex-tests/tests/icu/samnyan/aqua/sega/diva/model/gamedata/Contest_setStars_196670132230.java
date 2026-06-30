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
import java.lang.Integer;

public class Contest_setStars_196670132230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57015;
     Object term57186;

    public Contest_setStars_196670132230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57209 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term57208 = ((Class) term57209).getDeclaredField((String) "ADVANCED");
        ((Field) term57208).setAccessible(true);
        Object enum119 = ((Field) term57208).get((Object) null);
        Class<? extends Object> term57515 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term57514 = ((Class) term57515).getDeclaredField((String) "COOL_PERCENTAGE");
        ((Field) term57514).setAccessible(true);
        Object enum120 = ((Field) term57514).get((Object) null);
        term57015 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term57018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57023 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57033 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term57015, term57015.getClass(), "id", -1742790308);
        setBooleanField(term57015, term57015.getClass(), "enable", true);
        setIntField(term57019, term57019.getClass(), "year", 2023);
        setShortField(term57019, term57019.getClass(), "month", (short) 5);
        setShortField(term57019, term57019.getClass(), "day", (short) 31);
        setField(term57018, term57018.getClass(), "date", term57019);
        setByteField(term57023, term57023.getClass(), "hour", (byte) 13);
        setByteField(term57023, term57023.getClass(), "minute", (byte) 29);
        setByteField(term57023, term57023.getClass(), "second", (byte) 29);
        setIntField(term57023, term57023.getClass(), "nano", 621312201);
        setField(term57018, term57018.getClass(), "time", term57023);
        setField(term57015, term57015.getClass(), "startTime", term57018);
        setIntField(term57029, term57029.getClass(), "year", 2020);
        setShortField(term57029, term57029.getClass(), "month", (short) 10);
        setShortField(term57029, term57029.getClass(), "day", (short) 26);
        setField(term57028, term57028.getClass(), "date", term57029);
        setByteField(term57033, term57033.getClass(), "hour", (byte) 10);
        setByteField(term57033, term57033.getClass(), "minute", (byte) 50);
        setByteField(term57033, term57033.getClass(), "second", (byte) 16);
        setIntField(term57033, term57033.getClass(), "nano", 613429);
        setField(term57028, term57028.getClass(), "time", term57033);
        setField(term57015, term57015.getClass(), "endTime", term57028);
        setField(term57015, term57015.getClass(), "name", "OxlZVhvedR");
        setField(term57015, term57015.getClass(), "description", "eoDtSQyUsr");
        setField(term57015, term57015.getClass(), "league", enum119);
        setIntField(term57015, term57015.getClass(), "stars", -1592093430);
        setIntField(term57015, term57015.getClass(), "minComplexity", 1178214545);
        setIntField(term57015, term57015.getClass(), "maxComplexity", -985334541);
        setIntField(term57015, term57015.getClass(), "stages", -1870004228);
        setField(term57015, term57015.getClass(), "stageLimit", "RMTgBohsAX");
        setField(term57015, term57015.getClass(), "normaType", enum120);
        setIntField(term57015, term57015.getClass(), "bronzeBorders", 380484139);
        setIntField(term57015, term57015.getClass(), "sliverBorders", 1822317628);
        setIntField(term57015, term57015.getClass(), "goldBorders", -608830309);
        setField(term57015, term57015.getClass(), "pvList", "kdYeXJnJGG");
        setField(term57015, term57015.getClass(), "pvDiffList", "XEdoshuvxD");
        setField(term57015, term57015.getClass(), "bronzeContestReward", "ljtopXMcRl");
        setField(term57015, term57015.getClass(), "sliverContestReward", "HHtcAGkfuz");
        setField(term57015, term57015.getClass(), "goldContestReward", "QZCuYHcIBC");
        setField(term57015, term57015.getClass(), "contestEntryReward", "hpvoFaAyIu");
        term57186 = new Integer(-537786484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57186;
        callMethod(klass, "setStars", argTypes, term57015, args);
    }

};


