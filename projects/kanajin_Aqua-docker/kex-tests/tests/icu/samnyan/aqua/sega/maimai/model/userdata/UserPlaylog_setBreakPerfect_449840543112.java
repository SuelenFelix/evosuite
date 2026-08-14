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
import java.lang.Integer;

public class UserPlaylog_setBreakPerfect_449840543112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3992125;
     Object term3992437;

    public UserPlaylog_setBreakPerfect_449840543112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3992131 = new Long(-3273202638826133226L);
        term3992125 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3992127 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3992129 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3992145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3992146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3992150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3992155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3992156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3992160 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3992125, term3992125.getClass(), "id", -6446603266436477049L);
        setLongField(term3992127, term3992127.getClass(), "id", -1990781233444090849L);
        setLongField(term3992129, term3992129.getClass(), "id", 5235138358404721237L);
        setField(term3992129, term3992129.getClass(), "extId", term3992131);
        setField(term3992129, term3992129.getClass(), "luid", "RWiPwnkXgc");
        setIntField(term3992146, term3992146.getClass(), "year", 2027);
        setShortField(term3992146, term3992146.getClass(), "month", (short) 8);
        setShortField(term3992146, term3992146.getClass(), "day", (short) 18);
        setField(term3992145, term3992145.getClass(), "date", term3992146);
        setByteField(term3992150, term3992150.getClass(), "hour", (byte) 3);
        setByteField(term3992150, term3992150.getClass(), "minute", (byte) 34);
        setByteField(term3992150, term3992150.getClass(), "second", (byte) 56);
        setIntField(term3992150, term3992150.getClass(), "nano", 550122156);
        setField(term3992145, term3992145.getClass(), "time", term3992150);
        setField(term3992129, term3992129.getClass(), "registerTime", term3992145);
        setIntField(term3992156, term3992156.getClass(), "year", 2010);
        setShortField(term3992156, term3992156.getClass(), "month", (short) 4);
        setShortField(term3992156, term3992156.getClass(), "day", (short) 1);
        setField(term3992155, term3992155.getClass(), "date", term3992156);
        setByteField(term3992160, term3992160.getClass(), "hour", (byte) 6);
        setByteField(term3992160, term3992160.getClass(), "minute", (byte) 10);
        setByteField(term3992160, term3992160.getClass(), "second", (byte) 44);
        setIntField(term3992160, term3992160.getClass(), "nano", 529926297);
        setField(term3992155, term3992155.getClass(), "time", term3992160);
        setField(term3992129, term3992129.getClass(), "accessTime", term3992155);
        setField(term3992127, term3992127.getClass(), "card", term3992129);
        setIntField(term3992127, term3992127.getClass(), "lastDataVersion", 1904665792);
        setField(term3992127, term3992127.getClass(), "userName", "ATBjcdMbAN");
        setIntField(term3992127, term3992127.getClass(), "point", 1275400155);
        setIntField(term3992127, term3992127.getClass(), "totalPoint", -961297585);
        setIntField(term3992127, term3992127.getClass(), "iconId", -137170060);
        setIntField(term3992127, term3992127.getClass(), "nameplateId", -1051933495);
        setIntField(term3992127, term3992127.getClass(), "frameId", -1262655875);
        setIntField(term3992127, term3992127.getClass(), "trophyId", -602163831);
        setIntField(term3992127, term3992127.getClass(), "playCount", 1369567377);
        setIntField(term3992127, term3992127.getClass(), "playVsCount", 25797821);
        setIntField(term3992127, term3992127.getClass(), "playSyncCount", 865866836);
        setIntField(term3992127, term3992127.getClass(), "winCount", 1884671525);
        setIntField(term3992127, term3992127.getClass(), "helpCount", 1259559254);
        setIntField(term3992127, term3992127.getClass(), "comboCount", -1664560778);
        setIntField(term3992127, term3992127.getClass(), "feverCount", -654584178);
        setIntField(term3992127, term3992127.getClass(), "totalHiScore", 1087145920);
        setIntField(term3992127, term3992127.getClass(), "totalEasyHighScore", -1523311564);
        setIntField(term3992127, term3992127.getClass(), "totalBasicHighScore", 366228546);
        setIntField(term3992127, term3992127.getClass(), "totalAdvancedHighScore", 1913151432);
        setIntField(term3992127, term3992127.getClass(), "totalExpertHighScore", -1951588978);
        setIntField(term3992127, term3992127.getClass(), "totalMasterHighScore", -504099966);
        setIntField(term3992127, term3992127.getClass(), "totalReMasterHighScore", -325804810);
        setIntField(term3992127, term3992127.getClass(), "totalHighSync", 557570699);
        setIntField(term3992127, term3992127.getClass(), "totalEasySync", -1974815346);
        setIntField(term3992127, term3992127.getClass(), "totalBasicSync", 2017037730);
        setIntField(term3992127, term3992127.getClass(), "totalAdvancedSync", 333715785);
        setIntField(term3992127, term3992127.getClass(), "totalExpertSync", -590114790);
        setIntField(term3992127, term3992127.getClass(), "totalMasterSync", -884114945);
        setIntField(term3992127, term3992127.getClass(), "totalReMasterSync", -1715623071);
        setIntField(term3992127, term3992127.getClass(), "playerRating", -513938082);
        setIntField(term3992127, term3992127.getClass(), "highestRating", -467552406);
        setIntField(term3992127, term3992127.getClass(), "rankAuthTailId", -164276718);
        setField(term3992127, term3992127.getClass(), "eventWatchedDate", "nplOkqRXrZ");
        setField(term3992127, term3992127.getClass(), "webLimitDate", "BzhxJrWwqx");
        setIntField(term3992127, term3992127.getClass(), "challengeTrackPhase", -181395293);
        setIntField(term3992127, term3992127.getClass(), "firstPlayBits", -1394802270);
        setField(term3992127, term3992127.getClass(), "lastPlayDate", "RgKOgLEmre");
        setIntField(term3992127, term3992127.getClass(), "lastPlaceId", 1451143281);
        setField(term3992127, term3992127.getClass(), "lastPlaceName", "KgXmJywOQS");
        setIntField(term3992127, term3992127.getClass(), "lastRegionId", 1711229408);
        setField(term3992127, term3992127.getClass(), "lastRegionName", "axqKpBmeoS");
        setField(term3992127, term3992127.getClass(), "lastClientId", "MMqBDOUFVw");
        setField(term3992127, term3992127.getClass(), "lastCountryCode", "WfzJJOnsFF");
        setIntField(term3992127, term3992127.getClass(), "eventPoint", 351884095);
        setIntField(term3992127, term3992127.getClass(), "totalLv", -1089283624);
        setIntField(term3992127, term3992127.getClass(), "lastLoginBonusDay", -1979961437);
        setIntField(term3992127, term3992127.getClass(), "lastSurvivalBonusDay", -1573418595);
        setIntField(term3992127, term3992127.getClass(), "loginBonusLv", 267015207);
        setField(term3992125, term3992125.getClass(), "user", term3992127);
        setIntField(term3992125, term3992125.getClass(), "orderId", -223450767);
        setLongField(term3992125, term3992125.getClass(), "sortNumber", -4872880368044067266L);
        setIntField(term3992125, term3992125.getClass(), "placeId", 555818425);
        setField(term3992125, term3992125.getClass(), "placeName", "ksdGBxsxdy");
        setField(term3992125, term3992125.getClass(), "country", "fuPWVQObuN");
        setIntField(term3992125, term3992125.getClass(), "regionId", -1414407154);
        setField(term3992125, term3992125.getClass(), "playDate", "YUtTdcJBPQ");
        setField(term3992125, term3992125.getClass(), "userPlayDate", "TsUlySdqIF");
        setIntField(term3992125, term3992125.getClass(), "musicId", -2088153396);
        setIntField(term3992125, term3992125.getClass(), "level", 1529567520);
        setIntField(term3992125, term3992125.getClass(), "gameMode", -971165773);
        setIntField(term3992125, term3992125.getClass(), "rivalNum", -1480266696);
        setIntField(term3992125, term3992125.getClass(), "track", 833292992);
        setIntField(term3992125, term3992125.getClass(), "eventId", 81236398);
        setBooleanField(term3992125, term3992125.getClass(), "isFreeToPlay", true);
        setIntField(term3992125, term3992125.getClass(), "playerRating", -1152419040);
        setLongField(term3992125, term3992125.getClass(), "playedUserId1", 1745542609236746672L);
        setField(term3992125, term3992125.getClass(), "playedUserName1", "WNFuOJfktV");
        setIntField(term3992125, term3992125.getClass(), "playedMusicLevel1", -109280679);
        setLongField(term3992125, term3992125.getClass(), "playedUserId2", -6655838593545541779L);
        setField(term3992125, term3992125.getClass(), "playedUserName2", "ZTlkIxCJbz");
        setIntField(term3992125, term3992125.getClass(), "playedMusicLevel2", -219126884);
        setLongField(term3992125, term3992125.getClass(), "playedUserId3", 6199329480145398857L);
        setField(term3992125, term3992125.getClass(), "playedUserName3", "OvKvaQTTjP");
        setIntField(term3992125, term3992125.getClass(), "playedMusicLevel3", 740696074);
        setIntField(term3992125, term3992125.getClass(), "achievement", 2095811229);
        setIntField(term3992125, term3992125.getClass(), "score", -956180453);
        setIntField(term3992125, term3992125.getClass(), "tapScore", -137831645);
        setIntField(term3992125, term3992125.getClass(), "holdScore", 742639267);
        setIntField(term3992125, term3992125.getClass(), "slideScore", -1573079398);
        setIntField(term3992125, term3992125.getClass(), "breakScore", 834173959);
        setIntField(term3992125, term3992125.getClass(), "syncRate", -402019929);
        setIntField(term3992125, term3992125.getClass(), "vsWin", 2136133626);
        setBooleanField(term3992125, term3992125.getClass(), "isAllPerfect", false);
        setIntField(term3992125, term3992125.getClass(), "fullCombo", 784320099);
        setIntField(term3992125, term3992125.getClass(), "maxFever", -863930313);
        setIntField(term3992125, term3992125.getClass(), "maxCombo", 1480257707);
        setIntField(term3992125, term3992125.getClass(), "tapPerfect", -218565006);
        setIntField(term3992125, term3992125.getClass(), "tapGreat", 4660574);
        setIntField(term3992125, term3992125.getClass(), "tapGood", -1266831281);
        setIntField(term3992125, term3992125.getClass(), "tapBad", 699593673);
        setIntField(term3992125, term3992125.getClass(), "holdPerfect", 860058986);
        setIntField(term3992125, term3992125.getClass(), "holdGreat", -270665583);
        setIntField(term3992125, term3992125.getClass(), "holdGood", -389829971);
        setIntField(term3992125, term3992125.getClass(), "holdBad", -911115306);
        setIntField(term3992125, term3992125.getClass(), "slidePerfect", -510486643);
        setIntField(term3992125, term3992125.getClass(), "slideGreat", 1130594407);
        setIntField(term3992125, term3992125.getClass(), "slideGood", 1410087135);
        setIntField(term3992125, term3992125.getClass(), "slideBad", 1378601027);
        setIntField(term3992125, term3992125.getClass(), "breakPerfect", 109008488);
        setIntField(term3992125, term3992125.getClass(), "breakGreat", -299978061);
        setIntField(term3992125, term3992125.getClass(), "breakGood", 1671213909);
        setIntField(term3992125, term3992125.getClass(), "breakBad", 1595650758);
        setBooleanField(term3992125, term3992125.getClass(), "isTrackSkip", false);
        setBooleanField(term3992125, term3992125.getClass(), "isHighScore", true);
        setBooleanField(term3992125, term3992125.getClass(), "isChallengeTrack", true);
        setIntField(term3992125, term3992125.getClass(), "challengeLife", 297983804);
        setIntField(term3992125, term3992125.getClass(), "challengeRemain", -753374987);
        setIntField(term3992125, term3992125.getClass(), "isAllPerfectPlus", -403915689);
        term3992437 = new Integer(-215291592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3992437;
        callMethod(klass, "setBreakPerfect", argTypes, term3992125, args);
    }

};


