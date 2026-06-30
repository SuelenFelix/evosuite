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

public class UserData_setEventWatchedDate_139092995484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22309;

    public UserData_setEventWatchedDate_139092995484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22313 = new Long(2701184207686293431L);
        term22309 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term22311 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term22327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22332 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22342 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term22309, term22309.getClass(), "id", 3427570961451840069L);
        setLongField(term22311, term22311.getClass(), "id", 4502292577098212311L);
        setField(term22311, term22311.getClass(), "extId", term22313);
        setField(term22311, term22311.getClass(), "luid", "ngYxiXTZrk");
        setIntField(term22328, term22328.getClass(), "year", 2020);
        setShortField(term22328, term22328.getClass(), "month", (short) 2);
        setShortField(term22328, term22328.getClass(), "day", (short) 1);
        setField(term22327, term22327.getClass(), "date", term22328);
        setByteField(term22332, term22332.getClass(), "hour", (byte) 0);
        setByteField(term22332, term22332.getClass(), "minute", (byte) 46);
        setByteField(term22332, term22332.getClass(), "second", (byte) 1);
        setIntField(term22332, term22332.getClass(), "nano", 544722812);
        setField(term22327, term22327.getClass(), "time", term22332);
        setField(term22311, term22311.getClass(), "registerTime", term22327);
        setIntField(term22338, term22338.getClass(), "year", 2027);
        setShortField(term22338, term22338.getClass(), "month", (short) 8);
        setShortField(term22338, term22338.getClass(), "day", (short) 16);
        setField(term22337, term22337.getClass(), "date", term22338);
        setByteField(term22342, term22342.getClass(), "hour", (byte) 15);
        setByteField(term22342, term22342.getClass(), "minute", (byte) 1);
        setByteField(term22342, term22342.getClass(), "second", (byte) 18);
        setIntField(term22342, term22342.getClass(), "nano", 245350825);
        setField(term22337, term22337.getClass(), "time", term22342);
        setField(term22311, term22311.getClass(), "accessTime", term22337);
        setField(term22309, term22309.getClass(), "card", term22311);
        setIntField(term22309, term22309.getClass(), "lastDataVersion", 48416396);
        setField(term22309, term22309.getClass(), "userName", "YTxBqWRAlo");
        setIntField(term22309, term22309.getClass(), "point", -1949441630);
        setIntField(term22309, term22309.getClass(), "totalPoint", 1641286805);
        setIntField(term22309, term22309.getClass(), "iconId", -370516662);
        setIntField(term22309, term22309.getClass(), "nameplateId", -372652916);
        setIntField(term22309, term22309.getClass(), "frameId", 1915058189);
        setIntField(term22309, term22309.getClass(), "trophyId", -1466811987);
        setIntField(term22309, term22309.getClass(), "playCount", 469445830);
        setIntField(term22309, term22309.getClass(), "playVsCount", -1482217659);
        setIntField(term22309, term22309.getClass(), "playSyncCount", 1650302326);
        setIntField(term22309, term22309.getClass(), "winCount", -123648353);
        setIntField(term22309, term22309.getClass(), "helpCount", -992215212);
        setIntField(term22309, term22309.getClass(), "comboCount", 665125325);
        setIntField(term22309, term22309.getClass(), "feverCount", -1180829225);
        setIntField(term22309, term22309.getClass(), "totalHiScore", -19961314);
        setIntField(term22309, term22309.getClass(), "totalEasyHighScore", 903876999);
        setIntField(term22309, term22309.getClass(), "totalBasicHighScore", -20697214);
        setIntField(term22309, term22309.getClass(), "totalAdvancedHighScore", -374105961);
        setIntField(term22309, term22309.getClass(), "totalExpertHighScore", -198328789);
        setIntField(term22309, term22309.getClass(), "totalMasterHighScore", -158694757);
        setIntField(term22309, term22309.getClass(), "totalReMasterHighScore", -1855067606);
        setIntField(term22309, term22309.getClass(), "totalHighSync", -433967657);
        setIntField(term22309, term22309.getClass(), "totalEasySync", 1411661019);
        setIntField(term22309, term22309.getClass(), "totalBasicSync", 1020857327);
        setIntField(term22309, term22309.getClass(), "totalAdvancedSync", 587603547);
        setIntField(term22309, term22309.getClass(), "totalExpertSync", -1049371381);
        setIntField(term22309, term22309.getClass(), "totalMasterSync", -331201186);
        setIntField(term22309, term22309.getClass(), "totalReMasterSync", 406731696);
        setIntField(term22309, term22309.getClass(), "playerRating", 690233885);
        setIntField(term22309, term22309.getClass(), "highestRating", -1482271539);
        setIntField(term22309, term22309.getClass(), "rankAuthTailId", 52686140);
        setField(term22309, term22309.getClass(), "eventWatchedDate", "ReruUQRXwl");
        setField(term22309, term22309.getClass(), "webLimitDate", "DWEsVQwuaE");
        setIntField(term22309, term22309.getClass(), "challengeTrackPhase", -352835881);
        setIntField(term22309, term22309.getClass(), "firstPlayBits", 2119021005);
        setField(term22309, term22309.getClass(), "lastPlayDate", "qGkNzZAeDN");
        setIntField(term22309, term22309.getClass(), "lastPlaceId", 1361925101);
        setField(term22309, term22309.getClass(), "lastPlaceName", "wdtiuPgTVJ");
        setIntField(term22309, term22309.getClass(), "lastRegionId", -1702583840);
        setField(term22309, term22309.getClass(), "lastRegionName", "HUgzMgrpsK");
        setField(term22309, term22309.getClass(), "lastClientId", "ubaBUfLolu");
        setField(term22309, term22309.getClass(), "lastCountryCode", "itAUCFhZhq");
        setIntField(term22309, term22309.getClass(), "eventPoint", -1496594860);
        setIntField(term22309, term22309.getClass(), "totalLv", -1754638525);
        setIntField(term22309, term22309.getClass(), "lastLoginBonusDay", -1058018356);
        setIntField(term22309, term22309.getClass(), "lastSurvivalBonusDay", -618930598);
        setIntField(term22309, term22309.getClass(), "loginBonusLv", -1912835189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bIqaKgXgPm";
        callMethod(klass, "setEventWatchedDate", argTypes, term22309, args);
    }

};


