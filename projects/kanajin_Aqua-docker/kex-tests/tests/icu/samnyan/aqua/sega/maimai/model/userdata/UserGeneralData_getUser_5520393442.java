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

public class UserGeneralData_getUser_5520393442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108331;

    public UserGeneralData_getUser_5520393442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108337 = new Long(-432424084523104253L);
        term108331 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term108333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term108335 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108366 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108331, term108331.getClass(), "id", 1145539328952774873L);
        setLongField(term108333, term108333.getClass(), "id", -4593197356529163455L);
        setLongField(term108335, term108335.getClass(), "id", -8449554760304422682L);
        setField(term108335, term108335.getClass(), "extId", term108337);
        setField(term108335, term108335.getClass(), "luid", "bUOSwRmGmB");
        setIntField(term108352, term108352.getClass(), "year", 2029);
        setShortField(term108352, term108352.getClass(), "month", (short) 11);
        setShortField(term108352, term108352.getClass(), "day", (short) 6);
        setField(term108351, term108351.getClass(), "date", term108352);
        setByteField(term108356, term108356.getClass(), "hour", (byte) 10);
        setByteField(term108356, term108356.getClass(), "minute", (byte) 49);
        setByteField(term108356, term108356.getClass(), "second", (byte) 58);
        setIntField(term108356, term108356.getClass(), "nano", 611097210);
        setField(term108351, term108351.getClass(), "time", term108356);
        setField(term108335, term108335.getClass(), "registerTime", term108351);
        setIntField(term108362, term108362.getClass(), "year", 2024);
        setShortField(term108362, term108362.getClass(), "month", (short) 1);
        setShortField(term108362, term108362.getClass(), "day", (short) 6);
        setField(term108361, term108361.getClass(), "date", term108362);
        setByteField(term108366, term108366.getClass(), "hour", (byte) 6);
        setByteField(term108366, term108366.getClass(), "minute", (byte) 55);
        setByteField(term108366, term108366.getClass(), "second", (byte) 13);
        setIntField(term108366, term108366.getClass(), "nano", 533001418);
        setField(term108361, term108361.getClass(), "time", term108366);
        setField(term108335, term108335.getClass(), "accessTime", term108361);
        setField(term108333, term108333.getClass(), "card", term108335);
        setIntField(term108333, term108333.getClass(), "lastDataVersion", 1541036402);
        setField(term108333, term108333.getClass(), "userName", "jJzyVCBtLl");
        setIntField(term108333, term108333.getClass(), "point", 1185835742);
        setIntField(term108333, term108333.getClass(), "totalPoint", 1564010051);
        setIntField(term108333, term108333.getClass(), "iconId", -393490765);
        setIntField(term108333, term108333.getClass(), "nameplateId", 1719645392);
        setIntField(term108333, term108333.getClass(), "frameId", -1568726677);
        setIntField(term108333, term108333.getClass(), "trophyId", -50171390);
        setIntField(term108333, term108333.getClass(), "playCount", -1864856304);
        setIntField(term108333, term108333.getClass(), "playVsCount", -350728812);
        setIntField(term108333, term108333.getClass(), "playSyncCount", 809905435);
        setIntField(term108333, term108333.getClass(), "winCount", 574151348);
        setIntField(term108333, term108333.getClass(), "helpCount", 70907345);
        setIntField(term108333, term108333.getClass(), "comboCount", 545684828);
        setIntField(term108333, term108333.getClass(), "feverCount", 1278943912);
        setIntField(term108333, term108333.getClass(), "totalHiScore", -1918459934);
        setIntField(term108333, term108333.getClass(), "totalEasyHighScore", -1518816079);
        setIntField(term108333, term108333.getClass(), "totalBasicHighScore", -1959564399);
        setIntField(term108333, term108333.getClass(), "totalAdvancedHighScore", 789264413);
        setIntField(term108333, term108333.getClass(), "totalExpertHighScore", 1411543119);
        setIntField(term108333, term108333.getClass(), "totalMasterHighScore", 21102667);
        setIntField(term108333, term108333.getClass(), "totalReMasterHighScore", -1730684267);
        setIntField(term108333, term108333.getClass(), "totalHighSync", -291152891);
        setIntField(term108333, term108333.getClass(), "totalEasySync", 527391816);
        setIntField(term108333, term108333.getClass(), "totalBasicSync", 407142365);
        setIntField(term108333, term108333.getClass(), "totalAdvancedSync", -303557577);
        setIntField(term108333, term108333.getClass(), "totalExpertSync", -24241468);
        setIntField(term108333, term108333.getClass(), "totalMasterSync", 1648187712);
        setIntField(term108333, term108333.getClass(), "totalReMasterSync", -1643165362);
        setIntField(term108333, term108333.getClass(), "playerRating", 644721007);
        setIntField(term108333, term108333.getClass(), "highestRating", -1061030332);
        setIntField(term108333, term108333.getClass(), "rankAuthTailId", 1719003803);
        setField(term108333, term108333.getClass(), "eventWatchedDate", "MZPPOYZzth");
        setField(term108333, term108333.getClass(), "webLimitDate", "pxFICtkwAB");
        setIntField(term108333, term108333.getClass(), "challengeTrackPhase", 1792293745);
        setIntField(term108333, term108333.getClass(), "firstPlayBits", 294713671);
        setField(term108333, term108333.getClass(), "lastPlayDate", "MrgAxXXbMg");
        setIntField(term108333, term108333.getClass(), "lastPlaceId", 1869812691);
        setField(term108333, term108333.getClass(), "lastPlaceName", "ZmwRRoQNPl");
        setIntField(term108333, term108333.getClass(), "lastRegionId", 1131021258);
        setField(term108333, term108333.getClass(), "lastRegionName", "prNciwKNKW");
        setField(term108333, term108333.getClass(), "lastClientId", "VtfNPRNIuG");
        setField(term108333, term108333.getClass(), "lastCountryCode", "ttqikiUUcN");
        setIntField(term108333, term108333.getClass(), "eventPoint", 1216297099);
        setIntField(term108333, term108333.getClass(), "totalLv", 1287631638);
        setIntField(term108333, term108333.getClass(), "lastLoginBonusDay", -447126454);
        setIntField(term108333, term108333.getClass(), "lastSurvivalBonusDay", 1697871767);
        setIntField(term108333, term108333.getClass(), "loginBonusLv", -1700264686);
        setField(term108331, term108331.getClass(), "user", term108333);
        setField(term108331, term108331.getClass(), "propertyKey", "NiLxAEvTVO");
        setField(term108331, term108331.getClass(), "propertyValue", "SffiObxUZK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term108331, args);
    }

};


