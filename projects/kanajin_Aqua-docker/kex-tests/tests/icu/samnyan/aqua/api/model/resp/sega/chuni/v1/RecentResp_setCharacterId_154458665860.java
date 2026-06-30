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

public class RecentResp_setCharacterId_154458665860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54545;
     Object term54597;

    public RecentResp_setCharacterId_154458665860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54545 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54547 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54551 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54556 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54557 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54561 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54547, term54547.getClass(), "year", 2012);
        setShortField(term54547, term54547.getClass(), "month", (short) 3);
        setShortField(term54547, term54547.getClass(), "day", (short) 30);
        setField(term54546, term54546.getClass(), "date", term54547);
        setByteField(term54551, term54551.getClass(), "hour", (byte) 22);
        setByteField(term54551, term54551.getClass(), "minute", (byte) 56);
        setByteField(term54551, term54551.getClass(), "second", (byte) 8);
        setIntField(term54551, term54551.getClass(), "nano", 786128521);
        setField(term54546, term54546.getClass(), "time", term54551);
        setField(term54545, term54545.getClass(), "playDate", term54546);
        setIntField(term54557, term54557.getClass(), "year", 2023);
        setShortField(term54557, term54557.getClass(), "month", (short) 9);
        setShortField(term54557, term54557.getClass(), "day", (short) 9);
        setField(term54556, term54556.getClass(), "date", term54557);
        setByteField(term54561, term54561.getClass(), "hour", (byte) 3);
        setByteField(term54561, term54561.getClass(), "minute", (byte) 52);
        setByteField(term54561, term54561.getClass(), "second", (byte) 58);
        setIntField(term54561, term54561.getClass(), "nano", 185910636);
        setField(term54556, term54556.getClass(), "time", term54561);
        setField(term54545, term54545.getClass(), "userPlayDate", term54556);
        setIntField(term54545, term54545.getClass(), "musicId", 1255067608);
        setIntField(term54545, term54545.getClass(), "level", -1085076149);
        setIntField(term54545, term54545.getClass(), "customId", 2037214602);
        setIntField(term54545, term54545.getClass(), "playedCustom1", 1791859428);
        setIntField(term54545, term54545.getClass(), "playedCustom2", 313791373);
        setIntField(term54545, term54545.getClass(), "playedCustom3", -1757202955);
        setIntField(term54545, term54545.getClass(), "track", -1618822811);
        setIntField(term54545, term54545.getClass(), "score", -850405849);
        setIntField(term54545, term54545.getClass(), "rank", -545145172);
        setIntField(term54545, term54545.getClass(), "maxCombo", -2069653687);
        setIntField(term54545, term54545.getClass(), "maxChain", -1832612963);
        setIntField(term54545, term54545.getClass(), "rateTap", 1064073662);
        setIntField(term54545, term54545.getClass(), "rateHold", 1120854991);
        setIntField(term54545, term54545.getClass(), "rateSlide", 1448504845);
        setIntField(term54545, term54545.getClass(), "rateAir", 451612513);
        setIntField(term54545, term54545.getClass(), "rateFlick", 343920197);
        setIntField(term54545, term54545.getClass(), "judgeGuilty", -521630681);
        setIntField(term54545, term54545.getClass(), "judgeAttack", 1297681432);
        setIntField(term54545, term54545.getClass(), "judgeJustice", 820668311);
        setIntField(term54545, term54545.getClass(), "judgeCritical", -43239204);
        setIntField(term54545, term54545.getClass(), "playerRating", -1525054580);
        setBooleanField(term54545, term54545.getClass(), "isNewRecord", false);
        setBooleanField(term54545, term54545.getClass(), "isFullCombo", true);
        setIntField(term54545, term54545.getClass(), "fullChainKind", 1528804559);
        setBooleanField(term54545, term54545.getClass(), "isAllJustice", false);
        setIntField(term54545, term54545.getClass(), "characterId", -706860271);
        setIntField(term54545, term54545.getClass(), "skillId", -1268460209);
        setIntField(term54545, term54545.getClass(), "playKind", 1050300885);
        setBooleanField(term54545, term54545.getClass(), "isClear", false);
        setIntField(term54545, term54545.getClass(), "skillLevel", -1623966228);
        setIntField(term54545, term54545.getClass(), "skillEffect", 1085534206);
        term54597 = new Integer(-825946504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54597;
        callMethod(klass, "setCharacterId", argTypes, term54545, args);
    }

};


