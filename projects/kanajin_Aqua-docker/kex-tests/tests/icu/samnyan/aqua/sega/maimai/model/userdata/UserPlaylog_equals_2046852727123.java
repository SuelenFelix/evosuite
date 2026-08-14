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

public class UserPlaylog_equals_2046852727123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170555;
     Object term170867;

    public UserPlaylog_equals_2046852727123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170561 = new Long(-4562564710769146498L);
        term170555 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term170557 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term170559 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170575 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170576 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170580 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170590 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term170555, term170555.getClass(), "id", 5254427735699890849L);
        setLongField(term170557, term170557.getClass(), "id", -2981899957757551501L);
        setLongField(term170559, term170559.getClass(), "id", -3796499281571450784L);
        setField(term170559, term170559.getClass(), "extId", term170561);
        setField(term170559, term170559.getClass(), "luid", "FjPjLYxYCD");
        setIntField(term170576, term170576.getClass(), "year", 2013);
        setShortField(term170576, term170576.getClass(), "month", (short) 3);
        setShortField(term170576, term170576.getClass(), "day", (short) 23);
        setField(term170575, term170575.getClass(), "date", term170576);
        setByteField(term170580, term170580.getClass(), "hour", (byte) 15);
        setByteField(term170580, term170580.getClass(), "minute", (byte) 5);
        setByteField(term170580, term170580.getClass(), "second", (byte) 38);
        setIntField(term170580, term170580.getClass(), "nano", 214541172);
        setField(term170575, term170575.getClass(), "time", term170580);
        setField(term170559, term170559.getClass(), "registerTime", term170575);
        setIntField(term170586, term170586.getClass(), "year", 2019);
        setShortField(term170586, term170586.getClass(), "month", (short) 4);
        setShortField(term170586, term170586.getClass(), "day", (short) 27);
        setField(term170585, term170585.getClass(), "date", term170586);
        setByteField(term170590, term170590.getClass(), "hour", (byte) 14);
        setByteField(term170590, term170590.getClass(), "minute", (byte) 36);
        setByteField(term170590, term170590.getClass(), "second", (byte) 3);
        setIntField(term170590, term170590.getClass(), "nano", 745093939);
        setField(term170585, term170585.getClass(), "time", term170590);
        setField(term170559, term170559.getClass(), "accessTime", term170585);
        setField(term170557, term170557.getClass(), "card", term170559);
        setIntField(term170557, term170557.getClass(), "lastDataVersion", -1674438948);
        setField(term170557, term170557.getClass(), "userName", "MVKJWagTKW");
        setIntField(term170557, term170557.getClass(), "point", -729833150);
        setIntField(term170557, term170557.getClass(), "totalPoint", -134344624);
        setIntField(term170557, term170557.getClass(), "iconId", 1715936337);
        setIntField(term170557, term170557.getClass(), "nameplateId", -1048852351);
        setIntField(term170557, term170557.getClass(), "frameId", 1943512594);
        setIntField(term170557, term170557.getClass(), "trophyId", 1042164264);
        setIntField(term170557, term170557.getClass(), "playCount", -2015710129);
        setIntField(term170557, term170557.getClass(), "playVsCount", 360782425);
        setIntField(term170557, term170557.getClass(), "playSyncCount", 275854548);
        setIntField(term170557, term170557.getClass(), "winCount", -1407954490);
        setIntField(term170557, term170557.getClass(), "helpCount", 765186263);
        setIntField(term170557, term170557.getClass(), "comboCount", 2141645226);
        setIntField(term170557, term170557.getClass(), "feverCount", 1391245502);
        setIntField(term170557, term170557.getClass(), "totalHiScore", -427719081);
        setIntField(term170557, term170557.getClass(), "totalEasyHighScore", -124387312);
        setIntField(term170557, term170557.getClass(), "totalBasicHighScore", 2055675770);
        setIntField(term170557, term170557.getClass(), "totalAdvancedHighScore", 1223723655);
        setIntField(term170557, term170557.getClass(), "totalExpertHighScore", 831915664);
        setIntField(term170557, term170557.getClass(), "totalMasterHighScore", 637683364);
        setIntField(term170557, term170557.getClass(), "totalReMasterHighScore", 722470445);
        setIntField(term170557, term170557.getClass(), "totalHighSync", -1885225159);
        setIntField(term170557, term170557.getClass(), "totalEasySync", -1815881485);
        setIntField(term170557, term170557.getClass(), "totalBasicSync", 1382562999);
        setIntField(term170557, term170557.getClass(), "totalAdvancedSync", 2123421042);
        setIntField(term170557, term170557.getClass(), "totalExpertSync", 316313675);
        setIntField(term170557, term170557.getClass(), "totalMasterSync", 1809519697);
        setIntField(term170557, term170557.getClass(), "totalReMasterSync", 511673876);
        setIntField(term170557, term170557.getClass(), "playerRating", -660039584);
        setIntField(term170557, term170557.getClass(), "highestRating", 534163694);
        setIntField(term170557, term170557.getClass(), "rankAuthTailId", -1165775729);
        setField(term170557, term170557.getClass(), "eventWatchedDate", "JrgxSjdHDm");
        setField(term170557, term170557.getClass(), "webLimitDate", "oYTaCsZgHc");
        setIntField(term170557, term170557.getClass(), "challengeTrackPhase", -1565255255);
        setIntField(term170557, term170557.getClass(), "firstPlayBits", -1850027557);
        setField(term170557, term170557.getClass(), "lastPlayDate", "JjbnWzssdi");
        setIntField(term170557, term170557.getClass(), "lastPlaceId", 1287595175);
        setField(term170557, term170557.getClass(), "lastPlaceName", "JBjRYdrxgs");
        setIntField(term170557, term170557.getClass(), "lastRegionId", -2080323668);
        setField(term170557, term170557.getClass(), "lastRegionName", "SGDHQYYzsR");
        setField(term170557, term170557.getClass(), "lastClientId", "hecboVcqgp");
        setField(term170557, term170557.getClass(), "lastCountryCode", "yjLlTYCCBx");
        setIntField(term170557, term170557.getClass(), "eventPoint", 1700990005);
        setIntField(term170557, term170557.getClass(), "totalLv", 1658815292);
        setIntField(term170557, term170557.getClass(), "lastLoginBonusDay", 1795451677);
        setIntField(term170557, term170557.getClass(), "lastSurvivalBonusDay", 1130749698);
        setIntField(term170557, term170557.getClass(), "loginBonusLv", -955461057);
        setField(term170555, term170555.getClass(), "user", term170557);
        setIntField(term170555, term170555.getClass(), "orderId", 58358065);
        setLongField(term170555, term170555.getClass(), "sortNumber", 2856654200900890130L);
        setIntField(term170555, term170555.getClass(), "placeId", 705631540);
        setField(term170555, term170555.getClass(), "placeName", "tmMslEelEQ");
        setField(term170555, term170555.getClass(), "country", "zQlbOXpNcl");
        setIntField(term170555, term170555.getClass(), "regionId", -1675218741);
        setField(term170555, term170555.getClass(), "playDate", "iDjBOxOVMQ");
        setField(term170555, term170555.getClass(), "userPlayDate", "QSvmOZQTXd");
        setIntField(term170555, term170555.getClass(), "musicId", -1709888183);
        setIntField(term170555, term170555.getClass(), "level", -117439776);
        setIntField(term170555, term170555.getClass(), "gameMode", 1471944537);
        setIntField(term170555, term170555.getClass(), "rivalNum", 1047217638);
        setIntField(term170555, term170555.getClass(), "track", 1618491461);
        setIntField(term170555, term170555.getClass(), "eventId", -1725204654);
        setBooleanField(term170555, term170555.getClass(), "isFreeToPlay", true);
        setIntField(term170555, term170555.getClass(), "playerRating", 2107338015);
        setLongField(term170555, term170555.getClass(), "playedUserId1", 2362710323589009829L);
        setField(term170555, term170555.getClass(), "playedUserName1", "vQLwJDUryB");
        setIntField(term170555, term170555.getClass(), "playedMusicLevel1", 1176997851);
        setLongField(term170555, term170555.getClass(), "playedUserId2", -1353104097704898755L);
        setField(term170555, term170555.getClass(), "playedUserName2", "JhCgwQaWUU");
        setIntField(term170555, term170555.getClass(), "playedMusicLevel2", -1537259704);
        setLongField(term170555, term170555.getClass(), "playedUserId3", 1331926449821360443L);
        setField(term170555, term170555.getClass(), "playedUserName3", "MbEifzcdun");
        setIntField(term170555, term170555.getClass(), "playedMusicLevel3", -733074161);
        setIntField(term170555, term170555.getClass(), "achievement", 2050810379);
        setIntField(term170555, term170555.getClass(), "score", 2024170268);
        setIntField(term170555, term170555.getClass(), "tapScore", 938970749);
        setIntField(term170555, term170555.getClass(), "holdScore", -1096562684);
        setIntField(term170555, term170555.getClass(), "slideScore", 1044386731);
        setIntField(term170555, term170555.getClass(), "breakScore", 1756025229);
        setIntField(term170555, term170555.getClass(), "syncRate", 949470299);
        setIntField(term170555, term170555.getClass(), "vsWin", 1459814829);
        setBooleanField(term170555, term170555.getClass(), "isAllPerfect", true);
        setIntField(term170555, term170555.getClass(), "fullCombo", -224788243);
        setIntField(term170555, term170555.getClass(), "maxFever", 977480006);
        setIntField(term170555, term170555.getClass(), "maxCombo", 1214329626);
        setIntField(term170555, term170555.getClass(), "tapPerfect", 1964003183);
        setIntField(term170555, term170555.getClass(), "tapGreat", 30653101);
        setIntField(term170555, term170555.getClass(), "tapGood", 93264791);
        setIntField(term170555, term170555.getClass(), "tapBad", 324791650);
        setIntField(term170555, term170555.getClass(), "holdPerfect", 2072644421);
        setIntField(term170555, term170555.getClass(), "holdGreat", 506136975);
        setIntField(term170555, term170555.getClass(), "holdGood", 2131939404);
        setIntField(term170555, term170555.getClass(), "holdBad", 1490360901);
        setIntField(term170555, term170555.getClass(), "slidePerfect", -1432616289);
        setIntField(term170555, term170555.getClass(), "slideGreat", -742974194);
        setIntField(term170555, term170555.getClass(), "slideGood", -451843791);
        setIntField(term170555, term170555.getClass(), "slideBad", 46238831);
        setIntField(term170555, term170555.getClass(), "breakPerfect", 614633350);
        setIntField(term170555, term170555.getClass(), "breakGreat", 1027643349);
        setIntField(term170555, term170555.getClass(), "breakGood", 1343076824);
        setIntField(term170555, term170555.getClass(), "breakBad", 1918245020);
        setBooleanField(term170555, term170555.getClass(), "isTrackSkip", false);
        setBooleanField(term170555, term170555.getClass(), "isHighScore", false);
        setBooleanField(term170555, term170555.getClass(), "isChallengeTrack", false);
        setIntField(term170555, term170555.getClass(), "challengeLife", -1281122301);
        setIntField(term170555, term170555.getClass(), "challengeRemain", 1570606413);
        setIntField(term170555, term170555.getClass(), "isAllPerfectPlus", -2127022183);
        term170867 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term170867;
        callMethod(klass, "equals", argTypes, term170555, args);
    }

};


