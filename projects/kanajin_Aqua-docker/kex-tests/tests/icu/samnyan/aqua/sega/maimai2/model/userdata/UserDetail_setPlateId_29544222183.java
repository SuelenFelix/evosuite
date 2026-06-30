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

public class UserDetail_setPlateId_29544222183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242057;
     Object term242414;

    public UserDetail_setPlateId_29544222183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term242061 = new Long(3453457027014743006L);
        Integer term242124 = new Integer(-1058283823);
        Integer term242126 = new Integer(-1620576583);
        ArrayList term242122 = new ArrayList();
        ((ArrayList) term242122).add(term242124);
        ((ArrayList) term242122).add(term242126);
        Integer term242132 = new Integer(-1365748841);
        Integer term242134 = new Integer(1223391792);
        Integer term242136 = new Integer(-1134943583);
        Integer term242138 = new Integer(-694277686);
        Integer term242140 = new Integer(-2044994445);
        Integer term242142 = new Integer(-883941371);
        Integer term242144 = new Integer(-1545047968);
        ArrayList term242130 = new ArrayList();
        ((ArrayList) term242130).add(term242132);
        ((ArrayList) term242130).add(term242134);
        ((ArrayList) term242130).add(term242136);
        ((ArrayList) term242130).add(term242138);
        ((ArrayList) term242130).add(term242140);
        ((ArrayList) term242130).add(term242142);
        ((ArrayList) term242130).add(term242144);
        term242057 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term242059 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term242075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term242076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term242080 = newInstance(Class.forName("java.time.LocalTime"));
        Object term242085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term242086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term242090 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term242057, term242057.getClass(), "id", 556286024289197121L);
        setLongField(term242059, term242059.getClass(), "id", -8281643980980259313L);
        setField(term242059, term242059.getClass(), "extId", term242061);
        setField(term242059, term242059.getClass(), "luid", "SNxxiwGooS");
        setIntField(term242076, term242076.getClass(), "year", 2022);
        setShortField(term242076, term242076.getClass(), "month", (short) 9);
        setShortField(term242076, term242076.getClass(), "day", (short) 29);
        setField(term242075, term242075.getClass(), "date", term242076);
        setByteField(term242080, term242080.getClass(), "hour", (byte) 15);
        setByteField(term242080, term242080.getClass(), "minute", (byte) 41);
        setByteField(term242080, term242080.getClass(), "second", (byte) 55);
        setIntField(term242080, term242080.getClass(), "nano", 811723850);
        setField(term242075, term242075.getClass(), "time", term242080);
        setField(term242059, term242059.getClass(), "registerTime", term242075);
        setIntField(term242086, term242086.getClass(), "year", 2017);
        setShortField(term242086, term242086.getClass(), "month", (short) 3);
        setShortField(term242086, term242086.getClass(), "day", (short) 7);
        setField(term242085, term242085.getClass(), "date", term242086);
        setByteField(term242090, term242090.getClass(), "hour", (byte) 17);
        setByteField(term242090, term242090.getClass(), "minute", (byte) 3);
        setByteField(term242090, term242090.getClass(), "second", (byte) 1);
        setIntField(term242090, term242090.getClass(), "nano", 107604440);
        setField(term242085, term242085.getClass(), "time", term242090);
        setField(term242059, term242059.getClass(), "accessTime", term242085);
        setField(term242057, term242057.getClass(), "card", term242059);
        setField(term242057, term242057.getClass(), "userName", "uACfzGuzLf");
        setIntField(term242057, term242057.getClass(), "isNetMember", -731775853);
        setIntField(term242057, term242057.getClass(), "iconId", -1250448247);
        setIntField(term242057, term242057.getClass(), "plateId", 292160669);
        setIntField(term242057, term242057.getClass(), "titleId", 738714500);
        setIntField(term242057, term242057.getClass(), "partnerId", -1464992742);
        setIntField(term242057, term242057.getClass(), "frameId", 1695203610);
        setIntField(term242057, term242057.getClass(), "selectMapId", 1221449396);
        setIntField(term242057, term242057.getClass(), "totalAwake", 1420622683);
        setIntField(term242057, term242057.getClass(), "gradeRating", 1526408522);
        setIntField(term242057, term242057.getClass(), "musicRating", 128258005);
        setIntField(term242057, term242057.getClass(), "playerRating", 1223583997);
        setIntField(term242057, term242057.getClass(), "highestRating", -1876769614);
        setIntField(term242057, term242057.getClass(), "gradeRank", -1214190971);
        setIntField(term242057, term242057.getClass(), "classRank", 197274645);
        setIntField(term242057, term242057.getClass(), "courseRank", 2099971798);
        setField(term242057, term242057.getClass(), "charaSlot", term242122);
        setField(term242057, term242057.getClass(), "charaLockSlot", term242130);
        setLongField(term242057, term242057.getClass(), "contentBit", -4020916976775387591L);
        setIntField(term242057, term242057.getClass(), "playCount", 1826998217);
        setField(term242057, term242057.getClass(), "eventWatchedDate", "GhNtnTcGqj");
        setField(term242057, term242057.getClass(), "lastGameId", "llQSWhVMIU");
        setField(term242057, term242057.getClass(), "lastRomVersion", "obVHSLzFkr");
        setField(term242057, term242057.getClass(), "lastDataVersion", "qPqtpUGEBt");
        setField(term242057, term242057.getClass(), "lastLoginDate", "LjpmgLxxAN");
        setField(term242057, term242057.getClass(), "lastPlayDate", "axbOsAnkgV");
        setIntField(term242057, term242057.getClass(), "lastPlayCredit", -41129313);
        setIntField(term242057, term242057.getClass(), "lastPlayMode", -1317015934);
        setIntField(term242057, term242057.getClass(), "lastPlaceId", -1071966167);
        setField(term242057, term242057.getClass(), "lastPlaceName", "mNmYtNfYWV");
        setIntField(term242057, term242057.getClass(), "lastAllNetId", -1326585540);
        setIntField(term242057, term242057.getClass(), "lastRegionId", 597942176);
        setField(term242057, term242057.getClass(), "lastRegionName", "yIaDArVQip");
        setField(term242057, term242057.getClass(), "lastClientId", "QoFWtaCVyb");
        setField(term242057, term242057.getClass(), "lastCountryCode", "HjAPJUaLTX");
        setIntField(term242057, term242057.getClass(), "lastSelectEMoney", 2668161);
        setIntField(term242057, term242057.getClass(), "lastSelectTicket", 220870605);
        setIntField(term242057, term242057.getClass(), "lastSelectCourse", -1854813543);
        setIntField(term242057, term242057.getClass(), "lastCountCourse", -2144619065);
        setField(term242057, term242057.getClass(), "firstGameId", "DNZRxHzfUW");
        setField(term242057, term242057.getClass(), "firstRomVersion", "RFTLcXaXOf");
        setField(term242057, term242057.getClass(), "firstDataVersion", "RdDqdChRRF");
        setField(term242057, term242057.getClass(), "firstPlayDate", "pchpUleqKe");
        setField(term242057, term242057.getClass(), "compatibleCmVersion", "VICIPgrdFz");
        setField(term242057, term242057.getClass(), "dailyBonusDate", "JKiUJuSwov");
        setField(term242057, term242057.getClass(), "dailyCourseBonusDate", "axHXnsAsPO");
        setField(term242057, term242057.getClass(), "lastPairLoginDate", "QYbbRPmFfv");
        setField(term242057, term242057.getClass(), "lastTrialPlayDate", "jHkmYGgAnp");
        setIntField(term242057, term242057.getClass(), "playVsCount", -1902391570);
        setIntField(term242057, term242057.getClass(), "playSyncCount", -1921725396);
        setIntField(term242057, term242057.getClass(), "winCount", 1294409779);
        setIntField(term242057, term242057.getClass(), "helpCount", 985108178);
        setIntField(term242057, term242057.getClass(), "comboCount", -1970607608);
        setLongField(term242057, term242057.getClass(), "totalDeluxscore", 3673761578182276432L);
        setLongField(term242057, term242057.getClass(), "totalBasicDeluxscore", -2797161149378121567L);
        setLongField(term242057, term242057.getClass(), "totalAdvancedDeluxscore", -2741445770771557582L);
        setLongField(term242057, term242057.getClass(), "totalExpertDeluxscore", -1907164746362787143L);
        setLongField(term242057, term242057.getClass(), "totalMasterDeluxscore", -6932932678731581869L);
        setLongField(term242057, term242057.getClass(), "totalReMasterDeluxscore", -361273100569274171L);
        setIntField(term242057, term242057.getClass(), "totalSync", -951908827);
        setIntField(term242057, term242057.getClass(), "totalBasicSync", -1764618187);
        setIntField(term242057, term242057.getClass(), "totalAdvancedSync", 2031203708);
        setIntField(term242057, term242057.getClass(), "totalExpertSync", -1098979156);
        setIntField(term242057, term242057.getClass(), "totalMasterSync", 888826418);
        setIntField(term242057, term242057.getClass(), "totalReMasterSync", -2138902791);
        setLongField(term242057, term242057.getClass(), "totalAchievement", -127676767722402161L);
        setLongField(term242057, term242057.getClass(), "totalBasicAchievement", -6122674240351504365L);
        setLongField(term242057, term242057.getClass(), "totalAdvancedAchievement", -4190940775460584795L);
        setLongField(term242057, term242057.getClass(), "totalExpertAchievement", 4734698116076527420L);
        setLongField(term242057, term242057.getClass(), "totalMasterAchievement", 3605608190830892058L);
        setLongField(term242057, term242057.getClass(), "totalReMasterAchievement", -1160483559554539863L);
        setLongField(term242057, term242057.getClass(), "playerOldRating", 3923717319352704348L);
        setLongField(term242057, term242057.getClass(), "playerNewRating", -6609311301660711591L);
        setIntField(term242057, term242057.getClass(), "banState", 1965540679);
        setLongField(term242057, term242057.getClass(), "dateTime", 3434818702497189419L);
        term242414 = new Integer(654663878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term242414;
        callMethod(klass, "setPlateId", argTypes, term242057, args);
    }

};


