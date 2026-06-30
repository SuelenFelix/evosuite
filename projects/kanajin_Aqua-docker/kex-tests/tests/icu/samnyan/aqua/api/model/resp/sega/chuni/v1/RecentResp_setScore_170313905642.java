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
import java.lang.Integer;

public class RecentResp_setScore_170313905642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53573;
     Object term53625;

    public RecentResp_setScore_170313905642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53573 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53579 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53589 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53575, term53575.getClass(), "year", 2011);
        setShortField(term53575, term53575.getClass(), "month", (short) 10);
        setShortField(term53575, term53575.getClass(), "day", (short) 26);
        setField(term53574, term53574.getClass(), "date", term53575);
        setByteField(term53579, term53579.getClass(), "hour", (byte) 19);
        setByteField(term53579, term53579.getClass(), "minute", (byte) 15);
        setByteField(term53579, term53579.getClass(), "second", (byte) 28);
        setIntField(term53579, term53579.getClass(), "nano", 465029232);
        setField(term53574, term53574.getClass(), "time", term53579);
        setField(term53573, term53573.getClass(), "playDate", term53574);
        setIntField(term53585, term53585.getClass(), "year", 2027);
        setShortField(term53585, term53585.getClass(), "month", (short) 2);
        setShortField(term53585, term53585.getClass(), "day", (short) 22);
        setField(term53584, term53584.getClass(), "date", term53585);
        setByteField(term53589, term53589.getClass(), "hour", (byte) 4);
        setByteField(term53589, term53589.getClass(), "minute", (byte) 59);
        setByteField(term53589, term53589.getClass(), "second", (byte) 50);
        setIntField(term53589, term53589.getClass(), "nano", 80562715);
        setField(term53584, term53584.getClass(), "time", term53589);
        setField(term53573, term53573.getClass(), "userPlayDate", term53584);
        setIntField(term53573, term53573.getClass(), "musicId", -1679645192);
        setIntField(term53573, term53573.getClass(), "level", 1524285721);
        setIntField(term53573, term53573.getClass(), "customId", -808971480);
        setIntField(term53573, term53573.getClass(), "playedCustom1", 534508972);
        setIntField(term53573, term53573.getClass(), "playedCustom2", -301935716);
        setIntField(term53573, term53573.getClass(), "playedCustom3", 1701720681);
        setIntField(term53573, term53573.getClass(), "track", -378738380);
        setIntField(term53573, term53573.getClass(), "score", 1984720770);
        setIntField(term53573, term53573.getClass(), "rank", -8765616);
        setIntField(term53573, term53573.getClass(), "maxCombo", -1365627412);
        setIntField(term53573, term53573.getClass(), "maxChain", 520625434);
        setIntField(term53573, term53573.getClass(), "rateTap", 1531056945);
        setIntField(term53573, term53573.getClass(), "rateHold", -2128361795);
        setIntField(term53573, term53573.getClass(), "rateSlide", 925239258);
        setIntField(term53573, term53573.getClass(), "rateAir", 1041156468);
        setIntField(term53573, term53573.getClass(), "rateFlick", 825756233);
        setIntField(term53573, term53573.getClass(), "judgeGuilty", -494349155);
        setIntField(term53573, term53573.getClass(), "judgeAttack", -621743880);
        setIntField(term53573, term53573.getClass(), "judgeJustice", 1487958580);
        setIntField(term53573, term53573.getClass(), "judgeCritical", -41377169);
        setIntField(term53573, term53573.getClass(), "playerRating", -1713407140);
        setBooleanField(term53573, term53573.getClass(), "isNewRecord", true);
        setBooleanField(term53573, term53573.getClass(), "isFullCombo", true);
        setIntField(term53573, term53573.getClass(), "fullChainKind", 184591989);
        setBooleanField(term53573, term53573.getClass(), "isAllJustice", true);
        setIntField(term53573, term53573.getClass(), "characterId", 528505320);
        setIntField(term53573, term53573.getClass(), "skillId", 1255256909);
        setIntField(term53573, term53573.getClass(), "playKind", 1364268540);
        setBooleanField(term53573, term53573.getClass(), "isClear", false);
        setIntField(term53573, term53573.getClass(), "skillLevel", 1613417207);
        setIntField(term53573, term53573.getClass(), "skillEffect", -267884738);
        term53625 = new Integer(1701113802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53625;
        callMethod(klass, "setScore", argTypes, term53573, args);
    }

};


