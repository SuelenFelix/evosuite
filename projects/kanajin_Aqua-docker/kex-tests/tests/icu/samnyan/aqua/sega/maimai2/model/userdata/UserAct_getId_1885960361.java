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

public class UserAct_getId_1885960361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568;

    public UserAct_getId_1885960361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term574 = new Long(6375119433582206027L);
        Integer term637 = new Integer(-1339778481);
        Integer term639 = new Integer(1725571209);
        Integer term641 = new Integer(-522618178);
        ArrayList term635 = new ArrayList();
        ((ArrayList) term635).add(term637);
        ((ArrayList) term635).add(term639);
        ((ArrayList) term635).add(term641);
        Integer term647 = new Integer(1134449235);
        Integer term649 = new Integer(-883034806);
        Integer term651 = new Integer(1585847225);
        Integer term653 = new Integer(597278769);
        ArrayList term645 = new ArrayList();
        ((ArrayList) term645).add(term647);
        ((ArrayList) term645).add(term649);
        ((ArrayList) term645).add(term651);
        ((ArrayList) term645).add(term653);
        term568 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term570 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term572 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term588 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term589 = newInstance(Class.forName("java.time.LocalDate"));
        Object term593 = newInstance(Class.forName("java.time.LocalTime"));
        Object term598 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term599 = newInstance(Class.forName("java.time.LocalDate"));
        Object term603 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term568, term568.getClass(), "id", -6573104506744284592L);
        setLongField(term570, term570.getClass(), "id", -4920224193275732920L);
        setLongField(term572, term572.getClass(), "id", 8428634514691209827L);
        setField(term572, term572.getClass(), "extId", term574);
        setField(term572, term572.getClass(), "luid", "RkybSrpybU");
        setIntField(term589, term589.getClass(), "year", 2015);
        setShortField(term589, term589.getClass(), "month", (short) 9);
        setShortField(term589, term589.getClass(), "day", (short) 19);
        setField(term588, term588.getClass(), "date", term589);
        setByteField(term593, term593.getClass(), "hour", (byte) 9);
        setByteField(term593, term593.getClass(), "minute", (byte) 4);
        setByteField(term593, term593.getClass(), "second", (byte) 10);
        setIntField(term593, term593.getClass(), "nano", 401765865);
        setField(term588, term588.getClass(), "time", term593);
        setField(term572, term572.getClass(), "registerTime", term588);
        setIntField(term599, term599.getClass(), "year", 2015);
        setShortField(term599, term599.getClass(), "month", (short) 4);
        setShortField(term599, term599.getClass(), "day", (short) 14);
        setField(term598, term598.getClass(), "date", term599);
        setByteField(term603, term603.getClass(), "hour", (byte) 18);
        setByteField(term603, term603.getClass(), "minute", (byte) 24);
        setByteField(term603, term603.getClass(), "second", (byte) 32);
        setIntField(term603, term603.getClass(), "nano", 369233818);
        setField(term598, term598.getClass(), "time", term603);
        setField(term572, term572.getClass(), "accessTime", term598);
        setField(term570, term570.getClass(), "card", term572);
        setField(term570, term570.getClass(), "userName", "xOEqzGAmDU");
        setIntField(term570, term570.getClass(), "isNetMember", -469968304);
        setIntField(term570, term570.getClass(), "iconId", -1145578966);
        setIntField(term570, term570.getClass(), "plateId", 679763016);
        setIntField(term570, term570.getClass(), "titleId", 1962444399);
        setIntField(term570, term570.getClass(), "partnerId", 767834723);
        setIntField(term570, term570.getClass(), "frameId", -602026508);
        setIntField(term570, term570.getClass(), "selectMapId", -157887805);
        setIntField(term570, term570.getClass(), "totalAwake", 1876565163);
        setIntField(term570, term570.getClass(), "gradeRating", -817164822);
        setIntField(term570, term570.getClass(), "musicRating", -1016503459);
        setIntField(term570, term570.getClass(), "playerRating", -1968847291);
        setIntField(term570, term570.getClass(), "highestRating", 579005622);
        setIntField(term570, term570.getClass(), "gradeRank", -14890619);
        setIntField(term570, term570.getClass(), "classRank", 1632125673);
        setIntField(term570, term570.getClass(), "courseRank", 454281060);
        setField(term570, term570.getClass(), "charaSlot", term635);
        setField(term570, term570.getClass(), "charaLockSlot", term645);
        setLongField(term570, term570.getClass(), "contentBit", -2585684163342970173L);
        setIntField(term570, term570.getClass(), "playCount", -1786399638);
        setField(term570, term570.getClass(), "eventWatchedDate", "eZFUvlxvGV");
        setField(term570, term570.getClass(), "lastGameId", "BYqFIqCKAV");
        setField(term570, term570.getClass(), "lastRomVersion", "vrQLuWIDJX");
        setField(term570, term570.getClass(), "lastDataVersion", "flxyYxBRtu");
        setField(term570, term570.getClass(), "lastLoginDate", "OclPbYPkcH");
        setField(term570, term570.getClass(), "lastPlayDate", "IoAlmYsBwc");
        setIntField(term570, term570.getClass(), "lastPlayCredit", 2055867847);
        setIntField(term570, term570.getClass(), "lastPlayMode", -1048298087);
        setIntField(term570, term570.getClass(), "lastPlaceId", 292681826);
        setField(term570, term570.getClass(), "lastPlaceName", "TEParAifyi");
        setIntField(term570, term570.getClass(), "lastAllNetId", 458147407);
        setIntField(term570, term570.getClass(), "lastRegionId", -184153539);
        setField(term570, term570.getClass(), "lastRegionName", "OWDIEULEFu");
        setField(term570, term570.getClass(), "lastClientId", "dWRymuLBtr");
        setField(term570, term570.getClass(), "lastCountryCode", "AijpHYOFuy");
        setIntField(term570, term570.getClass(), "lastSelectEMoney", 493620644);
        setIntField(term570, term570.getClass(), "lastSelectTicket", 1328271830);
        setIntField(term570, term570.getClass(), "lastSelectCourse", 1596070772);
        setIntField(term570, term570.getClass(), "lastCountCourse", 97029295);
        setField(term570, term570.getClass(), "firstGameId", "SbAoxhfrkn");
        setField(term570, term570.getClass(), "firstRomVersion", "kuTXqwMtDB");
        setField(term570, term570.getClass(), "firstDataVersion", "Ghbwtircqb");
        setField(term570, term570.getClass(), "firstPlayDate", "xrwlQZdwCp");
        setField(term570, term570.getClass(), "compatibleCmVersion", "IDCWpPLRkE");
        setField(term570, term570.getClass(), "dailyBonusDate", "nyiiPDVjAc");
        setField(term570, term570.getClass(), "dailyCourseBonusDate", "aKnKipADSo");
        setField(term570, term570.getClass(), "lastPairLoginDate", "wSQxaModmm");
        setField(term570, term570.getClass(), "lastTrialPlayDate", "UlajhuVLaP");
        setIntField(term570, term570.getClass(), "playVsCount", -1371869594);
        setIntField(term570, term570.getClass(), "playSyncCount", -2095575670);
        setIntField(term570, term570.getClass(), "winCount", 1225272962);
        setIntField(term570, term570.getClass(), "helpCount", 1324040357);
        setIntField(term570, term570.getClass(), "comboCount", -1588772968);
        setLongField(term570, term570.getClass(), "totalDeluxscore", 8059786003080744426L);
        setLongField(term570, term570.getClass(), "totalBasicDeluxscore", -4365849114644724155L);
        setLongField(term570, term570.getClass(), "totalAdvancedDeluxscore", 2486810210675247493L);
        setLongField(term570, term570.getClass(), "totalExpertDeluxscore", 7009926388951271268L);
        setLongField(term570, term570.getClass(), "totalMasterDeluxscore", -7672528020740371001L);
        setLongField(term570, term570.getClass(), "totalReMasterDeluxscore", -4502405999831680926L);
        setIntField(term570, term570.getClass(), "totalSync", -93135961);
        setIntField(term570, term570.getClass(), "totalBasicSync", -112921587);
        setIntField(term570, term570.getClass(), "totalAdvancedSync", 933028652);
        setIntField(term570, term570.getClass(), "totalExpertSync", 287287233);
        setIntField(term570, term570.getClass(), "totalMasterSync", 962840079);
        setIntField(term570, term570.getClass(), "totalReMasterSync", 1540719661);
        setLongField(term570, term570.getClass(), "totalAchievement", 1967728129628047933L);
        setLongField(term570, term570.getClass(), "totalBasicAchievement", 2120084523938730454L);
        setLongField(term570, term570.getClass(), "totalAdvancedAchievement", 6855071767938501807L);
        setLongField(term570, term570.getClass(), "totalExpertAchievement", -5892135042702373494L);
        setLongField(term570, term570.getClass(), "totalMasterAchievement", 5262507301787091109L);
        setLongField(term570, term570.getClass(), "totalReMasterAchievement", -6823727938421990489L);
        setLongField(term570, term570.getClass(), "playerOldRating", -484994522244390100L);
        setLongField(term570, term570.getClass(), "playerNewRating", 1233889271256172047L);
        setIntField(term570, term570.getClass(), "banState", 1265463001);
        setLongField(term570, term570.getClass(), "dateTime", 6617340557564669657L);
        setField(term568, term568.getClass(), "user", term570);
        setIntField(term568, term568.getClass(), "kind", 335112684);
        setIntField(term568, term568.getClass(), "activityId", 1551099402);
        setLongField(term568, term568.getClass(), "sortNumber", 1439298019805881866L);
        setIntField(term568, term568.getClass(), "param1", -2027534003);
        setIntField(term568, term568.getClass(), "param2", 1063420942);
        setIntField(term568, term568.getClass(), "param3", 1375330971);
        setIntField(term568, term568.getClass(), "param4", -478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term568, args);
    }

};


