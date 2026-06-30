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

public class UserPlaylog_getPlayDate_3523095608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116167;

    public UserPlaylog_getPlayDate_3523095608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term116173 = new Long(2274723545906746965L);
        term116167 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term116169 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term116171 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term116187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116192 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116202 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term116167, term116167.getClass(), "id", 3415544654174435087L);
        setLongField(term116169, term116169.getClass(), "id", -6444648462294378605L);
        setLongField(term116171, term116171.getClass(), "id", 2399163633137062666L);
        setField(term116171, term116171.getClass(), "extId", term116173);
        setField(term116171, term116171.getClass(), "luid", "EkKMYiEKHU");
        setIntField(term116188, term116188.getClass(), "year", 2028);
        setShortField(term116188, term116188.getClass(), "month", (short) 7);
        setShortField(term116188, term116188.getClass(), "day", (short) 24);
        setField(term116187, term116187.getClass(), "date", term116188);
        setByteField(term116192, term116192.getClass(), "hour", (byte) 11);
        setByteField(term116192, term116192.getClass(), "minute", (byte) 2);
        setByteField(term116192, term116192.getClass(), "second", (byte) 47);
        setIntField(term116192, term116192.getClass(), "nano", 875421060);
        setField(term116187, term116187.getClass(), "time", term116192);
        setField(term116171, term116171.getClass(), "registerTime", term116187);
        setIntField(term116198, term116198.getClass(), "year", 2029);
        setShortField(term116198, term116198.getClass(), "month", (short) 12);
        setShortField(term116198, term116198.getClass(), "day", (short) 20);
        setField(term116197, term116197.getClass(), "date", term116198);
        setByteField(term116202, term116202.getClass(), "hour", (byte) 3);
        setByteField(term116202, term116202.getClass(), "minute", (byte) 1);
        setByteField(term116202, term116202.getClass(), "second", (byte) 52);
        setIntField(term116202, term116202.getClass(), "nano", 833458434);
        setField(term116197, term116197.getClass(), "time", term116202);
        setField(term116171, term116171.getClass(), "accessTime", term116197);
        setField(term116169, term116169.getClass(), "card", term116171);
        setIntField(term116169, term116169.getClass(), "lastDataVersion", 1725216560);
        setField(term116169, term116169.getClass(), "userName", "gvLQDVFTIF");
        setIntField(term116169, term116169.getClass(), "point", -1665341777);
        setIntField(term116169, term116169.getClass(), "totalPoint", 1478390763);
        setIntField(term116169, term116169.getClass(), "iconId", -682426147);
        setIntField(term116169, term116169.getClass(), "nameplateId", 1982919387);
        setIntField(term116169, term116169.getClass(), "frameId", 1050211385);
        setIntField(term116169, term116169.getClass(), "trophyId", -1724136965);
        setIntField(term116169, term116169.getClass(), "playCount", 838077311);
        setIntField(term116169, term116169.getClass(), "playVsCount", 247997035);
        setIntField(term116169, term116169.getClass(), "playSyncCount", 484164039);
        setIntField(term116169, term116169.getClass(), "winCount", 1132248674);
        setIntField(term116169, term116169.getClass(), "helpCount", 145644776);
        setIntField(term116169, term116169.getClass(), "comboCount", -831867823);
        setIntField(term116169, term116169.getClass(), "feverCount", -1687655045);
        setIntField(term116169, term116169.getClass(), "totalHiScore", 316843723);
        setIntField(term116169, term116169.getClass(), "totalEasyHighScore", -1497095861);
        setIntField(term116169, term116169.getClass(), "totalBasicHighScore", -1692196889);
        setIntField(term116169, term116169.getClass(), "totalAdvancedHighScore", 25600877);
        setIntField(term116169, term116169.getClass(), "totalExpertHighScore", -1756534726);
        setIntField(term116169, term116169.getClass(), "totalMasterHighScore", -359047843);
        setIntField(term116169, term116169.getClass(), "totalReMasterHighScore", 1990411423);
        setIntField(term116169, term116169.getClass(), "totalHighSync", -1628643632);
        setIntField(term116169, term116169.getClass(), "totalEasySync", 1972351840);
        setIntField(term116169, term116169.getClass(), "totalBasicSync", -1695281641);
        setIntField(term116169, term116169.getClass(), "totalAdvancedSync", -1479800705);
        setIntField(term116169, term116169.getClass(), "totalExpertSync", -37021358);
        setIntField(term116169, term116169.getClass(), "totalMasterSync", -1212186063);
        setIntField(term116169, term116169.getClass(), "totalReMasterSync", 1840775354);
        setIntField(term116169, term116169.getClass(), "playerRating", -127145524);
        setIntField(term116169, term116169.getClass(), "highestRating", -842625847);
        setIntField(term116169, term116169.getClass(), "rankAuthTailId", -980360525);
        setField(term116169, term116169.getClass(), "eventWatchedDate", "ROkWEBVPGe");
        setField(term116169, term116169.getClass(), "webLimitDate", "BHWsGhxwwy");
        setIntField(term116169, term116169.getClass(), "challengeTrackPhase", 741975827);
        setIntField(term116169, term116169.getClass(), "firstPlayBits", 1038645253);
        setField(term116169, term116169.getClass(), "lastPlayDate", "AOwXDxldzy");
        setIntField(term116169, term116169.getClass(), "lastPlaceId", 1874684683);
        setField(term116169, term116169.getClass(), "lastPlaceName", "oPjvcZQHAL");
        setIntField(term116169, term116169.getClass(), "lastRegionId", -65922279);
        setField(term116169, term116169.getClass(), "lastRegionName", "uCNCXXRNau");
        setField(term116169, term116169.getClass(), "lastClientId", "eRcAzhxOsA");
        setField(term116169, term116169.getClass(), "lastCountryCode", "uyydsCcltT");
        setIntField(term116169, term116169.getClass(), "eventPoint", -248288256);
        setIntField(term116169, term116169.getClass(), "totalLv", -2041452525);
        setIntField(term116169, term116169.getClass(), "lastLoginBonusDay", 1983098908);
        setIntField(term116169, term116169.getClass(), "lastSurvivalBonusDay", 301824784);
        setIntField(term116169, term116169.getClass(), "loginBonusLv", 857558066);
        setField(term116167, term116167.getClass(), "user", term116169);
        setIntField(term116167, term116167.getClass(), "orderId", -6342723);
        setLongField(term116167, term116167.getClass(), "sortNumber", 4553697734347851750L);
        setIntField(term116167, term116167.getClass(), "placeId", 1756918414);
        setField(term116167, term116167.getClass(), "placeName", "gRGZBrxxxv");
        setField(term116167, term116167.getClass(), "country", "YvYPXzCrcU");
        setIntField(term116167, term116167.getClass(), "regionId", 608595543);
        setField(term116167, term116167.getClass(), "playDate", "KESrHnsKCa");
        setField(term116167, term116167.getClass(), "userPlayDate", "PRagOHCKmN");
        setIntField(term116167, term116167.getClass(), "musicId", 1398716212);
        setIntField(term116167, term116167.getClass(), "level", -1480289183);
        setIntField(term116167, term116167.getClass(), "gameMode", -1549445595);
        setIntField(term116167, term116167.getClass(), "rivalNum", -489905003);
        setIntField(term116167, term116167.getClass(), "track", 734985387);
        setIntField(term116167, term116167.getClass(), "eventId", -1589839648);
        setBooleanField(term116167, term116167.getClass(), "isFreeToPlay", true);
        setIntField(term116167, term116167.getClass(), "playerRating", 797967545);
        setLongField(term116167, term116167.getClass(), "playedUserId1", 1612790513855406360L);
        setField(term116167, term116167.getClass(), "playedUserName1", "lvnwgMKxXk");
        setIntField(term116167, term116167.getClass(), "playedMusicLevel1", 1752785510);
        setLongField(term116167, term116167.getClass(), "playedUserId2", -3628485034781450950L);
        setField(term116167, term116167.getClass(), "playedUserName2", "FiSaNxpGPk");
        setIntField(term116167, term116167.getClass(), "playedMusicLevel2", -2139567650);
        setLongField(term116167, term116167.getClass(), "playedUserId3", 2505442540861032970L);
        setField(term116167, term116167.getClass(), "playedUserName3", "QMzQRRhneO");
        setIntField(term116167, term116167.getClass(), "playedMusicLevel3", 1941649114);
        setIntField(term116167, term116167.getClass(), "achievement", -287321760);
        setIntField(term116167, term116167.getClass(), "score", -1313321034);
        setIntField(term116167, term116167.getClass(), "tapScore", 131693432);
        setIntField(term116167, term116167.getClass(), "holdScore", -884613349);
        setIntField(term116167, term116167.getClass(), "slideScore", -227022389);
        setIntField(term116167, term116167.getClass(), "breakScore", -780249262);
        setIntField(term116167, term116167.getClass(), "syncRate", -1608693876);
        setIntField(term116167, term116167.getClass(), "vsWin", 1682226516);
        setBooleanField(term116167, term116167.getClass(), "isAllPerfect", false);
        setIntField(term116167, term116167.getClass(), "fullCombo", 982039024);
        setIntField(term116167, term116167.getClass(), "maxFever", 1025928124);
        setIntField(term116167, term116167.getClass(), "maxCombo", 1080394714);
        setIntField(term116167, term116167.getClass(), "tapPerfect", -1472341235);
        setIntField(term116167, term116167.getClass(), "tapGreat", -1801361943);
        setIntField(term116167, term116167.getClass(), "tapGood", 596985150);
        setIntField(term116167, term116167.getClass(), "tapBad", -1036612528);
        setIntField(term116167, term116167.getClass(), "holdPerfect", 678116826);
        setIntField(term116167, term116167.getClass(), "holdGreat", -968589797);
        setIntField(term116167, term116167.getClass(), "holdGood", 1905421633);
        setIntField(term116167, term116167.getClass(), "holdBad", 83824083);
        setIntField(term116167, term116167.getClass(), "slidePerfect", 808572108);
        setIntField(term116167, term116167.getClass(), "slideGreat", 1104236955);
        setIntField(term116167, term116167.getClass(), "slideGood", 626404062);
        setIntField(term116167, term116167.getClass(), "slideBad", 1954724158);
        setIntField(term116167, term116167.getClass(), "breakPerfect", 1561676074);
        setIntField(term116167, term116167.getClass(), "breakGreat", 1690665676);
        setIntField(term116167, term116167.getClass(), "breakGood", -80665419);
        setIntField(term116167, term116167.getClass(), "breakBad", 789488298);
        setBooleanField(term116167, term116167.getClass(), "isTrackSkip", true);
        setBooleanField(term116167, term116167.getClass(), "isHighScore", false);
        setBooleanField(term116167, term116167.getClass(), "isChallengeTrack", true);
        setIntField(term116167, term116167.getClass(), "challengeLife", -1152670111);
        setIntField(term116167, term116167.getClass(), "challengeRemain", -1200569780);
        setIntField(term116167, term116167.getClass(), "isAllPerfectPlus", 1982581757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayDate", argTypes, term116167, args);
    }

};


