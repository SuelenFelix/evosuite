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

public class RecentResp_getRateSlide_74012019815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46965;

    public RecentResp_getRateSlide_74012019815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46965 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46981 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46967, term46967.getClass(), "year", 2014);
        setShortField(term46967, term46967.getClass(), "month", (short) 5);
        setShortField(term46967, term46967.getClass(), "day", (short) 5);
        setField(term46966, term46966.getClass(), "date", term46967);
        setByteField(term46971, term46971.getClass(), "hour", (byte) 17);
        setByteField(term46971, term46971.getClass(), "minute", (byte) 28);
        setByteField(term46971, term46971.getClass(), "second", (byte) 52);
        setIntField(term46971, term46971.getClass(), "nano", 741253436);
        setField(term46966, term46966.getClass(), "time", term46971);
        setField(term46965, term46965.getClass(), "playDate", term46966);
        setIntField(term46977, term46977.getClass(), "year", 2015);
        setShortField(term46977, term46977.getClass(), "month", (short) 3);
        setShortField(term46977, term46977.getClass(), "day", (short) 23);
        setField(term46976, term46976.getClass(), "date", term46977);
        setByteField(term46981, term46981.getClass(), "hour", (byte) 7);
        setByteField(term46981, term46981.getClass(), "minute", (byte) 27);
        setByteField(term46981, term46981.getClass(), "second", (byte) 38);
        setIntField(term46981, term46981.getClass(), "nano", 467385263);
        setField(term46976, term46976.getClass(), "time", term46981);
        setField(term46965, term46965.getClass(), "userPlayDate", term46976);
        setIntField(term46965, term46965.getClass(), "musicId", -804745833);
        setIntField(term46965, term46965.getClass(), "level", 1080834214);
        setIntField(term46965, term46965.getClass(), "customId", 323842695);
        setIntField(term46965, term46965.getClass(), "playedCustom1", 331897564);
        setIntField(term46965, term46965.getClass(), "playedCustom2", -968105925);
        setIntField(term46965, term46965.getClass(), "playedCustom3", -206020926);
        setIntField(term46965, term46965.getClass(), "track", -2054014210);
        setIntField(term46965, term46965.getClass(), "score", 1179045520);
        setIntField(term46965, term46965.getClass(), "rank", 1056739921);
        setIntField(term46965, term46965.getClass(), "maxCombo", 1384627927);
        setIntField(term46965, term46965.getClass(), "maxChain", -1252280115);
        setIntField(term46965, term46965.getClass(), "rateTap", -120849363);
        setIntField(term46965, term46965.getClass(), "rateHold", 147387583);
        setIntField(term46965, term46965.getClass(), "rateSlide", -1307347557);
        setIntField(term46965, term46965.getClass(), "rateAir", 1092325030);
        setIntField(term46965, term46965.getClass(), "rateFlick", -1901115940);
        setIntField(term46965, term46965.getClass(), "judgeGuilty", 1934437115);
        setIntField(term46965, term46965.getClass(), "judgeAttack", 1820319919);
        setIntField(term46965, term46965.getClass(), "judgeJustice", 1444962020);
        setIntField(term46965, term46965.getClass(), "judgeCritical", 1636228804);
        setIntField(term46965, term46965.getClass(), "playerRating", -1650533427);
        setBooleanField(term46965, term46965.getClass(), "isNewRecord", true);
        setBooleanField(term46965, term46965.getClass(), "isFullCombo", true);
        setIntField(term46965, term46965.getClass(), "fullChainKind", -1076430316);
        setBooleanField(term46965, term46965.getClass(), "isAllJustice", false);
        setIntField(term46965, term46965.getClass(), "characterId", 1984492528);
        setIntField(term46965, term46965.getClass(), "skillId", -655764067);
        setIntField(term46965, term46965.getClass(), "playKind", 31238744);
        setBooleanField(term46965, term46965.getClass(), "isClear", true);
        setIntField(term46965, term46965.getClass(), "skillLevel", 680031965);
        setIntField(term46965, term46965.getClass(), "skillEffect", -2112419098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateSlide", argTypes, term46965, args);
    }

};


