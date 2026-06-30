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

public class RecentResp_getCustomId_1876816194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46393;

    public RecentResp_getCustomId_1876816194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46393 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46409 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46395, term46395.getClass(), "year", 2027);
        setShortField(term46395, term46395.getClass(), "month", (short) 3);
        setShortField(term46395, term46395.getClass(), "day", (short) 20);
        setField(term46394, term46394.getClass(), "date", term46395);
        setByteField(term46399, term46399.getClass(), "hour", (byte) 9);
        setByteField(term46399, term46399.getClass(), "minute", (byte) 34);
        setByteField(term46399, term46399.getClass(), "second", (byte) 31);
        setIntField(term46399, term46399.getClass(), "nano", 746182707);
        setField(term46394, term46394.getClass(), "time", term46399);
        setField(term46393, term46393.getClass(), "playDate", term46394);
        setIntField(term46405, term46405.getClass(), "year", 2018);
        setShortField(term46405, term46405.getClass(), "month", (short) 9);
        setShortField(term46405, term46405.getClass(), "day", (short) 11);
        setField(term46404, term46404.getClass(), "date", term46405);
        setByteField(term46409, term46409.getClass(), "hour", (byte) 18);
        setByteField(term46409, term46409.getClass(), "minute", (byte) 44);
        setByteField(term46409, term46409.getClass(), "second", (byte) 42);
        setIntField(term46409, term46409.getClass(), "nano", 303163100);
        setField(term46404, term46404.getClass(), "time", term46409);
        setField(term46393, term46393.getClass(), "userPlayDate", term46404);
        setIntField(term46393, term46393.getClass(), "musicId", -1387086578);
        setIntField(term46393, term46393.getClass(), "level", -2098841130);
        setIntField(term46393, term46393.getClass(), "customId", 65321166);
        setIntField(term46393, term46393.getClass(), "playedCustom1", -2114805689);
        setIntField(term46393, term46393.getClass(), "playedCustom2", 400772784);
        setIntField(term46393, term46393.getClass(), "playedCustom3", 46781158);
        setIntField(term46393, term46393.getClass(), "track", -1987966813);
        setIntField(term46393, term46393.getClass(), "score", 1778126559);
        setIntField(term46393, term46393.getClass(), "rank", -1557828355);
        setIntField(term46393, term46393.getClass(), "maxCombo", 546963992);
        setIntField(term46393, term46393.getClass(), "maxChain", 1377120507);
        setIntField(term46393, term46393.getClass(), "rateTap", -1581022727);
        setIntField(term46393, term46393.getClass(), "rateHold", -371740139);
        setIntField(term46393, term46393.getClass(), "rateSlide", -508560324);
        setIntField(term46393, term46393.getClass(), "rateAir", -1700781575);
        setIntField(term46393, term46393.getClass(), "rateFlick", -2042022388);
        setIntField(term46393, term46393.getClass(), "judgeGuilty", 390228535);
        setIntField(term46393, term46393.getClass(), "judgeAttack", -667505209);
        setIntField(term46393, term46393.getClass(), "judgeJustice", 1997285343);
        setIntField(term46393, term46393.getClass(), "judgeCritical", -1814671855);
        setIntField(term46393, term46393.getClass(), "playerRating", -614200166);
        setBooleanField(term46393, term46393.getClass(), "isNewRecord", true);
        setBooleanField(term46393, term46393.getClass(), "isFullCombo", true);
        setIntField(term46393, term46393.getClass(), "fullChainKind", 1243129119);
        setBooleanField(term46393, term46393.getClass(), "isAllJustice", false);
        setIntField(term46393, term46393.getClass(), "characterId", 346014220);
        setIntField(term46393, term46393.getClass(), "skillId", 1379438950);
        setIntField(term46393, term46393.getClass(), "playKind", 1932258686);
        setBooleanField(term46393, term46393.getClass(), "isClear", false);
        setIntField(term46393, term46393.getClass(), "skillLevel", -261366507);
        setIntField(term46393, term46393.getClass(), "skillEffect", 1015444772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomId", argTypes, term46393, args);
    }

};


