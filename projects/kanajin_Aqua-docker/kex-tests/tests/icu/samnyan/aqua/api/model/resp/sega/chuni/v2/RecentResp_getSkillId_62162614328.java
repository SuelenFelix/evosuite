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

public class RecentResp_getSkillId_62162614328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47641;

    public RecentResp_getSkillId_62162614328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47641 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47647 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47657 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47643, term47643.getClass(), "year", 2023);
        setShortField(term47643, term47643.getClass(), "month", (short) 3);
        setShortField(term47643, term47643.getClass(), "day", (short) 9);
        setField(term47642, term47642.getClass(), "date", term47643);
        setByteField(term47647, term47647.getClass(), "hour", (byte) 0);
        setByteField(term47647, term47647.getClass(), "minute", (byte) 39);
        setByteField(term47647, term47647.getClass(), "second", (byte) 8);
        setIntField(term47647, term47647.getClass(), "nano", 231503726);
        setField(term47642, term47642.getClass(), "time", term47647);
        setField(term47641, term47641.getClass(), "playDate", term47642);
        setIntField(term47653, term47653.getClass(), "year", 2018);
        setShortField(term47653, term47653.getClass(), "month", (short) 4);
        setShortField(term47653, term47653.getClass(), "day", (short) 18);
        setField(term47652, term47652.getClass(), "date", term47653);
        setByteField(term47657, term47657.getClass(), "hour", (byte) 12);
        setByteField(term47657, term47657.getClass(), "minute", (byte) 26);
        setByteField(term47657, term47657.getClass(), "second", (byte) 54);
        setIntField(term47657, term47657.getClass(), "nano", 499786988);
        setField(term47652, term47652.getClass(), "time", term47657);
        setField(term47641, term47641.getClass(), "userPlayDate", term47652);
        setIntField(term47641, term47641.getClass(), "musicId", 1560132742);
        setIntField(term47641, term47641.getClass(), "level", -1289646730);
        setIntField(term47641, term47641.getClass(), "customId", 983651082);
        setIntField(term47641, term47641.getClass(), "playedCustom1", 794411004);
        setIntField(term47641, term47641.getClass(), "playedCustom2", 1964107266);
        setIntField(term47641, term47641.getClass(), "playedCustom3", -256542569);
        setIntField(term47641, term47641.getClass(), "track", -1936597357);
        setIntField(term47641, term47641.getClass(), "score", -179816637);
        setIntField(term47641, term47641.getClass(), "rank", -1304594615);
        setIntField(term47641, term47641.getClass(), "maxCombo", 1384334359);
        setIntField(term47641, term47641.getClass(), "maxChain", -552245510);
        setIntField(term47641, term47641.getClass(), "rateTap", 1590263959);
        setIntField(term47641, term47641.getClass(), "rateHold", -203971814);
        setIntField(term47641, term47641.getClass(), "rateSlide", -786856127);
        setIntField(term47641, term47641.getClass(), "rateAir", 891987554);
        setIntField(term47641, term47641.getClass(), "rateFlick", 407640701);
        setIntField(term47641, term47641.getClass(), "judgeGuilty", -55858757);
        setIntField(term47641, term47641.getClass(), "judgeAttack", 1101065297);
        setIntField(term47641, term47641.getClass(), "judgeJustice", -110542660);
        setIntField(term47641, term47641.getClass(), "judgeCritical", 1430629000);
        setIntField(term47641, term47641.getClass(), "playerRating", -1684627375);
        setBooleanField(term47641, term47641.getClass(), "isNewRecord", false);
        setBooleanField(term47641, term47641.getClass(), "isFullCombo", true);
        setIntField(term47641, term47641.getClass(), "fullChainKind", -74479819);
        setBooleanField(term47641, term47641.getClass(), "isAllJustice", true);
        setIntField(term47641, term47641.getClass(), "characterId", -1610494666);
        setIntField(term47641, term47641.getClass(), "skillId", 564476854);
        setIntField(term47641, term47641.getClass(), "playKind", 963238257);
        setBooleanField(term47641, term47641.getClass(), "isClear", false);
        setIntField(term47641, term47641.getClass(), "skillLevel", 1819563159);
        setIntField(term47641, term47641.getClass(), "skillEffect", -131038479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term47641, args);
    }

};


