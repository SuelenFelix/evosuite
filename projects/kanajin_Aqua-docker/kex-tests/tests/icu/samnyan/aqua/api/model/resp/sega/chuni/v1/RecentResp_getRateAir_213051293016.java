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

public class RecentResp_getRateAir_213051293016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52187;

    public RecentResp_getRateAir_213051293016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52187 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52203 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52189, term52189.getClass(), "year", 2013);
        setShortField(term52189, term52189.getClass(), "month", (short) 8);
        setShortField(term52189, term52189.getClass(), "day", (short) 30);
        setField(term52188, term52188.getClass(), "date", term52189);
        setByteField(term52193, term52193.getClass(), "hour", (byte) 23);
        setByteField(term52193, term52193.getClass(), "minute", (byte) 18);
        setByteField(term52193, term52193.getClass(), "second", (byte) 55);
        setIntField(term52193, term52193.getClass(), "nano", 174457563);
        setField(term52188, term52188.getClass(), "time", term52193);
        setField(term52187, term52187.getClass(), "playDate", term52188);
        setIntField(term52199, term52199.getClass(), "year", 2025);
        setShortField(term52199, term52199.getClass(), "month", (short) 12);
        setShortField(term52199, term52199.getClass(), "day", (short) 30);
        setField(term52198, term52198.getClass(), "date", term52199);
        setByteField(term52203, term52203.getClass(), "hour", (byte) 16);
        setByteField(term52203, term52203.getClass(), "minute", (byte) 48);
        setByteField(term52203, term52203.getClass(), "second", (byte) 54);
        setIntField(term52203, term52203.getClass(), "nano", 288599555);
        setField(term52198, term52198.getClass(), "time", term52203);
        setField(term52187, term52187.getClass(), "userPlayDate", term52198);
        setIntField(term52187, term52187.getClass(), "musicId", -2064677239);
        setIntField(term52187, term52187.getClass(), "level", 584068841);
        setIntField(term52187, term52187.getClass(), "customId", -289675978);
        setIntField(term52187, term52187.getClass(), "playedCustom1", 1466847406);
        setIntField(term52187, term52187.getClass(), "playedCustom2", 1943280473);
        setIntField(term52187, term52187.getClass(), "playedCustom3", 1068101842);
        setIntField(term52187, term52187.getClass(), "track", 1060522715);
        setIntField(term52187, term52187.getClass(), "score", -451590147);
        setIntField(term52187, term52187.getClass(), "rank", -537090894);
        setIntField(term52187, term52187.getClass(), "maxCombo", 105089682);
        setIntField(term52187, term52187.getClass(), "maxChain", 1304790955);
        setIntField(term52187, term52187.getClass(), "rateTap", -1412824084);
        setIntField(term52187, term52187.getClass(), "rateHold", 659034364);
        setIntField(term52187, term52187.getClass(), "rateSlide", 671129726);
        setIntField(term52187, term52187.getClass(), "rateAir", -1217066846);
        setIntField(term52187, term52187.getClass(), "rateFlick", 570145845);
        setIntField(term52187, term52187.getClass(), "judgeGuilty", 1990162126);
        setIntField(term52187, term52187.getClass(), "judgeAttack", 1728957652);
        setIntField(term52187, term52187.getClass(), "judgeJustice", -482056965);
        setIntField(term52187, term52187.getClass(), "judgeCritical", 1727638564);
        setIntField(term52187, term52187.getClass(), "playerRating", 1102029917);
        setBooleanField(term52187, term52187.getClass(), "isNewRecord", true);
        setBooleanField(term52187, term52187.getClass(), "isFullCombo", false);
        setIntField(term52187, term52187.getClass(), "fullChainKind", 506784803);
        setBooleanField(term52187, term52187.getClass(), "isAllJustice", false);
        setIntField(term52187, term52187.getClass(), "characterId", -1201816382);
        setIntField(term52187, term52187.getClass(), "skillId", 964841377);
        setIntField(term52187, term52187.getClass(), "playKind", -1503153618);
        setBooleanField(term52187, term52187.getClass(), "isClear", false);
        setIntField(term52187, term52187.getClass(), "skillLevel", -1417720854);
        setIntField(term52187, term52187.getClass(), "skillEffect", -231019352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateAir", argTypes, term52187, args);
    }

};


