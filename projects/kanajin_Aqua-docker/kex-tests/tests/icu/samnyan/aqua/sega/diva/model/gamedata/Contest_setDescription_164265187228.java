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

public class Contest_setDescription_164265187228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55219;

    public Contest_setDescription_164265187228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55418 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term55417 = ((Class) term55418).getDeclaredField((String) "ADVANCED");
        ((Field) term55417).setAccessible(true);
        Object enum115 = ((Field) term55417).get((Object) null);
        Class<? extends Object> term55724 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term55723 = ((Class) term55724).getDeclaredField((String) "PERCENTAGE");
        ((Field) term55723).setAccessible(true);
        Object enum116 = ((Field) term55723).get((Object) null);
        term55219 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term55222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55227 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55237 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term55219, term55219.getClass(), "id", 998679955);
        setBooleanField(term55219, term55219.getClass(), "enable", true);
        setIntField(term55223, term55223.getClass(), "year", 2029);
        setShortField(term55223, term55223.getClass(), "month", (short) 5);
        setShortField(term55223, term55223.getClass(), "day", (short) 11);
        setField(term55222, term55222.getClass(), "date", term55223);
        setByteField(term55227, term55227.getClass(), "hour", (byte) 20);
        setByteField(term55227, term55227.getClass(), "minute", (byte) 17);
        setByteField(term55227, term55227.getClass(), "second", (byte) 32);
        setIntField(term55227, term55227.getClass(), "nano", 327503582);
        setField(term55222, term55222.getClass(), "time", term55227);
        setField(term55219, term55219.getClass(), "startTime", term55222);
        setIntField(term55233, term55233.getClass(), "year", 2012);
        setShortField(term55233, term55233.getClass(), "month", (short) 10);
        setShortField(term55233, term55233.getClass(), "day", (short) 1);
        setField(term55232, term55232.getClass(), "date", term55233);
        setByteField(term55237, term55237.getClass(), "hour", (byte) 9);
        setByteField(term55237, term55237.getClass(), "minute", (byte) 27);
        setByteField(term55237, term55237.getClass(), "second", (byte) 33);
        setIntField(term55237, term55237.getClass(), "nano", 714912000);
        setField(term55232, term55232.getClass(), "time", term55237);
        setField(term55219, term55219.getClass(), "endTime", term55232);
        setField(term55219, term55219.getClass(), "name", "SfWiFjkLGW");
        setField(term55219, term55219.getClass(), "description", "urBahuOkUQ");
        setField(term55219, term55219.getClass(), "league", enum115);
        setIntField(term55219, term55219.getClass(), "stars", 953741504);
        setIntField(term55219, term55219.getClass(), "minComplexity", 1389452261);
        setIntField(term55219, term55219.getClass(), "maxComplexity", 1615957955);
        setIntField(term55219, term55219.getClass(), "stages", 1779370220);
        setField(term55219, term55219.getClass(), "stageLimit", "zHcZrTMdOT");
        setField(term55219, term55219.getClass(), "normaType", enum116);
        setIntField(term55219, term55219.getClass(), "bronzeBorders", -1716046610);
        setIntField(term55219, term55219.getClass(), "sliverBorders", 65264024);
        setIntField(term55219, term55219.getClass(), "goldBorders", -252449812);
        setField(term55219, term55219.getClass(), "pvList", "zIAIXHeKXt");
        setField(term55219, term55219.getClass(), "pvDiffList", "fVkSkOqFEO");
        setField(term55219, term55219.getClass(), "bronzeContestReward", "DLfgyAqDDu");
        setField(term55219, term55219.getClass(), "sliverContestReward", "ryuQaXtwNj");
        setField(term55219, term55219.getClass(), "goldContestReward", "OutjKNDSgR");
        setField(term55219, term55219.getClass(), "contestEntryReward", "brfLLGXcwA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zoVKwYYMOI";
        callMethod(klass, "setDescription", argTypes, term55219, args);
    }

};


