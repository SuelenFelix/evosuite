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

public class RecentResp_getJudgeCritical_5839989321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47277;

    public RecentResp_getJudgeCritical_5839989321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47277 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47283 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47293 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47279, term47279.getClass(), "year", 2026);
        setShortField(term47279, term47279.getClass(), "month", (short) 4);
        setShortField(term47279, term47279.getClass(), "day", (short) 10);
        setField(term47278, term47278.getClass(), "date", term47279);
        setByteField(term47283, term47283.getClass(), "hour", (byte) 3);
        setByteField(term47283, term47283.getClass(), "minute", (byte) 39);
        setByteField(term47283, term47283.getClass(), "second", (byte) 42);
        setIntField(term47283, term47283.getClass(), "nano", 840728841);
        setField(term47278, term47278.getClass(), "time", term47283);
        setField(term47277, term47277.getClass(), "playDate", term47278);
        setIntField(term47289, term47289.getClass(), "year", 2029);
        setShortField(term47289, term47289.getClass(), "month", (short) 3);
        setShortField(term47289, term47289.getClass(), "day", (short) 7);
        setField(term47288, term47288.getClass(), "date", term47289);
        setByteField(term47293, term47293.getClass(), "hour", (byte) 11);
        setByteField(term47293, term47293.getClass(), "minute", (byte) 6);
        setByteField(term47293, term47293.getClass(), "second", (byte) 29);
        setIntField(term47293, term47293.getClass(), "nano", 899404417);
        setField(term47288, term47288.getClass(), "time", term47293);
        setField(term47277, term47277.getClass(), "userPlayDate", term47288);
        setIntField(term47277, term47277.getClass(), "musicId", 2130019201);
        setIntField(term47277, term47277.getClass(), "level", 504634766);
        setIntField(term47277, term47277.getClass(), "customId", 1963462917);
        setIntField(term47277, term47277.getClass(), "playedCustom1", 552203554);
        setIntField(term47277, term47277.getClass(), "playedCustom2", 1645215896);
        setIntField(term47277, term47277.getClass(), "playedCustom3", -914100840);
        setIntField(term47277, term47277.getClass(), "track", 1806294616);
        setIntField(term47277, term47277.getClass(), "score", 1766086753);
        setIntField(term47277, term47277.getClass(), "rank", -1211119545);
        setIntField(term47277, term47277.getClass(), "maxCombo", 1584121590);
        setIntField(term47277, term47277.getClass(), "maxChain", 1133839602);
        setIntField(term47277, term47277.getClass(), "rateTap", -986002923);
        setIntField(term47277, term47277.getClass(), "rateHold", 724930183);
        setIntField(term47277, term47277.getClass(), "rateSlide", 1053680722);
        setIntField(term47277, term47277.getClass(), "rateAir", -1920949340);
        setIntField(term47277, term47277.getClass(), "rateFlick", 1211730228);
        setIntField(term47277, term47277.getClass(), "judgeGuilty", 892506528);
        setIntField(term47277, term47277.getClass(), "judgeAttack", -1203169418);
        setIntField(term47277, term47277.getClass(), "judgeJustice", -938772433);
        setIntField(term47277, term47277.getClass(), "judgeCritical", 46527533);
        setIntField(term47277, term47277.getClass(), "playerRating", 1199950979);
        setBooleanField(term47277, term47277.getClass(), "isNewRecord", false);
        setBooleanField(term47277, term47277.getClass(), "isFullCombo", false);
        setIntField(term47277, term47277.getClass(), "fullChainKind", 733812186);
        setBooleanField(term47277, term47277.getClass(), "isAllJustice", true);
        setIntField(term47277, term47277.getClass(), "characterId", -840076719);
        setIntField(term47277, term47277.getClass(), "skillId", 2002762153);
        setIntField(term47277, term47277.getClass(), "playKind", -531666058);
        setBooleanField(term47277, term47277.getClass(), "isClear", true);
        setIntField(term47277, term47277.getClass(), "skillLevel", -1659995523);
        setIntField(term47277, term47277.getClass(), "skillEffect", -1384058110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeCritical", argTypes, term47277, args);
    }

};


