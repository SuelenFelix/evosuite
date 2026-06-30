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

public class UserData_getTotalBasicHighScore_93409199319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5017;

    public UserData_getTotalBasicHighScore_93409199319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5021 = new Long(-4920224193275732920L);
        term5017 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term5019 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5035 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5036 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5040 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5050 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5017, term5017.getClass(), "id", -8708192233349544946L);
        setLongField(term5019, term5019.getClass(), "id", 5907001541142728739L);
        setField(term5019, term5019.getClass(), "extId", term5021);
        setField(term5019, term5019.getClass(), "luid", "rLHAoqXgPh");
        setIntField(term5036, term5036.getClass(), "year", 2023);
        setShortField(term5036, term5036.getClass(), "month", (short) 7);
        setShortField(term5036, term5036.getClass(), "day", (short) 16);
        setField(term5035, term5035.getClass(), "date", term5036);
        setByteField(term5040, term5040.getClass(), "hour", (byte) 3);
        setByteField(term5040, term5040.getClass(), "minute", (byte) 1);
        setByteField(term5040, term5040.getClass(), "second", (byte) 19);
        setIntField(term5040, term5040.getClass(), "nano", 488629554);
        setField(term5035, term5035.getClass(), "time", term5040);
        setField(term5019, term5019.getClass(), "registerTime", term5035);
        setIntField(term5046, term5046.getClass(), "year", 2018);
        setShortField(term5046, term5046.getClass(), "month", (short) 7);
        setShortField(term5046, term5046.getClass(), "day", (short) 12);
        setField(term5045, term5045.getClass(), "date", term5046);
        setByteField(term5050, term5050.getClass(), "hour", (byte) 1);
        setByteField(term5050, term5050.getClass(), "minute", (byte) 3);
        setByteField(term5050, term5050.getClass(), "second", (byte) 47);
        setIntField(term5050, term5050.getClass(), "nano", 2729929);
        setField(term5045, term5045.getClass(), "time", term5050);
        setField(term5019, term5019.getClass(), "accessTime", term5045);
        setField(term5017, term5017.getClass(), "card", term5019);
        setIntField(term5017, term5017.getClass(), "lastDataVersion", -886200503);
        setField(term5017, term5017.getClass(), "userName", "zUlRdimJtU");
        setIntField(term5017, term5017.getClass(), "point", 1136393691);
        setIntField(term5017, term5017.getClass(), "totalPoint", -1288536479);
        setIntField(term5017, term5017.getClass(), "iconId", 1092038167);
        setIntField(term5017, term5017.getClass(), "nameplateId", 1879729823);
        setIntField(term5017, term5017.getClass(), "frameId", 1443855558);
        setIntField(term5017, term5017.getClass(), "trophyId", -1933419449);
        setIntField(term5017, term5017.getClass(), "playCount", -1804322375);
        setIntField(term5017, term5017.getClass(), "playVsCount", 1595814906);
        setIntField(term5017, term5017.getClass(), "playSyncCount", -834193529);
        setIntField(term5017, term5017.getClass(), "winCount", 335780735);
        setIntField(term5017, term5017.getClass(), "helpCount", -1541981599);
        setIntField(term5017, term5017.getClass(), "comboCount", 1605456363);
        setIntField(term5017, term5017.getClass(), "feverCount", 2059896693);
        setIntField(term5017, term5017.getClass(), "totalHiScore", 2109912812);
        setIntField(term5017, term5017.getClass(), "totalEasyHighScore", 1841286431);
        setIntField(term5017, term5017.getClass(), "totalBasicHighScore", -1723168189);
        setIntField(term5017, term5017.getClass(), "totalAdvancedHighScore", -675283917);
        setIntField(term5017, term5017.getClass(), "totalExpertHighScore", -2093862988);
        setIntField(term5017, term5017.getClass(), "totalMasterHighScore", 1337828646);
        setIntField(term5017, term5017.getClass(), "totalReMasterHighScore", 532666604);
        setIntField(term5017, term5017.getClass(), "totalHighSync", -13725716);
        setIntField(term5017, term5017.getClass(), "totalEasySync", -1695750603);
        setIntField(term5017, term5017.getClass(), "totalBasicSync", 63677360);
        setIntField(term5017, term5017.getClass(), "totalAdvancedSync", 1478914037);
        setIntField(term5017, term5017.getClass(), "totalExpertSync", 1630231519);
        setIntField(term5017, term5017.getClass(), "totalMasterSync", 1460702778);
        setIntField(term5017, term5017.getClass(), "totalReMasterSync", -1398142433);
        setIntField(term5017, term5017.getClass(), "playerRating", -1112119058);
        setIntField(term5017, term5017.getClass(), "highestRating", 2073858334);
        setIntField(term5017, term5017.getClass(), "rankAuthTailId", -1693535639);
        setField(term5017, term5017.getClass(), "eventWatchedDate", "vwbEQQNQrx");
        setField(term5017, term5017.getClass(), "webLimitDate", "xtftXXMbem");
        setIntField(term5017, term5017.getClass(), "challengeTrackPhase", 1344744036);
        setIntField(term5017, term5017.getClass(), "firstPlayBits", -98060427);
        setField(term5017, term5017.getClass(), "lastPlayDate", "cudZvLMQon");
        setIntField(term5017, term5017.getClass(), "lastPlaceId", -1272268399);
        setField(term5017, term5017.getClass(), "lastPlaceName", "lihXWlGDxk");
        setIntField(term5017, term5017.getClass(), "lastRegionId", 1120271104);
        setField(term5017, term5017.getClass(), "lastRegionName", "JmcmxoGhIK");
        setField(term5017, term5017.getClass(), "lastClientId", "jXzmYyrnnT");
        setField(term5017, term5017.getClass(), "lastCountryCode", "igCAtimmYB");
        setIntField(term5017, term5017.getClass(), "eventPoint", -128435804);
        setIntField(term5017, term5017.getClass(), "totalLv", 2136158480);
        setIntField(term5017, term5017.getClass(), "lastLoginBonusDay", 2118747457);
        setIntField(term5017, term5017.getClass(), "lastSurvivalBonusDay", 1868344256);
        setIntField(term5017, term5017.getClass(), "loginBonusLv", 1857693976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicHighScore", argTypes, term5017, args);
    }

};


