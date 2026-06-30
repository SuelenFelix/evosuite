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

public class UserPlaylog_setBreakBad_941985319115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167181;
     Object term167493;

    public UserPlaylog_setBreakBad_941985319115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term167187 = new Long(6542357174275680335L);
        term167181 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term167183 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term167185 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term167201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167206 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167216 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term167181, term167181.getClass(), "id", -3201501634740088518L);
        setLongField(term167183, term167183.getClass(), "id", -2456846159547925075L);
        setLongField(term167185, term167185.getClass(), "id", 5303304865916931742L);
        setField(term167185, term167185.getClass(), "extId", term167187);
        setField(term167185, term167185.getClass(), "luid", "eevshnfTuP");
        setIntField(term167202, term167202.getClass(), "year", 2013);
        setShortField(term167202, term167202.getClass(), "month", (short) 5);
        setShortField(term167202, term167202.getClass(), "day", (short) 23);
        setField(term167201, term167201.getClass(), "date", term167202);
        setByteField(term167206, term167206.getClass(), "hour", (byte) 17);
        setByteField(term167206, term167206.getClass(), "minute", (byte) 43);
        setByteField(term167206, term167206.getClass(), "second", (byte) 25);
        setIntField(term167206, term167206.getClass(), "nano", 472658100);
        setField(term167201, term167201.getClass(), "time", term167206);
        setField(term167185, term167185.getClass(), "registerTime", term167201);
        setIntField(term167212, term167212.getClass(), "year", 2026);
        setShortField(term167212, term167212.getClass(), "month", (short) 8);
        setShortField(term167212, term167212.getClass(), "day", (short) 30);
        setField(term167211, term167211.getClass(), "date", term167212);
        setByteField(term167216, term167216.getClass(), "hour", (byte) 23);
        setByteField(term167216, term167216.getClass(), "minute", (byte) 9);
        setByteField(term167216, term167216.getClass(), "second", (byte) 53);
        setIntField(term167216, term167216.getClass(), "nano", 748186544);
        setField(term167211, term167211.getClass(), "time", term167216);
        setField(term167185, term167185.getClass(), "accessTime", term167211);
        setField(term167183, term167183.getClass(), "card", term167185);
        setIntField(term167183, term167183.getClass(), "lastDataVersion", -1663104647);
        setField(term167183, term167183.getClass(), "userName", "HzOxmBbucP");
        setIntField(term167183, term167183.getClass(), "point", 1718314820);
        setIntField(term167183, term167183.getClass(), "totalPoint", 58895993);
        setIntField(term167183, term167183.getClass(), "iconId", 42775553);
        setIntField(term167183, term167183.getClass(), "nameplateId", -1057940922);
        setIntField(term167183, term167183.getClass(), "frameId", -795282975);
        setIntField(term167183, term167183.getClass(), "trophyId", -1493058860);
        setIntField(term167183, term167183.getClass(), "playCount", 443468642);
        setIntField(term167183, term167183.getClass(), "playVsCount", -333952729);
        setIntField(term167183, term167183.getClass(), "playSyncCount", -1270125435);
        setIntField(term167183, term167183.getClass(), "winCount", -1251632947);
        setIntField(term167183, term167183.getClass(), "helpCount", 181139652);
        setIntField(term167183, term167183.getClass(), "comboCount", -1467803523);
        setIntField(term167183, term167183.getClass(), "feverCount", 547230339);
        setIntField(term167183, term167183.getClass(), "totalHiScore", -1005776001);
        setIntField(term167183, term167183.getClass(), "totalEasyHighScore", 1007567116);
        setIntField(term167183, term167183.getClass(), "totalBasicHighScore", 1965122193);
        setIntField(term167183, term167183.getClass(), "totalAdvancedHighScore", -492351455);
        setIntField(term167183, term167183.getClass(), "totalExpertHighScore", -389346209);
        setIntField(term167183, term167183.getClass(), "totalMasterHighScore", 1407736990);
        setIntField(term167183, term167183.getClass(), "totalReMasterHighScore", 735553736);
        setIntField(term167183, term167183.getClass(), "totalHighSync", 1047147459);
        setIntField(term167183, term167183.getClass(), "totalEasySync", -376832115);
        setIntField(term167183, term167183.getClass(), "totalBasicSync", 1011386146);
        setIntField(term167183, term167183.getClass(), "totalAdvancedSync", -1640259051);
        setIntField(term167183, term167183.getClass(), "totalExpertSync", -32813752);
        setIntField(term167183, term167183.getClass(), "totalMasterSync", -558696084);
        setIntField(term167183, term167183.getClass(), "totalReMasterSync", -2042493045);
        setIntField(term167183, term167183.getClass(), "playerRating", 1592179886);
        setIntField(term167183, term167183.getClass(), "highestRating", -194404429);
        setIntField(term167183, term167183.getClass(), "rankAuthTailId", 848679284);
        setField(term167183, term167183.getClass(), "eventWatchedDate", "lVuUoDaGSk");
        setField(term167183, term167183.getClass(), "webLimitDate", "cuNrapAQtZ");
        setIntField(term167183, term167183.getClass(), "challengeTrackPhase", -507988907);
        setIntField(term167183, term167183.getClass(), "firstPlayBits", -1258125566);
        setField(term167183, term167183.getClass(), "lastPlayDate", "fCiCxxhDyR");
        setIntField(term167183, term167183.getClass(), "lastPlaceId", 790792462);
        setField(term167183, term167183.getClass(), "lastPlaceName", "AseuIhxdgC");
        setIntField(term167183, term167183.getClass(), "lastRegionId", -308691386);
        setField(term167183, term167183.getClass(), "lastRegionName", "JXKflOoAwA");
        setField(term167183, term167183.getClass(), "lastClientId", "sqUthQtpCU");
        setField(term167183, term167183.getClass(), "lastCountryCode", "heMCJQtnSe");
        setIntField(term167183, term167183.getClass(), "eventPoint", 227145741);
        setIntField(term167183, term167183.getClass(), "totalLv", 1501443049);
        setIntField(term167183, term167183.getClass(), "lastLoginBonusDay", -1827552118);
        setIntField(term167183, term167183.getClass(), "lastSurvivalBonusDay", -1948608768);
        setIntField(term167183, term167183.getClass(), "loginBonusLv", 631446038);
        setField(term167181, term167181.getClass(), "user", term167183);
        setIntField(term167181, term167181.getClass(), "orderId", -929321443);
        setLongField(term167181, term167181.getClass(), "sortNumber", 3743553196561690809L);
        setIntField(term167181, term167181.getClass(), "placeId", -607327509);
        setField(term167181, term167181.getClass(), "placeName", "nozhcagtoi");
        setField(term167181, term167181.getClass(), "country", "UAotjofyqR");
        setIntField(term167181, term167181.getClass(), "regionId", -834120238);
        setField(term167181, term167181.getClass(), "playDate", "ZVxspVELsB");
        setField(term167181, term167181.getClass(), "userPlayDate", "lwBTtSWyCb");
        setIntField(term167181, term167181.getClass(), "musicId", -1255354455);
        setIntField(term167181, term167181.getClass(), "level", 1249242856);
        setIntField(term167181, term167181.getClass(), "gameMode", -190048990);
        setIntField(term167181, term167181.getClass(), "rivalNum", -1935429679);
        setIntField(term167181, term167181.getClass(), "track", -554673891);
        setIntField(term167181, term167181.getClass(), "eventId", -251032545);
        setBooleanField(term167181, term167181.getClass(), "isFreeToPlay", false);
        setIntField(term167181, term167181.getClass(), "playerRating", 1189578043);
        setLongField(term167181, term167181.getClass(), "playedUserId1", -4100683915919317973L);
        setField(term167181, term167181.getClass(), "playedUserName1", "jalAJUuHgn");
        setIntField(term167181, term167181.getClass(), "playedMusicLevel1", 134993418);
        setLongField(term167181, term167181.getClass(), "playedUserId2", -4411561243835140657L);
        setField(term167181, term167181.getClass(), "playedUserName2", "KqPWpTvDAg");
        setIntField(term167181, term167181.getClass(), "playedMusicLevel2", 899329896);
        setLongField(term167181, term167181.getClass(), "playedUserId3", 8046359617233364561L);
        setField(term167181, term167181.getClass(), "playedUserName3", "zhxNzTDkbQ");
        setIntField(term167181, term167181.getClass(), "playedMusicLevel3", 1969467726);
        setIntField(term167181, term167181.getClass(), "achievement", -294880903);
        setIntField(term167181, term167181.getClass(), "score", 2088678362);
        setIntField(term167181, term167181.getClass(), "tapScore", 885425637);
        setIntField(term167181, term167181.getClass(), "holdScore", 1462433844);
        setIntField(term167181, term167181.getClass(), "slideScore", 1015647678);
        setIntField(term167181, term167181.getClass(), "breakScore", 602816125);
        setIntField(term167181, term167181.getClass(), "syncRate", 1795040343);
        setIntField(term167181, term167181.getClass(), "vsWin", -587672463);
        setBooleanField(term167181, term167181.getClass(), "isAllPerfect", true);
        setIntField(term167181, term167181.getClass(), "fullCombo", -1766502608);
        setIntField(term167181, term167181.getClass(), "maxFever", -861754909);
        setIntField(term167181, term167181.getClass(), "maxCombo", 1215454509);
        setIntField(term167181, term167181.getClass(), "tapPerfect", 2016511613);
        setIntField(term167181, term167181.getClass(), "tapGreat", -1900550630);
        setIntField(term167181, term167181.getClass(), "tapGood", -406153526);
        setIntField(term167181, term167181.getClass(), "tapBad", -1372314617);
        setIntField(term167181, term167181.getClass(), "holdPerfect", -1217148452);
        setIntField(term167181, term167181.getClass(), "holdGreat", 581630479);
        setIntField(term167181, term167181.getClass(), "holdGood", 966233608);
        setIntField(term167181, term167181.getClass(), "holdBad", 177375352);
        setIntField(term167181, term167181.getClass(), "slidePerfect", -291982705);
        setIntField(term167181, term167181.getClass(), "slideGreat", -456051628);
        setIntField(term167181, term167181.getClass(), "slideGood", 1532386600);
        setIntField(term167181, term167181.getClass(), "slideBad", 1360468237);
        setIntField(term167181, term167181.getClass(), "breakPerfect", 1305439693);
        setIntField(term167181, term167181.getClass(), "breakGreat", 2138637439);
        setIntField(term167181, term167181.getClass(), "breakGood", 517482553);
        setIntField(term167181, term167181.getClass(), "breakBad", -71896434);
        setBooleanField(term167181, term167181.getClass(), "isTrackSkip", true);
        setBooleanField(term167181, term167181.getClass(), "isHighScore", true);
        setBooleanField(term167181, term167181.getClass(), "isChallengeTrack", false);
        setIntField(term167181, term167181.getClass(), "challengeLife", -2115511822);
        setIntField(term167181, term167181.getClass(), "challengeRemain", -1506505893);
        setIntField(term167181, term167181.getClass(), "isAllPerfectPlus", -1032174367);
        term167493 = new Integer(-1888551037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term167493;
        callMethod(klass, "setBreakBad", argTypes, term167181, args);
    }

};


