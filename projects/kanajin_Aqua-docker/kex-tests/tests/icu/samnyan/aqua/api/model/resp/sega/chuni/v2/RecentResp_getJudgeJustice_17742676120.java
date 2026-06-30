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

public class RecentResp_getJudgeJustice_17742676120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47225;

    public RecentResp_getJudgeJustice_17742676120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47225 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47241 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47227, term47227.getClass(), "year", 2021);
        setShortField(term47227, term47227.getClass(), "month", (short) 5);
        setShortField(term47227, term47227.getClass(), "day", (short) 7);
        setField(term47226, term47226.getClass(), "date", term47227);
        setByteField(term47231, term47231.getClass(), "hour", (byte) 16);
        setByteField(term47231, term47231.getClass(), "minute", (byte) 55);
        setByteField(term47231, term47231.getClass(), "second", (byte) 11);
        setIntField(term47231, term47231.getClass(), "nano", 243196047);
        setField(term47226, term47226.getClass(), "time", term47231);
        setField(term47225, term47225.getClass(), "playDate", term47226);
        setIntField(term47237, term47237.getClass(), "year", 2023);
        setShortField(term47237, term47237.getClass(), "month", (short) 8);
        setShortField(term47237, term47237.getClass(), "day", (short) 23);
        setField(term47236, term47236.getClass(), "date", term47237);
        setByteField(term47241, term47241.getClass(), "hour", (byte) 12);
        setByteField(term47241, term47241.getClass(), "minute", (byte) 18);
        setByteField(term47241, term47241.getClass(), "second", (byte) 57);
        setIntField(term47241, term47241.getClass(), "nano", 764903264);
        setField(term47236, term47236.getClass(), "time", term47241);
        setField(term47225, term47225.getClass(), "userPlayDate", term47236);
        setIntField(term47225, term47225.getClass(), "musicId", -77932500);
        setIntField(term47225, term47225.getClass(), "level", -1558194793);
        setIntField(term47225, term47225.getClass(), "customId", -13354986);
        setIntField(term47225, term47225.getClass(), "playedCustom1", -2134459880);
        setIntField(term47225, term47225.getClass(), "playedCustom2", -1811405838);
        setIntField(term47225, term47225.getClass(), "playedCustom3", 619484749);
        setIntField(term47225, term47225.getClass(), "track", 490271003);
        setIntField(term47225, term47225.getClass(), "score", 1541867826);
        setIntField(term47225, term47225.getClass(), "rank", -137176190);
        setIntField(term47225, term47225.getClass(), "maxCombo", 348263044);
        setIntField(term47225, term47225.getClass(), "maxChain", 1394815305);
        setIntField(term47225, term47225.getClass(), "rateTap", -315070279);
        setIntField(term47225, term47225.getClass(), "rateHold", 62449386);
        setIntField(term47225, term47225.getClass(), "rateSlide", -1488558129);
        setIntField(term47225, term47225.getClass(), "rateAir", -929614389);
        setIntField(term47225, term47225.getClass(), "rateFlick", 1585326879);
        setIntField(term47225, term47225.getClass(), "judgeGuilty", 1161195592);
        setIntField(term47225, term47225.getClass(), "judgeAttack", -1012640616);
        setIntField(term47225, term47225.getClass(), "judgeJustice", -552664740);
        setIntField(term47225, term47225.getClass(), "judgeCritical", -1639838200);
        setIntField(term47225, term47225.getClass(), "playerRating", -60462175);
        setBooleanField(term47225, term47225.getClass(), "isNewRecord", true);
        setBooleanField(term47225, term47225.getClass(), "isFullCombo", true);
        setIntField(term47225, term47225.getClass(), "fullChainKind", 1315997028);
        setBooleanField(term47225, term47225.getClass(), "isAllJustice", true);
        setIntField(term47225, term47225.getClass(), "characterId", 1268210239);
        setIntField(term47225, term47225.getClass(), "skillId", -697986260);
        setIntField(term47225, term47225.getClass(), "playKind", -672315403);
        setBooleanField(term47225, term47225.getClass(), "isClear", false);
        setIntField(term47225, term47225.getClass(), "skillLevel", 507507290);
        setIntField(term47225, term47225.getClass(), "skillEffect", 9057138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeJustice", argTypes, term47225, args);
    }

};


