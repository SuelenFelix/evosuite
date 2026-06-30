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

public class UserPlaylog_getSortNumber_13290458163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113807;

    public UserPlaylog_getSortNumber_13290458163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term113813 = new Long(-5587528177305224828L);
        term113807 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term113809 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term113811 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term113827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113842 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term113807, term113807.getClass(), "id", -6209056926999752933L);
        setLongField(term113809, term113809.getClass(), "id", 475071242551560384L);
        setLongField(term113811, term113811.getClass(), "id", 279205148356106270L);
        setField(term113811, term113811.getClass(), "extId", term113813);
        setField(term113811, term113811.getClass(), "luid", "UcCUEwaHWp");
        setIntField(term113828, term113828.getClass(), "year", 2021);
        setShortField(term113828, term113828.getClass(), "month", (short) 3);
        setShortField(term113828, term113828.getClass(), "day", (short) 30);
        setField(term113827, term113827.getClass(), "date", term113828);
        setByteField(term113832, term113832.getClass(), "hour", (byte) 4);
        setByteField(term113832, term113832.getClass(), "minute", (byte) 19);
        setByteField(term113832, term113832.getClass(), "second", (byte) 24);
        setIntField(term113832, term113832.getClass(), "nano", 421494175);
        setField(term113827, term113827.getClass(), "time", term113832);
        setField(term113811, term113811.getClass(), "registerTime", term113827);
        setIntField(term113838, term113838.getClass(), "year", 2028);
        setShortField(term113838, term113838.getClass(), "month", (short) 1);
        setShortField(term113838, term113838.getClass(), "day", (short) 9);
        setField(term113837, term113837.getClass(), "date", term113838);
        setByteField(term113842, term113842.getClass(), "hour", (byte) 10);
        setByteField(term113842, term113842.getClass(), "minute", (byte) 17);
        setByteField(term113842, term113842.getClass(), "second", (byte) 24);
        setIntField(term113842, term113842.getClass(), "nano", 95983008);
        setField(term113837, term113837.getClass(), "time", term113842);
        setField(term113811, term113811.getClass(), "accessTime", term113837);
        setField(term113809, term113809.getClass(), "card", term113811);
        setIntField(term113809, term113809.getClass(), "lastDataVersion", -1615007560);
        setField(term113809, term113809.getClass(), "userName", "IZewAlURAW");
        setIntField(term113809, term113809.getClass(), "point", 1602440493);
        setIntField(term113809, term113809.getClass(), "totalPoint", -1350543710);
        setIntField(term113809, term113809.getClass(), "iconId", 1136111379);
        setIntField(term113809, term113809.getClass(), "nameplateId", 741627966);
        setIntField(term113809, term113809.getClass(), "frameId", -1499573211);
        setIntField(term113809, term113809.getClass(), "trophyId", 1648846611);
        setIntField(term113809, term113809.getClass(), "playCount", 802558149);
        setIntField(term113809, term113809.getClass(), "playVsCount", 551411019);
        setIntField(term113809, term113809.getClass(), "playSyncCount", -706249672);
        setIntField(term113809, term113809.getClass(), "winCount", 899428484);
        setIntField(term113809, term113809.getClass(), "helpCount", -715619460);
        setIntField(term113809, term113809.getClass(), "comboCount", -485599290);
        setIntField(term113809, term113809.getClass(), "feverCount", 1782317150);
        setIntField(term113809, term113809.getClass(), "totalHiScore", 1609026911);
        setIntField(term113809, term113809.getClass(), "totalEasyHighScore", -1582731378);
        setIntField(term113809, term113809.getClass(), "totalBasicHighScore", -23903250);
        setIntField(term113809, term113809.getClass(), "totalAdvancedHighScore", 813666760);
        setIntField(term113809, term113809.getClass(), "totalExpertHighScore", -623763986);
        setIntField(term113809, term113809.getClass(), "totalMasterHighScore", -1410336947);
        setIntField(term113809, term113809.getClass(), "totalReMasterHighScore", 1758202234);
        setIntField(term113809, term113809.getClass(), "totalHighSync", 1517943352);
        setIntField(term113809, term113809.getClass(), "totalEasySync", -488153567);
        setIntField(term113809, term113809.getClass(), "totalBasicSync", -607202437);
        setIntField(term113809, term113809.getClass(), "totalAdvancedSync", 1290670338);
        setIntField(term113809, term113809.getClass(), "totalExpertSync", 322703244);
        setIntField(term113809, term113809.getClass(), "totalMasterSync", -1109732466);
        setIntField(term113809, term113809.getClass(), "totalReMasterSync", 533725948);
        setIntField(term113809, term113809.getClass(), "playerRating", 162155421);
        setIntField(term113809, term113809.getClass(), "highestRating", 2041040026);
        setIntField(term113809, term113809.getClass(), "rankAuthTailId", 1748490168);
        setField(term113809, term113809.getClass(), "eventWatchedDate", "RYptfEmCie");
        setField(term113809, term113809.getClass(), "webLimitDate", "roQkSUEGom");
        setIntField(term113809, term113809.getClass(), "challengeTrackPhase", -542162483);
        setIntField(term113809, term113809.getClass(), "firstPlayBits", 45158602);
        setField(term113809, term113809.getClass(), "lastPlayDate", "sKmuUYuuTa");
        setIntField(term113809, term113809.getClass(), "lastPlaceId", -1793023165);
        setField(term113809, term113809.getClass(), "lastPlaceName", "KxdfNdyjGO");
        setIntField(term113809, term113809.getClass(), "lastRegionId", 815973011);
        setField(term113809, term113809.getClass(), "lastRegionName", "vPinPzceBb");
        setField(term113809, term113809.getClass(), "lastClientId", "jPhUwTVUvX");
        setField(term113809, term113809.getClass(), "lastCountryCode", "GIBMEPcBjc");
        setIntField(term113809, term113809.getClass(), "eventPoint", 325090101);
        setIntField(term113809, term113809.getClass(), "totalLv", -1728350573);
        setIntField(term113809, term113809.getClass(), "lastLoginBonusDay", 1797675970);
        setIntField(term113809, term113809.getClass(), "lastSurvivalBonusDay", -924878521);
        setIntField(term113809, term113809.getClass(), "loginBonusLv", -70341831);
        setField(term113807, term113807.getClass(), "user", term113809);
        setIntField(term113807, term113807.getClass(), "orderId", -1047558161);
        setLongField(term113807, term113807.getClass(), "sortNumber", -3702098864254881563L);
        setIntField(term113807, term113807.getClass(), "placeId", 1441666373);
        setField(term113807, term113807.getClass(), "placeName", "noofsnMNpz");
        setField(term113807, term113807.getClass(), "country", "zorMRlODHM");
        setIntField(term113807, term113807.getClass(), "regionId", 2079040820);
        setField(term113807, term113807.getClass(), "playDate", "xLZEtHhKOn");
        setField(term113807, term113807.getClass(), "userPlayDate", "wfqnUhLFCy");
        setIntField(term113807, term113807.getClass(), "musicId", -383589548);
        setIntField(term113807, term113807.getClass(), "level", -1377370776);
        setIntField(term113807, term113807.getClass(), "gameMode", 1899117502);
        setIntField(term113807, term113807.getClass(), "rivalNum", -791226570);
        setIntField(term113807, term113807.getClass(), "track", 992634471);
        setIntField(term113807, term113807.getClass(), "eventId", 292969469);
        setBooleanField(term113807, term113807.getClass(), "isFreeToPlay", true);
        setIntField(term113807, term113807.getClass(), "playerRating", -861174022);
        setLongField(term113807, term113807.getClass(), "playedUserId1", 1787205862282614159L);
        setField(term113807, term113807.getClass(), "playedUserName1", "UKRJIjNXmC");
        setIntField(term113807, term113807.getClass(), "playedMusicLevel1", 1004739369);
        setLongField(term113807, term113807.getClass(), "playedUserId2", -7876013692629304244L);
        setField(term113807, term113807.getClass(), "playedUserName2", "CJBElYMXZF");
        setIntField(term113807, term113807.getClass(), "playedMusicLevel2", -2039607314);
        setLongField(term113807, term113807.getClass(), "playedUserId3", 8129782425142702673L);
        setField(term113807, term113807.getClass(), "playedUserName3", "uZOAWgAORh");
        setIntField(term113807, term113807.getClass(), "playedMusicLevel3", 793550408);
        setIntField(term113807, term113807.getClass(), "achievement", -802007311);
        setIntField(term113807, term113807.getClass(), "score", -1357070417);
        setIntField(term113807, term113807.getClass(), "tapScore", -1560511884);
        setIntField(term113807, term113807.getClass(), "holdScore", -811480093);
        setIntField(term113807, term113807.getClass(), "slideScore", 766050656);
        setIntField(term113807, term113807.getClass(), "breakScore", -113224144);
        setIntField(term113807, term113807.getClass(), "syncRate", 873175368);
        setIntField(term113807, term113807.getClass(), "vsWin", -106093816);
        setBooleanField(term113807, term113807.getClass(), "isAllPerfect", false);
        setIntField(term113807, term113807.getClass(), "fullCombo", 96789653);
        setIntField(term113807, term113807.getClass(), "maxFever", 1236414242);
        setIntField(term113807, term113807.getClass(), "maxCombo", -1196574351);
        setIntField(term113807, term113807.getClass(), "tapPerfect", 679590007);
        setIntField(term113807, term113807.getClass(), "tapGreat", -1076538487);
        setIntField(term113807, term113807.getClass(), "tapGood", -1027942774);
        setIntField(term113807, term113807.getClass(), "tapBad", 1763778014);
        setIntField(term113807, term113807.getClass(), "holdPerfect", 607826332);
        setIntField(term113807, term113807.getClass(), "holdGreat", 251965235);
        setIntField(term113807, term113807.getClass(), "holdGood", 1685083329);
        setIntField(term113807, term113807.getClass(), "holdBad", 2030086881);
        setIntField(term113807, term113807.getClass(), "slidePerfect", -1850835728);
        setIntField(term113807, term113807.getClass(), "slideGreat", -629063398);
        setIntField(term113807, term113807.getClass(), "slideGood", 1928083323);
        setIntField(term113807, term113807.getClass(), "slideBad", -267430690);
        setIntField(term113807, term113807.getClass(), "breakPerfect", 745712799);
        setIntField(term113807, term113807.getClass(), "breakGreat", 784378668);
        setIntField(term113807, term113807.getClass(), "breakGood", -1242913019);
        setIntField(term113807, term113807.getClass(), "breakBad", 1086277183);
        setBooleanField(term113807, term113807.getClass(), "isTrackSkip", false);
        setBooleanField(term113807, term113807.getClass(), "isHighScore", false);
        setBooleanField(term113807, term113807.getClass(), "isChallengeTrack", false);
        setIntField(term113807, term113807.getClass(), "challengeLife", -546285718);
        setIntField(term113807, term113807.getClass(), "challengeRemain", 233439438);
        setIntField(term113807, term113807.getClass(), "isAllPerfectPlus", -17888307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortNumber", argTypes, term113807, args);
    }

};


