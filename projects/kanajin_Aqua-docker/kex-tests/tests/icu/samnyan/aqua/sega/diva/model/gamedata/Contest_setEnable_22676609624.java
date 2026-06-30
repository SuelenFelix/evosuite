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
import java.lang.Boolean;

public class Contest_setEnable_22676609624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51727;
     Object term51897;

    public Contest_setEnable_22676609624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51920 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term51919 = ((Class) term51920).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term51919).setAccessible(true);
        Object enum107 = ((Field) term51919).get((Object) null);
        Class<? extends Object> term52238 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term52237 = ((Class) term52238).getDeclaredField((String) "PERCENTAGE");
        ((Field) term52237).setAccessible(true);
        Object enum108 = ((Field) term52237).get((Object) null);
        term51727 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term51730 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51731 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51735 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51745 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51727, term51727.getClass(), "id", 848907965);
        setBooleanField(term51727, term51727.getClass(), "enable", false);
        setIntField(term51731, term51731.getClass(), "year", 2019);
        setShortField(term51731, term51731.getClass(), "month", (short) 6);
        setShortField(term51731, term51731.getClass(), "day", (short) 12);
        setField(term51730, term51730.getClass(), "date", term51731);
        setByteField(term51735, term51735.getClass(), "hour", (byte) 5);
        setByteField(term51735, term51735.getClass(), "minute", (byte) 13);
        setByteField(term51735, term51735.getClass(), "second", (byte) 8);
        setIntField(term51735, term51735.getClass(), "nano", 838117658);
        setField(term51730, term51730.getClass(), "time", term51735);
        setField(term51727, term51727.getClass(), "startTime", term51730);
        setIntField(term51741, term51741.getClass(), "year", 2014);
        setShortField(term51741, term51741.getClass(), "month", (short) 8);
        setShortField(term51741, term51741.getClass(), "day", (short) 13);
        setField(term51740, term51740.getClass(), "date", term51741);
        setByteField(term51745, term51745.getClass(), "hour", (byte) 13);
        setByteField(term51745, term51745.getClass(), "minute", (byte) 15);
        setByteField(term51745, term51745.getClass(), "second", (byte) 51);
        setIntField(term51745, term51745.getClass(), "nano", 433726678);
        setField(term51740, term51740.getClass(), "time", term51745);
        setField(term51727, term51727.getClass(), "endTime", term51740);
        setField(term51727, term51727.getClass(), "name", "WoFrMqAUlT");
        setField(term51727, term51727.getClass(), "description", "RtHOddPkOW");
        setField(term51727, term51727.getClass(), "league", enum107);
        setIntField(term51727, term51727.getClass(), "stars", 1865070548);
        setIntField(term51727, term51727.getClass(), "minComplexity", 1904515443);
        setIntField(term51727, term51727.getClass(), "maxComplexity", 1361126430);
        setIntField(term51727, term51727.getClass(), "stages", 1728588701);
        setField(term51727, term51727.getClass(), "stageLimit", "LAaHVAeRPU");
        setField(term51727, term51727.getClass(), "normaType", enum108);
        setIntField(term51727, term51727.getClass(), "bronzeBorders", -355769268);
        setIntField(term51727, term51727.getClass(), "sliverBorders", -114460662);
        setIntField(term51727, term51727.getClass(), "goldBorders", -355376034);
        setField(term51727, term51727.getClass(), "pvList", "BLPwYfxwnm");
        setField(term51727, term51727.getClass(), "pvDiffList", "zItHVuBBzy");
        setField(term51727, term51727.getClass(), "bronzeContestReward", "pQcdIREjlp");
        setField(term51727, term51727.getClass(), "sliverContestReward", "WjUrdNMIOj");
        setField(term51727, term51727.getClass(), "goldContestReward", "aQUpwHjYvS");
        setField(term51727, term51727.getClass(), "contestEntryReward", "lvcTLkVhAN");
        term51897 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term51897;
        callMethod(klass, "setEnable", argTypes, term51727, args);
    }

};


