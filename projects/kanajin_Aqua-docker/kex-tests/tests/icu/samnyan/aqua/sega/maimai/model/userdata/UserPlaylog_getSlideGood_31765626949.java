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

public class UserPlaylog_getSlideGood_31765626949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135519;

    public UserPlaylog_getSlideGood_31765626949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term135525 = new Long(3104349415269466587L);
        term135519 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term135521 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term135523 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term135539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135544 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135549 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135550 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135554 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term135519, term135519.getClass(), "id", -3551818295265883412L);
        setLongField(term135521, term135521.getClass(), "id", -8031780876521881873L);
        setLongField(term135523, term135523.getClass(), "id", -8015150842907349869L);
        setField(term135523, term135523.getClass(), "extId", term135525);
        setField(term135523, term135523.getClass(), "luid", "PcRiAbKXvK");
        setIntField(term135540, term135540.getClass(), "year", 2011);
        setShortField(term135540, term135540.getClass(), "month", (short) 4);
        setShortField(term135540, term135540.getClass(), "day", (short) 14);
        setField(term135539, term135539.getClass(), "date", term135540);
        setByteField(term135544, term135544.getClass(), "hour", (byte) 4);
        setByteField(term135544, term135544.getClass(), "minute", (byte) 35);
        setByteField(term135544, term135544.getClass(), "second", (byte) 21);
        setIntField(term135544, term135544.getClass(), "nano", 578174822);
        setField(term135539, term135539.getClass(), "time", term135544);
        setField(term135523, term135523.getClass(), "registerTime", term135539);
        setIntField(term135550, term135550.getClass(), "year", 2028);
        setShortField(term135550, term135550.getClass(), "month", (short) 2);
        setShortField(term135550, term135550.getClass(), "day", (short) 8);
        setField(term135549, term135549.getClass(), "date", term135550);
        setByteField(term135554, term135554.getClass(), "hour", (byte) 9);
        setByteField(term135554, term135554.getClass(), "minute", (byte) 51);
        setByteField(term135554, term135554.getClass(), "second", (byte) 30);
        setIntField(term135554, term135554.getClass(), "nano", 433905289);
        setField(term135549, term135549.getClass(), "time", term135554);
        setField(term135523, term135523.getClass(), "accessTime", term135549);
        setField(term135521, term135521.getClass(), "card", term135523);
        setIntField(term135521, term135521.getClass(), "lastDataVersion", 2005322577);
        setField(term135521, term135521.getClass(), "userName", "EhjpwiDlaG");
        setIntField(term135521, term135521.getClass(), "point", -1186814529);
        setIntField(term135521, term135521.getClass(), "totalPoint", 1483573130);
        setIntField(term135521, term135521.getClass(), "iconId", 927223939);
        setIntField(term135521, term135521.getClass(), "nameplateId", -647830765);
        setIntField(term135521, term135521.getClass(), "frameId", 2133854614);
        setIntField(term135521, term135521.getClass(), "trophyId", 2120820625);
        setIntField(term135521, term135521.getClass(), "playCount", 1775824914);
        setIntField(term135521, term135521.getClass(), "playVsCount", 131919044);
        setIntField(term135521, term135521.getClass(), "playSyncCount", -1908209922);
        setIntField(term135521, term135521.getClass(), "winCount", -831821447);
        setIntField(term135521, term135521.getClass(), "helpCount", 1071805713);
        setIntField(term135521, term135521.getClass(), "comboCount", -258014704);
        setIntField(term135521, term135521.getClass(), "feverCount", 1010201759);
        setIntField(term135521, term135521.getClass(), "totalHiScore", 47387847);
        setIntField(term135521, term135521.getClass(), "totalEasyHighScore", -339675979);
        setIntField(term135521, term135521.getClass(), "totalBasicHighScore", 541697068);
        setIntField(term135521, term135521.getClass(), "totalAdvancedHighScore", -942757980);
        setIntField(term135521, term135521.getClass(), "totalExpertHighScore", 1228061281);
        setIntField(term135521, term135521.getClass(), "totalMasterHighScore", 1306691725);
        setIntField(term135521, term135521.getClass(), "totalReMasterHighScore", 57721881);
        setIntField(term135521, term135521.getClass(), "totalHighSync", -256700241);
        setIntField(term135521, term135521.getClass(), "totalEasySync", -1242840972);
        setIntField(term135521, term135521.getClass(), "totalBasicSync", 681981579);
        setIntField(term135521, term135521.getClass(), "totalAdvancedSync", 623545129);
        setIntField(term135521, term135521.getClass(), "totalExpertSync", 873477133);
        setIntField(term135521, term135521.getClass(), "totalMasterSync", -2112632680);
        setIntField(term135521, term135521.getClass(), "totalReMasterSync", -167983517);
        setIntField(term135521, term135521.getClass(), "playerRating", 631482306);
        setIntField(term135521, term135521.getClass(), "highestRating", -1016827606);
        setIntField(term135521, term135521.getClass(), "rankAuthTailId", -1832397774);
        setField(term135521, term135521.getClass(), "eventWatchedDate", "HowhKdqLBn");
        setField(term135521, term135521.getClass(), "webLimitDate", "FXwdarPRcu");
        setIntField(term135521, term135521.getClass(), "challengeTrackPhase", 2091980824);
        setIntField(term135521, term135521.getClass(), "firstPlayBits", 1881481825);
        setField(term135521, term135521.getClass(), "lastPlayDate", "HzWNDDgUtc");
        setIntField(term135521, term135521.getClass(), "lastPlaceId", 437079367);
        setField(term135521, term135521.getClass(), "lastPlaceName", "umqvxozDpq");
        setIntField(term135521, term135521.getClass(), "lastRegionId", 224578330);
        setField(term135521, term135521.getClass(), "lastRegionName", "HieTCBVeDD");
        setField(term135521, term135521.getClass(), "lastClientId", "cTSwYlchXv");
        setField(term135521, term135521.getClass(), "lastCountryCode", "QbalcMEEdv");
        setIntField(term135521, term135521.getClass(), "eventPoint", 1069993938);
        setIntField(term135521, term135521.getClass(), "totalLv", -197919007);
        setIntField(term135521, term135521.getClass(), "lastLoginBonusDay", -581814935);
        setIntField(term135521, term135521.getClass(), "lastSurvivalBonusDay", -884782980);
        setIntField(term135521, term135521.getClass(), "loginBonusLv", 435645173);
        setField(term135519, term135519.getClass(), "user", term135521);
        setIntField(term135519, term135519.getClass(), "orderId", -2127352323);
        setLongField(term135519, term135519.getClass(), "sortNumber", 9132190239280924497L);
        setIntField(term135519, term135519.getClass(), "placeId", 2097474452);
        setField(term135519, term135519.getClass(), "placeName", "xiYIPdzlXo");
        setField(term135519, term135519.getClass(), "country", "MYonccVvzc");
        setIntField(term135519, term135519.getClass(), "regionId", -1540959741);
        setField(term135519, term135519.getClass(), "playDate", "cxwnnBgfmJ");
        setField(term135519, term135519.getClass(), "userPlayDate", "tNXQltoRar");
        setIntField(term135519, term135519.getClass(), "musicId", -415034768);
        setIntField(term135519, term135519.getClass(), "level", -747334893);
        setIntField(term135519, term135519.getClass(), "gameMode", 1470042937);
        setIntField(term135519, term135519.getClass(), "rivalNum", 1843322163);
        setIntField(term135519, term135519.getClass(), "track", -1207189934);
        setIntField(term135519, term135519.getClass(), "eventId", -584179158);
        setBooleanField(term135519, term135519.getClass(), "isFreeToPlay", true);
        setIntField(term135519, term135519.getClass(), "playerRating", 659001580);
        setLongField(term135519, term135519.getClass(), "playedUserId1", -8116658799088527026L);
        setField(term135519, term135519.getClass(), "playedUserName1", "ALdRRCOlhZ");
        setIntField(term135519, term135519.getClass(), "playedMusicLevel1", -1920579818);
        setLongField(term135519, term135519.getClass(), "playedUserId2", 8485617704048210611L);
        setField(term135519, term135519.getClass(), "playedUserName2", "vXmDfMgmHu");
        setIntField(term135519, term135519.getClass(), "playedMusicLevel2", 830897826);
        setLongField(term135519, term135519.getClass(), "playedUserId3", -2343035648899467663L);
        setField(term135519, term135519.getClass(), "playedUserName3", "fyRJvzWMpe");
        setIntField(term135519, term135519.getClass(), "playedMusicLevel3", -1718330826);
        setIntField(term135519, term135519.getClass(), "achievement", 1554100569);
        setIntField(term135519, term135519.getClass(), "score", 1067721242);
        setIntField(term135519, term135519.getClass(), "tapScore", 263716207);
        setIntField(term135519, term135519.getClass(), "holdScore", -2069127270);
        setIntField(term135519, term135519.getClass(), "slideScore", 603147128);
        setIntField(term135519, term135519.getClass(), "breakScore", -1408041415);
        setIntField(term135519, term135519.getClass(), "syncRate", 586059301);
        setIntField(term135519, term135519.getClass(), "vsWin", 729168621);
        setBooleanField(term135519, term135519.getClass(), "isAllPerfect", true);
        setIntField(term135519, term135519.getClass(), "fullCombo", -263302657);
        setIntField(term135519, term135519.getClass(), "maxFever", 777129818);
        setIntField(term135519, term135519.getClass(), "maxCombo", 519921186);
        setIntField(term135519, term135519.getClass(), "tapPerfect", -1237516288);
        setIntField(term135519, term135519.getClass(), "tapGreat", 306022424);
        setIntField(term135519, term135519.getClass(), "tapGood", 1431819767);
        setIntField(term135519, term135519.getClass(), "tapBad", 2057411208);
        setIntField(term135519, term135519.getClass(), "holdPerfect", -1643323104);
        setIntField(term135519, term135519.getClass(), "holdGreat", -1959047852);
        setIntField(term135519, term135519.getClass(), "holdGood", 1163144703);
        setIntField(term135519, term135519.getClass(), "holdBad", -625762476);
        setIntField(term135519, term135519.getClass(), "slidePerfect", 1063514775);
        setIntField(term135519, term135519.getClass(), "slideGreat", -1472940834);
        setIntField(term135519, term135519.getClass(), "slideGood", -1001789444);
        setIntField(term135519, term135519.getClass(), "slideBad", -732724305);
        setIntField(term135519, term135519.getClass(), "breakPerfect", -1028873607);
        setIntField(term135519, term135519.getClass(), "breakGreat", 315251699);
        setIntField(term135519, term135519.getClass(), "breakGood", 507924600);
        setIntField(term135519, term135519.getClass(), "breakBad", -2073979004);
        setBooleanField(term135519, term135519.getClass(), "isTrackSkip", true);
        setBooleanField(term135519, term135519.getClass(), "isHighScore", true);
        setBooleanField(term135519, term135519.getClass(), "isChallengeTrack", false);
        setIntField(term135519, term135519.getClass(), "challengeLife", -137484132);
        setIntField(term135519, term135519.getClass(), "challengeRemain", -836521071);
        setIntField(term135519, term135519.getClass(), "isAllPerfectPlus", -1451275875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideGood", argTypes, term135519, args);
    }

};


