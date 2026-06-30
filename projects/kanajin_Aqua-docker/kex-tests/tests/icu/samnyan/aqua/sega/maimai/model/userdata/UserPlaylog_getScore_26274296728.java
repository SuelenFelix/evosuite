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

public class UserPlaylog_getScore_26274296728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125607;

    public UserPlaylog_getScore_26274296728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term125613 = new Long(6273670659288205855L);
        term125607 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term125609 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term125611 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term125627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125632 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125637 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125642 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term125607, term125607.getClass(), "id", -142778328872192310L);
        setLongField(term125609, term125609.getClass(), "id", -7173990301200265783L);
        setLongField(term125611, term125611.getClass(), "id", -5523700551819095387L);
        setField(term125611, term125611.getClass(), "extId", term125613);
        setField(term125611, term125611.getClass(), "luid", "MsvgumOnks");
        setIntField(term125628, term125628.getClass(), "year", 2019);
        setShortField(term125628, term125628.getClass(), "month", (short) 7);
        setShortField(term125628, term125628.getClass(), "day", (short) 7);
        setField(term125627, term125627.getClass(), "date", term125628);
        setByteField(term125632, term125632.getClass(), "hour", (byte) 22);
        setByteField(term125632, term125632.getClass(), "minute", (byte) 43);
        setByteField(term125632, term125632.getClass(), "second", (byte) 9);
        setIntField(term125632, term125632.getClass(), "nano", 17138447);
        setField(term125627, term125627.getClass(), "time", term125632);
        setField(term125611, term125611.getClass(), "registerTime", term125627);
        setIntField(term125638, term125638.getClass(), "year", 2026);
        setShortField(term125638, term125638.getClass(), "month", (short) 5);
        setShortField(term125638, term125638.getClass(), "day", (short) 13);
        setField(term125637, term125637.getClass(), "date", term125638);
        setByteField(term125642, term125642.getClass(), "hour", (byte) 21);
        setByteField(term125642, term125642.getClass(), "minute", (byte) 41);
        setByteField(term125642, term125642.getClass(), "second", (byte) 14);
        setIntField(term125642, term125642.getClass(), "nano", 302456774);
        setField(term125637, term125637.getClass(), "time", term125642);
        setField(term125611, term125611.getClass(), "accessTime", term125637);
        setField(term125609, term125609.getClass(), "card", term125611);
        setIntField(term125609, term125609.getClass(), "lastDataVersion", 1307638203);
        setField(term125609, term125609.getClass(), "userName", "YMoZutGBzR");
        setIntField(term125609, term125609.getClass(), "point", 1624606138);
        setIntField(term125609, term125609.getClass(), "totalPoint", 1148154717);
        setIntField(term125609, term125609.getClass(), "iconId", 1743443237);
        setIntField(term125609, term125609.getClass(), "nameplateId", 1817003214);
        setIntField(term125609, term125609.getClass(), "frameId", 1718370872);
        setIntField(term125609, term125609.getClass(), "trophyId", 1587341901);
        setIntField(term125609, term125609.getClass(), "playCount", 1329288453);
        setIntField(term125609, term125609.getClass(), "playVsCount", -758711264);
        setIntField(term125609, term125609.getClass(), "playSyncCount", -1402801191);
        setIntField(term125609, term125609.getClass(), "winCount", -138841862);
        setIntField(term125609, term125609.getClass(), "helpCount", 1531550853);
        setIntField(term125609, term125609.getClass(), "comboCount", -1492283849);
        setIntField(term125609, term125609.getClass(), "feverCount", -1673304554);
        setIntField(term125609, term125609.getClass(), "totalHiScore", -620356333);
        setIntField(term125609, term125609.getClass(), "totalEasyHighScore", -157136506);
        setIntField(term125609, term125609.getClass(), "totalBasicHighScore", 2127767309);
        setIntField(term125609, term125609.getClass(), "totalAdvancedHighScore", -1632200201);
        setIntField(term125609, term125609.getClass(), "totalExpertHighScore", -192792309);
        setIntField(term125609, term125609.getClass(), "totalMasterHighScore", 1401858405);
        setIntField(term125609, term125609.getClass(), "totalReMasterHighScore", 1188383746);
        setIntField(term125609, term125609.getClass(), "totalHighSync", -1824758531);
        setIntField(term125609, term125609.getClass(), "totalEasySync", 1963639597);
        setIntField(term125609, term125609.getClass(), "totalBasicSync", -1743139715);
        setIntField(term125609, term125609.getClass(), "totalAdvancedSync", 104776467);
        setIntField(term125609, term125609.getClass(), "totalExpertSync", 847485505);
        setIntField(term125609, term125609.getClass(), "totalMasterSync", 202000883);
        setIntField(term125609, term125609.getClass(), "totalReMasterSync", 1666502127);
        setIntField(term125609, term125609.getClass(), "playerRating", 367278412);
        setIntField(term125609, term125609.getClass(), "highestRating", 465117660);
        setIntField(term125609, term125609.getClass(), "rankAuthTailId", -379995752);
        setField(term125609, term125609.getClass(), "eventWatchedDate", "BsupMZxOfn");
        setField(term125609, term125609.getClass(), "webLimitDate", "KWWTEtQZKa");
        setIntField(term125609, term125609.getClass(), "challengeTrackPhase", 1865503652);
        setIntField(term125609, term125609.getClass(), "firstPlayBits", -721396613);
        setField(term125609, term125609.getClass(), "lastPlayDate", "QRoYxbbXBu");
        setIntField(term125609, term125609.getClass(), "lastPlaceId", -1851350391);
        setField(term125609, term125609.getClass(), "lastPlaceName", "gGVmBWDOsX");
        setIntField(term125609, term125609.getClass(), "lastRegionId", 1793584876);
        setField(term125609, term125609.getClass(), "lastRegionName", "NktLacflHU");
        setField(term125609, term125609.getClass(), "lastClientId", "evgfwrURFw");
        setField(term125609, term125609.getClass(), "lastCountryCode", "fFCtsKLEIk");
        setIntField(term125609, term125609.getClass(), "eventPoint", 1110805139);
        setIntField(term125609, term125609.getClass(), "totalLv", -1909760986);
        setIntField(term125609, term125609.getClass(), "lastLoginBonusDay", -824204919);
        setIntField(term125609, term125609.getClass(), "lastSurvivalBonusDay", -1664670874);
        setIntField(term125609, term125609.getClass(), "loginBonusLv", -1094900929);
        setField(term125607, term125607.getClass(), "user", term125609);
        setIntField(term125607, term125607.getClass(), "orderId", 445973950);
        setLongField(term125607, term125607.getClass(), "sortNumber", -8614603287624597112L);
        setIntField(term125607, term125607.getClass(), "placeId", -758760250);
        setField(term125607, term125607.getClass(), "placeName", "VJiRAWIpQj");
        setField(term125607, term125607.getClass(), "country", "LurvjUHtJk");
        setIntField(term125607, term125607.getClass(), "regionId", -1801681281);
        setField(term125607, term125607.getClass(), "playDate", "OBilYfBQsT");
        setField(term125607, term125607.getClass(), "userPlayDate", "iNsUMLKPwV");
        setIntField(term125607, term125607.getClass(), "musicId", -2035346813);
        setIntField(term125607, term125607.getClass(), "level", 1313337363);
        setIntField(term125607, term125607.getClass(), "gameMode", 2048844603);
        setIntField(term125607, term125607.getClass(), "rivalNum", 1415551037);
        setIntField(term125607, term125607.getClass(), "track", 1254627985);
        setIntField(term125607, term125607.getClass(), "eventId", 2041539083);
        setBooleanField(term125607, term125607.getClass(), "isFreeToPlay", false);
        setIntField(term125607, term125607.getClass(), "playerRating", 528265106);
        setLongField(term125607, term125607.getClass(), "playedUserId1", -334717540353714793L);
        setField(term125607, term125607.getClass(), "playedUserName1", "gLfAVhVVRi");
        setIntField(term125607, term125607.getClass(), "playedMusicLevel1", 958142733);
        setLongField(term125607, term125607.getClass(), "playedUserId2", -57359230242997736L);
        setField(term125607, term125607.getClass(), "playedUserName2", "sfcitSKGGv");
        setIntField(term125607, term125607.getClass(), "playedMusicLevel2", 538337335);
        setLongField(term125607, term125607.getClass(), "playedUserId3", -7779928833373989299L);
        setField(term125607, term125607.getClass(), "playedUserName3", "sPFYXUJQhh");
        setIntField(term125607, term125607.getClass(), "playedMusicLevel3", 1778458766);
        setIntField(term125607, term125607.getClass(), "achievement", 1212565774);
        setIntField(term125607, term125607.getClass(), "score", 306356949);
        setIntField(term125607, term125607.getClass(), "tapScore", 1296207972);
        setIntField(term125607, term125607.getClass(), "holdScore", -1765363772);
        setIntField(term125607, term125607.getClass(), "slideScore", -1800573269);
        setIntField(term125607, term125607.getClass(), "breakScore", 843136842);
        setIntField(term125607, term125607.getClass(), "syncRate", -536389141);
        setIntField(term125607, term125607.getClass(), "vsWin", 1439863682);
        setBooleanField(term125607, term125607.getClass(), "isAllPerfect", false);
        setIntField(term125607, term125607.getClass(), "fullCombo", 837914754);
        setIntField(term125607, term125607.getClass(), "maxFever", 182357886);
        setIntField(term125607, term125607.getClass(), "maxCombo", -100647034);
        setIntField(term125607, term125607.getClass(), "tapPerfect", 1940859649);
        setIntField(term125607, term125607.getClass(), "tapGreat", 15211378);
        setIntField(term125607, term125607.getClass(), "tapGood", -60335940);
        setIntField(term125607, term125607.getClass(), "tapBad", -1627060708);
        setIntField(term125607, term125607.getClass(), "holdPerfect", -733101104);
        setIntField(term125607, term125607.getClass(), "holdGreat", -179610883);
        setIntField(term125607, term125607.getClass(), "holdGood", -1083733353);
        setIntField(term125607, term125607.getClass(), "holdBad", -422100154);
        setIntField(term125607, term125607.getClass(), "slidePerfect", 1638326283);
        setIntField(term125607, term125607.getClass(), "slideGreat", 2130384239);
        setIntField(term125607, term125607.getClass(), "slideGood", 1789203008);
        setIntField(term125607, term125607.getClass(), "slideBad", -1942237169);
        setIntField(term125607, term125607.getClass(), "breakPerfect", -1688458291);
        setIntField(term125607, term125607.getClass(), "breakGreat", 325600836);
        setIntField(term125607, term125607.getClass(), "breakGood", 1269042968);
        setIntField(term125607, term125607.getClass(), "breakBad", -1259199493);
        setBooleanField(term125607, term125607.getClass(), "isTrackSkip", true);
        setBooleanField(term125607, term125607.getClass(), "isHighScore", true);
        setBooleanField(term125607, term125607.getClass(), "isChallengeTrack", true);
        setIntField(term125607, term125607.getClass(), "challengeLife", 1451218402);
        setIntField(term125607, term125607.getClass(), "challengeRemain", -854091061);
        setIntField(term125607, term125607.getClass(), "isAllPerfectPlus", 744569990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term125607, args);
    }

};


