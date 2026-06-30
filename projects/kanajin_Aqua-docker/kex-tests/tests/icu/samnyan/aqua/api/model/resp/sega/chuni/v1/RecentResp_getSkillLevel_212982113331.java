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

public class RecentResp_getSkillLevel_212982113331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52967;

    public RecentResp_getSkillLevel_212982113331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52967 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52973 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52983 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52969, term52969.getClass(), "year", 2012);
        setShortField(term52969, term52969.getClass(), "month", (short) 2);
        setShortField(term52969, term52969.getClass(), "day", (short) 24);
        setField(term52968, term52968.getClass(), "date", term52969);
        setByteField(term52973, term52973.getClass(), "hour", (byte) 7);
        setByteField(term52973, term52973.getClass(), "minute", (byte) 19);
        setByteField(term52973, term52973.getClass(), "second", (byte) 47);
        setIntField(term52973, term52973.getClass(), "nano", 173778376);
        setField(term52968, term52968.getClass(), "time", term52973);
        setField(term52967, term52967.getClass(), "playDate", term52968);
        setIntField(term52979, term52979.getClass(), "year", 2029);
        setShortField(term52979, term52979.getClass(), "month", (short) 3);
        setShortField(term52979, term52979.getClass(), "day", (short) 28);
        setField(term52978, term52978.getClass(), "date", term52979);
        setByteField(term52983, term52983.getClass(), "hour", (byte) 6);
        setByteField(term52983, term52983.getClass(), "minute", (byte) 43);
        setByteField(term52983, term52983.getClass(), "second", (byte) 8);
        setIntField(term52983, term52983.getClass(), "nano", 873338827);
        setField(term52978, term52978.getClass(), "time", term52983);
        setField(term52967, term52967.getClass(), "userPlayDate", term52978);
        setIntField(term52967, term52967.getClass(), "musicId", -1644931931);
        setIntField(term52967, term52967.getClass(), "level", -1890108963);
        setIntField(term52967, term52967.getClass(), "customId", 1848496553);
        setIntField(term52967, term52967.getClass(), "playedCustom1", 79714955);
        setIntField(term52967, term52967.getClass(), "playedCustom2", -1409613044);
        setIntField(term52967, term52967.getClass(), "playedCustom3", -1594530234);
        setIntField(term52967, term52967.getClass(), "track", -414324261);
        setIntField(term52967, term52967.getClass(), "score", -1729893211);
        setIntField(term52967, term52967.getClass(), "rank", -1648760670);
        setIntField(term52967, term52967.getClass(), "maxCombo", 590703291);
        setIntField(term52967, term52967.getClass(), "maxChain", -2033199492);
        setIntField(term52967, term52967.getClass(), "rateTap", 350096397);
        setIntField(term52967, term52967.getClass(), "rateHold", -325295536);
        setIntField(term52967, term52967.getClass(), "rateSlide", -411068820);
        setIntField(term52967, term52967.getClass(), "rateAir", -608484309);
        setIntField(term52967, term52967.getClass(), "rateFlick", -396456847);
        setIntField(term52967, term52967.getClass(), "judgeGuilty", 1826615515);
        setIntField(term52967, term52967.getClass(), "judgeAttack", 1129458600);
        setIntField(term52967, term52967.getClass(), "judgeJustice", -1559804880);
        setIntField(term52967, term52967.getClass(), "judgeCritical", 420300457);
        setIntField(term52967, term52967.getClass(), "playerRating", 804843661);
        setBooleanField(term52967, term52967.getClass(), "isNewRecord", true);
        setBooleanField(term52967, term52967.getClass(), "isFullCombo", false);
        setIntField(term52967, term52967.getClass(), "fullChainKind", 1968236726);
        setBooleanField(term52967, term52967.getClass(), "isAllJustice", true);
        setIntField(term52967, term52967.getClass(), "characterId", -1080686915);
        setIntField(term52967, term52967.getClass(), "skillId", -1329496162);
        setIntField(term52967, term52967.getClass(), "playKind", -1181178091);
        setBooleanField(term52967, term52967.getClass(), "isClear", false);
        setIntField(term52967, term52967.getClass(), "skillLevel", 797166053);
        setIntField(term52967, term52967.getClass(), "skillEffect", -1145342603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillLevel", argTypes, term52967, args);
    }

};


