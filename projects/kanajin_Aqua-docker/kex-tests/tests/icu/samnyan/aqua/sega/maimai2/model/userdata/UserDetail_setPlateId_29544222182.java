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

public class UserDetail_setPlateId_29544222182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242002;
     Object term242359;

    public UserDetail_setPlateId_29544222182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term242006 = new Long(3453457027014743006L);
        Integer term242069 = new Integer(-1058283823);
        Integer term242071 = new Integer(-1620576583);
        ArrayList term242067 = new ArrayList();
        ((ArrayList) term242067).add(term242069);
        ((ArrayList) term242067).add(term242071);
        Integer term242077 = new Integer(-1365748841);
        Integer term242079 = new Integer(1223391792);
        Integer term242081 = new Integer(-1134943583);
        Integer term242083 = new Integer(-694277686);
        Integer term242085 = new Integer(-2044994445);
        Integer term242087 = new Integer(-883941371);
        Integer term242089 = new Integer(-1545047968);
        ArrayList term242075 = new ArrayList();
        ((ArrayList) term242075).add(term242077);
        ((ArrayList) term242075).add(term242079);
        ((ArrayList) term242075).add(term242081);
        ((ArrayList) term242075).add(term242083);
        ((ArrayList) term242075).add(term242085);
        ((ArrayList) term242075).add(term242087);
        ((ArrayList) term242075).add(term242089);
        term242002 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term242004 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term242020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term242021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term242025 = newInstance(Class.forName("java.time.LocalTime"));
        Object term242030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term242031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term242035 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term242002, term242002.getClass(), "id", 556286024289197121L);
        setLongField(term242004, term242004.getClass(), "id", -8281643980980259313L);
        setField(term242004, term242004.getClass(), "extId", term242006);
        setField(term242004, term242004.getClass(), "luid", "SNxxiwGooS");
        setIntField(term242021, term242021.getClass(), "year", 2022);
        setShortField(term242021, term242021.getClass(), "month", (short) 9);
        setShortField(term242021, term242021.getClass(), "day", (short) 29);
        setField(term242020, term242020.getClass(), "date", term242021);
        setByteField(term242025, term242025.getClass(), "hour", (byte) 15);
        setByteField(term242025, term242025.getClass(), "minute", (byte) 41);
        setByteField(term242025, term242025.getClass(), "second", (byte) 55);
        setIntField(term242025, term242025.getClass(), "nano", 811723850);
        setField(term242020, term242020.getClass(), "time", term242025);
        setField(term242004, term242004.getClass(), "registerTime", term242020);
        setIntField(term242031, term242031.getClass(), "year", 2017);
        setShortField(term242031, term242031.getClass(), "month", (short) 3);
        setShortField(term242031, term242031.getClass(), "day", (short) 7);
        setField(term242030, term242030.getClass(), "date", term242031);
        setByteField(term242035, term242035.getClass(), "hour", (byte) 17);
        setByteField(term242035, term242035.getClass(), "minute", (byte) 3);
        setByteField(term242035, term242035.getClass(), "second", (byte) 1);
        setIntField(term242035, term242035.getClass(), "nano", 107604440);
        setField(term242030, term242030.getClass(), "time", term242035);
        setField(term242004, term242004.getClass(), "accessTime", term242030);
        setField(term242002, term242002.getClass(), "card", term242004);
        setField(term242002, term242002.getClass(), "userName", "uACfzGuzLf");
        setIntField(term242002, term242002.getClass(), "isNetMember", -731775853);
        setIntField(term242002, term242002.getClass(), "iconId", -1250448247);
        setIntField(term242002, term242002.getClass(), "plateId", 292160669);
        setIntField(term242002, term242002.getClass(), "titleId", 738714500);
        setIntField(term242002, term242002.getClass(), "partnerId", -1464992742);
        setIntField(term242002, term242002.getClass(), "frameId", 1695203610);
        setIntField(term242002, term242002.getClass(), "selectMapId", 1221449396);
        setIntField(term242002, term242002.getClass(), "totalAwake", 1420622683);
        setIntField(term242002, term242002.getClass(), "gradeRating", 1526408522);
        setIntField(term242002, term242002.getClass(), "musicRating", 128258005);
        setIntField(term242002, term242002.getClass(), "playerRating", 1223583997);
        setIntField(term242002, term242002.getClass(), "highestRating", -1876769614);
        setIntField(term242002, term242002.getClass(), "gradeRank", -1214190971);
        setIntField(term242002, term242002.getClass(), "classRank", 197274645);
        setIntField(term242002, term242002.getClass(), "courseRank", 2099971798);
        setField(term242002, term242002.getClass(), "charaSlot", term242067);
        setField(term242002, term242002.getClass(), "charaLockSlot", term242075);
        setLongField(term242002, term242002.getClass(), "contentBit", -4020916976775387591L);
        setIntField(term242002, term242002.getClass(), "playCount", 1826998217);
        setField(term242002, term242002.getClass(), "eventWatchedDate", "GhNtnTcGqj");
        setField(term242002, term242002.getClass(), "lastGameId", "llQSWhVMIU");
        setField(term242002, term242002.getClass(), "lastRomVersion", "obVHSLzFkr");
        setField(term242002, term242002.getClass(), "lastDataVersion", "qPqtpUGEBt");
        setField(term242002, term242002.getClass(), "lastLoginDate", "LjpmgLxxAN");
        setField(term242002, term242002.getClass(), "lastPlayDate", "axbOsAnkgV");
        setIntField(term242002, term242002.getClass(), "lastPlayCredit", -41129313);
        setIntField(term242002, term242002.getClass(), "lastPlayMode", -1317015934);
        setIntField(term242002, term242002.getClass(), "lastPlaceId", -1071966167);
        setField(term242002, term242002.getClass(), "lastPlaceName", "mNmYtNfYWV");
        setIntField(term242002, term242002.getClass(), "lastAllNetId", -1326585540);
        setIntField(term242002, term242002.getClass(), "lastRegionId", 597942176);
        setField(term242002, term242002.getClass(), "lastRegionName", "yIaDArVQip");
        setField(term242002, term242002.getClass(), "lastClientId", "QoFWtaCVyb");
        setField(term242002, term242002.getClass(), "lastCountryCode", "HjAPJUaLTX");
        setIntField(term242002, term242002.getClass(), "lastSelectEMoney", 2668161);
        setIntField(term242002, term242002.getClass(), "lastSelectTicket", 220870605);
        setIntField(term242002, term242002.getClass(), "lastSelectCourse", -1854813543);
        setIntField(term242002, term242002.getClass(), "lastCountCourse", -2144619065);
        setField(term242002, term242002.getClass(), "firstGameId", "DNZRxHzfUW");
        setField(term242002, term242002.getClass(), "firstRomVersion", "RFTLcXaXOf");
        setField(term242002, term242002.getClass(), "firstDataVersion", "RdDqdChRRF");
        setField(term242002, term242002.getClass(), "firstPlayDate", "pchpUleqKe");
        setField(term242002, term242002.getClass(), "compatibleCmVersion", "VICIPgrdFz");
        setField(term242002, term242002.getClass(), "dailyBonusDate", "JKiUJuSwov");
        setField(term242002, term242002.getClass(), "dailyCourseBonusDate", "axHXnsAsPO");
        setField(term242002, term242002.getClass(), "lastPairLoginDate", "QYbbRPmFfv");
        setField(term242002, term242002.getClass(), "lastTrialPlayDate", "jHkmYGgAnp");
        setIntField(term242002, term242002.getClass(), "playVsCount", -1902391570);
        setIntField(term242002, term242002.getClass(), "playSyncCount", -1921725396);
        setIntField(term242002, term242002.getClass(), "winCount", 1294409779);
        setIntField(term242002, term242002.getClass(), "helpCount", 985108178);
        setIntField(term242002, term242002.getClass(), "comboCount", -1970607608);
        setLongField(term242002, term242002.getClass(), "totalDeluxscore", 3673761578182276432L);
        setLongField(term242002, term242002.getClass(), "totalBasicDeluxscore", -2797161149378121567L);
        setLongField(term242002, term242002.getClass(), "totalAdvancedDeluxscore", -2741445770771557582L);
        setLongField(term242002, term242002.getClass(), "totalExpertDeluxscore", -1907164746362787143L);
        setLongField(term242002, term242002.getClass(), "totalMasterDeluxscore", -6932932678731581869L);
        setLongField(term242002, term242002.getClass(), "totalReMasterDeluxscore", -361273100569274171L);
        setIntField(term242002, term242002.getClass(), "totalSync", -951908827);
        setIntField(term242002, term242002.getClass(), "totalBasicSync", -1764618187);
        setIntField(term242002, term242002.getClass(), "totalAdvancedSync", 2031203708);
        setIntField(term242002, term242002.getClass(), "totalExpertSync", -1098979156);
        setIntField(term242002, term242002.getClass(), "totalMasterSync", 888826418);
        setIntField(term242002, term242002.getClass(), "totalReMasterSync", -2138902791);
        setLongField(term242002, term242002.getClass(), "totalAchievement", -127676767722402161L);
        setLongField(term242002, term242002.getClass(), "totalBasicAchievement", -6122674240351504365L);
        setLongField(term242002, term242002.getClass(), "totalAdvancedAchievement", -4190940775460584795L);
        setLongField(term242002, term242002.getClass(), "totalExpertAchievement", 4734698116076527420L);
        setLongField(term242002, term242002.getClass(), "totalMasterAchievement", 3605608190830892058L);
        setLongField(term242002, term242002.getClass(), "totalReMasterAchievement", -1160483559554539863L);
        setLongField(term242002, term242002.getClass(), "playerOldRating", 3923717319352704348L);
        setLongField(term242002, term242002.getClass(), "playerNewRating", -6609311301660711591L);
        setIntField(term242002, term242002.getClass(), "banState", 1965540679);
        setLongField(term242002, term242002.getClass(), "dateTime", 3434818702497189419L);
        term242359 = new Integer(654663878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term242359;
        callMethod(klass, "setPlateId", argTypes, term242002, args);
    }

};


