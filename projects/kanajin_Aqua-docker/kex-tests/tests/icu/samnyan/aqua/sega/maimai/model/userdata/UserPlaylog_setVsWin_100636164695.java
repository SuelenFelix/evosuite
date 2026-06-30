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

public class UserPlaylog_setVsWin_100636164695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157701;
     Object term158013;

    public UserPlaylog_setVsWin_100636164695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term157707 = new Long(4828755228445882127L);
        term157701 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term157703 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term157705 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term157721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157726 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157736 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term157701, term157701.getClass(), "id", -4693282265818959742L);
        setLongField(term157703, term157703.getClass(), "id", -3969214906313119862L);
        setLongField(term157705, term157705.getClass(), "id", 8375905579419331860L);
        setField(term157705, term157705.getClass(), "extId", term157707);
        setField(term157705, term157705.getClass(), "luid", "vEHRRwNajA");
        setIntField(term157722, term157722.getClass(), "year", 2015);
        setShortField(term157722, term157722.getClass(), "month", (short) 4);
        setShortField(term157722, term157722.getClass(), "day", (short) 6);
        setField(term157721, term157721.getClass(), "date", term157722);
        setByteField(term157726, term157726.getClass(), "hour", (byte) 6);
        setByteField(term157726, term157726.getClass(), "minute", (byte) 39);
        setByteField(term157726, term157726.getClass(), "second", (byte) 45);
        setIntField(term157726, term157726.getClass(), "nano", 97858819);
        setField(term157721, term157721.getClass(), "time", term157726);
        setField(term157705, term157705.getClass(), "registerTime", term157721);
        setIntField(term157732, term157732.getClass(), "year", 2019);
        setShortField(term157732, term157732.getClass(), "month", (short) 3);
        setShortField(term157732, term157732.getClass(), "day", (short) 3);
        setField(term157731, term157731.getClass(), "date", term157732);
        setByteField(term157736, term157736.getClass(), "hour", (byte) 2);
        setByteField(term157736, term157736.getClass(), "minute", (byte) 9);
        setByteField(term157736, term157736.getClass(), "second", (byte) 44);
        setIntField(term157736, term157736.getClass(), "nano", 690452555);
        setField(term157731, term157731.getClass(), "time", term157736);
        setField(term157705, term157705.getClass(), "accessTime", term157731);
        setField(term157703, term157703.getClass(), "card", term157705);
        setIntField(term157703, term157703.getClass(), "lastDataVersion", -472341969);
        setField(term157703, term157703.getClass(), "userName", "JePWfnKmqE");
        setIntField(term157703, term157703.getClass(), "point", 331537526);
        setIntField(term157703, term157703.getClass(), "totalPoint", 2071433680);
        setIntField(term157703, term157703.getClass(), "iconId", 1943446095);
        setIntField(term157703, term157703.getClass(), "nameplateId", 1652858351);
        setIntField(term157703, term157703.getClass(), "frameId", -913279940);
        setIntField(term157703, term157703.getClass(), "trophyId", 870323209);
        setIntField(term157703, term157703.getClass(), "playCount", -1190049621);
        setIntField(term157703, term157703.getClass(), "playVsCount", 1903492873);
        setIntField(term157703, term157703.getClass(), "playSyncCount", -1822278676);
        setIntField(term157703, term157703.getClass(), "winCount", -718669557);
        setIntField(term157703, term157703.getClass(), "helpCount", 1872640975);
        setIntField(term157703, term157703.getClass(), "comboCount", 1834274419);
        setIntField(term157703, term157703.getClass(), "feverCount", -1484154691);
        setIntField(term157703, term157703.getClass(), "totalHiScore", -1067244232);
        setIntField(term157703, term157703.getClass(), "totalEasyHighScore", 1511233817);
        setIntField(term157703, term157703.getClass(), "totalBasicHighScore", -1597236849);
        setIntField(term157703, term157703.getClass(), "totalAdvancedHighScore", -590762770);
        setIntField(term157703, term157703.getClass(), "totalExpertHighScore", 1625573732);
        setIntField(term157703, term157703.getClass(), "totalMasterHighScore", -544709840);
        setIntField(term157703, term157703.getClass(), "totalReMasterHighScore", 306522691);
        setIntField(term157703, term157703.getClass(), "totalHighSync", 1894815516);
        setIntField(term157703, term157703.getClass(), "totalEasySync", -1545186921);
        setIntField(term157703, term157703.getClass(), "totalBasicSync", 1281934202);
        setIntField(term157703, term157703.getClass(), "totalAdvancedSync", -1073046167);
        setIntField(term157703, term157703.getClass(), "totalExpertSync", 99930835);
        setIntField(term157703, term157703.getClass(), "totalMasterSync", -2093384687);
        setIntField(term157703, term157703.getClass(), "totalReMasterSync", 281571025);
        setIntField(term157703, term157703.getClass(), "playerRating", 499514218);
        setIntField(term157703, term157703.getClass(), "highestRating", -1120956826);
        setIntField(term157703, term157703.getClass(), "rankAuthTailId", -39297907);
        setField(term157703, term157703.getClass(), "eventWatchedDate", "eoNrxoHMqo");
        setField(term157703, term157703.getClass(), "webLimitDate", "klaJiaCEJi");
        setIntField(term157703, term157703.getClass(), "challengeTrackPhase", 1915363701);
        setIntField(term157703, term157703.getClass(), "firstPlayBits", -591612123);
        setField(term157703, term157703.getClass(), "lastPlayDate", "gcfVossSeW");
        setIntField(term157703, term157703.getClass(), "lastPlaceId", -125433342);
        setField(term157703, term157703.getClass(), "lastPlaceName", "xBlXstmAsQ");
        setIntField(term157703, term157703.getClass(), "lastRegionId", 2138132426);
        setField(term157703, term157703.getClass(), "lastRegionName", "jewrbmDdcT");
        setField(term157703, term157703.getClass(), "lastClientId", "ltNoNMOfWV");
        setField(term157703, term157703.getClass(), "lastCountryCode", "VgdfvIeVod");
        setIntField(term157703, term157703.getClass(), "eventPoint", 447637059);
        setIntField(term157703, term157703.getClass(), "totalLv", -1515997420);
        setIntField(term157703, term157703.getClass(), "lastLoginBonusDay", 736187393);
        setIntField(term157703, term157703.getClass(), "lastSurvivalBonusDay", 451224390);
        setIntField(term157703, term157703.getClass(), "loginBonusLv", 1611341095);
        setField(term157701, term157701.getClass(), "user", term157703);
        setIntField(term157701, term157701.getClass(), "orderId", 1035979953);
        setLongField(term157701, term157701.getClass(), "sortNumber", -3159920279724689717L);
        setIntField(term157701, term157701.getClass(), "placeId", -1619724677);
        setField(term157701, term157701.getClass(), "placeName", "TKUDnkrdyn");
        setField(term157701, term157701.getClass(), "country", "zyGPpAGuKz");
        setIntField(term157701, term157701.getClass(), "regionId", 484570444);
        setField(term157701, term157701.getClass(), "playDate", "vgJuNJDSQu");
        setField(term157701, term157701.getClass(), "userPlayDate", "TokIIKaqkw");
        setIntField(term157701, term157701.getClass(), "musicId", -590318386);
        setIntField(term157701, term157701.getClass(), "level", 193707542);
        setIntField(term157701, term157701.getClass(), "gameMode", 843737635);
        setIntField(term157701, term157701.getClass(), "rivalNum", -556953295);
        setIntField(term157701, term157701.getClass(), "track", -845722720);
        setIntField(term157701, term157701.getClass(), "eventId", 1736623587);
        setBooleanField(term157701, term157701.getClass(), "isFreeToPlay", true);
        setIntField(term157701, term157701.getClass(), "playerRating", 1301307983);
        setLongField(term157701, term157701.getClass(), "playedUserId1", -2357799544049443716L);
        setField(term157701, term157701.getClass(), "playedUserName1", "kPOlNDAMrn");
        setIntField(term157701, term157701.getClass(), "playedMusicLevel1", 404933593);
        setLongField(term157701, term157701.getClass(), "playedUserId2", 5316576314473126985L);
        setField(term157701, term157701.getClass(), "playedUserName2", "gXVfxiKYXy");
        setIntField(term157701, term157701.getClass(), "playedMusicLevel2", -1929368595);
        setLongField(term157701, term157701.getClass(), "playedUserId3", 6119456969796759152L);
        setField(term157701, term157701.getClass(), "playedUserName3", "wDXGaloUxi");
        setIntField(term157701, term157701.getClass(), "playedMusicLevel3", 372813155);
        setIntField(term157701, term157701.getClass(), "achievement", -645249448);
        setIntField(term157701, term157701.getClass(), "score", 14263424);
        setIntField(term157701, term157701.getClass(), "tapScore", -198617243);
        setIntField(term157701, term157701.getClass(), "holdScore", -1881742095);
        setIntField(term157701, term157701.getClass(), "slideScore", 1173187619);
        setIntField(term157701, term157701.getClass(), "breakScore", -64344650);
        setIntField(term157701, term157701.getClass(), "syncRate", 1958057421);
        setIntField(term157701, term157701.getClass(), "vsWin", -660062568);
        setBooleanField(term157701, term157701.getClass(), "isAllPerfect", true);
        setIntField(term157701, term157701.getClass(), "fullCombo", -1908480000);
        setIntField(term157701, term157701.getClass(), "maxFever", 749109931);
        setIntField(term157701, term157701.getClass(), "maxCombo", -1931166992);
        setIntField(term157701, term157701.getClass(), "tapPerfect", 215166713);
        setIntField(term157701, term157701.getClass(), "tapGreat", -1734474318);
        setIntField(term157701, term157701.getClass(), "tapGood", -1347924820);
        setIntField(term157701, term157701.getClass(), "tapBad", 148510675);
        setIntField(term157701, term157701.getClass(), "holdPerfect", -386090895);
        setIntField(term157701, term157701.getClass(), "holdGreat", -1080770866);
        setIntField(term157701, term157701.getClass(), "holdGood", -2100126483);
        setIntField(term157701, term157701.getClass(), "holdBad", 490490667);
        setIntField(term157701, term157701.getClass(), "slidePerfect", 2022466682);
        setIntField(term157701, term157701.getClass(), "slideGreat", -1219968440);
        setIntField(term157701, term157701.getClass(), "slideGood", 2066816648);
        setIntField(term157701, term157701.getClass(), "slideBad", 974988563);
        setIntField(term157701, term157701.getClass(), "breakPerfect", 988540753);
        setIntField(term157701, term157701.getClass(), "breakGreat", 285008202);
        setIntField(term157701, term157701.getClass(), "breakGood", -1232476987);
        setIntField(term157701, term157701.getClass(), "breakBad", -389049863);
        setBooleanField(term157701, term157701.getClass(), "isTrackSkip", false);
        setBooleanField(term157701, term157701.getClass(), "isHighScore", true);
        setBooleanField(term157701, term157701.getClass(), "isChallengeTrack", true);
        setIntField(term157701, term157701.getClass(), "challengeLife", -106722855);
        setIntField(term157701, term157701.getClass(), "challengeRemain", 1048311111);
        setIntField(term157701, term157701.getClass(), "isAllPerfectPlus", -1928898148);
        term158013 = new Integer(-1220755239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term158013;
        callMethod(klass, "setVsWin", argTypes, term157701, args);
    }

};


