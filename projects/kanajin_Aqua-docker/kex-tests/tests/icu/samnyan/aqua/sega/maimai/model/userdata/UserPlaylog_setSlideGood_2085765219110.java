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

public class UserPlaylog_setSlideGood_2085765219110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3991177;
     Object term3991489;

    public UserPlaylog_setSlideGood_2085765219110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3991183 = new Long(-648918313748693919L);
        term3991177 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3991179 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3991181 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3991197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3991198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3991202 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3991207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3991208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3991212 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3991177, term3991177.getClass(), "id", -2346372981767720205L);
        setLongField(term3991179, term3991179.getClass(), "id", -326477023245320760L);
        setLongField(term3991181, term3991181.getClass(), "id", 439534499036418335L);
        setField(term3991181, term3991181.getClass(), "extId", term3991183);
        setField(term3991181, term3991181.getClass(), "luid", "EuawwOEuUw");
        setIntField(term3991198, term3991198.getClass(), "year", 2011);
        setShortField(term3991198, term3991198.getClass(), "month", (short) 3);
        setShortField(term3991198, term3991198.getClass(), "day", (short) 26);
        setField(term3991197, term3991197.getClass(), "date", term3991198);
        setByteField(term3991202, term3991202.getClass(), "hour", (byte) 17);
        setByteField(term3991202, term3991202.getClass(), "minute", (byte) 20);
        setByteField(term3991202, term3991202.getClass(), "second", (byte) 5);
        setIntField(term3991202, term3991202.getClass(), "nano", 408497154);
        setField(term3991197, term3991197.getClass(), "time", term3991202);
        setField(term3991181, term3991181.getClass(), "registerTime", term3991197);
        setIntField(term3991208, term3991208.getClass(), "year", 2027);
        setShortField(term3991208, term3991208.getClass(), "month", (short) 4);
        setShortField(term3991208, term3991208.getClass(), "day", (short) 22);
        setField(term3991207, term3991207.getClass(), "date", term3991208);
        setByteField(term3991212, term3991212.getClass(), "hour", (byte) 15);
        setByteField(term3991212, term3991212.getClass(), "minute", (byte) 37);
        setByteField(term3991212, term3991212.getClass(), "second", (byte) 7);
        setIntField(term3991212, term3991212.getClass(), "nano", 217869061);
        setField(term3991207, term3991207.getClass(), "time", term3991212);
        setField(term3991181, term3991181.getClass(), "accessTime", term3991207);
        setField(term3991179, term3991179.getClass(), "card", term3991181);
        setIntField(term3991179, term3991179.getClass(), "lastDataVersion", 924995771);
        setField(term3991179, term3991179.getClass(), "userName", "FIMAkcVXGj");
        setIntField(term3991179, term3991179.getClass(), "point", 244420572);
        setIntField(term3991179, term3991179.getClass(), "totalPoint", -1815706997);
        setIntField(term3991179, term3991179.getClass(), "iconId", -1146476897);
        setIntField(term3991179, term3991179.getClass(), "nameplateId", -141458972);
        setIntField(term3991179, term3991179.getClass(), "frameId", 2080794493);
        setIntField(term3991179, term3991179.getClass(), "trophyId", 1589236398);
        setIntField(term3991179, term3991179.getClass(), "playCount", 1811254657);
        setIntField(term3991179, term3991179.getClass(), "playVsCount", 2102220310);
        setIntField(term3991179, term3991179.getClass(), "playSyncCount", -177062591);
        setIntField(term3991179, term3991179.getClass(), "winCount", 2072726673);
        setIntField(term3991179, term3991179.getClass(), "helpCount", 1803955981);
        setIntField(term3991179, term3991179.getClass(), "comboCount", 879721592);
        setIntField(term3991179, term3991179.getClass(), "feverCount", 862787378);
        setIntField(term3991179, term3991179.getClass(), "totalHiScore", -1632446356);
        setIntField(term3991179, term3991179.getClass(), "totalEasyHighScore", 552884712);
        setIntField(term3991179, term3991179.getClass(), "totalBasicHighScore", -354687456);
        setIntField(term3991179, term3991179.getClass(), "totalAdvancedHighScore", 220148955);
        setIntField(term3991179, term3991179.getClass(), "totalExpertHighScore", 153660741);
        setIntField(term3991179, term3991179.getClass(), "totalMasterHighScore", -1395188106);
        setIntField(term3991179, term3991179.getClass(), "totalReMasterHighScore", 1491267492);
        setIntField(term3991179, term3991179.getClass(), "totalHighSync", 51886931);
        setIntField(term3991179, term3991179.getClass(), "totalEasySync", -1878514007);
        setIntField(term3991179, term3991179.getClass(), "totalBasicSync", -1878457217);
        setIntField(term3991179, term3991179.getClass(), "totalAdvancedSync", 1390678001);
        setIntField(term3991179, term3991179.getClass(), "totalExpertSync", -1911317126);
        setIntField(term3991179, term3991179.getClass(), "totalMasterSync", -224542312);
        setIntField(term3991179, term3991179.getClass(), "totalReMasterSync", -1445988592);
        setIntField(term3991179, term3991179.getClass(), "playerRating", 208412762);
        setIntField(term3991179, term3991179.getClass(), "highestRating", -1307294590);
        setIntField(term3991179, term3991179.getClass(), "rankAuthTailId", -1474071360);
        setField(term3991179, term3991179.getClass(), "eventWatchedDate", "lRiySdzrXX");
        setField(term3991179, term3991179.getClass(), "webLimitDate", "uHDcOKktdB");
        setIntField(term3991179, term3991179.getClass(), "challengeTrackPhase", 1883081375);
        setIntField(term3991179, term3991179.getClass(), "firstPlayBits", 2036830707);
        setField(term3991179, term3991179.getClass(), "lastPlayDate", "PMODLPeYYl");
        setIntField(term3991179, term3991179.getClass(), "lastPlaceId", 2115615921);
        setField(term3991179, term3991179.getClass(), "lastPlaceName", "ZADcBjYdxS");
        setIntField(term3991179, term3991179.getClass(), "lastRegionId", -1024600082);
        setField(term3991179, term3991179.getClass(), "lastRegionName", "TzEpHakwNc");
        setField(term3991179, term3991179.getClass(), "lastClientId", "IttGykMRFt");
        setField(term3991179, term3991179.getClass(), "lastCountryCode", "jNnfnCbiSe");
        setIntField(term3991179, term3991179.getClass(), "eventPoint", 852164978);
        setIntField(term3991179, term3991179.getClass(), "totalLv", -1699601376);
        setIntField(term3991179, term3991179.getClass(), "lastLoginBonusDay", 1808558692);
        setIntField(term3991179, term3991179.getClass(), "lastSurvivalBonusDay", 2080362177);
        setIntField(term3991179, term3991179.getClass(), "loginBonusLv", -1450790336);
        setField(term3991177, term3991177.getClass(), "user", term3991179);
        setIntField(term3991177, term3991177.getClass(), "orderId", 366145640);
        setLongField(term3991177, term3991177.getClass(), "sortNumber", 3098307449837553295L);
        setIntField(term3991177, term3991177.getClass(), "placeId", -1398895786);
        setField(term3991177, term3991177.getClass(), "placeName", "gYaPJmRFsK");
        setField(term3991177, term3991177.getClass(), "country", "qBShypkhut");
        setIntField(term3991177, term3991177.getClass(), "regionId", 1193388704);
        setField(term3991177, term3991177.getClass(), "playDate", "iMhfWEGrEo");
        setField(term3991177, term3991177.getClass(), "userPlayDate", "WxfdQTfrZQ");
        setIntField(term3991177, term3991177.getClass(), "musicId", 811513112);
        setIntField(term3991177, term3991177.getClass(), "level", -1521688690);
        setIntField(term3991177, term3991177.getClass(), "gameMode", -1951528926);
        setIntField(term3991177, term3991177.getClass(), "rivalNum", -788499);
        setIntField(term3991177, term3991177.getClass(), "track", 544144001);
        setIntField(term3991177, term3991177.getClass(), "eventId", -723985438);
        setBooleanField(term3991177, term3991177.getClass(), "isFreeToPlay", false);
        setIntField(term3991177, term3991177.getClass(), "playerRating", 422795782);
        setLongField(term3991177, term3991177.getClass(), "playedUserId1", 9211751273036068782L);
        setField(term3991177, term3991177.getClass(), "playedUserName1", "KLzvdRFGin");
        setIntField(term3991177, term3991177.getClass(), "playedMusicLevel1", 1397058170);
        setLongField(term3991177, term3991177.getClass(), "playedUserId2", -6042703333425874678L);
        setField(term3991177, term3991177.getClass(), "playedUserName2", "VKpsfYYjqy");
        setIntField(term3991177, term3991177.getClass(), "playedMusicLevel2", 1861693666);
        setLongField(term3991177, term3991177.getClass(), "playedUserId3", -461950200650391263L);
        setField(term3991177, term3991177.getClass(), "playedUserName3", "GIeQwRFzDz");
        setIntField(term3991177, term3991177.getClass(), "playedMusicLevel3", -866102060);
        setIntField(term3991177, term3991177.getClass(), "achievement", 1305643241);
        setIntField(term3991177, term3991177.getClass(), "score", 813079868);
        setIntField(term3991177, term3991177.getClass(), "tapScore", 1694440484);
        setIntField(term3991177, term3991177.getClass(), "holdScore", 719579081);
        setIntField(term3991177, term3991177.getClass(), "slideScore", -168852066);
        setIntField(term3991177, term3991177.getClass(), "breakScore", -198338243);
        setIntField(term3991177, term3991177.getClass(), "syncRate", 435569557);
        setIntField(term3991177, term3991177.getClass(), "vsWin", -1193065935);
        setBooleanField(term3991177, term3991177.getClass(), "isAllPerfect", true);
        setIntField(term3991177, term3991177.getClass(), "fullCombo", -1082694550);
        setIntField(term3991177, term3991177.getClass(), "maxFever", 2068207575);
        setIntField(term3991177, term3991177.getClass(), "maxCombo", -1190782449);
        setIntField(term3991177, term3991177.getClass(), "tapPerfect", -174550823);
        setIntField(term3991177, term3991177.getClass(), "tapGreat", 1000618947);
        setIntField(term3991177, term3991177.getClass(), "tapGood", 839693342);
        setIntField(term3991177, term3991177.getClass(), "tapBad", 983303256);
        setIntField(term3991177, term3991177.getClass(), "holdPerfect", -1263857539);
        setIntField(term3991177, term3991177.getClass(), "holdGreat", 307866458);
        setIntField(term3991177, term3991177.getClass(), "holdGood", 60784542);
        setIntField(term3991177, term3991177.getClass(), "holdBad", -2078088756);
        setIntField(term3991177, term3991177.getClass(), "slidePerfect", -2145283167);
        setIntField(term3991177, term3991177.getClass(), "slideGreat", -770420901);
        setIntField(term3991177, term3991177.getClass(), "slideGood", 1059302981);
        setIntField(term3991177, term3991177.getClass(), "slideBad", 356121401);
        setIntField(term3991177, term3991177.getClass(), "breakPerfect", -1516826208);
        setIntField(term3991177, term3991177.getClass(), "breakGreat", 105292787);
        setIntField(term3991177, term3991177.getClass(), "breakGood", -949367390);
        setIntField(term3991177, term3991177.getClass(), "breakBad", -164529143);
        setBooleanField(term3991177, term3991177.getClass(), "isTrackSkip", false);
        setBooleanField(term3991177, term3991177.getClass(), "isHighScore", true);
        setBooleanField(term3991177, term3991177.getClass(), "isChallengeTrack", false);
        setIntField(term3991177, term3991177.getClass(), "challengeLife", 2067829508);
        setIntField(term3991177, term3991177.getClass(), "challengeRemain", -1566434030);
        setIntField(term3991177, term3991177.getClass(), "isAllPerfectPlus", 1293368144);
        term3991489 = new Integer(1299372454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3991489;
        callMethod(klass, "setSlideGood", argTypes, term3991177, args);
    }

};


