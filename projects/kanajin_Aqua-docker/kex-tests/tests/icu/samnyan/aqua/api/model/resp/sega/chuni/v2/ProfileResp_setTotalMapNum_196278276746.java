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

public class ProfileResp_setTotalMapNum_196278276746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120057;
     Object term120132;

    public ProfileResp_setTotalMapNum_196278276746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120057 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120105 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120111 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120115 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120057, term120057.getClass(), "userName", "bFRkUYAxoi");
        setIntField(term120057, term120057.getClass(), "level", -1590085666);
        setField(term120057, term120057.getClass(), "exp", "ibOCzSlAfB");
        setLongField(term120057, term120057.getClass(), "point", 3816410054760960914L);
        setLongField(term120057, term120057.getClass(), "totalPoint", -6232410367831760531L);
        setIntField(term120057, term120057.getClass(), "playCount", -1949560667);
        setIntField(term120057, term120057.getClass(), "playerRating", -151150895);
        setIntField(term120057, term120057.getClass(), "highestRating", -535666665);
        setIntField(term120057, term120057.getClass(), "nameplateId", 1787479974);
        setIntField(term120057, term120057.getClass(), "frameId", -1296541778);
        setIntField(term120057, term120057.getClass(), "characterId", -2129467936);
        setIntField(term120057, term120057.getClass(), "trophyId", -372496644);
        setIntField(term120057, term120057.getClass(), "totalMapNum", -562703632);
        setLongField(term120057, term120057.getClass(), "totalHiScore", 2828639518050386066L);
        setLongField(term120057, term120057.getClass(), "totalBasicHighScore", -6705862032122161454L);
        setLongField(term120057, term120057.getClass(), "totalAdvancedHighScore", -8153349613425308115L);
        setLongField(term120057, term120057.getClass(), "totalExpertHighScore", 1290649024236556228L);
        setLongField(term120057, term120057.getClass(), "totalMasterHighScore", 4611475637593877402L);
        setLongField(term120057, term120057.getClass(), "totalUltimaHighScore", 6027182674428873748L);
        setIntField(term120057, term120057.getClass(), "friendCount", -2067333024);
        setIntField(term120101, term120101.getClass(), "year", 2020);
        setShortField(term120101, term120101.getClass(), "month", (short) 8);
        setShortField(term120101, term120101.getClass(), "day", (short) 6);
        setField(term120100, term120100.getClass(), "date", term120101);
        setByteField(term120105, term120105.getClass(), "hour", (byte) 7);
        setByteField(term120105, term120105.getClass(), "minute", (byte) 26);
        setByteField(term120105, term120105.getClass(), "second", (byte) 43);
        setIntField(term120105, term120105.getClass(), "nano", 948400827);
        setField(term120100, term120100.getClass(), "time", term120105);
        setField(term120057, term120057.getClass(), "firstPlayDate", term120100);
        setIntField(term120111, term120111.getClass(), "year", 2024);
        setShortField(term120111, term120111.getClass(), "month", (short) 1);
        setShortField(term120111, term120111.getClass(), "day", (short) 26);
        setField(term120110, term120110.getClass(), "date", term120111);
        setByteField(term120115, term120115.getClass(), "hour", (byte) 15);
        setByteField(term120115, term120115.getClass(), "minute", (byte) 45);
        setByteField(term120115, term120115.getClass(), "second", (byte) 46);
        setIntField(term120115, term120115.getClass(), "nano", 429736411);
        setField(term120110, term120110.getClass(), "time", term120115);
        setField(term120057, term120057.getClass(), "lastPlayDate", term120110);
        setIntField(term120057, term120057.getClass(), "courseClass", 964123424);
        setIntField(term120057, term120057.getClass(), "overPowerPoint", -262426251);
        setIntField(term120057, term120057.getClass(), "overPowerRate", 458354400);
        setIntField(term120057, term120057.getClass(), "mapIconId", 511935769);
        setIntField(term120057, term120057.getClass(), "voiceId", -1426448344);
        setIntField(term120057, term120057.getClass(), "avatarWear", -1202237641);
        setIntField(term120057, term120057.getClass(), "avatarHead", -1111536355);
        setIntField(term120057, term120057.getClass(), "avatarFace", 984031932);
        setIntField(term120057, term120057.getClass(), "avatarSkin", -1815636972);
        setIntField(term120057, term120057.getClass(), "avatarItem", 1892379737);
        setIntField(term120057, term120057.getClass(), "avatarFront", 1916500643);
        setIntField(term120057, term120057.getClass(), "avatarBack", -1789882116);
        term120132 = new Integer(174055539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120132;
        callMethod(klass, "setTotalMapNum", argTypes, term120057, args);
    }

};


