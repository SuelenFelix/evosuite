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

public class UserPlaylog_setBreakGreat_1533067871113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3992599;
     Object term3992911;

    public UserPlaylog_setBreakGreat_1533067871113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3992605 = new Long(-6686996941069004372L);
        term3992599 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3992601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3992603 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3992619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3992620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3992624 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3992629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3992630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3992634 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3992599, term3992599.getClass(), "id", -3072667885935311504L);
        setLongField(term3992601, term3992601.getClass(), "id", 6401050364379333427L);
        setLongField(term3992603, term3992603.getClass(), "id", 5851896565290201609L);
        setField(term3992603, term3992603.getClass(), "extId", term3992605);
        setField(term3992603, term3992603.getClass(), "luid", "OqtckzqJba");
        setIntField(term3992620, term3992620.getClass(), "year", 2028);
        setShortField(term3992620, term3992620.getClass(), "month", (short) 7);
        setShortField(term3992620, term3992620.getClass(), "day", (short) 3);
        setField(term3992619, term3992619.getClass(), "date", term3992620);
        setByteField(term3992624, term3992624.getClass(), "hour", (byte) 17);
        setByteField(term3992624, term3992624.getClass(), "minute", (byte) 26);
        setByteField(term3992624, term3992624.getClass(), "second", (byte) 34);
        setIntField(term3992624, term3992624.getClass(), "nano", 342739998);
        setField(term3992619, term3992619.getClass(), "time", term3992624);
        setField(term3992603, term3992603.getClass(), "registerTime", term3992619);
        setIntField(term3992630, term3992630.getClass(), "year", 2012);
        setShortField(term3992630, term3992630.getClass(), "month", (short) 10);
        setShortField(term3992630, term3992630.getClass(), "day", (short) 10);
        setField(term3992629, term3992629.getClass(), "date", term3992630);
        setByteField(term3992634, term3992634.getClass(), "hour", (byte) 19);
        setByteField(term3992634, term3992634.getClass(), "minute", (byte) 53);
        setByteField(term3992634, term3992634.getClass(), "second", (byte) 59);
        setIntField(term3992634, term3992634.getClass(), "nano", 750438087);
        setField(term3992629, term3992629.getClass(), "time", term3992634);
        setField(term3992603, term3992603.getClass(), "accessTime", term3992629);
        setField(term3992601, term3992601.getClass(), "card", term3992603);
        setIntField(term3992601, term3992601.getClass(), "lastDataVersion", 592515349);
        setField(term3992601, term3992601.getClass(), "userName", "ygtDKiGOwT");
        setIntField(term3992601, term3992601.getClass(), "point", 1159266011);
        setIntField(term3992601, term3992601.getClass(), "totalPoint", 1894825528);
        setIntField(term3992601, term3992601.getClass(), "iconId", 549282240);
        setIntField(term3992601, term3992601.getClass(), "nameplateId", -1303099365);
        setIntField(term3992601, term3992601.getClass(), "frameId", -1577362167);
        setIntField(term3992601, term3992601.getClass(), "trophyId", -254699316);
        setIntField(term3992601, term3992601.getClass(), "playCount", -689148623);
        setIntField(term3992601, term3992601.getClass(), "playVsCount", 315230759);
        setIntField(term3992601, term3992601.getClass(), "playSyncCount", 1776249884);
        setIntField(term3992601, term3992601.getClass(), "winCount", 1869427222);
        setIntField(term3992601, term3992601.getClass(), "helpCount", 1328942000);
        setIntField(term3992601, term3992601.getClass(), "comboCount", -295343976);
        setIntField(term3992601, term3992601.getClass(), "feverCount", 585249772);
        setIntField(term3992601, term3992601.getClass(), "totalHiScore", 914546246);
        setIntField(term3992601, term3992601.getClass(), "totalEasyHighScore", 783968154);
        setIntField(term3992601, term3992601.getClass(), "totalBasicHighScore", -1437258905);
        setIntField(term3992601, term3992601.getClass(), "totalAdvancedHighScore", -945673455);
        setIntField(term3992601, term3992601.getClass(), "totalExpertHighScore", -2060856607);
        setIntField(term3992601, term3992601.getClass(), "totalMasterHighScore", -1491363164);
        setIntField(term3992601, term3992601.getClass(), "totalReMasterHighScore", 1725503865);
        setIntField(term3992601, term3992601.getClass(), "totalHighSync", 1044019880);
        setIntField(term3992601, term3992601.getClass(), "totalEasySync", 1751062849);
        setIntField(term3992601, term3992601.getClass(), "totalBasicSync", 1303519554);
        setIntField(term3992601, term3992601.getClass(), "totalAdvancedSync", -663555532);
        setIntField(term3992601, term3992601.getClass(), "totalExpertSync", 1053309527);
        setIntField(term3992601, term3992601.getClass(), "totalMasterSync", 1633399872);
        setIntField(term3992601, term3992601.getClass(), "totalReMasterSync", 772448333);
        setIntField(term3992601, term3992601.getClass(), "playerRating", -1842025388);
        setIntField(term3992601, term3992601.getClass(), "highestRating", 1077471373);
        setIntField(term3992601, term3992601.getClass(), "rankAuthTailId", -1875186384);
        setField(term3992601, term3992601.getClass(), "eventWatchedDate", "rAHMVVAnXH");
        setField(term3992601, term3992601.getClass(), "webLimitDate", "NTqoGyLVmM");
        setIntField(term3992601, term3992601.getClass(), "challengeTrackPhase", -456662817);
        setIntField(term3992601, term3992601.getClass(), "firstPlayBits", 1853410815);
        setField(term3992601, term3992601.getClass(), "lastPlayDate", "exrLOJGJAR");
        setIntField(term3992601, term3992601.getClass(), "lastPlaceId", 408003342);
        setField(term3992601, term3992601.getClass(), "lastPlaceName", "RXuFHjFfYQ");
        setIntField(term3992601, term3992601.getClass(), "lastRegionId", -444335091);
        setField(term3992601, term3992601.getClass(), "lastRegionName", "CgmebKcFGY");
        setField(term3992601, term3992601.getClass(), "lastClientId", "GoAOCfAdOC");
        setField(term3992601, term3992601.getClass(), "lastCountryCode", "JjuVyERglQ");
        setIntField(term3992601, term3992601.getClass(), "eventPoint", -1941035391);
        setIntField(term3992601, term3992601.getClass(), "totalLv", -462949866);
        setIntField(term3992601, term3992601.getClass(), "lastLoginBonusDay", 1557324718);
        setIntField(term3992601, term3992601.getClass(), "lastSurvivalBonusDay", -1767276811);
        setIntField(term3992601, term3992601.getClass(), "loginBonusLv", -1823784056);
        setField(term3992599, term3992599.getClass(), "user", term3992601);
        setIntField(term3992599, term3992599.getClass(), "orderId", 644730573);
        setLongField(term3992599, term3992599.getClass(), "sortNumber", -4020991937868791899L);
        setIntField(term3992599, term3992599.getClass(), "placeId", -1483422372);
        setField(term3992599, term3992599.getClass(), "placeName", "wkdUDBmZZH");
        setField(term3992599, term3992599.getClass(), "country", "xgLEEUQIXX");
        setIntField(term3992599, term3992599.getClass(), "regionId", -1681623848);
        setField(term3992599, term3992599.getClass(), "playDate", "gkGnPNJOKU");
        setField(term3992599, term3992599.getClass(), "userPlayDate", "bwVPaxfPiI");
        setIntField(term3992599, term3992599.getClass(), "musicId", 2021724091);
        setIntField(term3992599, term3992599.getClass(), "level", -1791766147);
        setIntField(term3992599, term3992599.getClass(), "gameMode", 1387533666);
        setIntField(term3992599, term3992599.getClass(), "rivalNum", 787984235);
        setIntField(term3992599, term3992599.getClass(), "track", 91104569);
        setIntField(term3992599, term3992599.getClass(), "eventId", 761177016);
        setBooleanField(term3992599, term3992599.getClass(), "isFreeToPlay", false);
        setIntField(term3992599, term3992599.getClass(), "playerRating", 1151907050);
        setLongField(term3992599, term3992599.getClass(), "playedUserId1", 7509289190714648661L);
        setField(term3992599, term3992599.getClass(), "playedUserName1", "bxcmQczMxh");
        setIntField(term3992599, term3992599.getClass(), "playedMusicLevel1", 725872737);
        setLongField(term3992599, term3992599.getClass(), "playedUserId2", -2146807084480147202L);
        setField(term3992599, term3992599.getClass(), "playedUserName2", "oLbbrGkySP");
        setIntField(term3992599, term3992599.getClass(), "playedMusicLevel2", 1154156441);
        setLongField(term3992599, term3992599.getClass(), "playedUserId3", -8247529832276013964L);
        setField(term3992599, term3992599.getClass(), "playedUserName3", "IuFtPwvunQ");
        setIntField(term3992599, term3992599.getClass(), "playedMusicLevel3", 959589790);
        setIntField(term3992599, term3992599.getClass(), "achievement", -358478141);
        setIntField(term3992599, term3992599.getClass(), "score", 1080305117);
        setIntField(term3992599, term3992599.getClass(), "tapScore", -930080429);
        setIntField(term3992599, term3992599.getClass(), "holdScore", 1807935854);
        setIntField(term3992599, term3992599.getClass(), "slideScore", -2112969371);
        setIntField(term3992599, term3992599.getClass(), "breakScore", 1858894369);
        setIntField(term3992599, term3992599.getClass(), "syncRate", 798688093);
        setIntField(term3992599, term3992599.getClass(), "vsWin", 649092191);
        setBooleanField(term3992599, term3992599.getClass(), "isAllPerfect", true);
        setIntField(term3992599, term3992599.getClass(), "fullCombo", -1929380558);
        setIntField(term3992599, term3992599.getClass(), "maxFever", 1230908043);
        setIntField(term3992599, term3992599.getClass(), "maxCombo", 1934652185);
        setIntField(term3992599, term3992599.getClass(), "tapPerfect", -1630680912);
        setIntField(term3992599, term3992599.getClass(), "tapGreat", -2140379394);
        setIntField(term3992599, term3992599.getClass(), "tapGood", 1829591490);
        setIntField(term3992599, term3992599.getClass(), "tapBad", -1274981779);
        setIntField(term3992599, term3992599.getClass(), "holdPerfect", -858034946);
        setIntField(term3992599, term3992599.getClass(), "holdGreat", -345739567);
        setIntField(term3992599, term3992599.getClass(), "holdGood", 1221939500);
        setIntField(term3992599, term3992599.getClass(), "holdBad", -1113006541);
        setIntField(term3992599, term3992599.getClass(), "slidePerfect", 381936853);
        setIntField(term3992599, term3992599.getClass(), "slideGreat", 191492843);
        setIntField(term3992599, term3992599.getClass(), "slideGood", 892003747);
        setIntField(term3992599, term3992599.getClass(), "slideBad", -1207222572);
        setIntField(term3992599, term3992599.getClass(), "breakPerfect", -1191805304);
        setIntField(term3992599, term3992599.getClass(), "breakGreat", -931977465);
        setIntField(term3992599, term3992599.getClass(), "breakGood", 1893987175);
        setIntField(term3992599, term3992599.getClass(), "breakBad", -1416460497);
        setBooleanField(term3992599, term3992599.getClass(), "isTrackSkip", false);
        setBooleanField(term3992599, term3992599.getClass(), "isHighScore", false);
        setBooleanField(term3992599, term3992599.getClass(), "isChallengeTrack", true);
        setIntField(term3992599, term3992599.getClass(), "challengeLife", -1750033852);
        setIntField(term3992599, term3992599.getClass(), "challengeRemain", -1157363740);
        setIntField(term3992599, term3992599.getClass(), "isAllPerfectPlus", -1920588459);
        term3992911 = new Integer(566377918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3992911;
        callMethod(klass, "setBreakGreat", argTypes, term3992599, args);
    }

};


