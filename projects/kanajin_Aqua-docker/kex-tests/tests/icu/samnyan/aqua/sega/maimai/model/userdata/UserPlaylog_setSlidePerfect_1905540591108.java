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

public class UserPlaylog_setSlidePerfect_1905540591108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3990229;
     Object term3990541;

    public UserPlaylog_setSlidePerfect_1905540591108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3990235 = new Long(8801339843761859448L);
        term3990229 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3990231 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3990233 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3990249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3990250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3990254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3990259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3990260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3990264 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3990229, term3990229.getClass(), "id", -4544016091770919499L);
        setLongField(term3990231, term3990231.getClass(), "id", -5998442450537649834L);
        setLongField(term3990233, term3990233.getClass(), "id", 5569907658742512027L);
        setField(term3990233, term3990233.getClass(), "extId", term3990235);
        setField(term3990233, term3990233.getClass(), "luid", "BMJYHAIJKw");
        setIntField(term3990250, term3990250.getClass(), "year", 2029);
        setShortField(term3990250, term3990250.getClass(), "month", (short) 11);
        setShortField(term3990250, term3990250.getClass(), "day", (short) 23);
        setField(term3990249, term3990249.getClass(), "date", term3990250);
        setByteField(term3990254, term3990254.getClass(), "hour", (byte) 11);
        setByteField(term3990254, term3990254.getClass(), "minute", (byte) 27);
        setByteField(term3990254, term3990254.getClass(), "second", (byte) 41);
        setIntField(term3990254, term3990254.getClass(), "nano", 397225582);
        setField(term3990249, term3990249.getClass(), "time", term3990254);
        setField(term3990233, term3990233.getClass(), "registerTime", term3990249);
        setIntField(term3990260, term3990260.getClass(), "year", 2021);
        setShortField(term3990260, term3990260.getClass(), "month", (short) 3);
        setShortField(term3990260, term3990260.getClass(), "day", (short) 29);
        setField(term3990259, term3990259.getClass(), "date", term3990260);
        setByteField(term3990264, term3990264.getClass(), "hour", (byte) 3);
        setByteField(term3990264, term3990264.getClass(), "minute", (byte) 18);
        setByteField(term3990264, term3990264.getClass(), "second", (byte) 34);
        setIntField(term3990264, term3990264.getClass(), "nano", 896393226);
        setField(term3990259, term3990259.getClass(), "time", term3990264);
        setField(term3990233, term3990233.getClass(), "accessTime", term3990259);
        setField(term3990231, term3990231.getClass(), "card", term3990233);
        setIntField(term3990231, term3990231.getClass(), "lastDataVersion", -1899407545);
        setField(term3990231, term3990231.getClass(), "userName", "lDWwtTEBGf");
        setIntField(term3990231, term3990231.getClass(), "point", -1173641082);
        setIntField(term3990231, term3990231.getClass(), "totalPoint", -507758019);
        setIntField(term3990231, term3990231.getClass(), "iconId", -1779895776);
        setIntField(term3990231, term3990231.getClass(), "nameplateId", 1824825266);
        setIntField(term3990231, term3990231.getClass(), "frameId", -1318283266);
        setIntField(term3990231, term3990231.getClass(), "trophyId", -2054589473);
        setIntField(term3990231, term3990231.getClass(), "playCount", -275769541);
        setIntField(term3990231, term3990231.getClass(), "playVsCount", 417889663);
        setIntField(term3990231, term3990231.getClass(), "playSyncCount", 1857140609);
        setIntField(term3990231, term3990231.getClass(), "winCount", 2127543459);
        setIntField(term3990231, term3990231.getClass(), "helpCount", 111280160);
        setIntField(term3990231, term3990231.getClass(), "comboCount", -1843029771);
        setIntField(term3990231, term3990231.getClass(), "feverCount", -841519997);
        setIntField(term3990231, term3990231.getClass(), "totalHiScore", -1279367764);
        setIntField(term3990231, term3990231.getClass(), "totalEasyHighScore", -1490273091);
        setIntField(term3990231, term3990231.getClass(), "totalBasicHighScore", 587407041);
        setIntField(term3990231, term3990231.getClass(), "totalAdvancedHighScore", 800748304);
        setIntField(term3990231, term3990231.getClass(), "totalExpertHighScore", -1016790490);
        setIntField(term3990231, term3990231.getClass(), "totalMasterHighScore", 943324562);
        setIntField(term3990231, term3990231.getClass(), "totalReMasterHighScore", -2008049398);
        setIntField(term3990231, term3990231.getClass(), "totalHighSync", 1289503577);
        setIntField(term3990231, term3990231.getClass(), "totalEasySync", 1144469622);
        setIntField(term3990231, term3990231.getClass(), "totalBasicSync", -1143415076);
        setIntField(term3990231, term3990231.getClass(), "totalAdvancedSync", -1092762174);
        setIntField(term3990231, term3990231.getClass(), "totalExpertSync", -456537234);
        setIntField(term3990231, term3990231.getClass(), "totalMasterSync", -161484110);
        setIntField(term3990231, term3990231.getClass(), "totalReMasterSync", 1023197685);
        setIntField(term3990231, term3990231.getClass(), "playerRating", -1559757249);
        setIntField(term3990231, term3990231.getClass(), "highestRating", -1936883380);
        setIntField(term3990231, term3990231.getClass(), "rankAuthTailId", 976396883);
        setField(term3990231, term3990231.getClass(), "eventWatchedDate", "rtfHddEpDr");
        setField(term3990231, term3990231.getClass(), "webLimitDate", "iiPoKoOYJV");
        setIntField(term3990231, term3990231.getClass(), "challengeTrackPhase", -2105714438);
        setIntField(term3990231, term3990231.getClass(), "firstPlayBits", -448134135);
        setField(term3990231, term3990231.getClass(), "lastPlayDate", "zdNvzXZOvF");
        setIntField(term3990231, term3990231.getClass(), "lastPlaceId", -1381887718);
        setField(term3990231, term3990231.getClass(), "lastPlaceName", "eqzJqttaQs");
        setIntField(term3990231, term3990231.getClass(), "lastRegionId", 1153469225);
        setField(term3990231, term3990231.getClass(), "lastRegionName", "vbmLSFVEhJ");
        setField(term3990231, term3990231.getClass(), "lastClientId", "YKKYwzEkWm");
        setField(term3990231, term3990231.getClass(), "lastCountryCode", "xMuAqBoRJX");
        setIntField(term3990231, term3990231.getClass(), "eventPoint", 1156466862);
        setIntField(term3990231, term3990231.getClass(), "totalLv", 468338421);
        setIntField(term3990231, term3990231.getClass(), "lastLoginBonusDay", 309013423);
        setIntField(term3990231, term3990231.getClass(), "lastSurvivalBonusDay", 1384335758);
        setIntField(term3990231, term3990231.getClass(), "loginBonusLv", -977468259);
        setField(term3990229, term3990229.getClass(), "user", term3990231);
        setIntField(term3990229, term3990229.getClass(), "orderId", 396949618);
        setLongField(term3990229, term3990229.getClass(), "sortNumber", 5704240082584165138L);
        setIntField(term3990229, term3990229.getClass(), "placeId", -376555176);
        setField(term3990229, term3990229.getClass(), "placeName", "aPzfKIYKGw");
        setField(term3990229, term3990229.getClass(), "country", "QcmzEEFAaM");
        setIntField(term3990229, term3990229.getClass(), "regionId", -1989343266);
        setField(term3990229, term3990229.getClass(), "playDate", "ZsiRxjfzMI");
        setField(term3990229, term3990229.getClass(), "userPlayDate", "ejocZvNIvI");
        setIntField(term3990229, term3990229.getClass(), "musicId", 2131609988);
        setIntField(term3990229, term3990229.getClass(), "level", -637763550);
        setIntField(term3990229, term3990229.getClass(), "gameMode", -1092815657);
        setIntField(term3990229, term3990229.getClass(), "rivalNum", 465704742);
        setIntField(term3990229, term3990229.getClass(), "track", 1468226031);
        setIntField(term3990229, term3990229.getClass(), "eventId", 868754860);
        setBooleanField(term3990229, term3990229.getClass(), "isFreeToPlay", true);
        setIntField(term3990229, term3990229.getClass(), "playerRating", -1826606419);
        setLongField(term3990229, term3990229.getClass(), "playedUserId1", -8403463430435431416L);
        setField(term3990229, term3990229.getClass(), "playedUserName1", "BAErFQJxuT");
        setIntField(term3990229, term3990229.getClass(), "playedMusicLevel1", 1126620955);
        setLongField(term3990229, term3990229.getClass(), "playedUserId2", 7373936956829408495L);
        setField(term3990229, term3990229.getClass(), "playedUserName2", "ydJrUccAaB");
        setIntField(term3990229, term3990229.getClass(), "playedMusicLevel2", -642555612);
        setLongField(term3990229, term3990229.getClass(), "playedUserId3", -4083768436170654769L);
        setField(term3990229, term3990229.getClass(), "playedUserName3", "HxbrUoXHEb");
        setIntField(term3990229, term3990229.getClass(), "playedMusicLevel3", -722271280);
        setIntField(term3990229, term3990229.getClass(), "achievement", -1942923109);
        setIntField(term3990229, term3990229.getClass(), "score", -1031251636);
        setIntField(term3990229, term3990229.getClass(), "tapScore", 247701567);
        setIntField(term3990229, term3990229.getClass(), "holdScore", 1829935291);
        setIntField(term3990229, term3990229.getClass(), "slideScore", 11880806);
        setIntField(term3990229, term3990229.getClass(), "breakScore", 624200603);
        setIntField(term3990229, term3990229.getClass(), "syncRate", -724940386);
        setIntField(term3990229, term3990229.getClass(), "vsWin", -54687844);
        setBooleanField(term3990229, term3990229.getClass(), "isAllPerfect", true);
        setIntField(term3990229, term3990229.getClass(), "fullCombo", 1051969755);
        setIntField(term3990229, term3990229.getClass(), "maxFever", -52709911);
        setIntField(term3990229, term3990229.getClass(), "maxCombo", -1907478914);
        setIntField(term3990229, term3990229.getClass(), "tapPerfect", 55598966);
        setIntField(term3990229, term3990229.getClass(), "tapGreat", -160261102);
        setIntField(term3990229, term3990229.getClass(), "tapGood", -158718192);
        setIntField(term3990229, term3990229.getClass(), "tapBad", 1860805350);
        setIntField(term3990229, term3990229.getClass(), "holdPerfect", 1194818359);
        setIntField(term3990229, term3990229.getClass(), "holdGreat", -877925898);
        setIntField(term3990229, term3990229.getClass(), "holdGood", -80351978);
        setIntField(term3990229, term3990229.getClass(), "holdBad", 735919043);
        setIntField(term3990229, term3990229.getClass(), "slidePerfect", 1550733066);
        setIntField(term3990229, term3990229.getClass(), "slideGreat", 447455236);
        setIntField(term3990229, term3990229.getClass(), "slideGood", 1652216990);
        setIntField(term3990229, term3990229.getClass(), "slideBad", -1802646700);
        setIntField(term3990229, term3990229.getClass(), "breakPerfect", 655734505);
        setIntField(term3990229, term3990229.getClass(), "breakGreat", 1700257618);
        setIntField(term3990229, term3990229.getClass(), "breakGood", -388863071);
        setIntField(term3990229, term3990229.getClass(), "breakBad", 1354448840);
        setBooleanField(term3990229, term3990229.getClass(), "isTrackSkip", true);
        setBooleanField(term3990229, term3990229.getClass(), "isHighScore", true);
        setBooleanField(term3990229, term3990229.getClass(), "isChallengeTrack", false);
        setIntField(term3990229, term3990229.getClass(), "challengeLife", -1677190539);
        setIntField(term3990229, term3990229.getClass(), "challengeRemain", 1239725522);
        setIntField(term3990229, term3990229.getClass(), "isAllPerfectPlus", -180552866);
        term3990541 = new Integer(1593067556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3990541;
        callMethod(klass, "setSlidePerfect", argTypes, term3990229, args);
    }

};


