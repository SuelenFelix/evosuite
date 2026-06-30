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

public class RecentResp_setJudgeCritical_115866402054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54221;
     Object term54273;

    public RecentResp_setJudgeCritical_115866402054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54221 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54227 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54237 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54223, term54223.getClass(), "year", 2012);
        setShortField(term54223, term54223.getClass(), "month", (short) 6);
        setShortField(term54223, term54223.getClass(), "day", (short) 22);
        setField(term54222, term54222.getClass(), "date", term54223);
        setByteField(term54227, term54227.getClass(), "hour", (byte) 2);
        setByteField(term54227, term54227.getClass(), "minute", (byte) 38);
        setByteField(term54227, term54227.getClass(), "second", (byte) 18);
        setIntField(term54227, term54227.getClass(), "nano", 496783713);
        setField(term54222, term54222.getClass(), "time", term54227);
        setField(term54221, term54221.getClass(), "playDate", term54222);
        setIntField(term54233, term54233.getClass(), "year", 2024);
        setShortField(term54233, term54233.getClass(), "month", (short) 11);
        setShortField(term54233, term54233.getClass(), "day", (short) 23);
        setField(term54232, term54232.getClass(), "date", term54233);
        setByteField(term54237, term54237.getClass(), "hour", (byte) 12);
        setByteField(term54237, term54237.getClass(), "minute", (byte) 39);
        setByteField(term54237, term54237.getClass(), "second", (byte) 16);
        setIntField(term54237, term54237.getClass(), "nano", 452723100);
        setField(term54232, term54232.getClass(), "time", term54237);
        setField(term54221, term54221.getClass(), "userPlayDate", term54232);
        setIntField(term54221, term54221.getClass(), "musicId", 1003880925);
        setIntField(term54221, term54221.getClass(), "level", -1963566761);
        setIntField(term54221, term54221.getClass(), "customId", -1043400736);
        setIntField(term54221, term54221.getClass(), "playedCustom1", 497106793);
        setIntField(term54221, term54221.getClass(), "playedCustom2", -1904196296);
        setIntField(term54221, term54221.getClass(), "playedCustom3", -1857445668);
        setIntField(term54221, term54221.getClass(), "track", -1481132293);
        setIntField(term54221, term54221.getClass(), "score", -1458633954);
        setIntField(term54221, term54221.getClass(), "rank", 1334294885);
        setIntField(term54221, term54221.getClass(), "maxCombo", -711784035);
        setIntField(term54221, term54221.getClass(), "maxChain", -497219797);
        setIntField(term54221, term54221.getClass(), "rateTap", 720453125);
        setIntField(term54221, term54221.getClass(), "rateHold", -860314891);
        setIntField(term54221, term54221.getClass(), "rateSlide", -444697262);
        setIntField(term54221, term54221.getClass(), "rateAir", -460183304);
        setIntField(term54221, term54221.getClass(), "rateFlick", -2123879019);
        setIntField(term54221, term54221.getClass(), "judgeGuilty", -745063212);
        setIntField(term54221, term54221.getClass(), "judgeAttack", 298277204);
        setIntField(term54221, term54221.getClass(), "judgeJustice", 1536563217);
        setIntField(term54221, term54221.getClass(), "judgeCritical", -449582867);
        setIntField(term54221, term54221.getClass(), "playerRating", -650176523);
        setBooleanField(term54221, term54221.getClass(), "isNewRecord", true);
        setBooleanField(term54221, term54221.getClass(), "isFullCombo", false);
        setIntField(term54221, term54221.getClass(), "fullChainKind", 2071056240);
        setBooleanField(term54221, term54221.getClass(), "isAllJustice", false);
        setIntField(term54221, term54221.getClass(), "characterId", 1894657425);
        setIntField(term54221, term54221.getClass(), "skillId", -263942209);
        setIntField(term54221, term54221.getClass(), "playKind", 820400430);
        setBooleanField(term54221, term54221.getClass(), "isClear", false);
        setIntField(term54221, term54221.getClass(), "skillLevel", -1841078275);
        setIntField(term54221, term54221.getClass(), "skillEffect", -875421053);
        term54273 = new Integer(212464780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54273;
        callMethod(klass, "setJudgeCritical", argTypes, term54221, args);
    }

};


