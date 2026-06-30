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

public class UserPlaylog_setMusicId_76529390571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146265;
     Object term146577;

    public UserPlaylog_setMusicId_76529390571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146271 = new Long(185544001230120339L);
        term146265 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term146267 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term146269 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term146285 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146286 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146290 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146300 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term146265, term146265.getClass(), "id", -6427825980816337085L);
        setLongField(term146267, term146267.getClass(), "id", -4544154238206615974L);
        setLongField(term146269, term146269.getClass(), "id", -8215564577884889289L);
        setField(term146269, term146269.getClass(), "extId", term146271);
        setField(term146269, term146269.getClass(), "luid", "KJOrIBIJCp");
        setIntField(term146286, term146286.getClass(), "year", 2025);
        setShortField(term146286, term146286.getClass(), "month", (short) 2);
        setShortField(term146286, term146286.getClass(), "day", (short) 6);
        setField(term146285, term146285.getClass(), "date", term146286);
        setByteField(term146290, term146290.getClass(), "hour", (byte) 14);
        setByteField(term146290, term146290.getClass(), "minute", (byte) 28);
        setByteField(term146290, term146290.getClass(), "second", (byte) 25);
        setIntField(term146290, term146290.getClass(), "nano", 103816032);
        setField(term146285, term146285.getClass(), "time", term146290);
        setField(term146269, term146269.getClass(), "registerTime", term146285);
        setIntField(term146296, term146296.getClass(), "year", 2024);
        setShortField(term146296, term146296.getClass(), "month", (short) 7);
        setShortField(term146296, term146296.getClass(), "day", (short) 11);
        setField(term146295, term146295.getClass(), "date", term146296);
        setByteField(term146300, term146300.getClass(), "hour", (byte) 0);
        setByteField(term146300, term146300.getClass(), "minute", (byte) 35);
        setByteField(term146300, term146300.getClass(), "second", (byte) 43);
        setIntField(term146300, term146300.getClass(), "nano", 994892189);
        setField(term146295, term146295.getClass(), "time", term146300);
        setField(term146269, term146269.getClass(), "accessTime", term146295);
        setField(term146267, term146267.getClass(), "card", term146269);
        setIntField(term146267, term146267.getClass(), "lastDataVersion", -2032346482);
        setField(term146267, term146267.getClass(), "userName", "LHDRljWYoi");
        setIntField(term146267, term146267.getClass(), "point", 373546488);
        setIntField(term146267, term146267.getClass(), "totalPoint", -944589693);
        setIntField(term146267, term146267.getClass(), "iconId", 1958138136);
        setIntField(term146267, term146267.getClass(), "nameplateId", 1632154076);
        setIntField(term146267, term146267.getClass(), "frameId", 204790228);
        setIntField(term146267, term146267.getClass(), "trophyId", -2132870644);
        setIntField(term146267, term146267.getClass(), "playCount", 319578880);
        setIntField(term146267, term146267.getClass(), "playVsCount", -1301385941);
        setIntField(term146267, term146267.getClass(), "playSyncCount", -1433539567);
        setIntField(term146267, term146267.getClass(), "winCount", -988966734);
        setIntField(term146267, term146267.getClass(), "helpCount", -1429192604);
        setIntField(term146267, term146267.getClass(), "comboCount", 721488973);
        setIntField(term146267, term146267.getClass(), "feverCount", 1129309561);
        setIntField(term146267, term146267.getClass(), "totalHiScore", -1834282676);
        setIntField(term146267, term146267.getClass(), "totalEasyHighScore", -2013430786);
        setIntField(term146267, term146267.getClass(), "totalBasicHighScore", -420274573);
        setIntField(term146267, term146267.getClass(), "totalAdvancedHighScore", -223726106);
        setIntField(term146267, term146267.getClass(), "totalExpertHighScore", 495426369);
        setIntField(term146267, term146267.getClass(), "totalMasterHighScore", 1614607328);
        setIntField(term146267, term146267.getClass(), "totalReMasterHighScore", 1656951009);
        setIntField(term146267, term146267.getClass(), "totalHighSync", 1159603940);
        setIntField(term146267, term146267.getClass(), "totalEasySync", 2041979999);
        setIntField(term146267, term146267.getClass(), "totalBasicSync", 623036088);
        setIntField(term146267, term146267.getClass(), "totalAdvancedSync", 1236350177);
        setIntField(term146267, term146267.getClass(), "totalExpertSync", -1563911019);
        setIntField(term146267, term146267.getClass(), "totalMasterSync", 393245162);
        setIntField(term146267, term146267.getClass(), "totalReMasterSync", -1938335403);
        setIntField(term146267, term146267.getClass(), "playerRating", -1518620423);
        setIntField(term146267, term146267.getClass(), "highestRating", -250838827);
        setIntField(term146267, term146267.getClass(), "rankAuthTailId", -1306980616);
        setField(term146267, term146267.getClass(), "eventWatchedDate", "buQOGnBPlD");
        setField(term146267, term146267.getClass(), "webLimitDate", "ofiucEZNjp");
        setIntField(term146267, term146267.getClass(), "challengeTrackPhase", -2066960279);
        setIntField(term146267, term146267.getClass(), "firstPlayBits", 1766576479);
        setField(term146267, term146267.getClass(), "lastPlayDate", "kbQZxTtvgH");
        setIntField(term146267, term146267.getClass(), "lastPlaceId", -1294582627);
        setField(term146267, term146267.getClass(), "lastPlaceName", "aYWilzmMDP");
        setIntField(term146267, term146267.getClass(), "lastRegionId", 1278596092);
        setField(term146267, term146267.getClass(), "lastRegionName", "AaQIoxTkkz");
        setField(term146267, term146267.getClass(), "lastClientId", "utuhuXZwKw");
        setField(term146267, term146267.getClass(), "lastCountryCode", "HDmUBvnTDS");
        setIntField(term146267, term146267.getClass(), "eventPoint", -378985840);
        setIntField(term146267, term146267.getClass(), "totalLv", 2084793260);
        setIntField(term146267, term146267.getClass(), "lastLoginBonusDay", -1873615956);
        setIntField(term146267, term146267.getClass(), "lastSurvivalBonusDay", -53292129);
        setIntField(term146267, term146267.getClass(), "loginBonusLv", 27043473);
        setField(term146265, term146265.getClass(), "user", term146267);
        setIntField(term146265, term146265.getClass(), "orderId", -1278195248);
        setLongField(term146265, term146265.getClass(), "sortNumber", 5775606940711844192L);
        setIntField(term146265, term146265.getClass(), "placeId", 259782243);
        setField(term146265, term146265.getClass(), "placeName", "JySfuJQGCc");
        setField(term146265, term146265.getClass(), "country", "EYFlXZZTDu");
        setIntField(term146265, term146265.getClass(), "regionId", -1989754666);
        setField(term146265, term146265.getClass(), "playDate", "DRGzFlWxaV");
        setField(term146265, term146265.getClass(), "userPlayDate", "ZyTXwKjtvO");
        setIntField(term146265, term146265.getClass(), "musicId", -1390001694);
        setIntField(term146265, term146265.getClass(), "level", 903270470);
        setIntField(term146265, term146265.getClass(), "gameMode", 25353712);
        setIntField(term146265, term146265.getClass(), "rivalNum", 927932976);
        setIntField(term146265, term146265.getClass(), "track", 1436769137);
        setIntField(term146265, term146265.getClass(), "eventId", -1910221945);
        setBooleanField(term146265, term146265.getClass(), "isFreeToPlay", false);
        setIntField(term146265, term146265.getClass(), "playerRating", -1137342801);
        setLongField(term146265, term146265.getClass(), "playedUserId1", 3087842062616805600L);
        setField(term146265, term146265.getClass(), "playedUserName1", "mrIomiQpXW");
        setIntField(term146265, term146265.getClass(), "playedMusicLevel1", -1433672081);
        setLongField(term146265, term146265.getClass(), "playedUserId2", 4204500285938159509L);
        setField(term146265, term146265.getClass(), "playedUserName2", "mDIAdszXHc");
        setIntField(term146265, term146265.getClass(), "playedMusicLevel2", -1671760223);
        setLongField(term146265, term146265.getClass(), "playedUserId3", -1244994280899830819L);
        setField(term146265, term146265.getClass(), "playedUserName3", "GYljRejWKI");
        setIntField(term146265, term146265.getClass(), "playedMusicLevel3", 615305411);
        setIntField(term146265, term146265.getClass(), "achievement", 1143454924);
        setIntField(term146265, term146265.getClass(), "score", -1580781990);
        setIntField(term146265, term146265.getClass(), "tapScore", 1347623570);
        setIntField(term146265, term146265.getClass(), "holdScore", 1780415950);
        setIntField(term146265, term146265.getClass(), "slideScore", -1694290132);
        setIntField(term146265, term146265.getClass(), "breakScore", -1825611823);
        setIntField(term146265, term146265.getClass(), "syncRate", 314501541);
        setIntField(term146265, term146265.getClass(), "vsWin", -376118184);
        setBooleanField(term146265, term146265.getClass(), "isAllPerfect", false);
        setIntField(term146265, term146265.getClass(), "fullCombo", 521813133);
        setIntField(term146265, term146265.getClass(), "maxFever", -1753819615);
        setIntField(term146265, term146265.getClass(), "maxCombo", -2085081794);
        setIntField(term146265, term146265.getClass(), "tapPerfect", -673809311);
        setIntField(term146265, term146265.getClass(), "tapGreat", 1551363819);
        setIntField(term146265, term146265.getClass(), "tapGood", 1101906841);
        setIntField(term146265, term146265.getClass(), "tapBad", 924801484);
        setIntField(term146265, term146265.getClass(), "holdPerfect", -972621333);
        setIntField(term146265, term146265.getClass(), "holdGreat", -1905669851);
        setIntField(term146265, term146265.getClass(), "holdGood", 1625299037);
        setIntField(term146265, term146265.getClass(), "holdBad", -1515630842);
        setIntField(term146265, term146265.getClass(), "slidePerfect", -705904144);
        setIntField(term146265, term146265.getClass(), "slideGreat", -249148704);
        setIntField(term146265, term146265.getClass(), "slideGood", -1398111623);
        setIntField(term146265, term146265.getClass(), "slideBad", -254650250);
        setIntField(term146265, term146265.getClass(), "breakPerfect", 1821325974);
        setIntField(term146265, term146265.getClass(), "breakGreat", -1610789205);
        setIntField(term146265, term146265.getClass(), "breakGood", -711533767);
        setIntField(term146265, term146265.getClass(), "breakBad", -2048773574);
        setBooleanField(term146265, term146265.getClass(), "isTrackSkip", false);
        setBooleanField(term146265, term146265.getClass(), "isHighScore", true);
        setBooleanField(term146265, term146265.getClass(), "isChallengeTrack", true);
        setIntField(term146265, term146265.getClass(), "challengeLife", -1813714272);
        setIntField(term146265, term146265.getClass(), "challengeRemain", 867018340);
        setIntField(term146265, term146265.getClass(), "isAllPerfectPlus", -1102998089);
        term146577 = new Integer(1554322953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term146577;
        callMethod(klass, "setMusicId", argTypes, term146265, args);
    }

};


