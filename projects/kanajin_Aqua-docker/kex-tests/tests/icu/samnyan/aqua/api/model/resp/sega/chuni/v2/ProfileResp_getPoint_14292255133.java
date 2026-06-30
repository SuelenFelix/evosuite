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

public class ProfileResp_getPoint_14292255133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115908;

    public ProfileResp_getPoint_14292255133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115908 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term115951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115966 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term115908, term115908.getClass(), "userName", "YxSRUAFNue");
        setIntField(term115908, term115908.getClass(), "level", -1842955624);
        setField(term115908, term115908.getClass(), "exp", "lbpaurFUWq");
        setLongField(term115908, term115908.getClass(), "point", -5689485253872606188L);
        setLongField(term115908, term115908.getClass(), "totalPoint", -6285237283805727297L);
        setIntField(term115908, term115908.getClass(), "playCount", -1791717723);
        setIntField(term115908, term115908.getClass(), "playerRating", -218745161);
        setIntField(term115908, term115908.getClass(), "highestRating", -925518531);
        setIntField(term115908, term115908.getClass(), "nameplateId", -690370395);
        setIntField(term115908, term115908.getClass(), "frameId", 250206312);
        setIntField(term115908, term115908.getClass(), "characterId", -855735924);
        setIntField(term115908, term115908.getClass(), "trophyId", 48762437);
        setIntField(term115908, term115908.getClass(), "totalMapNum", -1210827336);
        setLongField(term115908, term115908.getClass(), "totalHiScore", 5275929567294632083L);
        setLongField(term115908, term115908.getClass(), "totalBasicHighScore", 3887073949062468445L);
        setLongField(term115908, term115908.getClass(), "totalAdvancedHighScore", 4269796195929114553L);
        setLongField(term115908, term115908.getClass(), "totalExpertHighScore", 8591178855281158820L);
        setLongField(term115908, term115908.getClass(), "totalMasterHighScore", -8153185445188422129L);
        setLongField(term115908, term115908.getClass(), "totalUltimaHighScore", 2128957764288200150L);
        setIntField(term115908, term115908.getClass(), "friendCount", -1218305529);
        setIntField(term115952, term115952.getClass(), "year", 2010);
        setShortField(term115952, term115952.getClass(), "month", (short) 12);
        setShortField(term115952, term115952.getClass(), "day", (short) 24);
        setField(term115951, term115951.getClass(), "date", term115952);
        setByteField(term115956, term115956.getClass(), "hour", (byte) 22);
        setByteField(term115956, term115956.getClass(), "minute", (byte) 16);
        setByteField(term115956, term115956.getClass(), "second", (byte) 55);
        setIntField(term115956, term115956.getClass(), "nano", 411197675);
        setField(term115951, term115951.getClass(), "time", term115956);
        setField(term115908, term115908.getClass(), "firstPlayDate", term115951);
        setIntField(term115962, term115962.getClass(), "year", 2029);
        setShortField(term115962, term115962.getClass(), "month", (short) 10);
        setShortField(term115962, term115962.getClass(), "day", (short) 24);
        setField(term115961, term115961.getClass(), "date", term115962);
        setByteField(term115966, term115966.getClass(), "hour", (byte) 12);
        setByteField(term115966, term115966.getClass(), "minute", (byte) 2);
        setByteField(term115966, term115966.getClass(), "second", (byte) 39);
        setIntField(term115966, term115966.getClass(), "nano", 692525887);
        setField(term115961, term115961.getClass(), "time", term115966);
        setField(term115908, term115908.getClass(), "lastPlayDate", term115961);
        setIntField(term115908, term115908.getClass(), "courseClass", -1689060530);
        setIntField(term115908, term115908.getClass(), "overPowerPoint", -237087866);
        setIntField(term115908, term115908.getClass(), "overPowerRate", -1665489026);
        setIntField(term115908, term115908.getClass(), "mapIconId", 673096863);
        setIntField(term115908, term115908.getClass(), "voiceId", -972155988);
        setIntField(term115908, term115908.getClass(), "avatarWear", 1027701589);
        setIntField(term115908, term115908.getClass(), "avatarHead", 1136735071);
        setIntField(term115908, term115908.getClass(), "avatarFace", 1169505743);
        setIntField(term115908, term115908.getClass(), "avatarSkin", -1876433664);
        setIntField(term115908, term115908.getClass(), "avatarItem", 1037514137);
        setIntField(term115908, term115908.getClass(), "avatarFront", -651580757);
        setIntField(term115908, term115908.getClass(), "avatarBack", 150702563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term115908, args);
    }

};


