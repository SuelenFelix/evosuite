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
import java.lang.Long;

public class ProfileResp_setTotalHiScore_100689114847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120154;
     Object term120229;

    public ProfileResp_setTotalHiScore_100689114847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120154 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120202 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120212 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120154, term120154.getClass(), "userName", "FVWEzQNAbm");
        setIntField(term120154, term120154.getClass(), "level", 2076691766);
        setField(term120154, term120154.getClass(), "exp", "otxUlpZpcf");
        setLongField(term120154, term120154.getClass(), "point", 5081404701350015572L);
        setLongField(term120154, term120154.getClass(), "totalPoint", -3975304277285445404L);
        setIntField(term120154, term120154.getClass(), "playCount", 725792728);
        setIntField(term120154, term120154.getClass(), "playerRating", 2009627354);
        setIntField(term120154, term120154.getClass(), "highestRating", 372564357);
        setIntField(term120154, term120154.getClass(), "nameplateId", 1881810072);
        setIntField(term120154, term120154.getClass(), "frameId", -2002371107);
        setIntField(term120154, term120154.getClass(), "characterId", -67732628);
        setIntField(term120154, term120154.getClass(), "trophyId", -2143167067);
        setIntField(term120154, term120154.getClass(), "totalMapNum", -268867566);
        setLongField(term120154, term120154.getClass(), "totalHiScore", -724066272816948155L);
        setLongField(term120154, term120154.getClass(), "totalBasicHighScore", -8080049785254177431L);
        setLongField(term120154, term120154.getClass(), "totalAdvancedHighScore", 9116984811565234208L);
        setLongField(term120154, term120154.getClass(), "totalExpertHighScore", -5186439316513011726L);
        setLongField(term120154, term120154.getClass(), "totalMasterHighScore", 5555758503849541646L);
        setLongField(term120154, term120154.getClass(), "totalUltimaHighScore", -6044969559481196759L);
        setIntField(term120154, term120154.getClass(), "friendCount", -1368324825);
        setIntField(term120198, term120198.getClass(), "year", 2019);
        setShortField(term120198, term120198.getClass(), "month", (short) 4);
        setShortField(term120198, term120198.getClass(), "day", (short) 18);
        setField(term120197, term120197.getClass(), "date", term120198);
        setByteField(term120202, term120202.getClass(), "hour", (byte) 5);
        setByteField(term120202, term120202.getClass(), "minute", (byte) 31);
        setByteField(term120202, term120202.getClass(), "second", (byte) 11);
        setIntField(term120202, term120202.getClass(), "nano", 517407556);
        setField(term120197, term120197.getClass(), "time", term120202);
        setField(term120154, term120154.getClass(), "firstPlayDate", term120197);
        setIntField(term120208, term120208.getClass(), "year", 2025);
        setShortField(term120208, term120208.getClass(), "month", (short) 11);
        setShortField(term120208, term120208.getClass(), "day", (short) 17);
        setField(term120207, term120207.getClass(), "date", term120208);
        setByteField(term120212, term120212.getClass(), "hour", (byte) 13);
        setByteField(term120212, term120212.getClass(), "minute", (byte) 3);
        setByteField(term120212, term120212.getClass(), "second", (byte) 27);
        setIntField(term120212, term120212.getClass(), "nano", 330815849);
        setField(term120207, term120207.getClass(), "time", term120212);
        setField(term120154, term120154.getClass(), "lastPlayDate", term120207);
        setIntField(term120154, term120154.getClass(), "courseClass", 2124587743);
        setIntField(term120154, term120154.getClass(), "overPowerPoint", 1847771140);
        setIntField(term120154, term120154.getClass(), "overPowerRate", -973633876);
        setIntField(term120154, term120154.getClass(), "mapIconId", 1564074317);
        setIntField(term120154, term120154.getClass(), "voiceId", 1054590910);
        setIntField(term120154, term120154.getClass(), "avatarWear", 274188951);
        setIntField(term120154, term120154.getClass(), "avatarHead", -1891277371);
        setIntField(term120154, term120154.getClass(), "avatarFace", 1549469218);
        setIntField(term120154, term120154.getClass(), "avatarSkin", 2140874867);
        setIntField(term120154, term120154.getClass(), "avatarItem", 1438511954);
        setIntField(term120154, term120154.getClass(), "avatarFront", 1297041461);
        setIntField(term120154, term120154.getClass(), "avatarBack", 1299466758);
        term120229 = new Long(-3717040050675321204L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term120229;
        callMethod(klass, "setTotalHiScore", argTypes, term120154, args);
    }

};


