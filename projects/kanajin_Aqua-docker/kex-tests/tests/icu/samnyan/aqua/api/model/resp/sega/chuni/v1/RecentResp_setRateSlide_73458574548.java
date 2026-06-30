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

public class RecentResp_setRateSlide_73458574548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53897;
     Object term53949;

    public RecentResp_setRateSlide_73458574548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53897 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53903 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53913 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53899, term53899.getClass(), "year", 2014);
        setShortField(term53899, term53899.getClass(), "month", (short) 7);
        setShortField(term53899, term53899.getClass(), "day", (short) 5);
        setField(term53898, term53898.getClass(), "date", term53899);
        setByteField(term53903, term53903.getClass(), "hour", (byte) 16);
        setByteField(term53903, term53903.getClass(), "minute", (byte) 28);
        setByteField(term53903, term53903.getClass(), "second", (byte) 51);
        setIntField(term53903, term53903.getClass(), "nano", 627591414);
        setField(term53898, term53898.getClass(), "time", term53903);
        setField(term53897, term53897.getClass(), "playDate", term53898);
        setIntField(term53909, term53909.getClass(), "year", 2028);
        setShortField(term53909, term53909.getClass(), "month", (short) 7);
        setShortField(term53909, term53909.getClass(), "day", (short) 20);
        setField(term53908, term53908.getClass(), "date", term53909);
        setByteField(term53913, term53913.getClass(), "hour", (byte) 23);
        setByteField(term53913, term53913.getClass(), "minute", (byte) 53);
        setByteField(term53913, term53913.getClass(), "second", (byte) 34);
        setIntField(term53913, term53913.getClass(), "nano", 196205860);
        setField(term53908, term53908.getClass(), "time", term53913);
        setField(term53897, term53897.getClass(), "userPlayDate", term53908);
        setIntField(term53897, term53897.getClass(), "musicId", -1058283823);
        setIntField(term53897, term53897.getClass(), "level", -1620576583);
        setIntField(term53897, term53897.getClass(), "customId", -1365748841);
        setIntField(term53897, term53897.getClass(), "playedCustom1", 1223391792);
        setIntField(term53897, term53897.getClass(), "playedCustom2", -1134943583);
        setIntField(term53897, term53897.getClass(), "playedCustom3", -694277686);
        setIntField(term53897, term53897.getClass(), "track", -2044994445);
        setIntField(term53897, term53897.getClass(), "score", -883941371);
        setIntField(term53897, term53897.getClass(), "rank", -1545047968);
        setIntField(term53897, term53897.getClass(), "maxCombo", 665116636);
        setIntField(term53897, term53897.getClass(), "maxChain", 1255353874);
        setIntField(term53897, term53897.getClass(), "rateTap", 550111365);
        setIntField(term53897, term53897.getClass(), "rateHold", 1756090789);
        setIntField(term53897, term53897.getClass(), "rateSlide", -315044098);
        setIntField(term53897, term53897.getClass(), "rateAir", 2920253);
        setIntField(term53897, term53897.getClass(), "rateFlick", 310113293);
        setIntField(term53897, term53897.getClass(), "judgeGuilty", -1668505285);
        setIntField(term53897, term53897.getClass(), "judgeAttack", 9043673);
        setIntField(term53897, term53897.getClass(), "judgeJustice", 2059842684);
        setIntField(term53897, term53897.getClass(), "judgeCritical", 578623316);
        setIntField(term53897, term53897.getClass(), "playerRating", -676216760);
        setBooleanField(term53897, term53897.getClass(), "isNewRecord", true);
        setBooleanField(term53897, term53897.getClass(), "isFullCombo", true);
        setIntField(term53897, term53897.getClass(), "fullChainKind", 1859109121);
        setBooleanField(term53897, term53897.getClass(), "isAllJustice", true);
        setIntField(term53897, term53897.getClass(), "characterId", 1727853532);
        setIntField(term53897, term53897.getClass(), "skillId", -54706718);
        setIntField(term53897, term53897.getClass(), "playKind", 461863345);
        setBooleanField(term53897, term53897.getClass(), "isClear", true);
        setIntField(term53897, term53897.getClass(), "skillLevel", 733174414);
        setIntField(term53897, term53897.getClass(), "skillEffect", -1055100686);
        term53949 = new Integer(1994661826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53949;
        callMethod(klass, "setRateSlide", argTypes, term53897, args);
    }

};


