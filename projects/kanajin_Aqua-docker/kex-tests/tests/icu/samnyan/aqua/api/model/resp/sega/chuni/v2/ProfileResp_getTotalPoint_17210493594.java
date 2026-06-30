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

public class ProfileResp_getTotalPoint_17210493594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116003;

    public ProfileResp_getTotalPoint_17210493594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116003 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116061 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116003, term116003.getClass(), "userName", "uQurqKokXn");
        setIntField(term116003, term116003.getClass(), "level", -914575969);
        setField(term116003, term116003.getClass(), "exp", "GyFudiWgJJ");
        setLongField(term116003, term116003.getClass(), "point", -8941000155799667503L);
        setLongField(term116003, term116003.getClass(), "totalPoint", 8762299939166364370L);
        setIntField(term116003, term116003.getClass(), "playCount", 1289030795);
        setIntField(term116003, term116003.getClass(), "playerRating", -869761518);
        setIntField(term116003, term116003.getClass(), "highestRating", 331807795);
        setIntField(term116003, term116003.getClass(), "nameplateId", -290387342);
        setIntField(term116003, term116003.getClass(), "frameId", -1122087492);
        setIntField(term116003, term116003.getClass(), "characterId", -716532647);
        setIntField(term116003, term116003.getClass(), "trophyId", -2014602803);
        setIntField(term116003, term116003.getClass(), "totalMapNum", -695810363);
        setLongField(term116003, term116003.getClass(), "totalHiScore", -2058732347677769008L);
        setLongField(term116003, term116003.getClass(), "totalBasicHighScore", -1212345114056050539L);
        setLongField(term116003, term116003.getClass(), "totalAdvancedHighScore", -4426532311030321254L);
        setLongField(term116003, term116003.getClass(), "totalExpertHighScore", -8995282364511244030L);
        setLongField(term116003, term116003.getClass(), "totalMasterHighScore", -7544795113627609897L);
        setLongField(term116003, term116003.getClass(), "totalUltimaHighScore", -7410716980592987419L);
        setIntField(term116003, term116003.getClass(), "friendCount", 1250492252);
        setIntField(term116047, term116047.getClass(), "year", 2014);
        setShortField(term116047, term116047.getClass(), "month", (short) 9);
        setShortField(term116047, term116047.getClass(), "day", (short) 16);
        setField(term116046, term116046.getClass(), "date", term116047);
        setByteField(term116051, term116051.getClass(), "hour", (byte) 15);
        setByteField(term116051, term116051.getClass(), "minute", (byte) 18);
        setByteField(term116051, term116051.getClass(), "second", (byte) 3);
        setIntField(term116051, term116051.getClass(), "nano", 943341470);
        setField(term116046, term116046.getClass(), "time", term116051);
        setField(term116003, term116003.getClass(), "firstPlayDate", term116046);
        setIntField(term116057, term116057.getClass(), "year", 2026);
        setShortField(term116057, term116057.getClass(), "month", (short) 5);
        setShortField(term116057, term116057.getClass(), "day", (short) 23);
        setField(term116056, term116056.getClass(), "date", term116057);
        setByteField(term116061, term116061.getClass(), "hour", (byte) 9);
        setByteField(term116061, term116061.getClass(), "minute", (byte) 25);
        setByteField(term116061, term116061.getClass(), "second", (byte) 37);
        setIntField(term116061, term116061.getClass(), "nano", 305486620);
        setField(term116056, term116056.getClass(), "time", term116061);
        setField(term116003, term116003.getClass(), "lastPlayDate", term116056);
        setIntField(term116003, term116003.getClass(), "courseClass", 1574752331);
        setIntField(term116003, term116003.getClass(), "overPowerPoint", 630798929);
        setIntField(term116003, term116003.getClass(), "overPowerRate", -233941666);
        setIntField(term116003, term116003.getClass(), "mapIconId", -668572232);
        setIntField(term116003, term116003.getClass(), "voiceId", 980517356);
        setIntField(term116003, term116003.getClass(), "avatarWear", 231830300);
        setIntField(term116003, term116003.getClass(), "avatarHead", 122570449);
        setIntField(term116003, term116003.getClass(), "avatarFace", 1263525124);
        setIntField(term116003, term116003.getClass(), "avatarSkin", 867120884);
        setIntField(term116003, term116003.getClass(), "avatarItem", -1800499031);
        setIntField(term116003, term116003.getClass(), "avatarFront", 498815250);
        setIntField(term116003, term116003.getClass(), "avatarBack", 1711344474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term116003, args);
    }

};


