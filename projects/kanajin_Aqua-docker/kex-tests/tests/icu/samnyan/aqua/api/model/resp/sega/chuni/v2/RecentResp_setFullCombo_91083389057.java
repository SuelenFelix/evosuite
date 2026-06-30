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

public class RecentResp_setFullCombo_91083389057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49213;
     Object term49265;

    public RecentResp_setFullCombo_91083389057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49213 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49219 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49229 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49215, term49215.getClass(), "year", 2027);
        setShortField(term49215, term49215.getClass(), "month", (short) 1);
        setShortField(term49215, term49215.getClass(), "day", (short) 12);
        setField(term49214, term49214.getClass(), "date", term49215);
        setByteField(term49219, term49219.getClass(), "hour", (byte) 12);
        setByteField(term49219, term49219.getClass(), "minute", (byte) 12);
        setByteField(term49219, term49219.getClass(), "second", (byte) 21);
        setIntField(term49219, term49219.getClass(), "nano", 77791222);
        setField(term49214, term49214.getClass(), "time", term49219);
        setField(term49213, term49213.getClass(), "playDate", term49214);
        setIntField(term49225, term49225.getClass(), "year", 2018);
        setShortField(term49225, term49225.getClass(), "month", (short) 8);
        setShortField(term49225, term49225.getClass(), "day", (short) 2);
        setField(term49224, term49224.getClass(), "date", term49225);
        setByteField(term49229, term49229.getClass(), "hour", (byte) 20);
        setByteField(term49229, term49229.getClass(), "minute", (byte) 18);
        setByteField(term49229, term49229.getClass(), "second", (byte) 22);
        setIntField(term49229, term49229.getClass(), "nano", 639407296);
        setField(term49224, term49224.getClass(), "time", term49229);
        setField(term49213, term49213.getClass(), "userPlayDate", term49224);
        setIntField(term49213, term49213.getClass(), "musicId", 565614678);
        setIntField(term49213, term49213.getClass(), "level", -1248504675);
        setIntField(term49213, term49213.getClass(), "customId", 1366246744);
        setIntField(term49213, term49213.getClass(), "playedCustom1", -369295588);
        setIntField(term49213, term49213.getClass(), "playedCustom2", 728215296);
        setIntField(term49213, term49213.getClass(), "playedCustom3", -1236147031);
        setIntField(term49213, term49213.getClass(), "track", 2030051112);
        setIntField(term49213, term49213.getClass(), "score", 1023614449);
        setIntField(term49213, term49213.getClass(), "rank", -717220010);
        setIntField(term49213, term49213.getClass(), "maxCombo", 280068573);
        setIntField(term49213, term49213.getClass(), "maxChain", -1081530515);
        setIntField(term49213, term49213.getClass(), "rateTap", 492096339);
        setIntField(term49213, term49213.getClass(), "rateHold", -1679827671);
        setIntField(term49213, term49213.getClass(), "rateSlide", 932019255);
        setIntField(term49213, term49213.getClass(), "rateAir", 1939661233);
        setIntField(term49213, term49213.getClass(), "rateFlick", -485147289);
        setIntField(term49213, term49213.getClass(), "judgeGuilty", -1098526777);
        setIntField(term49213, term49213.getClass(), "judgeAttack", 871491464);
        setIntField(term49213, term49213.getClass(), "judgeJustice", 1250354269);
        setIntField(term49213, term49213.getClass(), "judgeCritical", 695748317);
        setIntField(term49213, term49213.getClass(), "playerRating", -439470959);
        setBooleanField(term49213, term49213.getClass(), "isNewRecord", true);
        setBooleanField(term49213, term49213.getClass(), "isFullCombo", true);
        setIntField(term49213, term49213.getClass(), "fullChainKind", -248472453);
        setBooleanField(term49213, term49213.getClass(), "isAllJustice", true);
        setIntField(term49213, term49213.getClass(), "characterId", 1056759659);
        setIntField(term49213, term49213.getClass(), "skillId", -233313895);
        setIntField(term49213, term49213.getClass(), "playKind", 2014416586);
        setBooleanField(term49213, term49213.getClass(), "isClear", true);
        setIntField(term49213, term49213.getClass(), "skillLevel", 1614071253);
        setIntField(term49213, term49213.getClass(), "skillEffect", -548611489);
        term49265 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term49265;
        callMethod(klass, "setFullCombo", argTypes, term49213, args);
    }

};


