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

public class UserPlaylog_getPlayerRating_192557076917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120415;

    public UserPlaylog_getPlayerRating_192557076917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term120421 = new Long(8073378116544724166L);
        term120415 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term120417 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term120419 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term120435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120450 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term120415, term120415.getClass(), "id", -8751837616810275039L);
        setLongField(term120417, term120417.getClass(), "id", -8676733724224510585L);
        setLongField(term120419, term120419.getClass(), "id", 1318139313166175279L);
        setField(term120419, term120419.getClass(), "extId", term120421);
        setField(term120419, term120419.getClass(), "luid", "hqyMxHWbGv");
        setIntField(term120436, term120436.getClass(), "year", 2029);
        setShortField(term120436, term120436.getClass(), "month", (short) 9);
        setShortField(term120436, term120436.getClass(), "day", (short) 28);
        setField(term120435, term120435.getClass(), "date", term120436);
        setByteField(term120440, term120440.getClass(), "hour", (byte) 23);
        setByteField(term120440, term120440.getClass(), "minute", (byte) 32);
        setByteField(term120440, term120440.getClass(), "second", (byte) 19);
        setIntField(term120440, term120440.getClass(), "nano", 974262271);
        setField(term120435, term120435.getClass(), "time", term120440);
        setField(term120419, term120419.getClass(), "registerTime", term120435);
        setIntField(term120446, term120446.getClass(), "year", 2022);
        setShortField(term120446, term120446.getClass(), "month", (short) 2);
        setShortField(term120446, term120446.getClass(), "day", (short) 27);
        setField(term120445, term120445.getClass(), "date", term120446);
        setByteField(term120450, term120450.getClass(), "hour", (byte) 8);
        setByteField(term120450, term120450.getClass(), "minute", (byte) 19);
        setByteField(term120450, term120450.getClass(), "second", (byte) 13);
        setIntField(term120450, term120450.getClass(), "nano", 625027479);
        setField(term120445, term120445.getClass(), "time", term120450);
        setField(term120419, term120419.getClass(), "accessTime", term120445);
        setField(term120417, term120417.getClass(), "card", term120419);
        setIntField(term120417, term120417.getClass(), "lastDataVersion", 536230173);
        setField(term120417, term120417.getClass(), "userName", "ucSkoerFDq");
        setIntField(term120417, term120417.getClass(), "point", 1592003857);
        setIntField(term120417, term120417.getClass(), "totalPoint", -1887501397);
        setIntField(term120417, term120417.getClass(), "iconId", 154448312);
        setIntField(term120417, term120417.getClass(), "nameplateId", 138276904);
        setIntField(term120417, term120417.getClass(), "frameId", -2109036857);
        setIntField(term120417, term120417.getClass(), "trophyId", 135499222);
        setIntField(term120417, term120417.getClass(), "playCount", 1653333305);
        setIntField(term120417, term120417.getClass(), "playVsCount", -627625760);
        setIntField(term120417, term120417.getClass(), "playSyncCount", -1512097288);
        setIntField(term120417, term120417.getClass(), "winCount", 855730514);
        setIntField(term120417, term120417.getClass(), "helpCount", 1540516464);
        setIntField(term120417, term120417.getClass(), "comboCount", -765931973);
        setIntField(term120417, term120417.getClass(), "feverCount", 1553464782);
        setIntField(term120417, term120417.getClass(), "totalHiScore", -377732866);
        setIntField(term120417, term120417.getClass(), "totalEasyHighScore", 793253863);
        setIntField(term120417, term120417.getClass(), "totalBasicHighScore", -65663655);
        setIntField(term120417, term120417.getClass(), "totalAdvancedHighScore", 55766550);
        setIntField(term120417, term120417.getClass(), "totalExpertHighScore", 1326458042);
        setIntField(term120417, term120417.getClass(), "totalMasterHighScore", 2065869723);
        setIntField(term120417, term120417.getClass(), "totalReMasterHighScore", -865224762);
        setIntField(term120417, term120417.getClass(), "totalHighSync", -803624396);
        setIntField(term120417, term120417.getClass(), "totalEasySync", 1824960332);
        setIntField(term120417, term120417.getClass(), "totalBasicSync", 1452928275);
        setIntField(term120417, term120417.getClass(), "totalAdvancedSync", -1153331717);
        setIntField(term120417, term120417.getClass(), "totalExpertSync", -1018179752);
        setIntField(term120417, term120417.getClass(), "totalMasterSync", -958519673);
        setIntField(term120417, term120417.getClass(), "totalReMasterSync", 1894821044);
        setIntField(term120417, term120417.getClass(), "playerRating", 814997034);
        setIntField(term120417, term120417.getClass(), "highestRating", -1942994450);
        setIntField(term120417, term120417.getClass(), "rankAuthTailId", -2062550615);
        setField(term120417, term120417.getClass(), "eventWatchedDate", "UasONzOTXn");
        setField(term120417, term120417.getClass(), "webLimitDate", "gRkWWojcfo");
        setIntField(term120417, term120417.getClass(), "challengeTrackPhase", -919180205);
        setIntField(term120417, term120417.getClass(), "firstPlayBits", 2145469243);
        setField(term120417, term120417.getClass(), "lastPlayDate", "FHujUNXIxu");
        setIntField(term120417, term120417.getClass(), "lastPlaceId", -1085203878);
        setField(term120417, term120417.getClass(), "lastPlaceName", "OMWsPUFcoJ");
        setIntField(term120417, term120417.getClass(), "lastRegionId", 2102804997);
        setField(term120417, term120417.getClass(), "lastRegionName", "oWooJBZOyh");
        setField(term120417, term120417.getClass(), "lastClientId", "iNnWLGJCBN");
        setField(term120417, term120417.getClass(), "lastCountryCode", "jYJrGEVHCD");
        setIntField(term120417, term120417.getClass(), "eventPoint", -2061337332);
        setIntField(term120417, term120417.getClass(), "totalLv", -1750544367);
        setIntField(term120417, term120417.getClass(), "lastLoginBonusDay", -986896155);
        setIntField(term120417, term120417.getClass(), "lastSurvivalBonusDay", -1913247263);
        setIntField(term120417, term120417.getClass(), "loginBonusLv", 841131601);
        setField(term120415, term120415.getClass(), "user", term120417);
        setIntField(term120415, term120415.getClass(), "orderId", 1026894609);
        setLongField(term120415, term120415.getClass(), "sortNumber", 1712520441197520950L);
        setIntField(term120415, term120415.getClass(), "placeId", -752007950);
        setField(term120415, term120415.getClass(), "placeName", "wlBPkhpzWH");
        setField(term120415, term120415.getClass(), "country", "aBZsgezjug");
        setIntField(term120415, term120415.getClass(), "regionId", 529489313);
        setField(term120415, term120415.getClass(), "playDate", "hvlXhuKNfP");
        setField(term120415, term120415.getClass(), "userPlayDate", "csdpRGUrjJ");
        setIntField(term120415, term120415.getClass(), "musicId", -1966822843);
        setIntField(term120415, term120415.getClass(), "level", -1126343197);
        setIntField(term120415, term120415.getClass(), "gameMode", -1298474124);
        setIntField(term120415, term120415.getClass(), "rivalNum", -1320228060);
        setIntField(term120415, term120415.getClass(), "track", -2059191478);
        setIntField(term120415, term120415.getClass(), "eventId", 2099010938);
        setBooleanField(term120415, term120415.getClass(), "isFreeToPlay", false);
        setIntField(term120415, term120415.getClass(), "playerRating", 1636331683);
        setLongField(term120415, term120415.getClass(), "playedUserId1", 7043650218274841102L);
        setField(term120415, term120415.getClass(), "playedUserName1", "FtOpFdJBak");
        setIntField(term120415, term120415.getClass(), "playedMusicLevel1", -362400915);
        setLongField(term120415, term120415.getClass(), "playedUserId2", -6096774034189525139L);
        setField(term120415, term120415.getClass(), "playedUserName2", "mqiIwoVVkU");
        setIntField(term120415, term120415.getClass(), "playedMusicLevel2", -1686882600);
        setLongField(term120415, term120415.getClass(), "playedUserId3", -6476891479972746312L);
        setField(term120415, term120415.getClass(), "playedUserName3", "LYcLrQMkAA");
        setIntField(term120415, term120415.getClass(), "playedMusicLevel3", -1152741806);
        setIntField(term120415, term120415.getClass(), "achievement", 22284525);
        setIntField(term120415, term120415.getClass(), "score", -1429417338);
        setIntField(term120415, term120415.getClass(), "tapScore", -1579206256);
        setIntField(term120415, term120415.getClass(), "holdScore", 1135921400);
        setIntField(term120415, term120415.getClass(), "slideScore", -2009944790);
        setIntField(term120415, term120415.getClass(), "breakScore", -195124832);
        setIntField(term120415, term120415.getClass(), "syncRate", 815849616);
        setIntField(term120415, term120415.getClass(), "vsWin", 1484825295);
        setBooleanField(term120415, term120415.getClass(), "isAllPerfect", false);
        setIntField(term120415, term120415.getClass(), "fullCombo", 913538580);
        setIntField(term120415, term120415.getClass(), "maxFever", -1563084929);
        setIntField(term120415, term120415.getClass(), "maxCombo", 909134856);
        setIntField(term120415, term120415.getClass(), "tapPerfect", 1535508240);
        setIntField(term120415, term120415.getClass(), "tapGreat", -2011428106);
        setIntField(term120415, term120415.getClass(), "tapGood", -953251052);
        setIntField(term120415, term120415.getClass(), "tapBad", 1063368461);
        setIntField(term120415, term120415.getClass(), "holdPerfect", -1690162158);
        setIntField(term120415, term120415.getClass(), "holdGreat", -681123934);
        setIntField(term120415, term120415.getClass(), "holdGood", 564331);
        setIntField(term120415, term120415.getClass(), "holdBad", -631621459);
        setIntField(term120415, term120415.getClass(), "slidePerfect", -896986933);
        setIntField(term120415, term120415.getClass(), "slideGreat", -272073305);
        setIntField(term120415, term120415.getClass(), "slideGood", 1586776007);
        setIntField(term120415, term120415.getClass(), "slideBad", 416678466);
        setIntField(term120415, term120415.getClass(), "breakPerfect", -505598314);
        setIntField(term120415, term120415.getClass(), "breakGreat", -1431423805);
        setIntField(term120415, term120415.getClass(), "breakGood", -1119901942);
        setIntField(term120415, term120415.getClass(), "breakBad", 174305035);
        setBooleanField(term120415, term120415.getClass(), "isTrackSkip", true);
        setBooleanField(term120415, term120415.getClass(), "isHighScore", true);
        setBooleanField(term120415, term120415.getClass(), "isChallengeTrack", false);
        setIntField(term120415, term120415.getClass(), "challengeLife", 681540406);
        setIntField(term120415, term120415.getClass(), "challengeRemain", 1248693910);
        setIntField(term120415, term120415.getClass(), "isAllPerfectPlus", -195386022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term120415, args);
    }

};


