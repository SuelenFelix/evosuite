package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMusicDetail_getMissCount_167781168011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92539;

    public UserMusicDetail_getMissCount_167781168011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term92545 = new Long(-8614778293741404325L);
        term92539 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term92541 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term92543 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term92559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92564 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92574 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92705 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92751 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term92539, term92539.getClass(), "id", 2769769615541963064L);
        setLongField(term92541, term92541.getClass(), "id", 3900506286067369407L);
        setLongField(term92543, term92543.getClass(), "id", 2739506880892071716L);
        setField(term92543, term92543.getClass(), "extId", term92545);
        setField(term92543, term92543.getClass(), "luid", "gyLdvdOJQs");
        setIntField(term92560, term92560.getClass(), "year", 2015);
        setShortField(term92560, term92560.getClass(), "month", (short) 1);
        setShortField(term92560, term92560.getClass(), "day", (short) 10);
        setField(term92559, term92559.getClass(), "date", term92560);
        setByteField(term92564, term92564.getClass(), "hour", (byte) 5);
        setByteField(term92564, term92564.getClass(), "minute", (byte) 5);
        setByteField(term92564, term92564.getClass(), "second", (byte) 35);
        setIntField(term92564, term92564.getClass(), "nano", 682478512);
        setField(term92559, term92559.getClass(), "time", term92564);
        setField(term92543, term92543.getClass(), "registerTime", term92559);
        setIntField(term92570, term92570.getClass(), "year", 2017);
        setShortField(term92570, term92570.getClass(), "month", (short) 7);
        setShortField(term92570, term92570.getClass(), "day", (short) 4);
        setField(term92569, term92569.getClass(), "date", term92570);
        setByteField(term92574, term92574.getClass(), "hour", (byte) 11);
        setByteField(term92574, term92574.getClass(), "minute", (byte) 29);
        setByteField(term92574, term92574.getClass(), "second", (byte) 31);
        setIntField(term92574, term92574.getClass(), "nano", 651239663);
        setField(term92569, term92569.getClass(), "time", term92574);
        setField(term92543, term92543.getClass(), "accessTime", term92569);
        setField(term92541, term92541.getClass(), "card", term92543);
        setField(term92541, term92541.getClass(), "userName", "PASAYkwcOc");
        setIntField(term92592, term92592.getClass(), "year", 2013);
        setShortField(term92592, term92592.getClass(), "month", (short) 2);
        setShortField(term92592, term92592.getClass(), "day", (short) 17);
        setField(term92591, term92591.getClass(), "date", term92592);
        setByteField(term92596, term92596.getClass(), "hour", (byte) 5);
        setByteField(term92596, term92596.getClass(), "minute", (byte) 34);
        setByteField(term92596, term92596.getClass(), "second", (byte) 24);
        setIntField(term92596, term92596.getClass(), "nano", 216223624);
        setField(term92591, term92591.getClass(), "time", term92596);
        setField(term92541, term92541.getClass(), "lastLoginDate", term92591);
        setBooleanField(term92541, term92541.getClass(), "isWebJoin", false);
        setField(term92541, term92541.getClass(), "webLimitDate", "aeiojdusXr");
        setIntField(term92541, term92541.getClass(), "level", -1926082322);
        setIntField(term92541, term92541.getClass(), "reincarnationNum", 210448865);
        setField(term92541, term92541.getClass(), "exp", "KKgjZsGDBV");
        setLongField(term92541, term92541.getClass(), "point", 6348449517519237060L);
        setLongField(term92541, term92541.getClass(), "totalPoint", -3736670675123148973L);
        setIntField(term92541, term92541.getClass(), "playCount", 1795078195);
        setIntField(term92541, term92541.getClass(), "multiPlayCount", -118250608);
        setIntField(term92541, term92541.getClass(), "multiWinCount", -19855467);
        setIntField(term92541, term92541.getClass(), "requestResCount", -381214484);
        setIntField(term92541, term92541.getClass(), "acceptResCount", 1908628900);
        setIntField(term92541, term92541.getClass(), "successResCount", -254024426);
        setIntField(term92541, term92541.getClass(), "playerRating", 2035106255);
        setIntField(term92541, term92541.getClass(), "highestRating", -65925181);
        setIntField(term92541, term92541.getClass(), "nameplateId", -134969175);
        setIntField(term92541, term92541.getClass(), "frameId", 985529917);
        setIntField(term92541, term92541.getClass(), "characterId", -1459510700);
        setIntField(term92541, term92541.getClass(), "trophyId", -1060341148);
        setIntField(term92541, term92541.getClass(), "playedTutorialBit", 1931459176);
        setIntField(term92541, term92541.getClass(), "firstTutorialCancelNum", 266090245);
        setIntField(term92541, term92541.getClass(), "masterTutorialCancelNum", 1329931034);
        setIntField(term92541, term92541.getClass(), "totalRepertoireCount", -2040965607);
        setIntField(term92541, term92541.getClass(), "totalMapNum", 2056421741);
        setLongField(term92541, term92541.getClass(), "totalHiScore", -732854020469829996L);
        setLongField(term92541, term92541.getClass(), "totalBasicHighScore", 2356364798178675182L);
        setLongField(term92541, term92541.getClass(), "totalAdvancedHighScore", 7063501880932248824L);
        setLongField(term92541, term92541.getClass(), "totalExpertHighScore", 8782042393246212473L);
        setLongField(term92541, term92541.getClass(), "totalMasterHighScore", -5149906517600309652L);
        setIntField(term92653, term92653.getClass(), "year", 2020);
        setShortField(term92653, term92653.getClass(), "month", (short) 6);
        setShortField(term92653, term92653.getClass(), "day", (short) 23);
        setField(term92652, term92652.getClass(), "date", term92653);
        setByteField(term92657, term92657.getClass(), "hour", (byte) 8);
        setByteField(term92657, term92657.getClass(), "minute", (byte) 49);
        setByteField(term92657, term92657.getClass(), "second", (byte) 23);
        setIntField(term92657, term92657.getClass(), "nano", 796980154);
        setField(term92652, term92652.getClass(), "time", term92657);
        setField(term92541, term92541.getClass(), "eventWatchedDate", term92652);
        setIntField(term92541, term92541.getClass(), "friendCount", 473013403);
        setBooleanField(term92541, term92541.getClass(), "isMaimai", true);
        setField(term92541, term92541.getClass(), "firstGameId", "EkIjtjomYk");
        setField(term92541, term92541.getClass(), "firstRomVersion", "ZOUuaTJRXe");
        setField(term92541, term92541.getClass(), "firstDataVersion", "gIyzpvuRnO");
        setIntField(term92701, term92701.getClass(), "year", 2027);
        setShortField(term92701, term92701.getClass(), "month", (short) 4);
        setShortField(term92701, term92701.getClass(), "day", (short) 15);
        setField(term92700, term92700.getClass(), "date", term92701);
        setByteField(term92705, term92705.getClass(), "hour", (byte) 15);
        setByteField(term92705, term92705.getClass(), "minute", (byte) 59);
        setByteField(term92705, term92705.getClass(), "second", (byte) 10);
        setIntField(term92705, term92705.getClass(), "nano", 207659126);
        setField(term92700, term92700.getClass(), "time", term92705);
        setField(term92541, term92541.getClass(), "firstPlayDate", term92700);
        setField(term92541, term92541.getClass(), "lastGameId", "oLFNhFdMBL");
        setField(term92541, term92541.getClass(), "lastRomVersion", "umJDDpmFWA");
        setField(term92541, term92541.getClass(), "lastDataVersion", "BczZfNSwaD");
        setIntField(term92747, term92747.getClass(), "year", 2021);
        setShortField(term92747, term92747.getClass(), "month", (short) 12);
        setShortField(term92747, term92747.getClass(), "day", (short) 11);
        setField(term92746, term92746.getClass(), "date", term92747);
        setByteField(term92751, term92751.getClass(), "hour", (byte) 8);
        setByteField(term92751, term92751.getClass(), "minute", (byte) 30);
        setByteField(term92751, term92751.getClass(), "second", (byte) 15);
        setIntField(term92751, term92751.getClass(), "nano", 355111694);
        setField(term92746, term92746.getClass(), "time", term92751);
        setField(term92541, term92541.getClass(), "lastPlayDate", term92746);
        setIntField(term92541, term92541.getClass(), "lastPlaceId", 139601586);
        setField(term92541, term92541.getClass(), "lastPlaceName", "UqBrzYVNgu");
        setField(term92541, term92541.getClass(), "lastRegionId", "yETjenqbhE");
        setField(term92541, term92541.getClass(), "lastRegionName", "XzpzIeoooh");
        setField(term92541, term92541.getClass(), "lastAllNetId", "sbsbTdToVA");
        setField(term92541, term92541.getClass(), "lastClientId", "PTMnmtfPDP");
        setField(term92539, term92539.getClass(), "user", term92541);
        setIntField(term92539, term92539.getClass(), "musicId", 198201617);
        setIntField(term92539, term92539.getClass(), "level", -816938071);
        setIntField(term92539, term92539.getClass(), "playCount", -703996658);
        setIntField(term92539, term92539.getClass(), "scoreMax", -1472021518);
        setIntField(term92539, term92539.getClass(), "resRequestCount", 1339815724);
        setIntField(term92539, term92539.getClass(), "resAcceptCount", 128296124);
        setIntField(term92539, term92539.getClass(), "resSuccessCount", 412002888);
        setIntField(term92539, term92539.getClass(), "missCount", -518326317);
        setIntField(term92539, term92539.getClass(), "maxComboCount", 638898197);
        setBooleanField(term92539, term92539.getClass(), "isFullCombo", false);
        setBooleanField(term92539, term92539.getClass(), "isAllJustice", true);
        setBooleanField(term92539, term92539.getClass(), "isSuccess", true);
        setIntField(term92539, term92539.getClass(), "fullChain", 377212022);
        setIntField(term92539, term92539.getClass(), "maxChain", 1288951867);
        setIntField(term92539, term92539.getClass(), "scoreRank", -1878750819);
        setBooleanField(term92539, term92539.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMissCount", argTypes, term92539, args);
    }

};


