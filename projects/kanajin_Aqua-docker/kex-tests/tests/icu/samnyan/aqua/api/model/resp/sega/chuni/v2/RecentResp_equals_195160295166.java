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

public class RecentResp_equals_195160295166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49699;
     Object term49751;

    public RecentResp_equals_195160295166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49699 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49705 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49715 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49701, term49701.getClass(), "year", 2014);
        setShortField(term49701, term49701.getClass(), "month", (short) 11);
        setShortField(term49701, term49701.getClass(), "day", (short) 16);
        setField(term49700, term49700.getClass(), "date", term49701);
        setByteField(term49705, term49705.getClass(), "hour", (byte) 22);
        setByteField(term49705, term49705.getClass(), "minute", (byte) 31);
        setByteField(term49705, term49705.getClass(), "second", (byte) 12);
        setIntField(term49705, term49705.getClass(), "nano", 196022579);
        setField(term49700, term49700.getClass(), "time", term49705);
        setField(term49699, term49699.getClass(), "playDate", term49700);
        setIntField(term49711, term49711.getClass(), "year", 2020);
        setShortField(term49711, term49711.getClass(), "month", (short) 4);
        setShortField(term49711, term49711.getClass(), "day", (short) 19);
        setField(term49710, term49710.getClass(), "date", term49711);
        setByteField(term49715, term49715.getClass(), "hour", (byte) 5);
        setByteField(term49715, term49715.getClass(), "minute", (byte) 30);
        setByteField(term49715, term49715.getClass(), "second", (byte) 22);
        setIntField(term49715, term49715.getClass(), "nano", 839145960);
        setField(term49710, term49710.getClass(), "time", term49715);
        setField(term49699, term49699.getClass(), "userPlayDate", term49710);
        setIntField(term49699, term49699.getClass(), "musicId", -366600678);
        setIntField(term49699, term49699.getClass(), "level", -1641994868);
        setIntField(term49699, term49699.getClass(), "customId", 1729072481);
        setIntField(term49699, term49699.getClass(), "playedCustom1", -1281635786);
        setIntField(term49699, term49699.getClass(), "playedCustom2", 1768552438);
        setIntField(term49699, term49699.getClass(), "playedCustom3", -166990524);
        setIntField(term49699, term49699.getClass(), "track", -1302306468);
        setIntField(term49699, term49699.getClass(), "score", -659361866);
        setIntField(term49699, term49699.getClass(), "rank", -2010825883);
        setIntField(term49699, term49699.getClass(), "maxCombo", 1230224947);
        setIntField(term49699, term49699.getClass(), "maxChain", 739759836);
        setIntField(term49699, term49699.getClass(), "rateTap", -1233408249);
        setIntField(term49699, term49699.getClass(), "rateHold", 1252145496);
        setIntField(term49699, term49699.getClass(), "rateSlide", -469940082);
        setIntField(term49699, term49699.getClass(), "rateAir", -821294367);
        setIntField(term49699, term49699.getClass(), "rateFlick", -1260916319);
        setIntField(term49699, term49699.getClass(), "judgeGuilty", 740454987);
        setIntField(term49699, term49699.getClass(), "judgeAttack", -2100331324);
        setIntField(term49699, term49699.getClass(), "judgeJustice", 2062095733);
        setIntField(term49699, term49699.getClass(), "judgeCritical", -7331803);
        setIntField(term49699, term49699.getClass(), "playerRating", 1725012686);
        setBooleanField(term49699, term49699.getClass(), "isNewRecord", true);
        setBooleanField(term49699, term49699.getClass(), "isFullCombo", true);
        setIntField(term49699, term49699.getClass(), "fullChainKind", -309653587);
        setBooleanField(term49699, term49699.getClass(), "isAllJustice", false);
        setIntField(term49699, term49699.getClass(), "characterId", 1988824012);
        setIntField(term49699, term49699.getClass(), "skillId", 365061041);
        setIntField(term49699, term49699.getClass(), "playKind", 205907008);
        setBooleanField(term49699, term49699.getClass(), "isClear", false);
        setIntField(term49699, term49699.getClass(), "skillLevel", -1281782269);
        setIntField(term49699, term49699.getClass(), "skillEffect", -1728872282);
        term49751 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term49751;
        callMethod(klass, "equals", argTypes, term49699, args);
    }

};


