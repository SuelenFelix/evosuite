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

public class UserData_getLastPlaceName_11206193240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10561;

    public UserData_getLastPlaceName_11206193240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10565 = new Long(4178434741742309755L);
        term10561 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term10563 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term10579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10584 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10594 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10561, term10561.getClass(), "id", 5510783420697225605L);
        setLongField(term10563, term10563.getClass(), "id", 6005241913654469005L);
        setField(term10563, term10563.getClass(), "extId", term10565);
        setField(term10563, term10563.getClass(), "luid", "AWYyZiNfsm");
        setIntField(term10580, term10580.getClass(), "year", 2011);
        setShortField(term10580, term10580.getClass(), "month", (short) 4);
        setShortField(term10580, term10580.getClass(), "day", (short) 19);
        setField(term10579, term10579.getClass(), "date", term10580);
        setByteField(term10584, term10584.getClass(), "hour", (byte) 12);
        setByteField(term10584, term10584.getClass(), "minute", (byte) 0);
        setByteField(term10584, term10584.getClass(), "second", (byte) 14);
        setIntField(term10584, term10584.getClass(), "nano", 849079063);
        setField(term10579, term10579.getClass(), "time", term10584);
        setField(term10563, term10563.getClass(), "registerTime", term10579);
        setIntField(term10590, term10590.getClass(), "year", 2014);
        setShortField(term10590, term10590.getClass(), "month", (short) 8);
        setShortField(term10590, term10590.getClass(), "day", (short) 17);
        setField(term10589, term10589.getClass(), "date", term10590);
        setByteField(term10594, term10594.getClass(), "hour", (byte) 19);
        setByteField(term10594, term10594.getClass(), "minute", (byte) 32);
        setByteField(term10594, term10594.getClass(), "second", (byte) 5);
        setIntField(term10594, term10594.getClass(), "nano", 604713831);
        setField(term10589, term10589.getClass(), "time", term10594);
        setField(term10563, term10563.getClass(), "accessTime", term10589);
        setField(term10561, term10561.getClass(), "card", term10563);
        setIntField(term10561, term10561.getClass(), "lastDataVersion", 30837706);
        setField(term10561, term10561.getClass(), "userName", "ITRRYiuDwH");
        setIntField(term10561, term10561.getClass(), "point", 379523101);
        setIntField(term10561, term10561.getClass(), "totalPoint", 1017354215);
        setIntField(term10561, term10561.getClass(), "iconId", 695330987);
        setIntField(term10561, term10561.getClass(), "nameplateId", -267289967);
        setIntField(term10561, term10561.getClass(), "frameId", 773432822);
        setIntField(term10561, term10561.getClass(), "trophyId", -488294922);
        setIntField(term10561, term10561.getClass(), "playCount", -397161164);
        setIntField(term10561, term10561.getClass(), "playVsCount", -703717191);
        setIntField(term10561, term10561.getClass(), "playSyncCount", -1255535445);
        setIntField(term10561, term10561.getClass(), "winCount", -2033952124);
        setIntField(term10561, term10561.getClass(), "helpCount", 560401653);
        setIntField(term10561, term10561.getClass(), "comboCount", 1633691536);
        setIntField(term10561, term10561.getClass(), "feverCount", 898165245);
        setIntField(term10561, term10561.getClass(), "totalHiScore", 1810754549);
        setIntField(term10561, term10561.getClass(), "totalEasyHighScore", 338342107);
        setIntField(term10561, term10561.getClass(), "totalBasicHighScore", -650288950);
        setIntField(term10561, term10561.getClass(), "totalAdvancedHighScore", 433039357);
        setIntField(term10561, term10561.getClass(), "totalExpertHighScore", 1469939797);
        setIntField(term10561, term10561.getClass(), "totalMasterHighScore", 252799294);
        setIntField(term10561, term10561.getClass(), "totalReMasterHighScore", -2072618022);
        setIntField(term10561, term10561.getClass(), "totalHighSync", -269909549);
        setIntField(term10561, term10561.getClass(), "totalEasySync", 686286032);
        setIntField(term10561, term10561.getClass(), "totalBasicSync", -1277201854);
        setIntField(term10561, term10561.getClass(), "totalAdvancedSync", 1691516034);
        setIntField(term10561, term10561.getClass(), "totalExpertSync", 335681723);
        setIntField(term10561, term10561.getClass(), "totalMasterSync", -773707674);
        setIntField(term10561, term10561.getClass(), "totalReMasterSync", 383244929);
        setIntField(term10561, term10561.getClass(), "playerRating", -2114034003);
        setIntField(term10561, term10561.getClass(), "highestRating", 207213904);
        setIntField(term10561, term10561.getClass(), "rankAuthTailId", -484303394);
        setField(term10561, term10561.getClass(), "eventWatchedDate", "llRfwANcVF");
        setField(term10561, term10561.getClass(), "webLimitDate", "sUEeHQTWkA");
        setIntField(term10561, term10561.getClass(), "challengeTrackPhase", -31125530);
        setIntField(term10561, term10561.getClass(), "firstPlayBits", 1909773180);
        setField(term10561, term10561.getClass(), "lastPlayDate", "BDIRCxAWLA");
        setIntField(term10561, term10561.getClass(), "lastPlaceId", -970417907);
        setField(term10561, term10561.getClass(), "lastPlaceName", "eOJfbiZLnb");
        setIntField(term10561, term10561.getClass(), "lastRegionId", 1097894139);
        setField(term10561, term10561.getClass(), "lastRegionName", "nKZKnxWYCK");
        setField(term10561, term10561.getClass(), "lastClientId", "JOqQxuzRuZ");
        setField(term10561, term10561.getClass(), "lastCountryCode", "RSaoipUlsg");
        setIntField(term10561, term10561.getClass(), "eventPoint", 390256347);
        setIntField(term10561, term10561.getClass(), "totalLv", 1471619998);
        setIntField(term10561, term10561.getClass(), "lastLoginBonusDay", -1623489521);
        setIntField(term10561, term10561.getClass(), "lastSurvivalBonusDay", 1179937517);
        setIntField(term10561, term10561.getClass(), "loginBonusLv", 200150950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term10561, args);
    }

};


