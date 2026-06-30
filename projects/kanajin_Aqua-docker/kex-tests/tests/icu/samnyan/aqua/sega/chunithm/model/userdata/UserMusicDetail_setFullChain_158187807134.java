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

public class UserMusicDetail_setFullChain_158187807134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103203;
     Object term103497;

    public UserMusicDetail_setFullChain_158187807134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term103209 = new Long(9205327385733285058L);
        term103203 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term103205 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term103207 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term103223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103228 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103233 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103234 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103238 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103260 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103321 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103415 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term103203, term103203.getClass(), "id", 1933345968294866712L);
        setLongField(term103205, term103205.getClass(), "id", 4286595441513061164L);
        setLongField(term103207, term103207.getClass(), "id", -6076443966344923773L);
        setField(term103207, term103207.getClass(), "extId", term103209);
        setField(term103207, term103207.getClass(), "luid", "NtSnrngAmM");
        setIntField(term103224, term103224.getClass(), "year", 2022);
        setShortField(term103224, term103224.getClass(), "month", (short) 12);
        setShortField(term103224, term103224.getClass(), "day", (short) 28);
        setField(term103223, term103223.getClass(), "date", term103224);
        setByteField(term103228, term103228.getClass(), "hour", (byte) 3);
        setByteField(term103228, term103228.getClass(), "minute", (byte) 53);
        setByteField(term103228, term103228.getClass(), "second", (byte) 54);
        setIntField(term103228, term103228.getClass(), "nano", 342790000);
        setField(term103223, term103223.getClass(), "time", term103228);
        setField(term103207, term103207.getClass(), "registerTime", term103223);
        setIntField(term103234, term103234.getClass(), "year", 2018);
        setShortField(term103234, term103234.getClass(), "month", (short) 4);
        setShortField(term103234, term103234.getClass(), "day", (short) 14);
        setField(term103233, term103233.getClass(), "date", term103234);
        setByteField(term103238, term103238.getClass(), "hour", (byte) 10);
        setByteField(term103238, term103238.getClass(), "minute", (byte) 6);
        setByteField(term103238, term103238.getClass(), "second", (byte) 20);
        setIntField(term103238, term103238.getClass(), "nano", 981356633);
        setField(term103233, term103233.getClass(), "time", term103238);
        setField(term103207, term103207.getClass(), "accessTime", term103233);
        setField(term103205, term103205.getClass(), "card", term103207);
        setField(term103205, term103205.getClass(), "userName", "OYnrHBNcZV");
        setIntField(term103256, term103256.getClass(), "year", 2010);
        setShortField(term103256, term103256.getClass(), "month", (short) 7);
        setShortField(term103256, term103256.getClass(), "day", (short) 17);
        setField(term103255, term103255.getClass(), "date", term103256);
        setByteField(term103260, term103260.getClass(), "hour", (byte) 3);
        setByteField(term103260, term103260.getClass(), "minute", (byte) 45);
        setByteField(term103260, term103260.getClass(), "second", (byte) 30);
        setIntField(term103260, term103260.getClass(), "nano", 146814860);
        setField(term103255, term103255.getClass(), "time", term103260);
        setField(term103205, term103205.getClass(), "lastLoginDate", term103255);
        setBooleanField(term103205, term103205.getClass(), "isWebJoin", true);
        setField(term103205, term103205.getClass(), "webLimitDate", "pwkepWBxgL");
        setIntField(term103205, term103205.getClass(), "level", 1964061073);
        setIntField(term103205, term103205.getClass(), "reincarnationNum", -1274174342);
        setField(term103205, term103205.getClass(), "exp", "RDXQLsyKOu");
        setLongField(term103205, term103205.getClass(), "point", 8397128558586549852L);
        setLongField(term103205, term103205.getClass(), "totalPoint", -8545746620266373186L);
        setIntField(term103205, term103205.getClass(), "playCount", 269850713);
        setIntField(term103205, term103205.getClass(), "multiPlayCount", -1487569724);
        setIntField(term103205, term103205.getClass(), "multiWinCount", 288903600);
        setIntField(term103205, term103205.getClass(), "requestResCount", -972943452);
        setIntField(term103205, term103205.getClass(), "acceptResCount", -1263692965);
        setIntField(term103205, term103205.getClass(), "successResCount", 47709908);
        setIntField(term103205, term103205.getClass(), "playerRating", 1429392228);
        setIntField(term103205, term103205.getClass(), "highestRating", 2122239536);
        setIntField(term103205, term103205.getClass(), "nameplateId", 542088374);
        setIntField(term103205, term103205.getClass(), "frameId", -950297218);
        setIntField(term103205, term103205.getClass(), "characterId", 1244123877);
        setIntField(term103205, term103205.getClass(), "trophyId", -1662703727);
        setIntField(term103205, term103205.getClass(), "playedTutorialBit", 1279906508);
        setIntField(term103205, term103205.getClass(), "firstTutorialCancelNum", -238375706);
        setIntField(term103205, term103205.getClass(), "masterTutorialCancelNum", 1556952863);
        setIntField(term103205, term103205.getClass(), "totalRepertoireCount", -198148044);
        setIntField(term103205, term103205.getClass(), "totalMapNum", 1022014258);
        setLongField(term103205, term103205.getClass(), "totalHiScore", 2105501884913088990L);
        setLongField(term103205, term103205.getClass(), "totalBasicHighScore", -8124278437144435231L);
        setLongField(term103205, term103205.getClass(), "totalAdvancedHighScore", 7732659324628481307L);
        setLongField(term103205, term103205.getClass(), "totalExpertHighScore", -3474044978480774340L);
        setLongField(term103205, term103205.getClass(), "totalMasterHighScore", 775312077947534347L);
        setIntField(term103317, term103317.getClass(), "year", 2024);
        setShortField(term103317, term103317.getClass(), "month", (short) 12);
        setShortField(term103317, term103317.getClass(), "day", (short) 5);
        setField(term103316, term103316.getClass(), "date", term103317);
        setByteField(term103321, term103321.getClass(), "hour", (byte) 2);
        setByteField(term103321, term103321.getClass(), "minute", (byte) 50);
        setByteField(term103321, term103321.getClass(), "second", (byte) 28);
        setIntField(term103321, term103321.getClass(), "nano", 545409856);
        setField(term103316, term103316.getClass(), "time", term103321);
        setField(term103205, term103205.getClass(), "eventWatchedDate", term103316);
        setIntField(term103205, term103205.getClass(), "friendCount", -125889150);
        setBooleanField(term103205, term103205.getClass(), "isMaimai", false);
        setField(term103205, term103205.getClass(), "firstGameId", "ZnIRhQxVXw");
        setField(term103205, term103205.getClass(), "firstRomVersion", "AVAyxUcLrK");
        setField(term103205, term103205.getClass(), "firstDataVersion", "xLwgTuAlud");
        setIntField(term103365, term103365.getClass(), "year", 2027);
        setShortField(term103365, term103365.getClass(), "month", (short) 10);
        setShortField(term103365, term103365.getClass(), "day", (short) 28);
        setField(term103364, term103364.getClass(), "date", term103365);
        setByteField(term103369, term103369.getClass(), "hour", (byte) 2);
        setByteField(term103369, term103369.getClass(), "minute", (byte) 55);
        setByteField(term103369, term103369.getClass(), "second", (byte) 11);
        setIntField(term103369, term103369.getClass(), "nano", 659627264);
        setField(term103364, term103364.getClass(), "time", term103369);
        setField(term103205, term103205.getClass(), "firstPlayDate", term103364);
        setField(term103205, term103205.getClass(), "lastGameId", "rwsyozeRfD");
        setField(term103205, term103205.getClass(), "lastRomVersion", "FYBnWmfXch");
        setField(term103205, term103205.getClass(), "lastDataVersion", "ZCKJKntKil");
        setIntField(term103411, term103411.getClass(), "year", 2022);
        setShortField(term103411, term103411.getClass(), "month", (short) 1);
        setShortField(term103411, term103411.getClass(), "day", (short) 20);
        setField(term103410, term103410.getClass(), "date", term103411);
        setByteField(term103415, term103415.getClass(), "hour", (byte) 0);
        setByteField(term103415, term103415.getClass(), "minute", (byte) 5);
        setByteField(term103415, term103415.getClass(), "second", (byte) 34);
        setIntField(term103415, term103415.getClass(), "nano", 917908477);
        setField(term103410, term103410.getClass(), "time", term103415);
        setField(term103205, term103205.getClass(), "lastPlayDate", term103410);
        setIntField(term103205, term103205.getClass(), "lastPlaceId", 1022350206);
        setField(term103205, term103205.getClass(), "lastPlaceName", "fyrqWlhCEt");
        setField(term103205, term103205.getClass(), "lastRegionId", "tFABhePKqp");
        setField(term103205, term103205.getClass(), "lastRegionName", "FtjQbVqqqx");
        setField(term103205, term103205.getClass(), "lastAllNetId", "FMhmrgLOkN");
        setField(term103205, term103205.getClass(), "lastClientId", "UqPFsSwrTW");
        setField(term103203, term103203.getClass(), "user", term103205);
        setIntField(term103203, term103203.getClass(), "musicId", -171751232);
        setIntField(term103203, term103203.getClass(), "level", -999681370);
        setIntField(term103203, term103203.getClass(), "playCount", 1143545597);
        setIntField(term103203, term103203.getClass(), "scoreMax", 1949354764);
        setIntField(term103203, term103203.getClass(), "resRequestCount", -1317200481);
        setIntField(term103203, term103203.getClass(), "resAcceptCount", -229302209);
        setIntField(term103203, term103203.getClass(), "resSuccessCount", -1214413475);
        setIntField(term103203, term103203.getClass(), "missCount", 351461566);
        setIntField(term103203, term103203.getClass(), "maxComboCount", -745219395);
        setBooleanField(term103203, term103203.getClass(), "isFullCombo", false);
        setBooleanField(term103203, term103203.getClass(), "isAllJustice", true);
        setBooleanField(term103203, term103203.getClass(), "isSuccess", false);
        setIntField(term103203, term103203.getClass(), "fullChain", 1205528550);
        setIntField(term103203, term103203.getClass(), "maxChain", -1936901017);
        setIntField(term103203, term103203.getClass(), "scoreRank", -1504411382);
        setBooleanField(term103203, term103203.getClass(), "isLock", false);
        term103497 = new Integer(-283531377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term103497;
        callMethod(klass, "setFullChain", argTypes, term103203, args);
    }

};


