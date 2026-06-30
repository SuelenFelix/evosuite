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

public class UserPresentEvent_getPresentCount_15283182425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97983;

    public UserPresentEvent_getPresentCount_15283182425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term97989 = new Long(-1497280900081695731L);
        term97983 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term97985 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term97987 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term98003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98008 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98018 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term97983, term97983.getClass(), "id", -2740731095268174775L);
        setLongField(term97985, term97985.getClass(), "id", 1434994695522862422L);
        setLongField(term97987, term97987.getClass(), "id", 7917622690009120321L);
        setField(term97987, term97987.getClass(), "extId", term97989);
        setField(term97987, term97987.getClass(), "luid", "ORExcUfatr");
        setIntField(term98004, term98004.getClass(), "year", 2022);
        setShortField(term98004, term98004.getClass(), "month", (short) 10);
        setShortField(term98004, term98004.getClass(), "day", (short) 27);
        setField(term98003, term98003.getClass(), "date", term98004);
        setByteField(term98008, term98008.getClass(), "hour", (byte) 11);
        setByteField(term98008, term98008.getClass(), "minute", (byte) 11);
        setByteField(term98008, term98008.getClass(), "second", (byte) 36);
        setIntField(term98008, term98008.getClass(), "nano", 239549048);
        setField(term98003, term98003.getClass(), "time", term98008);
        setField(term97987, term97987.getClass(), "registerTime", term98003);
        setIntField(term98014, term98014.getClass(), "year", 2015);
        setShortField(term98014, term98014.getClass(), "month", (short) 1);
        setShortField(term98014, term98014.getClass(), "day", (short) 22);
        setField(term98013, term98013.getClass(), "date", term98014);
        setByteField(term98018, term98018.getClass(), "hour", (byte) 4);
        setByteField(term98018, term98018.getClass(), "minute", (byte) 37);
        setByteField(term98018, term98018.getClass(), "second", (byte) 36);
        setIntField(term98018, term98018.getClass(), "nano", 685453197);
        setField(term98013, term98013.getClass(), "time", term98018);
        setField(term97987, term97987.getClass(), "accessTime", term98013);
        setField(term97985, term97985.getClass(), "card", term97987);
        setIntField(term97985, term97985.getClass(), "lastDataVersion", -1152845025);
        setField(term97985, term97985.getClass(), "userName", "cUonKmQWCB");
        setIntField(term97985, term97985.getClass(), "point", -1141797598);
        setIntField(term97985, term97985.getClass(), "totalPoint", 2077501415);
        setIntField(term97985, term97985.getClass(), "iconId", -1674245464);
        setIntField(term97985, term97985.getClass(), "nameplateId", 1501358200);
        setIntField(term97985, term97985.getClass(), "frameId", 606013511);
        setIntField(term97985, term97985.getClass(), "trophyId", -1852663448);
        setIntField(term97985, term97985.getClass(), "playCount", -312526763);
        setIntField(term97985, term97985.getClass(), "playVsCount", 2020033827);
        setIntField(term97985, term97985.getClass(), "playSyncCount", 1422686838);
        setIntField(term97985, term97985.getClass(), "winCount", 217849440);
        setIntField(term97985, term97985.getClass(), "helpCount", -1464210075);
        setIntField(term97985, term97985.getClass(), "comboCount", 624179347);
        setIntField(term97985, term97985.getClass(), "feverCount", 1724442328);
        setIntField(term97985, term97985.getClass(), "totalHiScore", 761455228);
        setIntField(term97985, term97985.getClass(), "totalEasyHighScore", 894605550);
        setIntField(term97985, term97985.getClass(), "totalBasicHighScore", -710673930);
        setIntField(term97985, term97985.getClass(), "totalAdvancedHighScore", 573521617);
        setIntField(term97985, term97985.getClass(), "totalExpertHighScore", 1856558520);
        setIntField(term97985, term97985.getClass(), "totalMasterHighScore", 578922091);
        setIntField(term97985, term97985.getClass(), "totalReMasterHighScore", 1645299882);
        setIntField(term97985, term97985.getClass(), "totalHighSync", -430972061);
        setIntField(term97985, term97985.getClass(), "totalEasySync", 303799281);
        setIntField(term97985, term97985.getClass(), "totalBasicSync", 993949631);
        setIntField(term97985, term97985.getClass(), "totalAdvancedSync", -1501399057);
        setIntField(term97985, term97985.getClass(), "totalExpertSync", 1885755605);
        setIntField(term97985, term97985.getClass(), "totalMasterSync", -865640007);
        setIntField(term97985, term97985.getClass(), "totalReMasterSync", -852853895);
        setIntField(term97985, term97985.getClass(), "playerRating", 923992540);
        setIntField(term97985, term97985.getClass(), "highestRating", -1752952689);
        setIntField(term97985, term97985.getClass(), "rankAuthTailId", -1876841878);
        setField(term97985, term97985.getClass(), "eventWatchedDate", "CvbqWuRute");
        setField(term97985, term97985.getClass(), "webLimitDate", "yuvBFZQJBJ");
        setIntField(term97985, term97985.getClass(), "challengeTrackPhase", -314514599);
        setIntField(term97985, term97985.getClass(), "firstPlayBits", 913233303);
        setField(term97985, term97985.getClass(), "lastPlayDate", "prymoiXBsv");
        setIntField(term97985, term97985.getClass(), "lastPlaceId", -1757188792);
        setField(term97985, term97985.getClass(), "lastPlaceName", "XVkgypnsVx");
        setIntField(term97985, term97985.getClass(), "lastRegionId", 988441469);
        setField(term97985, term97985.getClass(), "lastRegionName", "TwXzbEYFtG");
        setField(term97985, term97985.getClass(), "lastClientId", "mRdoimcRwz");
        setField(term97985, term97985.getClass(), "lastCountryCode", "dxJDKuPPPM");
        setIntField(term97985, term97985.getClass(), "eventPoint", -152256749);
        setIntField(term97985, term97985.getClass(), "totalLv", -218639168);
        setIntField(term97985, term97985.getClass(), "lastLoginBonusDay", -429628062);
        setIntField(term97985, term97985.getClass(), "lastSurvivalBonusDay", 473106716);
        setIntField(term97985, term97985.getClass(), "loginBonusLv", -434143406);
        setField(term97983, term97983.getClass(), "user", term97985);
        setIntField(term97983, term97983.getClass(), "presentEventId", -1144966099);
        setIntField(term97983, term97983.getClass(), "point", -56203372);
        setIntField(term97983, term97983.getClass(), "presentCount", -174061580);
        setIntField(term97983, term97983.getClass(), "rate", 236856575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPresentCount", argTypes, term97983, args);
    }

};


