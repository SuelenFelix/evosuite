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

public class UserDetail_setTotalAwake_103691859188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244882;
     Object term245249;

    public UserDetail_setTotalAwake_103691859188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term244886 = new Long(3423155413133381764L);
        Integer term244949 = new Integer(-1358832342);
        Integer term244951 = new Integer(330525017);
        Integer term244953 = new Integer(-2097182938);
        Integer term244955 = new Integer(-1911268197);
        Integer term244957 = new Integer(1989699628);
        Integer term244959 = new Integer(1406976166);
        ArrayList term244947 = new ArrayList();
        ((ArrayList) term244947).add(term244949);
        ((ArrayList) term244947).add(term244951);
        ((ArrayList) term244947).add(term244953);
        ((ArrayList) term244947).add(term244955);
        ((ArrayList) term244947).add(term244957);
        ((ArrayList) term244947).add(term244959);
        Integer term244965 = new Integer(-683361157);
        Integer term244967 = new Integer(1735058829);
        Integer term244969 = new Integer(-1945706596);
        Integer term244971 = new Integer(13487895);
        Integer term244973 = new Integer(369911284);
        Integer term244975 = new Integer(1488504614);
        Integer term244977 = new Integer(661477727);
        Integer term244979 = new Integer(274618169);
        ArrayList term244963 = new ArrayList();
        ((ArrayList) term244963).add(term244965);
        ((ArrayList) term244963).add(term244967);
        ((ArrayList) term244963).add(term244969);
        ((ArrayList) term244963).add(term244971);
        ((ArrayList) term244963).add(term244973);
        ((ArrayList) term244963).add(term244975);
        ((ArrayList) term244963).add(term244977);
        ((ArrayList) term244963).add(term244979);
        term244882 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term244884 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term244900 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term244901 = newInstance(Class.forName("java.time.LocalDate"));
        Object term244905 = newInstance(Class.forName("java.time.LocalTime"));
        Object term244910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term244911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term244915 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term244882, term244882.getClass(), "id", -7980721328000748291L);
        setLongField(term244884, term244884.getClass(), "id", 113437234904563334L);
        setField(term244884, term244884.getClass(), "extId", term244886);
        setField(term244884, term244884.getClass(), "luid", "zDrkgSuEFM");
        setIntField(term244901, term244901.getClass(), "year", 2011);
        setShortField(term244901, term244901.getClass(), "month", (short) 6);
        setShortField(term244901, term244901.getClass(), "day", (short) 27);
        setField(term244900, term244900.getClass(), "date", term244901);
        setByteField(term244905, term244905.getClass(), "hour", (byte) 12);
        setByteField(term244905, term244905.getClass(), "minute", (byte) 48);
        setByteField(term244905, term244905.getClass(), "second", (byte) 45);
        setIntField(term244905, term244905.getClass(), "nano", 332145929);
        setField(term244900, term244900.getClass(), "time", term244905);
        setField(term244884, term244884.getClass(), "registerTime", term244900);
        setIntField(term244911, term244911.getClass(), "year", 2020);
        setShortField(term244911, term244911.getClass(), "month", (short) 4);
        setShortField(term244911, term244911.getClass(), "day", (short) 29);
        setField(term244910, term244910.getClass(), "date", term244911);
        setByteField(term244915, term244915.getClass(), "hour", (byte) 2);
        setByteField(term244915, term244915.getClass(), "minute", (byte) 54);
        setByteField(term244915, term244915.getClass(), "second", (byte) 2);
        setIntField(term244915, term244915.getClass(), "nano", 314066531);
        setField(term244910, term244910.getClass(), "time", term244915);
        setField(term244884, term244884.getClass(), "accessTime", term244910);
        setField(term244882, term244882.getClass(), "card", term244884);
        setField(term244882, term244882.getClass(), "userName", "bxHnHpzJtk");
        setIntField(term244882, term244882.getClass(), "isNetMember", -1122219060);
        setIntField(term244882, term244882.getClass(), "iconId", -1283490413);
        setIntField(term244882, term244882.getClass(), "plateId", 1352370517);
        setIntField(term244882, term244882.getClass(), "titleId", -1823113056);
        setIntField(term244882, term244882.getClass(), "partnerId", -237444611);
        setIntField(term244882, term244882.getClass(), "frameId", -176508450);
        setIntField(term244882, term244882.getClass(), "selectMapId", 1875398911);
        setIntField(term244882, term244882.getClass(), "totalAwake", 370478918);
        setIntField(term244882, term244882.getClass(), "gradeRating", 989896657);
        setIntField(term244882, term244882.getClass(), "musicRating", 1410935694);
        setIntField(term244882, term244882.getClass(), "playerRating", 832242375);
        setIntField(term244882, term244882.getClass(), "highestRating", 1927641893);
        setIntField(term244882, term244882.getClass(), "gradeRank", 260354570);
        setIntField(term244882, term244882.getClass(), "classRank", 566416820);
        setIntField(term244882, term244882.getClass(), "courseRank", 1472997822);
        setField(term244882, term244882.getClass(), "charaSlot", term244947);
        setField(term244882, term244882.getClass(), "charaLockSlot", term244963);
        setLongField(term244882, term244882.getClass(), "contentBit", -7159660487708297372L);
        setIntField(term244882, term244882.getClass(), "playCount", -1252761386);
        setField(term244882, term244882.getClass(), "eventWatchedDate", "FmIJzXarSb");
        setField(term244882, term244882.getClass(), "lastGameId", "wSRrIxGcDh");
        setField(term244882, term244882.getClass(), "lastRomVersion", "dpLvGtQJDa");
        setField(term244882, term244882.getClass(), "lastDataVersion", "DCsMDVAdSD");
        setField(term244882, term244882.getClass(), "lastLoginDate", "xppszvcBqu");
        setField(term244882, term244882.getClass(), "lastPlayDate", "RoHOfvejXK");
        setIntField(term244882, term244882.getClass(), "lastPlayCredit", 2064530069);
        setIntField(term244882, term244882.getClass(), "lastPlayMode", -1271506389);
        setIntField(term244882, term244882.getClass(), "lastPlaceId", -1502389213);
        setField(term244882, term244882.getClass(), "lastPlaceName", "BpWvAHSzgp");
        setIntField(term244882, term244882.getClass(), "lastAllNetId", -1217431046);
        setIntField(term244882, term244882.getClass(), "lastRegionId", 1472844966);
        setField(term244882, term244882.getClass(), "lastRegionName", "AjaATujJwK");
        setField(term244882, term244882.getClass(), "lastClientId", "qHFDnDYniJ");
        setField(term244882, term244882.getClass(), "lastCountryCode", "MgbYXBxThg");
        setIntField(term244882, term244882.getClass(), "lastSelectEMoney", -501695251);
        setIntField(term244882, term244882.getClass(), "lastSelectTicket", 1764349481);
        setIntField(term244882, term244882.getClass(), "lastSelectCourse", -1925408074);
        setIntField(term244882, term244882.getClass(), "lastCountCourse", 488945441);
        setField(term244882, term244882.getClass(), "firstGameId", "wHcRCOxDfS");
        setField(term244882, term244882.getClass(), "firstRomVersion", "aLuLvKQrgt");
        setField(term244882, term244882.getClass(), "firstDataVersion", "qAoVvEtxnE");
        setField(term244882, term244882.getClass(), "firstPlayDate", "rXhHWXIrYT");
        setField(term244882, term244882.getClass(), "compatibleCmVersion", "xScYUuGKsX");
        setField(term244882, term244882.getClass(), "dailyBonusDate", "trzXXmqsss");
        setField(term244882, term244882.getClass(), "dailyCourseBonusDate", "HWcsZwHzBJ");
        setField(term244882, term244882.getClass(), "lastPairLoginDate", "IXfEZVfVbn");
        setField(term244882, term244882.getClass(), "lastTrialPlayDate", "ibOPAeVaEy");
        setIntField(term244882, term244882.getClass(), "playVsCount", 1653790882);
        setIntField(term244882, term244882.getClass(), "playSyncCount", -680166148);
        setIntField(term244882, term244882.getClass(), "winCount", -1431334306);
        setIntField(term244882, term244882.getClass(), "helpCount", 793712955);
        setIntField(term244882, term244882.getClass(), "comboCount", -848195463);
        setLongField(term244882, term244882.getClass(), "totalDeluxscore", 1495868141387967173L);
        setLongField(term244882, term244882.getClass(), "totalBasicDeluxscore", 4921464212526388601L);
        setLongField(term244882, term244882.getClass(), "totalAdvancedDeluxscore", 1613869807397442916L);
        setLongField(term244882, term244882.getClass(), "totalExpertDeluxscore", 9146636291547178804L);
        setLongField(term244882, term244882.getClass(), "totalMasterDeluxscore", 2132787390214078635L);
        setLongField(term244882, term244882.getClass(), "totalReMasterDeluxscore", -6473487049941785147L);
        setIntField(term244882, term244882.getClass(), "totalSync", -692941306);
        setIntField(term244882, term244882.getClass(), "totalBasicSync", -229579921);
        setIntField(term244882, term244882.getClass(), "totalAdvancedSync", 309181793);
        setIntField(term244882, term244882.getClass(), "totalExpertSync", -1405695173);
        setIntField(term244882, term244882.getClass(), "totalMasterSync", 1314029165);
        setIntField(term244882, term244882.getClass(), "totalReMasterSync", -1769765181);
        setLongField(term244882, term244882.getClass(), "totalAchievement", 8359599617875837300L);
        setLongField(term244882, term244882.getClass(), "totalBasicAchievement", -6694199121622409512L);
        setLongField(term244882, term244882.getClass(), "totalAdvancedAchievement", 2646537322294324751L);
        setLongField(term244882, term244882.getClass(), "totalExpertAchievement", -7407727884928985063L);
        setLongField(term244882, term244882.getClass(), "totalMasterAchievement", 961070142009366373L);
        setLongField(term244882, term244882.getClass(), "totalReMasterAchievement", -3217072096491591943L);
        setLongField(term244882, term244882.getClass(), "playerOldRating", -811437085056765857L);
        setLongField(term244882, term244882.getClass(), "playerNewRating", 1765954058017505458L);
        setIntField(term244882, term244882.getClass(), "banState", 245286488);
        setLongField(term244882, term244882.getClass(), "dateTime", 5647466367275042696L);
        term245249 = new Integer(1557564317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term245249;
        callMethod(klass, "setTotalAwake", argTypes, term244882, args);
    }

};


