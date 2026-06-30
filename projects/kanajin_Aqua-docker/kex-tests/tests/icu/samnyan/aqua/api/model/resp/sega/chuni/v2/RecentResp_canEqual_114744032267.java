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

public class RecentResp_canEqual_114744032267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49752;
     Object term49804;

    public RecentResp_canEqual_114744032267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49752 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49758 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49768 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49754, term49754.getClass(), "year", 2013);
        setShortField(term49754, term49754.getClass(), "month", (short) 5);
        setShortField(term49754, term49754.getClass(), "day", (short) 5);
        setField(term49753, term49753.getClass(), "date", term49754);
        setByteField(term49758, term49758.getClass(), "hour", (byte) 7);
        setByteField(term49758, term49758.getClass(), "minute", (byte) 44);
        setByteField(term49758, term49758.getClass(), "second", (byte) 24);
        setIntField(term49758, term49758.getClass(), "nano", 458681760);
        setField(term49753, term49753.getClass(), "time", term49758);
        setField(term49752, term49752.getClass(), "playDate", term49753);
        setIntField(term49764, term49764.getClass(), "year", 2019);
        setShortField(term49764, term49764.getClass(), "month", (short) 1);
        setShortField(term49764, term49764.getClass(), "day", (short) 12);
        setField(term49763, term49763.getClass(), "date", term49764);
        setByteField(term49768, term49768.getClass(), "hour", (byte) 5);
        setByteField(term49768, term49768.getClass(), "minute", (byte) 47);
        setByteField(term49768, term49768.getClass(), "second", (byte) 36);
        setIntField(term49768, term49768.getClass(), "nano", 50353124);
        setField(term49763, term49763.getClass(), "time", term49768);
        setField(term49752, term49752.getClass(), "userPlayDate", term49763);
        setIntField(term49752, term49752.getClass(), "musicId", -537646987);
        setIntField(term49752, term49752.getClass(), "level", -558527010);
        setIntField(term49752, term49752.getClass(), "customId", -271207664);
        setIntField(term49752, term49752.getClass(), "playedCustom1", -1452529928);
        setIntField(term49752, term49752.getClass(), "playedCustom2", -467618426);
        setIntField(term49752, term49752.getClass(), "playedCustom3", 1728446971);
        setIntField(term49752, term49752.getClass(), "track", 871757481);
        setIntField(term49752, term49752.getClass(), "score", -866223414);
        setIntField(term49752, term49752.getClass(), "rank", -914821646);
        setIntField(term49752, term49752.getClass(), "maxCombo", -1420229744);
        setIntField(term49752, term49752.getClass(), "maxChain", -2026011046);
        setIntField(term49752, term49752.getClass(), "rateTap", -930966430);
        setIntField(term49752, term49752.getClass(), "rateHold", -1137340653);
        setIntField(term49752, term49752.getClass(), "rateSlide", -520048649);
        setIntField(term49752, term49752.getClass(), "rateAir", -39379486);
        setIntField(term49752, term49752.getClass(), "rateFlick", 92637602);
        setIntField(term49752, term49752.getClass(), "judgeGuilty", -702644184);
        setIntField(term49752, term49752.getClass(), "judgeAttack", 873158899);
        setIntField(term49752, term49752.getClass(), "judgeJustice", -939494687);
        setIntField(term49752, term49752.getClass(), "judgeCritical", 1818886574);
        setIntField(term49752, term49752.getClass(), "playerRating", -1082194143);
        setBooleanField(term49752, term49752.getClass(), "isNewRecord", true);
        setBooleanField(term49752, term49752.getClass(), "isFullCombo", true);
        setIntField(term49752, term49752.getClass(), "fullChainKind", 1109687027);
        setBooleanField(term49752, term49752.getClass(), "isAllJustice", false);
        setIntField(term49752, term49752.getClass(), "characterId", -1583077425);
        setIntField(term49752, term49752.getClass(), "skillId", -1058283823);
        setIntField(term49752, term49752.getClass(), "playKind", -1620576583);
        setBooleanField(term49752, term49752.getClass(), "isClear", true);
        setIntField(term49752, term49752.getClass(), "skillLevel", -1365748841);
        setIntField(term49752, term49752.getClass(), "skillEffect", 1223391792);
        term49804 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term49804;
        callMethod(klass, "canEqual", argTypes, term49752, args);
    }

};


