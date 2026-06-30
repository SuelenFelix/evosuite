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

public class UserPlaylog_getMusicId_197705350910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117111;

    public UserPlaylog_getMusicId_197705350910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term117117 = new Long(-1465819833800717311L);
        term117111 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term117113 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term117115 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term117131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117136 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117146 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term117111, term117111.getClass(), "id", 3936368864173279345L);
        setLongField(term117113, term117113.getClass(), "id", 6993652740699384445L);
        setLongField(term117115, term117115.getClass(), "id", -1750953812188769604L);
        setField(term117115, term117115.getClass(), "extId", term117117);
        setField(term117115, term117115.getClass(), "luid", "EeSPJPLqrn");
        setIntField(term117132, term117132.getClass(), "year", 2010);
        setShortField(term117132, term117132.getClass(), "month", (short) 11);
        setShortField(term117132, term117132.getClass(), "day", (short) 7);
        setField(term117131, term117131.getClass(), "date", term117132);
        setByteField(term117136, term117136.getClass(), "hour", (byte) 17);
        setByteField(term117136, term117136.getClass(), "minute", (byte) 2);
        setByteField(term117136, term117136.getClass(), "second", (byte) 45);
        setIntField(term117136, term117136.getClass(), "nano", 891551261);
        setField(term117131, term117131.getClass(), "time", term117136);
        setField(term117115, term117115.getClass(), "registerTime", term117131);
        setIntField(term117142, term117142.getClass(), "year", 2018);
        setShortField(term117142, term117142.getClass(), "month", (short) 4);
        setShortField(term117142, term117142.getClass(), "day", (short) 19);
        setField(term117141, term117141.getClass(), "date", term117142);
        setByteField(term117146, term117146.getClass(), "hour", (byte) 14);
        setByteField(term117146, term117146.getClass(), "minute", (byte) 21);
        setByteField(term117146, term117146.getClass(), "second", (byte) 19);
        setIntField(term117146, term117146.getClass(), "nano", 997536814);
        setField(term117141, term117141.getClass(), "time", term117146);
        setField(term117115, term117115.getClass(), "accessTime", term117141);
        setField(term117113, term117113.getClass(), "card", term117115);
        setIntField(term117113, term117113.getClass(), "lastDataVersion", -1282766194);
        setField(term117113, term117113.getClass(), "userName", "ixVPsPApNw");
        setIntField(term117113, term117113.getClass(), "point", -1288900838);
        setIntField(term117113, term117113.getClass(), "totalPoint", -1470172938);
        setIntField(term117113, term117113.getClass(), "iconId", -1939603541);
        setIntField(term117113, term117113.getClass(), "nameplateId", -274428693);
        setIntField(term117113, term117113.getClass(), "frameId", -185933400);
        setIntField(term117113, term117113.getClass(), "trophyId", 1459704689);
        setIntField(term117113, term117113.getClass(), "playCount", -1941241597);
        setIntField(term117113, term117113.getClass(), "playVsCount", 212571436);
        setIntField(term117113, term117113.getClass(), "playSyncCount", 1303246137);
        setIntField(term117113, term117113.getClass(), "winCount", -1675951461);
        setIntField(term117113, term117113.getClass(), "helpCount", 1619278331);
        setIntField(term117113, term117113.getClass(), "comboCount", -2007394216);
        setIntField(term117113, term117113.getClass(), "feverCount", -491166885);
        setIntField(term117113, term117113.getClass(), "totalHiScore", -186959175);
        setIntField(term117113, term117113.getClass(), "totalEasyHighScore", 1008949037);
        setIntField(term117113, term117113.getClass(), "totalBasicHighScore", 172789057);
        setIntField(term117113, term117113.getClass(), "totalAdvancedHighScore", 1874497920);
        setIntField(term117113, term117113.getClass(), "totalExpertHighScore", -218105407);
        setIntField(term117113, term117113.getClass(), "totalMasterHighScore", 471265365);
        setIntField(term117113, term117113.getClass(), "totalReMasterHighScore", 385397789);
        setIntField(term117113, term117113.getClass(), "totalHighSync", 2024833795);
        setIntField(term117113, term117113.getClass(), "totalEasySync", 8463116);
        setIntField(term117113, term117113.getClass(), "totalBasicSync", -620071954);
        setIntField(term117113, term117113.getClass(), "totalAdvancedSync", -205569196);
        setIntField(term117113, term117113.getClass(), "totalExpertSync", -230037651);
        setIntField(term117113, term117113.getClass(), "totalMasterSync", -1357010359);
        setIntField(term117113, term117113.getClass(), "totalReMasterSync", 369666332);
        setIntField(term117113, term117113.getClass(), "playerRating", 1996656026);
        setIntField(term117113, term117113.getClass(), "highestRating", 1730103539);
        setIntField(term117113, term117113.getClass(), "rankAuthTailId", 832305588);
        setField(term117113, term117113.getClass(), "eventWatchedDate", "xBABghJWNo");
        setField(term117113, term117113.getClass(), "webLimitDate", "NpTcCfwURe");
        setIntField(term117113, term117113.getClass(), "challengeTrackPhase", -123081780);
        setIntField(term117113, term117113.getClass(), "firstPlayBits", 722335040);
        setField(term117113, term117113.getClass(), "lastPlayDate", "TxkpqJJFUT");
        setIntField(term117113, term117113.getClass(), "lastPlaceId", 1652760387);
        setField(term117113, term117113.getClass(), "lastPlaceName", "FYulmknfej");
        setIntField(term117113, term117113.getClass(), "lastRegionId", 200148872);
        setField(term117113, term117113.getClass(), "lastRegionName", "eKQelJcJEF");
        setField(term117113, term117113.getClass(), "lastClientId", "rMzkpEMgIm");
        setField(term117113, term117113.getClass(), "lastCountryCode", "pNGFuoPYQr");
        setIntField(term117113, term117113.getClass(), "eventPoint", 111642393);
        setIntField(term117113, term117113.getClass(), "totalLv", -1858518841);
        setIntField(term117113, term117113.getClass(), "lastLoginBonusDay", 351914623);
        setIntField(term117113, term117113.getClass(), "lastSurvivalBonusDay", -981676366);
        setIntField(term117113, term117113.getClass(), "loginBonusLv", 845140465);
        setField(term117111, term117111.getClass(), "user", term117113);
        setIntField(term117111, term117111.getClass(), "orderId", 152315062);
        setLongField(term117111, term117111.getClass(), "sortNumber", -2708952612032666340L);
        setIntField(term117111, term117111.getClass(), "placeId", -955794807);
        setField(term117111, term117111.getClass(), "placeName", "kCjOAdClxu");
        setField(term117111, term117111.getClass(), "country", "UqDmRiivsD");
        setIntField(term117111, term117111.getClass(), "regionId", 753278662);
        setField(term117111, term117111.getClass(), "playDate", "lbuoMbJEmY");
        setField(term117111, term117111.getClass(), "userPlayDate", "mlYqXpLxYN");
        setIntField(term117111, term117111.getClass(), "musicId", -1972571656);
        setIntField(term117111, term117111.getClass(), "level", -1897916755);
        setIntField(term117111, term117111.getClass(), "gameMode", 1428440705);
        setIntField(term117111, term117111.getClass(), "rivalNum", 1907554102);
        setIntField(term117111, term117111.getClass(), "track", 774531243);
        setIntField(term117111, term117111.getClass(), "eventId", 711703993);
        setBooleanField(term117111, term117111.getClass(), "isFreeToPlay", true);
        setIntField(term117111, term117111.getClass(), "playerRating", -276563829);
        setLongField(term117111, term117111.getClass(), "playedUserId1", -1148993446345293581L);
        setField(term117111, term117111.getClass(), "playedUserName1", "NUmCDjLJOd");
        setIntField(term117111, term117111.getClass(), "playedMusicLevel1", 1580982720);
        setLongField(term117111, term117111.getClass(), "playedUserId2", 6614269735692083780L);
        setField(term117111, term117111.getClass(), "playedUserName2", "miAgzoWkiV");
        setIntField(term117111, term117111.getClass(), "playedMusicLevel2", 404999880);
        setLongField(term117111, term117111.getClass(), "playedUserId3", 7437006125284633666L);
        setField(term117111, term117111.getClass(), "playedUserName3", "teJJZHDWWb");
        setIntField(term117111, term117111.getClass(), "playedMusicLevel3", 348427240);
        setIntField(term117111, term117111.getClass(), "achievement", 173363669);
        setIntField(term117111, term117111.getClass(), "score", 1700003880);
        setIntField(term117111, term117111.getClass(), "tapScore", 1479107053);
        setIntField(term117111, term117111.getClass(), "holdScore", -1251439328);
        setIntField(term117111, term117111.getClass(), "slideScore", 1798785752);
        setIntField(term117111, term117111.getClass(), "breakScore", 195739943);
        setIntField(term117111, term117111.getClass(), "syncRate", 594364543);
        setIntField(term117111, term117111.getClass(), "vsWin", 401266476);
        setBooleanField(term117111, term117111.getClass(), "isAllPerfect", true);
        setIntField(term117111, term117111.getClass(), "fullCombo", -1352592419);
        setIntField(term117111, term117111.getClass(), "maxFever", -1352699741);
        setIntField(term117111, term117111.getClass(), "maxCombo", 1775677389);
        setIntField(term117111, term117111.getClass(), "tapPerfect", 781977367);
        setIntField(term117111, term117111.getClass(), "tapGreat", 1734793666);
        setIntField(term117111, term117111.getClass(), "tapGood", -2143217889);
        setIntField(term117111, term117111.getClass(), "tapBad", -2098845580);
        setIntField(term117111, term117111.getClass(), "holdPerfect", 2130134973);
        setIntField(term117111, term117111.getClass(), "holdGreat", -503344387);
        setIntField(term117111, term117111.getClass(), "holdGood", 65559668);
        setIntField(term117111, term117111.getClass(), "holdBad", -1000807164);
        setIntField(term117111, term117111.getClass(), "slidePerfect", -426025570);
        setIntField(term117111, term117111.getClass(), "slideGreat", 585898209);
        setIntField(term117111, term117111.getClass(), "slideGood", 427844033);
        setIntField(term117111, term117111.getClass(), "slideBad", 393133795);
        setIntField(term117111, term117111.getClass(), "breakPerfect", 1286575093);
        setIntField(term117111, term117111.getClass(), "breakGreat", -27258592);
        setIntField(term117111, term117111.getClass(), "breakGood", -1527855457);
        setIntField(term117111, term117111.getClass(), "breakBad", -1315887759);
        setBooleanField(term117111, term117111.getClass(), "isTrackSkip", false);
        setBooleanField(term117111, term117111.getClass(), "isHighScore", false);
        setBooleanField(term117111, term117111.getClass(), "isChallengeTrack", true);
        setIntField(term117111, term117111.getClass(), "challengeLife", -385751288);
        setIntField(term117111, term117111.getClass(), "challengeRemain", 1481730960);
        setIntField(term117111, term117111.getClass(), "isAllPerfectPlus", -681947751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term117111, args);
    }

};


