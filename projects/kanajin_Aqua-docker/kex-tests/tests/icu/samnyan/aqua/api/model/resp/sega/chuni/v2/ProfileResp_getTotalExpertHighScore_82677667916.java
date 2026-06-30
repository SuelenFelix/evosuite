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

public class ProfileResp_getTotalExpertHighScore_82677667916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117143;

    public ProfileResp_getTotalExpertHighScore_82677667916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117143 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117191 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117201 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117143, term117143.getClass(), "userName", "OlSJsSLyCa");
        setIntField(term117143, term117143.getClass(), "level", -1127622637);
        setField(term117143, term117143.getClass(), "exp", "PxApxgGmqd");
        setLongField(term117143, term117143.getClass(), "point", -6746436482856660533L);
        setLongField(term117143, term117143.getClass(), "totalPoint", 4540774872514545895L);
        setIntField(term117143, term117143.getClass(), "playCount", -657700948);
        setIntField(term117143, term117143.getClass(), "playerRating", 2008733303);
        setIntField(term117143, term117143.getClass(), "highestRating", -591763776);
        setIntField(term117143, term117143.getClass(), "nameplateId", 131494993);
        setIntField(term117143, term117143.getClass(), "frameId", -1130213355);
        setIntField(term117143, term117143.getClass(), "characterId", 75010258);
        setIntField(term117143, term117143.getClass(), "trophyId", -227044270);
        setIntField(term117143, term117143.getClass(), "totalMapNum", -1979697434);
        setLongField(term117143, term117143.getClass(), "totalHiScore", -1463127326798939587L);
        setLongField(term117143, term117143.getClass(), "totalBasicHighScore", 8817459190616045853L);
        setLongField(term117143, term117143.getClass(), "totalAdvancedHighScore", 8440192221331571349L);
        setLongField(term117143, term117143.getClass(), "totalExpertHighScore", 5709410403788658761L);
        setLongField(term117143, term117143.getClass(), "totalMasterHighScore", 310032710294616459L);
        setLongField(term117143, term117143.getClass(), "totalUltimaHighScore", 5200635552107859745L);
        setIntField(term117143, term117143.getClass(), "friendCount", -825625690);
        setIntField(term117187, term117187.getClass(), "year", 2022);
        setShortField(term117187, term117187.getClass(), "month", (short) 10);
        setShortField(term117187, term117187.getClass(), "day", (short) 22);
        setField(term117186, term117186.getClass(), "date", term117187);
        setByteField(term117191, term117191.getClass(), "hour", (byte) 19);
        setByteField(term117191, term117191.getClass(), "minute", (byte) 2);
        setByteField(term117191, term117191.getClass(), "second", (byte) 52);
        setIntField(term117191, term117191.getClass(), "nano", 17018575);
        setField(term117186, term117186.getClass(), "time", term117191);
        setField(term117143, term117143.getClass(), "firstPlayDate", term117186);
        setIntField(term117197, term117197.getClass(), "year", 2012);
        setShortField(term117197, term117197.getClass(), "month", (short) 8);
        setShortField(term117197, term117197.getClass(), "day", (short) 6);
        setField(term117196, term117196.getClass(), "date", term117197);
        setByteField(term117201, term117201.getClass(), "hour", (byte) 16);
        setByteField(term117201, term117201.getClass(), "minute", (byte) 23);
        setByteField(term117201, term117201.getClass(), "second", (byte) 30);
        setIntField(term117201, term117201.getClass(), "nano", 184538820);
        setField(term117196, term117196.getClass(), "time", term117201);
        setField(term117143, term117143.getClass(), "lastPlayDate", term117196);
        setIntField(term117143, term117143.getClass(), "courseClass", -21602600);
        setIntField(term117143, term117143.getClass(), "overPowerPoint", 547721734);
        setIntField(term117143, term117143.getClass(), "overPowerRate", 974090390);
        setIntField(term117143, term117143.getClass(), "mapIconId", -324099317);
        setIntField(term117143, term117143.getClass(), "voiceId", 1938591474);
        setIntField(term117143, term117143.getClass(), "avatarWear", 1772995625);
        setIntField(term117143, term117143.getClass(), "avatarHead", -270540453);
        setIntField(term117143, term117143.getClass(), "avatarFace", 830668827);
        setIntField(term117143, term117143.getClass(), "avatarSkin", -1470357281);
        setIntField(term117143, term117143.getClass(), "avatarItem", 2083550382);
        setIntField(term117143, term117143.getClass(), "avatarFront", 1237544568);
        setIntField(term117143, term117143.getClass(), "avatarBack", -2092016547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertHighScore", argTypes, term117143, args);
    }

};


