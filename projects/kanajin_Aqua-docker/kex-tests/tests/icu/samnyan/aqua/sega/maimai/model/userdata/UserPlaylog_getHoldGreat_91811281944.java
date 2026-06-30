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

public class UserPlaylog_getHoldGreat_91811281944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133159;

    public UserPlaylog_getHoldGreat_91811281944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term133165 = new Long(-8211859616692114655L);
        term133159 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term133161 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term133163 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term133179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133184 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133194 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term133159, term133159.getClass(), "id", 6700719103019158902L);
        setLongField(term133161, term133161.getClass(), "id", 4224749228659425276L);
        setLongField(term133163, term133163.getClass(), "id", 8435776473049430167L);
        setField(term133163, term133163.getClass(), "extId", term133165);
        setField(term133163, term133163.getClass(), "luid", "VogiBHEnKP");
        setIntField(term133180, term133180.getClass(), "year", 2014);
        setShortField(term133180, term133180.getClass(), "month", (short) 12);
        setShortField(term133180, term133180.getClass(), "day", (short) 10);
        setField(term133179, term133179.getClass(), "date", term133180);
        setByteField(term133184, term133184.getClass(), "hour", (byte) 0);
        setByteField(term133184, term133184.getClass(), "minute", (byte) 19);
        setByteField(term133184, term133184.getClass(), "second", (byte) 30);
        setIntField(term133184, term133184.getClass(), "nano", 874948769);
        setField(term133179, term133179.getClass(), "time", term133184);
        setField(term133163, term133163.getClass(), "registerTime", term133179);
        setIntField(term133190, term133190.getClass(), "year", 2016);
        setShortField(term133190, term133190.getClass(), "month", (short) 1);
        setShortField(term133190, term133190.getClass(), "day", (short) 29);
        setField(term133189, term133189.getClass(), "date", term133190);
        setByteField(term133194, term133194.getClass(), "hour", (byte) 12);
        setByteField(term133194, term133194.getClass(), "minute", (byte) 41);
        setByteField(term133194, term133194.getClass(), "second", (byte) 10);
        setIntField(term133194, term133194.getClass(), "nano", 153443383);
        setField(term133189, term133189.getClass(), "time", term133194);
        setField(term133163, term133163.getClass(), "accessTime", term133189);
        setField(term133161, term133161.getClass(), "card", term133163);
        setIntField(term133161, term133161.getClass(), "lastDataVersion", -1386981120);
        setField(term133161, term133161.getClass(), "userName", "PCeXUuZyQa");
        setIntField(term133161, term133161.getClass(), "point", 1663576476);
        setIntField(term133161, term133161.getClass(), "totalPoint", 2099451652);
        setIntField(term133161, term133161.getClass(), "iconId", 625456249);
        setIntField(term133161, term133161.getClass(), "nameplateId", 1362447449);
        setIntField(term133161, term133161.getClass(), "frameId", -933803674);
        setIntField(term133161, term133161.getClass(), "trophyId", -1916802044);
        setIntField(term133161, term133161.getClass(), "playCount", 2096433637);
        setIntField(term133161, term133161.getClass(), "playVsCount", 2092295726);
        setIntField(term133161, term133161.getClass(), "playSyncCount", -1325848090);
        setIntField(term133161, term133161.getClass(), "winCount", -275376863);
        setIntField(term133161, term133161.getClass(), "helpCount", 1486576583);
        setIntField(term133161, term133161.getClass(), "comboCount", 1196365284);
        setIntField(term133161, term133161.getClass(), "feverCount", -1296052345);
        setIntField(term133161, term133161.getClass(), "totalHiScore", -1741342336);
        setIntField(term133161, term133161.getClass(), "totalEasyHighScore", 144712107);
        setIntField(term133161, term133161.getClass(), "totalBasicHighScore", -348432573);
        setIntField(term133161, term133161.getClass(), "totalAdvancedHighScore", -790220684);
        setIntField(term133161, term133161.getClass(), "totalExpertHighScore", -1136429703);
        setIntField(term133161, term133161.getClass(), "totalMasterHighScore", 1641910855);
        setIntField(term133161, term133161.getClass(), "totalReMasterHighScore", -931705492);
        setIntField(term133161, term133161.getClass(), "totalHighSync", -1080465792);
        setIntField(term133161, term133161.getClass(), "totalEasySync", -1135972176);
        setIntField(term133161, term133161.getClass(), "totalBasicSync", -2059730428);
        setIntField(term133161, term133161.getClass(), "totalAdvancedSync", -549676791);
        setIntField(term133161, term133161.getClass(), "totalExpertSync", -156722358);
        setIntField(term133161, term133161.getClass(), "totalMasterSync", 284639590);
        setIntField(term133161, term133161.getClass(), "totalReMasterSync", 1183720893);
        setIntField(term133161, term133161.getClass(), "playerRating", -2070454841);
        setIntField(term133161, term133161.getClass(), "highestRating", -1979379044);
        setIntField(term133161, term133161.getClass(), "rankAuthTailId", -819678964);
        setField(term133161, term133161.getClass(), "eventWatchedDate", "uencoVszfi");
        setField(term133161, term133161.getClass(), "webLimitDate", "PfneRKTZrA");
        setIntField(term133161, term133161.getClass(), "challengeTrackPhase", 789003717);
        setIntField(term133161, term133161.getClass(), "firstPlayBits", -1194710271);
        setField(term133161, term133161.getClass(), "lastPlayDate", "LTQEgDpWsr");
        setIntField(term133161, term133161.getClass(), "lastPlaceId", 1397618451);
        setField(term133161, term133161.getClass(), "lastPlaceName", "SzvLbLIVwG");
        setIntField(term133161, term133161.getClass(), "lastRegionId", -781404647);
        setField(term133161, term133161.getClass(), "lastRegionName", "mKnmYOhILq");
        setField(term133161, term133161.getClass(), "lastClientId", "YXXfMygQcG");
        setField(term133161, term133161.getClass(), "lastCountryCode", "sQAHuaiApa");
        setIntField(term133161, term133161.getClass(), "eventPoint", 184970542);
        setIntField(term133161, term133161.getClass(), "totalLv", -1573176387);
        setIntField(term133161, term133161.getClass(), "lastLoginBonusDay", -46543611);
        setIntField(term133161, term133161.getClass(), "lastSurvivalBonusDay", -210290916);
        setIntField(term133161, term133161.getClass(), "loginBonusLv", 475578696);
        setField(term133159, term133159.getClass(), "user", term133161);
        setIntField(term133159, term133159.getClass(), "orderId", 736182747);
        setLongField(term133159, term133159.getClass(), "sortNumber", -8317622314014853309L);
        setIntField(term133159, term133159.getClass(), "placeId", -1570132066);
        setField(term133159, term133159.getClass(), "placeName", "xDMxegGKqV");
        setField(term133159, term133159.getClass(), "country", "zPKOGLLGZN");
        setIntField(term133159, term133159.getClass(), "regionId", 269052692);
        setField(term133159, term133159.getClass(), "playDate", "lajHHsoSDZ");
        setField(term133159, term133159.getClass(), "userPlayDate", "YdUxGeeDjc");
        setIntField(term133159, term133159.getClass(), "musicId", -1128288920);
        setIntField(term133159, term133159.getClass(), "level", 47526027);
        setIntField(term133159, term133159.getClass(), "gameMode", -78594996);
        setIntField(term133159, term133159.getClass(), "rivalNum", 792357631);
        setIntField(term133159, term133159.getClass(), "track", -779223318);
        setIntField(term133159, term133159.getClass(), "eventId", 1058126335);
        setBooleanField(term133159, term133159.getClass(), "isFreeToPlay", false);
        setIntField(term133159, term133159.getClass(), "playerRating", 1016877148);
        setLongField(term133159, term133159.getClass(), "playedUserId1", -5603191204578376681L);
        setField(term133159, term133159.getClass(), "playedUserName1", "TbgzoLhCKy");
        setIntField(term133159, term133159.getClass(), "playedMusicLevel1", -345585488);
        setLongField(term133159, term133159.getClass(), "playedUserId2", -2371876403222577001L);
        setField(term133159, term133159.getClass(), "playedUserName2", "MXAuemWmBo");
        setIntField(term133159, term133159.getClass(), "playedMusicLevel2", -2075030152);
        setLongField(term133159, term133159.getClass(), "playedUserId3", -876052271222651071L);
        setField(term133159, term133159.getClass(), "playedUserName3", "IEbHsgLKBk");
        setIntField(term133159, term133159.getClass(), "playedMusicLevel3", -289377183);
        setIntField(term133159, term133159.getClass(), "achievement", 1596980453);
        setIntField(term133159, term133159.getClass(), "score", 46546661);
        setIntField(term133159, term133159.getClass(), "tapScore", 1714498443);
        setIntField(term133159, term133159.getClass(), "holdScore", -1124083193);
        setIntField(term133159, term133159.getClass(), "slideScore", 1318212836);
        setIntField(term133159, term133159.getClass(), "breakScore", 505663128);
        setIntField(term133159, term133159.getClass(), "syncRate", 1478138673);
        setIntField(term133159, term133159.getClass(), "vsWin", -1274242843);
        setBooleanField(term133159, term133159.getClass(), "isAllPerfect", false);
        setIntField(term133159, term133159.getClass(), "fullCombo", -1999242840);
        setIntField(term133159, term133159.getClass(), "maxFever", 1818877333);
        setIntField(term133159, term133159.getClass(), "maxCombo", 827624209);
        setIntField(term133159, term133159.getClass(), "tapPerfect", 174843203);
        setIntField(term133159, term133159.getClass(), "tapGreat", -706967184);
        setIntField(term133159, term133159.getClass(), "tapGood", 62466636);
        setIntField(term133159, term133159.getClass(), "tapBad", 1422188460);
        setIntField(term133159, term133159.getClass(), "holdPerfect", 1515963311);
        setIntField(term133159, term133159.getClass(), "holdGreat", -1987619758);
        setIntField(term133159, term133159.getClass(), "holdGood", 1289398504);
        setIntField(term133159, term133159.getClass(), "holdBad", -478425883);
        setIntField(term133159, term133159.getClass(), "slidePerfect", 497647155);
        setIntField(term133159, term133159.getClass(), "slideGreat", 256113501);
        setIntField(term133159, term133159.getClass(), "slideGood", -1303798368);
        setIntField(term133159, term133159.getClass(), "slideBad", 1964540866);
        setIntField(term133159, term133159.getClass(), "breakPerfect", -849495861);
        setIntField(term133159, term133159.getClass(), "breakGreat", 1939955202);
        setIntField(term133159, term133159.getClass(), "breakGood", -1844148148);
        setIntField(term133159, term133159.getClass(), "breakBad", -1398507404);
        setBooleanField(term133159, term133159.getClass(), "isTrackSkip", false);
        setBooleanField(term133159, term133159.getClass(), "isHighScore", true);
        setBooleanField(term133159, term133159.getClass(), "isChallengeTrack", false);
        setIntField(term133159, term133159.getClass(), "challengeLife", 1202772241);
        setIntField(term133159, term133159.getClass(), "challengeRemain", 343636399);
        setIntField(term133159, term133159.getClass(), "isAllPerfectPlus", 245937466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldGreat", argTypes, term133159, args);
    }

};


