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

public class RecentResp_getPlayedCustom3_4055403807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46549;

    public RecentResp_getPlayedCustom3_4055403807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46549 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46555 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46565 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46551, term46551.getClass(), "year", 2019);
        setShortField(term46551, term46551.getClass(), "month", (short) 11);
        setShortField(term46551, term46551.getClass(), "day", (short) 1);
        setField(term46550, term46550.getClass(), "date", term46551);
        setByteField(term46555, term46555.getClass(), "hour", (byte) 23);
        setByteField(term46555, term46555.getClass(), "minute", (byte) 29);
        setByteField(term46555, term46555.getClass(), "second", (byte) 31);
        setIntField(term46555, term46555.getClass(), "nano", 58449597);
        setField(term46550, term46550.getClass(), "time", term46555);
        setField(term46549, term46549.getClass(), "playDate", term46550);
        setIntField(term46561, term46561.getClass(), "year", 2025);
        setShortField(term46561, term46561.getClass(), "month", (short) 2);
        setShortField(term46561, term46561.getClass(), "day", (short) 4);
        setField(term46560, term46560.getClass(), "date", term46561);
        setByteField(term46565, term46565.getClass(), "hour", (byte) 1);
        setByteField(term46565, term46565.getClass(), "minute", (byte) 30);
        setByteField(term46565, term46565.getClass(), "second", (byte) 28);
        setIntField(term46565, term46565.getClass(), "nano", 555720830);
        setField(term46560, term46560.getClass(), "time", term46565);
        setField(term46549, term46549.getClass(), "userPlayDate", term46560);
        setIntField(term46549, term46549.getClass(), "musicId", -1867124507);
        setIntField(term46549, term46549.getClass(), "level", 416116291);
        setIntField(term46549, term46549.getClass(), "customId", 1104795023);
        setIntField(term46549, term46549.getClass(), "playedCustom1", -1833777337);
        setIntField(term46549, term46549.getClass(), "playedCustom2", -2068333492);
        setIntField(term46549, term46549.getClass(), "playedCustom3", 1892862475);
        setIntField(term46549, term46549.getClass(), "track", -807914927);
        setIntField(term46549, term46549.getClass(), "score", -313873930);
        setIntField(term46549, term46549.getClass(), "rank", -1064231188);
        setIntField(term46549, term46549.getClass(), "maxCombo", 1631564781);
        setIntField(term46549, term46549.getClass(), "maxChain", -3085808);
        setIntField(term46549, term46549.getClass(), "rateTap", 1975783377);
        setIntField(term46549, term46549.getClass(), "rateHold", -665938382);
        setIntField(term46549, term46549.getClass(), "rateSlide", 325391588);
        setIntField(term46549, term46549.getClass(), "rateAir", 1443046313);
        setIntField(term46549, term46549.getClass(), "rateFlick", 1055117337);
        setIntField(term46549, term46549.getClass(), "judgeGuilty", -705616896);
        setIntField(term46549, term46549.getClass(), "judgeAttack", 1057965724);
        setIntField(term46549, term46549.getClass(), "judgeJustice", 2134707657);
        setIntField(term46549, term46549.getClass(), "judgeCritical", -357630956);
        setIntField(term46549, term46549.getClass(), "playerRating", -1068878345);
        setBooleanField(term46549, term46549.getClass(), "isNewRecord", true);
        setBooleanField(term46549, term46549.getClass(), "isFullCombo", true);
        setIntField(term46549, term46549.getClass(), "fullChainKind", 1386128235);
        setBooleanField(term46549, term46549.getClass(), "isAllJustice", true);
        setIntField(term46549, term46549.getClass(), "characterId", -1047109164);
        setIntField(term46549, term46549.getClass(), "skillId", -1650626012);
        setIntField(term46549, term46549.getClass(), "playKind", -2045231879);
        setBooleanField(term46549, term46549.getClass(), "isClear", false);
        setIntField(term46549, term46549.getClass(), "skillLevel", 1678025090);
        setIntField(term46549, term46549.getClass(), "skillEffect", 714453255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedCustom3", argTypes, term46549, args);
    }

};


