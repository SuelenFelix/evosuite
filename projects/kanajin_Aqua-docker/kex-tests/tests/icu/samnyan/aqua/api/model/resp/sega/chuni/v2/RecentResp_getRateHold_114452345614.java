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

public class RecentResp_getRateHold_114452345614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46913;

    public RecentResp_getRateHold_114452345614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46913 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46919 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46929 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46915, term46915.getClass(), "year", 2024);
        setShortField(term46915, term46915.getClass(), "month", (short) 3);
        setShortField(term46915, term46915.getClass(), "day", (short) 30);
        setField(term46914, term46914.getClass(), "date", term46915);
        setByteField(term46919, term46919.getClass(), "hour", (byte) 7);
        setByteField(term46919, term46919.getClass(), "minute", (byte) 18);
        setByteField(term46919, term46919.getClass(), "second", (byte) 30);
        setIntField(term46919, term46919.getClass(), "nano", 930626265);
        setField(term46914, term46914.getClass(), "time", term46919);
        setField(term46913, term46913.getClass(), "playDate", term46914);
        setIntField(term46925, term46925.getClass(), "year", 2017);
        setShortField(term46925, term46925.getClass(), "month", (short) 10);
        setShortField(term46925, term46925.getClass(), "day", (short) 18);
        setField(term46924, term46924.getClass(), "date", term46925);
        setByteField(term46929, term46929.getClass(), "hour", (byte) 20);
        setByteField(term46929, term46929.getClass(), "minute", (byte) 35);
        setByteField(term46929, term46929.getClass(), "second", (byte) 5);
        setIntField(term46929, term46929.getClass(), "nano", 697625538);
        setField(term46924, term46924.getClass(), "time", term46929);
        setField(term46913, term46913.getClass(), "userPlayDate", term46924);
        setIntField(term46913, term46913.getClass(), "musicId", -2037695985);
        setIntField(term46913, term46913.getClass(), "level", -2044768479);
        setIntField(term46913, term46913.getClass(), "customId", -2020209498);
        setIntField(term46913, term46913.getClass(), "playedCustom1", 754066823);
        setIntField(term46913, term46913.getClass(), "playedCustom2", 306903225);
        setIntField(term46913, term46913.getClass(), "playedCustom3", -1245754321);
        setIntField(term46913, term46913.getClass(), "track", 398727237);
        setIntField(term46913, term46913.getClass(), "score", -1741920202);
        setIntField(term46913, term46913.getClass(), "rank", 1639977614);
        setIntField(term46913, term46913.getClass(), "maxCombo", -27270642);
        setIntField(term46913, term46913.getClass(), "maxChain", -1419515823);
        setIntField(term46913, term46913.getClass(), "rateTap", 1749999469);
        setIntField(term46913, term46913.getClass(), "rateHold", -1508018812);
        setIntField(term46913, term46913.getClass(), "rateSlide", -679973960);
        setIntField(term46913, term46913.getClass(), "rateAir", -85442762);
        setIntField(term46913, term46913.getClass(), "rateFlick", 295245507);
        setIntField(term46913, term46913.getClass(), "judgeGuilty", -1782801582);
        setIntField(term46913, term46913.getClass(), "judgeAttack", -112814060);
        setIntField(term46913, term46913.getClass(), "judgeJustice", -1111447214);
        setIntField(term46913, term46913.getClass(), "judgeCritical", 1463964937);
        setIntField(term46913, term46913.getClass(), "playerRating", -1207878110);
        setBooleanField(term46913, term46913.getClass(), "isNewRecord", false);
        setBooleanField(term46913, term46913.getClass(), "isFullCombo", true);
        setIntField(term46913, term46913.getClass(), "fullChainKind", -284421477);
        setBooleanField(term46913, term46913.getClass(), "isAllJustice", false);
        setIntField(term46913, term46913.getClass(), "characterId", 55419591);
        setIntField(term46913, term46913.getClass(), "skillId", 1020931980);
        setIntField(term46913, term46913.getClass(), "playKind", -1435032444);
        setBooleanField(term46913, term46913.getClass(), "isClear", false);
        setIntField(term46913, term46913.getClass(), "skillLevel", -420769218);
        setIntField(term46913, term46913.getClass(), "skillEffect", -1047476590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateHold", argTypes, term46913, args);
    }

};


