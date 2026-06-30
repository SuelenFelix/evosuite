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

public class UserPlaylog_getCountry_8567746886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115223;

    public UserPlaylog_getCountry_8567746886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term115229 = new Long(-1571034605670661708L);
        term115223 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term115225 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term115227 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term115243 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115244 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115248 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115258 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term115223, term115223.getClass(), "id", -4710087184100544875L);
        setLongField(term115225, term115225.getClass(), "id", 8351267378333718210L);
        setLongField(term115227, term115227.getClass(), "id", 9162413454188628116L);
        setField(term115227, term115227.getClass(), "extId", term115229);
        setField(term115227, term115227.getClass(), "luid", "YFjmdvvUEp");
        setIntField(term115244, term115244.getClass(), "year", 2015);
        setShortField(term115244, term115244.getClass(), "month", (short) 3);
        setShortField(term115244, term115244.getClass(), "day", (short) 31);
        setField(term115243, term115243.getClass(), "date", term115244);
        setByteField(term115248, term115248.getClass(), "hour", (byte) 9);
        setByteField(term115248, term115248.getClass(), "minute", (byte) 42);
        setByteField(term115248, term115248.getClass(), "second", (byte) 3);
        setIntField(term115248, term115248.getClass(), "nano", 508678403);
        setField(term115243, term115243.getClass(), "time", term115248);
        setField(term115227, term115227.getClass(), "registerTime", term115243);
        setIntField(term115254, term115254.getClass(), "year", 2020);
        setShortField(term115254, term115254.getClass(), "month", (short) 9);
        setShortField(term115254, term115254.getClass(), "day", (short) 13);
        setField(term115253, term115253.getClass(), "date", term115254);
        setByteField(term115258, term115258.getClass(), "hour", (byte) 0);
        setByteField(term115258, term115258.getClass(), "minute", (byte) 7);
        setByteField(term115258, term115258.getClass(), "second", (byte) 27);
        setIntField(term115258, term115258.getClass(), "nano", 835567947);
        setField(term115253, term115253.getClass(), "time", term115258);
        setField(term115227, term115227.getClass(), "accessTime", term115253);
        setField(term115225, term115225.getClass(), "card", term115227);
        setIntField(term115225, term115225.getClass(), "lastDataVersion", -1224727911);
        setField(term115225, term115225.getClass(), "userName", "jCSXDmxVEW");
        setIntField(term115225, term115225.getClass(), "point", 1193187950);
        setIntField(term115225, term115225.getClass(), "totalPoint", -507045182);
        setIntField(term115225, term115225.getClass(), "iconId", -461171524);
        setIntField(term115225, term115225.getClass(), "nameplateId", -1215126246);
        setIntField(term115225, term115225.getClass(), "frameId", 852763841);
        setIntField(term115225, term115225.getClass(), "trophyId", -389279224);
        setIntField(term115225, term115225.getClass(), "playCount", 412728307);
        setIntField(term115225, term115225.getClass(), "playVsCount", 907738573);
        setIntField(term115225, term115225.getClass(), "playSyncCount", -504601990);
        setIntField(term115225, term115225.getClass(), "winCount", 179980220);
        setIntField(term115225, term115225.getClass(), "helpCount", 1185873996);
        setIntField(term115225, term115225.getClass(), "comboCount", 205875972);
        setIntField(term115225, term115225.getClass(), "feverCount", 1064911901);
        setIntField(term115225, term115225.getClass(), "totalHiScore", 194380521);
        setIntField(term115225, term115225.getClass(), "totalEasyHighScore", 1283277389);
        setIntField(term115225, term115225.getClass(), "totalBasicHighScore", -1328214687);
        setIntField(term115225, term115225.getClass(), "totalAdvancedHighScore", 17241672);
        setIntField(term115225, term115225.getClass(), "totalExpertHighScore", 34966127);
        setIntField(term115225, term115225.getClass(), "totalMasterHighScore", 1906285293);
        setIntField(term115225, term115225.getClass(), "totalReMasterHighScore", -238734417);
        setIntField(term115225, term115225.getClass(), "totalHighSync", -1873132810);
        setIntField(term115225, term115225.getClass(), "totalEasySync", 2076149493);
        setIntField(term115225, term115225.getClass(), "totalBasicSync", -109918085);
        setIntField(term115225, term115225.getClass(), "totalAdvancedSync", 1074991086);
        setIntField(term115225, term115225.getClass(), "totalExpertSync", -814652670);
        setIntField(term115225, term115225.getClass(), "totalMasterSync", 1798901789);
        setIntField(term115225, term115225.getClass(), "totalReMasterSync", -31619649);
        setIntField(term115225, term115225.getClass(), "playerRating", -37410385);
        setIntField(term115225, term115225.getClass(), "highestRating", 1071145962);
        setIntField(term115225, term115225.getClass(), "rankAuthTailId", 1665849594);
        setField(term115225, term115225.getClass(), "eventWatchedDate", "ucSaPNSgwx");
        setField(term115225, term115225.getClass(), "webLimitDate", "rsRvTIjmLJ");
        setIntField(term115225, term115225.getClass(), "challengeTrackPhase", -895176866);
        setIntField(term115225, term115225.getClass(), "firstPlayBits", 575087010);
        setField(term115225, term115225.getClass(), "lastPlayDate", "VOBEeWmzSF");
        setIntField(term115225, term115225.getClass(), "lastPlaceId", 333563350);
        setField(term115225, term115225.getClass(), "lastPlaceName", "cVeaNxcyvs");
        setIntField(term115225, term115225.getClass(), "lastRegionId", -39309378);
        setField(term115225, term115225.getClass(), "lastRegionName", "fIMpTnCtOM");
        setField(term115225, term115225.getClass(), "lastClientId", "zsVQmqfyvx");
        setField(term115225, term115225.getClass(), "lastCountryCode", "DKFEMZUVhd");
        setIntField(term115225, term115225.getClass(), "eventPoint", 961665922);
        setIntField(term115225, term115225.getClass(), "totalLv", -1685742995);
        setIntField(term115225, term115225.getClass(), "lastLoginBonusDay", 371668440);
        setIntField(term115225, term115225.getClass(), "lastSurvivalBonusDay", 637125815);
        setIntField(term115225, term115225.getClass(), "loginBonusLv", 1459177402);
        setField(term115223, term115223.getClass(), "user", term115225);
        setIntField(term115223, term115223.getClass(), "orderId", -1398842690);
        setLongField(term115223, term115223.getClass(), "sortNumber", 6077385331237778943L);
        setIntField(term115223, term115223.getClass(), "placeId", -503117709);
        setField(term115223, term115223.getClass(), "placeName", "xhjqWwsjmc");
        setField(term115223, term115223.getClass(), "country", "GmFORCKDuz");
        setIntField(term115223, term115223.getClass(), "regionId", -1285985156);
        setField(term115223, term115223.getClass(), "playDate", "uiZFXEVOdS");
        setField(term115223, term115223.getClass(), "userPlayDate", "kLUzmGfJsV");
        setIntField(term115223, term115223.getClass(), "musicId", 219562270);
        setIntField(term115223, term115223.getClass(), "level", 448658595);
        setIntField(term115223, term115223.getClass(), "gameMode", 583555169);
        setIntField(term115223, term115223.getClass(), "rivalNum", 327897443);
        setIntField(term115223, term115223.getClass(), "track", -1702663498);
        setIntField(term115223, term115223.getClass(), "eventId", -1090929128);
        setBooleanField(term115223, term115223.getClass(), "isFreeToPlay", false);
        setIntField(term115223, term115223.getClass(), "playerRating", -6828656);
        setLongField(term115223, term115223.getClass(), "playedUserId1", -5803004674995774129L);
        setField(term115223, term115223.getClass(), "playedUserName1", "NtSnrngAmM");
        setIntField(term115223, term115223.getClass(), "playedMusicLevel1", 1326729269);
        setLongField(term115223, term115223.getClass(), "playedUserId2", 5467431248910278098L);
        setField(term115223, term115223.getClass(), "playedUserName2", "OYnrHBNcZV");
        setIntField(term115223, term115223.getClass(), "playedMusicLevel2", -1895397861);
        setLongField(term115223, term115223.getClass(), "playedUserId3", -6624097117784103684L);
        setField(term115223, term115223.getClass(), "playedUserName3", "pwkepWBxgL");
        setIntField(term115223, term115223.getClass(), "playedMusicLevel3", 1716602593);
        setIntField(term115223, term115223.getClass(), "achievement", 1259032686);
        setIntField(term115223, term115223.getClass(), "score", -753648604);
        setIntField(term115223, term115223.getClass(), "tapScore", 389915231);
        setIntField(term115223, term115223.getClass(), "holdScore", 804747162);
        setIntField(term115223, term115223.getClass(), "slideScore", -791466650);
        setIntField(term115223, term115223.getClass(), "breakScore", -523835907);
        setIntField(term115223, term115223.getClass(), "syncRate", 385209642);
        setIntField(term115223, term115223.getClass(), "vsWin", -1815702004);
        setBooleanField(term115223, term115223.getClass(), "isAllPerfect", false);
        setIntField(term115223, term115223.getClass(), "fullCombo", 1141075113);
        setIntField(term115223, term115223.getClass(), "maxFever", 1643922073);
        setIntField(term115223, term115223.getClass(), "maxCombo", -1512971740);
        setIntField(term115223, term115223.getClass(), "tapPerfect", 935946945);
        setIntField(term115223, term115223.getClass(), "tapGreat", -143105487);
        setIntField(term115223, term115223.getClass(), "tapGood", 16612505);
        setIntField(term115223, term115223.getClass(), "tapBad", 1873376410);
        setIntField(term115223, term115223.getClass(), "holdPerfect", -507501606);
        setIntField(term115223, term115223.getClass(), "holdGreat", 178633218);
        setIntField(term115223, term115223.getClass(), "holdGood", -2006303407);
        setIntField(term115223, term115223.getClass(), "holdBad", -1787834533);
        setIntField(term115223, term115223.getClass(), "slidePerfect", 1502613791);
        setIntField(term115223, term115223.getClass(), "slideGreat", -258767694);
        setIntField(term115223, term115223.getClass(), "slideGood", -1209689852);
        setIntField(term115223, term115223.getClass(), "slideBad", 1861949155);
        setIntField(term115223, term115223.getClass(), "breakPerfect", -1997894313);
        setIntField(term115223, term115223.getClass(), "breakGreat", -788461525);
        setIntField(term115223, term115223.getClass(), "breakGood", 1411975762);
        setIntField(term115223, term115223.getClass(), "breakBad", -671901253);
        setBooleanField(term115223, term115223.getClass(), "isTrackSkip", false);
        setBooleanField(term115223, term115223.getClass(), "isHighScore", false);
        setBooleanField(term115223, term115223.getClass(), "isChallengeTrack", true);
        setIntField(term115223, term115223.getClass(), "challengeLife", -1402427175);
        setIntField(term115223, term115223.getClass(), "challengeRemain", -455255888);
        setIntField(term115223, term115223.getClass(), "isAllPerfectPlus", 1736913133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term115223, args);
    }

};


