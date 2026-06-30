package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_getSkillEffect_7897288632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53019;

    public RecentResp_getSkillEffect_7897288632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53019 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53025 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53035 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53021, term53021.getClass(), "year", 2023);
        setShortField(term53021, term53021.getClass(), "month", (short) 12);
        setShortField(term53021, term53021.getClass(), "day", (short) 5);
        setField(term53020, term53020.getClass(), "date", term53021);
        setByteField(term53025, term53025.getClass(), "hour", (byte) 4);
        setByteField(term53025, term53025.getClass(), "minute", (byte) 10);
        setByteField(term53025, term53025.getClass(), "second", (byte) 41);
        setIntField(term53025, term53025.getClass(), "nano", 40865943);
        setField(term53020, term53020.getClass(), "time", term53025);
        setField(term53019, term53019.getClass(), "playDate", term53020);
        setIntField(term53031, term53031.getClass(), "year", 2027);
        setShortField(term53031, term53031.getClass(), "month", (short) 10);
        setShortField(term53031, term53031.getClass(), "day", (short) 18);
        setField(term53030, term53030.getClass(), "date", term53031);
        setByteField(term53035, term53035.getClass(), "hour", (byte) 16);
        setByteField(term53035, term53035.getClass(), "minute", (byte) 8);
        setByteField(term53035, term53035.getClass(), "second", (byte) 28);
        setIntField(term53035, term53035.getClass(), "nano", 268951041);
        setField(term53030, term53030.getClass(), "time", term53035);
        setField(term53019, term53019.getClass(), "userPlayDate", term53030);
        setIntField(term53019, term53019.getClass(), "musicId", -1135326582);
        setIntField(term53019, term53019.getClass(), "level", 594267051);
        setIntField(term53019, term53019.getClass(), "customId", -1225303838);
        setIntField(term53019, term53019.getClass(), "playedCustom1", 1093956146);
        setIntField(term53019, term53019.getClass(), "playedCustom2", 1459247713);
        setIntField(term53019, term53019.getClass(), "playedCustom3", 1400302967);
        setIntField(term53019, term53019.getClass(), "track", 692198729);
        setIntField(term53019, term53019.getClass(), "score", -1232290301);
        setIntField(term53019, term53019.getClass(), "rank", -1411058034);
        setIntField(term53019, term53019.getClass(), "maxCombo", -144155597);
        setIntField(term53019, term53019.getClass(), "maxChain", -996670851);
        setIntField(term53019, term53019.getClass(), "rateTap", 340642931);
        setIntField(term53019, term53019.getClass(), "rateHold", -2018441502);
        setIntField(term53019, term53019.getClass(), "rateSlide", -762480882);
        setIntField(term53019, term53019.getClass(), "rateAir", -263338308);
        setIntField(term53019, term53019.getClass(), "rateFlick", 1496385296);
        setIntField(term53019, term53019.getClass(), "judgeGuilty", -1339659575);
        setIntField(term53019, term53019.getClass(), "judgeAttack", 2123597267);
        setIntField(term53019, term53019.getClass(), "judgeJustice", -147077267);
        setIntField(term53019, term53019.getClass(), "judgeCritical", -550222549);
        setIntField(term53019, term53019.getClass(), "playerRating", -499576898);
        setBooleanField(term53019, term53019.getClass(), "isNewRecord", true);
        setBooleanField(term53019, term53019.getClass(), "isFullCombo", true);
        setIntField(term53019, term53019.getClass(), "fullChainKind", -686129078);
        setBooleanField(term53019, term53019.getClass(), "isAllJustice", false);
        setIntField(term53019, term53019.getClass(), "characterId", 1016118972);
        setIntField(term53019, term53019.getClass(), "skillId", 1276607451);
        setIntField(term53019, term53019.getClass(), "playKind", -547325184);
        setBooleanField(term53019, term53019.getClass(), "isClear", true);
        setIntField(term53019, term53019.getClass(), "skillLevel", 1470261214);
        setIntField(term53019, term53019.getClass(), "skillEffect", 1402619496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillEffect", argTypes, term53019, args);
    }

};


