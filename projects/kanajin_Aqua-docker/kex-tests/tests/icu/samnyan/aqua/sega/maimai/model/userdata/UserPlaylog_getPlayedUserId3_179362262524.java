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

public class UserPlaylog_getPlayedUserId3_179362262524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123719;

    public UserPlaylog_getPlayedUserId3_179362262524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term123725 = new Long(-8993073054427011802L);
        term123719 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term123721 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term123723 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term123739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123744 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123754 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term123719, term123719.getClass(), "id", -2261267969370273698L);
        setLongField(term123721, term123721.getClass(), "id", -6265268170103538784L);
        setLongField(term123723, term123723.getClass(), "id", -6478060368064484690L);
        setField(term123723, term123723.getClass(), "extId", term123725);
        setField(term123723, term123723.getClass(), "luid", "rXhBlGnTbp");
        setIntField(term123740, term123740.getClass(), "year", 2021);
        setShortField(term123740, term123740.getClass(), "month", (short) 4);
        setShortField(term123740, term123740.getClass(), "day", (short) 17);
        setField(term123739, term123739.getClass(), "date", term123740);
        setByteField(term123744, term123744.getClass(), "hour", (byte) 22);
        setByteField(term123744, term123744.getClass(), "minute", (byte) 34);
        setByteField(term123744, term123744.getClass(), "second", (byte) 19);
        setIntField(term123744, term123744.getClass(), "nano", 565497804);
        setField(term123739, term123739.getClass(), "time", term123744);
        setField(term123723, term123723.getClass(), "registerTime", term123739);
        setIntField(term123750, term123750.getClass(), "year", 2019);
        setShortField(term123750, term123750.getClass(), "month", (short) 11);
        setShortField(term123750, term123750.getClass(), "day", (short) 26);
        setField(term123749, term123749.getClass(), "date", term123750);
        setByteField(term123754, term123754.getClass(), "hour", (byte) 21);
        setByteField(term123754, term123754.getClass(), "minute", (byte) 16);
        setByteField(term123754, term123754.getClass(), "second", (byte) 42);
        setIntField(term123754, term123754.getClass(), "nano", 559995047);
        setField(term123749, term123749.getClass(), "time", term123754);
        setField(term123723, term123723.getClass(), "accessTime", term123749);
        setField(term123721, term123721.getClass(), "card", term123723);
        setIntField(term123721, term123721.getClass(), "lastDataVersion", 59717458);
        setField(term123721, term123721.getClass(), "userName", "RXrliVaPrQ");
        setIntField(term123721, term123721.getClass(), "point", 1161304512);
        setIntField(term123721, term123721.getClass(), "totalPoint", 1179045291);
        setIntField(term123721, term123721.getClass(), "iconId", 187796156);
        setIntField(term123721, term123721.getClass(), "nameplateId", 236799050);
        setIntField(term123721, term123721.getClass(), "frameId", 2059959850);
        setIntField(term123721, term123721.getClass(), "trophyId", -926051580);
        setIntField(term123721, term123721.getClass(), "playCount", -696509293);
        setIntField(term123721, term123721.getClass(), "playVsCount", 355853026);
        setIntField(term123721, term123721.getClass(), "playSyncCount", -1598167746);
        setIntField(term123721, term123721.getClass(), "winCount", 1736642602);
        setIntField(term123721, term123721.getClass(), "helpCount", 58048208);
        setIntField(term123721, term123721.getClass(), "comboCount", 1074355036);
        setIntField(term123721, term123721.getClass(), "feverCount", 55518272);
        setIntField(term123721, term123721.getClass(), "totalHiScore", 786099887);
        setIntField(term123721, term123721.getClass(), "totalEasyHighScore", -1241638653);
        setIntField(term123721, term123721.getClass(), "totalBasicHighScore", -832082737);
        setIntField(term123721, term123721.getClass(), "totalAdvancedHighScore", 659361179);
        setIntField(term123721, term123721.getClass(), "totalExpertHighScore", 1762459373);
        setIntField(term123721, term123721.getClass(), "totalMasterHighScore", 542713324);
        setIntField(term123721, term123721.getClass(), "totalReMasterHighScore", 193960798);
        setIntField(term123721, term123721.getClass(), "totalHighSync", -2096728827);
        setIntField(term123721, term123721.getClass(), "totalEasySync", 1007899485);
        setIntField(term123721, term123721.getClass(), "totalBasicSync", 509496894);
        setIntField(term123721, term123721.getClass(), "totalAdvancedSync", 1476111788);
        setIntField(term123721, term123721.getClass(), "totalExpertSync", -718941728);
        setIntField(term123721, term123721.getClass(), "totalMasterSync", 840842536);
        setIntField(term123721, term123721.getClass(), "totalReMasterSync", -1271403609);
        setIntField(term123721, term123721.getClass(), "playerRating", 1884294543);
        setIntField(term123721, term123721.getClass(), "highestRating", -1914952733);
        setIntField(term123721, term123721.getClass(), "rankAuthTailId", -1988952578);
        setField(term123721, term123721.getClass(), "eventWatchedDate", "QWnrSwmKgP");
        setField(term123721, term123721.getClass(), "webLimitDate", "wOeJuAGSwi");
        setIntField(term123721, term123721.getClass(), "challengeTrackPhase", -345409524);
        setIntField(term123721, term123721.getClass(), "firstPlayBits", -1574633469);
        setField(term123721, term123721.getClass(), "lastPlayDate", "lCalUsJPRJ");
        setIntField(term123721, term123721.getClass(), "lastPlaceId", 1036189177);
        setField(term123721, term123721.getClass(), "lastPlaceName", "gFHKkRGUax");
        setIntField(term123721, term123721.getClass(), "lastRegionId", 1117995815);
        setField(term123721, term123721.getClass(), "lastRegionName", "paZAviFqsm");
        setField(term123721, term123721.getClass(), "lastClientId", "GohPpeqrRh");
        setField(term123721, term123721.getClass(), "lastCountryCode", "pfGxZUUbIW");
        setIntField(term123721, term123721.getClass(), "eventPoint", -2022511335);
        setIntField(term123721, term123721.getClass(), "totalLv", 51832928);
        setIntField(term123721, term123721.getClass(), "lastLoginBonusDay", -1340482712);
        setIntField(term123721, term123721.getClass(), "lastSurvivalBonusDay", 475577815);
        setIntField(term123721, term123721.getClass(), "loginBonusLv", 1808537592);
        setField(term123719, term123719.getClass(), "user", term123721);
        setIntField(term123719, term123719.getClass(), "orderId", -625276209);
        setLongField(term123719, term123719.getClass(), "sortNumber", 2358294751965878279L);
        setIntField(term123719, term123719.getClass(), "placeId", -912186570);
        setField(term123719, term123719.getClass(), "placeName", "GhZQSLeLeq");
        setField(term123719, term123719.getClass(), "country", "vCJwFnMbeg");
        setIntField(term123719, term123719.getClass(), "regionId", 332491973);
        setField(term123719, term123719.getClass(), "playDate", "HiMyMWtfDT");
        setField(term123719, term123719.getClass(), "userPlayDate", "bTxfZATYLW");
        setIntField(term123719, term123719.getClass(), "musicId", 660268383);
        setIntField(term123719, term123719.getClass(), "level", -671514118);
        setIntField(term123719, term123719.getClass(), "gameMode", -1399358009);
        setIntField(term123719, term123719.getClass(), "rivalNum", 2111728382);
        setIntField(term123719, term123719.getClass(), "track", 171174352);
        setIntField(term123719, term123719.getClass(), "eventId", -450601982);
        setBooleanField(term123719, term123719.getClass(), "isFreeToPlay", false);
        setIntField(term123719, term123719.getClass(), "playerRating", 327442634);
        setLongField(term123719, term123719.getClass(), "playedUserId1", 8600922426578985605L);
        setField(term123719, term123719.getClass(), "playedUserName1", "lFWdVTokyG");
        setIntField(term123719, term123719.getClass(), "playedMusicLevel1", 1459640309);
        setLongField(term123719, term123719.getClass(), "playedUserId2", -3701629604936783176L);
        setField(term123719, term123719.getClass(), "playedUserName2", "PwXoorKXoP");
        setIntField(term123719, term123719.getClass(), "playedMusicLevel2", 296004124);
        setLongField(term123719, term123719.getClass(), "playedUserId3", 2577903134840885266L);
        setField(term123719, term123719.getClass(), "playedUserName3", "FTbhYKJKQL");
        setIntField(term123719, term123719.getClass(), "playedMusicLevel3", 925831861);
        setIntField(term123719, term123719.getClass(), "achievement", -1983580842);
        setIntField(term123719, term123719.getClass(), "score", 1331277023);
        setIntField(term123719, term123719.getClass(), "tapScore", 947611688);
        setIntField(term123719, term123719.getClass(), "holdScore", -1159146752);
        setIntField(term123719, term123719.getClass(), "slideScore", -1065436081);
        setIntField(term123719, term123719.getClass(), "breakScore", 971019069);
        setIntField(term123719, term123719.getClass(), "syncRate", -1099401229);
        setIntField(term123719, term123719.getClass(), "vsWin", 709838754);
        setBooleanField(term123719, term123719.getClass(), "isAllPerfect", false);
        setIntField(term123719, term123719.getClass(), "fullCombo", -85093106);
        setIntField(term123719, term123719.getClass(), "maxFever", -1698754374);
        setIntField(term123719, term123719.getClass(), "maxCombo", 1846632663);
        setIntField(term123719, term123719.getClass(), "tapPerfect", -1288250590);
        setIntField(term123719, term123719.getClass(), "tapGreat", -1808201152);
        setIntField(term123719, term123719.getClass(), "tapGood", -529949642);
        setIntField(term123719, term123719.getClass(), "tapBad", -76656882);
        setIntField(term123719, term123719.getClass(), "holdPerfect", 987800835);
        setIntField(term123719, term123719.getClass(), "holdGreat", 1029114126);
        setIntField(term123719, term123719.getClass(), "holdGood", 2061594658);
        setIntField(term123719, term123719.getClass(), "holdBad", 1057921399);
        setIntField(term123719, term123719.getClass(), "slidePerfect", 1860531765);
        setIntField(term123719, term123719.getClass(), "slideGreat", 1900045950);
        setIntField(term123719, term123719.getClass(), "slideGood", 907619854);
        setIntField(term123719, term123719.getClass(), "slideBad", 1107910554);
        setIntField(term123719, term123719.getClass(), "breakPerfect", 778090701);
        setIntField(term123719, term123719.getClass(), "breakGreat", 320722712);
        setIntField(term123719, term123719.getClass(), "breakGood", 2093459327);
        setIntField(term123719, term123719.getClass(), "breakBad", 229344233);
        setBooleanField(term123719, term123719.getClass(), "isTrackSkip", true);
        setBooleanField(term123719, term123719.getClass(), "isHighScore", true);
        setBooleanField(term123719, term123719.getClass(), "isChallengeTrack", false);
        setIntField(term123719, term123719.getClass(), "challengeLife", -1916987656);
        setIntField(term123719, term123719.getClass(), "challengeRemain", 1801075916);
        setIntField(term123719, term123719.getClass(), "isAllPerfectPlus", 291364869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId3", argTypes, term123719, args);
    }

};


