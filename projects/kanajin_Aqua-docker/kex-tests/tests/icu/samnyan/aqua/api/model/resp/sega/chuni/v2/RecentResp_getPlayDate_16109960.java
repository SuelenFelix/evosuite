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

public class RecentResp_getPlayDate_16109960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46185;

    public RecentResp_getPlayDate_16109960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46185 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46191 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46201 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46187, term46187.getClass(), "year", 2020);
        setShortField(term46187, term46187.getClass(), "month", (short) 5);
        setShortField(term46187, term46187.getClass(), "day", (short) 25);
        setField(term46186, term46186.getClass(), "date", term46187);
        setByteField(term46191, term46191.getClass(), "hour", (byte) 4);
        setByteField(term46191, term46191.getClass(), "minute", (byte) 20);
        setByteField(term46191, term46191.getClass(), "second", (byte) 39);
        setIntField(term46191, term46191.getClass(), "nano", 382102366);
        setField(term46186, term46186.getClass(), "time", term46191);
        setField(term46185, term46185.getClass(), "playDate", term46186);
        setIntField(term46197, term46197.getClass(), "year", 2023);
        setShortField(term46197, term46197.getClass(), "month", (short) 3);
        setShortField(term46197, term46197.getClass(), "day", (short) 4);
        setField(term46196, term46196.getClass(), "date", term46197);
        setByteField(term46201, term46201.getClass(), "hour", (byte) 20);
        setByteField(term46201, term46201.getClass(), "minute", (byte) 17);
        setByteField(term46201, term46201.getClass(), "second", (byte) 33);
        setIntField(term46201, term46201.getClass(), "nano", 193707533);
        setField(term46196, term46196.getClass(), "time", term46201);
        setField(term46185, term46185.getClass(), "userPlayDate", term46196);
        setIntField(term46185, term46185.getClass(), "musicId", -1683274691);
        setIntField(term46185, term46185.getClass(), "level", -935900044);
        setIntField(term46185, term46185.getClass(), "customId", 1747876558);
        setIntField(term46185, term46185.getClass(), "playedCustom1", 833477776);
        setIntField(term46185, term46185.getClass(), "playedCustom2", 2043960707);
        setIntField(term46185, term46185.getClass(), "playedCustom3", 272179554);
        setIntField(term46185, term46185.getClass(), "track", 1717711536);
        setIntField(term46185, term46185.getClass(), "score", -606339607);
        setIntField(term46185, term46185.getClass(), "rank", 800440712);
        setIntField(term46185, term46185.getClass(), "maxCombo", -1976407622);
        setIntField(term46185, term46185.getClass(), "maxChain", -552996061);
        setIntField(term46185, term46185.getClass(), "rateTap", -153013117);
        setIntField(term46185, term46185.getClass(), "rateHold", 712181359);
        setIntField(term46185, term46185.getClass(), "rateSlide", -1943255435);
        setIntField(term46185, term46185.getClass(), "rateAir", 868436312);
        setIntField(term46185, term46185.getClass(), "rateFlick", 1737963071);
        setIntField(term46185, term46185.getClass(), "judgeGuilty", 6456997);
        setIntField(term46185, term46185.getClass(), "judgeAttack", -797269627);
        setIntField(term46185, term46185.getClass(), "judgeJustice", -224331928);
        setIntField(term46185, term46185.getClass(), "judgeCritical", -587857163);
        setIntField(term46185, term46185.getClass(), "playerRating", -2018093075);
        setBooleanField(term46185, term46185.getClass(), "isNewRecord", false);
        setBooleanField(term46185, term46185.getClass(), "isFullCombo", true);
        setIntField(term46185, term46185.getClass(), "fullChainKind", 135879009);
        setBooleanField(term46185, term46185.getClass(), "isAllJustice", true);
        setIntField(term46185, term46185.getClass(), "characterId", 1923027847);
        setIntField(term46185, term46185.getClass(), "skillId", -1652693609);
        setIntField(term46185, term46185.getClass(), "playKind", -824893512);
        setBooleanField(term46185, term46185.getClass(), "isClear", false);
        setIntField(term46185, term46185.getClass(), "skillLevel", -55435071);
        setIntField(term46185, term46185.getClass(), "skillEffect", -673356166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayDate", argTypes, term46185, args);
    }

};


