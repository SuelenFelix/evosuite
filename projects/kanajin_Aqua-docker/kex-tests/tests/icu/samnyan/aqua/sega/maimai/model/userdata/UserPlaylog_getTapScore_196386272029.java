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

public class UserPlaylog_getTapScore_196386272029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126079;

    public UserPlaylog_getTapScore_196386272029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126085 = new Long(-4776514981294468834L);
        term126079 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term126081 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term126083 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term126099 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126104 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126114 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term126079, term126079.getClass(), "id", 2105697925603985714L);
        setLongField(term126081, term126081.getClass(), "id", -589167249491619196L);
        setLongField(term126083, term126083.getClass(), "id", 5990686118620195001L);
        setField(term126083, term126083.getClass(), "extId", term126085);
        setField(term126083, term126083.getClass(), "luid", "rgqlgxwfGD");
        setIntField(term126100, term126100.getClass(), "year", 2020);
        setShortField(term126100, term126100.getClass(), "month", (short) 6);
        setShortField(term126100, term126100.getClass(), "day", (short) 2);
        setField(term126099, term126099.getClass(), "date", term126100);
        setByteField(term126104, term126104.getClass(), "hour", (byte) 10);
        setByteField(term126104, term126104.getClass(), "minute", (byte) 4);
        setByteField(term126104, term126104.getClass(), "second", (byte) 37);
        setIntField(term126104, term126104.getClass(), "nano", 482860495);
        setField(term126099, term126099.getClass(), "time", term126104);
        setField(term126083, term126083.getClass(), "registerTime", term126099);
        setIntField(term126110, term126110.getClass(), "year", 2027);
        setShortField(term126110, term126110.getClass(), "month", (short) 1);
        setShortField(term126110, term126110.getClass(), "day", (short) 9);
        setField(term126109, term126109.getClass(), "date", term126110);
        setByteField(term126114, term126114.getClass(), "hour", (byte) 3);
        setByteField(term126114, term126114.getClass(), "minute", (byte) 52);
        setByteField(term126114, term126114.getClass(), "second", (byte) 13);
        setIntField(term126114, term126114.getClass(), "nano", 357829313);
        setField(term126109, term126109.getClass(), "time", term126114);
        setField(term126083, term126083.getClass(), "accessTime", term126109);
        setField(term126081, term126081.getClass(), "card", term126083);
        setIntField(term126081, term126081.getClass(), "lastDataVersion", -2070422454);
        setField(term126081, term126081.getClass(), "userName", "PDYTQfQsZd");
        setIntField(term126081, term126081.getClass(), "point", 1588346817);
        setIntField(term126081, term126081.getClass(), "totalPoint", 398234886);
        setIntField(term126081, term126081.getClass(), "iconId", -563567351);
        setIntField(term126081, term126081.getClass(), "nameplateId", 682029949);
        setIntField(term126081, term126081.getClass(), "frameId", -1663944520);
        setIntField(term126081, term126081.getClass(), "trophyId", 724138196);
        setIntField(term126081, term126081.getClass(), "playCount", -147066224);
        setIntField(term126081, term126081.getClass(), "playVsCount", -509514471);
        setIntField(term126081, term126081.getClass(), "playSyncCount", -1949091735);
        setIntField(term126081, term126081.getClass(), "winCount", -1133615279);
        setIntField(term126081, term126081.getClass(), "helpCount", 626847753);
        setIntField(term126081, term126081.getClass(), "comboCount", 1969584554);
        setIntField(term126081, term126081.getClass(), "feverCount", 710954100);
        setIntField(term126081, term126081.getClass(), "totalHiScore", 2101628029);
        setIntField(term126081, term126081.getClass(), "totalEasyHighScore", -846852041);
        setIntField(term126081, term126081.getClass(), "totalBasicHighScore", 215045898);
        setIntField(term126081, term126081.getClass(), "totalAdvancedHighScore", 1273867637);
        setIntField(term126081, term126081.getClass(), "totalExpertHighScore", 1418101531);
        setIntField(term126081, term126081.getClass(), "totalMasterHighScore", 769920456);
        setIntField(term126081, term126081.getClass(), "totalReMasterHighScore", -477204253);
        setIntField(term126081, term126081.getClass(), "totalHighSync", 1662398256);
        setIntField(term126081, term126081.getClass(), "totalEasySync", 1766347483);
        setIntField(term126081, term126081.getClass(), "totalBasicSync", -423561050);
        setIntField(term126081, term126081.getClass(), "totalAdvancedSync", 1213171057);
        setIntField(term126081, term126081.getClass(), "totalExpertSync", 1305018379);
        setIntField(term126081, term126081.getClass(), "totalMasterSync", 1128377530);
        setIntField(term126081, term126081.getClass(), "totalReMasterSync", -566082419);
        setIntField(term126081, term126081.getClass(), "playerRating", 507892364);
        setIntField(term126081, term126081.getClass(), "highestRating", -1303417924);
        setIntField(term126081, term126081.getClass(), "rankAuthTailId", 690014633);
        setField(term126081, term126081.getClass(), "eventWatchedDate", "scTfhtEKVY");
        setField(term126081, term126081.getClass(), "webLimitDate", "stIuzWhyLn");
        setIntField(term126081, term126081.getClass(), "challengeTrackPhase", 887139549);
        setIntField(term126081, term126081.getClass(), "firstPlayBits", -1974628635);
        setField(term126081, term126081.getClass(), "lastPlayDate", "SsJjSkvgfn");
        setIntField(term126081, term126081.getClass(), "lastPlaceId", 1927255362);
        setField(term126081, term126081.getClass(), "lastPlaceName", "tUeeoALgnV");
        setIntField(term126081, term126081.getClass(), "lastRegionId", 772050796);
        setField(term126081, term126081.getClass(), "lastRegionName", "RKrTOHCtIL");
        setField(term126081, term126081.getClass(), "lastClientId", "weKhJGqEfg");
        setField(term126081, term126081.getClass(), "lastCountryCode", "TLUMeWJCRR");
        setIntField(term126081, term126081.getClass(), "eventPoint", -1285946960);
        setIntField(term126081, term126081.getClass(), "totalLv", 1737634703);
        setIntField(term126081, term126081.getClass(), "lastLoginBonusDay", 793533464);
        setIntField(term126081, term126081.getClass(), "lastSurvivalBonusDay", -717365307);
        setIntField(term126081, term126081.getClass(), "loginBonusLv", 1581920815);
        setField(term126079, term126079.getClass(), "user", term126081);
        setIntField(term126079, term126079.getClass(), "orderId", -59811391);
        setLongField(term126079, term126079.getClass(), "sortNumber", 268218069036722127L);
        setIntField(term126079, term126079.getClass(), "placeId", -1196302168);
        setField(term126079, term126079.getClass(), "placeName", "TuVnFrfwDO");
        setField(term126079, term126079.getClass(), "country", "HLaksjKQLu");
        setIntField(term126079, term126079.getClass(), "regionId", 78919121);
        setField(term126079, term126079.getClass(), "playDate", "tUmAYoRjRt");
        setField(term126079, term126079.getClass(), "userPlayDate", "BAADpSzVyH");
        setIntField(term126079, term126079.getClass(), "musicId", -526768095);
        setIntField(term126079, term126079.getClass(), "level", -1453641510);
        setIntField(term126079, term126079.getClass(), "gameMode", 1963023357);
        setIntField(term126079, term126079.getClass(), "rivalNum", -47434320);
        setIntField(term126079, term126079.getClass(), "track", 1237862596);
        setIntField(term126079, term126079.getClass(), "eventId", -1393307484);
        setBooleanField(term126079, term126079.getClass(), "isFreeToPlay", true);
        setIntField(term126079, term126079.getClass(), "playerRating", -1622786371);
        setLongField(term126079, term126079.getClass(), "playedUserId1", -3992663397060695265L);
        setField(term126079, term126079.getClass(), "playedUserName1", "PWiSQlucVO");
        setIntField(term126079, term126079.getClass(), "playedMusicLevel1", -227208597);
        setLongField(term126079, term126079.getClass(), "playedUserId2", 4987297090886718616L);
        setField(term126079, term126079.getClass(), "playedUserName2", "SkAkmjxoiu");
        setIntField(term126079, term126079.getClass(), "playedMusicLevel2", 1224191712);
        setLongField(term126079, term126079.getClass(), "playedUserId3", -2373676985592181240L);
        setField(term126079, term126079.getClass(), "playedUserName3", "nQyRXiYkyU");
        setIntField(term126079, term126079.getClass(), "playedMusicLevel3", -635900964);
        setIntField(term126079, term126079.getClass(), "achievement", -257307819);
        setIntField(term126079, term126079.getClass(), "score", 2121002514);
        setIntField(term126079, term126079.getClass(), "tapScore", 116421144);
        setIntField(term126079, term126079.getClass(), "holdScore", 1133487857);
        setIntField(term126079, term126079.getClass(), "slideScore", -589717643);
        setIntField(term126079, term126079.getClass(), "breakScore", -955082715);
        setIntField(term126079, term126079.getClass(), "syncRate", 151818114);
        setIntField(term126079, term126079.getClass(), "vsWin", 1950783244);
        setBooleanField(term126079, term126079.getClass(), "isAllPerfect", false);
        setIntField(term126079, term126079.getClass(), "fullCombo", 768139455);
        setIntField(term126079, term126079.getClass(), "maxFever", -1410773451);
        setIntField(term126079, term126079.getClass(), "maxCombo", -223197318);
        setIntField(term126079, term126079.getClass(), "tapPerfect", 405548368);
        setIntField(term126079, term126079.getClass(), "tapGreat", 1711997114);
        setIntField(term126079, term126079.getClass(), "tapGood", 1871798985);
        setIntField(term126079, term126079.getClass(), "tapBad", 1941308595);
        setIntField(term126079, term126079.getClass(), "holdPerfect", -806743454);
        setIntField(term126079, term126079.getClass(), "holdGreat", 293751820);
        setIntField(term126079, term126079.getClass(), "holdGood", 45674117);
        setIntField(term126079, term126079.getClass(), "holdBad", 1963663502);
        setIntField(term126079, term126079.getClass(), "slidePerfect", -570673621);
        setIntField(term126079, term126079.getClass(), "slideGreat", -1324631832);
        setIntField(term126079, term126079.getClass(), "slideGood", -1565659256);
        setIntField(term126079, term126079.getClass(), "slideBad", 1942755502);
        setIntField(term126079, term126079.getClass(), "breakPerfect", 96638940);
        setIntField(term126079, term126079.getClass(), "breakGreat", -1972066107);
        setIntField(term126079, term126079.getClass(), "breakGood", -621184234);
        setIntField(term126079, term126079.getClass(), "breakBad", -1709700660);
        setBooleanField(term126079, term126079.getClass(), "isTrackSkip", false);
        setBooleanField(term126079, term126079.getClass(), "isHighScore", false);
        setBooleanField(term126079, term126079.getClass(), "isChallengeTrack", false);
        setIntField(term126079, term126079.getClass(), "challengeLife", 832113202);
        setIntField(term126079, term126079.getClass(), "challengeRemain", -1583443632);
        setIntField(term126079, term126079.getClass(), "isAllPerfectPlus", -62265993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapScore", argTypes, term126079, args);
    }

};


