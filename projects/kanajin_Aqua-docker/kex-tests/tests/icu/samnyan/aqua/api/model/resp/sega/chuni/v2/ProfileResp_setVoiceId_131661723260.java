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

public class ProfileResp_setVoiceId_131661723260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121431;
     Object term121506;

    public ProfileResp_setVoiceId_131661723260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121431 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121479 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121489 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121431, term121431.getClass(), "userName", "kHaNkhgOjo");
        setIntField(term121431, term121431.getClass(), "level", 2138409947);
        setField(term121431, term121431.getClass(), "exp", "nWDCnQtxKC");
        setLongField(term121431, term121431.getClass(), "point", -328735576020644988L);
        setLongField(term121431, term121431.getClass(), "totalPoint", 2251966990954160391L);
        setIntField(term121431, term121431.getClass(), "playCount", 1393548385);
        setIntField(term121431, term121431.getClass(), "playerRating", 286676368);
        setIntField(term121431, term121431.getClass(), "highestRating", 561800266);
        setIntField(term121431, term121431.getClass(), "nameplateId", -718484224);
        setIntField(term121431, term121431.getClass(), "frameId", -726390282);
        setIntField(term121431, term121431.getClass(), "characterId", -1975823220);
        setIntField(term121431, term121431.getClass(), "trophyId", -910327924);
        setIntField(term121431, term121431.getClass(), "totalMapNum", 1002652234);
        setLongField(term121431, term121431.getClass(), "totalHiScore", 8975054707060898793L);
        setLongField(term121431, term121431.getClass(), "totalBasicHighScore", 2299517237819028412L);
        setLongField(term121431, term121431.getClass(), "totalAdvancedHighScore", 309557317875107099L);
        setLongField(term121431, term121431.getClass(), "totalExpertHighScore", -5619840835933174326L);
        setLongField(term121431, term121431.getClass(), "totalMasterHighScore", -773633018194637732L);
        setLongField(term121431, term121431.getClass(), "totalUltimaHighScore", 9222262582388375995L);
        setIntField(term121431, term121431.getClass(), "friendCount", -1331881973);
        setIntField(term121475, term121475.getClass(), "year", 2010);
        setShortField(term121475, term121475.getClass(), "month", (short) 8);
        setShortField(term121475, term121475.getClass(), "day", (short) 24);
        setField(term121474, term121474.getClass(), "date", term121475);
        setByteField(term121479, term121479.getClass(), "hour", (byte) 1);
        setByteField(term121479, term121479.getClass(), "minute", (byte) 1);
        setByteField(term121479, term121479.getClass(), "second", (byte) 6);
        setIntField(term121479, term121479.getClass(), "nano", 241424245);
        setField(term121474, term121474.getClass(), "time", term121479);
        setField(term121431, term121431.getClass(), "firstPlayDate", term121474);
        setIntField(term121485, term121485.getClass(), "year", 2025);
        setShortField(term121485, term121485.getClass(), "month", (short) 9);
        setShortField(term121485, term121485.getClass(), "day", (short) 23);
        setField(term121484, term121484.getClass(), "date", term121485);
        setByteField(term121489, term121489.getClass(), "hour", (byte) 21);
        setByteField(term121489, term121489.getClass(), "minute", (byte) 51);
        setByteField(term121489, term121489.getClass(), "second", (byte) 25);
        setIntField(term121489, term121489.getClass(), "nano", 931621915);
        setField(term121484, term121484.getClass(), "time", term121489);
        setField(term121431, term121431.getClass(), "lastPlayDate", term121484);
        setIntField(term121431, term121431.getClass(), "courseClass", -362256218);
        setIntField(term121431, term121431.getClass(), "overPowerPoint", 475743101);
        setIntField(term121431, term121431.getClass(), "overPowerRate", -712605557);
        setIntField(term121431, term121431.getClass(), "mapIconId", 1572843215);
        setIntField(term121431, term121431.getClass(), "voiceId", -2060761831);
        setIntField(term121431, term121431.getClass(), "avatarWear", -1267897685);
        setIntField(term121431, term121431.getClass(), "avatarHead", 1697440815);
        setIntField(term121431, term121431.getClass(), "avatarFace", -1482526963);
        setIntField(term121431, term121431.getClass(), "avatarSkin", -1810920369);
        setIntField(term121431, term121431.getClass(), "avatarItem", 977546599);
        setIntField(term121431, term121431.getClass(), "avatarFront", 1877190577);
        setIntField(term121431, term121431.getClass(), "avatarBack", 561584525);
        term121506 = new Integer(-1228501645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121506;
        callMethod(klass, "setVoiceId", argTypes, term121431, args);
    }

};


