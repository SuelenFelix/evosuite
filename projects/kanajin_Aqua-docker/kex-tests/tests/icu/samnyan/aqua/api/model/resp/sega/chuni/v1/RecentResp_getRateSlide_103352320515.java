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

public class RecentResp_getRateSlide_103352320515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52135;

    public RecentResp_getRateSlide_103352320515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52135 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52141 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52151 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52137, term52137.getClass(), "year", 2010);
        setShortField(term52137, term52137.getClass(), "month", (short) 8);
        setShortField(term52137, term52137.getClass(), "day", (short) 17);
        setField(term52136, term52136.getClass(), "date", term52137);
        setByteField(term52141, term52141.getClass(), "hour", (byte) 5);
        setByteField(term52141, term52141.getClass(), "minute", (byte) 41);
        setByteField(term52141, term52141.getClass(), "second", (byte) 7);
        setIntField(term52141, term52141.getClass(), "nano", 26533684);
        setField(term52136, term52136.getClass(), "time", term52141);
        setField(term52135, term52135.getClass(), "playDate", term52136);
        setIntField(term52147, term52147.getClass(), "year", 2012);
        setShortField(term52147, term52147.getClass(), "month", (short) 4);
        setShortField(term52147, term52147.getClass(), "day", (short) 28);
        setField(term52146, term52146.getClass(), "date", term52147);
        setByteField(term52151, term52151.getClass(), "hour", (byte) 11);
        setByteField(term52151, term52151.getClass(), "minute", (byte) 47);
        setByteField(term52151, term52151.getClass(), "second", (byte) 25);
        setIntField(term52151, term52151.getClass(), "nano", 790659871);
        setField(term52146, term52146.getClass(), "time", term52151);
        setField(term52135, term52135.getClass(), "userPlayDate", term52146);
        setIntField(term52135, term52135.getClass(), "musicId", 767458787);
        setIntField(term52135, term52135.getClass(), "level", 2103721338);
        setIntField(term52135, term52135.getClass(), "customId", 621330308);
        setIntField(term52135, term52135.getClass(), "playedCustom1", -1597424060);
        setIntField(term52135, term52135.getClass(), "playedCustom2", 243854303);
        setIntField(term52135, term52135.getClass(), "playedCustom3", 1754709105);
        setIntField(term52135, term52135.getClass(), "track", 1523196898);
        setIntField(term52135, term52135.getClass(), "score", 2061147445);
        setIntField(term52135, term52135.getClass(), "rank", -531060561);
        setIntField(term52135, term52135.getClass(), "maxCombo", -1974107061);
        setIntField(term52135, term52135.getClass(), "maxChain", -1806271948);
        setIntField(term52135, term52135.getClass(), "rateTap", 1708731871);
        setIntField(term52135, term52135.getClass(), "rateHold", 1855866160);
        setIntField(term52135, term52135.getClass(), "rateSlide", -1463148153);
        setIntField(term52135, term52135.getClass(), "rateAir", -121679722);
        setIntField(term52135, term52135.getClass(), "rateFlick", -1283714004);
        setIntField(term52135, term52135.getClass(), "judgeGuilty", -1085038483);
        setIntField(term52135, term52135.getClass(), "judgeAttack", 1089796055);
        setIntField(term52135, term52135.getClass(), "judgeJustice", -456321892);
        setIntField(term52135, term52135.getClass(), "judgeCritical", 1803068346);
        setIntField(term52135, term52135.getClass(), "playerRating", 1598485572);
        setBooleanField(term52135, term52135.getClass(), "isNewRecord", true);
        setBooleanField(term52135, term52135.getClass(), "isFullCombo", true);
        setIntField(term52135, term52135.getClass(), "fullChainKind", 1328348146);
        setBooleanField(term52135, term52135.getClass(), "isAllJustice", false);
        setIntField(term52135, term52135.getClass(), "characterId", 835037846);
        setIntField(term52135, term52135.getClass(), "skillId", 1151852495);
        setIntField(term52135, term52135.getClass(), "playKind", -1258846135);
        setBooleanField(term52135, term52135.getClass(), "isClear", true);
        setIntField(term52135, term52135.getClass(), "skillLevel", -2113882456);
        setIntField(term52135, term52135.getClass(), "skillEffect", 913224981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateSlide", argTypes, term52135, args);
    }

};


