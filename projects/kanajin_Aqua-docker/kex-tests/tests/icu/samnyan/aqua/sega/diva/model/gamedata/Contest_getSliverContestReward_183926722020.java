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

public class Contest_getSliverContestReward_183926722020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48241;

    public Contest_getSliverContestReward_183926722020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48432 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term48431 = ((Class) term48432).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term48431).setAccessible(true);
        Object enum99 = ((Field) term48431).get((Object) null);
        Class<? extends Object> term48750 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term48749 = ((Class) term48750).getDeclaredField((String) "PERCENTAGE");
        ((Field) term48749).setAccessible(true);
        Object enum100 = ((Field) term48749).get((Object) null);
        term48241 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term48244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48249 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48259 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48241, term48241.getClass(), "id", 934338954);
        setBooleanField(term48241, term48241.getClass(), "enable", true);
        setIntField(term48245, term48245.getClass(), "year", 2014);
        setShortField(term48245, term48245.getClass(), "month", (short) 1);
        setShortField(term48245, term48245.getClass(), "day", (short) 26);
        setField(term48244, term48244.getClass(), "date", term48245);
        setByteField(term48249, term48249.getClass(), "hour", (byte) 3);
        setByteField(term48249, term48249.getClass(), "minute", (byte) 31);
        setByteField(term48249, term48249.getClass(), "second", (byte) 56);
        setIntField(term48249, term48249.getClass(), "nano", 100873602);
        setField(term48244, term48244.getClass(), "time", term48249);
        setField(term48241, term48241.getClass(), "startTime", term48244);
        setIntField(term48255, term48255.getClass(), "year", 2021);
        setShortField(term48255, term48255.getClass(), "month", (short) 12);
        setShortField(term48255, term48255.getClass(), "day", (short) 1);
        setField(term48254, term48254.getClass(), "date", term48255);
        setByteField(term48259, term48259.getClass(), "hour", (byte) 15);
        setByteField(term48259, term48259.getClass(), "minute", (byte) 30);
        setByteField(term48259, term48259.getClass(), "second", (byte) 5);
        setIntField(term48259, term48259.getClass(), "nano", 996341606);
        setField(term48254, term48254.getClass(), "time", term48259);
        setField(term48241, term48241.getClass(), "endTime", term48254);
        setField(term48241, term48241.getClass(), "name", "yrOIMfdQSI");
        setField(term48241, term48241.getClass(), "description", "PhtNZAacut");
        setField(term48241, term48241.getClass(), "league", enum99);
        setIntField(term48241, term48241.getClass(), "stars", 598635505);
        setIntField(term48241, term48241.getClass(), "minComplexity", -944986533);
        setIntField(term48241, term48241.getClass(), "maxComplexity", 1894454926);
        setIntField(term48241, term48241.getClass(), "stages", 1415142780);
        setField(term48241, term48241.getClass(), "stageLimit", "xbPAqsSBBS");
        setField(term48241, term48241.getClass(), "normaType", enum100);
        setIntField(term48241, term48241.getClass(), "bronzeBorders", -574105759);
        setIntField(term48241, term48241.getClass(), "sliverBorders", -1165271567);
        setIntField(term48241, term48241.getClass(), "goldBorders", 376834234);
        setField(term48241, term48241.getClass(), "pvList", "ivxMfASKCB");
        setField(term48241, term48241.getClass(), "pvDiffList", "JbksMMXXzT");
        setField(term48241, term48241.getClass(), "bronzeContestReward", "WHpoLWpffz");
        setField(term48241, term48241.getClass(), "sliverContestReward", "axiXBkomuw");
        setField(term48241, term48241.getClass(), "goldContestReward", "nhByIXwUpO");
        setField(term48241, term48241.getClass(), "contestEntryReward", "vVySvQZVok");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliverContestReward", argTypes, term48241, args);
    }

};


