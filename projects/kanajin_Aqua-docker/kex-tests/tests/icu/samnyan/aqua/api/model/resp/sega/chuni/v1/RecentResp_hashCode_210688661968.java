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

public class RecentResp_hashCode_210688661968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54975;

    public RecentResp_hashCode_210688661968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54975 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54991 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54977, term54977.getClass(), "year", 2014);
        setShortField(term54977, term54977.getClass(), "month", (short) 12);
        setShortField(term54977, term54977.getClass(), "day", (short) 28);
        setField(term54976, term54976.getClass(), "date", term54977);
        setByteField(term54981, term54981.getClass(), "hour", (byte) 2);
        setByteField(term54981, term54981.getClass(), "minute", (byte) 44);
        setByteField(term54981, term54981.getClass(), "second", (byte) 18);
        setIntField(term54981, term54981.getClass(), "nano", 39913942);
        setField(term54976, term54976.getClass(), "time", term54981);
        setField(term54975, term54975.getClass(), "playDate", term54976);
        setIntField(term54987, term54987.getClass(), "year", 2020);
        setShortField(term54987, term54987.getClass(), "month", (short) 11);
        setShortField(term54987, term54987.getClass(), "day", (short) 29);
        setField(term54986, term54986.getClass(), "date", term54987);
        setByteField(term54991, term54991.getClass(), "hour", (byte) 0);
        setByteField(term54991, term54991.getClass(), "minute", (byte) 40);
        setByteField(term54991, term54991.getClass(), "second", (byte) 23);
        setIntField(term54991, term54991.getClass(), "nano", 204732115);
        setField(term54986, term54986.getClass(), "time", term54991);
        setField(term54975, term54975.getClass(), "userPlayDate", term54986);
        setIntField(term54975, term54975.getClass(), "musicId", -401274751);
        setIntField(term54975, term54975.getClass(), "level", 2063937149);
        setIntField(term54975, term54975.getClass(), "customId", 166881458);
        setIntField(term54975, term54975.getClass(), "playedCustom1", 828853234);
        setIntField(term54975, term54975.getClass(), "playedCustom2", 1203278976);
        setIntField(term54975, term54975.getClass(), "playedCustom3", 751787241);
        setIntField(term54975, term54975.getClass(), "track", 477748320);
        setIntField(term54975, term54975.getClass(), "score", 512793147);
        setIntField(term54975, term54975.getClass(), "rank", -2061386860);
        setIntField(term54975, term54975.getClass(), "maxCombo", -678230923);
        setIntField(term54975, term54975.getClass(), "maxChain", 2001978730);
        setIntField(term54975, term54975.getClass(), "rateTap", 835522995);
        setIntField(term54975, term54975.getClass(), "rateHold", 209416345);
        setIntField(term54975, term54975.getClass(), "rateSlide", 119693843);
        setIntField(term54975, term54975.getClass(), "rateAir", 1525937366);
        setIntField(term54975, term54975.getClass(), "rateFlick", 450142186);
        setIntField(term54975, term54975.getClass(), "judgeGuilty", 874917656);
        setIntField(term54975, term54975.getClass(), "judgeAttack", 998050776);
        setIntField(term54975, term54975.getClass(), "judgeJustice", -1154360532);
        setIntField(term54975, term54975.getClass(), "judgeCritical", -1414782360);
        setIntField(term54975, term54975.getClass(), "playerRating", 812774787);
        setBooleanField(term54975, term54975.getClass(), "isNewRecord", false);
        setBooleanField(term54975, term54975.getClass(), "isFullCombo", true);
        setIntField(term54975, term54975.getClass(), "fullChainKind", 1955108847);
        setBooleanField(term54975, term54975.getClass(), "isAllJustice", false);
        setIntField(term54975, term54975.getClass(), "characterId", 601282140);
        setIntField(term54975, term54975.getClass(), "skillId", -1989711686);
        setIntField(term54975, term54975.getClass(), "playKind", -427352130);
        setBooleanField(term54975, term54975.getClass(), "isClear", false);
        setIntField(term54975, term54975.getClass(), "skillLevel", 490225359);
        setIntField(term54975, term54975.getClass(), "skillEffect", 338229726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term54975, args);
    }

};


