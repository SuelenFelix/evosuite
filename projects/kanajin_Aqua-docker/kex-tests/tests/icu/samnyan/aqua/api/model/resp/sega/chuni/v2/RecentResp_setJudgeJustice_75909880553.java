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

public class RecentResp_setJudgeJustice_75909880553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48997;
     Object term49049;

    public RecentResp_setJudgeJustice_75909880553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48997 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49003 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49013 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48999, term48999.getClass(), "year", 2015);
        setShortField(term48999, term48999.getClass(), "month", (short) 11);
        setShortField(term48999, term48999.getClass(), "day", (short) 12);
        setField(term48998, term48998.getClass(), "date", term48999);
        setByteField(term49003, term49003.getClass(), "hour", (byte) 8);
        setByteField(term49003, term49003.getClass(), "minute", (byte) 57);
        setByteField(term49003, term49003.getClass(), "second", (byte) 39);
        setIntField(term49003, term49003.getClass(), "nano", 144990931);
        setField(term48998, term48998.getClass(), "time", term49003);
        setField(term48997, term48997.getClass(), "playDate", term48998);
        setIntField(term49009, term49009.getClass(), "year", 2015);
        setShortField(term49009, term49009.getClass(), "month", (short) 3);
        setShortField(term49009, term49009.getClass(), "day", (short) 10);
        setField(term49008, term49008.getClass(), "date", term49009);
        setByteField(term49013, term49013.getClass(), "hour", (byte) 6);
        setByteField(term49013, term49013.getClass(), "minute", (byte) 11);
        setByteField(term49013, term49013.getClass(), "second", (byte) 21);
        setIntField(term49013, term49013.getClass(), "nano", 925797004);
        setField(term49008, term49008.getClass(), "time", term49013);
        setField(term48997, term48997.getClass(), "userPlayDate", term49008);
        setIntField(term48997, term48997.getClass(), "musicId", 1000189054);
        setIntField(term48997, term48997.getClass(), "level", 832500285);
        setIntField(term48997, term48997.getClass(), "customId", 1519973734);
        setIntField(term48997, term48997.getClass(), "playedCustom1", -988300994);
        setIntField(term48997, term48997.getClass(), "playedCustom2", 1939692211);
        setIntField(term48997, term48997.getClass(), "playedCustom3", 121806851);
        setIntField(term48997, term48997.getClass(), "track", 1753247664);
        setIntField(term48997, term48997.getClass(), "score", 521507971);
        setIntField(term48997, term48997.getClass(), "rank", 1760654275);
        setIntField(term48997, term48997.getClass(), "maxCombo", -1048247843);
        setIntField(term48997, term48997.getClass(), "maxChain", -545135207);
        setIntField(term48997, term48997.getClass(), "rateTap", 969786656);
        setIntField(term48997, term48997.getClass(), "rateHold", -1568320050);
        setIntField(term48997, term48997.getClass(), "rateSlide", 398869857);
        setIntField(term48997, term48997.getClass(), "rateAir", -2011847985);
        setIntField(term48997, term48997.getClass(), "rateFlick", 1113480119);
        setIntField(term48997, term48997.getClass(), "judgeGuilty", -159235116);
        setIntField(term48997, term48997.getClass(), "judgeAttack", 1280384723);
        setIntField(term48997, term48997.getClass(), "judgeJustice", 1755299610);
        setIntField(term48997, term48997.getClass(), "judgeCritical", 1141997389);
        setIntField(term48997, term48997.getClass(), "playerRating", -1491507262);
        setBooleanField(term48997, term48997.getClass(), "isNewRecord", false);
        setBooleanField(term48997, term48997.getClass(), "isFullCombo", true);
        setIntField(term48997, term48997.getClass(), "fullChainKind", 1071463645);
        setBooleanField(term48997, term48997.getClass(), "isAllJustice", false);
        setIntField(term48997, term48997.getClass(), "characterId", 165616136);
        setIntField(term48997, term48997.getClass(), "skillId", 887351836);
        setIntField(term48997, term48997.getClass(), "playKind", 2002612399);
        setBooleanField(term48997, term48997.getClass(), "isClear", false);
        setIntField(term48997, term48997.getClass(), "skillLevel", -1256668289);
        setIntField(term48997, term48997.getClass(), "skillEffect", -1377964851);
        term49049 = new Integer(-1288314969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49049;
        callMethod(klass, "setJudgeJustice", argTypes, term48997, args);
    }

};


