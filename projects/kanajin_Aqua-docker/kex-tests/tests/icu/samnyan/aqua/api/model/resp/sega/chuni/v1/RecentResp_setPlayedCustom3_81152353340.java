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

public class RecentResp_setPlayedCustom3_81152353340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53465;
     Object term53517;

    public RecentResp_setPlayedCustom3_81152353340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53465 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53466 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53467 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53471 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53481 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53467, term53467.getClass(), "year", 2023);
        setShortField(term53467, term53467.getClass(), "month", (short) 7);
        setShortField(term53467, term53467.getClass(), "day", (short) 18);
        setField(term53466, term53466.getClass(), "date", term53467);
        setByteField(term53471, term53471.getClass(), "hour", (byte) 11);
        setByteField(term53471, term53471.getClass(), "minute", (byte) 33);
        setByteField(term53471, term53471.getClass(), "second", (byte) 28);
        setIntField(term53471, term53471.getClass(), "nano", 15208773);
        setField(term53466, term53466.getClass(), "time", term53471);
        setField(term53465, term53465.getClass(), "playDate", term53466);
        setIntField(term53477, term53477.getClass(), "year", 2011);
        setShortField(term53477, term53477.getClass(), "month", (short) 11);
        setShortField(term53477, term53477.getClass(), "day", (short) 13);
        setField(term53476, term53476.getClass(), "date", term53477);
        setByteField(term53481, term53481.getClass(), "hour", (byte) 17);
        setByteField(term53481, term53481.getClass(), "minute", (byte) 43);
        setByteField(term53481, term53481.getClass(), "second", (byte) 47);
        setIntField(term53481, term53481.getClass(), "nano", 537140404);
        setField(term53476, term53476.getClass(), "time", term53481);
        setField(term53465, term53465.getClass(), "userPlayDate", term53476);
        setIntField(term53465, term53465.getClass(), "musicId", -157082836);
        setIntField(term53465, term53465.getClass(), "level", 1665464572);
        setIntField(term53465, term53465.getClass(), "customId", -685125586);
        setIntField(term53465, term53465.getClass(), "playedCustom1", 708362673);
        setIntField(term53465, term53465.getClass(), "playedCustom2", -630444357);
        setIntField(term53465, term53465.getClass(), "playedCustom3", 936421624);
        setIntField(term53465, term53465.getClass(), "track", -616512894);
        setIntField(term53465, term53465.getClass(), "score", 710841913);
        setIntField(term53465, term53465.getClass(), "rank", 293875732);
        setIntField(term53465, term53465.getClass(), "maxCombo", -375636222);
        setIntField(term53465, term53465.getClass(), "maxChain", 2019131833);
        setIntField(term53465, term53465.getClass(), "rateTap", -2057057319);
        setIntField(term53465, term53465.getClass(), "rateHold", -872007840);
        setIntField(term53465, term53465.getClass(), "rateSlide", 614977875);
        setIntField(term53465, term53465.getClass(), "rateAir", -424672642);
        setIntField(term53465, term53465.getClass(), "rateFlick", -1836107736);
        setIntField(term53465, term53465.getClass(), "judgeGuilty", 1774306588);
        setIntField(term53465, term53465.getClass(), "judgeAttack", 897867869);
        setIntField(term53465, term53465.getClass(), "judgeJustice", -1058380964);
        setIntField(term53465, term53465.getClass(), "judgeCritical", 1144389305);
        setIntField(term53465, term53465.getClass(), "playerRating", 785140032);
        setBooleanField(term53465, term53465.getClass(), "isNewRecord", true);
        setBooleanField(term53465, term53465.getClass(), "isFullCombo", false);
        setIntField(term53465, term53465.getClass(), "fullChainKind", 2011478303);
        setBooleanField(term53465, term53465.getClass(), "isAllJustice", true);
        setIntField(term53465, term53465.getClass(), "characterId", -1064254847);
        setIntField(term53465, term53465.getClass(), "skillId", 427797900);
        setIntField(term53465, term53465.getClass(), "playKind", 948009124);
        setBooleanField(term53465, term53465.getClass(), "isClear", false);
        setIntField(term53465, term53465.getClass(), "skillLevel", 1688840379);
        setIntField(term53465, term53465.getClass(), "skillEffect", -1811534908);
        term53517 = new Integer(-1024774970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53517;
        callMethod(klass, "setPlayedCustom3", argTypes, term53465, args);
    }

};


