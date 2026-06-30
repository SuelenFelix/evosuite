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

public class ProfileResp_setTotalExpertHighScore_167369655350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120445;
     Object term120520;

    public ProfileResp_setTotalExpertHighScore_167369655350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120445 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120493 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120503 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120445, term120445.getClass(), "userName", "jQpmHIcJfG");
        setIntField(term120445, term120445.getClass(), "level", 1410776244);
        setField(term120445, term120445.getClass(), "exp", "CtygGfxssv");
        setLongField(term120445, term120445.getClass(), "point", -2048122109769301584L);
        setLongField(term120445, term120445.getClass(), "totalPoint", -8997711710645180964L);
        setIntField(term120445, term120445.getClass(), "playCount", 1079988315);
        setIntField(term120445, term120445.getClass(), "playerRating", -1986101704);
        setIntField(term120445, term120445.getClass(), "highestRating", 2046165253);
        setIntField(term120445, term120445.getClass(), "nameplateId", -2130700245);
        setIntField(term120445, term120445.getClass(), "frameId", 1626943083);
        setIntField(term120445, term120445.getClass(), "characterId", 612928025);
        setIntField(term120445, term120445.getClass(), "trophyId", 1654938051);
        setIntField(term120445, term120445.getClass(), "totalMapNum", 1122891783);
        setLongField(term120445, term120445.getClass(), "totalHiScore", -8713996910880132871L);
        setLongField(term120445, term120445.getClass(), "totalBasicHighScore", 6959832148690893218L);
        setLongField(term120445, term120445.getClass(), "totalAdvancedHighScore", 9054174532870356727L);
        setLongField(term120445, term120445.getClass(), "totalExpertHighScore", -8406317975085380712L);
        setLongField(term120445, term120445.getClass(), "totalMasterHighScore", 5138173289133094895L);
        setLongField(term120445, term120445.getClass(), "totalUltimaHighScore", -8603569983034188953L);
        setIntField(term120445, term120445.getClass(), "friendCount", 1009961136);
        setIntField(term120489, term120489.getClass(), "year", 2022);
        setShortField(term120489, term120489.getClass(), "month", (short) 11);
        setShortField(term120489, term120489.getClass(), "day", (short) 6);
        setField(term120488, term120488.getClass(), "date", term120489);
        setByteField(term120493, term120493.getClass(), "hour", (byte) 16);
        setByteField(term120493, term120493.getClass(), "minute", (byte) 37);
        setByteField(term120493, term120493.getClass(), "second", (byte) 37);
        setIntField(term120493, term120493.getClass(), "nano", 21969985);
        setField(term120488, term120488.getClass(), "time", term120493);
        setField(term120445, term120445.getClass(), "firstPlayDate", term120488);
        setIntField(term120499, term120499.getClass(), "year", 2014);
        setShortField(term120499, term120499.getClass(), "month", (short) 8);
        setShortField(term120499, term120499.getClass(), "day", (short) 20);
        setField(term120498, term120498.getClass(), "date", term120499);
        setByteField(term120503, term120503.getClass(), "hour", (byte) 4);
        setByteField(term120503, term120503.getClass(), "minute", (byte) 32);
        setByteField(term120503, term120503.getClass(), "second", (byte) 36);
        setIntField(term120503, term120503.getClass(), "nano", 925387322);
        setField(term120498, term120498.getClass(), "time", term120503);
        setField(term120445, term120445.getClass(), "lastPlayDate", term120498);
        setIntField(term120445, term120445.getClass(), "courseClass", -1203969529);
        setIntField(term120445, term120445.getClass(), "overPowerPoint", -247521931);
        setIntField(term120445, term120445.getClass(), "overPowerRate", 2083217589);
        setIntField(term120445, term120445.getClass(), "mapIconId", -1701395662);
        setIntField(term120445, term120445.getClass(), "voiceId", -1261034013);
        setIntField(term120445, term120445.getClass(), "avatarWear", -2001239518);
        setIntField(term120445, term120445.getClass(), "avatarHead", 2062039236);
        setIntField(term120445, term120445.getClass(), "avatarFace", -2054683847);
        setIntField(term120445, term120445.getClass(), "avatarSkin", 893187915);
        setIntField(term120445, term120445.getClass(), "avatarItem", -1233793124);
        setIntField(term120445, term120445.getClass(), "avatarFront", 1119642278);
        setIntField(term120445, term120445.getClass(), "avatarBack", 367640506);
        term120520 = new Long(1673910834994391163L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term120520;
        callMethod(klass, "setTotalExpertHighScore", argTypes, term120445, args);
    }

};


