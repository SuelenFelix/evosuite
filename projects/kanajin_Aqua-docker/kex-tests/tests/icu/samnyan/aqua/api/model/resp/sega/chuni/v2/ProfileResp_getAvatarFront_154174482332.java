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

public class ProfileResp_getAvatarFront_154174482332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118663;

    public ProfileResp_getAvatarFront_154174482332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118663 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118706 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118707 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118711 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118721 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118663, term118663.getClass(), "userName", "hnHAGEsrzw");
        setIntField(term118663, term118663.getClass(), "level", 1155809534);
        setField(term118663, term118663.getClass(), "exp", "EznFFdnKQD");
        setLongField(term118663, term118663.getClass(), "point", -6212921171477258438L);
        setLongField(term118663, term118663.getClass(), "totalPoint", -6525339099981396474L);
        setIntField(term118663, term118663.getClass(), "playCount", 1713702533);
        setIntField(term118663, term118663.getClass(), "playerRating", -1913093761);
        setIntField(term118663, term118663.getClass(), "highestRating", -526283815);
        setIntField(term118663, term118663.getClass(), "nameplateId", 2112782673);
        setIntField(term118663, term118663.getClass(), "frameId", -1444901664);
        setIntField(term118663, term118663.getClass(), "characterId", -1054172241);
        setIntField(term118663, term118663.getClass(), "trophyId", 1011684178);
        setIntField(term118663, term118663.getClass(), "totalMapNum", 2087135087);
        setLongField(term118663, term118663.getClass(), "totalHiScore", 8717114834059748754L);
        setLongField(term118663, term118663.getClass(), "totalBasicHighScore", -1286664203066051015L);
        setLongField(term118663, term118663.getClass(), "totalAdvancedHighScore", -6988326223564223966L);
        setLongField(term118663, term118663.getClass(), "totalExpertHighScore", 1481002182512184986L);
        setLongField(term118663, term118663.getClass(), "totalMasterHighScore", 25777508728098735L);
        setLongField(term118663, term118663.getClass(), "totalUltimaHighScore", -5537421233963863439L);
        setIntField(term118663, term118663.getClass(), "friendCount", 244993529);
        setIntField(term118707, term118707.getClass(), "year", 2022);
        setShortField(term118707, term118707.getClass(), "month", (short) 7);
        setShortField(term118707, term118707.getClass(), "day", (short) 25);
        setField(term118706, term118706.getClass(), "date", term118707);
        setByteField(term118711, term118711.getClass(), "hour", (byte) 0);
        setByteField(term118711, term118711.getClass(), "minute", (byte) 35);
        setByteField(term118711, term118711.getClass(), "second", (byte) 19);
        setIntField(term118711, term118711.getClass(), "nano", 858415763);
        setField(term118706, term118706.getClass(), "time", term118711);
        setField(term118663, term118663.getClass(), "firstPlayDate", term118706);
        setIntField(term118717, term118717.getClass(), "year", 2014);
        setShortField(term118717, term118717.getClass(), "month", (short) 4);
        setShortField(term118717, term118717.getClass(), "day", (short) 16);
        setField(term118716, term118716.getClass(), "date", term118717);
        setByteField(term118721, term118721.getClass(), "hour", (byte) 23);
        setByteField(term118721, term118721.getClass(), "minute", (byte) 11);
        setByteField(term118721, term118721.getClass(), "second", (byte) 53);
        setIntField(term118721, term118721.getClass(), "nano", 229077697);
        setField(term118716, term118716.getClass(), "time", term118721);
        setField(term118663, term118663.getClass(), "lastPlayDate", term118716);
        setIntField(term118663, term118663.getClass(), "courseClass", 849237714);
        setIntField(term118663, term118663.getClass(), "overPowerPoint", -1957249190);
        setIntField(term118663, term118663.getClass(), "overPowerRate", -1480524934);
        setIntField(term118663, term118663.getClass(), "mapIconId", 540606851);
        setIntField(term118663, term118663.getClass(), "voiceId", -1455381795);
        setIntField(term118663, term118663.getClass(), "avatarWear", 197022132);
        setIntField(term118663, term118663.getClass(), "avatarHead", -878867286);
        setIntField(term118663, term118663.getClass(), "avatarFace", 1317157561);
        setIntField(term118663, term118663.getClass(), "avatarSkin", 1877797886);
        setIntField(term118663, term118663.getClass(), "avatarItem", 404165417);
        setIntField(term118663, term118663.getClass(), "avatarFront", -1895725729);
        setIntField(term118663, term118663.getClass(), "avatarBack", -1940116246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarFront", argTypes, term118663, args);
    }

};


