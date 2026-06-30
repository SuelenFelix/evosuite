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

public class RecentResp_getLevel_14962233353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46341;

    public RecentResp_getLevel_14962233353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46341 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46347 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46352 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46353 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46357 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46343, term46343.getClass(), "year", 2021);
        setShortField(term46343, term46343.getClass(), "month", (short) 9);
        setShortField(term46343, term46343.getClass(), "day", (short) 7);
        setField(term46342, term46342.getClass(), "date", term46343);
        setByteField(term46347, term46347.getClass(), "hour", (byte) 16);
        setByteField(term46347, term46347.getClass(), "minute", (byte) 9);
        setByteField(term46347, term46347.getClass(), "second", (byte) 0);
        setIntField(term46347, term46347.getClass(), "nano", 530894568);
        setField(term46342, term46342.getClass(), "time", term46347);
        setField(term46341, term46341.getClass(), "playDate", term46342);
        setIntField(term46353, term46353.getClass(), "year", 2016);
        setShortField(term46353, term46353.getClass(), "month", (short) 8);
        setShortField(term46353, term46353.getClass(), "day", (short) 27);
        setField(term46352, term46352.getClass(), "date", term46353);
        setByteField(term46357, term46357.getClass(), "hour", (byte) 3);
        setByteField(term46357, term46357.getClass(), "minute", (byte) 10);
        setByteField(term46357, term46357.getClass(), "second", (byte) 27);
        setIntField(term46357, term46357.getClass(), "nano", 429898470);
        setField(term46352, term46352.getClass(), "time", term46357);
        setField(term46341, term46341.getClass(), "userPlayDate", term46352);
        setIntField(term46341, term46341.getClass(), "musicId", -1570350431);
        setIntField(term46341, term46341.getClass(), "level", -1378803474);
        setIntField(term46341, term46341.getClass(), "customId", 699225584);
        setIntField(term46341, term46341.getClass(), "playedCustom1", -577432675);
        setIntField(term46341, term46341.getClass(), "playedCustom2", -953072528);
        setIntField(term46341, term46341.getClass(), "playedCustom3", 2011046892);
        setIntField(term46341, term46341.getClass(), "track", 466007219);
        setIntField(term46341, term46341.getClass(), "score", -2142979104);
        setIntField(term46341, term46341.getClass(), "rank", -1983330479);
        setIntField(term46341, term46341.getClass(), "maxCombo", 1929952462);
        setIntField(term46341, term46341.getClass(), "maxChain", 701114540);
        setIntField(term46341, term46341.getClass(), "rateTap", -1284079635);
        setIntField(term46341, term46341.getClass(), "rateHold", -2130090775);
        setIntField(term46341, term46341.getClass(), "rateSlide", -1455026066);
        setIntField(term46341, term46341.getClass(), "rateAir", -169160528);
        setIntField(term46341, term46341.getClass(), "rateFlick", 951748736);
        setIntField(term46341, term46341.getClass(), "judgeGuilty", 787260842);
        setIntField(term46341, term46341.getClass(), "judgeAttack", -137516512);
        setIntField(term46341, term46341.getClass(), "judgeJustice", -585134115);
        setIntField(term46341, term46341.getClass(), "judgeCritical", 1435872700);
        setIntField(term46341, term46341.getClass(), "playerRating", 1421496660);
        setBooleanField(term46341, term46341.getClass(), "isNewRecord", false);
        setBooleanField(term46341, term46341.getClass(), "isFullCombo", false);
        setIntField(term46341, term46341.getClass(), "fullChainKind", -1299897376);
        setBooleanField(term46341, term46341.getClass(), "isAllJustice", true);
        setIntField(term46341, term46341.getClass(), "characterId", 1829266361);
        setIntField(term46341, term46341.getClass(), "skillId", -1296335739);
        setIntField(term46341, term46341.getClass(), "playKind", -520737857);
        setBooleanField(term46341, term46341.getClass(), "isClear", true);
        setIntField(term46341, term46341.getClass(), "skillLevel", -2038325814);
        setIntField(term46341, term46341.getClass(), "skillEffect", -581928806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term46341, args);
    }

};


