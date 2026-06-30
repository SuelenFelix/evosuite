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

public class UserPlaylog_setPlayedUserId1_86996268179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150057;
     Object term150369;

    public UserPlaylog_setPlayedUserId1_86996268179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term150063 = new Long(-3565554762799701668L);
        term150057 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term150059 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term150061 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term150077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150082 = newInstance(Class.forName("java.time.LocalTime"));
        Object term150087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150092 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term150057, term150057.getClass(), "id", -856690647211976135L);
        setLongField(term150059, term150059.getClass(), "id", 1872623849965712756L);
        setLongField(term150061, term150061.getClass(), "id", 4536273050817852892L);
        setField(term150061, term150061.getClass(), "extId", term150063);
        setField(term150061, term150061.getClass(), "luid", "ExvDwmtNdV");
        setIntField(term150078, term150078.getClass(), "year", 2024);
        setShortField(term150078, term150078.getClass(), "month", (short) 7);
        setShortField(term150078, term150078.getClass(), "day", (short) 15);
        setField(term150077, term150077.getClass(), "date", term150078);
        setByteField(term150082, term150082.getClass(), "hour", (byte) 14);
        setByteField(term150082, term150082.getClass(), "minute", (byte) 18);
        setByteField(term150082, term150082.getClass(), "second", (byte) 58);
        setIntField(term150082, term150082.getClass(), "nano", 537827095);
        setField(term150077, term150077.getClass(), "time", term150082);
        setField(term150061, term150061.getClass(), "registerTime", term150077);
        setIntField(term150088, term150088.getClass(), "year", 2025);
        setShortField(term150088, term150088.getClass(), "month", (short) 9);
        setShortField(term150088, term150088.getClass(), "day", (short) 18);
        setField(term150087, term150087.getClass(), "date", term150088);
        setByteField(term150092, term150092.getClass(), "hour", (byte) 9);
        setByteField(term150092, term150092.getClass(), "minute", (byte) 14);
        setByteField(term150092, term150092.getClass(), "second", (byte) 26);
        setIntField(term150092, term150092.getClass(), "nano", 567071659);
        setField(term150087, term150087.getClass(), "time", term150092);
        setField(term150061, term150061.getClass(), "accessTime", term150087);
        setField(term150059, term150059.getClass(), "card", term150061);
        setIntField(term150059, term150059.getClass(), "lastDataVersion", -203724985);
        setField(term150059, term150059.getClass(), "userName", "MmhamxEBqw");
        setIntField(term150059, term150059.getClass(), "point", 621459082);
        setIntField(term150059, term150059.getClass(), "totalPoint", -1797826981);
        setIntField(term150059, term150059.getClass(), "iconId", -2145638062);
        setIntField(term150059, term150059.getClass(), "nameplateId", 1761020170);
        setIntField(term150059, term150059.getClass(), "frameId", 290454495);
        setIntField(term150059, term150059.getClass(), "trophyId", 35758240);
        setIntField(term150059, term150059.getClass(), "playCount", 1342022187);
        setIntField(term150059, term150059.getClass(), "playVsCount", 662806790);
        setIntField(term150059, term150059.getClass(), "playSyncCount", -530470841);
        setIntField(term150059, term150059.getClass(), "winCount", 184595024);
        setIntField(term150059, term150059.getClass(), "helpCount", -394012312);
        setIntField(term150059, term150059.getClass(), "comboCount", 943033369);
        setIntField(term150059, term150059.getClass(), "feverCount", -1081096314);
        setIntField(term150059, term150059.getClass(), "totalHiScore", 136764993);
        setIntField(term150059, term150059.getClass(), "totalEasyHighScore", 700236321);
        setIntField(term150059, term150059.getClass(), "totalBasicHighScore", 1622185751);
        setIntField(term150059, term150059.getClass(), "totalAdvancedHighScore", -465468962);
        setIntField(term150059, term150059.getClass(), "totalExpertHighScore", 1720118518);
        setIntField(term150059, term150059.getClass(), "totalMasterHighScore", 1426454559);
        setIntField(term150059, term150059.getClass(), "totalReMasterHighScore", -537812530);
        setIntField(term150059, term150059.getClass(), "totalHighSync", 1838750916);
        setIntField(term150059, term150059.getClass(), "totalEasySync", -793108156);
        setIntField(term150059, term150059.getClass(), "totalBasicSync", -724037199);
        setIntField(term150059, term150059.getClass(), "totalAdvancedSync", 1927212612);
        setIntField(term150059, term150059.getClass(), "totalExpertSync", 126538454);
        setIntField(term150059, term150059.getClass(), "totalMasterSync", -760257737);
        setIntField(term150059, term150059.getClass(), "totalReMasterSync", -1860912448);
        setIntField(term150059, term150059.getClass(), "playerRating", -1270112190);
        setIntField(term150059, term150059.getClass(), "highestRating", -1015761141);
        setIntField(term150059, term150059.getClass(), "rankAuthTailId", 342340917);
        setField(term150059, term150059.getClass(), "eventWatchedDate", "heEXeIaieQ");
        setField(term150059, term150059.getClass(), "webLimitDate", "MhsNUxKgPP");
        setIntField(term150059, term150059.getClass(), "challengeTrackPhase", 2008214817);
        setIntField(term150059, term150059.getClass(), "firstPlayBits", -833146603);
        setField(term150059, term150059.getClass(), "lastPlayDate", "cGLyrLlynk");
        setIntField(term150059, term150059.getClass(), "lastPlaceId", 276109099);
        setField(term150059, term150059.getClass(), "lastPlaceName", "mMpSzaWkTz");
        setIntField(term150059, term150059.getClass(), "lastRegionId", 237131620);
        setField(term150059, term150059.getClass(), "lastRegionName", "leDgyXJudi");
        setField(term150059, term150059.getClass(), "lastClientId", "YgSDrWcUog");
        setField(term150059, term150059.getClass(), "lastCountryCode", "GnJMoyfrTK");
        setIntField(term150059, term150059.getClass(), "eventPoint", 864410154);
        setIntField(term150059, term150059.getClass(), "totalLv", -1352017005);
        setIntField(term150059, term150059.getClass(), "lastLoginBonusDay", 530583938);
        setIntField(term150059, term150059.getClass(), "lastSurvivalBonusDay", -241353399);
        setIntField(term150059, term150059.getClass(), "loginBonusLv", 294672775);
        setField(term150057, term150057.getClass(), "user", term150059);
        setIntField(term150057, term150057.getClass(), "orderId", -1480768420);
        setLongField(term150057, term150057.getClass(), "sortNumber", -8877453128191451125L);
        setIntField(term150057, term150057.getClass(), "placeId", -720612912);
        setField(term150057, term150057.getClass(), "placeName", "sDreXejQef");
        setField(term150057, term150057.getClass(), "country", "hKwivnVeCZ");
        setIntField(term150057, term150057.getClass(), "regionId", -2026587727);
        setField(term150057, term150057.getClass(), "playDate", "fvxDfGibVS");
        setField(term150057, term150057.getClass(), "userPlayDate", "xlERWkGbKr");
        setIntField(term150057, term150057.getClass(), "musicId", -903876274);
        setIntField(term150057, term150057.getClass(), "level", 496034401);
        setIntField(term150057, term150057.getClass(), "gameMode", 1773808003);
        setIntField(term150057, term150057.getClass(), "rivalNum", 620201172);
        setIntField(term150057, term150057.getClass(), "track", -1828205745);
        setIntField(term150057, term150057.getClass(), "eventId", 1243474858);
        setBooleanField(term150057, term150057.getClass(), "isFreeToPlay", true);
        setIntField(term150057, term150057.getClass(), "playerRating", 1121416999);
        setLongField(term150057, term150057.getClass(), "playedUserId1", -7419533263156606680L);
        setField(term150057, term150057.getClass(), "playedUserName1", "QvJNEroCUL");
        setIntField(term150057, term150057.getClass(), "playedMusicLevel1", 1332904118);
        setLongField(term150057, term150057.getClass(), "playedUserId2", -6669304009215553269L);
        setField(term150057, term150057.getClass(), "playedUserName2", "CpfLVqPiil");
        setIntField(term150057, term150057.getClass(), "playedMusicLevel2", 1829055409);
        setLongField(term150057, term150057.getClass(), "playedUserId3", 8850925698448189827L);
        setField(term150057, term150057.getClass(), "playedUserName3", "LmFOclAgbf");
        setIntField(term150057, term150057.getClass(), "playedMusicLevel3", 408341075);
        setIntField(term150057, term150057.getClass(), "achievement", 605425949);
        setIntField(term150057, term150057.getClass(), "score", 1112137680);
        setIntField(term150057, term150057.getClass(), "tapScore", -1126417222);
        setIntField(term150057, term150057.getClass(), "holdScore", -189112873);
        setIntField(term150057, term150057.getClass(), "slideScore", -1678661750);
        setIntField(term150057, term150057.getClass(), "breakScore", -1209298448);
        setIntField(term150057, term150057.getClass(), "syncRate", -1168817171);
        setIntField(term150057, term150057.getClass(), "vsWin", -750547824);
        setBooleanField(term150057, term150057.getClass(), "isAllPerfect", true);
        setIntField(term150057, term150057.getClass(), "fullCombo", 1696420242);
        setIntField(term150057, term150057.getClass(), "maxFever", 369171292);
        setIntField(term150057, term150057.getClass(), "maxCombo", 825201753);
        setIntField(term150057, term150057.getClass(), "tapPerfect", -637408898);
        setIntField(term150057, term150057.getClass(), "tapGreat", -148883002);
        setIntField(term150057, term150057.getClass(), "tapGood", 1443183165);
        setIntField(term150057, term150057.getClass(), "tapBad", 731959855);
        setIntField(term150057, term150057.getClass(), "holdPerfect", -193957305);
        setIntField(term150057, term150057.getClass(), "holdGreat", -726917670);
        setIntField(term150057, term150057.getClass(), "holdGood", -389808581);
        setIntField(term150057, term150057.getClass(), "holdBad", -397649002);
        setIntField(term150057, term150057.getClass(), "slidePerfect", 1366010238);
        setIntField(term150057, term150057.getClass(), "slideGreat", 2007995803);
        setIntField(term150057, term150057.getClass(), "slideGood", -1496172956);
        setIntField(term150057, term150057.getClass(), "slideBad", -1878529349);
        setIntField(term150057, term150057.getClass(), "breakPerfect", 871928103);
        setIntField(term150057, term150057.getClass(), "breakGreat", 1691440415);
        setIntField(term150057, term150057.getClass(), "breakGood", -109881007);
        setIntField(term150057, term150057.getClass(), "breakBad", 1736426795);
        setBooleanField(term150057, term150057.getClass(), "isTrackSkip", true);
        setBooleanField(term150057, term150057.getClass(), "isHighScore", false);
        setBooleanField(term150057, term150057.getClass(), "isChallengeTrack", false);
        setIntField(term150057, term150057.getClass(), "challengeLife", 304236922);
        setIntField(term150057, term150057.getClass(), "challengeRemain", -1054810563);
        setIntField(term150057, term150057.getClass(), "isAllPerfectPlus", -2060235893);
        term150369 = new Long(-2444680017884853722L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term150369;
        callMethod(klass, "setPlayedUserId1", argTypes, term150057, args);
    }

};


