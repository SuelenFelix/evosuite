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

public class RecentResp_getPlayedCustom3_1121373737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51719;

    public RecentResp_getPlayedCustom3_1121373737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51719 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51725 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51730 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51731 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51735 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51721, term51721.getClass(), "year", 2012);
        setShortField(term51721, term51721.getClass(), "month", (short) 5);
        setShortField(term51721, term51721.getClass(), "day", (short) 9);
        setField(term51720, term51720.getClass(), "date", term51721);
        setByteField(term51725, term51725.getClass(), "hour", (byte) 4);
        setByteField(term51725, term51725.getClass(), "minute", (byte) 24);
        setByteField(term51725, term51725.getClass(), "second", (byte) 51);
        setIntField(term51725, term51725.getClass(), "nano", 768693356);
        setField(term51720, term51720.getClass(), "time", term51725);
        setField(term51719, term51719.getClass(), "playDate", term51720);
        setIntField(term51731, term51731.getClass(), "year", 2026);
        setShortField(term51731, term51731.getClass(), "month", (short) 3);
        setShortField(term51731, term51731.getClass(), "day", (short) 10);
        setField(term51730, term51730.getClass(), "date", term51731);
        setByteField(term51735, term51735.getClass(), "hour", (byte) 20);
        setByteField(term51735, term51735.getClass(), "minute", (byte) 16);
        setByteField(term51735, term51735.getClass(), "second", (byte) 6);
        setIntField(term51735, term51735.getClass(), "nano", 559277183);
        setField(term51730, term51730.getClass(), "time", term51735);
        setField(term51719, term51719.getClass(), "userPlayDate", term51730);
        setIntField(term51719, term51719.getClass(), "musicId", -1827662352);
        setIntField(term51719, term51719.getClass(), "level", -1292290537);
        setIntField(term51719, term51719.getClass(), "customId", 1060963259);
        setIntField(term51719, term51719.getClass(), "playedCustom1", -1275604693);
        setIntField(term51719, term51719.getClass(), "playedCustom2", 455869012);
        setIntField(term51719, term51719.getClass(), "playedCustom3", 782841747);
        setIntField(term51719, term51719.getClass(), "track", 744634969);
        setIntField(term51719, term51719.getClass(), "score", -13561953);
        setIntField(term51719, term51719.getClass(), "rank", 2069622671);
        setIntField(term51719, term51719.getClass(), "maxCombo", 86341231);
        setIntField(term51719, term51719.getClass(), "maxChain", -926119173);
        setIntField(term51719, term51719.getClass(), "rateTap", 1613936898);
        setIntField(term51719, term51719.getClass(), "rateHold", -406599151);
        setIntField(term51719, term51719.getClass(), "rateSlide", -1421272179);
        setIntField(term51719, term51719.getClass(), "rateAir", -2019439660);
        setIntField(term51719, term51719.getClass(), "rateFlick", 1037621714);
        setIntField(term51719, term51719.getClass(), "judgeGuilty", 1072685856);
        setIntField(term51719, term51719.getClass(), "judgeAttack", 1560132742);
        setIntField(term51719, term51719.getClass(), "judgeJustice", -1289646730);
        setIntField(term51719, term51719.getClass(), "judgeCritical", 983651082);
        setIntField(term51719, term51719.getClass(), "playerRating", 794411004);
        setBooleanField(term51719, term51719.getClass(), "isNewRecord", true);
        setBooleanField(term51719, term51719.getClass(), "isFullCombo", true);
        setIntField(term51719, term51719.getClass(), "fullChainKind", 1964107266);
        setBooleanField(term51719, term51719.getClass(), "isAllJustice", true);
        setIntField(term51719, term51719.getClass(), "characterId", -256542569);
        setIntField(term51719, term51719.getClass(), "skillId", -1936597357);
        setIntField(term51719, term51719.getClass(), "playKind", -179816637);
        setBooleanField(term51719, term51719.getClass(), "isClear", false);
        setIntField(term51719, term51719.getClass(), "skillLevel", -1304594615);
        setIntField(term51719, term51719.getClass(), "skillEffect", 1384334359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedCustom3", argTypes, term51719, args);
    }

};


