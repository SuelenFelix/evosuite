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
import java.lang.Integer;

public class RecentResp_setRateFlick_31934125850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48835;
     Object term48887;

    public RecentResp_setRateFlick_31934125850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48835 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48841 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48851 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48837, term48837.getClass(), "year", 2013);
        setShortField(term48837, term48837.getClass(), "month", (short) 5);
        setShortField(term48837, term48837.getClass(), "day", (short) 9);
        setField(term48836, term48836.getClass(), "date", term48837);
        setByteField(term48841, term48841.getClass(), "hour", (byte) 21);
        setByteField(term48841, term48841.getClass(), "minute", (byte) 29);
        setByteField(term48841, term48841.getClass(), "second", (byte) 31);
        setIntField(term48841, term48841.getClass(), "nano", 674914044);
        setField(term48836, term48836.getClass(), "time", term48841);
        setField(term48835, term48835.getClass(), "playDate", term48836);
        setIntField(term48847, term48847.getClass(), "year", 2029);
        setShortField(term48847, term48847.getClass(), "month", (short) 10);
        setShortField(term48847, term48847.getClass(), "day", (short) 7);
        setField(term48846, term48846.getClass(), "date", term48847);
        setByteField(term48851, term48851.getClass(), "hour", (byte) 8);
        setByteField(term48851, term48851.getClass(), "minute", (byte) 43);
        setByteField(term48851, term48851.getClass(), "second", (byte) 49);
        setIntField(term48851, term48851.getClass(), "nano", 733700043);
        setField(term48846, term48846.getClass(), "time", term48851);
        setField(term48835, term48835.getClass(), "userPlayDate", term48846);
        setIntField(term48835, term48835.getClass(), "musicId", 108670537);
        setIntField(term48835, term48835.getClass(), "level", -94326012);
        setIntField(term48835, term48835.getClass(), "customId", -665192132);
        setIntField(term48835, term48835.getClass(), "playedCustom1", 720355914);
        setIntField(term48835, term48835.getClass(), "playedCustom2", -775874930);
        setIntField(term48835, term48835.getClass(), "playedCustom3", 1404363846);
        setIntField(term48835, term48835.getClass(), "track", -2081298107);
        setIntField(term48835, term48835.getClass(), "score", -231030486);
        setIntField(term48835, term48835.getClass(), "rank", 908016119);
        setIntField(term48835, term48835.getClass(), "maxCombo", 110988463);
        setIntField(term48835, term48835.getClass(), "maxChain", 955685902);
        setIntField(term48835, term48835.getClass(), "rateTap", 462054815);
        setIntField(term48835, term48835.getClass(), "rateHold", 406100677);
        setIntField(term48835, term48835.getClass(), "rateSlide", 778368290);
        setIntField(term48835, term48835.getClass(), "rateAir", 963185413);
        setIntField(term48835, term48835.getClass(), "rateFlick", 1937434591);
        setIntField(term48835, term48835.getClass(), "judgeGuilty", 759908235);
        setIntField(term48835, term48835.getClass(), "judgeAttack", -1220035028);
        setIntField(term48835, term48835.getClass(), "judgeJustice", 211574528);
        setIntField(term48835, term48835.getClass(), "judgeCritical", 984819165);
        setIntField(term48835, term48835.getClass(), "playerRating", 1276438509);
        setBooleanField(term48835, term48835.getClass(), "isNewRecord", false);
        setBooleanField(term48835, term48835.getClass(), "isFullCombo", false);
        setIntField(term48835, term48835.getClass(), "fullChainKind", -934156422);
        setBooleanField(term48835, term48835.getClass(), "isAllJustice", false);
        setIntField(term48835, term48835.getClass(), "characterId", -1644931931);
        setIntField(term48835, term48835.getClass(), "skillId", -1890108963);
        setIntField(term48835, term48835.getClass(), "playKind", 1848496553);
        setBooleanField(term48835, term48835.getClass(), "isClear", false);
        setIntField(term48835, term48835.getClass(), "skillLevel", 79714955);
        setIntField(term48835, term48835.getClass(), "skillEffect", -1409613044);
        term48887 = new Integer(-1594530234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48887;
        callMethod(klass, "setRateFlick", argTypes, term48835, args);
    }

};


