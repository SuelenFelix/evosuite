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

public class UserPlaylog_getLevel_159147311111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117583;

    public UserPlaylog_getLevel_159147311111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term117589 = new Long(-8306611953768020559L);
        term117583 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term117585 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term117587 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term117603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117608 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117618 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term117583, term117583.getClass(), "id", 7426144489061842120L);
        setLongField(term117585, term117585.getClass(), "id", -7501037219137334101L);
        setLongField(term117587, term117587.getClass(), "id", -5898738968422709494L);
        setField(term117587, term117587.getClass(), "extId", term117589);
        setField(term117587, term117587.getClass(), "luid", "QDGurdhyNf");
        setIntField(term117604, term117604.getClass(), "year", 2027);
        setShortField(term117604, term117604.getClass(), "month", (short) 2);
        setShortField(term117604, term117604.getClass(), "day", (short) 11);
        setField(term117603, term117603.getClass(), "date", term117604);
        setByteField(term117608, term117608.getClass(), "hour", (byte) 8);
        setByteField(term117608, term117608.getClass(), "minute", (byte) 5);
        setByteField(term117608, term117608.getClass(), "second", (byte) 22);
        setIntField(term117608, term117608.getClass(), "nano", 32017661);
        setField(term117603, term117603.getClass(), "time", term117608);
        setField(term117587, term117587.getClass(), "registerTime", term117603);
        setIntField(term117614, term117614.getClass(), "year", 2025);
        setShortField(term117614, term117614.getClass(), "month", (short) 9);
        setShortField(term117614, term117614.getClass(), "day", (short) 24);
        setField(term117613, term117613.getClass(), "date", term117614);
        setByteField(term117618, term117618.getClass(), "hour", (byte) 4);
        setByteField(term117618, term117618.getClass(), "minute", (byte) 49);
        setByteField(term117618, term117618.getClass(), "second", (byte) 51);
        setIntField(term117618, term117618.getClass(), "nano", 103885357);
        setField(term117613, term117613.getClass(), "time", term117618);
        setField(term117587, term117587.getClass(), "accessTime", term117613);
        setField(term117585, term117585.getClass(), "card", term117587);
        setIntField(term117585, term117585.getClass(), "lastDataVersion", 542595949);
        setField(term117585, term117585.getClass(), "userName", "FnxmVYYBUu");
        setIntField(term117585, term117585.getClass(), "point", -2127757374);
        setIntField(term117585, term117585.getClass(), "totalPoint", -1843693519);
        setIntField(term117585, term117585.getClass(), "iconId", 655545306);
        setIntField(term117585, term117585.getClass(), "nameplateId", -1312381290);
        setIntField(term117585, term117585.getClass(), "frameId", -1712728962);
        setIntField(term117585, term117585.getClass(), "trophyId", -64038546);
        setIntField(term117585, term117585.getClass(), "playCount", 433360936);
        setIntField(term117585, term117585.getClass(), "playVsCount", -1636608619);
        setIntField(term117585, term117585.getClass(), "playSyncCount", 949617445);
        setIntField(term117585, term117585.getClass(), "winCount", -313010525);
        setIntField(term117585, term117585.getClass(), "helpCount", -443822831);
        setIntField(term117585, term117585.getClass(), "comboCount", 370262041);
        setIntField(term117585, term117585.getClass(), "feverCount", -598394758);
        setIntField(term117585, term117585.getClass(), "totalHiScore", -239545633);
        setIntField(term117585, term117585.getClass(), "totalEasyHighScore", -329411997);
        setIntField(term117585, term117585.getClass(), "totalBasicHighScore", -1504402108);
        setIntField(term117585, term117585.getClass(), "totalAdvancedHighScore", -812304204);
        setIntField(term117585, term117585.getClass(), "totalExpertHighScore", 1630465002);
        setIntField(term117585, term117585.getClass(), "totalMasterHighScore", 1007481312);
        setIntField(term117585, term117585.getClass(), "totalReMasterHighScore", 1239977029);
        setIntField(term117585, term117585.getClass(), "totalHighSync", -1321116340);
        setIntField(term117585, term117585.getClass(), "totalEasySync", -474806903);
        setIntField(term117585, term117585.getClass(), "totalBasicSync", 1981541170);
        setIntField(term117585, term117585.getClass(), "totalAdvancedSync", -2009986235);
        setIntField(term117585, term117585.getClass(), "totalExpertSync", -23880680);
        setIntField(term117585, term117585.getClass(), "totalMasterSync", -894843648);
        setIntField(term117585, term117585.getClass(), "totalReMasterSync", 142744348);
        setIntField(term117585, term117585.getClass(), "playerRating", 1483675783);
        setIntField(term117585, term117585.getClass(), "highestRating", -1134662759);
        setIntField(term117585, term117585.getClass(), "rankAuthTailId", 1144602839);
        setField(term117585, term117585.getClass(), "eventWatchedDate", "FcaMVDYJay");
        setField(term117585, term117585.getClass(), "webLimitDate", "pLLUuhaofY");
        setIntField(term117585, term117585.getClass(), "challengeTrackPhase", 96643570);
        setIntField(term117585, term117585.getClass(), "firstPlayBits", 1111083466);
        setField(term117585, term117585.getClass(), "lastPlayDate", "dCIHiLfkJL");
        setIntField(term117585, term117585.getClass(), "lastPlaceId", -287565680);
        setField(term117585, term117585.getClass(), "lastPlaceName", "bMYsCPikwh");
        setIntField(term117585, term117585.getClass(), "lastRegionId", -505190175);
        setField(term117585, term117585.getClass(), "lastRegionName", "hZENcMRjJX");
        setField(term117585, term117585.getClass(), "lastClientId", "iUsNqPEgsp");
        setField(term117585, term117585.getClass(), "lastCountryCode", "ODyqlitqRS");
        setIntField(term117585, term117585.getClass(), "eventPoint", -1982976693);
        setIntField(term117585, term117585.getClass(), "totalLv", 1819092465);
        setIntField(term117585, term117585.getClass(), "lastLoginBonusDay", 10838230);
        setIntField(term117585, term117585.getClass(), "lastSurvivalBonusDay", -1844417927);
        setIntField(term117585, term117585.getClass(), "loginBonusLv", -1229688588);
        setField(term117583, term117583.getClass(), "user", term117585);
        setIntField(term117583, term117583.getClass(), "orderId", -934089499);
        setLongField(term117583, term117583.getClass(), "sortNumber", 1222571199408067081L);
        setIntField(term117583, term117583.getClass(), "placeId", 1156999021);
        setField(term117583, term117583.getClass(), "placeName", "BKEyXkrXND");
        setField(term117583, term117583.getClass(), "country", "xpmkTXUaIW");
        setIntField(term117583, term117583.getClass(), "regionId", 1696896271);
        setField(term117583, term117583.getClass(), "playDate", "mkwXyNcVfj");
        setField(term117583, term117583.getClass(), "userPlayDate", "JaYInVuGAK");
        setIntField(term117583, term117583.getClass(), "musicId", 1811241767);
        setIntField(term117583, term117583.getClass(), "level", 1141602746);
        setIntField(term117583, term117583.getClass(), "gameMode", 1950766545);
        setIntField(term117583, term117583.getClass(), "rivalNum", 1718715106);
        setIntField(term117583, term117583.getClass(), "track", -595632133);
        setIntField(term117583, term117583.getClass(), "eventId", 1250894608);
        setBooleanField(term117583, term117583.getClass(), "isFreeToPlay", true);
        setIntField(term117583, term117583.getClass(), "playerRating", -39371116);
        setLongField(term117583, term117583.getClass(), "playedUserId1", -3672309483214533219L);
        setField(term117583, term117583.getClass(), "playedUserName1", "BhaPbaZeBl");
        setIntField(term117583, term117583.getClass(), "playedMusicLevel1", -1609922034);
        setLongField(term117583, term117583.getClass(), "playedUserId2", -2448708288718122671L);
        setField(term117583, term117583.getClass(), "playedUserName2", "GYqwdcmcTy");
        setIntField(term117583, term117583.getClass(), "playedMusicLevel2", -1252181986);
        setLongField(term117583, term117583.getClass(), "playedUserId3", 7391856662550454315L);
        setField(term117583, term117583.getClass(), "playedUserName3", "gUVQwUdnBZ");
        setIntField(term117583, term117583.getClass(), "playedMusicLevel3", -742736453);
        setIntField(term117583, term117583.getClass(), "achievement", -1062660823);
        setIntField(term117583, term117583.getClass(), "score", 2055256521);
        setIntField(term117583, term117583.getClass(), "tapScore", 956026562);
        setIntField(term117583, term117583.getClass(), "holdScore", -909171290);
        setIntField(term117583, term117583.getClass(), "slideScore", -1009529089);
        setIntField(term117583, term117583.getClass(), "breakScore", -16062487);
        setIntField(term117583, term117583.getClass(), "syncRate", 1410112213);
        setIntField(term117583, term117583.getClass(), "vsWin", -1645874956);
        setBooleanField(term117583, term117583.getClass(), "isAllPerfect", true);
        setIntField(term117583, term117583.getClass(), "fullCombo", -1602616879);
        setIntField(term117583, term117583.getClass(), "maxFever", -941452631);
        setIntField(term117583, term117583.getClass(), "maxCombo", -2137532556);
        setIntField(term117583, term117583.getClass(), "tapPerfect", -128208537);
        setIntField(term117583, term117583.getClass(), "tapGreat", 384209724);
        setIntField(term117583, term117583.getClass(), "tapGood", 1474730667);
        setIntField(term117583, term117583.getClass(), "tapBad", 1024806817);
        setIntField(term117583, term117583.getClass(), "holdPerfect", -1756207099);
        setIntField(term117583, term117583.getClass(), "holdGreat", -755151471);
        setIntField(term117583, term117583.getClass(), "holdGood", 606148929);
        setIntField(term117583, term117583.getClass(), "holdBad", -677793486);
        setIntField(term117583, term117583.getClass(), "slidePerfect", -1703604488);
        setIntField(term117583, term117583.getClass(), "slideGreat", 848260588);
        setIntField(term117583, term117583.getClass(), "slideGood", 1339938535);
        setIntField(term117583, term117583.getClass(), "slideBad", 1804704524);
        setIntField(term117583, term117583.getClass(), "breakPerfect", -900768331);
        setIntField(term117583, term117583.getClass(), "breakGreat", -1994227835);
        setIntField(term117583, term117583.getClass(), "breakGood", 986916372);
        setIntField(term117583, term117583.getClass(), "breakBad", -1033708911);
        setBooleanField(term117583, term117583.getClass(), "isTrackSkip", false);
        setBooleanField(term117583, term117583.getClass(), "isHighScore", true);
        setBooleanField(term117583, term117583.getClass(), "isChallengeTrack", true);
        setIntField(term117583, term117583.getClass(), "challengeLife", 1494952800);
        setIntField(term117583, term117583.getClass(), "challengeRemain", 704190533);
        setIntField(term117583, term117583.getClass(), "isAllPerfectPlus", -793303503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term117583, args);
    }

};


