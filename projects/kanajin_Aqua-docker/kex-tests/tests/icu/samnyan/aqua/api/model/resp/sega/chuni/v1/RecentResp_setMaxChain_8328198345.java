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

public class RecentResp_setMaxChain_8328198345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53735;
     Object term53787;

    public RecentResp_setMaxChain_8328198345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53735 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53736 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53737 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53741 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53751 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53737, term53737.getClass(), "year", 2011);
        setShortField(term53737, term53737.getClass(), "month", (short) 12);
        setShortField(term53737, term53737.getClass(), "day", (short) 10);
        setField(term53736, term53736.getClass(), "date", term53737);
        setByteField(term53741, term53741.getClass(), "hour", (byte) 13);
        setByteField(term53741, term53741.getClass(), "minute", (byte) 50);
        setByteField(term53741, term53741.getClass(), "second", (byte) 43);
        setIntField(term53741, term53741.getClass(), "nano", 632619706);
        setField(term53736, term53736.getClass(), "time", term53741);
        setField(term53735, term53735.getClass(), "playDate", term53736);
        setIntField(term53747, term53747.getClass(), "year", 2016);
        setShortField(term53747, term53747.getClass(), "month", (short) 9);
        setShortField(term53747, term53747.getClass(), "day", (short) 16);
        setField(term53746, term53746.getClass(), "date", term53747);
        setByteField(term53751, term53751.getClass(), "hour", (byte) 16);
        setByteField(term53751, term53751.getClass(), "minute", (byte) 33);
        setByteField(term53751, term53751.getClass(), "second", (byte) 2);
        setIntField(term53751, term53751.getClass(), "nano", 767888558);
        setField(term53746, term53746.getClass(), "time", term53751);
        setField(term53735, term53735.getClass(), "userPlayDate", term53746);
        setIntField(term53735, term53735.getClass(), "musicId", 341013967);
        setIntField(term53735, term53735.getClass(), "level", 1873439089);
        setIntField(term53735, term53735.getClass(), "customId", -1069668783);
        setIntField(term53735, term53735.getClass(), "playedCustom1", -301450995);
        setIntField(term53735, term53735.getClass(), "playedCustom2", 753886838);
        setIntField(term53735, term53735.getClass(), "playedCustom3", -1802788931);
        setIntField(term53735, term53735.getClass(), "track", 505497573);
        setIntField(term53735, term53735.getClass(), "score", 1848062442);
        setIntField(term53735, term53735.getClass(), "rank", -122481618);
        setIntField(term53735, term53735.getClass(), "maxCombo", -82929535);
        setIntField(term53735, term53735.getClass(), "maxChain", 1850505181);
        setIntField(term53735, term53735.getClass(), "rateTap", 324766253);
        setIntField(term53735, term53735.getClass(), "rateHold", -1128978986);
        setIntField(term53735, term53735.getClass(), "rateSlide", 192962115);
        setIntField(term53735, term53735.getClass(), "rateAir", 1531205463);
        setIntField(term53735, term53735.getClass(), "rateFlick", 586115489);
        setIntField(term53735, term53735.getClass(), "judgeGuilty", 1377331021);
        setIntField(term53735, term53735.getClass(), "judgeAttack", 1915536131);
        setIntField(term53735, term53735.getClass(), "judgeJustice", 936561631);
        setIntField(term53735, term53735.getClass(), "judgeCritical", -160474197);
        setIntField(term53735, term53735.getClass(), "playerRating", 279768924);
        setBooleanField(term53735, term53735.getClass(), "isNewRecord", false);
        setBooleanField(term53735, term53735.getClass(), "isFullCombo", false);
        setIntField(term53735, term53735.getClass(), "fullChainKind", 1949719112);
        setBooleanField(term53735, term53735.getClass(), "isAllJustice", true);
        setIntField(term53735, term53735.getClass(), "characterId", 203059697);
        setIntField(term53735, term53735.getClass(), "skillId", 260352378);
        setIntField(term53735, term53735.getClass(), "playKind", -1344061485);
        setBooleanField(term53735, term53735.getClass(), "isClear", true);
        setIntField(term53735, term53735.getClass(), "skillLevel", -13926283);
        setIntField(term53735, term53735.getClass(), "skillEffect", -1240452164);
        term53787 = new Integer(501130109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53787;
        callMethod(klass, "setMaxChain", argTypes, term53735, args);
    }

};


