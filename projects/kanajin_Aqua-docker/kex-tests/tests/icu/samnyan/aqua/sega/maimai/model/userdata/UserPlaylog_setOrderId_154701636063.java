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

public class UserPlaylog_setOrderId_154701636063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142393;
     Object term142705;

    public UserPlaylog_setOrderId_154701636063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term142399 = new Long(-1223573843683081410L);
        term142393 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term142395 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term142397 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term142413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142418 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142428 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term142393, term142393.getClass(), "id", 1182124670479030227L);
        setLongField(term142395, term142395.getClass(), "id", -7781300974767589244L);
        setLongField(term142397, term142397.getClass(), "id", -1751226545925422063L);
        setField(term142397, term142397.getClass(), "extId", term142399);
        setField(term142397, term142397.getClass(), "luid", "XPrRiBUedX");
        setIntField(term142414, term142414.getClass(), "year", 2016);
        setShortField(term142414, term142414.getClass(), "month", (short) 4);
        setShortField(term142414, term142414.getClass(), "day", (short) 6);
        setField(term142413, term142413.getClass(), "date", term142414);
        setByteField(term142418, term142418.getClass(), "hour", (byte) 11);
        setByteField(term142418, term142418.getClass(), "minute", (byte) 33);
        setByteField(term142418, term142418.getClass(), "second", (byte) 12);
        setIntField(term142418, term142418.getClass(), "nano", 167392252);
        setField(term142413, term142413.getClass(), "time", term142418);
        setField(term142397, term142397.getClass(), "registerTime", term142413);
        setIntField(term142424, term142424.getClass(), "year", 2014);
        setShortField(term142424, term142424.getClass(), "month", (short) 7);
        setShortField(term142424, term142424.getClass(), "day", (short) 24);
        setField(term142423, term142423.getClass(), "date", term142424);
        setByteField(term142428, term142428.getClass(), "hour", (byte) 5);
        setByteField(term142428, term142428.getClass(), "minute", (byte) 31);
        setByteField(term142428, term142428.getClass(), "second", (byte) 45);
        setIntField(term142428, term142428.getClass(), "nano", 932508724);
        setField(term142423, term142423.getClass(), "time", term142428);
        setField(term142397, term142397.getClass(), "accessTime", term142423);
        setField(term142395, term142395.getClass(), "card", term142397);
        setIntField(term142395, term142395.getClass(), "lastDataVersion", -1185477999);
        setField(term142395, term142395.getClass(), "userName", "kultXgiMsw");
        setIntField(term142395, term142395.getClass(), "point", -272655448);
        setIntField(term142395, term142395.getClass(), "totalPoint", -1475606830);
        setIntField(term142395, term142395.getClass(), "iconId", -1614821834);
        setIntField(term142395, term142395.getClass(), "nameplateId", -1644940581);
        setIntField(term142395, term142395.getClass(), "frameId", 1709154213);
        setIntField(term142395, term142395.getClass(), "trophyId", -218516880);
        setIntField(term142395, term142395.getClass(), "playCount", 2098781553);
        setIntField(term142395, term142395.getClass(), "playVsCount", 920929867);
        setIntField(term142395, term142395.getClass(), "playSyncCount", 1453496285);
        setIntField(term142395, term142395.getClass(), "winCount", 641216542);
        setIntField(term142395, term142395.getClass(), "helpCount", -117150229);
        setIntField(term142395, term142395.getClass(), "comboCount", -1085948653);
        setIntField(term142395, term142395.getClass(), "feverCount", 644117590);
        setIntField(term142395, term142395.getClass(), "totalHiScore", -1777457867);
        setIntField(term142395, term142395.getClass(), "totalEasyHighScore", 1119855029);
        setIntField(term142395, term142395.getClass(), "totalBasicHighScore", -296134542);
        setIntField(term142395, term142395.getClass(), "totalAdvancedHighScore", 1377019740);
        setIntField(term142395, term142395.getClass(), "totalExpertHighScore", 327476744);
        setIntField(term142395, term142395.getClass(), "totalMasterHighScore", -508705336);
        setIntField(term142395, term142395.getClass(), "totalReMasterHighScore", 1034385825);
        setIntField(term142395, term142395.getClass(), "totalHighSync", -1420297071);
        setIntField(term142395, term142395.getClass(), "totalEasySync", 211681645);
        setIntField(term142395, term142395.getClass(), "totalBasicSync", -1657976520);
        setIntField(term142395, term142395.getClass(), "totalAdvancedSync", 1474921203);
        setIntField(term142395, term142395.getClass(), "totalExpertSync", 73878857);
        setIntField(term142395, term142395.getClass(), "totalMasterSync", -447250309);
        setIntField(term142395, term142395.getClass(), "totalReMasterSync", -178193495);
        setIntField(term142395, term142395.getClass(), "playerRating", 2143659831);
        setIntField(term142395, term142395.getClass(), "highestRating", -1837062636);
        setIntField(term142395, term142395.getClass(), "rankAuthTailId", -2041717100);
        setField(term142395, term142395.getClass(), "eventWatchedDate", "invWIgTrSn");
        setField(term142395, term142395.getClass(), "webLimitDate", "tdDWYXQBpB");
        setIntField(term142395, term142395.getClass(), "challengeTrackPhase", 2125086466);
        setIntField(term142395, term142395.getClass(), "firstPlayBits", 896387936);
        setField(term142395, term142395.getClass(), "lastPlayDate", "yLbSZvdjZX");
        setIntField(term142395, term142395.getClass(), "lastPlaceId", 1820045723);
        setField(term142395, term142395.getClass(), "lastPlaceName", "FhCGxrukXm");
        setIntField(term142395, term142395.getClass(), "lastRegionId", 1832320421);
        setField(term142395, term142395.getClass(), "lastRegionName", "KAmjFnlvKU");
        setField(term142395, term142395.getClass(), "lastClientId", "VKpNTpPbui");
        setField(term142395, term142395.getClass(), "lastCountryCode", "TuzuoEoycc");
        setIntField(term142395, term142395.getClass(), "eventPoint", -2077745055);
        setIntField(term142395, term142395.getClass(), "totalLv", 806903399);
        setIntField(term142395, term142395.getClass(), "lastLoginBonusDay", 325287087);
        setIntField(term142395, term142395.getClass(), "lastSurvivalBonusDay", -43935060);
        setIntField(term142395, term142395.getClass(), "loginBonusLv", -1302688690);
        setField(term142393, term142393.getClass(), "user", term142395);
        setIntField(term142393, term142393.getClass(), "orderId", -564901008);
        setLongField(term142393, term142393.getClass(), "sortNumber", 8004140060064605966L);
        setIntField(term142393, term142393.getClass(), "placeId", -219093089);
        setField(term142393, term142393.getClass(), "placeName", "LXWldHIZNy");
        setField(term142393, term142393.getClass(), "country", "BATrPAXgpa");
        setIntField(term142393, term142393.getClass(), "regionId", -2028403078);
        setField(term142393, term142393.getClass(), "playDate", "vgwMeHgaql");
        setField(term142393, term142393.getClass(), "userPlayDate", "apRNMfAeJs");
        setIntField(term142393, term142393.getClass(), "musicId", 558371378);
        setIntField(term142393, term142393.getClass(), "level", 1822911019);
        setIntField(term142393, term142393.getClass(), "gameMode", -534095671);
        setIntField(term142393, term142393.getClass(), "rivalNum", -1534777670);
        setIntField(term142393, term142393.getClass(), "track", -2005406967);
        setIntField(term142393, term142393.getClass(), "eventId", -822537859);
        setBooleanField(term142393, term142393.getClass(), "isFreeToPlay", false);
        setIntField(term142393, term142393.getClass(), "playerRating", 1119061107);
        setLongField(term142393, term142393.getClass(), "playedUserId1", 5918878276163368150L);
        setField(term142393, term142393.getClass(), "playedUserName1", "xXjFLOrnwn");
        setIntField(term142393, term142393.getClass(), "playedMusicLevel1", -1919220943);
        setLongField(term142393, term142393.getClass(), "playedUserId2", -7624173005251704961L);
        setField(term142393, term142393.getClass(), "playedUserName2", "EwHXheApdJ");
        setIntField(term142393, term142393.getClass(), "playedMusicLevel2", 1308178262);
        setLongField(term142393, term142393.getClass(), "playedUserId3", 2044380118626071125L);
        setField(term142393, term142393.getClass(), "playedUserName3", "FSxGuVZthC");
        setIntField(term142393, term142393.getClass(), "playedMusicLevel3", 1564520542);
        setIntField(term142393, term142393.getClass(), "achievement", 1387355611);
        setIntField(term142393, term142393.getClass(), "score", -751672506);
        setIntField(term142393, term142393.getClass(), "tapScore", 1204529239);
        setIntField(term142393, term142393.getClass(), "holdScore", 1225429252);
        setIntField(term142393, term142393.getClass(), "slideScore", -2032958068);
        setIntField(term142393, term142393.getClass(), "breakScore", 1067007941);
        setIntField(term142393, term142393.getClass(), "syncRate", -1416820614);
        setIntField(term142393, term142393.getClass(), "vsWin", -169661887);
        setBooleanField(term142393, term142393.getClass(), "isAllPerfect", true);
        setIntField(term142393, term142393.getClass(), "fullCombo", 1700120818);
        setIntField(term142393, term142393.getClass(), "maxFever", 558238943);
        setIntField(term142393, term142393.getClass(), "maxCombo", -1097705713);
        setIntField(term142393, term142393.getClass(), "tapPerfect", 618373929);
        setIntField(term142393, term142393.getClass(), "tapGreat", -1394505936);
        setIntField(term142393, term142393.getClass(), "tapGood", -19521419);
        setIntField(term142393, term142393.getClass(), "tapBad", 1204448062);
        setIntField(term142393, term142393.getClass(), "holdPerfect", -513774345);
        setIntField(term142393, term142393.getClass(), "holdGreat", -1872752847);
        setIntField(term142393, term142393.getClass(), "holdGood", 580237461);
        setIntField(term142393, term142393.getClass(), "holdBad", -1473031622);
        setIntField(term142393, term142393.getClass(), "slidePerfect", 1304762160);
        setIntField(term142393, term142393.getClass(), "slideGreat", 944524029);
        setIntField(term142393, term142393.getClass(), "slideGood", -744266172);
        setIntField(term142393, term142393.getClass(), "slideBad", 1703599286);
        setIntField(term142393, term142393.getClass(), "breakPerfect", 1316405768);
        setIntField(term142393, term142393.getClass(), "breakGreat", 639847501);
        setIntField(term142393, term142393.getClass(), "breakGood", -1147608963);
        setIntField(term142393, term142393.getClass(), "breakBad", 544608152);
        setBooleanField(term142393, term142393.getClass(), "isTrackSkip", true);
        setBooleanField(term142393, term142393.getClass(), "isHighScore", false);
        setBooleanField(term142393, term142393.getClass(), "isChallengeTrack", true);
        setIntField(term142393, term142393.getClass(), "challengeLife", -973548795);
        setIntField(term142393, term142393.getClass(), "challengeRemain", -2005365152);
        setIntField(term142393, term142393.getClass(), "isAllPerfectPlus", 1841267577);
        term142705 = new Integer(-1696437268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term142705;
        callMethod(klass, "setOrderId", argTypes, term142393, args);
    }

};


