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

public class UserDetail_getDailyCourseBonusDate_178333472447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4256145;

    public UserDetail_getDailyCourseBonusDate_178333472447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4256149 = new Long(7801123516239721316L);
        Integer term4256212 = new Integer(80749910);
        Integer term4256214 = new Integer(-1917030847);
        Integer term4256216 = new Integer(-1678066921);
        Integer term4256218 = new Integer(1398239082);
        Integer term4256220 = new Integer(-822609904);
        ArrayList term4256210 = new ArrayList();
        ((ArrayList) term4256210).add(term4256212);
        ((ArrayList) term4256210).add(term4256214);
        ((ArrayList) term4256210).add(term4256216);
        ((ArrayList) term4256210).add(term4256218);
        ((ArrayList) term4256210).add(term4256220);
        Integer term4256226 = new Integer(1496179101);
        Integer term4256228 = new Integer(-830145650);
        Integer term4256230 = new Integer(163814430);
        Integer term4256232 = new Integer(118692552);
        Integer term4256234 = new Integer(-99466254);
        Integer term4256236 = new Integer(-1474933209);
        ArrayList term4256224 = new ArrayList();
        ((ArrayList) term4256224).add(term4256226);
        ((ArrayList) term4256224).add(term4256228);
        ((ArrayList) term4256224).add(term4256230);
        ((ArrayList) term4256224).add(term4256232);
        ((ArrayList) term4256224).add(term4256234);
        ((ArrayList) term4256224).add(term4256236);
        term4256145 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4256147 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4256163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4256164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4256168 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4256173 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4256174 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4256178 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4256145, term4256145.getClass(), "id", -4686942878952355233L);
        setLongField(term4256147, term4256147.getClass(), "id", -6905879000384669526L);
        setField(term4256147, term4256147.getClass(), "extId", term4256149);
        setField(term4256147, term4256147.getClass(), "luid", "ltbiRCuBJV");
        setIntField(term4256164, term4256164.getClass(), "year", 2023);
        setShortField(term4256164, term4256164.getClass(), "month", (short) 3);
        setShortField(term4256164, term4256164.getClass(), "day", (short) 12);
        setField(term4256163, term4256163.getClass(), "date", term4256164);
        setByteField(term4256168, term4256168.getClass(), "hour", (byte) 23);
        setByteField(term4256168, term4256168.getClass(), "minute", (byte) 7);
        setByteField(term4256168, term4256168.getClass(), "second", (byte) 0);
        setIntField(term4256168, term4256168.getClass(), "nano", 834222275);
        setField(term4256163, term4256163.getClass(), "time", term4256168);
        setField(term4256147, term4256147.getClass(), "registerTime", term4256163);
        setIntField(term4256174, term4256174.getClass(), "year", 2017);
        setShortField(term4256174, term4256174.getClass(), "month", (short) 2);
        setShortField(term4256174, term4256174.getClass(), "day", (short) 10);
        setField(term4256173, term4256173.getClass(), "date", term4256174);
        setByteField(term4256178, term4256178.getClass(), "hour", (byte) 0);
        setByteField(term4256178, term4256178.getClass(), "minute", (byte) 1);
        setByteField(term4256178, term4256178.getClass(), "second", (byte) 22);
        setIntField(term4256178, term4256178.getClass(), "nano", 857919643);
        setField(term4256173, term4256173.getClass(), "time", term4256178);
        setField(term4256147, term4256147.getClass(), "accessTime", term4256173);
        setField(term4256145, term4256145.getClass(), "card", term4256147);
        setField(term4256145, term4256145.getClass(), "userName", "OPRBXthTIz");
        setIntField(term4256145, term4256145.getClass(), "isNetMember", -1861133915);
        setIntField(term4256145, term4256145.getClass(), "iconId", -619414111);
        setIntField(term4256145, term4256145.getClass(), "plateId", 1786927671);
        setIntField(term4256145, term4256145.getClass(), "titleId", -407726072);
        setIntField(term4256145, term4256145.getClass(), "partnerId", 36956859);
        setIntField(term4256145, term4256145.getClass(), "frameId", 1375420599);
        setIntField(term4256145, term4256145.getClass(), "selectMapId", -1142056271);
        setIntField(term4256145, term4256145.getClass(), "totalAwake", -253275444);
        setIntField(term4256145, term4256145.getClass(), "gradeRating", -254252403);
        setIntField(term4256145, term4256145.getClass(), "musicRating", 955275305);
        setIntField(term4256145, term4256145.getClass(), "playerRating", -1064185090);
        setIntField(term4256145, term4256145.getClass(), "highestRating", 595108591);
        setIntField(term4256145, term4256145.getClass(), "gradeRank", 321800670);
        setIntField(term4256145, term4256145.getClass(), "classRank", -268924155);
        setIntField(term4256145, term4256145.getClass(), "courseRank", 1883203691);
        setField(term4256145, term4256145.getClass(), "charaSlot", term4256210);
        setField(term4256145, term4256145.getClass(), "charaLockSlot", term4256224);
        setLongField(term4256145, term4256145.getClass(), "contentBit", 6969983738655517821L);
        setIntField(term4256145, term4256145.getClass(), "playCount", 1691361441);
        setField(term4256145, term4256145.getClass(), "eventWatchedDate", "OwqEElcpZp");
        setField(term4256145, term4256145.getClass(), "lastGameId", "xrHZZpypoo");
        setField(term4256145, term4256145.getClass(), "lastRomVersion", "NMjqnogymI");
        setField(term4256145, term4256145.getClass(), "lastDataVersion", "TTsDUxSGJI");
        setField(term4256145, term4256145.getClass(), "lastLoginDate", "GOBnMoxdZK");
        setField(term4256145, term4256145.getClass(), "lastPlayDate", "CEliMLEXoe");
        setIntField(term4256145, term4256145.getClass(), "lastPlayCredit", -1283222151);
        setIntField(term4256145, term4256145.getClass(), "lastPlayMode", -931228949);
        setIntField(term4256145, term4256145.getClass(), "lastPlaceId", 1361381310);
        setField(term4256145, term4256145.getClass(), "lastPlaceName", "zQOhdaxJhb");
        setIntField(term4256145, term4256145.getClass(), "lastAllNetId", 905560623);
        setIntField(term4256145, term4256145.getClass(), "lastRegionId", 1041524581);
        setField(term4256145, term4256145.getClass(), "lastRegionName", "jcvEVAvnIO");
        setField(term4256145, term4256145.getClass(), "lastClientId", "BprdUHZaiF");
        setField(term4256145, term4256145.getClass(), "lastCountryCode", "icqYmxVOSQ");
        setIntField(term4256145, term4256145.getClass(), "lastSelectEMoney", 977995576);
        setIntField(term4256145, term4256145.getClass(), "lastSelectTicket", -1076814965);
        setIntField(term4256145, term4256145.getClass(), "lastSelectCourse", -1711098419);
        setIntField(term4256145, term4256145.getClass(), "lastCountCourse", 1204008791);
        setField(term4256145, term4256145.getClass(), "firstGameId", "FoMfsLVFtc");
        setField(term4256145, term4256145.getClass(), "firstRomVersion", "CryegsfmaC");
        setField(term4256145, term4256145.getClass(), "firstDataVersion", "GCudRELlkp");
        setField(term4256145, term4256145.getClass(), "firstPlayDate", "yPnyiaJDOm");
        setField(term4256145, term4256145.getClass(), "compatibleCmVersion", "aHbmIZYzRg");
        setField(term4256145, term4256145.getClass(), "dailyBonusDate", "GhVeUoQjUv");
        setField(term4256145, term4256145.getClass(), "dailyCourseBonusDate", "ahlFjcOkao");
        setField(term4256145, term4256145.getClass(), "lastPairLoginDate", "vPWzuhUBQU");
        setField(term4256145, term4256145.getClass(), "lastTrialPlayDate", "MYvJiVZRsZ");
        setIntField(term4256145, term4256145.getClass(), "playVsCount", -1905437081);
        setIntField(term4256145, term4256145.getClass(), "playSyncCount", -1532767290);
        setIntField(term4256145, term4256145.getClass(), "winCount", 516264853);
        setIntField(term4256145, term4256145.getClass(), "helpCount", 1437351528);
        setIntField(term4256145, term4256145.getClass(), "comboCount", 108032435);
        setLongField(term4256145, term4256145.getClass(), "totalDeluxscore", 6417131392204492705L);
        setLongField(term4256145, term4256145.getClass(), "totalBasicDeluxscore", -7768598062259548421L);
        setLongField(term4256145, term4256145.getClass(), "totalAdvancedDeluxscore", 744984756827304161L);
        setLongField(term4256145, term4256145.getClass(), "totalExpertDeluxscore", 1240807288373925495L);
        setLongField(term4256145, term4256145.getClass(), "totalMasterDeluxscore", 4677409261834042819L);
        setLongField(term4256145, term4256145.getClass(), "totalReMasterDeluxscore", 8071433840501700178L);
        setIntField(term4256145, term4256145.getClass(), "totalSync", -358509927);
        setIntField(term4256145, term4256145.getClass(), "totalBasicSync", -1380373553);
        setIntField(term4256145, term4256145.getClass(), "totalAdvancedSync", -1322294777);
        setIntField(term4256145, term4256145.getClass(), "totalExpertSync", -1094971649);
        setIntField(term4256145, term4256145.getClass(), "totalMasterSync", -1170288009);
        setIntField(term4256145, term4256145.getClass(), "totalReMasterSync", 937915763);
        setLongField(term4256145, term4256145.getClass(), "totalAchievement", 1003688145132441761L);
        setLongField(term4256145, term4256145.getClass(), "totalBasicAchievement", -1438338598921031500L);
        setLongField(term4256145, term4256145.getClass(), "totalAdvancedAchievement", -4485898507376433548L);
        setLongField(term4256145, term4256145.getClass(), "totalExpertAchievement", -4117817526601477422L);
        setLongField(term4256145, term4256145.getClass(), "totalMasterAchievement", -4949843256487444802L);
        setLongField(term4256145, term4256145.getClass(), "totalReMasterAchievement", 2208383804622041459L);
        setLongField(term4256145, term4256145.getClass(), "playerOldRating", 7583784560133232042L);
        setLongField(term4256145, term4256145.getClass(), "playerNewRating", -9025606004813944401L);
        setIntField(term4256145, term4256145.getClass(), "banState", -736929232);
        setLongField(term4256145, term4256145.getClass(), "dateTime", -3839167599058543504L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDailyCourseBonusDate", argTypes, term4256145, args);
    }

};


