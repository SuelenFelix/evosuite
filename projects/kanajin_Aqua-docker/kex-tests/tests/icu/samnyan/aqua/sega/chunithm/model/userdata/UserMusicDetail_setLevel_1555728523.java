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
import java.lang.Integer;

public class UserMusicDetail_setLevel_1555728523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98297;
     Object term98591;

    public UserMusicDetail_setLevel_1555728523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term98303 = new Long(3412644969878030772L);
        term98297 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term98299 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term98301 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term98317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98322 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98332 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98349 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98350 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98354 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98415 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98463 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98509 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term98297, term98297.getClass(), "id", -2240386714187527144L);
        setLongField(term98299, term98299.getClass(), "id", 3524743556565317852L);
        setLongField(term98301, term98301.getClass(), "id", -6550059544186211121L);
        setField(term98301, term98301.getClass(), "extId", term98303);
        setField(term98301, term98301.getClass(), "luid", "XwevHLOcph");
        setIntField(term98318, term98318.getClass(), "year", 2014);
        setShortField(term98318, term98318.getClass(), "month", (short) 9);
        setShortField(term98318, term98318.getClass(), "day", (short) 2);
        setField(term98317, term98317.getClass(), "date", term98318);
        setByteField(term98322, term98322.getClass(), "hour", (byte) 23);
        setByteField(term98322, term98322.getClass(), "minute", (byte) 20);
        setByteField(term98322, term98322.getClass(), "second", (byte) 59);
        setIntField(term98322, term98322.getClass(), "nano", 509609168);
        setField(term98317, term98317.getClass(), "time", term98322);
        setField(term98301, term98301.getClass(), "registerTime", term98317);
        setIntField(term98328, term98328.getClass(), "year", 2029);
        setShortField(term98328, term98328.getClass(), "month", (short) 7);
        setShortField(term98328, term98328.getClass(), "day", (short) 28);
        setField(term98327, term98327.getClass(), "date", term98328);
        setByteField(term98332, term98332.getClass(), "hour", (byte) 8);
        setByteField(term98332, term98332.getClass(), "minute", (byte) 18);
        setByteField(term98332, term98332.getClass(), "second", (byte) 36);
        setIntField(term98332, term98332.getClass(), "nano", 926469870);
        setField(term98327, term98327.getClass(), "time", term98332);
        setField(term98301, term98301.getClass(), "accessTime", term98327);
        setField(term98299, term98299.getClass(), "card", term98301);
        setField(term98299, term98299.getClass(), "userName", "BwsQOfTpXz");
        setIntField(term98350, term98350.getClass(), "year", 2029);
        setShortField(term98350, term98350.getClass(), "month", (short) 12);
        setShortField(term98350, term98350.getClass(), "day", (short) 12);
        setField(term98349, term98349.getClass(), "date", term98350);
        setByteField(term98354, term98354.getClass(), "hour", (byte) 15);
        setByteField(term98354, term98354.getClass(), "minute", (byte) 3);
        setByteField(term98354, term98354.getClass(), "second", (byte) 43);
        setIntField(term98354, term98354.getClass(), "nano", 857071372);
        setField(term98349, term98349.getClass(), "time", term98354);
        setField(term98299, term98299.getClass(), "lastLoginDate", term98349);
        setBooleanField(term98299, term98299.getClass(), "isWebJoin", false);
        setField(term98299, term98299.getClass(), "webLimitDate", "ywBwAaqimp");
        setIntField(term98299, term98299.getClass(), "level", 601640545);
        setIntField(term98299, term98299.getClass(), "reincarnationNum", 1768015672);
        setField(term98299, term98299.getClass(), "exp", "ksNDLlwYiK");
        setLongField(term98299, term98299.getClass(), "point", -3035941748055157425L);
        setLongField(term98299, term98299.getClass(), "totalPoint", 4511007950410890732L);
        setIntField(term98299, term98299.getClass(), "playCount", -575165301);
        setIntField(term98299, term98299.getClass(), "multiPlayCount", -1576541436);
        setIntField(term98299, term98299.getClass(), "multiWinCount", -220907120);
        setIntField(term98299, term98299.getClass(), "requestResCount", -1401366212);
        setIntField(term98299, term98299.getClass(), "acceptResCount", 1124444723);
        setIntField(term98299, term98299.getClass(), "successResCount", -149423332);
        setIntField(term98299, term98299.getClass(), "playerRating", 1593811012);
        setIntField(term98299, term98299.getClass(), "highestRating", 1743792661);
        setIntField(term98299, term98299.getClass(), "nameplateId", -1347677159);
        setIntField(term98299, term98299.getClass(), "frameId", 405531807);
        setIntField(term98299, term98299.getClass(), "characterId", -784847348);
        setIntField(term98299, term98299.getClass(), "trophyId", -1819128604);
        setIntField(term98299, term98299.getClass(), "playedTutorialBit", 937586090);
        setIntField(term98299, term98299.getClass(), "firstTutorialCancelNum", -507719222);
        setIntField(term98299, term98299.getClass(), "masterTutorialCancelNum", -100427651);
        setIntField(term98299, term98299.getClass(), "totalRepertoireCount", -836703719);
        setIntField(term98299, term98299.getClass(), "totalMapNum", -1563918188);
        setLongField(term98299, term98299.getClass(), "totalHiScore", 4662333912633380472L);
        setLongField(term98299, term98299.getClass(), "totalBasicHighScore", 6951012907724798081L);
        setLongField(term98299, term98299.getClass(), "totalAdvancedHighScore", 1454269751791376609L);
        setLongField(term98299, term98299.getClass(), "totalExpertHighScore", 2124910767108105788L);
        setLongField(term98299, term98299.getClass(), "totalMasterHighScore", 7080612204208157613L);
        setIntField(term98411, term98411.getClass(), "year", 2021);
        setShortField(term98411, term98411.getClass(), "month", (short) 7);
        setShortField(term98411, term98411.getClass(), "day", (short) 29);
        setField(term98410, term98410.getClass(), "date", term98411);
        setByteField(term98415, term98415.getClass(), "hour", (byte) 15);
        setByteField(term98415, term98415.getClass(), "minute", (byte) 49);
        setByteField(term98415, term98415.getClass(), "second", (byte) 59);
        setIntField(term98415, term98415.getClass(), "nano", 985113536);
        setField(term98410, term98410.getClass(), "time", term98415);
        setField(term98299, term98299.getClass(), "eventWatchedDate", term98410);
        setIntField(term98299, term98299.getClass(), "friendCount", 153656028);
        setBooleanField(term98299, term98299.getClass(), "isMaimai", true);
        setField(term98299, term98299.getClass(), "firstGameId", "KNuSMewyWo");
        setField(term98299, term98299.getClass(), "firstRomVersion", "OeZpauZbQm");
        setField(term98299, term98299.getClass(), "firstDataVersion", "UjNsLLEXru");
        setIntField(term98459, term98459.getClass(), "year", 2021);
        setShortField(term98459, term98459.getClass(), "month", (short) 5);
        setShortField(term98459, term98459.getClass(), "day", (short) 14);
        setField(term98458, term98458.getClass(), "date", term98459);
        setByteField(term98463, term98463.getClass(), "hour", (byte) 2);
        setByteField(term98463, term98463.getClass(), "minute", (byte) 44);
        setByteField(term98463, term98463.getClass(), "second", (byte) 8);
        setIntField(term98463, term98463.getClass(), "nano", 275891873);
        setField(term98458, term98458.getClass(), "time", term98463);
        setField(term98299, term98299.getClass(), "firstPlayDate", term98458);
        setField(term98299, term98299.getClass(), "lastGameId", "VNJLpmwKSs");
        setField(term98299, term98299.getClass(), "lastRomVersion", "kOHYxuEOpb");
        setField(term98299, term98299.getClass(), "lastDataVersion", "kyzuYwxwKl");
        setIntField(term98505, term98505.getClass(), "year", 2011);
        setShortField(term98505, term98505.getClass(), "month", (short) 12);
        setShortField(term98505, term98505.getClass(), "day", (short) 7);
        setField(term98504, term98504.getClass(), "date", term98505);
        setByteField(term98509, term98509.getClass(), "hour", (byte) 21);
        setByteField(term98509, term98509.getClass(), "minute", (byte) 9);
        setByteField(term98509, term98509.getClass(), "second", (byte) 21);
        setIntField(term98509, term98509.getClass(), "nano", 958199370);
        setField(term98504, term98504.getClass(), "time", term98509);
        setField(term98299, term98299.getClass(), "lastPlayDate", term98504);
        setIntField(term98299, term98299.getClass(), "lastPlaceId", 440521526);
        setField(term98299, term98299.getClass(), "lastPlaceName", "plqwsHlTLA");
        setField(term98299, term98299.getClass(), "lastRegionId", "DDkbTPlKrm");
        setField(term98299, term98299.getClass(), "lastRegionName", "EElRQZBfvW");
        setField(term98299, term98299.getClass(), "lastAllNetId", "grlbPsQxaR");
        setField(term98299, term98299.getClass(), "lastClientId", "PeFIZXlxPN");
        setField(term98297, term98297.getClass(), "user", term98299);
        setIntField(term98297, term98297.getClass(), "musicId", -1106412249);
        setIntField(term98297, term98297.getClass(), "level", -1922114971);
        setIntField(term98297, term98297.getClass(), "playCount", -1285495576);
        setIntField(term98297, term98297.getClass(), "scoreMax", 605159454);
        setIntField(term98297, term98297.getClass(), "resRequestCount", 1393801591);
        setIntField(term98297, term98297.getClass(), "resAcceptCount", -1187577742);
        setIntField(term98297, term98297.getClass(), "resSuccessCount", -793777683);
        setIntField(term98297, term98297.getClass(), "missCount", 1741594607);
        setIntField(term98297, term98297.getClass(), "maxComboCount", 853592734);
        setBooleanField(term98297, term98297.getClass(), "isFullCombo", false);
        setBooleanField(term98297, term98297.getClass(), "isAllJustice", true);
        setBooleanField(term98297, term98297.getClass(), "isSuccess", true);
        setIntField(term98297, term98297.getClass(), "fullChain", -626491911);
        setIntField(term98297, term98297.getClass(), "maxChain", -648815069);
        setIntField(term98297, term98297.getClass(), "scoreRank", 1501415160);
        setBooleanField(term98297, term98297.getClass(), "isLock", false);
        term98591 = new Integer(905044945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term98591;
        callMethod(klass, "setLevel", argTypes, term98297, args);
    }

};


