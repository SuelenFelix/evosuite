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

public class UserPlaylog_setSlideScore_71313394092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156279;
     Object term156591;

    public UserPlaylog_setSlideScore_71313394092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term156285 = new Long(8171709541116491249L);
        term156279 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term156281 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term156283 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term156299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156314 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term156279, term156279.getClass(), "id", 2554027544370354047L);
        setLongField(term156281, term156281.getClass(), "id", 365411533450462757L);
        setLongField(term156283, term156283.getClass(), "id", -5876369379613954614L);
        setField(term156283, term156283.getClass(), "extId", term156285);
        setField(term156283, term156283.getClass(), "luid", "pBstCdjkMe");
        setIntField(term156300, term156300.getClass(), "year", 2019);
        setShortField(term156300, term156300.getClass(), "month", (short) 1);
        setShortField(term156300, term156300.getClass(), "day", (short) 9);
        setField(term156299, term156299.getClass(), "date", term156300);
        setByteField(term156304, term156304.getClass(), "hour", (byte) 16);
        setByteField(term156304, term156304.getClass(), "minute", (byte) 39);
        setByteField(term156304, term156304.getClass(), "second", (byte) 1);
        setIntField(term156304, term156304.getClass(), "nano", 715938448);
        setField(term156299, term156299.getClass(), "time", term156304);
        setField(term156283, term156283.getClass(), "registerTime", term156299);
        setIntField(term156310, term156310.getClass(), "year", 2014);
        setShortField(term156310, term156310.getClass(), "month", (short) 8);
        setShortField(term156310, term156310.getClass(), "day", (short) 3);
        setField(term156309, term156309.getClass(), "date", term156310);
        setByteField(term156314, term156314.getClass(), "hour", (byte) 5);
        setByteField(term156314, term156314.getClass(), "minute", (byte) 41);
        setByteField(term156314, term156314.getClass(), "second", (byte) 29);
        setIntField(term156314, term156314.getClass(), "nano", 782499753);
        setField(term156309, term156309.getClass(), "time", term156314);
        setField(term156283, term156283.getClass(), "accessTime", term156309);
        setField(term156281, term156281.getClass(), "card", term156283);
        setIntField(term156281, term156281.getClass(), "lastDataVersion", 189757655);
        setField(term156281, term156281.getClass(), "userName", "BpLdpzfuoW");
        setIntField(term156281, term156281.getClass(), "point", -1825052032);
        setIntField(term156281, term156281.getClass(), "totalPoint", 209094476);
        setIntField(term156281, term156281.getClass(), "iconId", -1307273912);
        setIntField(term156281, term156281.getClass(), "nameplateId", 126451352);
        setIntField(term156281, term156281.getClass(), "frameId", -1404768430);
        setIntField(term156281, term156281.getClass(), "trophyId", -1256356721);
        setIntField(term156281, term156281.getClass(), "playCount", 2055399146);
        setIntField(term156281, term156281.getClass(), "playVsCount", -959131846);
        setIntField(term156281, term156281.getClass(), "playSyncCount", -32576473);
        setIntField(term156281, term156281.getClass(), "winCount", 265606564);
        setIntField(term156281, term156281.getClass(), "helpCount", -96596021);
        setIntField(term156281, term156281.getClass(), "comboCount", -396078581);
        setIntField(term156281, term156281.getClass(), "feverCount", 663055983);
        setIntField(term156281, term156281.getClass(), "totalHiScore", 460058320);
        setIntField(term156281, term156281.getClass(), "totalEasyHighScore", 1623517509);
        setIntField(term156281, term156281.getClass(), "totalBasicHighScore", -1678059035);
        setIntField(term156281, term156281.getClass(), "totalAdvancedHighScore", -378502409);
        setIntField(term156281, term156281.getClass(), "totalExpertHighScore", 1237665417);
        setIntField(term156281, term156281.getClass(), "totalMasterHighScore", -2007749012);
        setIntField(term156281, term156281.getClass(), "totalReMasterHighScore", -1831523442);
        setIntField(term156281, term156281.getClass(), "totalHighSync", -1744615813);
        setIntField(term156281, term156281.getClass(), "totalEasySync", 697490560);
        setIntField(term156281, term156281.getClass(), "totalBasicSync", -1943433012);
        setIntField(term156281, term156281.getClass(), "totalAdvancedSync", 1824753250);
        setIntField(term156281, term156281.getClass(), "totalExpertSync", -1364300929);
        setIntField(term156281, term156281.getClass(), "totalMasterSync", -1297765151);
        setIntField(term156281, term156281.getClass(), "totalReMasterSync", -493427629);
        setIntField(term156281, term156281.getClass(), "playerRating", 683709231);
        setIntField(term156281, term156281.getClass(), "highestRating", 1295305054);
        setIntField(term156281, term156281.getClass(), "rankAuthTailId", 1051366361);
        setField(term156281, term156281.getClass(), "eventWatchedDate", "rkzpRpPNtv");
        setField(term156281, term156281.getClass(), "webLimitDate", "xWbVCwRARi");
        setIntField(term156281, term156281.getClass(), "challengeTrackPhase", 797415056);
        setIntField(term156281, term156281.getClass(), "firstPlayBits", -1395794593);
        setField(term156281, term156281.getClass(), "lastPlayDate", "WNZjPUZVwT");
        setIntField(term156281, term156281.getClass(), "lastPlaceId", 177293474);
        setField(term156281, term156281.getClass(), "lastPlaceName", "RrHlTUwGAK");
        setIntField(term156281, term156281.getClass(), "lastRegionId", -1663867560);
        setField(term156281, term156281.getClass(), "lastRegionName", "HnGWMIfZqD");
        setField(term156281, term156281.getClass(), "lastClientId", "wzcInEwTXc");
        setField(term156281, term156281.getClass(), "lastCountryCode", "GpvNlGeEJB");
        setIntField(term156281, term156281.getClass(), "eventPoint", 1871308062);
        setIntField(term156281, term156281.getClass(), "totalLv", 716978780);
        setIntField(term156281, term156281.getClass(), "lastLoginBonusDay", -211894122);
        setIntField(term156281, term156281.getClass(), "lastSurvivalBonusDay", 1368603928);
        setIntField(term156281, term156281.getClass(), "loginBonusLv", -2037348518);
        setField(term156279, term156279.getClass(), "user", term156281);
        setIntField(term156279, term156279.getClass(), "orderId", 1896399663);
        setLongField(term156279, term156279.getClass(), "sortNumber", 9069442033463962750L);
        setIntField(term156279, term156279.getClass(), "placeId", -613967334);
        setField(term156279, term156279.getClass(), "placeName", "qxFCCLLOPc");
        setField(term156279, term156279.getClass(), "country", "jRzPtIZZPq");
        setIntField(term156279, term156279.getClass(), "regionId", 1350650589);
        setField(term156279, term156279.getClass(), "playDate", "jWLMtLmajF");
        setField(term156279, term156279.getClass(), "userPlayDate", "yilQWbXHUb");
        setIntField(term156279, term156279.getClass(), "musicId", 1874378587);
        setIntField(term156279, term156279.getClass(), "level", 1851606122);
        setIntField(term156279, term156279.getClass(), "gameMode", -1643361354);
        setIntField(term156279, term156279.getClass(), "rivalNum", 904240893);
        setIntField(term156279, term156279.getClass(), "track", 1068238371);
        setIntField(term156279, term156279.getClass(), "eventId", -842184632);
        setBooleanField(term156279, term156279.getClass(), "isFreeToPlay", false);
        setIntField(term156279, term156279.getClass(), "playerRating", 210567920);
        setLongField(term156279, term156279.getClass(), "playedUserId1", 3575561499505653094L);
        setField(term156279, term156279.getClass(), "playedUserName1", "gVcKciUjfM");
        setIntField(term156279, term156279.getClass(), "playedMusicLevel1", -609764574);
        setLongField(term156279, term156279.getClass(), "playedUserId2", -4244720445894600013L);
        setField(term156279, term156279.getClass(), "playedUserName2", "QaVgtUzVJm");
        setIntField(term156279, term156279.getClass(), "playedMusicLevel2", 1358153489);
        setLongField(term156279, term156279.getClass(), "playedUserId3", 523156443226992560L);
        setField(term156279, term156279.getClass(), "playedUserName3", "siJZKpfTHw");
        setIntField(term156279, term156279.getClass(), "playedMusicLevel3", 2010586898);
        setIntField(term156279, term156279.getClass(), "achievement", 1026821857);
        setIntField(term156279, term156279.getClass(), "score", -1030821042);
        setIntField(term156279, term156279.getClass(), "tapScore", 1812520602);
        setIntField(term156279, term156279.getClass(), "holdScore", 1925351875);
        setIntField(term156279, term156279.getClass(), "slideScore", -1474043899);
        setIntField(term156279, term156279.getClass(), "breakScore", 423668511);
        setIntField(term156279, term156279.getClass(), "syncRate", -1555050440);
        setIntField(term156279, term156279.getClass(), "vsWin", 2053958383);
        setBooleanField(term156279, term156279.getClass(), "isAllPerfect", false);
        setIntField(term156279, term156279.getClass(), "fullCombo", 124039507);
        setIntField(term156279, term156279.getClass(), "maxFever", -1637246125);
        setIntField(term156279, term156279.getClass(), "maxCombo", 953018273);
        setIntField(term156279, term156279.getClass(), "tapPerfect", 1043145184);
        setIntField(term156279, term156279.getClass(), "tapGreat", -1527042419);
        setIntField(term156279, term156279.getClass(), "tapGood", 1732365199);
        setIntField(term156279, term156279.getClass(), "tapBad", -143476420);
        setIntField(term156279, term156279.getClass(), "holdPerfect", 1903653889);
        setIntField(term156279, term156279.getClass(), "holdGreat", -1802327080);
        setIntField(term156279, term156279.getClass(), "holdGood", -278569893);
        setIntField(term156279, term156279.getClass(), "holdBad", 1737799120);
        setIntField(term156279, term156279.getClass(), "slidePerfect", 1401694335);
        setIntField(term156279, term156279.getClass(), "slideGreat", 198886031);
        setIntField(term156279, term156279.getClass(), "slideGood", 1057406321);
        setIntField(term156279, term156279.getClass(), "slideBad", -1795766914);
        setIntField(term156279, term156279.getClass(), "breakPerfect", 2046933548);
        setIntField(term156279, term156279.getClass(), "breakGreat", 2120312659);
        setIntField(term156279, term156279.getClass(), "breakGood", 1762659383);
        setIntField(term156279, term156279.getClass(), "breakBad", 1469586929);
        setBooleanField(term156279, term156279.getClass(), "isTrackSkip", true);
        setBooleanField(term156279, term156279.getClass(), "isHighScore", true);
        setBooleanField(term156279, term156279.getClass(), "isChallengeTrack", true);
        setIntField(term156279, term156279.getClass(), "challengeLife", 463848359);
        setIntField(term156279, term156279.getClass(), "challengeRemain", 2091896166);
        setIntField(term156279, term156279.getClass(), "isAllPerfectPlus", -400730488);
        term156591 = new Integer(1190053843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term156591;
        callMethod(klass, "setSlideScore", argTypes, term156279, args);
    }

};


