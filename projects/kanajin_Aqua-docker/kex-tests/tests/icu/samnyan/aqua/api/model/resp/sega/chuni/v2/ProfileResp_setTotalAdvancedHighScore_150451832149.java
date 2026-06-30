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

public class ProfileResp_setTotalAdvancedHighScore_150451832149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120348;
     Object term120423;

    public ProfileResp_setTotalAdvancedHighScore_150451832149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120348 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120396 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120402 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120406 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120348, term120348.getClass(), "userName", "QvobVEStXg");
        setIntField(term120348, term120348.getClass(), "level", -140384945);
        setField(term120348, term120348.getClass(), "exp", "RPfKIhBpQv");
        setLongField(term120348, term120348.getClass(), "point", -6137121667863437060L);
        setLongField(term120348, term120348.getClass(), "totalPoint", 1286359190898506191L);
        setIntField(term120348, term120348.getClass(), "playCount", 43960346);
        setIntField(term120348, term120348.getClass(), "playerRating", 560577789);
        setIntField(term120348, term120348.getClass(), "highestRating", -456174811);
        setIntField(term120348, term120348.getClass(), "nameplateId", -1930877467);
        setIntField(term120348, term120348.getClass(), "frameId", -1321611119);
        setIntField(term120348, term120348.getClass(), "characterId", -1432240473);
        setIntField(term120348, term120348.getClass(), "trophyId", -926293000);
        setIntField(term120348, term120348.getClass(), "totalMapNum", -219851484);
        setLongField(term120348, term120348.getClass(), "totalHiScore", -5312401346821386938L);
        setLongField(term120348, term120348.getClass(), "totalBasicHighScore", 9222544456917499892L);
        setLongField(term120348, term120348.getClass(), "totalAdvancedHighScore", -8055960422626625967L);
        setLongField(term120348, term120348.getClass(), "totalExpertHighScore", -1072612554039652494L);
        setLongField(term120348, term120348.getClass(), "totalMasterHighScore", 7891904308631684957L);
        setLongField(term120348, term120348.getClass(), "totalUltimaHighScore", -5131124286038907802L);
        setIntField(term120348, term120348.getClass(), "friendCount", 1705669325);
        setIntField(term120392, term120392.getClass(), "year", 2021);
        setShortField(term120392, term120392.getClass(), "month", (short) 3);
        setShortField(term120392, term120392.getClass(), "day", (short) 2);
        setField(term120391, term120391.getClass(), "date", term120392);
        setByteField(term120396, term120396.getClass(), "hour", (byte) 3);
        setByteField(term120396, term120396.getClass(), "minute", (byte) 27);
        setByteField(term120396, term120396.getClass(), "second", (byte) 28);
        setIntField(term120396, term120396.getClass(), "nano", 185858633);
        setField(term120391, term120391.getClass(), "time", term120396);
        setField(term120348, term120348.getClass(), "firstPlayDate", term120391);
        setIntField(term120402, term120402.getClass(), "year", 2014);
        setShortField(term120402, term120402.getClass(), "month", (short) 1);
        setShortField(term120402, term120402.getClass(), "day", (short) 31);
        setField(term120401, term120401.getClass(), "date", term120402);
        setByteField(term120406, term120406.getClass(), "hour", (byte) 1);
        setByteField(term120406, term120406.getClass(), "minute", (byte) 20);
        setByteField(term120406, term120406.getClass(), "second", (byte) 46);
        setIntField(term120406, term120406.getClass(), "nano", 484224496);
        setField(term120401, term120401.getClass(), "time", term120406);
        setField(term120348, term120348.getClass(), "lastPlayDate", term120401);
        setIntField(term120348, term120348.getClass(), "courseClass", -27848155);
        setIntField(term120348, term120348.getClass(), "overPowerPoint", -1313719580);
        setIntField(term120348, term120348.getClass(), "overPowerRate", -1906903100);
        setIntField(term120348, term120348.getClass(), "mapIconId", 836438826);
        setIntField(term120348, term120348.getClass(), "voiceId", -534455552);
        setIntField(term120348, term120348.getClass(), "avatarWear", -229948712);
        setIntField(term120348, term120348.getClass(), "avatarHead", -747341024);
        setIntField(term120348, term120348.getClass(), "avatarFace", 352241815);
        setIntField(term120348, term120348.getClass(), "avatarSkin", 1475411406);
        setIntField(term120348, term120348.getClass(), "avatarItem", -244835719);
        setIntField(term120348, term120348.getClass(), "avatarFront", 641725720);
        setIntField(term120348, term120348.getClass(), "avatarBack", 682309806);
        term120423 = new Long(-7758209801141975741L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term120423;
        callMethod(klass, "setTotalAdvancedHighScore", argTypes, term120348, args);
    }

};


