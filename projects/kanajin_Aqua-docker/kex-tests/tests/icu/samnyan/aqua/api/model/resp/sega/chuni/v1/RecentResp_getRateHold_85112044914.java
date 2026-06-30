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

public class RecentResp_getRateHold_85112044914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52083;

    public RecentResp_getRateHold_85112044914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52083 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52084 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52085 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52089 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52099 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52085, term52085.getClass(), "year", 2013);
        setShortField(term52085, term52085.getClass(), "month", (short) 12);
        setShortField(term52085, term52085.getClass(), "day", (short) 7);
        setField(term52084, term52084.getClass(), "date", term52085);
        setByteField(term52089, term52089.getClass(), "hour", (byte) 15);
        setByteField(term52089, term52089.getClass(), "minute", (byte) 56);
        setByteField(term52089, term52089.getClass(), "second", (byte) 2);
        setIntField(term52089, term52089.getClass(), "nano", 550722676);
        setField(term52084, term52084.getClass(), "time", term52089);
        setField(term52083, term52083.getClass(), "playDate", term52084);
        setIntField(term52095, term52095.getClass(), "year", 2014);
        setShortField(term52095, term52095.getClass(), "month", (short) 7);
        setShortField(term52095, term52095.getClass(), "day", (short) 18);
        setField(term52094, term52094.getClass(), "date", term52095);
        setByteField(term52099, term52099.getClass(), "hour", (byte) 19);
        setByteField(term52099, term52099.getClass(), "minute", (byte) 34);
        setByteField(term52099, term52099.getClass(), "second", (byte) 55);
        setIntField(term52099, term52099.getClass(), "nano", 945082868);
        setField(term52094, term52094.getClass(), "time", term52099);
        setField(term52083, term52083.getClass(), "userPlayDate", term52094);
        setIntField(term52083, term52083.getClass(), "musicId", -1605443550);
        setIntField(term52083, term52083.getClass(), "level", -735690372);
        setIntField(term52083, term52083.getClass(), "customId", 110644904);
        setIntField(term52083, term52083.getClass(), "playedCustom1", -1457905205);
        setIntField(term52083, term52083.getClass(), "playedCustom2", 1722454323);
        setIntField(term52083, term52083.getClass(), "playedCustom3", 630174216);
        setIntField(term52083, term52083.getClass(), "track", -1081282297);
        setIntField(term52083, term52083.getClass(), "score", 1331103887);
        setIntField(term52083, term52083.getClass(), "rank", 637911543);
        setIntField(term52083, term52083.getClass(), "maxCombo", -779100899);
        setIntField(term52083, term52083.getClass(), "maxChain", -1750603840);
        setIntField(term52083, term52083.getClass(), "rateTap", 2088919651);
        setIntField(term52083, term52083.getClass(), "rateHold", 949997254);
        setIntField(term52083, term52083.getClass(), "rateSlide", 690762493);
        setIntField(term52083, term52083.getClass(), "rateAir", -1050083704);
        setIntField(term52083, term52083.getClass(), "rateFlick", -1513402749);
        setIntField(term52083, term52083.getClass(), "judgeGuilty", -1865692837);
        setIntField(term52083, term52083.getClass(), "judgeAttack", 966678407);
        setIntField(term52083, term52083.getClass(), "judgeJustice", -881632231);
        setIntField(term52083, term52083.getClass(), "judgeCritical", -1285148224);
        setIntField(term52083, term52083.getClass(), "playerRating", -2002558482);
        setBooleanField(term52083, term52083.getClass(), "isNewRecord", false);
        setBooleanField(term52083, term52083.getClass(), "isFullCombo", true);
        setIntField(term52083, term52083.getClass(), "fullChainKind", 794384312);
        setBooleanField(term52083, term52083.getClass(), "isAllJustice", false);
        setIntField(term52083, term52083.getClass(), "characterId", 1166664554);
        setIntField(term52083, term52083.getClass(), "skillId", -1287204441);
        setIntField(term52083, term52083.getClass(), "playKind", 1826016641);
        setBooleanField(term52083, term52083.getClass(), "isClear", false);
        setIntField(term52083, term52083.getClass(), "skillLevel", 1726886771);
        setIntField(term52083, term52083.getClass(), "skillEffect", 1045689376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateHold", argTypes, term52083, args);
    }

};


