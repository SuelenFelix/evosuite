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

public class ProfileResp_setAvatarWear_177301206561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121528;
     Object term121603;

    public ProfileResp_setAvatarWear_177301206561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121528 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121586 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121528, term121528.getClass(), "userName", "uBqCFlJFKn");
        setIntField(term121528, term121528.getClass(), "level", -988352056);
        setField(term121528, term121528.getClass(), "exp", "CdWGcgAUBN");
        setLongField(term121528, term121528.getClass(), "point", 8250412309269183811L);
        setLongField(term121528, term121528.getClass(), "totalPoint", 523809613551935576L);
        setIntField(term121528, term121528.getClass(), "playCount", -2105316016);
        setIntField(term121528, term121528.getClass(), "playerRating", -617936710);
        setIntField(term121528, term121528.getClass(), "highestRating", -1768634556);
        setIntField(term121528, term121528.getClass(), "nameplateId", 1201633270);
        setIntField(term121528, term121528.getClass(), "frameId", -1609093118);
        setIntField(term121528, term121528.getClass(), "characterId", 1714618500);
        setIntField(term121528, term121528.getClass(), "trophyId", 1821656108);
        setIntField(term121528, term121528.getClass(), "totalMapNum", -1819998556);
        setLongField(term121528, term121528.getClass(), "totalHiScore", 3364500466458211483L);
        setLongField(term121528, term121528.getClass(), "totalBasicHighScore", 4835770363194402857L);
        setLongField(term121528, term121528.getClass(), "totalAdvancedHighScore", -349694407234210422L);
        setLongField(term121528, term121528.getClass(), "totalExpertHighScore", -7611198919242899141L);
        setLongField(term121528, term121528.getClass(), "totalMasterHighScore", -1697005893366100747L);
        setLongField(term121528, term121528.getClass(), "totalUltimaHighScore", 8921915975148421411L);
        setIntField(term121528, term121528.getClass(), "friendCount", -2110992471);
        setIntField(term121572, term121572.getClass(), "year", 2016);
        setShortField(term121572, term121572.getClass(), "month", (short) 9);
        setShortField(term121572, term121572.getClass(), "day", (short) 6);
        setField(term121571, term121571.getClass(), "date", term121572);
        setByteField(term121576, term121576.getClass(), "hour", (byte) 16);
        setByteField(term121576, term121576.getClass(), "minute", (byte) 36);
        setByteField(term121576, term121576.getClass(), "second", (byte) 12);
        setIntField(term121576, term121576.getClass(), "nano", 501110458);
        setField(term121571, term121571.getClass(), "time", term121576);
        setField(term121528, term121528.getClass(), "firstPlayDate", term121571);
        setIntField(term121582, term121582.getClass(), "year", 2029);
        setShortField(term121582, term121582.getClass(), "month", (short) 3);
        setShortField(term121582, term121582.getClass(), "day", (short) 6);
        setField(term121581, term121581.getClass(), "date", term121582);
        setByteField(term121586, term121586.getClass(), "hour", (byte) 4);
        setByteField(term121586, term121586.getClass(), "minute", (byte) 20);
        setByteField(term121586, term121586.getClass(), "second", (byte) 49);
        setIntField(term121586, term121586.getClass(), "nano", 250915045);
        setField(term121581, term121581.getClass(), "time", term121586);
        setField(term121528, term121528.getClass(), "lastPlayDate", term121581);
        setIntField(term121528, term121528.getClass(), "courseClass", -305031033);
        setIntField(term121528, term121528.getClass(), "overPowerPoint", -1413995631);
        setIntField(term121528, term121528.getClass(), "overPowerRate", 1538218974);
        setIntField(term121528, term121528.getClass(), "mapIconId", 119909508);
        setIntField(term121528, term121528.getClass(), "voiceId", -2114345876);
        setIntField(term121528, term121528.getClass(), "avatarWear", 1097786473);
        setIntField(term121528, term121528.getClass(), "avatarHead", -1596889596);
        setIntField(term121528, term121528.getClass(), "avatarFace", 321979879);
        setIntField(term121528, term121528.getClass(), "avatarSkin", 955268751);
        setIntField(term121528, term121528.getClass(), "avatarItem", -1215937260);
        setIntField(term121528, term121528.getClass(), "avatarFront", 167250197);
        setIntField(term121528, term121528.getClass(), "avatarBack", 1560350766);
        term121603 = new Integer(-552576798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121603;
        callMethod(klass, "setAvatarWear", argTypes, term121528, args);
    }

};


