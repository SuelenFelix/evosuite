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

public class Contest_setStages_10921468633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59660;
     Object term59830;

    public Contest_setStages_10921468633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59853 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term59852 = ((Class) term59853).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term59852).setAccessible(true);
        Object enum125 = ((Field) term59852).get((Object) null);
        Class<? extends Object> term60171 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term60170 = ((Class) term60171).getDeclaredField((String) "PERCENTAGE");
        ((Field) term60170).setAccessible(true);
        Object enum126 = ((Field) term60170).get((Object) null);
        term59660 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term59663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59678 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term59660, term59660.getClass(), "id", 434914590);
        setBooleanField(term59660, term59660.getClass(), "enable", true);
        setIntField(term59664, term59664.getClass(), "year", 2015);
        setShortField(term59664, term59664.getClass(), "month", (short) 2);
        setShortField(term59664, term59664.getClass(), "day", (short) 1);
        setField(term59663, term59663.getClass(), "date", term59664);
        setByteField(term59668, term59668.getClass(), "hour", (byte) 11);
        setByteField(term59668, term59668.getClass(), "minute", (byte) 31);
        setByteField(term59668, term59668.getClass(), "second", (byte) 24);
        setIntField(term59668, term59668.getClass(), "nano", 461437823);
        setField(term59663, term59663.getClass(), "time", term59668);
        setField(term59660, term59660.getClass(), "startTime", term59663);
        setIntField(term59674, term59674.getClass(), "year", 2012);
        setShortField(term59674, term59674.getClass(), "month", (short) 3);
        setShortField(term59674, term59674.getClass(), "day", (short) 12);
        setField(term59673, term59673.getClass(), "date", term59674);
        setByteField(term59678, term59678.getClass(), "hour", (byte) 0);
        setByteField(term59678, term59678.getClass(), "minute", (byte) 32);
        setByteField(term59678, term59678.getClass(), "second", (byte) 14);
        setIntField(term59678, term59678.getClass(), "nano", 342342345);
        setField(term59673, term59673.getClass(), "time", term59678);
        setField(term59660, term59660.getClass(), "endTime", term59673);
        setField(term59660, term59660.getClass(), "name", "NJWFosJfXl");
        setField(term59660, term59660.getClass(), "description", "JraVClZLWB");
        setField(term59660, term59660.getClass(), "league", enum125);
        setIntField(term59660, term59660.getClass(), "stars", 1983756621);
        setIntField(term59660, term59660.getClass(), "minComplexity", -2134711835);
        setIntField(term59660, term59660.getClass(), "maxComplexity", -1641244494);
        setIntField(term59660, term59660.getClass(), "stages", 1124282188);
        setField(term59660, term59660.getClass(), "stageLimit", "PxscjEhxGk");
        setField(term59660, term59660.getClass(), "normaType", enum126);
        setIntField(term59660, term59660.getClass(), "bronzeBorders", -489441521);
        setIntField(term59660, term59660.getClass(), "sliverBorders", 225873732);
        setIntField(term59660, term59660.getClass(), "goldBorders", 529879356);
        setField(term59660, term59660.getClass(), "pvList", "ePFnljQSHU");
        setField(term59660, term59660.getClass(), "pvDiffList", "wedLWAuOOY");
        setField(term59660, term59660.getClass(), "bronzeContestReward", "oZDNpnQlCv");
        setField(term59660, term59660.getClass(), "sliverContestReward", "NdPeQAHWKN");
        setField(term59660, term59660.getClass(), "goldContestReward", "giGQTpcQuV");
        setField(term59660, term59660.getClass(), "contestEntryReward", "IWCccrYFQd");
        term59830 = new Integer(18072182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term59830;
        callMethod(klass, "setStages", argTypes, term59660, args);
    }

};


