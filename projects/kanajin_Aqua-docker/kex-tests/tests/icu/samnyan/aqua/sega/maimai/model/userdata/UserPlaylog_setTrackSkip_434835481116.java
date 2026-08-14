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
import java.lang.Boolean;

public class UserPlaylog_setTrackSkip_434835481116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3994021;
     Object term3994333;

    public UserPlaylog_setTrackSkip_434835481116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3994027 = new Long(66583604441572962L);
        term3994021 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3994023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3994025 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3994041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3994042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3994046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3994051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3994052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3994056 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3994021, term3994021.getClass(), "id", 7351032250698504704L);
        setLongField(term3994023, term3994023.getClass(), "id", 3970039725218350042L);
        setLongField(term3994025, term3994025.getClass(), "id", 6795823261779036822L);
        setField(term3994025, term3994025.getClass(), "extId", term3994027);
        setField(term3994025, term3994025.getClass(), "luid", "xuhabQXSQY");
        setIntField(term3994042, term3994042.getClass(), "year", 2011);
        setShortField(term3994042, term3994042.getClass(), "month", (short) 12);
        setShortField(term3994042, term3994042.getClass(), "day", (short) 31);
        setField(term3994041, term3994041.getClass(), "date", term3994042);
        setByteField(term3994046, term3994046.getClass(), "hour", (byte) 14);
        setByteField(term3994046, term3994046.getClass(), "minute", (byte) 8);
        setByteField(term3994046, term3994046.getClass(), "second", (byte) 0);
        setIntField(term3994046, term3994046.getClass(), "nano", 739519540);
        setField(term3994041, term3994041.getClass(), "time", term3994046);
        setField(term3994025, term3994025.getClass(), "registerTime", term3994041);
        setIntField(term3994052, term3994052.getClass(), "year", 2017);
        setShortField(term3994052, term3994052.getClass(), "month", (short) 2);
        setShortField(term3994052, term3994052.getClass(), "day", (short) 16);
        setField(term3994051, term3994051.getClass(), "date", term3994052);
        setByteField(term3994056, term3994056.getClass(), "hour", (byte) 14);
        setByteField(term3994056, term3994056.getClass(), "minute", (byte) 20);
        setByteField(term3994056, term3994056.getClass(), "second", (byte) 34);
        setIntField(term3994056, term3994056.getClass(), "nano", 731633209);
        setField(term3994051, term3994051.getClass(), "time", term3994056);
        setField(term3994025, term3994025.getClass(), "accessTime", term3994051);
        setField(term3994023, term3994023.getClass(), "card", term3994025);
        setIntField(term3994023, term3994023.getClass(), "lastDataVersion", 1227370817);
        setField(term3994023, term3994023.getClass(), "userName", "VXObJAFigE");
        setIntField(term3994023, term3994023.getClass(), "point", -2054888757);
        setIntField(term3994023, term3994023.getClass(), "totalPoint", -1122601428);
        setIntField(term3994023, term3994023.getClass(), "iconId", 309896247);
        setIntField(term3994023, term3994023.getClass(), "nameplateId", 1621261555);
        setIntField(term3994023, term3994023.getClass(), "frameId", -2071657246);
        setIntField(term3994023, term3994023.getClass(), "trophyId", 276924955);
        setIntField(term3994023, term3994023.getClass(), "playCount", -942964150);
        setIntField(term3994023, term3994023.getClass(), "playVsCount", 467574927);
        setIntField(term3994023, term3994023.getClass(), "playSyncCount", -290555974);
        setIntField(term3994023, term3994023.getClass(), "winCount", -77117376);
        setIntField(term3994023, term3994023.getClass(), "helpCount", -1345935641);
        setIntField(term3994023, term3994023.getClass(), "comboCount", -917016386);
        setIntField(term3994023, term3994023.getClass(), "feverCount", -2012573057);
        setIntField(term3994023, term3994023.getClass(), "totalHiScore", -165737997);
        setIntField(term3994023, term3994023.getClass(), "totalEasyHighScore", -1292367037);
        setIntField(term3994023, term3994023.getClass(), "totalBasicHighScore", 1896966831);
        setIntField(term3994023, term3994023.getClass(), "totalAdvancedHighScore", -369220453);
        setIntField(term3994023, term3994023.getClass(), "totalExpertHighScore", -704414802);
        setIntField(term3994023, term3994023.getClass(), "totalMasterHighScore", 1119638475);
        setIntField(term3994023, term3994023.getClass(), "totalReMasterHighScore", 711307051);
        setIntField(term3994023, term3994023.getClass(), "totalHighSync", 918181172);
        setIntField(term3994023, term3994023.getClass(), "totalEasySync", 587358283);
        setIntField(term3994023, term3994023.getClass(), "totalBasicSync", -54155964);
        setIntField(term3994023, term3994023.getClass(), "totalAdvancedSync", -1793516826);
        setIntField(term3994023, term3994023.getClass(), "totalExpertSync", -1386383623);
        setIntField(term3994023, term3994023.getClass(), "totalMasterSync", -662121614);
        setIntField(term3994023, term3994023.getClass(), "totalReMasterSync", -296212429);
        setIntField(term3994023, term3994023.getClass(), "playerRating", -1336143848);
        setIntField(term3994023, term3994023.getClass(), "highestRating", 812045342);
        setIntField(term3994023, term3994023.getClass(), "rankAuthTailId", 969719628);
        setField(term3994023, term3994023.getClass(), "eventWatchedDate", "aSWeoQaJZf");
        setField(term3994023, term3994023.getClass(), "webLimitDate", "jJRTyVRhle");
        setIntField(term3994023, term3994023.getClass(), "challengeTrackPhase", -1858019714);
        setIntField(term3994023, term3994023.getClass(), "firstPlayBits", 2131019084);
        setField(term3994023, term3994023.getClass(), "lastPlayDate", "LTlCcTabqb");
        setIntField(term3994023, term3994023.getClass(), "lastPlaceId", 416069284);
        setField(term3994023, term3994023.getClass(), "lastPlaceName", "oTRDKPSiWQ");
        setIntField(term3994023, term3994023.getClass(), "lastRegionId", 340490620);
        setField(term3994023, term3994023.getClass(), "lastRegionName", "gQHKHBVlao");
        setField(term3994023, term3994023.getClass(), "lastClientId", "kuUrEmfaPv");
        setField(term3994023, term3994023.getClass(), "lastCountryCode", "GvIbWwoTUo");
        setIntField(term3994023, term3994023.getClass(), "eventPoint", 632401746);
        setIntField(term3994023, term3994023.getClass(), "totalLv", -1424020104);
        setIntField(term3994023, term3994023.getClass(), "lastLoginBonusDay", 1865691357);
        setIntField(term3994023, term3994023.getClass(), "lastSurvivalBonusDay", -1939817650);
        setIntField(term3994023, term3994023.getClass(), "loginBonusLv", 1501023559);
        setField(term3994021, term3994021.getClass(), "user", term3994023);
        setIntField(term3994021, term3994021.getClass(), "orderId", -116732596);
        setLongField(term3994021, term3994021.getClass(), "sortNumber", 2570592093357602427L);
        setIntField(term3994021, term3994021.getClass(), "placeId", 1052666415);
        setField(term3994021, term3994021.getClass(), "placeName", "gullryrYqM");
        setField(term3994021, term3994021.getClass(), "country", "gcPSkYKLcv");
        setIntField(term3994021, term3994021.getClass(), "regionId", -1906808527);
        setField(term3994021, term3994021.getClass(), "playDate", "yAqhguhMpJ");
        setField(term3994021, term3994021.getClass(), "userPlayDate", "nqHuaWzlUn");
        setIntField(term3994021, term3994021.getClass(), "musicId", -592454974);
        setIntField(term3994021, term3994021.getClass(), "level", -1257238066);
        setIntField(term3994021, term3994021.getClass(), "gameMode", -1848151016);
        setIntField(term3994021, term3994021.getClass(), "rivalNum", 496033122);
        setIntField(term3994021, term3994021.getClass(), "track", -663916389);
        setIntField(term3994021, term3994021.getClass(), "eventId", 316406822);
        setBooleanField(term3994021, term3994021.getClass(), "isFreeToPlay", false);
        setIntField(term3994021, term3994021.getClass(), "playerRating", 1974397809);
        setLongField(term3994021, term3994021.getClass(), "playedUserId1", 3036933006709856927L);
        setField(term3994021, term3994021.getClass(), "playedUserName1", "eqtQifrHao");
        setIntField(term3994021, term3994021.getClass(), "playedMusicLevel1", -764761622);
        setLongField(term3994021, term3994021.getClass(), "playedUserId2", 635808500596253026L);
        setField(term3994021, term3994021.getClass(), "playedUserName2", "WNXSmSTmCu");
        setIntField(term3994021, term3994021.getClass(), "playedMusicLevel2", 1526852351);
        setLongField(term3994021, term3994021.getClass(), "playedUserId3", 4720644264078316988L);
        setField(term3994021, term3994021.getClass(), "playedUserName3", "IRPPDNazBn");
        setIntField(term3994021, term3994021.getClass(), "playedMusicLevel3", 2112501430);
        setIntField(term3994021, term3994021.getClass(), "achievement", 1287842294);
        setIntField(term3994021, term3994021.getClass(), "score", -232913462);
        setIntField(term3994021, term3994021.getClass(), "tapScore", 32022678);
        setIntField(term3994021, term3994021.getClass(), "holdScore", 970123117);
        setIntField(term3994021, term3994021.getClass(), "slideScore", -1201009659);
        setIntField(term3994021, term3994021.getClass(), "breakScore", 677206387);
        setIntField(term3994021, term3994021.getClass(), "syncRate", 555542503);
        setIntField(term3994021, term3994021.getClass(), "vsWin", 452121437);
        setBooleanField(term3994021, term3994021.getClass(), "isAllPerfect", true);
        setIntField(term3994021, term3994021.getClass(), "fullCombo", 1825672869);
        setIntField(term3994021, term3994021.getClass(), "maxFever", 1026530939);
        setIntField(term3994021, term3994021.getClass(), "maxCombo", -1258254597);
        setIntField(term3994021, term3994021.getClass(), "tapPerfect", 406431626);
        setIntField(term3994021, term3994021.getClass(), "tapGreat", -1766798902);
        setIntField(term3994021, term3994021.getClass(), "tapGood", 1357153934);
        setIntField(term3994021, term3994021.getClass(), "tapBad", -985683648);
        setIntField(term3994021, term3994021.getClass(), "holdPerfect", -1756136700);
        setIntField(term3994021, term3994021.getClass(), "holdGreat", -700216618);
        setIntField(term3994021, term3994021.getClass(), "holdGood", -1884316254);
        setIntField(term3994021, term3994021.getClass(), "holdBad", -561457232);
        setIntField(term3994021, term3994021.getClass(), "slidePerfect", -1977622985);
        setIntField(term3994021, term3994021.getClass(), "slideGreat", -1137634461);
        setIntField(term3994021, term3994021.getClass(), "slideGood", -1114186898);
        setIntField(term3994021, term3994021.getClass(), "slideBad", -1396740302);
        setIntField(term3994021, term3994021.getClass(), "breakPerfect", 1085934464);
        setIntField(term3994021, term3994021.getClass(), "breakGreat", -1289895873);
        setIntField(term3994021, term3994021.getClass(), "breakGood", -181118948);
        setIntField(term3994021, term3994021.getClass(), "breakBad", -373350080);
        setBooleanField(term3994021, term3994021.getClass(), "isTrackSkip", false);
        setBooleanField(term3994021, term3994021.getClass(), "isHighScore", false);
        setBooleanField(term3994021, term3994021.getClass(), "isChallengeTrack", true);
        setIntField(term3994021, term3994021.getClass(), "challengeLife", -1954870012);
        setIntField(term3994021, term3994021.getClass(), "challengeRemain", 536976567);
        setIntField(term3994021, term3994021.getClass(), "isAllPerfectPlus", -275638212);
        term3994333 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3994333;
        callMethod(klass, "setTrackSkip", argTypes, term3994021, args);
    }

};


