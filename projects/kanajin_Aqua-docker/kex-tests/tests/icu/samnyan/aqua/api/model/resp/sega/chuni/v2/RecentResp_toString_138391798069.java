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

public class RecentResp_toString_138391798069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49857;

    public RecentResp_toString_138391798069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49857 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49873 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49859, term49859.getClass(), "year", 2022);
        setShortField(term49859, term49859.getClass(), "month", (short) 9);
        setShortField(term49859, term49859.getClass(), "day", (short) 13);
        setField(term49858, term49858.getClass(), "date", term49859);
        setByteField(term49863, term49863.getClass(), "hour", (byte) 3);
        setByteField(term49863, term49863.getClass(), "minute", (byte) 50);
        setByteField(term49863, term49863.getClass(), "second", (byte) 35);
        setIntField(term49863, term49863.getClass(), "nano", 260929854);
        setField(term49858, term49858.getClass(), "time", term49863);
        setField(term49857, term49857.getClass(), "playDate", term49858);
        setIntField(term49869, term49869.getClass(), "year", 2022);
        setShortField(term49869, term49869.getClass(), "month", (short) 4);
        setShortField(term49869, term49869.getClass(), "day", (short) 7);
        setField(term49868, term49868.getClass(), "date", term49869);
        setByteField(term49873, term49873.getClass(), "hour", (byte) 8);
        setByteField(term49873, term49873.getClass(), "minute", (byte) 56);
        setByteField(term49873, term49873.getClass(), "second", (byte) 3);
        setIntField(term49873, term49873.getClass(), "nano", 496160001);
        setField(term49868, term49868.getClass(), "time", term49873);
        setField(term49857, term49857.getClass(), "userPlayDate", term49868);
        setIntField(term49857, term49857.getClass(), "musicId", -706486666);
        setIntField(term49857, term49857.getClass(), "level", 1426550776);
        setIntField(term49857, term49857.getClass(), "customId", 1793694701);
        setIntField(term49857, term49857.getClass(), "playedCustom1", 1334634518);
        setIntField(term49857, term49857.getClass(), "playedCustom2", -1358832342);
        setIntField(term49857, term49857.getClass(), "playedCustom3", 330525017);
        setIntField(term49857, term49857.getClass(), "track", -2097182938);
        setIntField(term49857, term49857.getClass(), "score", -1911268197);
        setIntField(term49857, term49857.getClass(), "rank", 1989699628);
        setIntField(term49857, term49857.getClass(), "maxCombo", 1406976166);
        setIntField(term49857, term49857.getClass(), "maxChain", -683361157);
        setIntField(term49857, term49857.getClass(), "rateTap", 1735058829);
        setIntField(term49857, term49857.getClass(), "rateHold", -1945706596);
        setIntField(term49857, term49857.getClass(), "rateSlide", 13487895);
        setIntField(term49857, term49857.getClass(), "rateAir", 369911284);
        setIntField(term49857, term49857.getClass(), "rateFlick", 1488504614);
        setIntField(term49857, term49857.getClass(), "judgeGuilty", 661477727);
        setIntField(term49857, term49857.getClass(), "judgeAttack", 274618169);
        setIntField(term49857, term49857.getClass(), "judgeJustice", -1618606893);
        setIntField(term49857, term49857.getClass(), "judgeCritical", -560211840);
        setIntField(term49857, term49857.getClass(), "playerRating", 103542361);
        setBooleanField(term49857, term49857.getClass(), "isNewRecord", false);
        setBooleanField(term49857, term49857.getClass(), "isFullCombo", true);
        setIntField(term49857, term49857.getClass(), "fullChainKind", -1737221099);
        setBooleanField(term49857, term49857.getClass(), "isAllJustice", false);
        setIntField(term49857, term49857.getClass(), "characterId", -1032313881);
        setIntField(term49857, term49857.getClass(), "skillId", 1246554458);
        setIntField(term49857, term49857.getClass(), "playKind", -1913837862);
        setBooleanField(term49857, term49857.getClass(), "isClear", true);
        setIntField(term49857, term49857.getClass(), "skillLevel", -1428994415);
        setIntField(term49857, term49857.getClass(), "skillEffect", -1086104799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term49857, args);
    }

};


