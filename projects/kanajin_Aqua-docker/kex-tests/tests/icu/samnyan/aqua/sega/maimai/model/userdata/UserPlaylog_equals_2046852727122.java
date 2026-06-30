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

public class UserPlaylog_equals_2046852727122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170499;
     Object term170811;

    public UserPlaylog_equals_2046852727122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170505 = new Long(-4562564710769146498L);
        term170499 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term170501 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term170503 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170524 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170534 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term170499, term170499.getClass(), "id", 5254427735699890849L);
        setLongField(term170501, term170501.getClass(), "id", -2981899957757551501L);
        setLongField(term170503, term170503.getClass(), "id", -3796499281571450784L);
        setField(term170503, term170503.getClass(), "extId", term170505);
        setField(term170503, term170503.getClass(), "luid", "FjPjLYxYCD");
        setIntField(term170520, term170520.getClass(), "year", 2013);
        setShortField(term170520, term170520.getClass(), "month", (short) 3);
        setShortField(term170520, term170520.getClass(), "day", (short) 23);
        setField(term170519, term170519.getClass(), "date", term170520);
        setByteField(term170524, term170524.getClass(), "hour", (byte) 15);
        setByteField(term170524, term170524.getClass(), "minute", (byte) 5);
        setByteField(term170524, term170524.getClass(), "second", (byte) 38);
        setIntField(term170524, term170524.getClass(), "nano", 214541172);
        setField(term170519, term170519.getClass(), "time", term170524);
        setField(term170503, term170503.getClass(), "registerTime", term170519);
        setIntField(term170530, term170530.getClass(), "year", 2019);
        setShortField(term170530, term170530.getClass(), "month", (short) 4);
        setShortField(term170530, term170530.getClass(), "day", (short) 27);
        setField(term170529, term170529.getClass(), "date", term170530);
        setByteField(term170534, term170534.getClass(), "hour", (byte) 14);
        setByteField(term170534, term170534.getClass(), "minute", (byte) 36);
        setByteField(term170534, term170534.getClass(), "second", (byte) 3);
        setIntField(term170534, term170534.getClass(), "nano", 745093939);
        setField(term170529, term170529.getClass(), "time", term170534);
        setField(term170503, term170503.getClass(), "accessTime", term170529);
        setField(term170501, term170501.getClass(), "card", term170503);
        setIntField(term170501, term170501.getClass(), "lastDataVersion", -1674438948);
        setField(term170501, term170501.getClass(), "userName", "MVKJWagTKW");
        setIntField(term170501, term170501.getClass(), "point", -729833150);
        setIntField(term170501, term170501.getClass(), "totalPoint", -134344624);
        setIntField(term170501, term170501.getClass(), "iconId", 1715936337);
        setIntField(term170501, term170501.getClass(), "nameplateId", -1048852351);
        setIntField(term170501, term170501.getClass(), "frameId", 1943512594);
        setIntField(term170501, term170501.getClass(), "trophyId", 1042164264);
        setIntField(term170501, term170501.getClass(), "playCount", -2015710129);
        setIntField(term170501, term170501.getClass(), "playVsCount", 360782425);
        setIntField(term170501, term170501.getClass(), "playSyncCount", 275854548);
        setIntField(term170501, term170501.getClass(), "winCount", -1407954490);
        setIntField(term170501, term170501.getClass(), "helpCount", 765186263);
        setIntField(term170501, term170501.getClass(), "comboCount", 2141645226);
        setIntField(term170501, term170501.getClass(), "feverCount", 1391245502);
        setIntField(term170501, term170501.getClass(), "totalHiScore", -427719081);
        setIntField(term170501, term170501.getClass(), "totalEasyHighScore", -124387312);
        setIntField(term170501, term170501.getClass(), "totalBasicHighScore", 2055675770);
        setIntField(term170501, term170501.getClass(), "totalAdvancedHighScore", 1223723655);
        setIntField(term170501, term170501.getClass(), "totalExpertHighScore", 831915664);
        setIntField(term170501, term170501.getClass(), "totalMasterHighScore", 637683364);
        setIntField(term170501, term170501.getClass(), "totalReMasterHighScore", 722470445);
        setIntField(term170501, term170501.getClass(), "totalHighSync", -1885225159);
        setIntField(term170501, term170501.getClass(), "totalEasySync", -1815881485);
        setIntField(term170501, term170501.getClass(), "totalBasicSync", 1382562999);
        setIntField(term170501, term170501.getClass(), "totalAdvancedSync", 2123421042);
        setIntField(term170501, term170501.getClass(), "totalExpertSync", 316313675);
        setIntField(term170501, term170501.getClass(), "totalMasterSync", 1809519697);
        setIntField(term170501, term170501.getClass(), "totalReMasterSync", 511673876);
        setIntField(term170501, term170501.getClass(), "playerRating", -660039584);
        setIntField(term170501, term170501.getClass(), "highestRating", 534163694);
        setIntField(term170501, term170501.getClass(), "rankAuthTailId", -1165775729);
        setField(term170501, term170501.getClass(), "eventWatchedDate", "JrgxSjdHDm");
        setField(term170501, term170501.getClass(), "webLimitDate", "oYTaCsZgHc");
        setIntField(term170501, term170501.getClass(), "challengeTrackPhase", -1565255255);
        setIntField(term170501, term170501.getClass(), "firstPlayBits", -1850027557);
        setField(term170501, term170501.getClass(), "lastPlayDate", "JjbnWzssdi");
        setIntField(term170501, term170501.getClass(), "lastPlaceId", 1287595175);
        setField(term170501, term170501.getClass(), "lastPlaceName", "JBjRYdrxgs");
        setIntField(term170501, term170501.getClass(), "lastRegionId", -2080323668);
        setField(term170501, term170501.getClass(), "lastRegionName", "SGDHQYYzsR");
        setField(term170501, term170501.getClass(), "lastClientId", "hecboVcqgp");
        setField(term170501, term170501.getClass(), "lastCountryCode", "yjLlTYCCBx");
        setIntField(term170501, term170501.getClass(), "eventPoint", 1700990005);
        setIntField(term170501, term170501.getClass(), "totalLv", 1658815292);
        setIntField(term170501, term170501.getClass(), "lastLoginBonusDay", 1795451677);
        setIntField(term170501, term170501.getClass(), "lastSurvivalBonusDay", 1130749698);
        setIntField(term170501, term170501.getClass(), "loginBonusLv", -955461057);
        setField(term170499, term170499.getClass(), "user", term170501);
        setIntField(term170499, term170499.getClass(), "orderId", 58358065);
        setLongField(term170499, term170499.getClass(), "sortNumber", 2856654200900890130L);
        setIntField(term170499, term170499.getClass(), "placeId", 705631540);
        setField(term170499, term170499.getClass(), "placeName", "tmMslEelEQ");
        setField(term170499, term170499.getClass(), "country", "zQlbOXpNcl");
        setIntField(term170499, term170499.getClass(), "regionId", -1675218741);
        setField(term170499, term170499.getClass(), "playDate", "iDjBOxOVMQ");
        setField(term170499, term170499.getClass(), "userPlayDate", "QSvmOZQTXd");
        setIntField(term170499, term170499.getClass(), "musicId", -1709888183);
        setIntField(term170499, term170499.getClass(), "level", -117439776);
        setIntField(term170499, term170499.getClass(), "gameMode", 1471944537);
        setIntField(term170499, term170499.getClass(), "rivalNum", 1047217638);
        setIntField(term170499, term170499.getClass(), "track", 1618491461);
        setIntField(term170499, term170499.getClass(), "eventId", -1725204654);
        setBooleanField(term170499, term170499.getClass(), "isFreeToPlay", true);
        setIntField(term170499, term170499.getClass(), "playerRating", 2107338015);
        setLongField(term170499, term170499.getClass(), "playedUserId1", 2362710323589009829L);
        setField(term170499, term170499.getClass(), "playedUserName1", "vQLwJDUryB");
        setIntField(term170499, term170499.getClass(), "playedMusicLevel1", 1176997851);
        setLongField(term170499, term170499.getClass(), "playedUserId2", -1353104097704898755L);
        setField(term170499, term170499.getClass(), "playedUserName2", "JhCgwQaWUU");
        setIntField(term170499, term170499.getClass(), "playedMusicLevel2", -1537259704);
        setLongField(term170499, term170499.getClass(), "playedUserId3", 1331926449821360443L);
        setField(term170499, term170499.getClass(), "playedUserName3", "MbEifzcdun");
        setIntField(term170499, term170499.getClass(), "playedMusicLevel3", -733074161);
        setIntField(term170499, term170499.getClass(), "achievement", 2050810379);
        setIntField(term170499, term170499.getClass(), "score", 2024170268);
        setIntField(term170499, term170499.getClass(), "tapScore", 938970749);
        setIntField(term170499, term170499.getClass(), "holdScore", -1096562684);
        setIntField(term170499, term170499.getClass(), "slideScore", 1044386731);
        setIntField(term170499, term170499.getClass(), "breakScore", 1756025229);
        setIntField(term170499, term170499.getClass(), "syncRate", 949470299);
        setIntField(term170499, term170499.getClass(), "vsWin", 1459814829);
        setBooleanField(term170499, term170499.getClass(), "isAllPerfect", true);
        setIntField(term170499, term170499.getClass(), "fullCombo", -224788243);
        setIntField(term170499, term170499.getClass(), "maxFever", 977480006);
        setIntField(term170499, term170499.getClass(), "maxCombo", 1214329626);
        setIntField(term170499, term170499.getClass(), "tapPerfect", 1964003183);
        setIntField(term170499, term170499.getClass(), "tapGreat", 30653101);
        setIntField(term170499, term170499.getClass(), "tapGood", 93264791);
        setIntField(term170499, term170499.getClass(), "tapBad", 324791650);
        setIntField(term170499, term170499.getClass(), "holdPerfect", 2072644421);
        setIntField(term170499, term170499.getClass(), "holdGreat", 506136975);
        setIntField(term170499, term170499.getClass(), "holdGood", 2131939404);
        setIntField(term170499, term170499.getClass(), "holdBad", 1490360901);
        setIntField(term170499, term170499.getClass(), "slidePerfect", -1432616289);
        setIntField(term170499, term170499.getClass(), "slideGreat", -742974194);
        setIntField(term170499, term170499.getClass(), "slideGood", -451843791);
        setIntField(term170499, term170499.getClass(), "slideBad", 46238831);
        setIntField(term170499, term170499.getClass(), "breakPerfect", 614633350);
        setIntField(term170499, term170499.getClass(), "breakGreat", 1027643349);
        setIntField(term170499, term170499.getClass(), "breakGood", 1343076824);
        setIntField(term170499, term170499.getClass(), "breakBad", 1918245020);
        setBooleanField(term170499, term170499.getClass(), "isTrackSkip", false);
        setBooleanField(term170499, term170499.getClass(), "isHighScore", false);
        setBooleanField(term170499, term170499.getClass(), "isChallengeTrack", false);
        setIntField(term170499, term170499.getClass(), "challengeLife", -1281122301);
        setIntField(term170499, term170499.getClass(), "challengeRemain", 1570606413);
        setIntField(term170499, term170499.getClass(), "isAllPerfectPlus", -2127022183);
        term170811 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term170811;
        callMethod(klass, "equals", argTypes, term170499, args);
    }

};


