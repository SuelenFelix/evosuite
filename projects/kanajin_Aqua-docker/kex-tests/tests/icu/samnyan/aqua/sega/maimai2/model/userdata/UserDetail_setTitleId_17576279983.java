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

public class UserDetail_setTitleId_17576279983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4276631;
     Object term4276980;

    public UserDetail_setTitleId_17576279983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4276635 = new Long(-1046939409955026466L);
        Integer term4276698 = new Integer(-1431321947);
        Integer term4276700 = new Integer(1629420340);
        Integer term4276702 = new Integer(1060055367);
        ArrayList term4276696 = new ArrayList();
        ((ArrayList) term4276696).add(term4276698);
        ((ArrayList) term4276696).add(term4276700);
        ((ArrayList) term4276696).add(term4276702);
        Integer term4276708 = new Integer(2032052675);
        Integer term4276710 = new Integer(534068484);
        ArrayList term4276706 = new ArrayList();
        ((ArrayList) term4276706).add(term4276708);
        ((ArrayList) term4276706).add(term4276710);
        term4276631 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4276633 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4276649 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4276650 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4276654 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4276659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4276660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4276664 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4276631, term4276631.getClass(), "id", -6278366395928575794L);
        setLongField(term4276633, term4276633.getClass(), "id", -2784506751959487449L);
        setField(term4276633, term4276633.getClass(), "extId", term4276635);
        setField(term4276633, term4276633.getClass(), "luid", "VXBzWyiTHV");
        setIntField(term4276650, term4276650.getClass(), "year", 2029);
        setShortField(term4276650, term4276650.getClass(), "month", (short) 6);
        setShortField(term4276650, term4276650.getClass(), "day", (short) 11);
        setField(term4276649, term4276649.getClass(), "date", term4276650);
        setByteField(term4276654, term4276654.getClass(), "hour", (byte) 1);
        setByteField(term4276654, term4276654.getClass(), "minute", (byte) 51);
        setByteField(term4276654, term4276654.getClass(), "second", (byte) 54);
        setIntField(term4276654, term4276654.getClass(), "nano", 780496353);
        setField(term4276649, term4276649.getClass(), "time", term4276654);
        setField(term4276633, term4276633.getClass(), "registerTime", term4276649);
        setIntField(term4276660, term4276660.getClass(), "year", 2012);
        setShortField(term4276660, term4276660.getClass(), "month", (short) 3);
        setShortField(term4276660, term4276660.getClass(), "day", (short) 29);
        setField(term4276659, term4276659.getClass(), "date", term4276660);
        setByteField(term4276664, term4276664.getClass(), "hour", (byte) 5);
        setByteField(term4276664, term4276664.getClass(), "minute", (byte) 27);
        setByteField(term4276664, term4276664.getClass(), "second", (byte) 20);
        setIntField(term4276664, term4276664.getClass(), "nano", 916348881);
        setField(term4276659, term4276659.getClass(), "time", term4276664);
        setField(term4276633, term4276633.getClass(), "accessTime", term4276659);
        setField(term4276631, term4276631.getClass(), "card", term4276633);
        setField(term4276631, term4276631.getClass(), "userName", "HKMJjcQCrC");
        setIntField(term4276631, term4276631.getClass(), "isNetMember", 1770915733);
        setIntField(term4276631, term4276631.getClass(), "iconId", 1614281807);
        setIntField(term4276631, term4276631.getClass(), "plateId", 1181072627);
        setIntField(term4276631, term4276631.getClass(), "titleId", 1355605582);
        setIntField(term4276631, term4276631.getClass(), "partnerId", -191362316);
        setIntField(term4276631, term4276631.getClass(), "frameId", 1728095557);
        setIntField(term4276631, term4276631.getClass(), "selectMapId", -1247548784);
        setIntField(term4276631, term4276631.getClass(), "totalAwake", -1142865148);
        setIntField(term4276631, term4276631.getClass(), "gradeRating", 1107300310);
        setIntField(term4276631, term4276631.getClass(), "musicRating", -215930521);
        setIntField(term4276631, term4276631.getClass(), "playerRating", -1324392181);
        setIntField(term4276631, term4276631.getClass(), "highestRating", 1094842284);
        setIntField(term4276631, term4276631.getClass(), "gradeRank", -1465320942);
        setIntField(term4276631, term4276631.getClass(), "classRank", 484944107);
        setIntField(term4276631, term4276631.getClass(), "courseRank", -1694526525);
        setField(term4276631, term4276631.getClass(), "charaSlot", term4276696);
        setField(term4276631, term4276631.getClass(), "charaLockSlot", term4276706);
        setLongField(term4276631, term4276631.getClass(), "contentBit", 727441390601209547L);
        setIntField(term4276631, term4276631.getClass(), "playCount", -490746336);
        setField(term4276631, term4276631.getClass(), "eventWatchedDate", "IHpTnhAcuL");
        setField(term4276631, term4276631.getClass(), "lastGameId", "UerztqtNUf");
        setField(term4276631, term4276631.getClass(), "lastRomVersion", "HhGhaUOVto");
        setField(term4276631, term4276631.getClass(), "lastDataVersion", "CUgtehJnZr");
        setField(term4276631, term4276631.getClass(), "lastLoginDate", "MxYCphJpge");
        setField(term4276631, term4276631.getClass(), "lastPlayDate", "ddMoWkZyhQ");
        setIntField(term4276631, term4276631.getClass(), "lastPlayCredit", -1846521064);
        setIntField(term4276631, term4276631.getClass(), "lastPlayMode", 2143876517);
        setIntField(term4276631, term4276631.getClass(), "lastPlaceId", -1993758107);
        setField(term4276631, term4276631.getClass(), "lastPlaceName", "YOjBSqHaSq");
        setIntField(term4276631, term4276631.getClass(), "lastAllNetId", -2068667636);
        setIntField(term4276631, term4276631.getClass(), "lastRegionId", 1141221101);
        setField(term4276631, term4276631.getClass(), "lastRegionName", "RVrciNiXls");
        setField(term4276631, term4276631.getClass(), "lastClientId", "hRoTqAUBOv");
        setField(term4276631, term4276631.getClass(), "lastCountryCode", "bZKWMEffGK");
        setIntField(term4276631, term4276631.getClass(), "lastSelectEMoney", 383043004);
        setIntField(term4276631, term4276631.getClass(), "lastSelectTicket", 1570230161);
        setIntField(term4276631, term4276631.getClass(), "lastSelectCourse", 1998404032);
        setIntField(term4276631, term4276631.getClass(), "lastCountCourse", -1779683981);
        setField(term4276631, term4276631.getClass(), "firstGameId", "uxNGwDuoMr");
        setField(term4276631, term4276631.getClass(), "firstRomVersion", "OYItXZRyTb");
        setField(term4276631, term4276631.getClass(), "firstDataVersion", "IiiElNOdyj");
        setField(term4276631, term4276631.getClass(), "firstPlayDate", "ORBogOPTwf");
        setField(term4276631, term4276631.getClass(), "compatibleCmVersion", "aTDXfLlBNO");
        setField(term4276631, term4276631.getClass(), "dailyBonusDate", "zzprEYXorc");
        setField(term4276631, term4276631.getClass(), "dailyCourseBonusDate", "pjSqnLzewH");
        setField(term4276631, term4276631.getClass(), "lastPairLoginDate", "QmZssbbKdZ");
        setField(term4276631, term4276631.getClass(), "lastTrialPlayDate", "XRNPyfTWrN");
        setIntField(term4276631, term4276631.getClass(), "playVsCount", 1647173024);
        setIntField(term4276631, term4276631.getClass(), "playSyncCount", -176929347);
        setIntField(term4276631, term4276631.getClass(), "winCount", -786826938);
        setIntField(term4276631, term4276631.getClass(), "helpCount", 890717166);
        setIntField(term4276631, term4276631.getClass(), "comboCount", 495347003);
        setLongField(term4276631, term4276631.getClass(), "totalDeluxscore", -3393184262854630261L);
        setLongField(term4276631, term4276631.getClass(), "totalBasicDeluxscore", 3522485347425113942L);
        setLongField(term4276631, term4276631.getClass(), "totalAdvancedDeluxscore", 2033684013046587622L);
        setLongField(term4276631, term4276631.getClass(), "totalExpertDeluxscore", 9052848581644026714L);
        setLongField(term4276631, term4276631.getClass(), "totalMasterDeluxscore", -2825815993628429631L);
        setLongField(term4276631, term4276631.getClass(), "totalReMasterDeluxscore", -2923012515840714215L);
        setIntField(term4276631, term4276631.getClass(), "totalSync", 880174681);
        setIntField(term4276631, term4276631.getClass(), "totalBasicSync", -1464998217);
        setIntField(term4276631, term4276631.getClass(), "totalAdvancedSync", -1802077501);
        setIntField(term4276631, term4276631.getClass(), "totalExpertSync", 1391451238);
        setIntField(term4276631, term4276631.getClass(), "totalMasterSync", -805441740);
        setIntField(term4276631, term4276631.getClass(), "totalReMasterSync", 622883018);
        setLongField(term4276631, term4276631.getClass(), "totalAchievement", -8064329496176021416L);
        setLongField(term4276631, term4276631.getClass(), "totalBasicAchievement", -1378677784841531790L);
        setLongField(term4276631, term4276631.getClass(), "totalAdvancedAchievement", -5723563020798417539L);
        setLongField(term4276631, term4276631.getClass(), "totalExpertAchievement", 1408559919857740898L);
        setLongField(term4276631, term4276631.getClass(), "totalMasterAchievement", 4715652973804236475L);
        setLongField(term4276631, term4276631.getClass(), "totalReMasterAchievement", 2701497219487081164L);
        setLongField(term4276631, term4276631.getClass(), "playerOldRating", -6236495246047010115L);
        setLongField(term4276631, term4276631.getClass(), "playerNewRating", -7922554006187514500L);
        setIntField(term4276631, term4276631.getClass(), "banState", -1580319871);
        setLongField(term4276631, term4276631.getClass(), "dateTime", 180401773384150513L);
        term4276980 = new Integer(-1236180322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4276980;
        callMethod(klass, "setTitleId", argTypes, term4276631, args);
    }

};


