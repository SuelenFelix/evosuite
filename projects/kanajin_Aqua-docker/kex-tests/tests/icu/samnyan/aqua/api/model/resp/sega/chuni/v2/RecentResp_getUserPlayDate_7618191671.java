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

public class RecentResp_getUserPlayDate_7618191671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46237;

    public RecentResp_getUserPlayDate_7618191671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46237 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46243 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46248 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46249 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46253 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46239, term46239.getClass(), "year", 2018);
        setShortField(term46239, term46239.getClass(), "month", (short) 12);
        setShortField(term46239, term46239.getClass(), "day", (short) 9);
        setField(term46238, term46238.getClass(), "date", term46239);
        setByteField(term46243, term46243.getClass(), "hour", (byte) 11);
        setByteField(term46243, term46243.getClass(), "minute", (byte) 17);
        setByteField(term46243, term46243.getClass(), "second", (byte) 16);
        setIntField(term46243, term46243.getClass(), "nano", 832353222);
        setField(term46238, term46238.getClass(), "time", term46243);
        setField(term46237, term46237.getClass(), "playDate", term46238);
        setIntField(term46249, term46249.getClass(), "year", 2022);
        setShortField(term46249, term46249.getClass(), "month", (short) 10);
        setShortField(term46249, term46249.getClass(), "day", (short) 18);
        setField(term46248, term46248.getClass(), "date", term46249);
        setByteField(term46253, term46253.getClass(), "hour", (byte) 21);
        setByteField(term46253, term46253.getClass(), "minute", (byte) 51);
        setByteField(term46253, term46253.getClass(), "second", (byte) 0);
        setIntField(term46253, term46253.getClass(), "nano", 906699884);
        setField(term46248, term46248.getClass(), "time", term46253);
        setField(term46237, term46237.getClass(), "userPlayDate", term46248);
        setIntField(term46237, term46237.getClass(), "musicId", 1876812694);
        setIntField(term46237, term46237.getClass(), "level", 461068473);
        setIntField(term46237, term46237.getClass(), "customId", -1833298266);
        setIntField(term46237, term46237.getClass(), "playedCustom1", 746372422);
        setIntField(term46237, term46237.getClass(), "playedCustom2", 1921465988);
        setIntField(term46237, term46237.getClass(), "playedCustom3", -164438599);
        setIntField(term46237, term46237.getClass(), "track", -444441955);
        setIntField(term46237, term46237.getClass(), "score", -544005591);
        setIntField(term46237, term46237.getClass(), "rank", -1379603462);
        setIntField(term46237, term46237.getClass(), "maxCombo", -1304965721);
        setIntField(term46237, term46237.getClass(), "maxChain", 1661411651);
        setIntField(term46237, term46237.getClass(), "rateTap", 175517901);
        setIntField(term46237, term46237.getClass(), "rateHold", 335030203);
        setIntField(term46237, term46237.getClass(), "rateSlide", -474014477);
        setIntField(term46237, term46237.getClass(), "rateAir", 1610419467);
        setIntField(term46237, term46237.getClass(), "rateFlick", 1155135931);
        setIntField(term46237, term46237.getClass(), "judgeGuilty", -636910567);
        setIntField(term46237, term46237.getClass(), "judgeAttack", 1896114203);
        setIntField(term46237, term46237.getClass(), "judgeJustice", 1045745470);
        setIntField(term46237, term46237.getClass(), "judgeCritical", 892741901);
        setIntField(term46237, term46237.getClass(), "playerRating", -1724900201);
        setBooleanField(term46237, term46237.getClass(), "isNewRecord", false);
        setBooleanField(term46237, term46237.getClass(), "isFullCombo", true);
        setIntField(term46237, term46237.getClass(), "fullChainKind", -758523003);
        setBooleanField(term46237, term46237.getClass(), "isAllJustice", false);
        setIntField(term46237, term46237.getClass(), "characterId", 1567184195);
        setIntField(term46237, term46237.getClass(), "skillId", 63595623);
        setIntField(term46237, term46237.getClass(), "playKind", 1764150991);
        setBooleanField(term46237, term46237.getClass(), "isClear", false);
        setIntField(term46237, term46237.getClass(), "skillLevel", 944653455);
        setIntField(term46237, term46237.getClass(), "skillEffect", -1819474400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlayDate", argTypes, term46237, args);
    }

};


