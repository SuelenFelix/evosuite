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
import java.lang.Boolean;

public class RecentResp_setClear_152460343563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54707;
     Object term54759;

    public RecentResp_setClear_152460343563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54707 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54723 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54709, term54709.getClass(), "year", 2018);
        setShortField(term54709, term54709.getClass(), "month", (short) 1);
        setShortField(term54709, term54709.getClass(), "day", (short) 24);
        setField(term54708, term54708.getClass(), "date", term54709);
        setByteField(term54713, term54713.getClass(), "hour", (byte) 11);
        setByteField(term54713, term54713.getClass(), "minute", (byte) 50);
        setByteField(term54713, term54713.getClass(), "second", (byte) 41);
        setIntField(term54713, term54713.getClass(), "nano", 402572098);
        setField(term54708, term54708.getClass(), "time", term54713);
        setField(term54707, term54707.getClass(), "playDate", term54708);
        setIntField(term54719, term54719.getClass(), "year", 2021);
        setShortField(term54719, term54719.getClass(), "month", (short) 11);
        setShortField(term54719, term54719.getClass(), "day", (short) 14);
        setField(term54718, term54718.getClass(), "date", term54719);
        setByteField(term54723, term54723.getClass(), "hour", (byte) 3);
        setByteField(term54723, term54723.getClass(), "minute", (byte) 30);
        setByteField(term54723, term54723.getClass(), "second", (byte) 36);
        setIntField(term54723, term54723.getClass(), "nano", 680228713);
        setField(term54718, term54718.getClass(), "time", term54723);
        setField(term54707, term54707.getClass(), "userPlayDate", term54718);
        setIntField(term54707, term54707.getClass(), "musicId", -908724029);
        setIntField(term54707, term54707.getClass(), "level", 1122198417);
        setIntField(term54707, term54707.getClass(), "customId", 1853596233);
        setIntField(term54707, term54707.getClass(), "playedCustom1", 995880114);
        setIntField(term54707, term54707.getClass(), "playedCustom2", -375101902);
        setIntField(term54707, term54707.getClass(), "playedCustom3", -400603688);
        setIntField(term54707, term54707.getClass(), "track", 2063246363);
        setIntField(term54707, term54707.getClass(), "score", 1989206053);
        setIntField(term54707, term54707.getClass(), "rank", 68383055);
        setIntField(term54707, term54707.getClass(), "maxCombo", -2072291494);
        setIntField(term54707, term54707.getClass(), "maxChain", 1818270937);
        setIntField(term54707, term54707.getClass(), "rateTap", -1309831162);
        setIntField(term54707, term54707.getClass(), "rateHold", 711539163);
        setIntField(term54707, term54707.getClass(), "rateSlide", 351652776);
        setIntField(term54707, term54707.getClass(), "rateAir", 319658723);
        setIntField(term54707, term54707.getClass(), "rateFlick", 1315068409);
        setIntField(term54707, term54707.getClass(), "judgeGuilty", 1002887761);
        setIntField(term54707, term54707.getClass(), "judgeAttack", 38995637);
        setIntField(term54707, term54707.getClass(), "judgeJustice", -2106212589);
        setIntField(term54707, term54707.getClass(), "judgeCritical", 1881486751);
        setIntField(term54707, term54707.getClass(), "playerRating", -92679624);
        setBooleanField(term54707, term54707.getClass(), "isNewRecord", false);
        setBooleanField(term54707, term54707.getClass(), "isFullCombo", true);
        setIntField(term54707, term54707.getClass(), "fullChainKind", 935287448);
        setBooleanField(term54707, term54707.getClass(), "isAllJustice", false);
        setIntField(term54707, term54707.getClass(), "characterId", -315809486);
        setIntField(term54707, term54707.getClass(), "skillId", -1846398473);
        setIntField(term54707, term54707.getClass(), "playKind", -11976264);
        setBooleanField(term54707, term54707.getClass(), "isClear", false);
        setIntField(term54707, term54707.getClass(), "skillLevel", 1655201167);
        setIntField(term54707, term54707.getClass(), "skillEffect", -613873747);
        term54759 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54759;
        callMethod(klass, "setClear", argTypes, term54707, args);
    }

};


