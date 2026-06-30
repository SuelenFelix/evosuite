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

public class ProfileResp_setCharacterId_35205619944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119863;
     Object term119938;

    public ProfileResp_setCharacterId_35205619944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119863 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119906 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119911 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119921 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119863, term119863.getClass(), "userName", "PVBjmhwdMr");
        setIntField(term119863, term119863.getClass(), "level", 485962023);
        setField(term119863, term119863.getClass(), "exp", "TURoCylnmF");
        setLongField(term119863, term119863.getClass(), "point", -5725007120981523482L);
        setLongField(term119863, term119863.getClass(), "totalPoint", 8434735838786581531L);
        setIntField(term119863, term119863.getClass(), "playCount", -1618211912);
        setIntField(term119863, term119863.getClass(), "playerRating", -1565478791);
        setIntField(term119863, term119863.getClass(), "highestRating", -886173605);
        setIntField(term119863, term119863.getClass(), "nameplateId", -417099655);
        setIntField(term119863, term119863.getClass(), "frameId", 658991007);
        setIntField(term119863, term119863.getClass(), "characterId", 551134751);
        setIntField(term119863, term119863.getClass(), "trophyId", -1668821003);
        setIntField(term119863, term119863.getClass(), "totalMapNum", -853661137);
        setLongField(term119863, term119863.getClass(), "totalHiScore", 7263834083570926393L);
        setLongField(term119863, term119863.getClass(), "totalBasicHighScore", -6550458274684737650L);
        setLongField(term119863, term119863.getClass(), "totalAdvancedHighScore", 1974009375418734835L);
        setLongField(term119863, term119863.getClass(), "totalExpertHighScore", 7308123421897565677L);
        setLongField(term119863, term119863.getClass(), "totalMasterHighScore", -4342562926436615897L);
        setLongField(term119863, term119863.getClass(), "totalUltimaHighScore", 8435193238410123800L);
        setIntField(term119863, term119863.getClass(), "friendCount", -1513734234);
        setIntField(term119907, term119907.getClass(), "year", 2025);
        setShortField(term119907, term119907.getClass(), "month", (short) 9);
        setShortField(term119907, term119907.getClass(), "day", (short) 4);
        setField(term119906, term119906.getClass(), "date", term119907);
        setByteField(term119911, term119911.getClass(), "hour", (byte) 11);
        setByteField(term119911, term119911.getClass(), "minute", (byte) 18);
        setByteField(term119911, term119911.getClass(), "second", (byte) 57);
        setIntField(term119911, term119911.getClass(), "nano", 6650476);
        setField(term119906, term119906.getClass(), "time", term119911);
        setField(term119863, term119863.getClass(), "firstPlayDate", term119906);
        setIntField(term119917, term119917.getClass(), "year", 2027);
        setShortField(term119917, term119917.getClass(), "month", (short) 5);
        setShortField(term119917, term119917.getClass(), "day", (short) 2);
        setField(term119916, term119916.getClass(), "date", term119917);
        setByteField(term119921, term119921.getClass(), "hour", (byte) 23);
        setByteField(term119921, term119921.getClass(), "minute", (byte) 39);
        setByteField(term119921, term119921.getClass(), "second", (byte) 10);
        setIntField(term119921, term119921.getClass(), "nano", 994136834);
        setField(term119916, term119916.getClass(), "time", term119921);
        setField(term119863, term119863.getClass(), "lastPlayDate", term119916);
        setIntField(term119863, term119863.getClass(), "courseClass", -162548121);
        setIntField(term119863, term119863.getClass(), "overPowerPoint", -812414812);
        setIntField(term119863, term119863.getClass(), "overPowerRate", 1402008851);
        setIntField(term119863, term119863.getClass(), "mapIconId", -461263011);
        setIntField(term119863, term119863.getClass(), "voiceId", 757624335);
        setIntField(term119863, term119863.getClass(), "avatarWear", -756631822);
        setIntField(term119863, term119863.getClass(), "avatarHead", 1891215231);
        setIntField(term119863, term119863.getClass(), "avatarFace", 1413001096);
        setIntField(term119863, term119863.getClass(), "avatarSkin", -1966690882);
        setIntField(term119863, term119863.getClass(), "avatarItem", -1288009850);
        setIntField(term119863, term119863.getClass(), "avatarFront", -1714662056);
        setIntField(term119863, term119863.getClass(), "avatarBack", -1899589887);
        term119938 = new Integer(-1292305648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term119938;
        callMethod(klass, "setCharacterId", argTypes, term119863, args);
    }

};


