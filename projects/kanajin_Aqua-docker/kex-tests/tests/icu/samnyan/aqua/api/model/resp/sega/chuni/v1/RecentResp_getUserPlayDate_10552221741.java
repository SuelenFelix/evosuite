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

public class RecentResp_getUserPlayDate_10552221741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51407;

    public RecentResp_getUserPlayDate_10552221741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51407 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51413 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51423 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51409, term51409.getClass(), "year", 2013);
        setShortField(term51409, term51409.getClass(), "month", (short) 5);
        setShortField(term51409, term51409.getClass(), "day", (short) 9);
        setField(term51408, term51408.getClass(), "date", term51409);
        setByteField(term51413, term51413.getClass(), "hour", (byte) 21);
        setByteField(term51413, term51413.getClass(), "minute", (byte) 29);
        setByteField(term51413, term51413.getClass(), "second", (byte) 31);
        setIntField(term51413, term51413.getClass(), "nano", 674914044);
        setField(term51408, term51408.getClass(), "time", term51413);
        setField(term51407, term51407.getClass(), "playDate", term51408);
        setIntField(term51419, term51419.getClass(), "year", 2029);
        setShortField(term51419, term51419.getClass(), "month", (short) 10);
        setShortField(term51419, term51419.getClass(), "day", (short) 7);
        setField(term51418, term51418.getClass(), "date", term51419);
        setByteField(term51423, term51423.getClass(), "hour", (byte) 8);
        setByteField(term51423, term51423.getClass(), "minute", (byte) 43);
        setByteField(term51423, term51423.getClass(), "second", (byte) 49);
        setIntField(term51423, term51423.getClass(), "nano", 733700043);
        setField(term51418, term51418.getClass(), "time", term51423);
        setField(term51407, term51407.getClass(), "userPlayDate", term51418);
        setIntField(term51407, term51407.getClass(), "musicId", 1133839602);
        setIntField(term51407, term51407.getClass(), "level", -986002923);
        setIntField(term51407, term51407.getClass(), "customId", 724930183);
        setIntField(term51407, term51407.getClass(), "playedCustom1", 1053680722);
        setIntField(term51407, term51407.getClass(), "playedCustom2", -1920949340);
        setIntField(term51407, term51407.getClass(), "playedCustom3", 1211730228);
        setIntField(term51407, term51407.getClass(), "track", 892506528);
        setIntField(term51407, term51407.getClass(), "score", -1203169418);
        setIntField(term51407, term51407.getClass(), "rank", -938772433);
        setIntField(term51407, term51407.getClass(), "maxCombo", 46527533);
        setIntField(term51407, term51407.getClass(), "maxChain", 1199950979);
        setIntField(term51407, term51407.getClass(), "rateTap", 733812186);
        setIntField(term51407, term51407.getClass(), "rateHold", -840076719);
        setIntField(term51407, term51407.getClass(), "rateSlide", 2002762153);
        setIntField(term51407, term51407.getClass(), "rateAir", -531666058);
        setIntField(term51407, term51407.getClass(), "rateFlick", -1659995523);
        setIntField(term51407, term51407.getClass(), "judgeGuilty", -1384058110);
        setIntField(term51407, term51407.getClass(), "judgeAttack", -109584269);
        setIntField(term51407, term51407.getClass(), "judgeJustice", -682334474);
        setIntField(term51407, term51407.getClass(), "judgeCritical", -666332937);
        setIntField(term51407, term51407.getClass(), "playerRating", 1661615099);
        setBooleanField(term51407, term51407.getClass(), "isNewRecord", false);
        setBooleanField(term51407, term51407.getClass(), "isFullCombo", true);
        setIntField(term51407, term51407.getClass(), "fullChainKind", 1908136627);
        setBooleanField(term51407, term51407.getClass(), "isAllJustice", false);
        setIntField(term51407, term51407.getClass(), "characterId", 824600792);
        setIntField(term51407, term51407.getClass(), "skillId", -1498923569);
        setIntField(term51407, term51407.getClass(), "playKind", 1082643319);
        setBooleanField(term51407, term51407.getClass(), "isClear", false);
        setIntField(term51407, term51407.getClass(), "skillLevel", -1138616222);
        setIntField(term51407, term51407.getClass(), "skillEffect", 285368240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlayDate", argTypes, term51407, args);
    }

};


