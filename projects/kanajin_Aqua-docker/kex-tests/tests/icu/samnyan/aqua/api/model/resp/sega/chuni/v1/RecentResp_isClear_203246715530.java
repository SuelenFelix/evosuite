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

public class RecentResp_isClear_203246715530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52915;

    public RecentResp_isClear_203246715530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52915 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52921 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52931 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52917, term52917.getClass(), "year", 2020);
        setShortField(term52917, term52917.getClass(), "month", (short) 8);
        setShortField(term52917, term52917.getClass(), "day", (short) 9);
        setField(term52916, term52916.getClass(), "date", term52917);
        setByteField(term52921, term52921.getClass(), "hour", (byte) 2);
        setByteField(term52921, term52921.getClass(), "minute", (byte) 25);
        setByteField(term52921, term52921.getClass(), "second", (byte) 38);
        setIntField(term52921, term52921.getClass(), "nano", 447739818);
        setField(term52916, term52916.getClass(), "time", term52921);
        setField(term52915, term52915.getClass(), "playDate", term52916);
        setIntField(term52927, term52927.getClass(), "year", 2026);
        setShortField(term52927, term52927.getClass(), "month", (short) 2);
        setShortField(term52927, term52927.getClass(), "day", (short) 28);
        setField(term52926, term52926.getClass(), "date", term52927);
        setByteField(term52931, term52931.getClass(), "hour", (byte) 19);
        setByteField(term52931, term52931.getClass(), "minute", (byte) 20);
        setByteField(term52931, term52931.getClass(), "second", (byte) 45);
        setIntField(term52931, term52931.getClass(), "nano", 843222042);
        setField(term52926, term52926.getClass(), "time", term52931);
        setField(term52915, term52915.getClass(), "userPlayDate", term52926);
        setIntField(term52915, term52915.getClass(), "musicId", 2145615477);
        setIntField(term52915, term52915.getClass(), "level", 1806729907);
        setIntField(term52915, term52915.getClass(), "customId", -182792320);
        setIntField(term52915, term52915.getClass(), "playedCustom1", 409164749);
        setIntField(term52915, term52915.getClass(), "playedCustom2", 896581942);
        setIntField(term52915, term52915.getClass(), "playedCustom3", 108670537);
        setIntField(term52915, term52915.getClass(), "track", -94326012);
        setIntField(term52915, term52915.getClass(), "score", -665192132);
        setIntField(term52915, term52915.getClass(), "rank", 720355914);
        setIntField(term52915, term52915.getClass(), "maxCombo", -775874930);
        setIntField(term52915, term52915.getClass(), "maxChain", 1404363846);
        setIntField(term52915, term52915.getClass(), "rateTap", -2081298107);
        setIntField(term52915, term52915.getClass(), "rateHold", -231030486);
        setIntField(term52915, term52915.getClass(), "rateSlide", 908016119);
        setIntField(term52915, term52915.getClass(), "rateAir", 110988463);
        setIntField(term52915, term52915.getClass(), "rateFlick", 955685902);
        setIntField(term52915, term52915.getClass(), "judgeGuilty", 462054815);
        setIntField(term52915, term52915.getClass(), "judgeAttack", 406100677);
        setIntField(term52915, term52915.getClass(), "judgeJustice", 778368290);
        setIntField(term52915, term52915.getClass(), "judgeCritical", 963185413);
        setIntField(term52915, term52915.getClass(), "playerRating", 1937434591);
        setBooleanField(term52915, term52915.getClass(), "isNewRecord", true);
        setBooleanField(term52915, term52915.getClass(), "isFullCombo", true);
        setIntField(term52915, term52915.getClass(), "fullChainKind", 759908235);
        setBooleanField(term52915, term52915.getClass(), "isAllJustice", false);
        setIntField(term52915, term52915.getClass(), "characterId", -1220035028);
        setIntField(term52915, term52915.getClass(), "skillId", 211574528);
        setIntField(term52915, term52915.getClass(), "playKind", 984819165);
        setBooleanField(term52915, term52915.getClass(), "isClear", true);
        setIntField(term52915, term52915.getClass(), "skillLevel", 1276438509);
        setIntField(term52915, term52915.getClass(), "skillEffect", -934156422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term52915, args);
    }

};


