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

public class UserDetail_getLastAllNetId_37588613333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213741;

    public UserDetail_getLastAllNetId_37588613333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term213745 = new Long(-2691996476200751382L);
        Integer term213808 = new Integer(-2011847985);
        Integer term213810 = new Integer(1113480119);
        Integer term213812 = new Integer(-159235116);
        Integer term213814 = new Integer(1280384723);
        Integer term213816 = new Integer(1755299610);
        Integer term213818 = new Integer(1141997389);
        Integer term213820 = new Integer(-1491507262);
        ArrayList term213806 = new ArrayList();
        ((ArrayList) term213806).add(term213808);
        ((ArrayList) term213806).add(term213810);
        ((ArrayList) term213806).add(term213812);
        ((ArrayList) term213806).add(term213814);
        ((ArrayList) term213806).add(term213816);
        ((ArrayList) term213806).add(term213818);
        ((ArrayList) term213806).add(term213820);
        ArrayList term213824 = new ArrayList();
        term213741 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term213743 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term213759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term213769 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213770 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213774 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term213741, term213741.getClass(), "id", 4064024558032123978L);
        setLongField(term213743, term213743.getClass(), "id", 7145794412304624733L);
        setField(term213743, term213743.getClass(), "extId", term213745);
        setField(term213743, term213743.getClass(), "luid", "yBWLVacoFx");
        setIntField(term213760, term213760.getClass(), "year", 2010);
        setShortField(term213760, term213760.getClass(), "month", (short) 5);
        setShortField(term213760, term213760.getClass(), "day", (short) 27);
        setField(term213759, term213759.getClass(), "date", term213760);
        setByteField(term213764, term213764.getClass(), "hour", (byte) 20);
        setByteField(term213764, term213764.getClass(), "minute", (byte) 55);
        setByteField(term213764, term213764.getClass(), "second", (byte) 13);
        setIntField(term213764, term213764.getClass(), "nano", 375773979);
        setField(term213759, term213759.getClass(), "time", term213764);
        setField(term213743, term213743.getClass(), "registerTime", term213759);
        setIntField(term213770, term213770.getClass(), "year", 2023);
        setShortField(term213770, term213770.getClass(), "month", (short) 5);
        setShortField(term213770, term213770.getClass(), "day", (short) 21);
        setField(term213769, term213769.getClass(), "date", term213770);
        setByteField(term213774, term213774.getClass(), "hour", (byte) 7);
        setByteField(term213774, term213774.getClass(), "minute", (byte) 54);
        setByteField(term213774, term213774.getClass(), "second", (byte) 55);
        setIntField(term213774, term213774.getClass(), "nano", 241590130);
        setField(term213769, term213769.getClass(), "time", term213774);
        setField(term213743, term213743.getClass(), "accessTime", term213769);
        setField(term213741, term213741.getClass(), "card", term213743);
        setField(term213741, term213741.getClass(), "userName", "dHSfngZIJP");
        setIntField(term213741, term213741.getClass(), "isNetMember", 578922091);
        setIntField(term213741, term213741.getClass(), "iconId", 1645299882);
        setIntField(term213741, term213741.getClass(), "plateId", -430972061);
        setIntField(term213741, term213741.getClass(), "titleId", 303799281);
        setIntField(term213741, term213741.getClass(), "partnerId", 993949631);
        setIntField(term213741, term213741.getClass(), "frameId", -1501399057);
        setIntField(term213741, term213741.getClass(), "selectMapId", 1885755605);
        setIntField(term213741, term213741.getClass(), "totalAwake", -865640007);
        setIntField(term213741, term213741.getClass(), "gradeRating", -852853895);
        setIntField(term213741, term213741.getClass(), "musicRating", 923992540);
        setIntField(term213741, term213741.getClass(), "playerRating", -1752952689);
        setIntField(term213741, term213741.getClass(), "highestRating", -1876841878);
        setIntField(term213741, term213741.getClass(), "gradeRank", -314514599);
        setIntField(term213741, term213741.getClass(), "classRank", 913233303);
        setIntField(term213741, term213741.getClass(), "courseRank", -1757188792);
        setField(term213741, term213741.getClass(), "charaSlot", term213806);
        setField(term213741, term213741.getClass(), "charaLockSlot", term213824);
        setLongField(term213741, term213741.getClass(), "contentBit", 2829552823682090996L);
        setIntField(term213741, term213741.getClass(), "playCount", 988441469);
        setField(term213741, term213741.getClass(), "eventWatchedDate", "CJAtcuTGHa");
        setField(term213741, term213741.getClass(), "lastGameId", "iHNeGutoBe");
        setField(term213741, term213741.getClass(), "lastRomVersion", "AUYkRCDvFL");
        setField(term213741, term213741.getClass(), "lastDataVersion", "kkEjADnYLO");
        setField(term213741, term213741.getClass(), "lastLoginDate", "TsbsGtwNGu");
        setField(term213741, term213741.getClass(), "lastPlayDate", "QwHuOwnkhN");
        setIntField(term213741, term213741.getClass(), "lastPlayCredit", -152256749);
        setIntField(term213741, term213741.getClass(), "lastPlayMode", -218639168);
        setIntField(term213741, term213741.getClass(), "lastPlaceId", -429628062);
        setField(term213741, term213741.getClass(), "lastPlaceName", "VPnzlRjkwv");
        setIntField(term213741, term213741.getClass(), "lastAllNetId", 473106716);
        setIntField(term213741, term213741.getClass(), "lastRegionId", -434143406);
        setField(term213741, term213741.getClass(), "lastRegionName", "kGHPIwWRWu");
        setField(term213741, term213741.getClass(), "lastClientId", "IJsNSqAFmS");
        setField(term213741, term213741.getClass(), "lastCountryCode", "RpuVDFROhs");
        setIntField(term213741, term213741.getClass(), "lastSelectEMoney", -1144966099);
        setIntField(term213741, term213741.getClass(), "lastSelectTicket", -56203372);
        setIntField(term213741, term213741.getClass(), "lastSelectCourse", -174061580);
        setIntField(term213741, term213741.getClass(), "lastCountCourse", 236856575);
        setField(term213741, term213741.getClass(), "firstGameId", "quAdPAVxpb");
        setField(term213741, term213741.getClass(), "firstRomVersion", "SHPiFSZxaM");
        setField(term213741, term213741.getClass(), "firstDataVersion", "MGNQzfluos");
        setField(term213741, term213741.getClass(), "firstPlayDate", "bEqBGVftHS");
        setField(term213741, term213741.getClass(), "compatibleCmVersion", "TeNUwFQFbf");
        setField(term213741, term213741.getClass(), "dailyBonusDate", "AxcRekxBDy");
        setField(term213741, term213741.getClass(), "dailyCourseBonusDate", "PJgWnydUjb");
        setField(term213741, term213741.getClass(), "lastPairLoginDate", "JLLHHjJqxd");
        setField(term213741, term213741.getClass(), "lastTrialPlayDate", "xLCbBvSbQG");
        setIntField(term213741, term213741.getClass(), "playVsCount", -1726762020);
        setIntField(term213741, term213741.getClass(), "playSyncCount", -632724023);
        setIntField(term213741, term213741.getClass(), "winCount", 1593018448);
        setIntField(term213741, term213741.getClass(), "helpCount", 492544194);
        setIntField(term213741, term213741.getClass(), "comboCount", -1477909979);
        setLongField(term213741, term213741.getClass(), "totalDeluxscore", -5015750737482175704L);
        setLongField(term213741, term213741.getClass(), "totalBasicDeluxscore", -1437774821727356513L);
        setLongField(term213741, term213741.getClass(), "totalAdvancedDeluxscore", -7595484344988141936L);
        setLongField(term213741, term213741.getClass(), "totalExpertDeluxscore", 6589159223353954342L);
        setLongField(term213741, term213741.getClass(), "totalMasterDeluxscore", -7368973459338784672L);
        setLongField(term213741, term213741.getClass(), "totalReMasterDeluxscore", -7976516290695169572L);
        setIntField(term213741, term213741.getClass(), "totalSync", -975558073);
        setIntField(term213741, term213741.getClass(), "totalBasicSync", -541335965);
        setIntField(term213741, term213741.getClass(), "totalAdvancedSync", 790308552);
        setIntField(term213741, term213741.getClass(), "totalExpertSync", -1543840209);
        setIntField(term213741, term213741.getClass(), "totalMasterSync", 411851539);
        setIntField(term213741, term213741.getClass(), "totalReMasterSync", -1461527580);
        setLongField(term213741, term213741.getClass(), "totalAchievement", -3472611771220786891L);
        setLongField(term213741, term213741.getClass(), "totalBasicAchievement", -5245156700761266221L);
        setLongField(term213741, term213741.getClass(), "totalAdvancedAchievement", -3660699514135311515L);
        setLongField(term213741, term213741.getClass(), "totalExpertAchievement", -1788657828389907109L);
        setLongField(term213741, term213741.getClass(), "totalMasterAchievement", -1012039825774548964L);
        setLongField(term213741, term213741.getClass(), "totalReMasterAchievement", 2413946911910708169L);
        setLongField(term213741, term213741.getClass(), "playerOldRating", -4354064902026120504L);
        setLongField(term213741, term213741.getClass(), "playerNewRating", 7572847841780625017L);
        setIntField(term213741, term213741.getClass(), "banState", -1241679161);
        setLongField(term213741, term213741.getClass(), "dateTime", -4659933601651349834L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term213741, args);
    }

};


