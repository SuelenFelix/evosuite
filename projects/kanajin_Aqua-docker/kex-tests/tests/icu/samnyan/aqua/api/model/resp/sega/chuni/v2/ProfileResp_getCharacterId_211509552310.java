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

public class ProfileResp_getCharacterId_211509552310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116573;

    public ProfileResp_getCharacterId_211509552310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116573 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116621 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116626 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116627 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116631 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116573, term116573.getClass(), "userName", "ygXyrMmTjT");
        setIntField(term116573, term116573.getClass(), "level", 621119635);
        setField(term116573, term116573.getClass(), "exp", "lXKwQzvvCd");
        setLongField(term116573, term116573.getClass(), "point", 7063106216882745981L);
        setLongField(term116573, term116573.getClass(), "totalPoint", 5812378928689447376L);
        setIntField(term116573, term116573.getClass(), "playCount", -1620716230);
        setIntField(term116573, term116573.getClass(), "playerRating", -63961537);
        setIntField(term116573, term116573.getClass(), "highestRating", -2039691427);
        setIntField(term116573, term116573.getClass(), "nameplateId", 2138268346);
        setIntField(term116573, term116573.getClass(), "frameId", 1827372163);
        setIntField(term116573, term116573.getClass(), "characterId", -1528314582);
        setIntField(term116573, term116573.getClass(), "trophyId", -49492908);
        setIntField(term116573, term116573.getClass(), "totalMapNum", 1131048829);
        setLongField(term116573, term116573.getClass(), "totalHiScore", -3416092768635786579L);
        setLongField(term116573, term116573.getClass(), "totalBasicHighScore", 6888714863860454736L);
        setLongField(term116573, term116573.getClass(), "totalAdvancedHighScore", -8175919770887729619L);
        setLongField(term116573, term116573.getClass(), "totalExpertHighScore", 3907283451559208536L);
        setLongField(term116573, term116573.getClass(), "totalMasterHighScore", -4060305820467309394L);
        setLongField(term116573, term116573.getClass(), "totalUltimaHighScore", 4064731275090128937L);
        setIntField(term116573, term116573.getClass(), "friendCount", -89942946);
        setIntField(term116617, term116617.getClass(), "year", 2025);
        setShortField(term116617, term116617.getClass(), "month", (short) 2);
        setShortField(term116617, term116617.getClass(), "day", (short) 21);
        setField(term116616, term116616.getClass(), "date", term116617);
        setByteField(term116621, term116621.getClass(), "hour", (byte) 20);
        setByteField(term116621, term116621.getClass(), "minute", (byte) 28);
        setByteField(term116621, term116621.getClass(), "second", (byte) 11);
        setIntField(term116621, term116621.getClass(), "nano", 215796595);
        setField(term116616, term116616.getClass(), "time", term116621);
        setField(term116573, term116573.getClass(), "firstPlayDate", term116616);
        setIntField(term116627, term116627.getClass(), "year", 2024);
        setShortField(term116627, term116627.getClass(), "month", (short) 1);
        setShortField(term116627, term116627.getClass(), "day", (short) 9);
        setField(term116626, term116626.getClass(), "date", term116627);
        setByteField(term116631, term116631.getClass(), "hour", (byte) 22);
        setByteField(term116631, term116631.getClass(), "minute", (byte) 47);
        setByteField(term116631, term116631.getClass(), "second", (byte) 48);
        setIntField(term116631, term116631.getClass(), "nano", 821877795);
        setField(term116626, term116626.getClass(), "time", term116631);
        setField(term116573, term116573.getClass(), "lastPlayDate", term116626);
        setIntField(term116573, term116573.getClass(), "courseClass", 321642049);
        setIntField(term116573, term116573.getClass(), "overPowerPoint", 1428275387);
        setIntField(term116573, term116573.getClass(), "overPowerRate", -981115303);
        setIntField(term116573, term116573.getClass(), "mapIconId", -1533210171);
        setIntField(term116573, term116573.getClass(), "voiceId", 177773664);
        setIntField(term116573, term116573.getClass(), "avatarWear", -1774621933);
        setIntField(term116573, term116573.getClass(), "avatarHead", -1536750934);
        setIntField(term116573, term116573.getClass(), "avatarFace", -1393231846);
        setIntField(term116573, term116573.getClass(), "avatarSkin", -749529528);
        setIntField(term116573, term116573.getClass(), "avatarItem", 1682804001);
        setIntField(term116573, term116573.getClass(), "avatarFront", 1895616641);
        setIntField(term116573, term116573.getClass(), "avatarBack", -2084901010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term116573, args);
    }

};


