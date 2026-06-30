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

public class ProfileResp_hashCode_99555021870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122399;

    public ProfileResp_hashCode_99555021870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122399 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term122442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122447 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122457 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term122399, term122399.getClass(), "userName", "hHcuunhdDN");
        setIntField(term122399, term122399.getClass(), "level", 1684341360);
        setField(term122399, term122399.getClass(), "exp", "OWXMvkMqRq");
        setLongField(term122399, term122399.getClass(), "point", -8661909886885553459L);
        setLongField(term122399, term122399.getClass(), "totalPoint", -7742803118784055044L);
        setIntField(term122399, term122399.getClass(), "playCount", -429833654);
        setIntField(term122399, term122399.getClass(), "playerRating", 356959645);
        setIntField(term122399, term122399.getClass(), "highestRating", -1687020614);
        setIntField(term122399, term122399.getClass(), "nameplateId", -971697491);
        setIntField(term122399, term122399.getClass(), "frameId", -1496880017);
        setIntField(term122399, term122399.getClass(), "characterId", 399516755);
        setIntField(term122399, term122399.getClass(), "trophyId", 51863936);
        setIntField(term122399, term122399.getClass(), "totalMapNum", 968181353);
        setLongField(term122399, term122399.getClass(), "totalHiScore", 8214012866475671299L);
        setLongField(term122399, term122399.getClass(), "totalBasicHighScore", 832415693257274424L);
        setLongField(term122399, term122399.getClass(), "totalAdvancedHighScore", 2722675020564130824L);
        setLongField(term122399, term122399.getClass(), "totalExpertHighScore", -5336191936387352032L);
        setLongField(term122399, term122399.getClass(), "totalMasterHighScore", 3818758099814858921L);
        setLongField(term122399, term122399.getClass(), "totalUltimaHighScore", -7658376661508902183L);
        setIntField(term122399, term122399.getClass(), "friendCount", 769905044);
        setIntField(term122443, term122443.getClass(), "year", 2024);
        setShortField(term122443, term122443.getClass(), "month", (short) 4);
        setShortField(term122443, term122443.getClass(), "day", (short) 13);
        setField(term122442, term122442.getClass(), "date", term122443);
        setByteField(term122447, term122447.getClass(), "hour", (byte) 9);
        setByteField(term122447, term122447.getClass(), "minute", (byte) 42);
        setByteField(term122447, term122447.getClass(), "second", (byte) 59);
        setIntField(term122447, term122447.getClass(), "nano", 396063470);
        setField(term122442, term122442.getClass(), "time", term122447);
        setField(term122399, term122399.getClass(), "firstPlayDate", term122442);
        setIntField(term122453, term122453.getClass(), "year", 2017);
        setShortField(term122453, term122453.getClass(), "month", (short) 10);
        setShortField(term122453, term122453.getClass(), "day", (short) 2);
        setField(term122452, term122452.getClass(), "date", term122453);
        setByteField(term122457, term122457.getClass(), "hour", (byte) 1);
        setByteField(term122457, term122457.getClass(), "minute", (byte) 16);
        setByteField(term122457, term122457.getClass(), "second", (byte) 42);
        setIntField(term122457, term122457.getClass(), "nano", 817036384);
        setField(term122452, term122452.getClass(), "time", term122457);
        setField(term122399, term122399.getClass(), "lastPlayDate", term122452);
        setIntField(term122399, term122399.getClass(), "courseClass", 725401874);
        setIntField(term122399, term122399.getClass(), "overPowerPoint", -103532945);
        setIntField(term122399, term122399.getClass(), "overPowerRate", 14335543);
        setIntField(term122399, term122399.getClass(), "mapIconId", 928553650);
        setIntField(term122399, term122399.getClass(), "voiceId", -1939853862);
        setIntField(term122399, term122399.getClass(), "avatarWear", 555915701);
        setIntField(term122399, term122399.getClass(), "avatarHead", 416273687);
        setIntField(term122399, term122399.getClass(), "avatarFace", -712981089);
        setIntField(term122399, term122399.getClass(), "avatarSkin", -1402778422);
        setIntField(term122399, term122399.getClass(), "avatarItem", -51083223);
        setIntField(term122399, term122399.getClass(), "avatarFront", -1200222162);
        setIntField(term122399, term122399.getClass(), "avatarBack", 435088563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term122399, args);
    }

};


