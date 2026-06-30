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

public class UserItem_getItemId_6285380124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85366;

    public UserItem_getItemId_6285380124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85372 = new Long(-6969704322644192945L);
        term85366 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term85368 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term85370 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term85386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85391 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85401 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85366, term85366.getClass(), "id", -192072503176550129L);
        setLongField(term85368, term85368.getClass(), "id", -4726601557653351735L);
        setLongField(term85370, term85370.getClass(), "id", -3502423991725415780L);
        setField(term85370, term85370.getClass(), "extId", term85372);
        setField(term85370, term85370.getClass(), "luid", "YNXFGgstqj");
        setIntField(term85387, term85387.getClass(), "year", 2017);
        setShortField(term85387, term85387.getClass(), "month", (short) 10);
        setShortField(term85387, term85387.getClass(), "day", (short) 10);
        setField(term85386, term85386.getClass(), "date", term85387);
        setByteField(term85391, term85391.getClass(), "hour", (byte) 18);
        setByteField(term85391, term85391.getClass(), "minute", (byte) 16);
        setByteField(term85391, term85391.getClass(), "second", (byte) 29);
        setIntField(term85391, term85391.getClass(), "nano", 468943994);
        setField(term85386, term85386.getClass(), "time", term85391);
        setField(term85370, term85370.getClass(), "registerTime", term85386);
        setIntField(term85397, term85397.getClass(), "year", 2029);
        setShortField(term85397, term85397.getClass(), "month", (short) 3);
        setShortField(term85397, term85397.getClass(), "day", (short) 21);
        setField(term85396, term85396.getClass(), "date", term85397);
        setByteField(term85401, term85401.getClass(), "hour", (byte) 12);
        setByteField(term85401, term85401.getClass(), "minute", (byte) 42);
        setByteField(term85401, term85401.getClass(), "second", (byte) 52);
        setIntField(term85401, term85401.getClass(), "nano", 391302765);
        setField(term85396, term85396.getClass(), "time", term85401);
        setField(term85370, term85370.getClass(), "accessTime", term85396);
        setField(term85368, term85368.getClass(), "card", term85370);
        setIntField(term85368, term85368.getClass(), "lastDataVersion", -1646127961);
        setField(term85368, term85368.getClass(), "userName", "xZTWqxWsAc");
        setIntField(term85368, term85368.getClass(), "point", -2022896330);
        setIntField(term85368, term85368.getClass(), "totalPoint", -374957299);
        setIntField(term85368, term85368.getClass(), "iconId", 500378867);
        setIntField(term85368, term85368.getClass(), "nameplateId", 455556049);
        setIntField(term85368, term85368.getClass(), "frameId", 509928046);
        setIntField(term85368, term85368.getClass(), "trophyId", 40043535);
        setIntField(term85368, term85368.getClass(), "playCount", 2042043397);
        setIntField(term85368, term85368.getClass(), "playVsCount", -1390880191);
        setIntField(term85368, term85368.getClass(), "playSyncCount", 733084027);
        setIntField(term85368, term85368.getClass(), "winCount", 1314581727);
        setIntField(term85368, term85368.getClass(), "helpCount", 759320528);
        setIntField(term85368, term85368.getClass(), "comboCount", 982876717);
        setIntField(term85368, term85368.getClass(), "feverCount", -321180122);
        setIntField(term85368, term85368.getClass(), "totalHiScore", 1762912383);
        setIntField(term85368, term85368.getClass(), "totalEasyHighScore", -1154329859);
        setIntField(term85368, term85368.getClass(), "totalBasicHighScore", 719722692);
        setIntField(term85368, term85368.getClass(), "totalAdvancedHighScore", -1788049849);
        setIntField(term85368, term85368.getClass(), "totalExpertHighScore", -742041322);
        setIntField(term85368, term85368.getClass(), "totalMasterHighScore", -671124441);
        setIntField(term85368, term85368.getClass(), "totalReMasterHighScore", 938533783);
        setIntField(term85368, term85368.getClass(), "totalHighSync", -1125401257);
        setIntField(term85368, term85368.getClass(), "totalEasySync", -2142317069);
        setIntField(term85368, term85368.getClass(), "totalBasicSync", 2015219082);
        setIntField(term85368, term85368.getClass(), "totalAdvancedSync", 516261940);
        setIntField(term85368, term85368.getClass(), "totalExpertSync", 894530883);
        setIntField(term85368, term85368.getClass(), "totalMasterSync", -534745648);
        setIntField(term85368, term85368.getClass(), "totalReMasterSync", -484797447);
        setIntField(term85368, term85368.getClass(), "playerRating", 2029445652);
        setIntField(term85368, term85368.getClass(), "highestRating", 849617026);
        setIntField(term85368, term85368.getClass(), "rankAuthTailId", 300829018);
        setField(term85368, term85368.getClass(), "eventWatchedDate", "sWchglYniO");
        setField(term85368, term85368.getClass(), "webLimitDate", "lohegbXyjA");
        setIntField(term85368, term85368.getClass(), "challengeTrackPhase", -691347179);
        setIntField(term85368, term85368.getClass(), "firstPlayBits", 1092735670);
        setField(term85368, term85368.getClass(), "lastPlayDate", "HlddItIexw");
        setIntField(term85368, term85368.getClass(), "lastPlaceId", -259065495);
        setField(term85368, term85368.getClass(), "lastPlaceName", "HnpLvemmRI");
        setIntField(term85368, term85368.getClass(), "lastRegionId", -560107024);
        setField(term85368, term85368.getClass(), "lastRegionName", "dHrIcaTbcS");
        setField(term85368, term85368.getClass(), "lastClientId", "tAqyToqusS");
        setField(term85368, term85368.getClass(), "lastCountryCode", "MwiFLgdSDA");
        setIntField(term85368, term85368.getClass(), "eventPoint", 660630715);
        setIntField(term85368, term85368.getClass(), "totalLv", 693006347);
        setIntField(term85368, term85368.getClass(), "lastLoginBonusDay", 1168153277);
        setIntField(term85368, term85368.getClass(), "lastSurvivalBonusDay", -1469071189);
        setIntField(term85368, term85368.getClass(), "loginBonusLv", -578033218);
        setField(term85366, term85366.getClass(), "user", term85368);
        setIntField(term85366, term85366.getClass(), "itemKind", -590662380);
        setIntField(term85366, term85366.getClass(), "itemId", -1434317430);
        setIntField(term85366, term85366.getClass(), "stock", -1957611106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemId", argTypes, term85366, args);
    }

};


