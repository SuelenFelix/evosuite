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

public class RecentResp_getPlayerRating_153691798622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52499;

    public RecentResp_getPlayerRating_153691798622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52499 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52500 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52501 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52505 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52515 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52501, term52501.getClass(), "year", 2022);
        setShortField(term52501, term52501.getClass(), "month", (short) 5);
        setShortField(term52501, term52501.getClass(), "day", (short) 26);
        setField(term52500, term52500.getClass(), "date", term52501);
        setByteField(term52505, term52505.getClass(), "hour", (byte) 16);
        setByteField(term52505, term52505.getClass(), "minute", (byte) 7);
        setByteField(term52505, term52505.getClass(), "second", (byte) 6);
        setIntField(term52505, term52505.getClass(), "nano", 65239619);
        setField(term52500, term52500.getClass(), "time", term52505);
        setField(term52499, term52499.getClass(), "playDate", term52500);
        setIntField(term52511, term52511.getClass(), "year", 2021);
        setShortField(term52511, term52511.getClass(), "month", (short) 4);
        setShortField(term52511, term52511.getClass(), "day", (short) 22);
        setField(term52510, term52510.getClass(), "date", term52511);
        setByteField(term52515, term52515.getClass(), "hour", (byte) 4);
        setByteField(term52515, term52515.getClass(), "minute", (byte) 51);
        setByteField(term52515, term52515.getClass(), "second", (byte) 42);
        setIntField(term52515, term52515.getClass(), "nano", 408430084);
        setField(term52510, term52510.getClass(), "time", term52515);
        setField(term52499, term52499.getClass(), "userPlayDate", term52510);
        setIntField(term52499, term52499.getClass(), "musicId", -1058018356);
        setIntField(term52499, term52499.getClass(), "level", -618930598);
        setIntField(term52499, term52499.getClass(), "customId", -1912835189);
        setIntField(term52499, term52499.getClass(), "playedCustom1", 1508089655);
        setIntField(term52499, term52499.getClass(), "playedCustom2", 1344738281);
        setIntField(term52499, term52499.getClass(), "playedCustom3", 2137586016);
        setIntField(term52499, term52499.getClass(), "track", 718944255);
        setIntField(term52499, term52499.getClass(), "score", -255278880);
        setIntField(term52499, term52499.getClass(), "rank", 978936508);
        setIntField(term52499, term52499.getClass(), "maxCombo", -782282859);
        setIntField(term52499, term52499.getClass(), "maxChain", -289872820);
        setIntField(term52499, term52499.getClass(), "rateTap", 999463901);
        setIntField(term52499, term52499.getClass(), "rateHold", -1558642750);
        setIntField(term52499, term52499.getClass(), "rateSlide", 1177832973);
        setIntField(term52499, term52499.getClass(), "rateAir", -808639910);
        setIntField(term52499, term52499.getClass(), "rateFlick", -2087767976);
        setIntField(term52499, term52499.getClass(), "judgeGuilty", 1541808857);
        setIntField(term52499, term52499.getClass(), "judgeAttack", 2007310608);
        setIntField(term52499, term52499.getClass(), "judgeJustice", 462157519);
        setIntField(term52499, term52499.getClass(), "judgeCritical", -875956888);
        setIntField(term52499, term52499.getClass(), "playerRating", 65647821);
        setBooleanField(term52499, term52499.getClass(), "isNewRecord", false);
        setBooleanField(term52499, term52499.getClass(), "isFullCombo", false);
        setIntField(term52499, term52499.getClass(), "fullChainKind", -1289614562);
        setBooleanField(term52499, term52499.getClass(), "isAllJustice", false);
        setIntField(term52499, term52499.getClass(), "characterId", 201090501);
        setIntField(term52499, term52499.getClass(), "skillId", -1397182025);
        setIntField(term52499, term52499.getClass(), "playKind", -899619534);
        setBooleanField(term52499, term52499.getClass(), "isClear", false);
        setIntField(term52499, term52499.getClass(), "skillLevel", 1638508595);
        setIntField(term52499, term52499.getClass(), "skillEffect", -114151747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term52499, args);
    }

};


