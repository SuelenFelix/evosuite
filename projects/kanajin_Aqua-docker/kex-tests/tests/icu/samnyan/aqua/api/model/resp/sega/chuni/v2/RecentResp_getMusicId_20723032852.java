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

public class RecentResp_getMusicId_20723032852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46289;

    public RecentResp_getMusicId_20723032852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46289 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46295 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46305 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46291, term46291.getClass(), "year", 2011);
        setShortField(term46291, term46291.getClass(), "month", (short) 1);
        setShortField(term46291, term46291.getClass(), "day", (short) 7);
        setField(term46290, term46290.getClass(), "date", term46291);
        setByteField(term46295, term46295.getClass(), "hour", (byte) 10);
        setByteField(term46295, term46295.getClass(), "minute", (byte) 6);
        setByteField(term46295, term46295.getClass(), "second", (byte) 28);
        setIntField(term46295, term46295.getClass(), "nano", 669533698);
        setField(term46290, term46290.getClass(), "time", term46295);
        setField(term46289, term46289.getClass(), "playDate", term46290);
        setIntField(term46301, term46301.getClass(), "year", 2016);
        setShortField(term46301, term46301.getClass(), "month", (short) 11);
        setShortField(term46301, term46301.getClass(), "day", (short) 15);
        setField(term46300, term46300.getClass(), "date", term46301);
        setByteField(term46305, term46305.getClass(), "hour", (byte) 14);
        setByteField(term46305, term46305.getClass(), "minute", (byte) 34);
        setByteField(term46305, term46305.getClass(), "second", (byte) 23);
        setIntField(term46305, term46305.getClass(), "nano", 287070581);
        setField(term46300, term46300.getClass(), "time", term46305);
        setField(term46289, term46289.getClass(), "userPlayDate", term46300);
        setIntField(term46289, term46289.getClass(), "musicId", 783684648);
        setIntField(term46289, term46289.getClass(), "level", 553754005);
        setIntField(term46289, term46289.getClass(), "customId", 1986699236);
        setIntField(term46289, term46289.getClass(), "playedCustom1", -1729178560);
        setIntField(term46289, term46289.getClass(), "playedCustom2", 874974171);
        setIntField(term46289, term46289.getClass(), "playedCustom3", -1689017763);
        setIntField(term46289, term46289.getClass(), "track", 1657387281);
        setIntField(term46289, term46289.getClass(), "score", 1276651382);
        setIntField(term46289, term46289.getClass(), "rank", 266716659);
        setIntField(term46289, term46289.getClass(), "maxCombo", 1249390809);
        setIntField(term46289, term46289.getClass(), "maxChain", -1069437097);
        setIntField(term46289, term46289.getClass(), "rateTap", 215016257);
        setIntField(term46289, term46289.getClass(), "rateHold", -1967315273);
        setIntField(term46289, term46289.getClass(), "rateSlide", -1848110874);
        setIntField(term46289, term46289.getClass(), "rateAir", -1988070462);
        setIntField(term46289, term46289.getClass(), "rateFlick", 323423569);
        setIntField(term46289, term46289.getClass(), "judgeGuilty", -274269573);
        setIntField(term46289, term46289.getClass(), "judgeAttack", 1395520168);
        setIntField(term46289, term46289.getClass(), "judgeJustice", -524708742);
        setIntField(term46289, term46289.getClass(), "judgeCritical", -349448118);
        setIntField(term46289, term46289.getClass(), "playerRating", 1938137872);
        setBooleanField(term46289, term46289.getClass(), "isNewRecord", true);
        setBooleanField(term46289, term46289.getClass(), "isFullCombo", true);
        setIntField(term46289, term46289.getClass(), "fullChainKind", 1767604467);
        setBooleanField(term46289, term46289.getClass(), "isAllJustice", false);
        setIntField(term46289, term46289.getClass(), "characterId", 1997859160);
        setIntField(term46289, term46289.getClass(), "skillId", 1565529799);
        setIntField(term46289, term46289.getClass(), "playKind", -1144608643);
        setBooleanField(term46289, term46289.getClass(), "isClear", false);
        setIntField(term46289, term46289.getClass(), "skillLevel", -2020428308);
        setIntField(term46289, term46289.getClass(), "skillEffect", -226298436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term46289, args);
    }

};


