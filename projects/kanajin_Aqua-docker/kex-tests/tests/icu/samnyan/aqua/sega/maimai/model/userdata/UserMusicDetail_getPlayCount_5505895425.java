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

public class UserMusicDetail_getPlayCount_5505895425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181297;

    public UserMusicDetail_getPlayCount_5505895425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term181303 = new Long(8847748922379375307L);
        term181297 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term181299 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term181301 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term181317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181322 = newInstance(Class.forName("java.time.LocalTime"));
        Object term181327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181332 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term181297, term181297.getClass(), "id", 2356364798178675182L);
        setLongField(term181299, term181299.getClass(), "id", 7063501880932248824L);
        setLongField(term181301, term181301.getClass(), "id", 8782042393246212473L);
        setField(term181301, term181301.getClass(), "extId", term181303);
        setField(term181301, term181301.getClass(), "luid", "fdRVcZbqUf");
        setIntField(term181318, term181318.getClass(), "year", 2023);
        setShortField(term181318, term181318.getClass(), "month", (short) 8);
        setShortField(term181318, term181318.getClass(), "day", (short) 23);
        setField(term181317, term181317.getClass(), "date", term181318);
        setByteField(term181322, term181322.getClass(), "hour", (byte) 23);
        setByteField(term181322, term181322.getClass(), "minute", (byte) 38);
        setByteField(term181322, term181322.getClass(), "second", (byte) 9);
        setIntField(term181322, term181322.getClass(), "nano", 356476969);
        setField(term181317, term181317.getClass(), "time", term181322);
        setField(term181301, term181301.getClass(), "registerTime", term181317);
        setIntField(term181328, term181328.getClass(), "year", 2014);
        setShortField(term181328, term181328.getClass(), "month", (short) 4);
        setShortField(term181328, term181328.getClass(), "day", (short) 23);
        setField(term181327, term181327.getClass(), "date", term181328);
        setByteField(term181332, term181332.getClass(), "hour", (byte) 21);
        setByteField(term181332, term181332.getClass(), "minute", (byte) 18);
        setByteField(term181332, term181332.getClass(), "second", (byte) 52);
        setIntField(term181332, term181332.getClass(), "nano", 192261366);
        setField(term181327, term181327.getClass(), "time", term181332);
        setField(term181301, term181301.getClass(), "accessTime", term181327);
        setField(term181299, term181299.getClass(), "card", term181301);
        setIntField(term181299, term181299.getClass(), "lastDataVersion", -1393469093);
        setField(term181299, term181299.getClass(), "userName", "aSUSvETRSv");
        setIntField(term181299, term181299.getClass(), "point", -2078764464);
        setIntField(term181299, term181299.getClass(), "totalPoint", -873821065);
        setIntField(term181299, term181299.getClass(), "iconId", -1279780109);
        setIntField(term181299, term181299.getClass(), "nameplateId", 1131035835);
        setIntField(term181299, term181299.getClass(), "frameId", 1977850559);
        setIntField(term181299, term181299.getClass(), "trophyId", -1283796896);
        setIntField(term181299, term181299.getClass(), "playCount", 159793261);
        setIntField(term181299, term181299.getClass(), "playVsCount", 99196204);
        setIntField(term181299, term181299.getClass(), "playSyncCount", 239914222);
        setIntField(term181299, term181299.getClass(), "winCount", 1933523772);
        setIntField(term181299, term181299.getClass(), "helpCount", -708521298);
        setIntField(term181299, term181299.getClass(), "comboCount", 511797655);
        setIntField(term181299, term181299.getClass(), "feverCount", 954336176);
        setIntField(term181299, term181299.getClass(), "totalHiScore", -1758237048);
        setIntField(term181299, term181299.getClass(), "totalEasyHighScore", -2141953039);
        setIntField(term181299, term181299.getClass(), "totalBasicHighScore", -861060846);
        setIntField(term181299, term181299.getClass(), "totalAdvancedHighScore", 483850181);
        setIntField(term181299, term181299.getClass(), "totalExpertHighScore", 231079422);
        setIntField(term181299, term181299.getClass(), "totalMasterHighScore", 1335931396);
        setIntField(term181299, term181299.getClass(), "totalReMasterHighScore", 377258577);
        setIntField(term181299, term181299.getClass(), "totalHighSync", 750783547);
        setIntField(term181299, term181299.getClass(), "totalEasySync", -768389590);
        setIntField(term181299, term181299.getClass(), "totalBasicSync", 498754379);
        setIntField(term181299, term181299.getClass(), "totalAdvancedSync", -1140236709);
        setIntField(term181299, term181299.getClass(), "totalExpertSync", 553843984);
        setIntField(term181299, term181299.getClass(), "totalMasterSync", 43468859);
        setIntField(term181299, term181299.getClass(), "totalReMasterSync", 1155600394);
        setIntField(term181299, term181299.getClass(), "playerRating", 1967252096);
        setIntField(term181299, term181299.getClass(), "highestRating", -1437510628);
        setIntField(term181299, term181299.getClass(), "rankAuthTailId", 1564866334);
        setField(term181299, term181299.getClass(), "eventWatchedDate", "daQciREiuI");
        setField(term181299, term181299.getClass(), "webLimitDate", "AFRfAPZdqf");
        setIntField(term181299, term181299.getClass(), "challengeTrackPhase", -1043457054);
        setIntField(term181299, term181299.getClass(), "firstPlayBits", -924635767);
        setField(term181299, term181299.getClass(), "lastPlayDate", "cZrxYHSQhL");
        setIntField(term181299, term181299.getClass(), "lastPlaceId", -799356883);
        setField(term181299, term181299.getClass(), "lastPlaceName", "fhPRWcwAlA");
        setIntField(term181299, term181299.getClass(), "lastRegionId", -1050123832);
        setField(term181299, term181299.getClass(), "lastRegionName", "hNoRxfoxPM");
        setField(term181299, term181299.getClass(), "lastClientId", "AkemusjkVp");
        setField(term181299, term181299.getClass(), "lastCountryCode", "rqjMeNBTEM");
        setIntField(term181299, term181299.getClass(), "eventPoint", 1385372);
        setIntField(term181299, term181299.getClass(), "totalLv", -589937615);
        setIntField(term181299, term181299.getClass(), "lastLoginBonusDay", -2094798221);
        setIntField(term181299, term181299.getClass(), "lastSurvivalBonusDay", -2133051693);
        setIntField(term181299, term181299.getClass(), "loginBonusLv", 787940133);
        setField(term181297, term181297.getClass(), "user", term181299);
        setIntField(term181297, term181297.getClass(), "musicId", 790706388);
        setIntField(term181297, term181297.getClass(), "level", -1253063138);
        setIntField(term181297, term181297.getClass(), "playCount", 438967628);
        setIntField(term181297, term181297.getClass(), "scoreMax", 391165913);
        setIntField(term181297, term181297.getClass(), "syncRateMax", -627664282);
        setBooleanField(term181297, term181297.getClass(), "isAllPerfect", false);
        setIntField(term181297, term181297.getClass(), "isAllPerfectPlus", 426858053);
        setIntField(term181297, term181297.getClass(), "fullCombo", 1783611082);
        setIntField(term181297, term181297.getClass(), "maxFever", 1981784835);
        setIntField(term181297, term181297.getClass(), "achievement", -1097310555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term181297, args);
    }

};


