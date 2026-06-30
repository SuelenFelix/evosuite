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

public class UserPlaylog_getVsWin_93407084434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128439;

    public UserPlaylog_getVsWin_93407084434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term128445 = new Long(8024477479047145752L);
        term128439 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term128441 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term128443 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term128459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128464 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128474 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term128439, term128439.getClass(), "id", -373060971444161211L);
        setLongField(term128441, term128441.getClass(), "id", -2342559604213128910L);
        setLongField(term128443, term128443.getClass(), "id", 7857334824369215506L);
        setField(term128443, term128443.getClass(), "extId", term128445);
        setField(term128443, term128443.getClass(), "luid", "CgnkREXVNP");
        setIntField(term128460, term128460.getClass(), "year", 2011);
        setShortField(term128460, term128460.getClass(), "month", (short) 11);
        setShortField(term128460, term128460.getClass(), "day", (short) 10);
        setField(term128459, term128459.getClass(), "date", term128460);
        setByteField(term128464, term128464.getClass(), "hour", (byte) 16);
        setByteField(term128464, term128464.getClass(), "minute", (byte) 19);
        setByteField(term128464, term128464.getClass(), "second", (byte) 18);
        setIntField(term128464, term128464.getClass(), "nano", 955766756);
        setField(term128459, term128459.getClass(), "time", term128464);
        setField(term128443, term128443.getClass(), "registerTime", term128459);
        setIntField(term128470, term128470.getClass(), "year", 2011);
        setShortField(term128470, term128470.getClass(), "month", (short) 3);
        setShortField(term128470, term128470.getClass(), "day", (short) 20);
        setField(term128469, term128469.getClass(), "date", term128470);
        setByteField(term128474, term128474.getClass(), "hour", (byte) 2);
        setByteField(term128474, term128474.getClass(), "minute", (byte) 22);
        setByteField(term128474, term128474.getClass(), "second", (byte) 29);
        setIntField(term128474, term128474.getClass(), "nano", 438239474);
        setField(term128469, term128469.getClass(), "time", term128474);
        setField(term128443, term128443.getClass(), "accessTime", term128469);
        setField(term128441, term128441.getClass(), "card", term128443);
        setIntField(term128441, term128441.getClass(), "lastDataVersion", -902881139);
        setField(term128441, term128441.getClass(), "userName", "mBAKehIGeW");
        setIntField(term128441, term128441.getClass(), "point", -565825027);
        setIntField(term128441, term128441.getClass(), "totalPoint", -247973321);
        setIntField(term128441, term128441.getClass(), "iconId", 940470089);
        setIntField(term128441, term128441.getClass(), "nameplateId", 1870531208);
        setIntField(term128441, term128441.getClass(), "frameId", -1019988822);
        setIntField(term128441, term128441.getClass(), "trophyId", 1965536851);
        setIntField(term128441, term128441.getClass(), "playCount", -497259716);
        setIntField(term128441, term128441.getClass(), "playVsCount", 918311017);
        setIntField(term128441, term128441.getClass(), "playSyncCount", 1998112564);
        setIntField(term128441, term128441.getClass(), "winCount", 365878160);
        setIntField(term128441, term128441.getClass(), "helpCount", -719674124);
        setIntField(term128441, term128441.getClass(), "comboCount", 212530225);
        setIntField(term128441, term128441.getClass(), "feverCount", 1825487058);
        setIntField(term128441, term128441.getClass(), "totalHiScore", 548602355);
        setIntField(term128441, term128441.getClass(), "totalEasyHighScore", -1684946902);
        setIntField(term128441, term128441.getClass(), "totalBasicHighScore", -1027686698);
        setIntField(term128441, term128441.getClass(), "totalAdvancedHighScore", 1410590376);
        setIntField(term128441, term128441.getClass(), "totalExpertHighScore", -1009536873);
        setIntField(term128441, term128441.getClass(), "totalMasterHighScore", -296857349);
        setIntField(term128441, term128441.getClass(), "totalReMasterHighScore", 68727383);
        setIntField(term128441, term128441.getClass(), "totalHighSync", 541050441);
        setIntField(term128441, term128441.getClass(), "totalEasySync", 327561187);
        setIntField(term128441, term128441.getClass(), "totalBasicSync", 1458099219);
        setIntField(term128441, term128441.getClass(), "totalAdvancedSync", -1278539504);
        setIntField(term128441, term128441.getClass(), "totalExpertSync", 1652135036);
        setIntField(term128441, term128441.getClass(), "totalMasterSync", 909871871);
        setIntField(term128441, term128441.getClass(), "totalReMasterSync", -1483569912);
        setIntField(term128441, term128441.getClass(), "playerRating", -1197582769);
        setIntField(term128441, term128441.getClass(), "highestRating", -2007225277);
        setIntField(term128441, term128441.getClass(), "rankAuthTailId", -215960445);
        setField(term128441, term128441.getClass(), "eventWatchedDate", "tmiPUgRXrn");
        setField(term128441, term128441.getClass(), "webLimitDate", "VuZmwqnade");
        setIntField(term128441, term128441.getClass(), "challengeTrackPhase", -2077313277);
        setIntField(term128441, term128441.getClass(), "firstPlayBits", 296721446);
        setField(term128441, term128441.getClass(), "lastPlayDate", "ohZrjboUnX");
        setIntField(term128441, term128441.getClass(), "lastPlaceId", -1571698152);
        setField(term128441, term128441.getClass(), "lastPlaceName", "rwlrpQuNrG");
        setIntField(term128441, term128441.getClass(), "lastRegionId", -1823489423);
        setField(term128441, term128441.getClass(), "lastRegionName", "fctYGLXetS");
        setField(term128441, term128441.getClass(), "lastClientId", "UPbgrEUWQD");
        setField(term128441, term128441.getClass(), "lastCountryCode", "HABnTZidNp");
        setIntField(term128441, term128441.getClass(), "eventPoint", 1561760677);
        setIntField(term128441, term128441.getClass(), "totalLv", 729377410);
        setIntField(term128441, term128441.getClass(), "lastLoginBonusDay", -925745287);
        setIntField(term128441, term128441.getClass(), "lastSurvivalBonusDay", -716933787);
        setIntField(term128441, term128441.getClass(), "loginBonusLv", -2061540313);
        setField(term128439, term128439.getClass(), "user", term128441);
        setIntField(term128439, term128439.getClass(), "orderId", -1956160644);
        setLongField(term128439, term128439.getClass(), "sortNumber", -4871569513248515478L);
        setIntField(term128439, term128439.getClass(), "placeId", 559045287);
        setField(term128439, term128439.getClass(), "placeName", "qXysRdBrsg");
        setField(term128439, term128439.getClass(), "country", "hbtKoWkZLU");
        setIntField(term128439, term128439.getClass(), "regionId", -1095401718);
        setField(term128439, term128439.getClass(), "playDate", "VCWjXeMQGX");
        setField(term128439, term128439.getClass(), "userPlayDate", "KzrkBfSzqK");
        setIntField(term128439, term128439.getClass(), "musicId", 1264175299);
        setIntField(term128439, term128439.getClass(), "level", 1513390318);
        setIntField(term128439, term128439.getClass(), "gameMode", -77887831);
        setIntField(term128439, term128439.getClass(), "rivalNum", 890715088);
        setIntField(term128439, term128439.getClass(), "track", -1484619182);
        setIntField(term128439, term128439.getClass(), "eventId", 1078630217);
        setBooleanField(term128439, term128439.getClass(), "isFreeToPlay", false);
        setIntField(term128439, term128439.getClass(), "playerRating", -533796969);
        setLongField(term128439, term128439.getClass(), "playedUserId1", 2969840922415466505L);
        setField(term128439, term128439.getClass(), "playedUserName1", "cFNqeNRwhB");
        setIntField(term128439, term128439.getClass(), "playedMusicLevel1", 941872091);
        setLongField(term128439, term128439.getClass(), "playedUserId2", 59088120026756366L);
        setField(term128439, term128439.getClass(), "playedUserName2", "TQJASDuFUN");
        setIntField(term128439, term128439.getClass(), "playedMusicLevel2", 1820570166);
        setLongField(term128439, term128439.getClass(), "playedUserId3", 6233688650098278772L);
        setField(term128439, term128439.getClass(), "playedUserName3", "mOILNTkENv");
        setIntField(term128439, term128439.getClass(), "playedMusicLevel3", -1537142362);
        setIntField(term128439, term128439.getClass(), "achievement", -1681426668);
        setIntField(term128439, term128439.getClass(), "score", 1594881854);
        setIntField(term128439, term128439.getClass(), "tapScore", -1863338887);
        setIntField(term128439, term128439.getClass(), "holdScore", 955798298);
        setIntField(term128439, term128439.getClass(), "slideScore", -515709669);
        setIntField(term128439, term128439.getClass(), "breakScore", 1070770536);
        setIntField(term128439, term128439.getClass(), "syncRate", -800262090);
        setIntField(term128439, term128439.getClass(), "vsWin", 37661005);
        setBooleanField(term128439, term128439.getClass(), "isAllPerfect", true);
        setIntField(term128439, term128439.getClass(), "fullCombo", -554614529);
        setIntField(term128439, term128439.getClass(), "maxFever", -749088802);
        setIntField(term128439, term128439.getClass(), "maxCombo", 865892919);
        setIntField(term128439, term128439.getClass(), "tapPerfect", -1867391923);
        setIntField(term128439, term128439.getClass(), "tapGreat", -876106068);
        setIntField(term128439, term128439.getClass(), "tapGood", -789809110);
        setIntField(term128439, term128439.getClass(), "tapBad", 1509606879);
        setIntField(term128439, term128439.getClass(), "holdPerfect", 514418591);
        setIntField(term128439, term128439.getClass(), "holdGreat", -1594708942);
        setIntField(term128439, term128439.getClass(), "holdGood", -1449719534);
        setIntField(term128439, term128439.getClass(), "holdBad", 768974922);
        setIntField(term128439, term128439.getClass(), "slidePerfect", -316493673);
        setIntField(term128439, term128439.getClass(), "slideGreat", 50899844);
        setIntField(term128439, term128439.getClass(), "slideGood", 26006285);
        setIntField(term128439, term128439.getClass(), "slideBad", -30490190);
        setIntField(term128439, term128439.getClass(), "breakPerfect", -1746285079);
        setIntField(term128439, term128439.getClass(), "breakGreat", 254149756);
        setIntField(term128439, term128439.getClass(), "breakGood", -1272073230);
        setIntField(term128439, term128439.getClass(), "breakBad", 1208369428);
        setBooleanField(term128439, term128439.getClass(), "isTrackSkip", false);
        setBooleanField(term128439, term128439.getClass(), "isHighScore", false);
        setBooleanField(term128439, term128439.getClass(), "isChallengeTrack", true);
        setIntField(term128439, term128439.getClass(), "challengeLife", -405883777);
        setIntField(term128439, term128439.getClass(), "challengeRemain", -850951391);
        setIntField(term128439, term128439.getClass(), "isAllPerfectPlus", -15351310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVsWin", argTypes, term128439, args);
    }

};


