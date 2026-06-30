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

public class UserMusicDetail_canEqual_160720676239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105432;
     Object term105726;

    public UserMusicDetail_canEqual_160720676239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term105438 = new Long(5731563613239387113L);
        term105432 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term105434 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term105436 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term105452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105457 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105467 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105489 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105550 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105598 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105644 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term105432, term105432.getClass(), "id", 6613572652484057095L);
        setLongField(term105434, term105434.getClass(), "id", 5215884227381487937L);
        setLongField(term105436, term105436.getClass(), "id", 4350818387294517155L);
        setField(term105436, term105436.getClass(), "extId", term105438);
        setField(term105436, term105436.getClass(), "luid", "ODyqlitqRS");
        setIntField(term105453, term105453.getClass(), "year", 2023);
        setShortField(term105453, term105453.getClass(), "month", (short) 3);
        setShortField(term105453, term105453.getClass(), "day", (short) 8);
        setField(term105452, term105452.getClass(), "date", term105453);
        setByteField(term105457, term105457.getClass(), "hour", (byte) 7);
        setByteField(term105457, term105457.getClass(), "minute", (byte) 31);
        setByteField(term105457, term105457.getClass(), "second", (byte) 15);
        setIntField(term105457, term105457.getClass(), "nano", 851391479);
        setField(term105452, term105452.getClass(), "time", term105457);
        setField(term105436, term105436.getClass(), "registerTime", term105452);
        setIntField(term105463, term105463.getClass(), "year", 2017);
        setShortField(term105463, term105463.getClass(), "month", (short) 8);
        setShortField(term105463, term105463.getClass(), "day", (short) 14);
        setField(term105462, term105462.getClass(), "date", term105463);
        setByteField(term105467, term105467.getClass(), "hour", (byte) 13);
        setByteField(term105467, term105467.getClass(), "minute", (byte) 57);
        setByteField(term105467, term105467.getClass(), "second", (byte) 22);
        setIntField(term105467, term105467.getClass(), "nano", 973705522);
        setField(term105462, term105462.getClass(), "time", term105467);
        setField(term105436, term105436.getClass(), "accessTime", term105462);
        setField(term105434, term105434.getClass(), "card", term105436);
        setField(term105434, term105434.getClass(), "userName", "BKEyXkrXND");
        setIntField(term105485, term105485.getClass(), "year", 2010);
        setShortField(term105485, term105485.getClass(), "month", (short) 1);
        setShortField(term105485, term105485.getClass(), "day", (short) 7);
        setField(term105484, term105484.getClass(), "date", term105485);
        setByteField(term105489, term105489.getClass(), "hour", (byte) 5);
        setByteField(term105489, term105489.getClass(), "minute", (byte) 21);
        setByteField(term105489, term105489.getClass(), "second", (byte) 13);
        setIntField(term105489, term105489.getClass(), "nano", 4843701);
        setField(term105484, term105484.getClass(), "time", term105489);
        setField(term105434, term105434.getClass(), "lastLoginDate", term105484);
        setBooleanField(term105434, term105434.getClass(), "isWebJoin", true);
        setField(term105434, term105434.getClass(), "webLimitDate", "xpmkTXUaIW");
        setIntField(term105434, term105434.getClass(), "level", -1206929666);
        setIntField(term105434, term105434.getClass(), "reincarnationNum", -673087697);
        setField(term105434, term105434.getClass(), "exp", "mkwXyNcVfj");
        setLongField(term105434, term105434.getClass(), "point", 7828337678482028682L);
        setLongField(term105434, term105434.getClass(), "totalPoint", 5807310433343059132L);
        setIntField(term105434, term105434.getClass(), "playCount", 821580864);
        setIntField(term105434, term105434.getClass(), "multiPlayCount", 210061350);
        setIntField(term105434, term105434.getClass(), "multiWinCount", -1315216208);
        setIntField(term105434, term105434.getClass(), "requestResCount", -543739494);
        setIntField(term105434, term105434.getClass(), "acceptResCount", -1959832217);
        setIntField(term105434, term105434.getClass(), "successResCount", 61867422);
        setIntField(term105434, term105434.getClass(), "playerRating", 536970938);
        setIntField(term105434, term105434.getClass(), "highestRating", 1370836789);
        setIntField(term105434, term105434.getClass(), "nameplateId", -2117537075);
        setIntField(term105434, term105434.getClass(), "frameId", -707090176);
        setIntField(term105434, term105434.getClass(), "characterId", -1562747284);
        setIntField(term105434, term105434.getClass(), "trophyId", 1595520482);
        setIntField(term105434, term105434.getClass(), "playedTutorialBit", 1344577247);
        setIntField(term105434, term105434.getClass(), "firstTutorialCancelNum", 89754306);
        setIntField(term105434, term105434.getClass(), "masterTutorialCancelNum", -1141919536);
        setIntField(term105434, term105434.getClass(), "totalRepertoireCount", 1482082530);
        setIntField(term105434, term105434.getClass(), "totalMapNum", -1920069753);
        setLongField(term105434, term105434.getClass(), "totalHiScore", -6775652378184115310L);
        setLongField(term105434, term105434.getClass(), "totalBasicHighScore", -535777060253904232L);
        setLongField(term105434, term105434.getClass(), "totalAdvancedHighScore", 4972929179004921399L);
        setLongField(term105434, term105434.getClass(), "totalExpertHighScore", -5802883249742613414L);
        setLongField(term105434, term105434.getClass(), "totalMasterHighScore", 4726334691946813488L);
        setIntField(term105546, term105546.getClass(), "year", 2022);
        setShortField(term105546, term105546.getClass(), "month", (short) 5);
        setShortField(term105546, term105546.getClass(), "day", (short) 19);
        setField(term105545, term105545.getClass(), "date", term105546);
        setByteField(term105550, term105550.getClass(), "hour", (byte) 16);
        setByteField(term105550, term105550.getClass(), "minute", (byte) 33);
        setByteField(term105550, term105550.getClass(), "second", (byte) 4);
        setIntField(term105550, term105550.getClass(), "nano", 239381370);
        setField(term105545, term105545.getClass(), "time", term105550);
        setField(term105434, term105434.getClass(), "eventWatchedDate", term105545);
        setIntField(term105434, term105434.getClass(), "friendCount", -740722091);
        setBooleanField(term105434, term105434.getClass(), "isMaimai", false);
        setField(term105434, term105434.getClass(), "firstGameId", "JaYInVuGAK");
        setField(term105434, term105434.getClass(), "firstRomVersion", "BhaPbaZeBl");
        setField(term105434, term105434.getClass(), "firstDataVersion", "GYqwdcmcTy");
        setIntField(term105594, term105594.getClass(), "year", 2027);
        setShortField(term105594, term105594.getClass(), "month", (short) 4);
        setShortField(term105594, term105594.getClass(), "day", (short) 17);
        setField(term105593, term105593.getClass(), "date", term105594);
        setByteField(term105598, term105598.getClass(), "hour", (byte) 18);
        setByteField(term105598, term105598.getClass(), "minute", (byte) 31);
        setByteField(term105598, term105598.getClass(), "second", (byte) 18);
        setIntField(term105598, term105598.getClass(), "nano", 163095528);
        setField(term105593, term105593.getClass(), "time", term105598);
        setField(term105434, term105434.getClass(), "firstPlayDate", term105593);
        setField(term105434, term105434.getClass(), "lastGameId", "gUVQwUdnBZ");
        setField(term105434, term105434.getClass(), "lastRomVersion", "DbGJbEhLhl");
        setField(term105434, term105434.getClass(), "lastDataVersion", "BGxrtAjHqX");
        setIntField(term105640, term105640.getClass(), "year", 2021);
        setShortField(term105640, term105640.getClass(), "month", (short) 4);
        setShortField(term105640, term105640.getClass(), "day", (short) 19);
        setField(term105639, term105639.getClass(), "date", term105640);
        setByteField(term105644, term105644.getClass(), "hour", (byte) 3);
        setByteField(term105644, term105644.getClass(), "minute", (byte) 50);
        setByteField(term105644, term105644.getClass(), "second", (byte) 53);
        setIntField(term105644, term105644.getClass(), "nano", 269331125);
        setField(term105639, term105639.getClass(), "time", term105644);
        setField(term105434, term105434.getClass(), "lastPlayDate", term105639);
        setIntField(term105434, term105434.getClass(), "lastPlaceId", -758267649);
        setField(term105434, term105434.getClass(), "lastPlaceName", "ABkOTQedzY");
        setField(term105434, term105434.getClass(), "lastRegionId", "EFsPqsIRQv");
        setField(term105434, term105434.getClass(), "lastRegionName", "SLJrzKBPdq");
        setField(term105434, term105434.getClass(), "lastAllNetId", "TanVvFPLln");
        setField(term105434, term105434.getClass(), "lastClientId", "IDakEXhNfN");
        setField(term105432, term105432.getClass(), "user", term105434);
        setIntField(term105432, term105432.getClass(), "musicId", 281378461);
        setIntField(term105432, term105432.getClass(), "level", 1023095456);
        setIntField(term105432, term105432.getClass(), "playCount", -1831793787);
        setIntField(term105432, term105432.getClass(), "scoreMax", 1354308528);
        setIntField(term105432, term105432.getClass(), "resRequestCount", -1618737502);
        setIntField(term105432, term105432.getClass(), "resAcceptCount", 1179678118);
        setIntField(term105432, term105432.getClass(), "resSuccessCount", -806431195);
        setIntField(term105432, term105432.getClass(), "missCount", 2080180241);
        setIntField(term105432, term105432.getClass(), "maxComboCount", 346704875);
        setBooleanField(term105432, term105432.getClass(), "isFullCombo", false);
        setBooleanField(term105432, term105432.getClass(), "isAllJustice", false);
        setBooleanField(term105432, term105432.getClass(), "isSuccess", false);
        setIntField(term105432, term105432.getClass(), "fullChain", -646622035);
        setIntField(term105432, term105432.getClass(), "maxChain", 1580829674);
        setIntField(term105432, term105432.getClass(), "scoreRank", 342864345);
        setBooleanField(term105432, term105432.getClass(), "isLock", false);
        term105726 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term105726;
        callMethod(klass, "canEqual", argTypes, term105432, args);
    }

};


