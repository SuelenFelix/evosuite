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

public class RecentResp_hashCode_189467767068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49805;

    public RecentResp_hashCode_189467767068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49805 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49811 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49821 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49807, term49807.getClass(), "year", 2014);
        setShortField(term49807, term49807.getClass(), "month", (short) 1);
        setShortField(term49807, term49807.getClass(), "day", (short) 23);
        setField(term49806, term49806.getClass(), "date", term49807);
        setByteField(term49811, term49811.getClass(), "hour", (byte) 19);
        setByteField(term49811, term49811.getClass(), "minute", (byte) 10);
        setByteField(term49811, term49811.getClass(), "second", (byte) 5);
        setIntField(term49811, term49811.getClass(), "nano", 522099168);
        setField(term49806, term49806.getClass(), "time", term49811);
        setField(term49805, term49805.getClass(), "playDate", term49806);
        setIntField(term49817, term49817.getClass(), "year", 2024);
        setShortField(term49817, term49817.getClass(), "month", (short) 11);
        setShortField(term49817, term49817.getClass(), "day", (short) 12);
        setField(term49816, term49816.getClass(), "date", term49817);
        setByteField(term49821, term49821.getClass(), "hour", (byte) 7);
        setByteField(term49821, term49821.getClass(), "minute", (byte) 0);
        setByteField(term49821, term49821.getClass(), "second", (byte) 20);
        setIntField(term49821, term49821.getClass(), "nano", 646827761);
        setField(term49816, term49816.getClass(), "time", term49821);
        setField(term49805, term49805.getClass(), "userPlayDate", term49816);
        setIntField(term49805, term49805.getClass(), "musicId", -1134943583);
        setIntField(term49805, term49805.getClass(), "level", -694277686);
        setIntField(term49805, term49805.getClass(), "customId", -2044994445);
        setIntField(term49805, term49805.getClass(), "playedCustom1", -883941371);
        setIntField(term49805, term49805.getClass(), "playedCustom2", -1545047968);
        setIntField(term49805, term49805.getClass(), "playedCustom3", 665116636);
        setIntField(term49805, term49805.getClass(), "track", 1255353874);
        setIntField(term49805, term49805.getClass(), "score", 550111365);
        setIntField(term49805, term49805.getClass(), "rank", 1756090789);
        setIntField(term49805, term49805.getClass(), "maxCombo", -315044098);
        setIntField(term49805, term49805.getClass(), "maxChain", 2920253);
        setIntField(term49805, term49805.getClass(), "rateTap", 310113293);
        setIntField(term49805, term49805.getClass(), "rateHold", -1668505285);
        setIntField(term49805, term49805.getClass(), "rateSlide", 9043673);
        setIntField(term49805, term49805.getClass(), "rateAir", 2059842684);
        setIntField(term49805, term49805.getClass(), "rateFlick", 578623316);
        setIntField(term49805, term49805.getClass(), "judgeGuilty", -676216760);
        setIntField(term49805, term49805.getClass(), "judgeAttack", 1859109121);
        setIntField(term49805, term49805.getClass(), "judgeJustice", 1727853532);
        setIntField(term49805, term49805.getClass(), "judgeCritical", -54706718);
        setIntField(term49805, term49805.getClass(), "playerRating", 461863345);
        setBooleanField(term49805, term49805.getClass(), "isNewRecord", false);
        setBooleanField(term49805, term49805.getClass(), "isFullCombo", true);
        setIntField(term49805, term49805.getClass(), "fullChainKind", 733174414);
        setBooleanField(term49805, term49805.getClass(), "isAllJustice", false);
        setIntField(term49805, term49805.getClass(), "characterId", -1055100686);
        setIntField(term49805, term49805.getClass(), "skillId", 1994661826);
        setIntField(term49805, term49805.getClass(), "playKind", -2050574403);
        setBooleanField(term49805, term49805.getClass(), "isClear", false);
        setIntField(term49805, term49805.getClass(), "skillLevel", 1891840747);
        setIntField(term49805, term49805.getClass(), "skillEffect", -118389472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term49805, args);
    }

};


