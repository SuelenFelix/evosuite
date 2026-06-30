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

public class RecentResp_getRank_155173045210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51875;

    public RecentResp_getRank_155173045210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51875 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51881 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51891 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51877, term51877.getClass(), "year", 2022);
        setShortField(term51877, term51877.getClass(), "month", (short) 6);
        setShortField(term51877, term51877.getClass(), "day", (short) 2);
        setField(term51876, term51876.getClass(), "date", term51877);
        setByteField(term51881, term51881.getClass(), "hour", (byte) 18);
        setByteField(term51881, term51881.getClass(), "minute", (byte) 14);
        setByteField(term51881, term51881.getClass(), "second", (byte) 42);
        setIntField(term51881, term51881.getClass(), "nano", 593545677);
        setField(term51876, term51876.getClass(), "time", term51881);
        setField(term51875, term51875.getClass(), "playDate", term51876);
        setIntField(term51887, term51887.getClass(), "year", 2010);
        setShortField(term51887, term51887.getClass(), "month", (short) 7);
        setShortField(term51887, term51887.getClass(), "day", (short) 19);
        setField(term51886, term51886.getClass(), "date", term51887);
        setByteField(term51891, term51891.getClass(), "hour", (byte) 16);
        setByteField(term51891, term51891.getClass(), "minute", (byte) 23);
        setByteField(term51891, term51891.getClass(), "second", (byte) 11);
        setIntField(term51891, term51891.getClass(), "nano", 638450755);
        setField(term51886, term51886.getClass(), "time", term51891);
        setField(term51875, term51875.getClass(), "userPlayDate", term51886);
        setIntField(term51875, term51875.getClass(), "musicId", 467573222);
        setIntField(term51875, term51875.getClass(), "level", -197212451);
        setIntField(term51875, term51875.getClass(), "customId", 213194885);
        setIntField(term51875, term51875.getClass(), "playedCustom1", 364063308);
        setIntField(term51875, term51875.getClass(), "playedCustom2", -787041664);
        setIntField(term51875, term51875.getClass(), "playedCustom3", 2141179437);
        setIntField(term51875, term51875.getClass(), "track", -826972140);
        setIntField(term51875, term51875.getClass(), "score", 737250028);
        setIntField(term51875, term51875.getClass(), "rank", -1870044711);
        setIntField(term51875, term51875.getClass(), "maxCombo", -719110417);
        setIntField(term51875, term51875.getClass(), "maxChain", -1866172730);
        setIntField(term51875, term51875.getClass(), "rateTap", 1129688211);
        setIntField(term51875, term51875.getClass(), "rateHold", 2126253731);
        setIntField(term51875, term51875.getClass(), "rateSlide", 1637943121);
        setIntField(term51875, term51875.getClass(), "rateAir", -1889806893);
        setIntField(term51875, term51875.getClass(), "rateFlick", 2101844302);
        setIntField(term51875, term51875.getClass(), "judgeGuilty", 1975711832);
        setIntField(term51875, term51875.getClass(), "judgeAttack", -712035661);
        setIntField(term51875, term51875.getClass(), "judgeJustice", -545530498);
        setIntField(term51875, term51875.getClass(), "judgeCritical", -1018874255);
        setIntField(term51875, term51875.getClass(), "playerRating", -268930414);
        setBooleanField(term51875, term51875.getClass(), "isNewRecord", false);
        setBooleanField(term51875, term51875.getClass(), "isFullCombo", false);
        setIntField(term51875, term51875.getClass(), "fullChainKind", 1036231784);
        setBooleanField(term51875, term51875.getClass(), "isAllJustice", false);
        setIntField(term51875, term51875.getClass(), "characterId", 732187274);
        setIntField(term51875, term51875.getClass(), "skillId", 1495500544);
        setIntField(term51875, term51875.getClass(), "playKind", -610532968);
        setBooleanField(term51875, term51875.getClass(), "isClear", false);
        setIntField(term51875, term51875.getClass(), "skillLevel", -1034929475);
        setIntField(term51875, term51875.getClass(), "skillEffect", 2125774573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRank", argTypes, term51875, args);
    }

};


