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

public class UserCharge_getStock_8976759634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122784;

    public UserCharge_getStock_8976759634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term122790 = new Long(-7310273014364148916L);
        Integer term122853 = new Integer(1953620444);
        Integer term122855 = new Integer(-1111307978);
        Integer term122857 = new Integer(609697271);
        Integer term122859 = new Integer(1121247998);
        Integer term122861 = new Integer(-710001354);
        Integer term122863 = new Integer(2007404429);
        ArrayList term122851 = new ArrayList();
        ((ArrayList) term122851).add(term122853);
        ((ArrayList) term122851).add(term122855);
        ((ArrayList) term122851).add(term122857);
        ((ArrayList) term122851).add(term122859);
        ((ArrayList) term122851).add(term122861);
        ((ArrayList) term122851).add(term122863);
        Integer term122869 = new Integer(472580433);
        Integer term122871 = new Integer(1189049164);
        Integer term122873 = new Integer(-673413879);
        Integer term122875 = new Integer(1609778442);
        Integer term122877 = new Integer(524850421);
        Integer term122879 = new Integer(-1833121756);
        Integer term122881 = new Integer(-1493632787);
        ArrayList term122867 = new ArrayList();
        ((ArrayList) term122867).add(term122869);
        ((ArrayList) term122867).add(term122871);
        ((ArrayList) term122867).add(term122873);
        ((ArrayList) term122867).add(term122875);
        ((ArrayList) term122867).add(term122877);
        ((ArrayList) term122867).add(term122879);
        ((ArrayList) term122867).add(term122881);
        term122784 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term122786 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term122788 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term122804 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122805 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122809 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122819 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term122784, term122784.getClass(), "id", 844984809649867261L);
        setLongField(term122786, term122786.getClass(), "id", -5005897600184422009L);
        setLongField(term122788, term122788.getClass(), "id", -6725278387251669076L);
        setField(term122788, term122788.getClass(), "extId", term122790);
        setField(term122788, term122788.getClass(), "luid", "HisKZVFThP");
        setIntField(term122805, term122805.getClass(), "year", 2015);
        setShortField(term122805, term122805.getClass(), "month", (short) 1);
        setShortField(term122805, term122805.getClass(), "day", (short) 23);
        setField(term122804, term122804.getClass(), "date", term122805);
        setByteField(term122809, term122809.getClass(), "hour", (byte) 0);
        setByteField(term122809, term122809.getClass(), "minute", (byte) 5);
        setByteField(term122809, term122809.getClass(), "second", (byte) 21);
        setIntField(term122809, term122809.getClass(), "nano", 402778195);
        setField(term122804, term122804.getClass(), "time", term122809);
        setField(term122788, term122788.getClass(), "registerTime", term122804);
        setIntField(term122815, term122815.getClass(), "year", 2022);
        setShortField(term122815, term122815.getClass(), "month", (short) 4);
        setShortField(term122815, term122815.getClass(), "day", (short) 2);
        setField(term122814, term122814.getClass(), "date", term122815);
        setByteField(term122819, term122819.getClass(), "hour", (byte) 21);
        setByteField(term122819, term122819.getClass(), "minute", (byte) 1);
        setByteField(term122819, term122819.getClass(), "second", (byte) 56);
        setIntField(term122819, term122819.getClass(), "nano", 418299217);
        setField(term122814, term122814.getClass(), "time", term122819);
        setField(term122788, term122788.getClass(), "accessTime", term122814);
        setField(term122786, term122786.getClass(), "card", term122788);
        setField(term122786, term122786.getClass(), "userName", "aYnflhXuDg");
        setIntField(term122786, term122786.getClass(), "isNetMember", -984536386);
        setIntField(term122786, term122786.getClass(), "iconId", -394673031);
        setIntField(term122786, term122786.getClass(), "plateId", -2114266331);
        setIntField(term122786, term122786.getClass(), "titleId", 1060512544);
        setIntField(term122786, term122786.getClass(), "partnerId", 733910191);
        setIntField(term122786, term122786.getClass(), "frameId", -1299247390);
        setIntField(term122786, term122786.getClass(), "selectMapId", 901132234);
        setIntField(term122786, term122786.getClass(), "totalAwake", -205835456);
        setIntField(term122786, term122786.getClass(), "gradeRating", 889992615);
        setIntField(term122786, term122786.getClass(), "musicRating", 1184212871);
        setIntField(term122786, term122786.getClass(), "playerRating", 1318633291);
        setIntField(term122786, term122786.getClass(), "highestRating", 163521915);
        setIntField(term122786, term122786.getClass(), "gradeRank", 208383602);
        setIntField(term122786, term122786.getClass(), "classRank", -936623097);
        setIntField(term122786, term122786.getClass(), "courseRank", -1148000466);
        setField(term122786, term122786.getClass(), "charaSlot", term122851);
        setField(term122786, term122786.getClass(), "charaLockSlot", term122867);
        setLongField(term122786, term122786.getClass(), "contentBit", -7749915504733119858L);
        setIntField(term122786, term122786.getClass(), "playCount", 1299330727);
        setField(term122786, term122786.getClass(), "eventWatchedDate", "CfykLOhTuP");
        setField(term122786, term122786.getClass(), "lastGameId", "pGIHyjmseT");
        setField(term122786, term122786.getClass(), "lastRomVersion", "DFKfoJgHLx");
        setField(term122786, term122786.getClass(), "lastDataVersion", "kbySPSiGhF");
        setField(term122786, term122786.getClass(), "lastLoginDate", "sKCjjNeVoI");
        setField(term122786, term122786.getClass(), "lastPlayDate", "HuoMsoUWrV");
        setIntField(term122786, term122786.getClass(), "lastPlayCredit", 1541672801);
        setIntField(term122786, term122786.getClass(), "lastPlayMode", -1723354196);
        setIntField(term122786, term122786.getClass(), "lastPlaceId", -19725944);
        setField(term122786, term122786.getClass(), "lastPlaceName", "jCLmdVxyvG");
        setIntField(term122786, term122786.getClass(), "lastAllNetId", 432916102);
        setIntField(term122786, term122786.getClass(), "lastRegionId", -1059151250);
        setField(term122786, term122786.getClass(), "lastRegionName", "FYniCuCHuO");
        setField(term122786, term122786.getClass(), "lastClientId", "VJXbdWMtjC");
        setField(term122786, term122786.getClass(), "lastCountryCode", "AugzpVbSsO");
        setIntField(term122786, term122786.getClass(), "lastSelectEMoney", 150030523);
        setIntField(term122786, term122786.getClass(), "lastSelectTicket", -1729514045);
        setIntField(term122786, term122786.getClass(), "lastSelectCourse", 72012599);
        setIntField(term122786, term122786.getClass(), "lastCountCourse", 1119073188);
        setField(term122786, term122786.getClass(), "firstGameId", "tBGQmugLvu");
        setField(term122786, term122786.getClass(), "firstRomVersion", "oxWULKaNGt");
        setField(term122786, term122786.getClass(), "firstDataVersion", "cbZjrijpVX");
        setField(term122786, term122786.getClass(), "firstPlayDate", "OGWRelGqxR");
        setField(term122786, term122786.getClass(), "compatibleCmVersion", "fKSWVsjAjO");
        setField(term122786, term122786.getClass(), "dailyBonusDate", "mgPzmcygcU");
        setField(term122786, term122786.getClass(), "dailyCourseBonusDate", "mvEDoAbPuT");
        setField(term122786, term122786.getClass(), "lastPairLoginDate", "EUWHyMdRKl");
        setField(term122786, term122786.getClass(), "lastTrialPlayDate", "YsUKZpMHKF");
        setIntField(term122786, term122786.getClass(), "playVsCount", -1116601587);
        setIntField(term122786, term122786.getClass(), "playSyncCount", -1646521952);
        setIntField(term122786, term122786.getClass(), "winCount", 532690926);
        setIntField(term122786, term122786.getClass(), "helpCount", 1569782717);
        setIntField(term122786, term122786.getClass(), "comboCount", -479375394);
        setLongField(term122786, term122786.getClass(), "totalDeluxscore", 3831373290233240912L);
        setLongField(term122786, term122786.getClass(), "totalBasicDeluxscore", -8875705710065624742L);
        setLongField(term122786, term122786.getClass(), "totalAdvancedDeluxscore", -8194245212128058943L);
        setLongField(term122786, term122786.getClass(), "totalExpertDeluxscore", -3211414419641712590L);
        setLongField(term122786, term122786.getClass(), "totalMasterDeluxscore", -7151126183741184747L);
        setLongField(term122786, term122786.getClass(), "totalReMasterDeluxscore", -5196407870377205566L);
        setIntField(term122786, term122786.getClass(), "totalSync", 2068819583);
        setIntField(term122786, term122786.getClass(), "totalBasicSync", 1499046631);
        setIntField(term122786, term122786.getClass(), "totalAdvancedSync", -846622452);
        setIntField(term122786, term122786.getClass(), "totalExpertSync", -1069059356);
        setIntField(term122786, term122786.getClass(), "totalMasterSync", -2030213410);
        setIntField(term122786, term122786.getClass(), "totalReMasterSync", -63736169);
        setLongField(term122786, term122786.getClass(), "totalAchievement", -6773944686989684227L);
        setLongField(term122786, term122786.getClass(), "totalBasicAchievement", -7682378554119457253L);
        setLongField(term122786, term122786.getClass(), "totalAdvancedAchievement", 1869604949062541679L);
        setLongField(term122786, term122786.getClass(), "totalExpertAchievement", 6908358662328756989L);
        setLongField(term122786, term122786.getClass(), "totalMasterAchievement", -8010919718941207419L);
        setLongField(term122786, term122786.getClass(), "totalReMasterAchievement", -5187413994592501672L);
        setLongField(term122786, term122786.getClass(), "playerOldRating", 6101635617975429284L);
        setLongField(term122786, term122786.getClass(), "playerNewRating", -8578947855341774832L);
        setIntField(term122786, term122786.getClass(), "banState", 1480163997);
        setLongField(term122786, term122786.getClass(), "dateTime", 1002339845362412000L);
        setField(term122784, term122784.getClass(), "user", term122786);
        setIntField(term122784, term122784.getClass(), "chargeId", -949949277);
        setIntField(term122784, term122784.getClass(), "stock", -1805950945);
        setField(term122784, term122784.getClass(), "purchaseDate", "sPGChMFTge");
        setField(term122784, term122784.getClass(), "validDate", "DYmBIVURjz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStock", argTypes, term122784, args);
    }

};


