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

public class UserPlaylog_getPlaceName_12855513005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114751;

    public UserPlaylog_getPlaceName_12855513005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term114757 = new Long(7799452759993694308L);
        term114751 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term114753 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term114755 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term114771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114776 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114786 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term114751, term114751.getClass(), "id", 5953375436340093396L);
        setLongField(term114753, term114753.getClass(), "id", -7089384741512135431L);
        setLongField(term114755, term114755.getClass(), "id", 7207062884131909895L);
        setField(term114755, term114755.getClass(), "extId", term114757);
        setField(term114755, term114755.getClass(), "luid", "pcQcluzQgA");
        setIntField(term114772, term114772.getClass(), "year", 2016);
        setShortField(term114772, term114772.getClass(), "month", (short) 12);
        setShortField(term114772, term114772.getClass(), "day", (short) 21);
        setField(term114771, term114771.getClass(), "date", term114772);
        setByteField(term114776, term114776.getClass(), "hour", (byte) 14);
        setByteField(term114776, term114776.getClass(), "minute", (byte) 3);
        setByteField(term114776, term114776.getClass(), "second", (byte) 9);
        setIntField(term114776, term114776.getClass(), "nano", 805869273);
        setField(term114771, term114771.getClass(), "time", term114776);
        setField(term114755, term114755.getClass(), "registerTime", term114771);
        setIntField(term114782, term114782.getClass(), "year", 2011);
        setShortField(term114782, term114782.getClass(), "month", (short) 12);
        setShortField(term114782, term114782.getClass(), "day", (short) 31);
        setField(term114781, term114781.getClass(), "date", term114782);
        setByteField(term114786, term114786.getClass(), "hour", (byte) 6);
        setByteField(term114786, term114786.getClass(), "minute", (byte) 27);
        setByteField(term114786, term114786.getClass(), "second", (byte) 8);
        setIntField(term114786, term114786.getClass(), "nano", 782094318);
        setField(term114781, term114781.getClass(), "time", term114786);
        setField(term114755, term114755.getClass(), "accessTime", term114781);
        setField(term114753, term114753.getClass(), "card", term114755);
        setIntField(term114753, term114753.getClass(), "lastDataVersion", -1189499484);
        setField(term114753, term114753.getClass(), "userName", "iWOGNdtCLH");
        setIntField(term114753, term114753.getClass(), "point", -1149356121);
        setIntField(term114753, term114753.getClass(), "totalPoint", 858213742);
        setIntField(term114753, term114753.getClass(), "iconId", -418255260);
        setIntField(term114753, term114753.getClass(), "nameplateId", -510211158);
        setIntField(term114753, term114753.getClass(), "frameId", -1490379978);
        setIntField(term114753, term114753.getClass(), "trophyId", 1147276309);
        setIntField(term114753, term114753.getClass(), "playCount", 1672571869);
        setIntField(term114753, term114753.getClass(), "playVsCount", 1638519569);
        setIntField(term114753, term114753.getClass(), "playSyncCount", 136694863);
        setIntField(term114753, term114753.getClass(), "winCount", -2140607687);
        setIntField(term114753, term114753.getClass(), "helpCount", -61319889);
        setIntField(term114753, term114753.getClass(), "comboCount", 134375423);
        setIntField(term114753, term114753.getClass(), "feverCount", 1020472599);
        setIntField(term114753, term114753.getClass(), "totalHiScore", 1144072956);
        setIntField(term114753, term114753.getClass(), "totalEasyHighScore", 197317948);
        setIntField(term114753, term114753.getClass(), "totalBasicHighScore", 399945179);
        setIntField(term114753, term114753.getClass(), "totalAdvancedHighScore", -644046528);
        setIntField(term114753, term114753.getClass(), "totalExpertHighScore", -1351948033);
        setIntField(term114753, term114753.getClass(), "totalMasterHighScore", -1524640986);
        setIntField(term114753, term114753.getClass(), "totalReMasterHighScore", -738160808);
        setIntField(term114753, term114753.getClass(), "totalHighSync", 248369090);
        setIntField(term114753, term114753.getClass(), "totalEasySync", -1445735932);
        setIntField(term114753, term114753.getClass(), "totalBasicSync", 521137445);
        setIntField(term114753, term114753.getClass(), "totalAdvancedSync", -698809679);
        setIntField(term114753, term114753.getClass(), "totalExpertSync", -1066054710);
        setIntField(term114753, term114753.getClass(), "totalMasterSync", -1311716907);
        setIntField(term114753, term114753.getClass(), "totalReMasterSync", -1776759655);
        setIntField(term114753, term114753.getClass(), "playerRating", 315412021);
        setIntField(term114753, term114753.getClass(), "highestRating", 544921843);
        setIntField(term114753, term114753.getClass(), "rankAuthTailId", 1897901411);
        setField(term114753, term114753.getClass(), "eventWatchedDate", "KoDRiNjUMj");
        setField(term114753, term114753.getClass(), "webLimitDate", "LtnegjrHqS");
        setIntField(term114753, term114753.getClass(), "challengeTrackPhase", 569452386);
        setIntField(term114753, term114753.getClass(), "firstPlayBits", -480603898);
        setField(term114753, term114753.getClass(), "lastPlayDate", "iSrYZvDgVF");
        setIntField(term114753, term114753.getClass(), "lastPlaceId", 307838643);
        setField(term114753, term114753.getClass(), "lastPlaceName", "uVYuAEBgZy");
        setIntField(term114753, term114753.getClass(), "lastRegionId", -1377791183);
        setField(term114753, term114753.getClass(), "lastRegionName", "pOAxvXmQfD");
        setField(term114753, term114753.getClass(), "lastClientId", "mvWHHiGYmD");
        setField(term114753, term114753.getClass(), "lastCountryCode", "eZUuWCoERR");
        setIntField(term114753, term114753.getClass(), "eventPoint", -629472657);
        setIntField(term114753, term114753.getClass(), "totalLv", -1226697699);
        setIntField(term114753, term114753.getClass(), "lastLoginBonusDay", 64839447);
        setIntField(term114753, term114753.getClass(), "lastSurvivalBonusDay", 1212689906);
        setIntField(term114753, term114753.getClass(), "loginBonusLv", 1216809365);
        setField(term114751, term114751.getClass(), "user", term114753);
        setIntField(term114751, term114751.getClass(), "orderId", 1688807312);
        setLongField(term114751, term114751.getClass(), "sortNumber", 9005525882295990505L);
        setIntField(term114751, term114751.getClass(), "placeId", -835484494);
        setField(term114751, term114751.getClass(), "placeName", "AMeLarREbk");
        setField(term114751, term114751.getClass(), "country", "LQHAihGqFG");
        setIntField(term114751, term114751.getClass(), "regionId", 1984116081);
        setField(term114751, term114751.getClass(), "playDate", "XNHngduAPd");
        setField(term114751, term114751.getClass(), "userPlayDate", "ewowfKAPBz");
        setIntField(term114751, term114751.getClass(), "musicId", 81072289);
        setIntField(term114751, term114751.getClass(), "level", -1443196905);
        setIntField(term114751, term114751.getClass(), "gameMode", 1772559314);
        setIntField(term114751, term114751.getClass(), "rivalNum", 1617754544);
        setIntField(term114751, term114751.getClass(), "track", -227339856);
        setIntField(term114751, term114751.getClass(), "eventId", -1433941812);
        setBooleanField(term114751, term114751.getClass(), "isFreeToPlay", true);
        setIntField(term114751, term114751.getClass(), "playerRating", 67652341);
        setLongField(term114751, term114751.getClass(), "playedUserId1", -604910205679247392L);
        setField(term114751, term114751.getClass(), "playedUserName1", "yOYHYOdvNm");
        setIntField(term114751, term114751.getClass(), "playedMusicLevel1", 356090964);
        setLongField(term114751, term114751.getClass(), "playedUserId2", 2280240558714436788L);
        setField(term114751, term114751.getClass(), "playedUserName2", "RsOIgNcrMD");
        setIntField(term114751, term114751.getClass(), "playedMusicLevel2", 568147133);
        setLongField(term114751, term114751.getClass(), "playedUserId3", 9164041864010757052L);
        setField(term114751, term114751.getClass(), "playedUserName3", "JDwFepEsNs");
        setIntField(term114751, term114751.getClass(), "playedMusicLevel3", 662609201);
        setIntField(term114751, term114751.getClass(), "achievement", 1357782651);
        setIntField(term114751, term114751.getClass(), "score", -1974080449);
        setIntField(term114751, term114751.getClass(), "tapScore", 1163324538);
        setIntField(term114751, term114751.getClass(), "holdScore", -2133860489);
        setIntField(term114751, term114751.getClass(), "slideScore", -1690092644);
        setIntField(term114751, term114751.getClass(), "breakScore", 256360318);
        setIntField(term114751, term114751.getClass(), "syncRate", 236819556);
        setIntField(term114751, term114751.getClass(), "vsWin", -130760963);
        setBooleanField(term114751, term114751.getClass(), "isAllPerfect", true);
        setIntField(term114751, term114751.getClass(), "fullCombo", 1408650907);
        setIntField(term114751, term114751.getClass(), "maxFever", 1098819430);
        setIntField(term114751, term114751.getClass(), "maxCombo", 2056518673);
        setIntField(term114751, term114751.getClass(), "tapPerfect", 1515488022);
        setIntField(term114751, term114751.getClass(), "tapGreat", 562473019);
        setIntField(term114751, term114751.getClass(), "tapGood", -1080448263);
        setIntField(term114751, term114751.getClass(), "tapBad", 1351965644);
        setIntField(term114751, term114751.getClass(), "holdPerfect", 1883549199);
        setIntField(term114751, term114751.getClass(), "holdGreat", 314097266);
        setIntField(term114751, term114751.getClass(), "holdGood", -1445743731);
        setIntField(term114751, term114751.getClass(), "holdBad", -905630109);
        setIntField(term114751, term114751.getClass(), "slidePerfect", -155595665);
        setIntField(term114751, term114751.getClass(), "slideGreat", -1018854308);
        setIntField(term114751, term114751.getClass(), "slideGood", 1990277039);
        setIntField(term114751, term114751.getClass(), "slideBad", 95013950);
        setIntField(term114751, term114751.getClass(), "breakPerfect", 1625257088);
        setIntField(term114751, term114751.getClass(), "breakGreat", 1729285490);
        setIntField(term114751, term114751.getClass(), "breakGood", -289198012);
        setIntField(term114751, term114751.getClass(), "breakBad", -1733483597);
        setBooleanField(term114751, term114751.getClass(), "isTrackSkip", false);
        setBooleanField(term114751, term114751.getClass(), "isHighScore", false);
        setBooleanField(term114751, term114751.getClass(), "isChallengeTrack", false);
        setIntField(term114751, term114751.getClass(), "challengeLife", 926038542);
        setIntField(term114751, term114751.getClass(), "challengeRemain", -1364054021);
        setIntField(term114751, term114751.getClass(), "isAllPerfectPlus", -776881167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term114751, args);
    }

};


