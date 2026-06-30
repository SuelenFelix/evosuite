package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_getLastSurvivalBonusDay_36536424048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12673;

    public UserData_getLastSurvivalBonusDay_36536424048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12677 = new Long(-4443169559037975007L);
        term12673 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term12675 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term12691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12706 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12673, term12673.getClass(), "id", 2135754395358000892L);
        setLongField(term12675, term12675.getClass(), "id", -8085190702504231560L);
        setField(term12675, term12675.getClass(), "extId", term12677);
        setField(term12675, term12675.getClass(), "luid", "KtuuNAqGCQ");
        setIntField(term12692, term12692.getClass(), "year", 2016);
        setShortField(term12692, term12692.getClass(), "month", (short) 6);
        setShortField(term12692, term12692.getClass(), "day", (short) 23);
        setField(term12691, term12691.getClass(), "date", term12692);
        setByteField(term12696, term12696.getClass(), "hour", (byte) 20);
        setByteField(term12696, term12696.getClass(), "minute", (byte) 51);
        setByteField(term12696, term12696.getClass(), "second", (byte) 43);
        setIntField(term12696, term12696.getClass(), "nano", 284389409);
        setField(term12691, term12691.getClass(), "time", term12696);
        setField(term12675, term12675.getClass(), "registerTime", term12691);
        setIntField(term12702, term12702.getClass(), "year", 2014);
        setShortField(term12702, term12702.getClass(), "month", (short) 10);
        setShortField(term12702, term12702.getClass(), "day", (short) 7);
        setField(term12701, term12701.getClass(), "date", term12702);
        setByteField(term12706, term12706.getClass(), "hour", (byte) 12);
        setByteField(term12706, term12706.getClass(), "minute", (byte) 59);
        setByteField(term12706, term12706.getClass(), "second", (byte) 39);
        setIntField(term12706, term12706.getClass(), "nano", 603709306);
        setField(term12701, term12701.getClass(), "time", term12706);
        setField(term12675, term12675.getClass(), "accessTime", term12701);
        setField(term12673, term12673.getClass(), "card", term12675);
        setIntField(term12673, term12673.getClass(), "lastDataVersion", -1945754843);
        setField(term12673, term12673.getClass(), "userName", "OGQsfjmReM");
        setIntField(term12673, term12673.getClass(), "point", -1512221115);
        setIntField(term12673, term12673.getClass(), "totalPoint", -515486706);
        setIntField(term12673, term12673.getClass(), "iconId", -612862488);
        setIntField(term12673, term12673.getClass(), "nameplateId", 52739905);
        setIntField(term12673, term12673.getClass(), "frameId", -2105349391);
        setIntField(term12673, term12673.getClass(), "trophyId", -1176968921);
        setIntField(term12673, term12673.getClass(), "playCount", -1986225025);
        setIntField(term12673, term12673.getClass(), "playVsCount", -838689952);
        setIntField(term12673, term12673.getClass(), "playSyncCount", -307464652);
        setIntField(term12673, term12673.getClass(), "winCount", 460605690);
        setIntField(term12673, term12673.getClass(), "helpCount", 2119231643);
        setIntField(term12673, term12673.getClass(), "comboCount", 688546450);
        setIntField(term12673, term12673.getClass(), "feverCount", 115635779);
        setIntField(term12673, term12673.getClass(), "totalHiScore", -1081685171);
        setIntField(term12673, term12673.getClass(), "totalEasyHighScore", 1511699134);
        setIntField(term12673, term12673.getClass(), "totalBasicHighScore", 185647247);
        setIntField(term12673, term12673.getClass(), "totalAdvancedHighScore", 720814309);
        setIntField(term12673, term12673.getClass(), "totalExpertHighScore", 964137425);
        setIntField(term12673, term12673.getClass(), "totalMasterHighScore", -1378885614);
        setIntField(term12673, term12673.getClass(), "totalReMasterHighScore", -1408615666);
        setIntField(term12673, term12673.getClass(), "totalHighSync", -502299598);
        setIntField(term12673, term12673.getClass(), "totalEasySync", -516287593);
        setIntField(term12673, term12673.getClass(), "totalBasicSync", -187311406);
        setIntField(term12673, term12673.getClass(), "totalAdvancedSync", 1496632406);
        setIntField(term12673, term12673.getClass(), "totalExpertSync", 1858277277);
        setIntField(term12673, term12673.getClass(), "totalMasterSync", 2145928130);
        setIntField(term12673, term12673.getClass(), "totalReMasterSync", -1095947031);
        setIntField(term12673, term12673.getClass(), "playerRating", 1504187156);
        setIntField(term12673, term12673.getClass(), "highestRating", -1713723083);
        setIntField(term12673, term12673.getClass(), "rankAuthTailId", -1337690242);
        setField(term12673, term12673.getClass(), "eventWatchedDate", "YsUtbngnRO");
        setField(term12673, term12673.getClass(), "webLimitDate", "JisaWUxcNb");
        setIntField(term12673, term12673.getClass(), "challengeTrackPhase", 264872152);
        setIntField(term12673, term12673.getClass(), "firstPlayBits", 1645751151);
        setField(term12673, term12673.getClass(), "lastPlayDate", "NxgmYPzWCI");
        setIntField(term12673, term12673.getClass(), "lastPlaceId", -2117930201);
        setField(term12673, term12673.getClass(), "lastPlaceName", "SqjyKmayBx");
        setIntField(term12673, term12673.getClass(), "lastRegionId", 1839150896);
        setField(term12673, term12673.getClass(), "lastRegionName", "XjDhvToxJy");
        setField(term12673, term12673.getClass(), "lastClientId", "nxSTJflLQy");
        setField(term12673, term12673.getClass(), "lastCountryCode", "FlHzxEfFzI");
        setIntField(term12673, term12673.getClass(), "eventPoint", -1487860516);
        setIntField(term12673, term12673.getClass(), "totalLv", 784631129);
        setIntField(term12673, term12673.getClass(), "lastLoginBonusDay", 658285959);
        setIntField(term12673, term12673.getClass(), "lastSurvivalBonusDay", -89362706);
        setIntField(term12673, term12673.getClass(), "loginBonusLv", 341388367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSurvivalBonusDay", argTypes, term12673, args);
    }

};


