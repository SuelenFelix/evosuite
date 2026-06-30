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

public class RecentResp_setRateSlide_102798875248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48727;
     Object term48779;

    public RecentResp_setRateSlide_102798875248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48727 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48733 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48743 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48729, term48729.getClass(), "year", 2013);
        setShortField(term48729, term48729.getClass(), "month", (short) 9);
        setShortField(term48729, term48729.getClass(), "day", (short) 12);
        setField(term48728, term48728.getClass(), "date", term48729);
        setByteField(term48733, term48733.getClass(), "hour", (byte) 19);
        setByteField(term48733, term48733.getClass(), "minute", (byte) 26);
        setByteField(term48733, term48733.getClass(), "second", (byte) 25);
        setIntField(term48733, term48733.getClass(), "nano", 897835144);
        setField(term48728, term48728.getClass(), "time", term48733);
        setField(term48727, term48727.getClass(), "playDate", term48728);
        setIntField(term48739, term48739.getClass(), "year", 2014);
        setShortField(term48739, term48739.getClass(), "month", (short) 6);
        setShortField(term48739, term48739.getClass(), "day", (short) 17);
        setField(term48738, term48738.getClass(), "date", term48739);
        setByteField(term48743, term48743.getClass(), "hour", (byte) 1);
        setByteField(term48743, term48743.getClass(), "minute", (byte) 42);
        setByteField(term48743, term48743.getClass(), "second", (byte) 16);
        setIntField(term48743, term48743.getClass(), "nano", 607959128);
        setField(term48738, term48738.getClass(), "time", term48743);
        setField(term48727, term48727.getClass(), "userPlayDate", term48738);
        setIntField(term48727, term48727.getClass(), "musicId", 435463871);
        setIntField(term48727, term48727.getClass(), "level", -72892619);
        setIntField(term48727, term48727.getClass(), "customId", 907161445);
        setIntField(term48727, term48727.getClass(), "playedCustom1", -107125345);
        setIntField(term48727, term48727.getClass(), "playedCustom2", -1484271501);
        setIntField(term48727, term48727.getClass(), "playedCustom3", 1994800842);
        setIntField(term48727, term48727.getClass(), "track", 418349525);
        setIntField(term48727, term48727.getClass(), "score", 989214721);
        setIntField(term48727, term48727.getClass(), "rank", 1509604);
        setIntField(term48727, term48727.getClass(), "maxCombo", 516929449);
        setIntField(term48727, term48727.getClass(), "maxChain", 86726117);
        setIntField(term48727, term48727.getClass(), "rateTap", -142908686);
        setIntField(term48727, term48727.getClass(), "rateHold", 780437076);
        setIntField(term48727, term48727.getClass(), "rateSlide", -1290991126);
        setIntField(term48727, term48727.getClass(), "rateAir", 1579548215);
        setIntField(term48727, term48727.getClass(), "rateFlick", 518866176);
        setIntField(term48727, term48727.getClass(), "judgeGuilty", -1352533284);
        setIntField(term48727, term48727.getClass(), "judgeAttack", -149022151);
        setIntField(term48727, term48727.getClass(), "judgeJustice", -2128082017);
        setIntField(term48727, term48727.getClass(), "judgeCritical", -626860638);
        setIntField(term48727, term48727.getClass(), "playerRating", 969445811);
        setBooleanField(term48727, term48727.getClass(), "isNewRecord", true);
        setBooleanField(term48727, term48727.getClass(), "isFullCombo", true);
        setIntField(term48727, term48727.getClass(), "fullChainKind", -1232355383);
        setBooleanField(term48727, term48727.getClass(), "isAllJustice", true);
        setIntField(term48727, term48727.getClass(), "characterId", 1599985157);
        setIntField(term48727, term48727.getClass(), "skillId", 80735812);
        setIntField(term48727, term48727.getClass(), "playKind", 1616706735);
        setBooleanField(term48727, term48727.getClass(), "isClear", true);
        setIntField(term48727, term48727.getClass(), "skillLevel", -445244024);
        setIntField(term48727, term48727.getClass(), "skillEffect", -1836568689);
        term48779 = new Integer(367237282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48779;
        callMethod(klass, "setRateSlide", argTypes, term48727, args);
    }

};


