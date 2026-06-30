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

public class RecentResp_setJudgeCritical_86526101354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49051;
     Object term49103;

    public RecentResp_setJudgeCritical_86526101354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49051 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49057 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49067 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49053, term49053.getClass(), "year", 2028);
        setShortField(term49053, term49053.getClass(), "month", (short) 4);
        setShortField(term49053, term49053.getClass(), "day", (short) 9);
        setField(term49052, term49052.getClass(), "date", term49053);
        setByteField(term49057, term49057.getClass(), "hour", (byte) 16);
        setByteField(term49057, term49057.getClass(), "minute", (byte) 26);
        setByteField(term49057, term49057.getClass(), "second", (byte) 35);
        setIntField(term49057, term49057.getClass(), "nano", 546233932);
        setField(term49052, term49052.getClass(), "time", term49057);
        setField(term49051, term49051.getClass(), "playDate", term49052);
        setIntField(term49063, term49063.getClass(), "year", 2022);
        setShortField(term49063, term49063.getClass(), "month", (short) 3);
        setShortField(term49063, term49063.getClass(), "day", (short) 19);
        setField(term49062, term49062.getClass(), "date", term49063);
        setByteField(term49067, term49067.getClass(), "hour", (byte) 6);
        setByteField(term49067, term49067.getClass(), "minute", (byte) 55);
        setByteField(term49067, term49067.getClass(), "second", (byte) 49);
        setIntField(term49067, term49067.getClass(), "nano", 478088059);
        setField(term49062, term49062.getClass(), "time", term49067);
        setField(term49051, term49051.getClass(), "userPlayDate", term49062);
        setIntField(term49051, term49051.getClass(), "musicId", -1625206430);
        setIntField(term49051, term49051.getClass(), "level", 1599734340);
        setIntField(term49051, term49051.getClass(), "customId", 1262425699);
        setIntField(term49051, term49051.getClass(), "playedCustom1", -515051505);
        setIntField(term49051, term49051.getClass(), "playedCustom2", -1071258857);
        setIntField(term49051, term49051.getClass(), "playedCustom3", 1274665398);
        setIntField(term49051, term49051.getClass(), "track", -1093564935);
        setIntField(term49051, term49051.getClass(), "score", -1092739931);
        setIntField(term49051, term49051.getClass(), "rank", 859336834);
        setIntField(term49051, term49051.getClass(), "maxCombo", -924154861);
        setIntField(term49051, term49051.getClass(), "maxChain", -1878694006);
        setIntField(term49051, term49051.getClass(), "rateTap", 1950167487);
        setIntField(term49051, term49051.getClass(), "rateHold", 1031826708);
        setIntField(term49051, term49051.getClass(), "rateSlide", -735726273);
        setIntField(term49051, term49051.getClass(), "rateAir", 1618278091);
        setIntField(term49051, term49051.getClass(), "rateFlick", -548967985);
        setIntField(term49051, term49051.getClass(), "judgeGuilty", -1923425156);
        setIntField(term49051, term49051.getClass(), "judgeAttack", 1237861885);
        setIntField(term49051, term49051.getClass(), "judgeJustice", 1433214025);
        setIntField(term49051, term49051.getClass(), "judgeCritical", 1424797105);
        setIntField(term49051, term49051.getClass(), "playerRating", 386281072);
        setBooleanField(term49051, term49051.getClass(), "isNewRecord", true);
        setBooleanField(term49051, term49051.getClass(), "isFullCombo", false);
        setIntField(term49051, term49051.getClass(), "fullChainKind", -782180775);
        setBooleanField(term49051, term49051.getClass(), "isAllJustice", false);
        setIntField(term49051, term49051.getClass(), "characterId", -1971308334);
        setIntField(term49051, term49051.getClass(), "skillId", -2070149565);
        setIntField(term49051, term49051.getClass(), "playKind", 1682543276);
        setBooleanField(term49051, term49051.getClass(), "isClear", false);
        setIntField(term49051, term49051.getClass(), "skillLevel", 156914536);
        setIntField(term49051, term49051.getClass(), "skillEffect", -1745894636);
        term49103 = new Integer(571282234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49103;
        callMethod(klass, "setJudgeCritical", argTypes, term49051, args);
    }

};


