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

public class RecentResp_getJudgeGuilty_57129897718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52291;

    public RecentResp_getJudgeGuilty_57129897718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52291 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52297 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52307 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52293, term52293.getClass(), "year", 2013);
        setShortField(term52293, term52293.getClass(), "month", (short) 5);
        setShortField(term52293, term52293.getClass(), "day", (short) 5);
        setField(term52292, term52292.getClass(), "date", term52293);
        setByteField(term52297, term52297.getClass(), "hour", (byte) 7);
        setByteField(term52297, term52297.getClass(), "minute", (byte) 44);
        setByteField(term52297, term52297.getClass(), "second", (byte) 24);
        setIntField(term52297, term52297.getClass(), "nano", 458681760);
        setField(term52292, term52292.getClass(), "time", term52297);
        setField(term52291, term52291.getClass(), "playDate", term52292);
        setIntField(term52303, term52303.getClass(), "year", 2019);
        setShortField(term52303, term52303.getClass(), "month", (short) 1);
        setShortField(term52303, term52303.getClass(), "day", (short) 12);
        setField(term52302, term52302.getClass(), "date", term52303);
        setByteField(term52307, term52307.getClass(), "hour", (byte) 5);
        setByteField(term52307, term52307.getClass(), "minute", (byte) 47);
        setByteField(term52307, term52307.getClass(), "second", (byte) 36);
        setIntField(term52307, term52307.getClass(), "nano", 50353124);
        setField(term52302, term52302.getClass(), "time", term52307);
        setField(term52291, term52291.getClass(), "userPlayDate", term52302);
        setIntField(term52291, term52291.getClass(), "musicId", 1378096239);
        setIntField(term52291, term52291.getClass(), "level", -1082231594);
        setIntField(term52291, term52291.getClass(), "customId", -1775141108);
        setIntField(term52291, term52291.getClass(), "playedCustom1", -606500993);
        setIntField(term52291, term52291.getClass(), "playedCustom2", 475994339);
        setIntField(term52291, term52291.getClass(), "playedCustom3", -460066219);
        setIntField(term52291, term52291.getClass(), "track", -1947540595);
        setIntField(term52291, term52291.getClass(), "score", -1198145043);
        setIntField(term52291, term52291.getClass(), "rank", -999740641);
        setIntField(term52291, term52291.getClass(), "maxCombo", -639247037);
        setIntField(term52291, term52291.getClass(), "maxChain", -110418958);
        setIntField(term52291, term52291.getClass(), "rateTap", 1131695499);
        setIntField(term52291, term52291.getClass(), "rateHold", -699693103);
        setIntField(term52291, term52291.getClass(), "rateSlide", -365179239);
        setIntField(term52291, term52291.getClass(), "rateAir", -1670737346);
        setIntField(term52291, term52291.getClass(), "rateFlick", -1150935030);
        setIntField(term52291, term52291.getClass(), "judgeGuilty", 78607598);
        setIntField(term52291, term52291.getClass(), "judgeAttack", -126292072);
        setIntField(term52291, term52291.getClass(), "judgeJustice", -1541809993);
        setIntField(term52291, term52291.getClass(), "judgeCritical", -1100665028);
        setIntField(term52291, term52291.getClass(), "playerRating", -1572533124);
        setBooleanField(term52291, term52291.getClass(), "isNewRecord", true);
        setBooleanField(term52291, term52291.getClass(), "isFullCombo", true);
        setIntField(term52291, term52291.getClass(), "fullChainKind", 1577766413);
        setBooleanField(term52291, term52291.getClass(), "isAllJustice", false);
        setIntField(term52291, term52291.getClass(), "characterId", -1615367460);
        setIntField(term52291, term52291.getClass(), "skillId", 1119103227);
        setIntField(term52291, term52291.getClass(), "playKind", 1061904558);
        setBooleanField(term52291, term52291.getClass(), "isClear", true);
        setIntField(term52291, term52291.getClass(), "skillLevel", -390418218);
        setIntField(term52291, term52291.getClass(), "skillEffect", 72302997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeGuilty", argTypes, term52291, args);
    }

};


