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

public class UserDetail_setGradeRank_212757888193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247717;
     Object term248066;

    public UserDetail_setGradeRank_212757888193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term247721 = new Long(-7370364068296402536L);
        ArrayList term247782 = new ArrayList();
        Integer term247788 = new Integer(-1864680068);
        Integer term247790 = new Integer(1979269463);
        Integer term247792 = new Integer(-1690818607);
        Integer term247794 = new Integer(252440319);
        Integer term247796 = new Integer(-1798089143);
        ArrayList term247786 = new ArrayList();
        ((ArrayList) term247786).add(term247788);
        ((ArrayList) term247786).add(term247790);
        ((ArrayList) term247786).add(term247792);
        ((ArrayList) term247786).add(term247794);
        ((ArrayList) term247786).add(term247796);
        term247717 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term247719 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term247735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247740 = newInstance(Class.forName("java.time.LocalTime"));
        Object term247745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247750 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term247717, term247717.getClass(), "id", -972759122150297482L);
        setLongField(term247719, term247719.getClass(), "id", 5610173559139695003L);
        setField(term247719, term247719.getClass(), "extId", term247721);
        setField(term247719, term247719.getClass(), "luid", "iskHdVFxha");
        setIntField(term247736, term247736.getClass(), "year", 2023);
        setShortField(term247736, term247736.getClass(), "month", (short) 5);
        setShortField(term247736, term247736.getClass(), "day", (short) 31);
        setField(term247735, term247735.getClass(), "date", term247736);
        setByteField(term247740, term247740.getClass(), "hour", (byte) 3);
        setByteField(term247740, term247740.getClass(), "minute", (byte) 15);
        setByteField(term247740, term247740.getClass(), "second", (byte) 34);
        setIntField(term247740, term247740.getClass(), "nano", 794699238);
        setField(term247735, term247735.getClass(), "time", term247740);
        setField(term247719, term247719.getClass(), "registerTime", term247735);
        setIntField(term247746, term247746.getClass(), "year", 2013);
        setShortField(term247746, term247746.getClass(), "month", (short) 10);
        setShortField(term247746, term247746.getClass(), "day", (short) 1);
        setField(term247745, term247745.getClass(), "date", term247746);
        setByteField(term247750, term247750.getClass(), "hour", (byte) 21);
        setByteField(term247750, term247750.getClass(), "minute", (byte) 9);
        setByteField(term247750, term247750.getClass(), "second", (byte) 5);
        setIntField(term247750, term247750.getClass(), "nano", 986326309);
        setField(term247745, term247745.getClass(), "time", term247750);
        setField(term247719, term247719.getClass(), "accessTime", term247745);
        setField(term247717, term247717.getClass(), "card", term247719);
        setField(term247717, term247717.getClass(), "userName", "eWaksCBVal");
        setIntField(term247717, term247717.getClass(), "isNetMember", 108340245);
        setIntField(term247717, term247717.getClass(), "iconId", 1179037950);
        setIntField(term247717, term247717.getClass(), "plateId", 550780613);
        setIntField(term247717, term247717.getClass(), "titleId", 1561385285);
        setIntField(term247717, term247717.getClass(), "partnerId", -260885634);
        setIntField(term247717, term247717.getClass(), "frameId", -1347242303);
        setIntField(term247717, term247717.getClass(), "selectMapId", -2036347698);
        setIntField(term247717, term247717.getClass(), "totalAwake", -1619455357);
        setIntField(term247717, term247717.getClass(), "gradeRating", -1767994514);
        setIntField(term247717, term247717.getClass(), "musicRating", 424496847);
        setIntField(term247717, term247717.getClass(), "playerRating", 286520609);
        setIntField(term247717, term247717.getClass(), "highestRating", -406651008);
        setIntField(term247717, term247717.getClass(), "gradeRank", -1788449741);
        setIntField(term247717, term247717.getClass(), "classRank", -192182169);
        setIntField(term247717, term247717.getClass(), "courseRank", 1858514511);
        setField(term247717, term247717.getClass(), "charaSlot", term247782);
        setField(term247717, term247717.getClass(), "charaLockSlot", term247786);
        setLongField(term247717, term247717.getClass(), "contentBit", 2406637246055452179L);
        setIntField(term247717, term247717.getClass(), "playCount", 920502057);
        setField(term247717, term247717.getClass(), "eventWatchedDate", "EoJdXAfClg");
        setField(term247717, term247717.getClass(), "lastGameId", "WazOABAwle");
        setField(term247717, term247717.getClass(), "lastRomVersion", "OQYRpobHXe");
        setField(term247717, term247717.getClass(), "lastDataVersion", "jcUOVEvSEy");
        setField(term247717, term247717.getClass(), "lastLoginDate", "RvzDiamKiS");
        setField(term247717, term247717.getClass(), "lastPlayDate", "hFfCZPaDUh");
        setIntField(term247717, term247717.getClass(), "lastPlayCredit", 226237834);
        setIntField(term247717, term247717.getClass(), "lastPlayMode", 1291181404);
        setIntField(term247717, term247717.getClass(), "lastPlaceId", 121976016);
        setField(term247717, term247717.getClass(), "lastPlaceName", "sroouWPwJV");
        setIntField(term247717, term247717.getClass(), "lastAllNetId", -745467659);
        setIntField(term247717, term247717.getClass(), "lastRegionId", -1055944419);
        setField(term247717, term247717.getClass(), "lastRegionName", "WDAdIiHeDJ");
        setField(term247717, term247717.getClass(), "lastClientId", "eQGvbQZIRc");
        setField(term247717, term247717.getClass(), "lastCountryCode", "zWuKRjEfdp");
        setIntField(term247717, term247717.getClass(), "lastSelectEMoney", -22283188);
        setIntField(term247717, term247717.getClass(), "lastSelectTicket", 416013091);
        setIntField(term247717, term247717.getClass(), "lastSelectCourse", 804342841);
        setIntField(term247717, term247717.getClass(), "lastCountCourse", -808113844);
        setField(term247717, term247717.getClass(), "firstGameId", "zPSdflqnmk");
        setField(term247717, term247717.getClass(), "firstRomVersion", "uOyOpAymZk");
        setField(term247717, term247717.getClass(), "firstDataVersion", "xtPjvtnPnN");
        setField(term247717, term247717.getClass(), "firstPlayDate", "lbTGbReUrp");
        setField(term247717, term247717.getClass(), "compatibleCmVersion", "oaPePvATgc");
        setField(term247717, term247717.getClass(), "dailyBonusDate", "JIjGGcVKJH");
        setField(term247717, term247717.getClass(), "dailyCourseBonusDate", "iasdYjtSEx");
        setField(term247717, term247717.getClass(), "lastPairLoginDate", "QFfeXcsDUe");
        setField(term247717, term247717.getClass(), "lastTrialPlayDate", "RuTPzciBfn");
        setIntField(term247717, term247717.getClass(), "playVsCount", 706642456);
        setIntField(term247717, term247717.getClass(), "playSyncCount", 1776826425);
        setIntField(term247717, term247717.getClass(), "winCount", -1119160134);
        setIntField(term247717, term247717.getClass(), "helpCount", -1646614481);
        setIntField(term247717, term247717.getClass(), "comboCount", -1691986289);
        setLongField(term247717, term247717.getClass(), "totalDeluxscore", -6553474771576136211L);
        setLongField(term247717, term247717.getClass(), "totalBasicDeluxscore", -1623841727990454933L);
        setLongField(term247717, term247717.getClass(), "totalAdvancedDeluxscore", -5700041176720960136L);
        setLongField(term247717, term247717.getClass(), "totalExpertDeluxscore", -6410504668000162352L);
        setLongField(term247717, term247717.getClass(), "totalMasterDeluxscore", 8093161021380956016L);
        setLongField(term247717, term247717.getClass(), "totalReMasterDeluxscore", 7462322552351560259L);
        setIntField(term247717, term247717.getClass(), "totalSync", -1180346349);
        setIntField(term247717, term247717.getClass(), "totalBasicSync", 1909906563);
        setIntField(term247717, term247717.getClass(), "totalAdvancedSync", 487426779);
        setIntField(term247717, term247717.getClass(), "totalExpertSync", -404184980);
        setIntField(term247717, term247717.getClass(), "totalMasterSync", 817353385);
        setIntField(term247717, term247717.getClass(), "totalReMasterSync", 1732285177);
        setLongField(term247717, term247717.getClass(), "totalAchievement", 8089340307747530544L);
        setLongField(term247717, term247717.getClass(), "totalBasicAchievement", -4327537392312363022L);
        setLongField(term247717, term247717.getClass(), "totalAdvancedAchievement", 3894769061851355230L);
        setLongField(term247717, term247717.getClass(), "totalExpertAchievement", -4809767258377279230L);
        setLongField(term247717, term247717.getClass(), "totalMasterAchievement", 1537519037363441996L);
        setLongField(term247717, term247717.getClass(), "totalReMasterAchievement", -1440615708368533617L);
        setLongField(term247717, term247717.getClass(), "playerOldRating", 6312628791030957985L);
        setLongField(term247717, term247717.getClass(), "playerNewRating", 6790158294543936752L);
        setIntField(term247717, term247717.getClass(), "banState", -692759323);
        setLongField(term247717, term247717.getClass(), "dateTime", 8109349690778268472L);
        term248066 = new Integer(1869710466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term248066;
        callMethod(klass, "setGradeRank", argTypes, term247717, args);
    }

};


