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

public class UserSurvival_equals_189370809315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106223;
     Object term106404;

    public UserSurvival_equals_189370809315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term106229 = new Long(-1164342036939643746L);
        term106223 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term106225 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term106227 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term106243 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106244 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106248 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106258 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term106223, term106223.getClass(), "id", 8259341710509598103L);
        setLongField(term106225, term106225.getClass(), "id", -3542890656778018623L);
        setLongField(term106227, term106227.getClass(), "id", -2892042709653134442L);
        setField(term106227, term106227.getClass(), "extId", term106229);
        setField(term106227, term106227.getClass(), "luid", "qnsCYAsHRu");
        setIntField(term106244, term106244.getClass(), "year", 2027);
        setShortField(term106244, term106244.getClass(), "month", (short) 7);
        setShortField(term106244, term106244.getClass(), "day", (short) 21);
        setField(term106243, term106243.getClass(), "date", term106244);
        setByteField(term106248, term106248.getClass(), "hour", (byte) 9);
        setByteField(term106248, term106248.getClass(), "minute", (byte) 42);
        setByteField(term106248, term106248.getClass(), "second", (byte) 16);
        setIntField(term106248, term106248.getClass(), "nano", 660359132);
        setField(term106243, term106243.getClass(), "time", term106248);
        setField(term106227, term106227.getClass(), "registerTime", term106243);
        setIntField(term106254, term106254.getClass(), "year", 2022);
        setShortField(term106254, term106254.getClass(), "month", (short) 12);
        setShortField(term106254, term106254.getClass(), "day", (short) 24);
        setField(term106253, term106253.getClass(), "date", term106254);
        setByteField(term106258, term106258.getClass(), "hour", (byte) 7);
        setByteField(term106258, term106258.getClass(), "minute", (byte) 20);
        setByteField(term106258, term106258.getClass(), "second", (byte) 0);
        setIntField(term106258, term106258.getClass(), "nano", 127843410);
        setField(term106253, term106253.getClass(), "time", term106258);
        setField(term106227, term106227.getClass(), "accessTime", term106253);
        setField(term106225, term106225.getClass(), "card", term106227);
        setIntField(term106225, term106225.getClass(), "lastDataVersion", 2015303962);
        setField(term106225, term106225.getClass(), "userName", "qMoCYznUOe");
        setIntField(term106225, term106225.getClass(), "point", -2104017987);
        setIntField(term106225, term106225.getClass(), "totalPoint", -140083994);
        setIntField(term106225, term106225.getClass(), "iconId", -309241845);
        setIntField(term106225, term106225.getClass(), "nameplateId", -510075480);
        setIntField(term106225, term106225.getClass(), "frameId", 2108016352);
        setIntField(term106225, term106225.getClass(), "trophyId", 1369643206);
        setIntField(term106225, term106225.getClass(), "playCount", -1289723150);
        setIntField(term106225, term106225.getClass(), "playVsCount", 1642362629);
        setIntField(term106225, term106225.getClass(), "playSyncCount", -979192435);
        setIntField(term106225, term106225.getClass(), "winCount", -1921424551);
        setIntField(term106225, term106225.getClass(), "helpCount", 101983151);
        setIntField(term106225, term106225.getClass(), "comboCount", -8336587);
        setIntField(term106225, term106225.getClass(), "feverCount", 1463010893);
        setIntField(term106225, term106225.getClass(), "totalHiScore", -1452316637);
        setIntField(term106225, term106225.getClass(), "totalEasyHighScore", -838298764);
        setIntField(term106225, term106225.getClass(), "totalBasicHighScore", 953497835);
        setIntField(term106225, term106225.getClass(), "totalAdvancedHighScore", -1249269926);
        setIntField(term106225, term106225.getClass(), "totalExpertHighScore", -1389133666);
        setIntField(term106225, term106225.getClass(), "totalMasterHighScore", 308996006);
        setIntField(term106225, term106225.getClass(), "totalReMasterHighScore", 1161088046);
        setIntField(term106225, term106225.getClass(), "totalHighSync", 960018546);
        setIntField(term106225, term106225.getClass(), "totalEasySync", -2118429819);
        setIntField(term106225, term106225.getClass(), "totalBasicSync", -2005706286);
        setIntField(term106225, term106225.getClass(), "totalAdvancedSync", -556951238);
        setIntField(term106225, term106225.getClass(), "totalExpertSync", -1728342547);
        setIntField(term106225, term106225.getClass(), "totalMasterSync", -2088958897);
        setIntField(term106225, term106225.getClass(), "totalReMasterSync", 2078210785);
        setIntField(term106225, term106225.getClass(), "playerRating", 427319716);
        setIntField(term106225, term106225.getClass(), "highestRating", 1672134929);
        setIntField(term106225, term106225.getClass(), "rankAuthTailId", -141732103);
        setField(term106225, term106225.getClass(), "eventWatchedDate", "fjOTVskUVh");
        setField(term106225, term106225.getClass(), "webLimitDate", "OhiftESVwX");
        setIntField(term106225, term106225.getClass(), "challengeTrackPhase", -1315502709);
        setIntField(term106225, term106225.getClass(), "firstPlayBits", -755308608);
        setField(term106225, term106225.getClass(), "lastPlayDate", "UkppLrLyZM");
        setIntField(term106225, term106225.getClass(), "lastPlaceId", -74057307);
        setField(term106225, term106225.getClass(), "lastPlaceName", "MxFKwAHuar");
        setIntField(term106225, term106225.getClass(), "lastRegionId", 1133890568);
        setField(term106225, term106225.getClass(), "lastRegionName", "DhSWasYJlP");
        setField(term106225, term106225.getClass(), "lastClientId", "JOSsHVpnAd");
        setField(term106225, term106225.getClass(), "lastCountryCode", "PbEsDEkNLx");
        setIntField(term106225, term106225.getClass(), "eventPoint", -1537842167);
        setIntField(term106225, term106225.getClass(), "totalLv", -1785621434);
        setIntField(term106225, term106225.getClass(), "lastLoginBonusDay", -1591665469);
        setIntField(term106225, term106225.getClass(), "lastSurvivalBonusDay", -1505625906);
        setIntField(term106225, term106225.getClass(), "loginBonusLv", -1623892722);
        setField(term106223, term106223.getClass(), "user", term106225);
        setIntField(term106223, term106223.getClass(), "survivalId", 1807438387);
        setIntField(term106223, term106223.getClass(), "totalScore", 911187186);
        setIntField(term106223, term106223.getClass(), "totalAchieve", -772562965);
        setBooleanField(term106223, term106223.getClass(), "isClear", true);
        setBooleanField(term106223, term106223.getClass(), "isNoDamage", true);
        term106404 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term106404;
        callMethod(klass, "equals", argTypes, term106223, args);
    }

};


