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

public class UserDetail_setTotalAwake_103691859187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244827;
     Object term245194;

    public UserDetail_setTotalAwake_103691859187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term244831 = new Long(3423155413133381764L);
        Integer term244894 = new Integer(-1358832342);
        Integer term244896 = new Integer(330525017);
        Integer term244898 = new Integer(-2097182938);
        Integer term244900 = new Integer(-1911268197);
        Integer term244902 = new Integer(1989699628);
        Integer term244904 = new Integer(1406976166);
        ArrayList term244892 = new ArrayList();
        ((ArrayList) term244892).add(term244894);
        ((ArrayList) term244892).add(term244896);
        ((ArrayList) term244892).add(term244898);
        ((ArrayList) term244892).add(term244900);
        ((ArrayList) term244892).add(term244902);
        ((ArrayList) term244892).add(term244904);
        Integer term244910 = new Integer(-683361157);
        Integer term244912 = new Integer(1735058829);
        Integer term244914 = new Integer(-1945706596);
        Integer term244916 = new Integer(13487895);
        Integer term244918 = new Integer(369911284);
        Integer term244920 = new Integer(1488504614);
        Integer term244922 = new Integer(661477727);
        Integer term244924 = new Integer(274618169);
        ArrayList term244908 = new ArrayList();
        ((ArrayList) term244908).add(term244910);
        ((ArrayList) term244908).add(term244912);
        ((ArrayList) term244908).add(term244914);
        ((ArrayList) term244908).add(term244916);
        ((ArrayList) term244908).add(term244918);
        ((ArrayList) term244908).add(term244920);
        ((ArrayList) term244908).add(term244922);
        ((ArrayList) term244908).add(term244924);
        term244827 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term244829 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term244845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term244846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term244850 = newInstance(Class.forName("java.time.LocalTime"));
        Object term244855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term244856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term244860 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term244827, term244827.getClass(), "id", -7980721328000748291L);
        setLongField(term244829, term244829.getClass(), "id", 113437234904563334L);
        setField(term244829, term244829.getClass(), "extId", term244831);
        setField(term244829, term244829.getClass(), "luid", "zDrkgSuEFM");
        setIntField(term244846, term244846.getClass(), "year", 2011);
        setShortField(term244846, term244846.getClass(), "month", (short) 6);
        setShortField(term244846, term244846.getClass(), "day", (short) 27);
        setField(term244845, term244845.getClass(), "date", term244846);
        setByteField(term244850, term244850.getClass(), "hour", (byte) 12);
        setByteField(term244850, term244850.getClass(), "minute", (byte) 48);
        setByteField(term244850, term244850.getClass(), "second", (byte) 45);
        setIntField(term244850, term244850.getClass(), "nano", 332145929);
        setField(term244845, term244845.getClass(), "time", term244850);
        setField(term244829, term244829.getClass(), "registerTime", term244845);
        setIntField(term244856, term244856.getClass(), "year", 2020);
        setShortField(term244856, term244856.getClass(), "month", (short) 4);
        setShortField(term244856, term244856.getClass(), "day", (short) 29);
        setField(term244855, term244855.getClass(), "date", term244856);
        setByteField(term244860, term244860.getClass(), "hour", (byte) 2);
        setByteField(term244860, term244860.getClass(), "minute", (byte) 54);
        setByteField(term244860, term244860.getClass(), "second", (byte) 2);
        setIntField(term244860, term244860.getClass(), "nano", 314066531);
        setField(term244855, term244855.getClass(), "time", term244860);
        setField(term244829, term244829.getClass(), "accessTime", term244855);
        setField(term244827, term244827.getClass(), "card", term244829);
        setField(term244827, term244827.getClass(), "userName", "bxHnHpzJtk");
        setIntField(term244827, term244827.getClass(), "isNetMember", -1122219060);
        setIntField(term244827, term244827.getClass(), "iconId", -1283490413);
        setIntField(term244827, term244827.getClass(), "plateId", 1352370517);
        setIntField(term244827, term244827.getClass(), "titleId", -1823113056);
        setIntField(term244827, term244827.getClass(), "partnerId", -237444611);
        setIntField(term244827, term244827.getClass(), "frameId", -176508450);
        setIntField(term244827, term244827.getClass(), "selectMapId", 1875398911);
        setIntField(term244827, term244827.getClass(), "totalAwake", 370478918);
        setIntField(term244827, term244827.getClass(), "gradeRating", 989896657);
        setIntField(term244827, term244827.getClass(), "musicRating", 1410935694);
        setIntField(term244827, term244827.getClass(), "playerRating", 832242375);
        setIntField(term244827, term244827.getClass(), "highestRating", 1927641893);
        setIntField(term244827, term244827.getClass(), "gradeRank", 260354570);
        setIntField(term244827, term244827.getClass(), "classRank", 566416820);
        setIntField(term244827, term244827.getClass(), "courseRank", 1472997822);
        setField(term244827, term244827.getClass(), "charaSlot", term244892);
        setField(term244827, term244827.getClass(), "charaLockSlot", term244908);
        setLongField(term244827, term244827.getClass(), "contentBit", -7159660487708297372L);
        setIntField(term244827, term244827.getClass(), "playCount", -1252761386);
        setField(term244827, term244827.getClass(), "eventWatchedDate", "FmIJzXarSb");
        setField(term244827, term244827.getClass(), "lastGameId", "wSRrIxGcDh");
        setField(term244827, term244827.getClass(), "lastRomVersion", "dpLvGtQJDa");
        setField(term244827, term244827.getClass(), "lastDataVersion", "DCsMDVAdSD");
        setField(term244827, term244827.getClass(), "lastLoginDate", "xppszvcBqu");
        setField(term244827, term244827.getClass(), "lastPlayDate", "RoHOfvejXK");
        setIntField(term244827, term244827.getClass(), "lastPlayCredit", 2064530069);
        setIntField(term244827, term244827.getClass(), "lastPlayMode", -1271506389);
        setIntField(term244827, term244827.getClass(), "lastPlaceId", -1502389213);
        setField(term244827, term244827.getClass(), "lastPlaceName", "BpWvAHSzgp");
        setIntField(term244827, term244827.getClass(), "lastAllNetId", -1217431046);
        setIntField(term244827, term244827.getClass(), "lastRegionId", 1472844966);
        setField(term244827, term244827.getClass(), "lastRegionName", "AjaATujJwK");
        setField(term244827, term244827.getClass(), "lastClientId", "qHFDnDYniJ");
        setField(term244827, term244827.getClass(), "lastCountryCode", "MgbYXBxThg");
        setIntField(term244827, term244827.getClass(), "lastSelectEMoney", -501695251);
        setIntField(term244827, term244827.getClass(), "lastSelectTicket", 1764349481);
        setIntField(term244827, term244827.getClass(), "lastSelectCourse", -1925408074);
        setIntField(term244827, term244827.getClass(), "lastCountCourse", 488945441);
        setField(term244827, term244827.getClass(), "firstGameId", "wHcRCOxDfS");
        setField(term244827, term244827.getClass(), "firstRomVersion", "aLuLvKQrgt");
        setField(term244827, term244827.getClass(), "firstDataVersion", "qAoVvEtxnE");
        setField(term244827, term244827.getClass(), "firstPlayDate", "rXhHWXIrYT");
        setField(term244827, term244827.getClass(), "compatibleCmVersion", "xScYUuGKsX");
        setField(term244827, term244827.getClass(), "dailyBonusDate", "trzXXmqsss");
        setField(term244827, term244827.getClass(), "dailyCourseBonusDate", "HWcsZwHzBJ");
        setField(term244827, term244827.getClass(), "lastPairLoginDate", "IXfEZVfVbn");
        setField(term244827, term244827.getClass(), "lastTrialPlayDate", "ibOPAeVaEy");
        setIntField(term244827, term244827.getClass(), "playVsCount", 1653790882);
        setIntField(term244827, term244827.getClass(), "playSyncCount", -680166148);
        setIntField(term244827, term244827.getClass(), "winCount", -1431334306);
        setIntField(term244827, term244827.getClass(), "helpCount", 793712955);
        setIntField(term244827, term244827.getClass(), "comboCount", -848195463);
        setLongField(term244827, term244827.getClass(), "totalDeluxscore", 1495868141387967173L);
        setLongField(term244827, term244827.getClass(), "totalBasicDeluxscore", 4921464212526388601L);
        setLongField(term244827, term244827.getClass(), "totalAdvancedDeluxscore", 1613869807397442916L);
        setLongField(term244827, term244827.getClass(), "totalExpertDeluxscore", 9146636291547178804L);
        setLongField(term244827, term244827.getClass(), "totalMasterDeluxscore", 2132787390214078635L);
        setLongField(term244827, term244827.getClass(), "totalReMasterDeluxscore", -6473487049941785147L);
        setIntField(term244827, term244827.getClass(), "totalSync", -692941306);
        setIntField(term244827, term244827.getClass(), "totalBasicSync", -229579921);
        setIntField(term244827, term244827.getClass(), "totalAdvancedSync", 309181793);
        setIntField(term244827, term244827.getClass(), "totalExpertSync", -1405695173);
        setIntField(term244827, term244827.getClass(), "totalMasterSync", 1314029165);
        setIntField(term244827, term244827.getClass(), "totalReMasterSync", -1769765181);
        setLongField(term244827, term244827.getClass(), "totalAchievement", 8359599617875837300L);
        setLongField(term244827, term244827.getClass(), "totalBasicAchievement", -6694199121622409512L);
        setLongField(term244827, term244827.getClass(), "totalAdvancedAchievement", 2646537322294324751L);
        setLongField(term244827, term244827.getClass(), "totalExpertAchievement", -7407727884928985063L);
        setLongField(term244827, term244827.getClass(), "totalMasterAchievement", 961070142009366373L);
        setLongField(term244827, term244827.getClass(), "totalReMasterAchievement", -3217072096491591943L);
        setLongField(term244827, term244827.getClass(), "playerOldRating", -811437085056765857L);
        setLongField(term244827, term244827.getClass(), "playerNewRating", 1765954058017505458L);
        setIntField(term244827, term244827.getClass(), "banState", 245286488);
        setLongField(term244827, term244827.getClass(), "dateTime", 5647466367275042696L);
        term245194 = new Integer(1557564317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term245194;
        callMethod(klass, "setTotalAwake", argTypes, term244827, args);
    }

};


