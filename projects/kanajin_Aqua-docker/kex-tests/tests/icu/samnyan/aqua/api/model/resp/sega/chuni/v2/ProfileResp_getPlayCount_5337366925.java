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

public class ProfileResp_getPlayCount_5337366925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116098;

    public ProfileResp_getPlayCount_5337366925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116098 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116146 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116156 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116098, term116098.getClass(), "userName", "bhNFHDPXAm");
        setIntField(term116098, term116098.getClass(), "level", -1688756613);
        setField(term116098, term116098.getClass(), "exp", "CWFDMUsvvv");
        setLongField(term116098, term116098.getClass(), "point", -8130508753770018315L);
        setLongField(term116098, term116098.getClass(), "totalPoint", -2385943956066150347L);
        setIntField(term116098, term116098.getClass(), "playCount", -405388749);
        setIntField(term116098, term116098.getClass(), "playerRating", -697254836);
        setIntField(term116098, term116098.getClass(), "highestRating", 873770754);
        setIntField(term116098, term116098.getClass(), "nameplateId", -1892912144);
        setIntField(term116098, term116098.getClass(), "frameId", 1710807965);
        setIntField(term116098, term116098.getClass(), "characterId", 2025998576);
        setIntField(term116098, term116098.getClass(), "trophyId", -326529805);
        setIntField(term116098, term116098.getClass(), "totalMapNum", 725853519);
        setLongField(term116098, term116098.getClass(), "totalHiScore", -4896376683016823289L);
        setLongField(term116098, term116098.getClass(), "totalBasicHighScore", 5308872668918566041L);
        setLongField(term116098, term116098.getClass(), "totalAdvancedHighScore", 8731808618480993258L);
        setLongField(term116098, term116098.getClass(), "totalExpertHighScore", 1785131375653736493L);
        setLongField(term116098, term116098.getClass(), "totalMasterHighScore", 8464707110276881577L);
        setLongField(term116098, term116098.getClass(), "totalUltimaHighScore", -3940330606642650491L);
        setIntField(term116098, term116098.getClass(), "friendCount", -152546922);
        setIntField(term116142, term116142.getClass(), "year", 2021);
        setShortField(term116142, term116142.getClass(), "month", (short) 4);
        setShortField(term116142, term116142.getClass(), "day", (short) 13);
        setField(term116141, term116141.getClass(), "date", term116142);
        setByteField(term116146, term116146.getClass(), "hour", (byte) 2);
        setByteField(term116146, term116146.getClass(), "minute", (byte) 40);
        setByteField(term116146, term116146.getClass(), "second", (byte) 9);
        setIntField(term116146, term116146.getClass(), "nano", 709335218);
        setField(term116141, term116141.getClass(), "time", term116146);
        setField(term116098, term116098.getClass(), "firstPlayDate", term116141);
        setIntField(term116152, term116152.getClass(), "year", 2013);
        setShortField(term116152, term116152.getClass(), "month", (short) 6);
        setShortField(term116152, term116152.getClass(), "day", (short) 21);
        setField(term116151, term116151.getClass(), "date", term116152);
        setByteField(term116156, term116156.getClass(), "hour", (byte) 9);
        setByteField(term116156, term116156.getClass(), "minute", (byte) 3);
        setByteField(term116156, term116156.getClass(), "second", (byte) 42);
        setIntField(term116156, term116156.getClass(), "nano", 331156873);
        setField(term116151, term116151.getClass(), "time", term116156);
        setField(term116098, term116098.getClass(), "lastPlayDate", term116151);
        setIntField(term116098, term116098.getClass(), "courseClass", -1010965745);
        setIntField(term116098, term116098.getClass(), "overPowerPoint", -699841638);
        setIntField(term116098, term116098.getClass(), "overPowerRate", -658823021);
        setIntField(term116098, term116098.getClass(), "mapIconId", 2128630776);
        setIntField(term116098, term116098.getClass(), "voiceId", -674973972);
        setIntField(term116098, term116098.getClass(), "avatarWear", -1757215271);
        setIntField(term116098, term116098.getClass(), "avatarHead", -540003224);
        setIntField(term116098, term116098.getClass(), "avatarFace", 1296771697);
        setIntField(term116098, term116098.getClass(), "avatarSkin", -574063923);
        setIntField(term116098, term116098.getClass(), "avatarItem", 1632141906);
        setIntField(term116098, term116098.getClass(), "avatarFront", 610586660);
        setIntField(term116098, term116098.getClass(), "avatarBack", -1377487004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term116098, args);
    }

};


