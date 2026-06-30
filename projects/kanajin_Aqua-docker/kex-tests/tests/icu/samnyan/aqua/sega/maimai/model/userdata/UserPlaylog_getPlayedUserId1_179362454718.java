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

public class UserPlaylog_getPlayedUserId1_179362454718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120887;

    public UserPlaylog_getPlayedUserId1_179362454718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term120893 = new Long(-8303973304709662279L);
        term120887 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term120889 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term120891 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term120907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120922 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term120887, term120887.getClass(), "id", -366973868174666045L);
        setLongField(term120889, term120889.getClass(), "id", -7657074490059876332L);
        setLongField(term120891, term120891.getClass(), "id", -4773629433896348407L);
        setField(term120891, term120891.getClass(), "extId", term120893);
        setField(term120891, term120891.getClass(), "luid", "XhbGnImmgd");
        setIntField(term120908, term120908.getClass(), "year", 2014);
        setShortField(term120908, term120908.getClass(), "month", (short) 6);
        setShortField(term120908, term120908.getClass(), "day", (short) 27);
        setField(term120907, term120907.getClass(), "date", term120908);
        setByteField(term120912, term120912.getClass(), "hour", (byte) 12);
        setByteField(term120912, term120912.getClass(), "minute", (byte) 38);
        setByteField(term120912, term120912.getClass(), "second", (byte) 25);
        setIntField(term120912, term120912.getClass(), "nano", 969490220);
        setField(term120907, term120907.getClass(), "time", term120912);
        setField(term120891, term120891.getClass(), "registerTime", term120907);
        setIntField(term120918, term120918.getClass(), "year", 2011);
        setShortField(term120918, term120918.getClass(), "month", (short) 3);
        setShortField(term120918, term120918.getClass(), "day", (short) 10);
        setField(term120917, term120917.getClass(), "date", term120918);
        setByteField(term120922, term120922.getClass(), "hour", (byte) 17);
        setByteField(term120922, term120922.getClass(), "minute", (byte) 52);
        setByteField(term120922, term120922.getClass(), "second", (byte) 30);
        setIntField(term120922, term120922.getClass(), "nano", 491721919);
        setField(term120917, term120917.getClass(), "time", term120922);
        setField(term120891, term120891.getClass(), "accessTime", term120917);
        setField(term120889, term120889.getClass(), "card", term120891);
        setIntField(term120889, term120889.getClass(), "lastDataVersion", 1447852280);
        setField(term120889, term120889.getClass(), "userName", "UUTpuViRuV");
        setIntField(term120889, term120889.getClass(), "point", -405514470);
        setIntField(term120889, term120889.getClass(), "totalPoint", -1944960616);
        setIntField(term120889, term120889.getClass(), "iconId", 134129921);
        setIntField(term120889, term120889.getClass(), "nameplateId", 1074423492);
        setIntField(term120889, term120889.getClass(), "frameId", 1347101666);
        setIntField(term120889, term120889.getClass(), "trophyId", 1898176333);
        setIntField(term120889, term120889.getClass(), "playCount", 1538029461);
        setIntField(term120889, term120889.getClass(), "playVsCount", 95078217);
        setIntField(term120889, term120889.getClass(), "playSyncCount", -1362477279);
        setIntField(term120889, term120889.getClass(), "winCount", 509325750);
        setIntField(term120889, term120889.getClass(), "helpCount", -1449019304);
        setIntField(term120889, term120889.getClass(), "comboCount", -292778481);
        setIntField(term120889, term120889.getClass(), "feverCount", 1790535012);
        setIntField(term120889, term120889.getClass(), "totalHiScore", 517372938);
        setIntField(term120889, term120889.getClass(), "totalEasyHighScore", 270121185);
        setIntField(term120889, term120889.getClass(), "totalBasicHighScore", -1613798107);
        setIntField(term120889, term120889.getClass(), "totalAdvancedHighScore", 182501747);
        setIntField(term120889, term120889.getClass(), "totalExpertHighScore", 466948774);
        setIntField(term120889, term120889.getClass(), "totalMasterHighScore", 63133691);
        setIntField(term120889, term120889.getClass(), "totalReMasterHighScore", -1950250956);
        setIntField(term120889, term120889.getClass(), "totalHighSync", -1468847146);
        setIntField(term120889, term120889.getClass(), "totalEasySync", 316276289);
        setIntField(term120889, term120889.getClass(), "totalBasicSync", -2031076660);
        setIntField(term120889, term120889.getClass(), "totalAdvancedSync", 266845392);
        setIntField(term120889, term120889.getClass(), "totalExpertSync", -1493279078);
        setIntField(term120889, term120889.getClass(), "totalMasterSync", 639737443);
        setIntField(term120889, term120889.getClass(), "totalReMasterSync", 916435001);
        setIntField(term120889, term120889.getClass(), "playerRating", 589036561);
        setIntField(term120889, term120889.getClass(), "highestRating", 272900436);
        setIntField(term120889, term120889.getClass(), "rankAuthTailId", -514490601);
        setField(term120889, term120889.getClass(), "eventWatchedDate", "xNKBQkfPIU");
        setField(term120889, term120889.getClass(), "webLimitDate", "IaRILCkXUB");
        setIntField(term120889, term120889.getClass(), "challengeTrackPhase", -1010178423);
        setIntField(term120889, term120889.getClass(), "firstPlayBits", 938778978);
        setField(term120889, term120889.getClass(), "lastPlayDate", "XRaUSsHhJf");
        setIntField(term120889, term120889.getClass(), "lastPlaceId", -1314147994);
        setField(term120889, term120889.getClass(), "lastPlaceName", "ndknwPavsb");
        setIntField(term120889, term120889.getClass(), "lastRegionId", -1120741921);
        setField(term120889, term120889.getClass(), "lastRegionName", "XbwSBHmjuZ");
        setField(term120889, term120889.getClass(), "lastClientId", "vHdYsSmEmG");
        setField(term120889, term120889.getClass(), "lastCountryCode", "UDIVCqBmxp");
        setIntField(term120889, term120889.getClass(), "eventPoint", 1584813896);
        setIntField(term120889, term120889.getClass(), "totalLv", 678376088);
        setIntField(term120889, term120889.getClass(), "lastLoginBonusDay", -1372919168);
        setIntField(term120889, term120889.getClass(), "lastSurvivalBonusDay", -1947772440);
        setIntField(term120889, term120889.getClass(), "loginBonusLv", -1418556051);
        setField(term120887, term120887.getClass(), "user", term120889);
        setIntField(term120887, term120887.getClass(), "orderId", -336128698);
        setLongField(term120887, term120887.getClass(), "sortNumber", -5187796980288712037L);
        setIntField(term120887, term120887.getClass(), "placeId", 125498217);
        setField(term120887, term120887.getClass(), "placeName", "npyBQorcHP");
        setField(term120887, term120887.getClass(), "country", "pzvYCQwkoA");
        setIntField(term120887, term120887.getClass(), "regionId", 1952902014);
        setField(term120887, term120887.getClass(), "playDate", "TGLDiqWTkO");
        setField(term120887, term120887.getClass(), "userPlayDate", "NwjEUxXUkk");
        setIntField(term120887, term120887.getClass(), "musicId", -1288918594);
        setIntField(term120887, term120887.getClass(), "level", 1636943183);
        setIntField(term120887, term120887.getClass(), "gameMode", 342127359);
        setIntField(term120887, term120887.getClass(), "rivalNum", 539999937);
        setIntField(term120887, term120887.getClass(), "track", 310856051);
        setIntField(term120887, term120887.getClass(), "eventId", 1384079547);
        setBooleanField(term120887, term120887.getClass(), "isFreeToPlay", false);
        setIntField(term120887, term120887.getClass(), "playerRating", -1674866308);
        setLongField(term120887, term120887.getClass(), "playedUserId1", 238025331923627916L);
        setField(term120887, term120887.getClass(), "playedUserName1", "CFBoXISoRu");
        setIntField(term120887, term120887.getClass(), "playedMusicLevel1", -1810236008);
        setLongField(term120887, term120887.getClass(), "playedUserId2", -6163417416099720642L);
        setField(term120887, term120887.getClass(), "playedUserName2", "gRmiKAUyCW");
        setIntField(term120887, term120887.getClass(), "playedMusicLevel2", -1145916647);
        setLongField(term120887, term120887.getClass(), "playedUserId3", -4498877698180346473L);
        setField(term120887, term120887.getClass(), "playedUserName3", "rfXVAViErl");
        setIntField(term120887, term120887.getClass(), "playedMusicLevel3", -952656690);
        setIntField(term120887, term120887.getClass(), "achievement", -1864087046);
        setIntField(term120887, term120887.getClass(), "score", -450161434);
        setIntField(term120887, term120887.getClass(), "tapScore", 259091897);
        setIntField(term120887, term120887.getClass(), "holdScore", -157779882);
        setIntField(term120887, term120887.getClass(), "slideScore", 402378808);
        setIntField(term120887, term120887.getClass(), "breakScore", 355737852);
        setIntField(term120887, term120887.getClass(), "syncRate", -1259559367);
        setIntField(term120887, term120887.getClass(), "vsWin", 782057284);
        setBooleanField(term120887, term120887.getClass(), "isAllPerfect", true);
        setIntField(term120887, term120887.getClass(), "fullCombo", -1312026978);
        setIntField(term120887, term120887.getClass(), "maxFever", 327560526);
        setIntField(term120887, term120887.getClass(), "maxCombo", -1449195775);
        setIntField(term120887, term120887.getClass(), "tapPerfect", -1672891522);
        setIntField(term120887, term120887.getClass(), "tapGreat", 450527358);
        setIntField(term120887, term120887.getClass(), "tapGood", 1266563944);
        setIntField(term120887, term120887.getClass(), "tapBad", -1037900319);
        setIntField(term120887, term120887.getClass(), "holdPerfect", 1725853427);
        setIntField(term120887, term120887.getClass(), "holdGreat", -1280054116);
        setIntField(term120887, term120887.getClass(), "holdGood", -1336523486);
        setIntField(term120887, term120887.getClass(), "holdBad", -1709511631);
        setIntField(term120887, term120887.getClass(), "slidePerfect", 371774191);
        setIntField(term120887, term120887.getClass(), "slideGreat", 1533723632);
        setIntField(term120887, term120887.getClass(), "slideGood", -1563972078);
        setIntField(term120887, term120887.getClass(), "slideBad", 2067438905);
        setIntField(term120887, term120887.getClass(), "breakPerfect", 907155632);
        setIntField(term120887, term120887.getClass(), "breakGreat", 1020668073);
        setIntField(term120887, term120887.getClass(), "breakGood", -455157694);
        setIntField(term120887, term120887.getClass(), "breakBad", 1944477395);
        setBooleanField(term120887, term120887.getClass(), "isTrackSkip", false);
        setBooleanField(term120887, term120887.getClass(), "isHighScore", true);
        setBooleanField(term120887, term120887.getClass(), "isChallengeTrack", false);
        setIntField(term120887, term120887.getClass(), "challengeLife", -273262792);
        setIntField(term120887, term120887.getClass(), "challengeRemain", -468983435);
        setIntField(term120887, term120887.getClass(), "isAllPerfectPlus", -1977167838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId1", argTypes, term120887, args);
    }

};


