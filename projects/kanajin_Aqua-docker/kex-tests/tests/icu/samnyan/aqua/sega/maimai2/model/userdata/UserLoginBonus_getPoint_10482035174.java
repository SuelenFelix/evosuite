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

public class UserLoginBonus_getPoint_10482035174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46176;

    public UserLoginBonus_getPoint_10482035174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46182 = new Long(-6723783499250797216L);
        Integer term46245 = new Integer(-1518419301);
        Integer term46247 = new Integer(674879025);
        ArrayList term46243 = new ArrayList();
        ((ArrayList) term46243).add(term46245);
        ((ArrayList) term46243).add(term46247);
        Integer term46253 = new Integer(-1538936030);
        Integer term46255 = new Integer(-752870423);
        Integer term46257 = new Integer(-1698809299);
        Integer term46259 = new Integer(401512128);
        Integer term46261 = new Integer(-2069930777);
        Integer term46263 = new Integer(1543696412);
        Integer term46265 = new Integer(-1385748168);
        Integer term46267 = new Integer(-270592367);
        ArrayList term46251 = new ArrayList();
        ((ArrayList) term46251).add(term46253);
        ((ArrayList) term46251).add(term46255);
        ((ArrayList) term46251).add(term46257);
        ((ArrayList) term46251).add(term46259);
        ((ArrayList) term46251).add(term46261);
        ((ArrayList) term46251).add(term46263);
        ((ArrayList) term46251).add(term46265);
        ((ArrayList) term46251).add(term46267);
        term46176 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus"));
        Object term46178 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term46180 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term46196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46201 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46211 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term46176, term46176.getClass(), "id", 789661870469773196L);
        setLongField(term46178, term46178.getClass(), "id", -3484599398786804700L);
        setLongField(term46180, term46180.getClass(), "id", -5259338558309636239L);
        setField(term46180, term46180.getClass(), "extId", term46182);
        setField(term46180, term46180.getClass(), "luid", "OZGyrUPedG");
        setIntField(term46197, term46197.getClass(), "year", 2010);
        setShortField(term46197, term46197.getClass(), "month", (short) 1);
        setShortField(term46197, term46197.getClass(), "day", (short) 10);
        setField(term46196, term46196.getClass(), "date", term46197);
        setByteField(term46201, term46201.getClass(), "hour", (byte) 12);
        setByteField(term46201, term46201.getClass(), "minute", (byte) 46);
        setByteField(term46201, term46201.getClass(), "second", (byte) 5);
        setIntField(term46201, term46201.getClass(), "nano", 540440953);
        setField(term46196, term46196.getClass(), "time", term46201);
        setField(term46180, term46180.getClass(), "registerTime", term46196);
        setIntField(term46207, term46207.getClass(), "year", 2028);
        setShortField(term46207, term46207.getClass(), "month", (short) 5);
        setShortField(term46207, term46207.getClass(), "day", (short) 7);
        setField(term46206, term46206.getClass(), "date", term46207);
        setByteField(term46211, term46211.getClass(), "hour", (byte) 7);
        setByteField(term46211, term46211.getClass(), "minute", (byte) 48);
        setByteField(term46211, term46211.getClass(), "second", (byte) 4);
        setIntField(term46211, term46211.getClass(), "nano", 380425174);
        setField(term46206, term46206.getClass(), "time", term46211);
        setField(term46180, term46180.getClass(), "accessTime", term46206);
        setField(term46178, term46178.getClass(), "card", term46180);
        setField(term46178, term46178.getClass(), "userName", "GAxMzRqmXU");
        setIntField(term46178, term46178.getClass(), "isNetMember", 1509604);
        setIntField(term46178, term46178.getClass(), "iconId", 516929449);
        setIntField(term46178, term46178.getClass(), "plateId", 86726117);
        setIntField(term46178, term46178.getClass(), "titleId", -142908686);
        setIntField(term46178, term46178.getClass(), "partnerId", 780437076);
        setIntField(term46178, term46178.getClass(), "frameId", -1290991126);
        setIntField(term46178, term46178.getClass(), "selectMapId", 1579548215);
        setIntField(term46178, term46178.getClass(), "totalAwake", 518866176);
        setIntField(term46178, term46178.getClass(), "gradeRating", -1352533284);
        setIntField(term46178, term46178.getClass(), "musicRating", -149022151);
        setIntField(term46178, term46178.getClass(), "playerRating", -2128082017);
        setIntField(term46178, term46178.getClass(), "highestRating", -626860638);
        setIntField(term46178, term46178.getClass(), "gradeRank", 969445811);
        setIntField(term46178, term46178.getClass(), "classRank", -1232355383);
        setIntField(term46178, term46178.getClass(), "courseRank", 1599985157);
        setField(term46178, term46178.getClass(), "charaSlot", term46243);
        setField(term46178, term46178.getClass(), "charaLockSlot", term46251);
        setLongField(term46178, term46178.getClass(), "contentBit", -94386090490716219L);
        setIntField(term46178, term46178.getClass(), "playCount", 80735812);
        setField(term46178, term46178.getClass(), "eventWatchedDate", "XMhUDGKSWO");
        setField(term46178, term46178.getClass(), "lastGameId", "jLgzxtuvVo");
        setField(term46178, term46178.getClass(), "lastRomVersion", "wmmxjOkPnH");
        setField(term46178, term46178.getClass(), "lastDataVersion", "jgRohUQWxJ");
        setField(term46178, term46178.getClass(), "lastLoginDate", "CJlAiZDIQO");
        setField(term46178, term46178.getClass(), "lastPlayDate", "osgWaTBVoE");
        setIntField(term46178, term46178.getClass(), "lastPlayCredit", 1616706735);
        setIntField(term46178, term46178.getClass(), "lastPlayMode", -445244024);
        setIntField(term46178, term46178.getClass(), "lastPlaceId", -1836568689);
        setField(term46178, term46178.getClass(), "lastPlaceName", "mvkMYcgAod");
        setIntField(term46178, term46178.getClass(), "lastAllNetId", 367237282);
        setIntField(term46178, term46178.getClass(), "lastRegionId", 1917343242);
        setField(term46178, term46178.getClass(), "lastRegionName", "esbhDGQDgF");
        setField(term46178, term46178.getClass(), "lastClientId", "tKlyiBloWu");
        setField(term46178, term46178.getClass(), "lastCountryCode", "uIgRFcwqLd");
        setIntField(term46178, term46178.getClass(), "lastSelectEMoney", 504552083);
        setIntField(term46178, term46178.getClass(), "lastSelectTicket", -714955265);
        setIntField(term46178, term46178.getClass(), "lastSelectCourse", 1191317081);
        setIntField(term46178, term46178.getClass(), "lastCountCourse", -1321805207);
        setField(term46178, term46178.getClass(), "firstGameId", "AvdsiEyCve");
        setField(term46178, term46178.getClass(), "firstRomVersion", "XMArCaVAEc");
        setField(term46178, term46178.getClass(), "firstDataVersion", "URWnZtbrQH");
        setField(term46178, term46178.getClass(), "firstPlayDate", "hpTAdtnQku");
        setField(term46178, term46178.getClass(), "compatibleCmVersion", "GdMAXFBAtl");
        setField(term46178, term46178.getClass(), "dailyBonusDate", "KWVRAlcIqd");
        setField(term46178, term46178.getClass(), "dailyCourseBonusDate", "GeVOqtDiGv");
        setField(term46178, term46178.getClass(), "lastPairLoginDate", "vbRAJCwftU");
        setField(term46178, term46178.getClass(), "lastTrialPlayDate", "baJbjUImxp");
        setIntField(term46178, term46178.getClass(), "playVsCount", 1827794411);
        setIntField(term46178, term46178.getClass(), "playSyncCount", -1377700263);
        setIntField(term46178, term46178.getClass(), "winCount", -38722118);
        setIntField(term46178, term46178.getClass(), "helpCount", 1123663642);
        setIntField(term46178, term46178.getClass(), "comboCount", 404156777);
        setLongField(term46178, term46178.getClass(), "totalDeluxscore", -5539140353886034290L);
        setLongField(term46178, term46178.getClass(), "totalBasicDeluxscore", -2993798135603613656L);
        setLongField(term46178, term46178.getClass(), "totalAdvancedDeluxscore", 7643902889687500887L);
        setLongField(term46178, term46178.getClass(), "totalExpertDeluxscore", 5801400276670793406L);
        setLongField(term46178, term46178.getClass(), "totalMasterDeluxscore", 750257143483156761L);
        setLongField(term46178, term46178.getClass(), "totalReMasterDeluxscore", -1357354750773482244L);
        setIntField(term46178, term46178.getClass(), "totalSync", 74684104);
        setIntField(term46178, term46178.getClass(), "totalBasicSync", 502851553);
        setIntField(term46178, term46178.getClass(), "totalAdvancedSync", -1149654883);
        setIntField(term46178, term46178.getClass(), "totalExpertSync", -346017809);
        setIntField(term46178, term46178.getClass(), "totalMasterSync", 1922136769);
        setIntField(term46178, term46178.getClass(), "totalReMasterSync", 1253469190);
        setLongField(term46178, term46178.getClass(), "totalAchievement", -1493241070032348830L);
        setLongField(term46178, term46178.getClass(), "totalBasicAchievement", -2261267969370273698L);
        setLongField(term46178, term46178.getClass(), "totalAdvancedAchievement", -6265268170103538784L);
        setLongField(term46178, term46178.getClass(), "totalExpertAchievement", -6478060368064484690L);
        setLongField(term46178, term46178.getClass(), "totalMasterAchievement", 2358294751965878279L);
        setLongField(term46178, term46178.getClass(), "totalReMasterAchievement", 8600922426578985605L);
        setLongField(term46178, term46178.getClass(), "playerOldRating", -3701629604936783176L);
        setLongField(term46178, term46178.getClass(), "playerNewRating", 2577903134840885266L);
        setIntField(term46178, term46178.getClass(), "banState", -92568219);
        setLongField(term46178, term46178.getClass(), "dateTime", -4179615237632495585L);
        setField(term46176, term46176.getClass(), "user", term46178);
        setIntField(term46176, term46176.getClass(), "bonusId", 647226080);
        setIntField(term46176, term46176.getClass(), "point", -1031047832);
        setBooleanField(term46176, term46176.getClass(), "isCurrent", true);
        setBooleanField(term46176, term46176.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term46176, args);
    }

};


