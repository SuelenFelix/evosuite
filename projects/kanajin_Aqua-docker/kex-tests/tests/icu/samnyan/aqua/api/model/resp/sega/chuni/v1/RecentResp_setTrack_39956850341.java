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
import java.lang.Integer;

public class RecentResp_setTrack_39956850341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53519;
     Object term53571;

    public RecentResp_setTrack_39956850341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53519 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53525 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53535 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53521, term53521.getClass(), "year", 2022);
        setShortField(term53521, term53521.getClass(), "month", (short) 10);
        setShortField(term53521, term53521.getClass(), "day", (short) 1);
        setField(term53520, term53520.getClass(), "date", term53521);
        setByteField(term53525, term53525.getClass(), "hour", (byte) 0);
        setByteField(term53525, term53525.getClass(), "minute", (byte) 56);
        setByteField(term53525, term53525.getClass(), "second", (byte) 38);
        setIntField(term53525, term53525.getClass(), "nano", 320635849);
        setField(term53520, term53520.getClass(), "time", term53525);
        setField(term53519, term53519.getClass(), "playDate", term53520);
        setIntField(term53531, term53531.getClass(), "year", 2028);
        setShortField(term53531, term53531.getClass(), "month", (short) 4);
        setShortField(term53531, term53531.getClass(), "day", (short) 9);
        setField(term53530, term53530.getClass(), "date", term53531);
        setByteField(term53535, term53535.getClass(), "hour", (byte) 15);
        setByteField(term53535, term53535.getClass(), "minute", (byte) 32);
        setByteField(term53535, term53535.getClass(), "second", (byte) 25);
        setIntField(term53535, term53535.getClass(), "nano", 604005925);
        setField(term53530, term53530.getClass(), "time", term53535);
        setField(term53519, term53519.getClass(), "userPlayDate", term53530);
        setIntField(term53519, term53519.getClass(), "musicId", 191435935);
        setIntField(term53519, term53519.getClass(), "level", -1320856251);
        setIntField(term53519, term53519.getClass(), "customId", 957604584);
        setIntField(term53519, term53519.getClass(), "playedCustom1", 1124496804);
        setIntField(term53519, term53519.getClass(), "playedCustom2", -792786703);
        setIntField(term53519, term53519.getClass(), "playedCustom3", 331010013);
        setIntField(term53519, term53519.getClass(), "track", 275287586);
        setIntField(term53519, term53519.getClass(), "score", 628507821);
        setIntField(term53519, term53519.getClass(), "rank", 247792610);
        setIntField(term53519, term53519.getClass(), "maxCombo", -2059652097);
        setIntField(term53519, term53519.getClass(), "maxChain", 75564248);
        setIntField(term53519, term53519.getClass(), "rateTap", -829801689);
        setIntField(term53519, term53519.getClass(), "rateHold", 265481386);
        setIntField(term53519, term53519.getClass(), "rateSlide", -893720551);
        setIntField(term53519, term53519.getClass(), "rateAir", 696829611);
        setIntField(term53519, term53519.getClass(), "rateFlick", 1751983051);
        setIntField(term53519, term53519.getClass(), "judgeGuilty", -1416766445);
        setIntField(term53519, term53519.getClass(), "judgeAttack", -203238563);
        setIntField(term53519, term53519.getClass(), "judgeJustice", -132358473);
        setIntField(term53519, term53519.getClass(), "judgeCritical", 130567867);
        setIntField(term53519, term53519.getClass(), "playerRating", 33782620);
        setBooleanField(term53519, term53519.getClass(), "isNewRecord", false);
        setBooleanField(term53519, term53519.getClass(), "isFullCombo", true);
        setIntField(term53519, term53519.getClass(), "fullChainKind", -818766632);
        setBooleanField(term53519, term53519.getClass(), "isAllJustice", false);
        setIntField(term53519, term53519.getClass(), "characterId", 45627161);
        setIntField(term53519, term53519.getClass(), "skillId", -206817101);
        setIntField(term53519, term53519.getClass(), "playKind", 1541533024);
        setBooleanField(term53519, term53519.getClass(), "isClear", false);
        setIntField(term53519, term53519.getClass(), "skillLevel", -1032828989);
        setIntField(term53519, term53519.getClass(), "skillEffect", -649944911);
        term53571 = new Integer(-1426067073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53571;
        callMethod(klass, "setTrack", argTypes, term53519, args);
    }

};


