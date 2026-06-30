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

public class UserDetail_setDailyCourseBonusDate_994450580125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266251;

    public UserDetail_setDailyCourseBonusDate_994450580125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term266255 = new Long(-5903549884298836343L);
        Integer term266318 = new Integer(494744342);
        Integer term266320 = new Integer(-1662933444);
        ArrayList term266316 = new ArrayList();
        ((ArrayList) term266316).add(term266318);
        ((ArrayList) term266316).add(term266320);
        Integer term266326 = new Integer(1648583497);
        ArrayList term266324 = new ArrayList();
        ((ArrayList) term266324).add(term266326);
        term266251 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term266253 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term266269 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266270 = newInstance(Class.forName("java.time.LocalDate"));
        Object term266274 = newInstance(Class.forName("java.time.LocalTime"));
        Object term266279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term266284 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term266251, term266251.getClass(), "id", -6121524341537237225L);
        setLongField(term266253, term266253.getClass(), "id", 3822005845968497540L);
        setField(term266253, term266253.getClass(), "extId", term266255);
        setField(term266253, term266253.getClass(), "luid", "SDJYcRQAkM");
        setIntField(term266270, term266270.getClass(), "year", 2027);
        setShortField(term266270, term266270.getClass(), "month", (short) 6);
        setShortField(term266270, term266270.getClass(), "day", (short) 13);
        setField(term266269, term266269.getClass(), "date", term266270);
        setByteField(term266274, term266274.getClass(), "hour", (byte) 4);
        setByteField(term266274, term266274.getClass(), "minute", (byte) 7);
        setByteField(term266274, term266274.getClass(), "second", (byte) 55);
        setIntField(term266274, term266274.getClass(), "nano", 288212169);
        setField(term266269, term266269.getClass(), "time", term266274);
        setField(term266253, term266253.getClass(), "registerTime", term266269);
        setIntField(term266280, term266280.getClass(), "year", 2016);
        setShortField(term266280, term266280.getClass(), "month", (short) 8);
        setShortField(term266280, term266280.getClass(), "day", (short) 20);
        setField(term266279, term266279.getClass(), "date", term266280);
        setByteField(term266284, term266284.getClass(), "hour", (byte) 15);
        setByteField(term266284, term266284.getClass(), "minute", (byte) 59);
        setByteField(term266284, term266284.getClass(), "second", (byte) 24);
        setIntField(term266284, term266284.getClass(), "nano", 817884348);
        setField(term266279, term266279.getClass(), "time", term266284);
        setField(term266253, term266253.getClass(), "accessTime", term266279);
        setField(term266251, term266251.getClass(), "card", term266253);
        setField(term266251, term266251.getClass(), "userName", "UKWTVmTWAK");
        setIntField(term266251, term266251.getClass(), "isNetMember", 823553858);
        setIntField(term266251, term266251.getClass(), "iconId", -1875267671);
        setIntField(term266251, term266251.getClass(), "plateId", 1210180896);
        setIntField(term266251, term266251.getClass(), "titleId", -856709958);
        setIntField(term266251, term266251.getClass(), "partnerId", 1421075755);
        setIntField(term266251, term266251.getClass(), "frameId", 583296992);
        setIntField(term266251, term266251.getClass(), "selectMapId", 303697112);
        setIntField(term266251, term266251.getClass(), "totalAwake", 555770564);
        setIntField(term266251, term266251.getClass(), "gradeRating", 715239982);
        setIntField(term266251, term266251.getClass(), "musicRating", 615055377);
        setIntField(term266251, term266251.getClass(), "playerRating", -1316216263);
        setIntField(term266251, term266251.getClass(), "highestRating", 1082693506);
        setIntField(term266251, term266251.getClass(), "gradeRank", 1054381018);
        setIntField(term266251, term266251.getClass(), "classRank", -220010763);
        setIntField(term266251, term266251.getClass(), "courseRank", 1856047628);
        setField(term266251, term266251.getClass(), "charaSlot", term266316);
        setField(term266251, term266251.getClass(), "charaLockSlot", term266324);
        setLongField(term266251, term266251.getClass(), "contentBit", -6738606190759704815L);
        setIntField(term266251, term266251.getClass(), "playCount", -2140050714);
        setField(term266251, term266251.getClass(), "eventWatchedDate", "twYXqgjRmy");
        setField(term266251, term266251.getClass(), "lastGameId", "HFaAuAnTOn");
        setField(term266251, term266251.getClass(), "lastRomVersion", "EJiGWkJgKE");
        setField(term266251, term266251.getClass(), "lastDataVersion", "MJovsjjSeM");
        setField(term266251, term266251.getClass(), "lastLoginDate", "YONpdIaYPl");
        setField(term266251, term266251.getClass(), "lastPlayDate", "xQwJTVPqIz");
        setIntField(term266251, term266251.getClass(), "lastPlayCredit", 1643490260);
        setIntField(term266251, term266251.getClass(), "lastPlayMode", 160723704);
        setIntField(term266251, term266251.getClass(), "lastPlaceId", 890205565);
        setField(term266251, term266251.getClass(), "lastPlaceName", "VkVNOcUvlO");
        setIntField(term266251, term266251.getClass(), "lastAllNetId", -1174535298);
        setIntField(term266251, term266251.getClass(), "lastRegionId", -625809978);
        setField(term266251, term266251.getClass(), "lastRegionName", "DVBrSfNLwF");
        setField(term266251, term266251.getClass(), "lastClientId", "QeeIOyYsmx");
        setField(term266251, term266251.getClass(), "lastCountryCode", "tREUVNKzCo");
        setIntField(term266251, term266251.getClass(), "lastSelectEMoney", -724335844);
        setIntField(term266251, term266251.getClass(), "lastSelectTicket", 1576614706);
        setIntField(term266251, term266251.getClass(), "lastSelectCourse", -1847432199);
        setIntField(term266251, term266251.getClass(), "lastCountCourse", 1319848087);
        setField(term266251, term266251.getClass(), "firstGameId", "oMVmfIrXEu");
        setField(term266251, term266251.getClass(), "firstRomVersion", "wpVzLLfXkK");
        setField(term266251, term266251.getClass(), "firstDataVersion", "SEPrgtTBVv");
        setField(term266251, term266251.getClass(), "firstPlayDate", "vtJRIanbwg");
        setField(term266251, term266251.getClass(), "compatibleCmVersion", "JbrLDrpoAv");
        setField(term266251, term266251.getClass(), "dailyBonusDate", "kLAYfNPTYi");
        setField(term266251, term266251.getClass(), "dailyCourseBonusDate", "bgvEvjROsI");
        setField(term266251, term266251.getClass(), "lastPairLoginDate", "dDgTwPNnoh");
        setField(term266251, term266251.getClass(), "lastTrialPlayDate", "kMDHgEGnfj");
        setIntField(term266251, term266251.getClass(), "playVsCount", 556059164);
        setIntField(term266251, term266251.getClass(), "playSyncCount", -685986401);
        setIntField(term266251, term266251.getClass(), "winCount", -379269911);
        setIntField(term266251, term266251.getClass(), "helpCount", 846636764);
        setIntField(term266251, term266251.getClass(), "comboCount", -88201260);
        setLongField(term266251, term266251.getClass(), "totalDeluxscore", -455586029947611012L);
        setLongField(term266251, term266251.getClass(), "totalBasicDeluxscore", 2537265421354641400L);
        setLongField(term266251, term266251.getClass(), "totalAdvancedDeluxscore", -3275824126621175157L);
        setLongField(term266251, term266251.getClass(), "totalExpertDeluxscore", 1556960302254833608L);
        setLongField(term266251, term266251.getClass(), "totalMasterDeluxscore", -152428419683283784L);
        setLongField(term266251, term266251.getClass(), "totalReMasterDeluxscore", 8961388789119739174L);
        setIntField(term266251, term266251.getClass(), "totalSync", -292257128);
        setIntField(term266251, term266251.getClass(), "totalBasicSync", -577634614);
        setIntField(term266251, term266251.getClass(), "totalAdvancedSync", -1041538419);
        setIntField(term266251, term266251.getClass(), "totalExpertSync", -112544545);
        setIntField(term266251, term266251.getClass(), "totalMasterSync", -1426710489);
        setIntField(term266251, term266251.getClass(), "totalReMasterSync", 815446082);
        setLongField(term266251, term266251.getClass(), "totalAchievement", 3629112577877265594L);
        setLongField(term266251, term266251.getClass(), "totalBasicAchievement", -4857907760514614403L);
        setLongField(term266251, term266251.getClass(), "totalAdvancedAchievement", -1261722990878835267L);
        setLongField(term266251, term266251.getClass(), "totalExpertAchievement", 4942260656603647338L);
        setLongField(term266251, term266251.getClass(), "totalMasterAchievement", -5768952721115002011L);
        setLongField(term266251, term266251.getClass(), "totalReMasterAchievement", 161623609117714777L);
        setLongField(term266251, term266251.getClass(), "playerOldRating", 8645459934108035346L);
        setLongField(term266251, term266251.getClass(), "playerNewRating", -5363902041096313744L);
        setIntField(term266251, term266251.getClass(), "banState", 856438779);
        setLongField(term266251, term266251.getClass(), "dateTime", 5317340010171574630L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "inHvGjtHrL";
        callMethod(klass, "setDailyCourseBonusDate", argTypes, term266251, args);
    }

};


