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

public class UserMusicDetail_getPlayCount_9730977046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90319;

    public UserMusicDetail_getPlayCount_9730977046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90325 = new Long(-8892586408602479513L);
        term90319 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term90321 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term90323 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term90339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90344 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90349 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90350 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90354 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90376 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90437 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90480 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90481 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90485 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90526 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90527 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90531 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term90319, term90319.getClass(), "id", -4884840909566332937L);
        setLongField(term90321, term90321.getClass(), "id", -169133604410652254L);
        setLongField(term90323, term90323.getClass(), "id", -3017833790131447565L);
        setField(term90323, term90323.getClass(), "extId", term90325);
        setField(term90323, term90323.getClass(), "luid", "pgpXJLwACM");
        setIntField(term90340, term90340.getClass(), "year", 2022);
        setShortField(term90340, term90340.getClass(), "month", (short) 6);
        setShortField(term90340, term90340.getClass(), "day", (short) 16);
        setField(term90339, term90339.getClass(), "date", term90340);
        setByteField(term90344, term90344.getClass(), "hour", (byte) 7);
        setByteField(term90344, term90344.getClass(), "minute", (byte) 13);
        setByteField(term90344, term90344.getClass(), "second", (byte) 14);
        setIntField(term90344, term90344.getClass(), "nano", 284843097);
        setField(term90339, term90339.getClass(), "time", term90344);
        setField(term90323, term90323.getClass(), "registerTime", term90339);
        setIntField(term90350, term90350.getClass(), "year", 2026);
        setShortField(term90350, term90350.getClass(), "month", (short) 10);
        setShortField(term90350, term90350.getClass(), "day", (short) 8);
        setField(term90349, term90349.getClass(), "date", term90350);
        setByteField(term90354, term90354.getClass(), "hour", (byte) 23);
        setByteField(term90354, term90354.getClass(), "minute", (byte) 47);
        setByteField(term90354, term90354.getClass(), "second", (byte) 50);
        setIntField(term90354, term90354.getClass(), "nano", 794191369);
        setField(term90349, term90349.getClass(), "time", term90354);
        setField(term90323, term90323.getClass(), "accessTime", term90349);
        setField(term90321, term90321.getClass(), "card", term90323);
        setField(term90321, term90321.getClass(), "userName", "JgrZdrciib");
        setIntField(term90372, term90372.getClass(), "year", 2013);
        setShortField(term90372, term90372.getClass(), "month", (short) 2);
        setShortField(term90372, term90372.getClass(), "day", (short) 5);
        setField(term90371, term90371.getClass(), "date", term90372);
        setByteField(term90376, term90376.getClass(), "hour", (byte) 9);
        setByteField(term90376, term90376.getClass(), "minute", (byte) 41);
        setByteField(term90376, term90376.getClass(), "second", (byte) 23);
        setIntField(term90376, term90376.getClass(), "nano", 128082787);
        setField(term90371, term90371.getClass(), "time", term90376);
        setField(term90321, term90321.getClass(), "lastLoginDate", term90371);
        setBooleanField(term90321, term90321.getClass(), "isWebJoin", false);
        setField(term90321, term90321.getClass(), "webLimitDate", "mjPUAINebK");
        setIntField(term90321, term90321.getClass(), "level", 1639434832);
        setIntField(term90321, term90321.getClass(), "reincarnationNum", 41120682);
        setField(term90321, term90321.getClass(), "exp", "QdBJxwpNcu");
        setLongField(term90321, term90321.getClass(), "point", -4035098953611869778L);
        setLongField(term90321, term90321.getClass(), "totalPoint", -4647988450998060301L);
        setIntField(term90321, term90321.getClass(), "playCount", -565584348);
        setIntField(term90321, term90321.getClass(), "multiPlayCount", 768323855);
        setIntField(term90321, term90321.getClass(), "multiWinCount", -346585829);
        setIntField(term90321, term90321.getClass(), "requestResCount", -1575960315);
        setIntField(term90321, term90321.getClass(), "acceptResCount", -514683546);
        setIntField(term90321, term90321.getClass(), "successResCount", 1234114047);
        setIntField(term90321, term90321.getClass(), "playerRating", 781355790);
        setIntField(term90321, term90321.getClass(), "highestRating", 549100322);
        setIntField(term90321, term90321.getClass(), "nameplateId", 398153902);
        setIntField(term90321, term90321.getClass(), "frameId", 377234030);
        setIntField(term90321, term90321.getClass(), "characterId", 1874512723);
        setIntField(term90321, term90321.getClass(), "trophyId", 1522351738);
        setIntField(term90321, term90321.getClass(), "playedTutorialBit", 1017805089);
        setIntField(term90321, term90321.getClass(), "firstTutorialCancelNum", -1625168727);
        setIntField(term90321, term90321.getClass(), "masterTutorialCancelNum", 1507365243);
        setIntField(term90321, term90321.getClass(), "totalRepertoireCount", -1212284162);
        setIntField(term90321, term90321.getClass(), "totalMapNum", -1956243783);
        setLongField(term90321, term90321.getClass(), "totalHiScore", -6799265768469176623L);
        setLongField(term90321, term90321.getClass(), "totalBasicHighScore", -6960323426014178409L);
        setLongField(term90321, term90321.getClass(), "totalAdvancedHighScore", 5254427735699890849L);
        setLongField(term90321, term90321.getClass(), "totalExpertHighScore", -2981899957757551501L);
        setLongField(term90321, term90321.getClass(), "totalMasterHighScore", -3796499281571450784L);
        setIntField(term90433, term90433.getClass(), "year", 2028);
        setShortField(term90433, term90433.getClass(), "month", (short) 7);
        setShortField(term90433, term90433.getClass(), "day", (short) 15);
        setField(term90432, term90432.getClass(), "date", term90433);
        setByteField(term90437, term90437.getClass(), "hour", (byte) 2);
        setByteField(term90437, term90437.getClass(), "minute", (byte) 10);
        setByteField(term90437, term90437.getClass(), "second", (byte) 41);
        setIntField(term90437, term90437.getClass(), "nano", 72203883);
        setField(term90432, term90432.getClass(), "time", term90437);
        setField(term90321, term90321.getClass(), "eventWatchedDate", term90432);
        setIntField(term90321, term90321.getClass(), "friendCount", 33967357);
        setBooleanField(term90321, term90321.getClass(), "isMaimai", true);
        setField(term90321, term90321.getClass(), "firstGameId", "jdwewuUtBW");
        setField(term90321, term90321.getClass(), "firstRomVersion", "CXekzSdVWc");
        setField(term90321, term90321.getClass(), "firstDataVersion", "heJZxFqAJC");
        setIntField(term90481, term90481.getClass(), "year", 2010);
        setShortField(term90481, term90481.getClass(), "month", (short) 1);
        setShortField(term90481, term90481.getClass(), "day", (short) 16);
        setField(term90480, term90480.getClass(), "date", term90481);
        setByteField(term90485, term90485.getClass(), "hour", (byte) 9);
        setByteField(term90485, term90485.getClass(), "minute", (byte) 12);
        setByteField(term90485, term90485.getClass(), "second", (byte) 44);
        setIntField(term90485, term90485.getClass(), "nano", 134721246);
        setField(term90480, term90480.getClass(), "time", term90485);
        setField(term90321, term90321.getClass(), "firstPlayDate", term90480);
        setField(term90321, term90321.getClass(), "lastGameId", "DGNjGJtXwQ");
        setField(term90321, term90321.getClass(), "lastRomVersion", "BIFQrvbqSd");
        setField(term90321, term90321.getClass(), "lastDataVersion", "wcVhMnVVMH");
        setIntField(term90527, term90527.getClass(), "year", 2018);
        setShortField(term90527, term90527.getClass(), "month", (short) 8);
        setShortField(term90527, term90527.getClass(), "day", (short) 29);
        setField(term90526, term90526.getClass(), "date", term90527);
        setByteField(term90531, term90531.getClass(), "hour", (byte) 10);
        setByteField(term90531, term90531.getClass(), "minute", (byte) 58);
        setByteField(term90531, term90531.getClass(), "second", (byte) 45);
        setIntField(term90531, term90531.getClass(), "nano", 987262592);
        setField(term90526, term90526.getClass(), "time", term90531);
        setField(term90321, term90321.getClass(), "lastPlayDate", term90526);
        setIntField(term90321, term90321.getClass(), "lastPlaceId", -1227252559);
        setField(term90321, term90321.getClass(), "lastPlaceName", "EUWyNZxbWR");
        setField(term90321, term90321.getClass(), "lastRegionId", "TaoriKlxVP");
        setField(term90321, term90321.getClass(), "lastRegionName", "CDKCMwdzTR");
        setField(term90321, term90321.getClass(), "lastAllNetId", "ehviwWrUip");
        setField(term90321, term90321.getClass(), "lastClientId", "LNsNBvvYgQ");
        setField(term90319, term90319.getClass(), "user", term90321);
        setIntField(term90319, term90319.getClass(), "musicId", 1636889912);
        setIntField(term90319, term90319.getClass(), "level", 1695339680);
        setIntField(term90319, term90319.getClass(), "playCount", 79521146);
        setIntField(term90319, term90319.getClass(), "scoreMax", 1295906354);
        setIntField(term90319, term90319.getClass(), "resRequestCount", 980180400);
        setIntField(term90319, term90319.getClass(), "resAcceptCount", -128299328);
        setIntField(term90319, term90319.getClass(), "resSuccessCount", 668320250);
        setIntField(term90319, term90319.getClass(), "missCount", -2078852356);
        setIntField(term90319, term90319.getClass(), "maxComboCount", 381868688);
        setBooleanField(term90319, term90319.getClass(), "isFullCombo", false);
        setBooleanField(term90319, term90319.getClass(), "isAllJustice", false);
        setBooleanField(term90319, term90319.getClass(), "isSuccess", false);
        setIntField(term90319, term90319.getClass(), "fullChain", -1312990054);
        setIntField(term90319, term90319.getClass(), "maxChain", -741512095);
        setIntField(term90319, term90319.getClass(), "scoreRank", 1514556613);
        setBooleanField(term90319, term90319.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term90319, args);
    }

};


