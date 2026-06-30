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

public class RecentResp_setRateHold_7336198347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53843;
     Object term53895;

    public RecentResp_setRateHold_7336198347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53843 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53844 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53849 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53859 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53845, term53845.getClass(), "year", 2014);
        setShortField(term53845, term53845.getClass(), "month", (short) 3);
        setShortField(term53845, term53845.getClass(), "day", (short) 18);
        setField(term53844, term53844.getClass(), "date", term53845);
        setByteField(term53849, term53849.getClass(), "hour", (byte) 9);
        setByteField(term53849, term53849.getClass(), "minute", (byte) 35);
        setByteField(term53849, term53849.getClass(), "second", (byte) 23);
        setIntField(term53849, term53849.getClass(), "nano", 260496752);
        setField(term53844, term53844.getClass(), "time", term53849);
        setField(term53843, term53843.getClass(), "playDate", term53844);
        setIntField(term53855, term53855.getClass(), "year", 2021);
        setShortField(term53855, term53855.getClass(), "month", (short) 7);
        setShortField(term53855, term53855.getClass(), "day", (short) 28);
        setField(term53854, term53854.getClass(), "date", term53855);
        setByteField(term53859, term53859.getClass(), "hour", (byte) 23);
        setByteField(term53859, term53859.getClass(), "minute", (byte) 12);
        setByteField(term53859, term53859.getClass(), "second", (byte) 32);
        setIntField(term53859, term53859.getClass(), "nano", 773887991);
        setField(term53854, term53854.getClass(), "time", term53859);
        setField(term53843, term53843.getClass(), "userPlayDate", term53854);
        setIntField(term53843, term53843.getClass(), "musicId", 1988824012);
        setIntField(term53843, term53843.getClass(), "level", 365061041);
        setIntField(term53843, term53843.getClass(), "customId", 205907008);
        setIntField(term53843, term53843.getClass(), "playedCustom1", -1281782269);
        setIntField(term53843, term53843.getClass(), "playedCustom2", -1728872282);
        setIntField(term53843, term53843.getClass(), "playedCustom3", -537646987);
        setIntField(term53843, term53843.getClass(), "track", -558527010);
        setIntField(term53843, term53843.getClass(), "score", -271207664);
        setIntField(term53843, term53843.getClass(), "rank", -1452529928);
        setIntField(term53843, term53843.getClass(), "maxCombo", -467618426);
        setIntField(term53843, term53843.getClass(), "maxChain", 1728446971);
        setIntField(term53843, term53843.getClass(), "rateTap", 871757481);
        setIntField(term53843, term53843.getClass(), "rateHold", -866223414);
        setIntField(term53843, term53843.getClass(), "rateSlide", -914821646);
        setIntField(term53843, term53843.getClass(), "rateAir", -1420229744);
        setIntField(term53843, term53843.getClass(), "rateFlick", -2026011046);
        setIntField(term53843, term53843.getClass(), "judgeGuilty", -930966430);
        setIntField(term53843, term53843.getClass(), "judgeAttack", -1137340653);
        setIntField(term53843, term53843.getClass(), "judgeJustice", -520048649);
        setIntField(term53843, term53843.getClass(), "judgeCritical", -39379486);
        setIntField(term53843, term53843.getClass(), "playerRating", 92637602);
        setBooleanField(term53843, term53843.getClass(), "isNewRecord", false);
        setBooleanField(term53843, term53843.getClass(), "isFullCombo", false);
        setIntField(term53843, term53843.getClass(), "fullChainKind", -702644184);
        setBooleanField(term53843, term53843.getClass(), "isAllJustice", false);
        setIntField(term53843, term53843.getClass(), "characterId", 873158899);
        setIntField(term53843, term53843.getClass(), "skillId", -939494687);
        setIntField(term53843, term53843.getClass(), "playKind", 1818886574);
        setBooleanField(term53843, term53843.getClass(), "isClear", false);
        setIntField(term53843, term53843.getClass(), "skillLevel", -1082194143);
        setIntField(term53843, term53843.getClass(), "skillEffect", 1109687027);
        term53895 = new Integer(-1583077425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53895;
        callMethod(klass, "setRateHold", argTypes, term53843, args);
    }

};


