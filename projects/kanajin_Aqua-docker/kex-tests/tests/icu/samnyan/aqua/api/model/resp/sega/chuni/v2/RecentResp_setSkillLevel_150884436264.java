package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RecentResp_setSkillLevel_150884436264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49591;
     Object term49643;

    public RecentResp_setSkillLevel_150884436264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49591 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49597 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49602 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49607 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49593, term49593.getClass(), "year", 2010);
        setShortField(term49593, term49593.getClass(), "month", (short) 8);
        setShortField(term49593, term49593.getClass(), "day", (short) 17);
        setField(term49592, term49592.getClass(), "date", term49593);
        setByteField(term49597, term49597.getClass(), "hour", (byte) 5);
        setByteField(term49597, term49597.getClass(), "minute", (byte) 41);
        setByteField(term49597, term49597.getClass(), "second", (byte) 7);
        setIntField(term49597, term49597.getClass(), "nano", 26533684);
        setField(term49592, term49592.getClass(), "time", term49597);
        setField(term49591, term49591.getClass(), "playDate", term49592);
        setIntField(term49603, term49603.getClass(), "year", 2012);
        setShortField(term49603, term49603.getClass(), "month", (short) 4);
        setShortField(term49603, term49603.getClass(), "day", (short) 28);
        setField(term49602, term49602.getClass(), "date", term49603);
        setByteField(term49607, term49607.getClass(), "hour", (byte) 11);
        setByteField(term49607, term49607.getClass(), "minute", (byte) 47);
        setByteField(term49607, term49607.getClass(), "second", (byte) 25);
        setIntField(term49607, term49607.getClass(), "nano", 790659871);
        setField(term49602, term49602.getClass(), "time", term49607);
        setField(term49591, term49591.getClass(), "userPlayDate", term49602);
        setIntField(term49591, term49591.getClass(), "musicId", 180030231);
        setIntField(term49591, term49591.getClass(), "level", 645685543);
        setIntField(term49591, term49591.getClass(), "customId", -704733432);
        setIntField(term49591, term49591.getClass(), "playedCustom1", 147233013);
        setIntField(term49591, term49591.getClass(), "playedCustom2", -828376022);
        setIntField(term49591, term49591.getClass(), "playedCustom3", -1133227278);
        setIntField(term49591, term49591.getClass(), "track", -1998106900);
        setIntField(term49591, term49591.getClass(), "score", -1628037152);
        setIntField(term49591, term49591.getClass(), "rank", -1550570392);
        setIntField(term49591, term49591.getClass(), "maxCombo", -59951395);
        setIntField(term49591, term49591.getClass(), "maxChain", -294114307);
        setIntField(term49591, term49591.getClass(), "rateTap", -745407686);
        setIntField(term49591, term49591.getClass(), "rateHold", -1183051462);
        setIntField(term49591, term49591.getClass(), "rateSlide", -572029073);
        setIntField(term49591, term49591.getClass(), "rateAir", 1348271533);
        setIntField(term49591, term49591.getClass(), "rateFlick", 1234771885);
        setIntField(term49591, term49591.getClass(), "judgeGuilty", 1821658782);
        setIntField(term49591, term49591.getClass(), "judgeAttack", 871613900);
        setIntField(term49591, term49591.getClass(), "judgeJustice", 1322676409);
        setIntField(term49591, term49591.getClass(), "judgeCritical", -954764876);
        setIntField(term49591, term49591.getClass(), "playerRating", 1870177323);
        setBooleanField(term49591, term49591.getClass(), "isNewRecord", true);
        setBooleanField(term49591, term49591.getClass(), "isFullCombo", false);
        setIntField(term49591, term49591.getClass(), "fullChainKind", -1027146644);
        setBooleanField(term49591, term49591.getClass(), "isAllJustice", true);
        setIntField(term49591, term49591.getClass(), "characterId", 341013967);
        setIntField(term49591, term49591.getClass(), "skillId", 1873439089);
        setIntField(term49591, term49591.getClass(), "playKind", -1069668783);
        setBooleanField(term49591, term49591.getClass(), "isClear", false);
        setIntField(term49591, term49591.getClass(), "skillLevel", -301450995);
        setIntField(term49591, term49591.getClass(), "skillEffect", 753886838);
        term49643 = new Integer(-1802788931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49643;
        callMethod(klass, "setSkillLevel", argTypes, term49591, args);
    }

};


