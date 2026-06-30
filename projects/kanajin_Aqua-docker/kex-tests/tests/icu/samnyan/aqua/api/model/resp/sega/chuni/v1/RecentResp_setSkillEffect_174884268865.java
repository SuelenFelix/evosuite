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

public class RecentResp_setSkillEffect_174884268865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54815;
     Object term54867;

    public RecentResp_setSkillEffect_174884268865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54815 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54821 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54831 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54817, term54817.getClass(), "year", 2022);
        setShortField(term54817, term54817.getClass(), "month", (short) 11);
        setShortField(term54817, term54817.getClass(), "day", (short) 16);
        setField(term54816, term54816.getClass(), "date", term54817);
        setByteField(term54821, term54821.getClass(), "hour", (byte) 12);
        setByteField(term54821, term54821.getClass(), "minute", (byte) 41);
        setByteField(term54821, term54821.getClass(), "second", (byte) 8);
        setIntField(term54821, term54821.getClass(), "nano", 873900846);
        setField(term54816, term54816.getClass(), "time", term54821);
        setField(term54815, term54815.getClass(), "playDate", term54816);
        setIntField(term54827, term54827.getClass(), "year", 2016);
        setShortField(term54827, term54827.getClass(), "month", (short) 8);
        setShortField(term54827, term54827.getClass(), "day", (short) 9);
        setField(term54826, term54826.getClass(), "date", term54827);
        setByteField(term54831, term54831.getClass(), "hour", (byte) 11);
        setByteField(term54831, term54831.getClass(), "minute", (byte) 35);
        setByteField(term54831, term54831.getClass(), "second", (byte) 27);
        setIntField(term54831, term54831.getClass(), "nano", 440006638);
        setField(term54826, term54826.getClass(), "time", term54831);
        setField(term54815, term54815.getClass(), "userPlayDate", term54826);
        setIntField(term54815, term54815.getClass(), "musicId", -374626618);
        setIntField(term54815, term54815.getClass(), "level", 1449690385);
        setIntField(term54815, term54815.getClass(), "customId", -1063098623);
        setIntField(term54815, term54815.getClass(), "playedCustom1", 1519335351);
        setIntField(term54815, term54815.getClass(), "playedCustom2", 1995841517);
        setIntField(term54815, term54815.getClass(), "playedCustom3", -1865261069);
        setIntField(term54815, term54815.getClass(), "track", 159666228);
        setIntField(term54815, term54815.getClass(), "score", -1706840691);
        setIntField(term54815, term54815.getClass(), "rank", -722277466);
        setIntField(term54815, term54815.getClass(), "maxCombo", 1000587160);
        setIntField(term54815, term54815.getClass(), "maxChain", 1691425223);
        setIntField(term54815, term54815.getClass(), "rateTap", 2086385537);
        setIntField(term54815, term54815.getClass(), "rateHold", -898458301);
        setIntField(term54815, term54815.getClass(), "rateSlide", -1752896);
        setIntField(term54815, term54815.getClass(), "rateAir", -1202458563);
        setIntField(term54815, term54815.getClass(), "rateFlick", -974221589);
        setIntField(term54815, term54815.getClass(), "judgeGuilty", -167704667);
        setIntField(term54815, term54815.getClass(), "judgeAttack", -820617926);
        setIntField(term54815, term54815.getClass(), "judgeJustice", -1871142929);
        setIntField(term54815, term54815.getClass(), "judgeCritical", -1594964553);
        setIntField(term54815, term54815.getClass(), "playerRating", -1839071263);
        setBooleanField(term54815, term54815.getClass(), "isNewRecord", true);
        setBooleanField(term54815, term54815.getClass(), "isFullCombo", false);
        setIntField(term54815, term54815.getClass(), "fullChainKind", 1247519674);
        setBooleanField(term54815, term54815.getClass(), "isAllJustice", false);
        setIntField(term54815, term54815.getClass(), "characterId", -460205484);
        setIntField(term54815, term54815.getClass(), "skillId", -1144163240);
        setIntField(term54815, term54815.getClass(), "playKind", 2135238175);
        setBooleanField(term54815, term54815.getClass(), "isClear", true);
        setIntField(term54815, term54815.getClass(), "skillLevel", -407365393);
        setIntField(term54815, term54815.getClass(), "skillEffect", 1408195458);
        term54867 = new Integer(1129173756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54867;
        callMethod(klass, "setSkillEffect", argTypes, term54815, args);
    }

};


