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

public class RecentResp_setRank_205612328143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48457;
     Object term48509;

    public RecentResp_setRank_205612328143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48457 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48463 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48473 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48459, term48459.getClass(), "year", 2018);
        setShortField(term48459, term48459.getClass(), "month", (short) 11);
        setShortField(term48459, term48459.getClass(), "day", (short) 14);
        setField(term48458, term48458.getClass(), "date", term48459);
        setByteField(term48463, term48463.getClass(), "hour", (byte) 18);
        setByteField(term48463, term48463.getClass(), "minute", (byte) 31);
        setByteField(term48463, term48463.getClass(), "second", (byte) 15);
        setIntField(term48463, term48463.getClass(), "nano", 39699749);
        setField(term48458, term48458.getClass(), "time", term48463);
        setField(term48457, term48457.getClass(), "playDate", term48458);
        setIntField(term48469, term48469.getClass(), "year", 2019);
        setShortField(term48469, term48469.getClass(), "month", (short) 4);
        setShortField(term48469, term48469.getClass(), "day", (short) 21);
        setField(term48468, term48468.getClass(), "date", term48469);
        setByteField(term48473, term48473.getClass(), "hour", (byte) 12);
        setByteField(term48473, term48473.getClass(), "minute", (byte) 13);
        setByteField(term48473, term48473.getClass(), "second", (byte) 21);
        setIntField(term48473, term48473.getClass(), "nano", 906802544);
        setField(term48468, term48468.getClass(), "time", term48473);
        setField(term48457, term48457.getClass(), "userPlayDate", term48468);
        setIntField(term48457, term48457.getClass(), "musicId", 1638508595);
        setIntField(term48457, term48457.getClass(), "level", -114151747);
        setIntField(term48457, term48457.getClass(), "customId", -2025145756);
        setIntField(term48457, term48457.getClass(), "playedCustom1", -1865692813);
        setIntField(term48457, term48457.getClass(), "playedCustom2", 1996398924);
        setIntField(term48457, term48457.getClass(), "playedCustom3", -400305198);
        setIntField(term48457, term48457.getClass(), "track", 1551023146);
        setIntField(term48457, term48457.getClass(), "score", 545151275);
        setIntField(term48457, term48457.getClass(), "rank", -125397975);
        setIntField(term48457, term48457.getClass(), "maxCombo", -595763151);
        setIntField(term48457, term48457.getClass(), "maxChain", -1927187775);
        setIntField(term48457, term48457.getClass(), "rateTap", -246129741);
        setIntField(term48457, term48457.getClass(), "rateHold", -1681312941);
        setIntField(term48457, term48457.getClass(), "rateSlide", -2026593848);
        setIntField(term48457, term48457.getClass(), "rateAir", -1523977596);
        setIntField(term48457, term48457.getClass(), "rateFlick", -1036117253);
        setIntField(term48457, term48457.getClass(), "judgeGuilty", -697114016);
        setIntField(term48457, term48457.getClass(), "judgeAttack", 1991952957);
        setIntField(term48457, term48457.getClass(), "judgeJustice", 1877895251);
        setIntField(term48457, term48457.getClass(), "judgeCritical", 962916253);
        setIntField(term48457, term48457.getClass(), "playerRating", 1580094069);
        setBooleanField(term48457, term48457.getClass(), "isNewRecord", true);
        setBooleanField(term48457, term48457.getClass(), "isFullCombo", true);
        setIntField(term48457, term48457.getClass(), "fullChainKind", -890066143);
        setBooleanField(term48457, term48457.getClass(), "isAllJustice", true);
        setIntField(term48457, term48457.getClass(), "characterId", 1782477754);
        setIntField(term48457, term48457.getClass(), "skillId", 1979972143);
        setIntField(term48457, term48457.getClass(), "playKind", -1445141749);
        setBooleanField(term48457, term48457.getClass(), "isClear", false);
        setIntField(term48457, term48457.getClass(), "skillLevel", 231866725);
        setIntField(term48457, term48457.getClass(), "skillEffect", 264142674);
        term48509 = new Integer(318938584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48509;
        callMethod(klass, "setRank", argTypes, term48457, args);
    }

};


