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

public class UserDetail_setGradeRank_212757888192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247662;
     Object term248011;

    public UserDetail_setGradeRank_212757888192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term247666 = new Long(-7370364068296402536L);
        ArrayList term247727 = new ArrayList();
        Integer term247733 = new Integer(-1864680068);
        Integer term247735 = new Integer(1979269463);
        Integer term247737 = new Integer(-1690818607);
        Integer term247739 = new Integer(252440319);
        Integer term247741 = new Integer(-1798089143);
        ArrayList term247731 = new ArrayList();
        ((ArrayList) term247731).add(term247733);
        ((ArrayList) term247731).add(term247735);
        ((ArrayList) term247731).add(term247737);
        ((ArrayList) term247731).add(term247739);
        ((ArrayList) term247731).add(term247741);
        term247662 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term247664 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term247680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247685 = newInstance(Class.forName("java.time.LocalTime"));
        Object term247690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247695 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term247662, term247662.getClass(), "id", -972759122150297482L);
        setLongField(term247664, term247664.getClass(), "id", 5610173559139695003L);
        setField(term247664, term247664.getClass(), "extId", term247666);
        setField(term247664, term247664.getClass(), "luid", "iskHdVFxha");
        setIntField(term247681, term247681.getClass(), "year", 2023);
        setShortField(term247681, term247681.getClass(), "month", (short) 5);
        setShortField(term247681, term247681.getClass(), "day", (short) 31);
        setField(term247680, term247680.getClass(), "date", term247681);
        setByteField(term247685, term247685.getClass(), "hour", (byte) 3);
        setByteField(term247685, term247685.getClass(), "minute", (byte) 15);
        setByteField(term247685, term247685.getClass(), "second", (byte) 34);
        setIntField(term247685, term247685.getClass(), "nano", 794699238);
        setField(term247680, term247680.getClass(), "time", term247685);
        setField(term247664, term247664.getClass(), "registerTime", term247680);
        setIntField(term247691, term247691.getClass(), "year", 2013);
        setShortField(term247691, term247691.getClass(), "month", (short) 10);
        setShortField(term247691, term247691.getClass(), "day", (short) 1);
        setField(term247690, term247690.getClass(), "date", term247691);
        setByteField(term247695, term247695.getClass(), "hour", (byte) 21);
        setByteField(term247695, term247695.getClass(), "minute", (byte) 9);
        setByteField(term247695, term247695.getClass(), "second", (byte) 5);
        setIntField(term247695, term247695.getClass(), "nano", 986326309);
        setField(term247690, term247690.getClass(), "time", term247695);
        setField(term247664, term247664.getClass(), "accessTime", term247690);
        setField(term247662, term247662.getClass(), "card", term247664);
        setField(term247662, term247662.getClass(), "userName", "eWaksCBVal");
        setIntField(term247662, term247662.getClass(), "isNetMember", 108340245);
        setIntField(term247662, term247662.getClass(), "iconId", 1179037950);
        setIntField(term247662, term247662.getClass(), "plateId", 550780613);
        setIntField(term247662, term247662.getClass(), "titleId", 1561385285);
        setIntField(term247662, term247662.getClass(), "partnerId", -260885634);
        setIntField(term247662, term247662.getClass(), "frameId", -1347242303);
        setIntField(term247662, term247662.getClass(), "selectMapId", -2036347698);
        setIntField(term247662, term247662.getClass(), "totalAwake", -1619455357);
        setIntField(term247662, term247662.getClass(), "gradeRating", -1767994514);
        setIntField(term247662, term247662.getClass(), "musicRating", 424496847);
        setIntField(term247662, term247662.getClass(), "playerRating", 286520609);
        setIntField(term247662, term247662.getClass(), "highestRating", -406651008);
        setIntField(term247662, term247662.getClass(), "gradeRank", -1788449741);
        setIntField(term247662, term247662.getClass(), "classRank", -192182169);
        setIntField(term247662, term247662.getClass(), "courseRank", 1858514511);
        setField(term247662, term247662.getClass(), "charaSlot", term247727);
        setField(term247662, term247662.getClass(), "charaLockSlot", term247731);
        setLongField(term247662, term247662.getClass(), "contentBit", 2406637246055452179L);
        setIntField(term247662, term247662.getClass(), "playCount", 920502057);
        setField(term247662, term247662.getClass(), "eventWatchedDate", "EoJdXAfClg");
        setField(term247662, term247662.getClass(), "lastGameId", "WazOABAwle");
        setField(term247662, term247662.getClass(), "lastRomVersion", "OQYRpobHXe");
        setField(term247662, term247662.getClass(), "lastDataVersion", "jcUOVEvSEy");
        setField(term247662, term247662.getClass(), "lastLoginDate", "RvzDiamKiS");
        setField(term247662, term247662.getClass(), "lastPlayDate", "hFfCZPaDUh");
        setIntField(term247662, term247662.getClass(), "lastPlayCredit", 226237834);
        setIntField(term247662, term247662.getClass(), "lastPlayMode", 1291181404);
        setIntField(term247662, term247662.getClass(), "lastPlaceId", 121976016);
        setField(term247662, term247662.getClass(), "lastPlaceName", "sroouWPwJV");
        setIntField(term247662, term247662.getClass(), "lastAllNetId", -745467659);
        setIntField(term247662, term247662.getClass(), "lastRegionId", -1055944419);
        setField(term247662, term247662.getClass(), "lastRegionName", "WDAdIiHeDJ");
        setField(term247662, term247662.getClass(), "lastClientId", "eQGvbQZIRc");
        setField(term247662, term247662.getClass(), "lastCountryCode", "zWuKRjEfdp");
        setIntField(term247662, term247662.getClass(), "lastSelectEMoney", -22283188);
        setIntField(term247662, term247662.getClass(), "lastSelectTicket", 416013091);
        setIntField(term247662, term247662.getClass(), "lastSelectCourse", 804342841);
        setIntField(term247662, term247662.getClass(), "lastCountCourse", -808113844);
        setField(term247662, term247662.getClass(), "firstGameId", "zPSdflqnmk");
        setField(term247662, term247662.getClass(), "firstRomVersion", "uOyOpAymZk");
        setField(term247662, term247662.getClass(), "firstDataVersion", "xtPjvtnPnN");
        setField(term247662, term247662.getClass(), "firstPlayDate", "lbTGbReUrp");
        setField(term247662, term247662.getClass(), "compatibleCmVersion", "oaPePvATgc");
        setField(term247662, term247662.getClass(), "dailyBonusDate", "JIjGGcVKJH");
        setField(term247662, term247662.getClass(), "dailyCourseBonusDate", "iasdYjtSEx");
        setField(term247662, term247662.getClass(), "lastPairLoginDate", "QFfeXcsDUe");
        setField(term247662, term247662.getClass(), "lastTrialPlayDate", "RuTPzciBfn");
        setIntField(term247662, term247662.getClass(), "playVsCount", 706642456);
        setIntField(term247662, term247662.getClass(), "playSyncCount", 1776826425);
        setIntField(term247662, term247662.getClass(), "winCount", -1119160134);
        setIntField(term247662, term247662.getClass(), "helpCount", -1646614481);
        setIntField(term247662, term247662.getClass(), "comboCount", -1691986289);
        setLongField(term247662, term247662.getClass(), "totalDeluxscore", -6553474771576136211L);
        setLongField(term247662, term247662.getClass(), "totalBasicDeluxscore", -1623841727990454933L);
        setLongField(term247662, term247662.getClass(), "totalAdvancedDeluxscore", -5700041176720960136L);
        setLongField(term247662, term247662.getClass(), "totalExpertDeluxscore", -6410504668000162352L);
        setLongField(term247662, term247662.getClass(), "totalMasterDeluxscore", 8093161021380956016L);
        setLongField(term247662, term247662.getClass(), "totalReMasterDeluxscore", 7462322552351560259L);
        setIntField(term247662, term247662.getClass(), "totalSync", -1180346349);
        setIntField(term247662, term247662.getClass(), "totalBasicSync", 1909906563);
        setIntField(term247662, term247662.getClass(), "totalAdvancedSync", 487426779);
        setIntField(term247662, term247662.getClass(), "totalExpertSync", -404184980);
        setIntField(term247662, term247662.getClass(), "totalMasterSync", 817353385);
        setIntField(term247662, term247662.getClass(), "totalReMasterSync", 1732285177);
        setLongField(term247662, term247662.getClass(), "totalAchievement", 8089340307747530544L);
        setLongField(term247662, term247662.getClass(), "totalBasicAchievement", -4327537392312363022L);
        setLongField(term247662, term247662.getClass(), "totalAdvancedAchievement", 3894769061851355230L);
        setLongField(term247662, term247662.getClass(), "totalExpertAchievement", -4809767258377279230L);
        setLongField(term247662, term247662.getClass(), "totalMasterAchievement", 1537519037363441996L);
        setLongField(term247662, term247662.getClass(), "totalReMasterAchievement", -1440615708368533617L);
        setLongField(term247662, term247662.getClass(), "playerOldRating", 6312628791030957985L);
        setLongField(term247662, term247662.getClass(), "playerNewRating", 6790158294543936752L);
        setIntField(term247662, term247662.getClass(), "banState", -692759323);
        setLongField(term247662, term247662.getClass(), "dateTime", 8109349690778268472L);
        term248011 = new Integer(1869710466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term248011;
        callMethod(klass, "setGradeRank", argTypes, term247662, args);
    }

};


