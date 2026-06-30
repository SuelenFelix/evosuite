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

public class UserPlaylog_setTapPerfect_1366631613100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160071;
     Object term160383;

    public UserPlaylog_setTapPerfect_1366631613100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term160077 = new Long(8527367353497875781L);
        term160071 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term160073 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term160075 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term160091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160106 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term160071, term160071.getClass(), "id", -8075121428376355007L);
        setLongField(term160073, term160073.getClass(), "id", 685138334744218828L);
        setLongField(term160075, term160075.getClass(), "id", -2769601758499543843L);
        setField(term160075, term160075.getClass(), "extId", term160077);
        setField(term160075, term160075.getClass(), "luid", "pmcRudWxTC");
        setIntField(term160092, term160092.getClass(), "year", 2010);
        setShortField(term160092, term160092.getClass(), "month", (short) 5);
        setShortField(term160092, term160092.getClass(), "day", (short) 25);
        setField(term160091, term160091.getClass(), "date", term160092);
        setByteField(term160096, term160096.getClass(), "hour", (byte) 17);
        setByteField(term160096, term160096.getClass(), "minute", (byte) 23);
        setByteField(term160096, term160096.getClass(), "second", (byte) 21);
        setIntField(term160096, term160096.getClass(), "nano", 681441380);
        setField(term160091, term160091.getClass(), "time", term160096);
        setField(term160075, term160075.getClass(), "registerTime", term160091);
        setIntField(term160102, term160102.getClass(), "year", 2019);
        setShortField(term160102, term160102.getClass(), "month", (short) 11);
        setShortField(term160102, term160102.getClass(), "day", (short) 2);
        setField(term160101, term160101.getClass(), "date", term160102);
        setByteField(term160106, term160106.getClass(), "hour", (byte) 0);
        setByteField(term160106, term160106.getClass(), "minute", (byte) 49);
        setByteField(term160106, term160106.getClass(), "second", (byte) 45);
        setIntField(term160106, term160106.getClass(), "nano", 193831568);
        setField(term160101, term160101.getClass(), "time", term160106);
        setField(term160075, term160075.getClass(), "accessTime", term160101);
        setField(term160073, term160073.getClass(), "card", term160075);
        setIntField(term160073, term160073.getClass(), "lastDataVersion", -106197031);
        setField(term160073, term160073.getClass(), "userName", "LJueGMncZI");
        setIntField(term160073, term160073.getClass(), "point", -526642000);
        setIntField(term160073, term160073.getClass(), "totalPoint", -1236071949);
        setIntField(term160073, term160073.getClass(), "iconId", -696047901);
        setIntField(term160073, term160073.getClass(), "nameplateId", -2026730922);
        setIntField(term160073, term160073.getClass(), "frameId", -352488332);
        setIntField(term160073, term160073.getClass(), "trophyId", -1412602608);
        setIntField(term160073, term160073.getClass(), "playCount", 1807348810);
        setIntField(term160073, term160073.getClass(), "playVsCount", -1694174538);
        setIntField(term160073, term160073.getClass(), "playSyncCount", 1878283114);
        setIntField(term160073, term160073.getClass(), "winCount", 157478469);
        setIntField(term160073, term160073.getClass(), "helpCount", 1895936214);
        setIntField(term160073, term160073.getClass(), "comboCount", -269407784);
        setIntField(term160073, term160073.getClass(), "feverCount", -291747510);
        setIntField(term160073, term160073.getClass(), "totalHiScore", 1615694883);
        setIntField(term160073, term160073.getClass(), "totalEasyHighScore", -2109845436);
        setIntField(term160073, term160073.getClass(), "totalBasicHighScore", 1378872325);
        setIntField(term160073, term160073.getClass(), "totalAdvancedHighScore", 1725642232);
        setIntField(term160073, term160073.getClass(), "totalExpertHighScore", 1060164792);
        setIntField(term160073, term160073.getClass(), "totalMasterHighScore", -1175124443);
        setIntField(term160073, term160073.getClass(), "totalReMasterHighScore", 2133185637);
        setIntField(term160073, term160073.getClass(), "totalHighSync", 1104179684);
        setIntField(term160073, term160073.getClass(), "totalEasySync", 1662746660);
        setIntField(term160073, term160073.getClass(), "totalBasicSync", -733280541);
        setIntField(term160073, term160073.getClass(), "totalAdvancedSync", 1425351604);
        setIntField(term160073, term160073.getClass(), "totalExpertSync", -782491470);
        setIntField(term160073, term160073.getClass(), "totalMasterSync", -7016340);
        setIntField(term160073, term160073.getClass(), "totalReMasterSync", 339793157);
        setIntField(term160073, term160073.getClass(), "playerRating", -422003147);
        setIntField(term160073, term160073.getClass(), "highestRating", 1878428188);
        setIntField(term160073, term160073.getClass(), "rankAuthTailId", 1901781646);
        setField(term160073, term160073.getClass(), "eventWatchedDate", "MzACPCdnZu");
        setField(term160073, term160073.getClass(), "webLimitDate", "orKYnrPZUK");
        setIntField(term160073, term160073.getClass(), "challengeTrackPhase", 1644076721);
        setIntField(term160073, term160073.getClass(), "firstPlayBits", -1386441498);
        setField(term160073, term160073.getClass(), "lastPlayDate", "cnXmohyKKG");
        setIntField(term160073, term160073.getClass(), "lastPlaceId", -886465257);
        setField(term160073, term160073.getClass(), "lastPlaceName", "GUOUoghpWj");
        setIntField(term160073, term160073.getClass(), "lastRegionId", 1025547476);
        setField(term160073, term160073.getClass(), "lastRegionName", "mwFuZUIQyt");
        setField(term160073, term160073.getClass(), "lastClientId", "vjEoebAxYI");
        setField(term160073, term160073.getClass(), "lastCountryCode", "yigFKTPrsp");
        setIntField(term160073, term160073.getClass(), "eventPoint", 323645298);
        setIntField(term160073, term160073.getClass(), "totalLv", -367596044);
        setIntField(term160073, term160073.getClass(), "lastLoginBonusDay", 863830324);
        setIntField(term160073, term160073.getClass(), "lastSurvivalBonusDay", -287166867);
        setIntField(term160073, term160073.getClass(), "loginBonusLv", -1047971269);
        setField(term160071, term160071.getClass(), "user", term160073);
        setIntField(term160071, term160071.getClass(), "orderId", 1758019697);
        setLongField(term160071, term160071.getClass(), "sortNumber", 2429296542899066013L);
        setIntField(term160071, term160071.getClass(), "placeId", -20489655);
        setField(term160071, term160071.getClass(), "placeName", "YpqweHjjwu");
        setField(term160071, term160071.getClass(), "country", "RMDWjokXpG");
        setIntField(term160071, term160071.getClass(), "regionId", -1938582471);
        setField(term160071, term160071.getClass(), "playDate", "INiyuixgdb");
        setField(term160071, term160071.getClass(), "userPlayDate", "AbQcJaPuyu");
        setIntField(term160071, term160071.getClass(), "musicId", 2000158636);
        setIntField(term160071, term160071.getClass(), "level", -217671869);
        setIntField(term160071, term160071.getClass(), "gameMode", 333292112);
        setIntField(term160071, term160071.getClass(), "rivalNum", 807196387);
        setIntField(term160071, term160071.getClass(), "track", -639986541);
        setIntField(term160071, term160071.getClass(), "eventId", 719892319);
        setBooleanField(term160071, term160071.getClass(), "isFreeToPlay", true);
        setIntField(term160071, term160071.getClass(), "playerRating", -1295794802);
        setLongField(term160071, term160071.getClass(), "playedUserId1", 5867985083377188636L);
        setField(term160071, term160071.getClass(), "playedUserName1", "SDJXoYNVym");
        setIntField(term160071, term160071.getClass(), "playedMusicLevel1", -1282312652);
        setLongField(term160071, term160071.getClass(), "playedUserId2", 3127660879530812585L);
        setField(term160071, term160071.getClass(), "playedUserName2", "ownnefVcXK");
        setIntField(term160071, term160071.getClass(), "playedMusicLevel2", 154258613);
        setLongField(term160071, term160071.getClass(), "playedUserId3", 8719003136272047601L);
        setField(term160071, term160071.getClass(), "playedUserName3", "KAtvRoxPvL");
        setIntField(term160071, term160071.getClass(), "playedMusicLevel3", -1539553993);
        setIntField(term160071, term160071.getClass(), "achievement", -116413193);
        setIntField(term160071, term160071.getClass(), "score", 1503835558);
        setIntField(term160071, term160071.getClass(), "tapScore", 23268813);
        setIntField(term160071, term160071.getClass(), "holdScore", 1025525105);
        setIntField(term160071, term160071.getClass(), "slideScore", -1587346736);
        setIntField(term160071, term160071.getClass(), "breakScore", 854695480);
        setIntField(term160071, term160071.getClass(), "syncRate", -271085868);
        setIntField(term160071, term160071.getClass(), "vsWin", 513463512);
        setBooleanField(term160071, term160071.getClass(), "isAllPerfect", true);
        setIntField(term160071, term160071.getClass(), "fullCombo", 351567254);
        setIntField(term160071, term160071.getClass(), "maxFever", -1193358976);
        setIntField(term160071, term160071.getClass(), "maxCombo", 708429698);
        setIntField(term160071, term160071.getClass(), "tapPerfect", -563977321);
        setIntField(term160071, term160071.getClass(), "tapGreat", 1096674590);
        setIntField(term160071, term160071.getClass(), "tapGood", 1195592198);
        setIntField(term160071, term160071.getClass(), "tapBad", 677106708);
        setIntField(term160071, term160071.getClass(), "holdPerfect", -733462620);
        setIntField(term160071, term160071.getClass(), "holdGreat", 1367393789);
        setIntField(term160071, term160071.getClass(), "holdGood", -899726130);
        setIntField(term160071, term160071.getClass(), "holdBad", -583413424);
        setIntField(term160071, term160071.getClass(), "slidePerfect", 1788172921);
        setIntField(term160071, term160071.getClass(), "slideGreat", -1734998231);
        setIntField(term160071, term160071.getClass(), "slideGood", 136319030);
        setIntField(term160071, term160071.getClass(), "slideBad", 754414789);
        setIntField(term160071, term160071.getClass(), "breakPerfect", -2004797943);
        setIntField(term160071, term160071.getClass(), "breakGreat", -928754208);
        setIntField(term160071, term160071.getClass(), "breakGood", 1537797122);
        setIntField(term160071, term160071.getClass(), "breakBad", -1511496361);
        setBooleanField(term160071, term160071.getClass(), "isTrackSkip", true);
        setBooleanField(term160071, term160071.getClass(), "isHighScore", false);
        setBooleanField(term160071, term160071.getClass(), "isChallengeTrack", true);
        setIntField(term160071, term160071.getClass(), "challengeLife", -336188175);
        setIntField(term160071, term160071.getClass(), "challengeRemain", 736195528);
        setIntField(term160071, term160071.getClass(), "isAllPerfectPlus", -718887243);
        term160383 = new Integer(1973884922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term160383;
        callMethod(klass, "setTapPerfect", argTypes, term160071, args);
    }

};


