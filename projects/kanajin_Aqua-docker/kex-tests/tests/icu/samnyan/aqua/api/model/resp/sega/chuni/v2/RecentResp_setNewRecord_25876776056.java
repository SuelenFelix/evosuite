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
import java.lang.Boolean;

public class RecentResp_setNewRecord_25876776056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49159;
     Object term49211;

    public RecentResp_setNewRecord_25876776056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49159 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49175 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49161, term49161.getClass(), "year", 2012);
        setShortField(term49161, term49161.getClass(), "month", (short) 5);
        setShortField(term49161, term49161.getClass(), "day", (short) 9);
        setField(term49160, term49160.getClass(), "date", term49161);
        setByteField(term49165, term49165.getClass(), "hour", (byte) 4);
        setByteField(term49165, term49165.getClass(), "minute", (byte) 24);
        setByteField(term49165, term49165.getClass(), "second", (byte) 51);
        setIntField(term49165, term49165.getClass(), "nano", 768693356);
        setField(term49160, term49160.getClass(), "time", term49165);
        setField(term49159, term49159.getClass(), "playDate", term49160);
        setIntField(term49171, term49171.getClass(), "year", 2026);
        setShortField(term49171, term49171.getClass(), "month", (short) 3);
        setShortField(term49171, term49171.getClass(), "day", (short) 10);
        setField(term49170, term49170.getClass(), "date", term49171);
        setByteField(term49175, term49175.getClass(), "hour", (byte) 20);
        setByteField(term49175, term49175.getClass(), "minute", (byte) 16);
        setByteField(term49175, term49175.getClass(), "second", (byte) 6);
        setIntField(term49175, term49175.getClass(), "nano", 559277183);
        setField(term49170, term49170.getClass(), "time", term49175);
        setField(term49159, term49159.getClass(), "userPlayDate", term49170);
        setIntField(term49159, term49159.getClass(), "musicId", 1479117665);
        setIntField(term49159, term49159.getClass(), "level", 766065097);
        setIntField(term49159, term49159.getClass(), "customId", 1703658250);
        setIntField(term49159, term49159.getClass(), "playedCustom1", -942615253);
        setIntField(term49159, term49159.getClass(), "playedCustom2", 1642227506);
        setIntField(term49159, term49159.getClass(), "playedCustom3", -1930855861);
        setIntField(term49159, term49159.getClass(), "track", -59278290);
        setIntField(term49159, term49159.getClass(), "score", 862799975);
        setIntField(term49159, term49159.getClass(), "rank", 785517219);
        setIntField(term49159, term49159.getClass(), "maxCombo", -96163747);
        setIntField(term49159, term49159.getClass(), "maxChain", 1191473962);
        setIntField(term49159, term49159.getClass(), "rateTap", 110101710);
        setIntField(term49159, term49159.getClass(), "rateHold", 1819101781);
        setIntField(term49159, term49159.getClass(), "rateSlide", -1430157795);
        setIntField(term49159, term49159.getClass(), "rateAir", -1943692500);
        setIntField(term49159, term49159.getClass(), "rateFlick", -108045978);
        setIntField(term49159, term49159.getClass(), "judgeGuilty", -1242612066);
        setIntField(term49159, term49159.getClass(), "judgeAttack", -1492896610);
        setIntField(term49159, term49159.getClass(), "judgeJustice", 1239212151);
        setIntField(term49159, term49159.getClass(), "judgeCritical", 1513817979);
        setIntField(term49159, term49159.getClass(), "playerRating", 222944981);
        setBooleanField(term49159, term49159.getClass(), "isNewRecord", false);
        setBooleanField(term49159, term49159.getClass(), "isFullCombo", true);
        setIntField(term49159, term49159.getClass(), "fullChainKind", -1880135720);
        setBooleanField(term49159, term49159.getClass(), "isAllJustice", true);
        setIntField(term49159, term49159.getClass(), "characterId", 1065058113);
        setIntField(term49159, term49159.getClass(), "skillId", 159521199);
        setIntField(term49159, term49159.getClass(), "playKind", 2020510924);
        setBooleanField(term49159, term49159.getClass(), "isClear", false);
        setIntField(term49159, term49159.getClass(), "skillLevel", -644848160);
        setIntField(term49159, term49159.getClass(), "skillEffect", -413768483);
        term49211 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term49211;
        callMethod(klass, "setNewRecord", argTypes, term49159, args);
    }

};


