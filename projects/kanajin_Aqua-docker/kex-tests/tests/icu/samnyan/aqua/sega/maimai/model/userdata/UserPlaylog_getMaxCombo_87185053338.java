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

public class UserPlaylog_getMaxCombo_87185053338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130327;

    public UserPlaylog_getMaxCombo_87185053338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term130333 = new Long(-2828343143039517941L);
        term130327 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term130329 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term130331 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term130347 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130348 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130352 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130362 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term130327, term130327.getClass(), "id", -431846534131845221L);
        setLongField(term130329, term130329.getClass(), "id", -1676755477328808985L);
        setLongField(term130331, term130331.getClass(), "id", 6429812737969607903L);
        setField(term130331, term130331.getClass(), "extId", term130333);
        setField(term130331, term130331.getClass(), "luid", "UtzMtwAaid");
        setIntField(term130348, term130348.getClass(), "year", 2014);
        setShortField(term130348, term130348.getClass(), "month", (short) 6);
        setShortField(term130348, term130348.getClass(), "day", (short) 5);
        setField(term130347, term130347.getClass(), "date", term130348);
        setByteField(term130352, term130352.getClass(), "hour", (byte) 0);
        setByteField(term130352, term130352.getClass(), "minute", (byte) 4);
        setByteField(term130352, term130352.getClass(), "second", (byte) 17);
        setIntField(term130352, term130352.getClass(), "nano", 755508342);
        setField(term130347, term130347.getClass(), "time", term130352);
        setField(term130331, term130331.getClass(), "registerTime", term130347);
        setIntField(term130358, term130358.getClass(), "year", 2021);
        setShortField(term130358, term130358.getClass(), "month", (short) 4);
        setShortField(term130358, term130358.getClass(), "day", (short) 25);
        setField(term130357, term130357.getClass(), "date", term130358);
        setByteField(term130362, term130362.getClass(), "hour", (byte) 8);
        setByteField(term130362, term130362.getClass(), "minute", (byte) 14);
        setByteField(term130362, term130362.getClass(), "second", (byte) 16);
        setIntField(term130362, term130362.getClass(), "nano", 794729004);
        setField(term130357, term130357.getClass(), "time", term130362);
        setField(term130331, term130331.getClass(), "accessTime", term130357);
        setField(term130329, term130329.getClass(), "card", term130331);
        setIntField(term130329, term130329.getClass(), "lastDataVersion", -220900580);
        setField(term130329, term130329.getClass(), "userName", "bchxgKxuUf");
        setIntField(term130329, term130329.getClass(), "point", -1612314595);
        setIntField(term130329, term130329.getClass(), "totalPoint", 74725785);
        setIntField(term130329, term130329.getClass(), "iconId", -576493446);
        setIntField(term130329, term130329.getClass(), "nameplateId", -1572345282);
        setIntField(term130329, term130329.getClass(), "frameId", 1765609258);
        setIntField(term130329, term130329.getClass(), "trophyId", -1945295087);
        setIntField(term130329, term130329.getClass(), "playCount", -1903576173);
        setIntField(term130329, term130329.getClass(), "playVsCount", -1319276860);
        setIntField(term130329, term130329.getClass(), "playSyncCount", 1890049926);
        setIntField(term130329, term130329.getClass(), "winCount", -100019307);
        setIntField(term130329, term130329.getClass(), "helpCount", -974141882);
        setIntField(term130329, term130329.getClass(), "comboCount", -1827802290);
        setIntField(term130329, term130329.getClass(), "feverCount", 1663558379);
        setIntField(term130329, term130329.getClass(), "totalHiScore", 1578346029);
        setIntField(term130329, term130329.getClass(), "totalEasyHighScore", -1278952384);
        setIntField(term130329, term130329.getClass(), "totalBasicHighScore", -816405586);
        setIntField(term130329, term130329.getClass(), "totalAdvancedHighScore", -1535935345);
        setIntField(term130329, term130329.getClass(), "totalExpertHighScore", -1386264680);
        setIntField(term130329, term130329.getClass(), "totalMasterHighScore", -1542924803);
        setIntField(term130329, term130329.getClass(), "totalReMasterHighScore", 823893692);
        setIntField(term130329, term130329.getClass(), "totalHighSync", 1766080609);
        setIntField(term130329, term130329.getClass(), "totalEasySync", 642859580);
        setIntField(term130329, term130329.getClass(), "totalBasicSync", 1619698611);
        setIntField(term130329, term130329.getClass(), "totalAdvancedSync", -1637017242);
        setIntField(term130329, term130329.getClass(), "totalExpertSync", -1732584815);
        setIntField(term130329, term130329.getClass(), "totalMasterSync", -273142441);
        setIntField(term130329, term130329.getClass(), "totalReMasterSync", 728509038);
        setIntField(term130329, term130329.getClass(), "playerRating", 1888689930);
        setIntField(term130329, term130329.getClass(), "highestRating", -40146090);
        setIntField(term130329, term130329.getClass(), "rankAuthTailId", -626927749);
        setField(term130329, term130329.getClass(), "eventWatchedDate", "mjXKuwKUyR");
        setField(term130329, term130329.getClass(), "webLimitDate", "UfdjcAQclb");
        setIntField(term130329, term130329.getClass(), "challengeTrackPhase", -2047201412);
        setIntField(term130329, term130329.getClass(), "firstPlayBits", -1012628729);
        setField(term130329, term130329.getClass(), "lastPlayDate", "skKLlFIRTI");
        setIntField(term130329, term130329.getClass(), "lastPlaceId", -754099477);
        setField(term130329, term130329.getClass(), "lastPlaceName", "SfjOvqPCwx");
        setIntField(term130329, term130329.getClass(), "lastRegionId", -1808522184);
        setField(term130329, term130329.getClass(), "lastRegionName", "rinBVtrpcr");
        setField(term130329, term130329.getClass(), "lastClientId", "KjCvQWfqew");
        setField(term130329, term130329.getClass(), "lastCountryCode", "WewLrXvLmC");
        setIntField(term130329, term130329.getClass(), "eventPoint", -1155377654);
        setIntField(term130329, term130329.getClass(), "totalLv", 346216337);
        setIntField(term130329, term130329.getClass(), "lastLoginBonusDay", -1716131367);
        setIntField(term130329, term130329.getClass(), "lastSurvivalBonusDay", 910790938);
        setIntField(term130329, term130329.getClass(), "loginBonusLv", 981136142);
        setField(term130327, term130327.getClass(), "user", term130329);
        setIntField(term130327, term130327.getClass(), "orderId", 442400196);
        setLongField(term130327, term130327.getClass(), "sortNumber", -3581079819917173688L);
        setIntField(term130327, term130327.getClass(), "placeId", -2118844036);
        setField(term130327, term130327.getClass(), "placeName", "vbEYtFntxd");
        setField(term130327, term130327.getClass(), "country", "ZiYiKyRQTQ");
        setIntField(term130327, term130327.getClass(), "regionId", 1025283541);
        setField(term130327, term130327.getClass(), "playDate", "aaACqoZRFl");
        setField(term130327, term130327.getClass(), "userPlayDate", "CtIecpnHzx");
        setIntField(term130327, term130327.getClass(), "musicId", -224806040);
        setIntField(term130327, term130327.getClass(), "level", -570219781);
        setIntField(term130327, term130327.getClass(), "gameMode", 2021656767);
        setIntField(term130327, term130327.getClass(), "rivalNum", 625759166);
        setIntField(term130327, term130327.getClass(), "track", 631550019);
        setIntField(term130327, term130327.getClass(), "eventId", 358498146);
        setBooleanField(term130327, term130327.getClass(), "isFreeToPlay", true);
        setIntField(term130327, term130327.getClass(), "playerRating", -150027991);
        setLongField(term130327, term130327.getClass(), "playedUserId1", 1841313452085873331L);
        setField(term130327, term130327.getClass(), "playedUserName1", "lgGoogCJeG");
        setIntField(term130327, term130327.getClass(), "playedMusicLevel1", -1153939331);
        setLongField(term130327, term130327.getClass(), "playedUserId2", -4019650338948804968L);
        setField(term130327, term130327.getClass(), "playedUserName2", "EyskfGpFOR");
        setIntField(term130327, term130327.getClass(), "playedMusicLevel2", 1809509825);
        setLongField(term130327, term130327.getClass(), "playedUserId3", 4836157943217062601L);
        setField(term130327, term130327.getClass(), "playedUserName3", "eEKpyfnNFi");
        setIntField(term130327, term130327.getClass(), "playedMusicLevel3", -671716918);
        setIntField(term130327, term130327.getClass(), "achievement", 831156253);
        setIntField(term130327, term130327.getClass(), "score", -900204543);
        setIntField(term130327, term130327.getClass(), "tapScore", 1669939159);
        setIntField(term130327, term130327.getClass(), "holdScore", 1109628092);
        setIntField(term130327, term130327.getClass(), "slideScore", -168830883);
        setIntField(term130327, term130327.getClass(), "breakScore", -334577229);
        setIntField(term130327, term130327.getClass(), "syncRate", -1229414028);
        setIntField(term130327, term130327.getClass(), "vsWin", 331712720);
        setBooleanField(term130327, term130327.getClass(), "isAllPerfect", false);
        setIntField(term130327, term130327.getClass(), "fullCombo", -820459569);
        setIntField(term130327, term130327.getClass(), "maxFever", -1328851730);
        setIntField(term130327, term130327.getClass(), "maxCombo", -752678424);
        setIntField(term130327, term130327.getClass(), "tapPerfect", 70725694);
        setIntField(term130327, term130327.getClass(), "tapGreat", 1571437956);
        setIntField(term130327, term130327.getClass(), "tapGood", -146442067);
        setIntField(term130327, term130327.getClass(), "tapBad", -1025692540);
        setIntField(term130327, term130327.getClass(), "holdPerfect", 1743947701);
        setIntField(term130327, term130327.getClass(), "holdGreat", 78670837);
        setIntField(term130327, term130327.getClass(), "holdGood", -1549526395);
        setIntField(term130327, term130327.getClass(), "holdBad", -1175843203);
        setIntField(term130327, term130327.getClass(), "slidePerfect", -146651029);
        setIntField(term130327, term130327.getClass(), "slideGreat", 1149377423);
        setIntField(term130327, term130327.getClass(), "slideGood", -427763498);
        setIntField(term130327, term130327.getClass(), "slideBad", 14128917);
        setIntField(term130327, term130327.getClass(), "breakPerfect", 1973133173);
        setIntField(term130327, term130327.getClass(), "breakGreat", 1880699249);
        setIntField(term130327, term130327.getClass(), "breakGood", 828210237);
        setIntField(term130327, term130327.getClass(), "breakBad", 617709052);
        setBooleanField(term130327, term130327.getClass(), "isTrackSkip", true);
        setBooleanField(term130327, term130327.getClass(), "isHighScore", true);
        setBooleanField(term130327, term130327.getClass(), "isChallengeTrack", true);
        setIntField(term130327, term130327.getClass(), "challengeLife", -1475639720);
        setIntField(term130327, term130327.getClass(), "challengeRemain", -676962701);
        setIntField(term130327, term130327.getClass(), "isAllPerfectPlus", -697101236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCombo", argTypes, term130327, args);
    }

};


