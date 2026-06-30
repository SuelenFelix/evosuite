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

public class RecentResp_setPlayKind_77891554162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49483;
     Object term49535;

    public RecentResp_setPlayKind_77891554162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49483 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49489 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49499 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49485, term49485.getClass(), "year", 2019);
        setShortField(term49485, term49485.getClass(), "month", (short) 10);
        setShortField(term49485, term49485.getClass(), "day", (short) 4);
        setField(term49484, term49484.getClass(), "date", term49485);
        setByteField(term49489, term49489.getClass(), "hour", (byte) 14);
        setByteField(term49489, term49489.getClass(), "minute", (byte) 11);
        setByteField(term49489, term49489.getClass(), "second", (byte) 28);
        setIntField(term49489, term49489.getClass(), "nano", 963604727);
        setField(term49484, term49484.getClass(), "time", term49489);
        setField(term49483, term49483.getClass(), "playDate", term49484);
        setIntField(term49495, term49495.getClass(), "year", 2029);
        setShortField(term49495, term49495.getClass(), "month", (short) 8);
        setShortField(term49495, term49495.getClass(), "day", (short) 18);
        setField(term49494, term49494.getClass(), "date", term49495);
        setByteField(term49499, term49499.getClass(), "hour", (byte) 8);
        setByteField(term49499, term49499.getClass(), "minute", (byte) 52);
        setByteField(term49499, term49499.getClass(), "second", (byte) 59);
        setIntField(term49499, term49499.getClass(), "nano", 526040172);
        setField(term49494, term49494.getClass(), "time", term49499);
        setField(term49483, term49483.getClass(), "userPlayDate", term49494);
        setIntField(term49483, term49483.getClass(), "musicId", 1984720770);
        setIntField(term49483, term49483.getClass(), "level", -8765616);
        setIntField(term49483, term49483.getClass(), "customId", -1365627412);
        setIntField(term49483, term49483.getClass(), "playedCustom1", 520625434);
        setIntField(term49483, term49483.getClass(), "playedCustom2", 1531056945);
        setIntField(term49483, term49483.getClass(), "playedCustom3", -2128361795);
        setIntField(term49483, term49483.getClass(), "track", 925239258);
        setIntField(term49483, term49483.getClass(), "score", 1041156468);
        setIntField(term49483, term49483.getClass(), "rank", 825756233);
        setIntField(term49483, term49483.getClass(), "maxCombo", -494349155);
        setIntField(term49483, term49483.getClass(), "maxChain", -621743880);
        setIntField(term49483, term49483.getClass(), "rateTap", 1487958580);
        setIntField(term49483, term49483.getClass(), "rateHold", -41377169);
        setIntField(term49483, term49483.getClass(), "rateSlide", -1713407140);
        setIntField(term49483, term49483.getClass(), "rateAir", 184591989);
        setIntField(term49483, term49483.getClass(), "rateFlick", 528505320);
        setIntField(term49483, term49483.getClass(), "judgeGuilty", 1255256909);
        setIntField(term49483, term49483.getClass(), "judgeAttack", 1364268540);
        setIntField(term49483, term49483.getClass(), "judgeJustice", 1613417207);
        setIntField(term49483, term49483.getClass(), "judgeCritical", -267884738);
        setIntField(term49483, term49483.getClass(), "playerRating", 1701113802);
        setBooleanField(term49483, term49483.getClass(), "isNewRecord", false);
        setBooleanField(term49483, term49483.getClass(), "isFullCombo", false);
        setIntField(term49483, term49483.getClass(), "fullChainKind", 2142343992);
        setBooleanField(term49483, term49483.getClass(), "isAllJustice", false);
        setIntField(term49483, term49483.getClass(), "characterId", -875414289);
        setIntField(term49483, term49483.getClass(), "skillId", 510025419);
        setIntField(term49483, term49483.getClass(), "playKind", 768579195);
        setBooleanField(term49483, term49483.getClass(), "isClear", true);
        setIntField(term49483, term49483.getClass(), "skillLevel", 935186156);
        setIntField(term49483, term49483.getClass(), "skillEffect", -101515724);
        term49535 = new Integer(987526407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49535;
        callMethod(klass, "setPlayKind", argTypes, term49483, args);
    }

};


