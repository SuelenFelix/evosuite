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

public class RecentResp_getMaxChain_69447648312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51979;

    public RecentResp_getMaxChain_69447648312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51979 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51985 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51990 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51991 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51995 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51981, term51981.getClass(), "year", 2017);
        setShortField(term51981, term51981.getClass(), "month", (short) 10);
        setShortField(term51981, term51981.getClass(), "day", (short) 10);
        setField(term51980, term51980.getClass(), "date", term51981);
        setByteField(term51985, term51985.getClass(), "hour", (byte) 18);
        setByteField(term51985, term51985.getClass(), "minute", (byte) 16);
        setByteField(term51985, term51985.getClass(), "second", (byte) 29);
        setIntField(term51985, term51985.getClass(), "nano", 468943994);
        setField(term51980, term51980.getClass(), "time", term51985);
        setField(term51979, term51979.getClass(), "playDate", term51980);
        setIntField(term51991, term51991.getClass(), "year", 2029);
        setShortField(term51991, term51991.getClass(), "month", (short) 3);
        setShortField(term51991, term51991.getClass(), "day", (short) 21);
        setField(term51990, term51990.getClass(), "date", term51991);
        setByteField(term51995, term51995.getClass(), "hour", (byte) 12);
        setByteField(term51995, term51995.getClass(), "minute", (byte) 42);
        setByteField(term51995, term51995.getClass(), "second", (byte) 52);
        setIntField(term51995, term51995.getClass(), "nano", 391302765);
        setField(term51990, term51990.getClass(), "time", term51995);
        setField(term51979, term51979.getClass(), "userPlayDate", term51990);
        setIntField(term51979, term51979.getClass(), "musicId", 1536865175);
        setIntField(term51979, term51979.getClass(), "level", -1059947211);
        setIntField(term51979, term51979.getClass(), "customId", -768583538);
        setIntField(term51979, term51979.getClass(), "playedCustom1", 372329686);
        setIntField(term51979, term51979.getClass(), "playedCustom2", -381739191);
        setIntField(term51979, term51979.getClass(), "playedCustom3", -432438127);
        setIntField(term51979, term51979.getClass(), "track", 44813544);
        setIntField(term51979, term51979.getClass(), "score", 654539936);
        setIntField(term51979, term51979.getClass(), "rank", -929524036);
        setIntField(term51979, term51979.getClass(), "maxCombo", 1539575963);
        setIntField(term51979, term51979.getClass(), "maxChain", -381662221);
        setIntField(term51979, term51979.getClass(), "rateTap", -1367263864);
        setIntField(term51979, term51979.getClass(), "rateHold", 1810292112);
        setIntField(term51979, term51979.getClass(), "rateSlide", 385619995);
        setIntField(term51979, term51979.getClass(), "rateAir", -920852160);
        setIntField(term51979, term51979.getClass(), "rateFlick", -1975385844);
        setIntField(term51979, term51979.getClass(), "judgeGuilty", -720629032);
        setIntField(term51979, term51979.getClass(), "judgeAttack", 398554038);
        setIntField(term51979, term51979.getClass(), "judgeJustice", -1454206593);
        setIntField(term51979, term51979.getClass(), "judgeCritical", 675396436);
        setIntField(term51979, term51979.getClass(), "playerRating", -41963319);
        setBooleanField(term51979, term51979.getClass(), "isNewRecord", true);
        setBooleanField(term51979, term51979.getClass(), "isFullCombo", false);
        setIntField(term51979, term51979.getClass(), "fullChainKind", -831752810);
        setBooleanField(term51979, term51979.getClass(), "isAllJustice", true);
        setIntField(term51979, term51979.getClass(), "characterId", -386141354);
        setIntField(term51979, term51979.getClass(), "skillId", -226677391);
        setIntField(term51979, term51979.getClass(), "playKind", -1991945298);
        setBooleanField(term51979, term51979.getClass(), "isClear", false);
        setIntField(term51979, term51979.getClass(), "skillLevel", 110090057);
        setIntField(term51979, term51979.getClass(), "skillEffect", 1975165299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxChain", argTypes, term51979, args);
    }

};


