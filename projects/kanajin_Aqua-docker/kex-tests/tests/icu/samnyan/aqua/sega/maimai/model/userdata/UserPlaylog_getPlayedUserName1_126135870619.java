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

public class UserPlaylog_getPlayedUserName1_126135870619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121359;

    public UserPlaylog_getPlayedUserName1_126135870619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term121365 = new Long(6853972830905120647L);
        term121359 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term121361 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term121363 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term121379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121384 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121394 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term121359, term121359.getClass(), "id", 4642147601851708039L);
        setLongField(term121361, term121361.getClass(), "id", 1425489182033961019L);
        setLongField(term121363, term121363.getClass(), "id", -884853141515650306L);
        setField(term121363, term121363.getClass(), "extId", term121365);
        setField(term121363, term121363.getClass(), "luid", "GcMaBtNShc");
        setIntField(term121380, term121380.getClass(), "year", 2011);
        setShortField(term121380, term121380.getClass(), "month", (short) 12);
        setShortField(term121380, term121380.getClass(), "day", (short) 8);
        setField(term121379, term121379.getClass(), "date", term121380);
        setByteField(term121384, term121384.getClass(), "hour", (byte) 14);
        setByteField(term121384, term121384.getClass(), "minute", (byte) 21);
        setByteField(term121384, term121384.getClass(), "second", (byte) 41);
        setIntField(term121384, term121384.getClass(), "nano", 831066682);
        setField(term121379, term121379.getClass(), "time", term121384);
        setField(term121363, term121363.getClass(), "registerTime", term121379);
        setIntField(term121390, term121390.getClass(), "year", 2018);
        setShortField(term121390, term121390.getClass(), "month", (short) 12);
        setShortField(term121390, term121390.getClass(), "day", (short) 8);
        setField(term121389, term121389.getClass(), "date", term121390);
        setByteField(term121394, term121394.getClass(), "hour", (byte) 14);
        setByteField(term121394, term121394.getClass(), "minute", (byte) 50);
        setByteField(term121394, term121394.getClass(), "second", (byte) 10);
        setIntField(term121394, term121394.getClass(), "nano", 698726170);
        setField(term121389, term121389.getClass(), "time", term121394);
        setField(term121363, term121363.getClass(), "accessTime", term121389);
        setField(term121361, term121361.getClass(), "card", term121363);
        setIntField(term121361, term121361.getClass(), "lastDataVersion", -214374321);
        setField(term121361, term121361.getClass(), "userName", "kqGufqJbqf");
        setIntField(term121361, term121361.getClass(), "point", 1267044964);
        setIntField(term121361, term121361.getClass(), "totalPoint", 1483717887);
        setIntField(term121361, term121361.getClass(), "iconId", 424625087);
        setIntField(term121361, term121361.getClass(), "nameplateId", 884358038);
        setIntField(term121361, term121361.getClass(), "frameId", -1115805891);
        setIntField(term121361, term121361.getClass(), "trophyId", 72821177);
        setIntField(term121361, term121361.getClass(), "playCount", 132004149);
        setIntField(term121361, term121361.getClass(), "playVsCount", 1607634065);
        setIntField(term121361, term121361.getClass(), "playSyncCount", -844027507);
        setIntField(term121361, term121361.getClass(), "winCount", -35125797);
        setIntField(term121361, term121361.getClass(), "helpCount", 732051554);
        setIntField(term121361, term121361.getClass(), "comboCount", -252331317);
        setIntField(term121361, term121361.getClass(), "feverCount", 1228310197);
        setIntField(term121361, term121361.getClass(), "totalHiScore", 700836778);
        setIntField(term121361, term121361.getClass(), "totalEasyHighScore", 2008079324);
        setIntField(term121361, term121361.getClass(), "totalBasicHighScore", 554320212);
        setIntField(term121361, term121361.getClass(), "totalAdvancedHighScore", -1547697731);
        setIntField(term121361, term121361.getClass(), "totalExpertHighScore", -1886290435);
        setIntField(term121361, term121361.getClass(), "totalMasterHighScore", 1460206884);
        setIntField(term121361, term121361.getClass(), "totalReMasterHighScore", 137412840);
        setIntField(term121361, term121361.getClass(), "totalHighSync", -1655219028);
        setIntField(term121361, term121361.getClass(), "totalEasySync", -1234077444);
        setIntField(term121361, term121361.getClass(), "totalBasicSync", -1532039141);
        setIntField(term121361, term121361.getClass(), "totalAdvancedSync", 102729809);
        setIntField(term121361, term121361.getClass(), "totalExpertSync", -70958310);
        setIntField(term121361, term121361.getClass(), "totalMasterSync", -1525314773);
        setIntField(term121361, term121361.getClass(), "totalReMasterSync", -1014201932);
        setIntField(term121361, term121361.getClass(), "playerRating", 289914633);
        setIntField(term121361, term121361.getClass(), "highestRating", 686017027);
        setIntField(term121361, term121361.getClass(), "rankAuthTailId", 421477030);
        setField(term121361, term121361.getClass(), "eventWatchedDate", "wqMYxsvXwx");
        setField(term121361, term121361.getClass(), "webLimitDate", "qUfONYtlAU");
        setIntField(term121361, term121361.getClass(), "challengeTrackPhase", -960123414);
        setIntField(term121361, term121361.getClass(), "firstPlayBits", 1397757474);
        setField(term121361, term121361.getClass(), "lastPlayDate", "QMHmlsCFoq");
        setIntField(term121361, term121361.getClass(), "lastPlaceId", -671573795);
        setField(term121361, term121361.getClass(), "lastPlaceName", "JlgbBmNibu");
        setIntField(term121361, term121361.getClass(), "lastRegionId", 635263662);
        setField(term121361, term121361.getClass(), "lastRegionName", "igRVOATJPd");
        setField(term121361, term121361.getClass(), "lastClientId", "DYaMGxxqDk");
        setField(term121361, term121361.getClass(), "lastCountryCode", "kTRmkTQpRx");
        setIntField(term121361, term121361.getClass(), "eventPoint", 1087258868);
        setIntField(term121361, term121361.getClass(), "totalLv", 2014258026);
        setIntField(term121361, term121361.getClass(), "lastLoginBonusDay", -782233621);
        setIntField(term121361, term121361.getClass(), "lastSurvivalBonusDay", -569715357);
        setIntField(term121361, term121361.getClass(), "loginBonusLv", -342108233);
        setField(term121359, term121359.getClass(), "user", term121361);
        setIntField(term121359, term121359.getClass(), "orderId", 976079562);
        setLongField(term121359, term121359.getClass(), "sortNumber", 5063961949952053841L);
        setIntField(term121359, term121359.getClass(), "placeId", -1634467885);
        setField(term121359, term121359.getClass(), "placeName", "NmXGFQkgMo");
        setField(term121359, term121359.getClass(), "country", "lBruaTAkIt");
        setIntField(term121359, term121359.getClass(), "regionId", 805948883);
        setField(term121359, term121359.getClass(), "playDate", "pIQQBEGLOF");
        setField(term121359, term121359.getClass(), "userPlayDate", "DLYPXnIorY");
        setIntField(term121359, term121359.getClass(), "musicId", 1645409148);
        setIntField(term121359, term121359.getClass(), "level", -1740875282);
        setIntField(term121359, term121359.getClass(), "gameMode", -835860882);
        setIntField(term121359, term121359.getClass(), "rivalNum", 740318771);
        setIntField(term121359, term121359.getClass(), "track", -108718877);
        setIntField(term121359, term121359.getClass(), "eventId", 747321898);
        setBooleanField(term121359, term121359.getClass(), "isFreeToPlay", false);
        setIntField(term121359, term121359.getClass(), "playerRating", -1054022433);
        setLongField(term121359, term121359.getClass(), "playedUserId1", 5946931662340995277L);
        setField(term121359, term121359.getClass(), "playedUserName1", "MaEbckWDBJ");
        setIntField(term121359, term121359.getClass(), "playedMusicLevel1", -1999866261);
        setLongField(term121359, term121359.getClass(), "playedUserId2", -519044061680044865L);
        setField(term121359, term121359.getClass(), "playedUserName2", "kxuScrxaGm");
        setIntField(term121359, term121359.getClass(), "playedMusicLevel2", 218173974);
        setLongField(term121359, term121359.getClass(), "playedUserId3", -5615015000728170842L);
        setField(term121359, term121359.getClass(), "playedUserName3", "ItamIWoOLr");
        setIntField(term121359, term121359.getClass(), "playedMusicLevel3", -71148389);
        setIntField(term121359, term121359.getClass(), "achievement", -1782029594);
        setIntField(term121359, term121359.getClass(), "score", 647536343);
        setIntField(term121359, term121359.getClass(), "tapScore", -896132032);
        setIntField(term121359, term121359.getClass(), "holdScore", -1337932659);
        setIntField(term121359, term121359.getClass(), "slideScore", -1851616394);
        setIntField(term121359, term121359.getClass(), "breakScore", 1530110795);
        setIntField(term121359, term121359.getClass(), "syncRate", -1883428800);
        setIntField(term121359, term121359.getClass(), "vsWin", 1157616668);
        setBooleanField(term121359, term121359.getClass(), "isAllPerfect", true);
        setIntField(term121359, term121359.getClass(), "fullCombo", -90435964);
        setIntField(term121359, term121359.getClass(), "maxFever", -148280744);
        setIntField(term121359, term121359.getClass(), "maxCombo", -719081831);
        setIntField(term121359, term121359.getClass(), "tapPerfect", 541867805);
        setIntField(term121359, term121359.getClass(), "tapGreat", 1140585505);
        setIntField(term121359, term121359.getClass(), "tapGood", -625247027);
        setIntField(term121359, term121359.getClass(), "tapBad", 2119038637);
        setIntField(term121359, term121359.getClass(), "holdPerfect", 929089598);
        setIntField(term121359, term121359.getClass(), "holdGreat", -764359478);
        setIntField(term121359, term121359.getClass(), "holdGood", -650378880);
        setIntField(term121359, term121359.getClass(), "holdBad", 1983275307);
        setIntField(term121359, term121359.getClass(), "slidePerfect", 369962091);
        setIntField(term121359, term121359.getClass(), "slideGreat", -305227009);
        setIntField(term121359, term121359.getClass(), "slideGood", -147443379);
        setIntField(term121359, term121359.getClass(), "slideBad", -361601596);
        setIntField(term121359, term121359.getClass(), "breakPerfect", 1129701491);
        setIntField(term121359, term121359.getClass(), "breakGreat", 681832977);
        setIntField(term121359, term121359.getClass(), "breakGood", 1524336479);
        setIntField(term121359, term121359.getClass(), "breakBad", 968701988);
        setBooleanField(term121359, term121359.getClass(), "isTrackSkip", true);
        setBooleanField(term121359, term121359.getClass(), "isHighScore", true);
        setBooleanField(term121359, term121359.getClass(), "isChallengeTrack", false);
        setIntField(term121359, term121359.getClass(), "challengeLife", 195003627);
        setIntField(term121359, term121359.getClass(), "challengeRemain", 218703424);
        setIntField(term121359, term121359.getClass(), "isAllPerfectPlus", -1344458322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName1", argTypes, term121359, args);
    }

};


