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

public class UserPresentEvent_getRate_7308210346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98253;

    public UserPresentEvent_getRate_7308210346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term98259 = new Long(-3602825674339018793L);
        term98253 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term98255 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term98257 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term98273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98288 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term98253, term98253.getClass(), "id", -6651761389033452541L);
        setLongField(term98255, term98255.getClass(), "id", 7492997886327124063L);
        setLongField(term98257, term98257.getClass(), "id", -8520099975744950197L);
        setField(term98257, term98257.getClass(), "extId", term98259);
        setField(term98257, term98257.getClass(), "luid", "rXBuuDWXsm");
        setIntField(term98274, term98274.getClass(), "year", 2018);
        setShortField(term98274, term98274.getClass(), "month", (short) 4);
        setShortField(term98274, term98274.getClass(), "day", (short) 12);
        setField(term98273, term98273.getClass(), "date", term98274);
        setByteField(term98278, term98278.getClass(), "hour", (byte) 3);
        setByteField(term98278, term98278.getClass(), "minute", (byte) 25);
        setByteField(term98278, term98278.getClass(), "second", (byte) 20);
        setIntField(term98278, term98278.getClass(), "nano", 226150592);
        setField(term98273, term98273.getClass(), "time", term98278);
        setField(term98257, term98257.getClass(), "registerTime", term98273);
        setIntField(term98284, term98284.getClass(), "year", 2014);
        setShortField(term98284, term98284.getClass(), "month", (short) 10);
        setShortField(term98284, term98284.getClass(), "day", (short) 6);
        setField(term98283, term98283.getClass(), "date", term98284);
        setByteField(term98288, term98288.getClass(), "hour", (byte) 11);
        setByteField(term98288, term98288.getClass(), "minute", (byte) 32);
        setByteField(term98288, term98288.getClass(), "second", (byte) 49);
        setIntField(term98288, term98288.getClass(), "nano", 542065255);
        setField(term98283, term98283.getClass(), "time", term98288);
        setField(term98257, term98257.getClass(), "accessTime", term98283);
        setField(term98255, term98255.getClass(), "card", term98257);
        setIntField(term98255, term98255.getClass(), "lastDataVersion", -1726762020);
        setField(term98255, term98255.getClass(), "userName", "VSvKttZYSC");
        setIntField(term98255, term98255.getClass(), "point", -632724023);
        setIntField(term98255, term98255.getClass(), "totalPoint", 1593018448);
        setIntField(term98255, term98255.getClass(), "iconId", 492544194);
        setIntField(term98255, term98255.getClass(), "nameplateId", -1477909979);
        setIntField(term98255, term98255.getClass(), "frameId", -975558073);
        setIntField(term98255, term98255.getClass(), "trophyId", -541335965);
        setIntField(term98255, term98255.getClass(), "playCount", 790308552);
        setIntField(term98255, term98255.getClass(), "playVsCount", -1543840209);
        setIntField(term98255, term98255.getClass(), "playSyncCount", 411851539);
        setIntField(term98255, term98255.getClass(), "winCount", -1461527580);
        setIntField(term98255, term98255.getClass(), "helpCount", -1241679161);
        setIntField(term98255, term98255.getClass(), "comboCount", 1139363236);
        setIntField(term98255, term98255.getClass(), "feverCount", 1218891668);
        setIntField(term98255, term98255.getClass(), "totalHiScore", -2064671008);
        setIntField(term98255, term98255.getClass(), "totalEasyHighScore", 1799911486);
        setIntField(term98255, term98255.getClass(), "totalBasicHighScore", -171214424);
        setIntField(term98255, term98255.getClass(), "totalAdvancedHighScore", -1028842378);
        setIntField(term98255, term98255.getClass(), "totalExpertHighScore", 1352006091);
        setIntField(term98255, term98255.getClass(), "totalMasterHighScore", -974628095);
        setIntField(term98255, term98255.getClass(), "totalReMasterHighScore", 59950854);
        setIntField(term98255, term98255.getClass(), "totalHighSync", -952403503);
        setIntField(term98255, term98255.getClass(), "totalEasySync", 1665910999);
        setIntField(term98255, term98255.getClass(), "totalBasicSync", 773753844);
        setIntField(term98255, term98255.getClass(), "totalAdvancedSync", 1562377644);
        setIntField(term98255, term98255.getClass(), "totalExpertSync", 188245897);
        setIntField(term98255, term98255.getClass(), "totalMasterSync", -1571960696);
        setIntField(term98255, term98255.getClass(), "totalReMasterSync", -1748371946);
        setIntField(term98255, term98255.getClass(), "playerRating", 488706905);
        setIntField(term98255, term98255.getClass(), "highestRating", -2075020297);
        setIntField(term98255, term98255.getClass(), "rankAuthTailId", 1023590792);
        setField(term98255, term98255.getClass(), "eventWatchedDate", "bbwxScASWL");
        setField(term98255, term98255.getClass(), "webLimitDate", "BXJdQmJvFh");
        setIntField(term98255, term98255.getClass(), "challengeTrackPhase", 292628417);
        setIntField(term98255, term98255.getClass(), "firstPlayBits", 754216340);
        setField(term98255, term98255.getClass(), "lastPlayDate", "bsPTRsievL");
        setIntField(term98255, term98255.getClass(), "lastPlaceId", -1024407352);
        setField(term98255, term98255.getClass(), "lastPlaceName", "LPLRACmzWM");
        setIntField(term98255, term98255.getClass(), "lastRegionId", 289742263);
        setField(term98255, term98255.getClass(), "lastRegionName", "DfdUvykRzo");
        setField(term98255, term98255.getClass(), "lastClientId", "TWPJmzPTXg");
        setField(term98255, term98255.getClass(), "lastCountryCode", "frPgAZBkug");
        setIntField(term98255, term98255.getClass(), "eventPoint", 1509344303);
        setIntField(term98255, term98255.getClass(), "totalLv", 1042927327);
        setIntField(term98255, term98255.getClass(), "lastLoginBonusDay", -953392603);
        setIntField(term98255, term98255.getClass(), "lastSurvivalBonusDay", -1912063354);
        setIntField(term98255, term98255.getClass(), "loginBonusLv", -1503327936);
        setField(term98253, term98253.getClass(), "user", term98255);
        setIntField(term98253, term98253.getClass(), "presentEventId", 621306668);
        setIntField(term98253, term98253.getClass(), "point", 234624020);
        setIntField(term98253, term98253.getClass(), "presentCount", 1280314501);
        setIntField(term98253, term98253.getClass(), "rate", 1690660217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term98253, args);
    }

};


