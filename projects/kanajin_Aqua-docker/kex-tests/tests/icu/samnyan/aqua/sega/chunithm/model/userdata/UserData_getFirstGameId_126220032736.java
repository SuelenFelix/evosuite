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

public class UserData_getFirstGameId_126220032736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144717;

    public UserData_getFirstGameId_126220032736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term144721 = new Long(-8469818909085103606L);
        term144717 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term144719 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term144735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144740 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144750 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144772 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144833 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144881 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144927 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term144717, term144717.getClass(), "id", 520896091063818935L);
        setLongField(term144719, term144719.getClass(), "id", -7763535196525474654L);
        setField(term144719, term144719.getClass(), "extId", term144721);
        setField(term144719, term144719.getClass(), "luid", "YPFFWDNfXT");
        setIntField(term144736, term144736.getClass(), "year", 2029);
        setShortField(term144736, term144736.getClass(), "month", (short) 1);
        setShortField(term144736, term144736.getClass(), "day", (short) 24);
        setField(term144735, term144735.getClass(), "date", term144736);
        setByteField(term144740, term144740.getClass(), "hour", (byte) 4);
        setByteField(term144740, term144740.getClass(), "minute", (byte) 51);
        setByteField(term144740, term144740.getClass(), "second", (byte) 52);
        setIntField(term144740, term144740.getClass(), "nano", 51139303);
        setField(term144735, term144735.getClass(), "time", term144740);
        setField(term144719, term144719.getClass(), "registerTime", term144735);
        setIntField(term144746, term144746.getClass(), "year", 2016);
        setShortField(term144746, term144746.getClass(), "month", (short) 10);
        setShortField(term144746, term144746.getClass(), "day", (short) 17);
        setField(term144745, term144745.getClass(), "date", term144746);
        setByteField(term144750, term144750.getClass(), "hour", (byte) 10);
        setByteField(term144750, term144750.getClass(), "minute", (byte) 42);
        setByteField(term144750, term144750.getClass(), "second", (byte) 47);
        setIntField(term144750, term144750.getClass(), "nano", 408676743);
        setField(term144745, term144745.getClass(), "time", term144750);
        setField(term144719, term144719.getClass(), "accessTime", term144745);
        setField(term144717, term144717.getClass(), "card", term144719);
        setField(term144717, term144717.getClass(), "userName", "QrnjkRvNan");
        setIntField(term144768, term144768.getClass(), "year", 2018);
        setShortField(term144768, term144768.getClass(), "month", (short) 3);
        setShortField(term144768, term144768.getClass(), "day", (short) 4);
        setField(term144767, term144767.getClass(), "date", term144768);
        setByteField(term144772, term144772.getClass(), "hour", (byte) 15);
        setByteField(term144772, term144772.getClass(), "minute", (byte) 54);
        setByteField(term144772, term144772.getClass(), "second", (byte) 37);
        setIntField(term144772, term144772.getClass(), "nano", 384831927);
        setField(term144767, term144767.getClass(), "time", term144772);
        setField(term144717, term144717.getClass(), "lastLoginDate", term144767);
        setBooleanField(term144717, term144717.getClass(), "isWebJoin", false);
        setField(term144717, term144717.getClass(), "webLimitDate", "TZfRFyUTAy");
        setIntField(term144717, term144717.getClass(), "level", -343779783);
        setIntField(term144717, term144717.getClass(), "reincarnationNum", 1396187222);
        setField(term144717, term144717.getClass(), "exp", "fDBSbnZQEb");
        setLongField(term144717, term144717.getClass(), "point", -304098044779776461L);
        setLongField(term144717, term144717.getClass(), "totalPoint", 5045856503514343478L);
        setIntField(term144717, term144717.getClass(), "playCount", 1061941712);
        setIntField(term144717, term144717.getClass(), "multiPlayCount", 2121750597);
        setIntField(term144717, term144717.getClass(), "multiWinCount", 972099051);
        setIntField(term144717, term144717.getClass(), "requestResCount", -834814848);
        setIntField(term144717, term144717.getClass(), "acceptResCount", -18540131);
        setIntField(term144717, term144717.getClass(), "successResCount", 2028220249);
        setIntField(term144717, term144717.getClass(), "playerRating", 1647906129);
        setIntField(term144717, term144717.getClass(), "highestRating", 711901095);
        setIntField(term144717, term144717.getClass(), "nameplateId", -1601686432);
        setIntField(term144717, term144717.getClass(), "frameId", 1005405366);
        setIntField(term144717, term144717.getClass(), "characterId", 1682083643);
        setIntField(term144717, term144717.getClass(), "trophyId", -913374434);
        setIntField(term144717, term144717.getClass(), "playedTutorialBit", -852430845);
        setIntField(term144717, term144717.getClass(), "firstTutorialCancelNum", 64842894);
        setIntField(term144717, term144717.getClass(), "masterTutorialCancelNum", -1932624760);
        setIntField(term144717, term144717.getClass(), "totalRepertoireCount", 527367438);
        setIntField(term144717, term144717.getClass(), "totalMapNum", -1862333439);
        setLongField(term144717, term144717.getClass(), "totalHiScore", -1793258933453544024L);
        setLongField(term144717, term144717.getClass(), "totalBasicHighScore", -3474751564535185716L);
        setLongField(term144717, term144717.getClass(), "totalAdvancedHighScore", 3013432206371270776L);
        setLongField(term144717, term144717.getClass(), "totalExpertHighScore", -6757564870085101374L);
        setLongField(term144717, term144717.getClass(), "totalMasterHighScore", -3649984910149412233L);
        setIntField(term144829, term144829.getClass(), "year", 2011);
        setShortField(term144829, term144829.getClass(), "month", (short) 1);
        setShortField(term144829, term144829.getClass(), "day", (short) 14);
        setField(term144828, term144828.getClass(), "date", term144829);
        setByteField(term144833, term144833.getClass(), "hour", (byte) 15);
        setByteField(term144833, term144833.getClass(), "minute", (byte) 14);
        setByteField(term144833, term144833.getClass(), "second", (byte) 12);
        setIntField(term144833, term144833.getClass(), "nano", 793590419);
        setField(term144828, term144828.getClass(), "time", term144833);
        setField(term144717, term144717.getClass(), "eventWatchedDate", term144828);
        setIntField(term144717, term144717.getClass(), "friendCount", -798735804);
        setBooleanField(term144717, term144717.getClass(), "isMaimai", true);
        setField(term144717, term144717.getClass(), "firstGameId", "eWwifIiXBf");
        setField(term144717, term144717.getClass(), "firstRomVersion", "WeglJEjdLT");
        setField(term144717, term144717.getClass(), "firstDataVersion", "BCHkdVYkdA");
        setIntField(term144877, term144877.getClass(), "year", 2025);
        setShortField(term144877, term144877.getClass(), "month", (short) 8);
        setShortField(term144877, term144877.getClass(), "day", (short) 20);
        setField(term144876, term144876.getClass(), "date", term144877);
        setByteField(term144881, term144881.getClass(), "hour", (byte) 2);
        setByteField(term144881, term144881.getClass(), "minute", (byte) 1);
        setByteField(term144881, term144881.getClass(), "second", (byte) 10);
        setIntField(term144881, term144881.getClass(), "nano", 825549322);
        setField(term144876, term144876.getClass(), "time", term144881);
        setField(term144717, term144717.getClass(), "firstPlayDate", term144876);
        setField(term144717, term144717.getClass(), "lastGameId", "jKLqoDVqyY");
        setField(term144717, term144717.getClass(), "lastRomVersion", "nXxhbinfxu");
        setField(term144717, term144717.getClass(), "lastDataVersion", "YUJWXjGqoj");
        setIntField(term144923, term144923.getClass(), "year", 2017);
        setShortField(term144923, term144923.getClass(), "month", (short) 11);
        setShortField(term144923, term144923.getClass(), "day", (short) 15);
        setField(term144922, term144922.getClass(), "date", term144923);
        setByteField(term144927, term144927.getClass(), "hour", (byte) 2);
        setByteField(term144927, term144927.getClass(), "minute", (byte) 58);
        setByteField(term144927, term144927.getClass(), "second", (byte) 29);
        setIntField(term144927, term144927.getClass(), "nano", 650951577);
        setField(term144922, term144922.getClass(), "time", term144927);
        setField(term144717, term144717.getClass(), "lastPlayDate", term144922);
        setIntField(term144717, term144717.getClass(), "lastPlaceId", 1532015613);
        setField(term144717, term144717.getClass(), "lastPlaceName", "FYbsLyvQEc");
        setField(term144717, term144717.getClass(), "lastRegionId", "DZVnOFFNzA");
        setField(term144717, term144717.getClass(), "lastRegionName", "UhHOlEncqe");
        setField(term144717, term144717.getClass(), "lastAllNetId", "BombodvByI");
        setField(term144717, term144717.getClass(), "lastClientId", "xWXSMsmgup");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term144717, args);
    }

};


