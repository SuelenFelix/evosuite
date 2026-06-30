package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserMap_getMapId_21376559143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574956;

    public UserMap_getMapId_21376559143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term574962 = new Long(6135782592145916721L);
        ArrayList term575023 = new ArrayList();
        Integer term575029 = new Integer(-1606951340);
        Integer term575031 = new Integer(1066146888);
        Integer term575033 = new Integer(409835682);
        Integer term575035 = new Integer(-2088840932);
        ArrayList term575027 = new ArrayList();
        ((ArrayList) term575027).add(term575029);
        ((ArrayList) term575027).add(term575031);
        ((ArrayList) term575027).add(term575033);
        ((ArrayList) term575027).add(term575035);
        term574956 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term574958 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term574960 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term574976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term574977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term574981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term574986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term574987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term574991 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term574956, term574956.getClass(), "id", -5380987367385170338L);
        setLongField(term574958, term574958.getClass(), "id", 8608490952090386646L);
        setLongField(term574960, term574960.getClass(), "id", 3685868862448831108L);
        setField(term574960, term574960.getClass(), "extId", term574962);
        setField(term574960, term574960.getClass(), "luid", "XHKjnsOHDU");
        setIntField(term574977, term574977.getClass(), "year", 2027);
        setShortField(term574977, term574977.getClass(), "month", (short) 5);
        setShortField(term574977, term574977.getClass(), "day", (short) 15);
        setField(term574976, term574976.getClass(), "date", term574977);
        setByteField(term574981, term574981.getClass(), "hour", (byte) 21);
        setByteField(term574981, term574981.getClass(), "minute", (byte) 45);
        setByteField(term574981, term574981.getClass(), "second", (byte) 34);
        setIntField(term574981, term574981.getClass(), "nano", 919304200);
        setField(term574976, term574976.getClass(), "time", term574981);
        setField(term574960, term574960.getClass(), "registerTime", term574976);
        setIntField(term574987, term574987.getClass(), "year", 2027);
        setShortField(term574987, term574987.getClass(), "month", (short) 8);
        setShortField(term574987, term574987.getClass(), "day", (short) 10);
        setField(term574986, term574986.getClass(), "date", term574987);
        setByteField(term574991, term574991.getClass(), "hour", (byte) 11);
        setByteField(term574991, term574991.getClass(), "minute", (byte) 48);
        setByteField(term574991, term574991.getClass(), "second", (byte) 29);
        setIntField(term574991, term574991.getClass(), "nano", 181923569);
        setField(term574986, term574986.getClass(), "time", term574991);
        setField(term574960, term574960.getClass(), "accessTime", term574986);
        setField(term574958, term574958.getClass(), "card", term574960);
        setField(term574958, term574958.getClass(), "userName", "XsCWWlJnzy");
        setIntField(term574958, term574958.getClass(), "isNetMember", 689590179);
        setIntField(term574958, term574958.getClass(), "iconId", -1349696310);
        setIntField(term574958, term574958.getClass(), "plateId", -1354784798);
        setIntField(term574958, term574958.getClass(), "titleId", -19417141);
        setIntField(term574958, term574958.getClass(), "partnerId", 1408313608);
        setIntField(term574958, term574958.getClass(), "frameId", -1177322715);
        setIntField(term574958, term574958.getClass(), "selectMapId", 2023276963);
        setIntField(term574958, term574958.getClass(), "totalAwake", -2037398289);
        setIntField(term574958, term574958.getClass(), "gradeRating", -63201962);
        setIntField(term574958, term574958.getClass(), "musicRating", 1417910796);
        setIntField(term574958, term574958.getClass(), "playerRating", -151878394);
        setIntField(term574958, term574958.getClass(), "highestRating", 1643070463);
        setIntField(term574958, term574958.getClass(), "gradeRank", -1779011445);
        setIntField(term574958, term574958.getClass(), "classRank", -1542718004);
        setIntField(term574958, term574958.getClass(), "courseRank", -650599111);
        setField(term574958, term574958.getClass(), "charaSlot", term575023);
        setField(term574958, term574958.getClass(), "charaLockSlot", term575027);
        setLongField(term574958, term574958.getClass(), "contentBit", 3234925105299683826L);
        setIntField(term574958, term574958.getClass(), "playCount", -1151955579);
        setField(term574958, term574958.getClass(), "eventWatchedDate", "fLuZuKyOzx");
        setField(term574958, term574958.getClass(), "lastGameId", "fLQpAWsZiF");
        setField(term574958, term574958.getClass(), "lastRomVersion", "LJsjMkTgKg");
        setField(term574958, term574958.getClass(), "lastDataVersion", "msHGgOQzuM");
        setField(term574958, term574958.getClass(), "lastLoginDate", "GtFCZuArgb");
        setField(term574958, term574958.getClass(), "lastPlayDate", "TxkcMpyYTj");
        setIntField(term574958, term574958.getClass(), "lastPlayCredit", -633036338);
        setIntField(term574958, term574958.getClass(), "lastPlayMode", -1568416651);
        setIntField(term574958, term574958.getClass(), "lastPlaceId", -1421023370);
        setField(term574958, term574958.getClass(), "lastPlaceName", "kDtcovhSWv");
        setIntField(term574958, term574958.getClass(), "lastAllNetId", -1635715575);
        setIntField(term574958, term574958.getClass(), "lastRegionId", 1045424394);
        setField(term574958, term574958.getClass(), "lastRegionName", "QqzRDqXobl");
        setField(term574958, term574958.getClass(), "lastClientId", "jmxKHrsxQd");
        setField(term574958, term574958.getClass(), "lastCountryCode", "sxmFddCUVS");
        setIntField(term574958, term574958.getClass(), "lastSelectEMoney", -1971079711);
        setIntField(term574958, term574958.getClass(), "lastSelectTicket", -2071829316);
        setIntField(term574958, term574958.getClass(), "lastSelectCourse", 288024501);
        setIntField(term574958, term574958.getClass(), "lastCountCourse", -2009400896);
        setField(term574958, term574958.getClass(), "firstGameId", "fnHRbVNXIq");
        setField(term574958, term574958.getClass(), "firstRomVersion", "tNBlUqjAEw");
        setField(term574958, term574958.getClass(), "firstDataVersion", "qMUyhwextD");
        setField(term574958, term574958.getClass(), "firstPlayDate", "MzLqYpQIXJ");
        setField(term574958, term574958.getClass(), "compatibleCmVersion", "TMtSZFMMdy");
        setField(term574958, term574958.getClass(), "dailyBonusDate", "HNHtuWPCrs");
        setField(term574958, term574958.getClass(), "dailyCourseBonusDate", "tZDbLsvpjY");
        setField(term574958, term574958.getClass(), "lastPairLoginDate", "mcNHxVNOqA");
        setField(term574958, term574958.getClass(), "lastTrialPlayDate", "gdKRtkSSkr");
        setIntField(term574958, term574958.getClass(), "playVsCount", 1573273588);
        setIntField(term574958, term574958.getClass(), "playSyncCount", -1256768831);
        setIntField(term574958, term574958.getClass(), "winCount", -36867525);
        setIntField(term574958, term574958.getClass(), "helpCount", -1569415399);
        setIntField(term574958, term574958.getClass(), "comboCount", -986361052);
        setLongField(term574958, term574958.getClass(), "totalDeluxscore", 7368168955604559339L);
        setLongField(term574958, term574958.getClass(), "totalBasicDeluxscore", -2316089276626135326L);
        setLongField(term574958, term574958.getClass(), "totalAdvancedDeluxscore", 2765880617471516727L);
        setLongField(term574958, term574958.getClass(), "totalExpertDeluxscore", -5380052410568922602L);
        setLongField(term574958, term574958.getClass(), "totalMasterDeluxscore", -5770718985995661111L);
        setLongField(term574958, term574958.getClass(), "totalReMasterDeluxscore", 4102143313594682544L);
        setIntField(term574958, term574958.getClass(), "totalSync", 1239668774);
        setIntField(term574958, term574958.getClass(), "totalBasicSync", 464024822);
        setIntField(term574958, term574958.getClass(), "totalAdvancedSync", -1692924614);
        setIntField(term574958, term574958.getClass(), "totalExpertSync", -1069900997);
        setIntField(term574958, term574958.getClass(), "totalMasterSync", 490100716);
        setIntField(term574958, term574958.getClass(), "totalReMasterSync", 390252367);
        setLongField(term574958, term574958.getClass(), "totalAchievement", -2063324360026329536L);
        setLongField(term574958, term574958.getClass(), "totalBasicAchievement", -1433808972724753489L);
        setLongField(term574958, term574958.getClass(), "totalAdvancedAchievement", 5235361579095366210L);
        setLongField(term574958, term574958.getClass(), "totalExpertAchievement", 6104572403653329744L);
        setLongField(term574958, term574958.getClass(), "totalMasterAchievement", -5041272036517747333L);
        setLongField(term574958, term574958.getClass(), "totalReMasterAchievement", 1723922783030832304L);
        setLongField(term574958, term574958.getClass(), "playerOldRating", 928220190135832549L);
        setLongField(term574958, term574958.getClass(), "playerNewRating", -7288335256430321227L);
        setIntField(term574958, term574958.getClass(), "banState", -84425765);
        setLongField(term574958, term574958.getClass(), "dateTime", 7402907963399539018L);
        setField(term574956, term574956.getClass(), "user", term574958);
        setIntField(term574956, term574956.getClass(), "mapId", -1201401765);
        setIntField(term574956, term574956.getClass(), "distance", 4431910);
        setBooleanField(term574956, term574956.getClass(), "isLock", false);
        setBooleanField(term574956, term574956.getClass(), "isClear", true);
        setBooleanField(term574956, term574956.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapId", argTypes, term574956, args);
    }

};


