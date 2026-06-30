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

public class UserMusicDetail_getScoreMax_17936789657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90763;

    public UserMusicDetail_getScoreMax_17936789657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90769 = new Long(4616440478358528406L);
        term90763 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term90765 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term90767 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term90783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90788 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90798 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90820 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90881 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90975 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term90763, term90763.getClass(), "id", 2856654200900890130L);
        setLongField(term90765, term90765.getClass(), "id", 2362710323589009829L);
        setLongField(term90767, term90767.getClass(), "id", -1353104097704898755L);
        setField(term90767, term90767.getClass(), "extId", term90769);
        setField(term90767, term90767.getClass(), "luid", "VGKsvldNNB");
        setIntField(term90784, term90784.getClass(), "year", 2013);
        setShortField(term90784, term90784.getClass(), "month", (short) 6);
        setShortField(term90784, term90784.getClass(), "day", (short) 1);
        setField(term90783, term90783.getClass(), "date", term90784);
        setByteField(term90788, term90788.getClass(), "hour", (byte) 4);
        setByteField(term90788, term90788.getClass(), "minute", (byte) 10);
        setByteField(term90788, term90788.getClass(), "second", (byte) 53);
        setIntField(term90788, term90788.getClass(), "nano", 464418403);
        setField(term90783, term90783.getClass(), "time", term90788);
        setField(term90767, term90767.getClass(), "registerTime", term90783);
        setIntField(term90794, term90794.getClass(), "year", 2018);
        setShortField(term90794, term90794.getClass(), "month", (short) 10);
        setShortField(term90794, term90794.getClass(), "day", (short) 24);
        setField(term90793, term90793.getClass(), "date", term90794);
        setByteField(term90798, term90798.getClass(), "hour", (byte) 3);
        setByteField(term90798, term90798.getClass(), "minute", (byte) 15);
        setByteField(term90798, term90798.getClass(), "second", (byte) 45);
        setIntField(term90798, term90798.getClass(), "nano", 835508246);
        setField(term90793, term90793.getClass(), "time", term90798);
        setField(term90767, term90767.getClass(), "accessTime", term90793);
        setField(term90765, term90765.getClass(), "card", term90767);
        setField(term90765, term90765.getClass(), "userName", "pfyJIgGkiH");
        setIntField(term90816, term90816.getClass(), "year", 2018);
        setShortField(term90816, term90816.getClass(), "month", (short) 5);
        setShortField(term90816, term90816.getClass(), "day", (short) 10);
        setField(term90815, term90815.getClass(), "date", term90816);
        setByteField(term90820, term90820.getClass(), "hour", (byte) 4);
        setByteField(term90820, term90820.getClass(), "minute", (byte) 24);
        setByteField(term90820, term90820.getClass(), "second", (byte) 13);
        setIntField(term90820, term90820.getClass(), "nano", 683622181);
        setField(term90815, term90815.getClass(), "time", term90820);
        setField(term90765, term90765.getClass(), "lastLoginDate", term90815);
        setBooleanField(term90765, term90765.getClass(), "isWebJoin", true);
        setField(term90765, term90765.getClass(), "webLimitDate", "lvQpEwdZeM");
        setIntField(term90765, term90765.getClass(), "level", 678621067);
        setIntField(term90765, term90765.getClass(), "reincarnationNum", -133223081);
        setField(term90765, term90765.getClass(), "exp", "xtNmObxmHy");
        setLongField(term90765, term90765.getClass(), "point", 1331926449821360443L);
        setLongField(term90765, term90765.getClass(), "totalPoint", 38842281830560892L);
        setIntField(term90765, term90765.getClass(), "playCount", 1890767141);
        setIntField(term90765, term90765.getClass(), "multiPlayCount", -1943101906);
        setIntField(term90765, term90765.getClass(), "multiWinCount", 2055548921);
        setIntField(term90765, term90765.getClass(), "requestResCount", -946368228);
        setIntField(term90765, term90765.getClass(), "acceptResCount", -1303810032);
        setIntField(term90765, term90765.getClass(), "successResCount", -489320904);
        setIntField(term90765, term90765.getClass(), "playerRating", -1264556218);
        setIntField(term90765, term90765.getClass(), "highestRating", 989594530);
        setIntField(term90765, term90765.getClass(), "nameplateId", -1044228796);
        setIntField(term90765, term90765.getClass(), "frameId", -1143503114);
        setIntField(term90765, term90765.getClass(), "characterId", -1645386867);
        setIntField(term90765, term90765.getClass(), "trophyId", -176403451);
        setIntField(term90765, term90765.getClass(), "playedTutorialBit", 546610816);
        setIntField(term90765, term90765.getClass(), "firstTutorialCancelNum", -100412540);
        setIntField(term90765, term90765.getClass(), "masterTutorialCancelNum", 1721386623);
        setIntField(term90765, term90765.getClass(), "totalRepertoireCount", -1262959141);
        setIntField(term90765, term90765.getClass(), "totalMapNum", -1778216800);
        setLongField(term90765, term90765.getClass(), "totalHiScore", 2485168218246856776L);
        setLongField(term90765, term90765.getClass(), "totalBasicHighScore", 7984812876118160348L);
        setLongField(term90765, term90765.getClass(), "totalAdvancedHighScore", -234963564219631183L);
        setLongField(term90765, term90765.getClass(), "totalExpertHighScore", 3148960129338863858L);
        setLongField(term90765, term90765.getClass(), "totalMasterHighScore", 8567007307199068093L);
        setIntField(term90877, term90877.getClass(), "year", 2020);
        setShortField(term90877, term90877.getClass(), "month", (short) 3);
        setShortField(term90877, term90877.getClass(), "day", (short) 27);
        setField(term90876, term90876.getClass(), "date", term90877);
        setByteField(term90881, term90881.getClass(), "hour", (byte) 13);
        setByteField(term90881, term90881.getClass(), "minute", (byte) 32);
        setByteField(term90881, term90881.getClass(), "second", (byte) 57);
        setIntField(term90881, term90881.getClass(), "nano", 463263039);
        setField(term90876, term90876.getClass(), "time", term90881);
        setField(term90765, term90765.getClass(), "eventWatchedDate", term90876);
        setIntField(term90765, term90765.getClass(), "friendCount", 101409079);
        setBooleanField(term90765, term90765.getClass(), "isMaimai", true);
        setField(term90765, term90765.getClass(), "firstGameId", "nComTwhtzu");
        setField(term90765, term90765.getClass(), "firstRomVersion", "gXyUtfRzMt");
        setField(term90765, term90765.getClass(), "firstDataVersion", "RUmloTNkOF");
        setIntField(term90925, term90925.getClass(), "year", 2026);
        setShortField(term90925, term90925.getClass(), "month", (short) 10);
        setShortField(term90925, term90925.getClass(), "day", (short) 27);
        setField(term90924, term90924.getClass(), "date", term90925);
        setByteField(term90929, term90929.getClass(), "hour", (byte) 13);
        setByteField(term90929, term90929.getClass(), "minute", (byte) 28);
        setByteField(term90929, term90929.getClass(), "second", (byte) 2);
        setIntField(term90929, term90929.getClass(), "nano", 546979873);
        setField(term90924, term90924.getClass(), "time", term90929);
        setField(term90765, term90765.getClass(), "firstPlayDate", term90924);
        setField(term90765, term90765.getClass(), "lastGameId", "xlEdrgoOEf");
        setField(term90765, term90765.getClass(), "lastRomVersion", "DfKLAuTNTf");
        setField(term90765, term90765.getClass(), "lastDataVersion", "lWuRJaTZQB");
        setIntField(term90971, term90971.getClass(), "year", 2011);
        setShortField(term90971, term90971.getClass(), "month", (short) 9);
        setShortField(term90971, term90971.getClass(), "day", (short) 22);
        setField(term90970, term90970.getClass(), "date", term90971);
        setByteField(term90975, term90975.getClass(), "hour", (byte) 5);
        setByteField(term90975, term90975.getClass(), "minute", (byte) 47);
        setByteField(term90975, term90975.getClass(), "second", (byte) 44);
        setIntField(term90975, term90975.getClass(), "nano", 154012278);
        setField(term90970, term90970.getClass(), "time", term90975);
        setField(term90765, term90765.getClass(), "lastPlayDate", term90970);
        setIntField(term90765, term90765.getClass(), "lastPlaceId", 667385993);
        setField(term90765, term90765.getClass(), "lastPlaceName", "jiQYzmbdOz");
        setField(term90765, term90765.getClass(), "lastRegionId", "HBnovMFfRR");
        setField(term90765, term90765.getClass(), "lastRegionName", "kvBRGWtVMY");
        setField(term90765, term90765.getClass(), "lastAllNetId", "nnkddhphsi");
        setField(term90765, term90765.getClass(), "lastClientId", "VPJfuXpuzc");
        setField(term90763, term90763.getClass(), "user", term90765);
        setIntField(term90763, term90763.getClass(), "musicId", 1869326215);
        setIntField(term90763, term90763.getClass(), "level", 1721500010);
        setIntField(term90763, term90763.getClass(), "playCount", 347987989);
        setIntField(term90763, term90763.getClass(), "scoreMax", 967236150);
        setIntField(term90763, term90763.getClass(), "resRequestCount", 1128257999);
        setIntField(term90763, term90763.getClass(), "resAcceptCount", -1294526073);
        setIntField(term90763, term90763.getClass(), "resSuccessCount", 1308295);
        setIntField(term90763, term90763.getClass(), "missCount", -1992871983);
        setIntField(term90763, term90763.getClass(), "maxComboCount", -746244948);
        setBooleanField(term90763, term90763.getClass(), "isFullCombo", false);
        setBooleanField(term90763, term90763.getClass(), "isAllJustice", false);
        setBooleanField(term90763, term90763.getClass(), "isSuccess", false);
        setIntField(term90763, term90763.getClass(), "fullChain", -1545293106);
        setIntField(term90763, term90763.getClass(), "maxChain", 150764621);
        setIntField(term90763, term90763.getClass(), "scoreRank", 1888338766);
        setBooleanField(term90763, term90763.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreMax", argTypes, term90763, args);
    }

};


