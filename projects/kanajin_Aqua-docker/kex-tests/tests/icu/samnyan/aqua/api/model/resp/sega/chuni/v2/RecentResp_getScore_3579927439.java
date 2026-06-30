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

public class RecentResp_getScore_3579927439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46653;

    public RecentResp_getScore_3579927439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46653 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46659 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46669 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46655, term46655.getClass(), "year", 2027);
        setShortField(term46655, term46655.getClass(), "month", (short) 12);
        setShortField(term46655, term46655.getClass(), "day", (short) 25);
        setField(term46654, term46654.getClass(), "date", term46655);
        setByteField(term46659, term46659.getClass(), "hour", (byte) 7);
        setByteField(term46659, term46659.getClass(), "minute", (byte) 38);
        setByteField(term46659, term46659.getClass(), "second", (byte) 45);
        setIntField(term46659, term46659.getClass(), "nano", 660882666);
        setField(term46654, term46654.getClass(), "time", term46659);
        setField(term46653, term46653.getClass(), "playDate", term46654);
        setIntField(term46665, term46665.getClass(), "year", 2025);
        setShortField(term46665, term46665.getClass(), "month", (short) 9);
        setShortField(term46665, term46665.getClass(), "day", (short) 21);
        setField(term46664, term46664.getClass(), "date", term46665);
        setByteField(term46669, term46669.getClass(), "hour", (byte) 16);
        setByteField(term46669, term46669.getClass(), "minute", (byte) 28);
        setByteField(term46669, term46669.getClass(), "second", (byte) 17);
        setIntField(term46669, term46669.getClass(), "nano", 64339643);
        setField(term46664, term46664.getClass(), "time", term46669);
        setField(term46653, term46653.getClass(), "userPlayDate", term46664);
        setIntField(term46653, term46653.getClass(), "musicId", 2027049805);
        setIntField(term46653, term46653.getClass(), "level", 1777210338);
        setIntField(term46653, term46653.getClass(), "customId", 1406833110);
        setIntField(term46653, term46653.getClass(), "playedCustom1", 971309393);
        setIntField(term46653, term46653.getClass(), "playedCustom2", 1506905403);
        setIntField(term46653, term46653.getClass(), "playedCustom3", 1022586170);
        setIntField(term46653, term46653.getClass(), "track", -175612916);
        setIntField(term46653, term46653.getClass(), "score", -1966814722);
        setIntField(term46653, term46653.getClass(), "rank", -2040048430);
        setIntField(term46653, term46653.getClass(), "maxCombo", 795243460);
        setIntField(term46653, term46653.getClass(), "maxChain", 1116550927);
        setIntField(term46653, term46653.getClass(), "rateTap", -1500511650);
        setIntField(term46653, term46653.getClass(), "rateHold", 1722619795);
        setIntField(term46653, term46653.getClass(), "rateSlide", 558598813);
        setIntField(term46653, term46653.getClass(), "rateAir", -282356982);
        setIntField(term46653, term46653.getClass(), "rateFlick", 1060240374);
        setIntField(term46653, term46653.getClass(), "judgeGuilty", 2119043046);
        setIntField(term46653, term46653.getClass(), "judgeAttack", 375507053);
        setIntField(term46653, term46653.getClass(), "judgeJustice", 1803067672);
        setIntField(term46653, term46653.getClass(), "judgeCritical", -844822506);
        setIntField(term46653, term46653.getClass(), "playerRating", -586687174);
        setBooleanField(term46653, term46653.getClass(), "isNewRecord", true);
        setBooleanField(term46653, term46653.getClass(), "isFullCombo", false);
        setIntField(term46653, term46653.getClass(), "fullChainKind", 583343799);
        setBooleanField(term46653, term46653.getClass(), "isAllJustice", false);
        setIntField(term46653, term46653.getClass(), "characterId", 1831635466);
        setIntField(term46653, term46653.getClass(), "skillId", -981606069);
        setIntField(term46653, term46653.getClass(), "playKind", 548729456);
        setBooleanField(term46653, term46653.getClass(), "isClear", false);
        setIntField(term46653, term46653.getClass(), "skillLevel", 482026097);
        setIntField(term46653, term46653.getClass(), "skillEffect", -528954009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term46653, args);
    }

};


