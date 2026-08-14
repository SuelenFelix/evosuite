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

public class UserDetail_setDailyCourseBonusDate_994450580124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266196;

    public UserDetail_setDailyCourseBonusDate_994450580124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term266200 = new Long(-5903549884298836343L);
        Integer term266263 = new Integer(494744342);
        Integer term266265 = new Integer(-1662933444);
        ArrayList term266261 = new ArrayList();
        ((ArrayList) term266261).add(term266263);
        ((ArrayList) term266261).add(term266265);
        Integer term266271 = new Integer(1648583497);
        ArrayList term266269 = new ArrayList();
        ((ArrayList) term266269).add(term266271);
        term266196 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term266198 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term266214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term266219 = newInstance(Class.forName("java.time.LocalTime"));
        Object term266224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term266229 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term266196, term266196.getClass(), "id", -6121524341537237225L);
        setLongField(term266198, term266198.getClass(), "id", 3822005845968497540L);
        setField(term266198, term266198.getClass(), "extId", term266200);
        setField(term266198, term266198.getClass(), "luid", "SDJYcRQAkM");
        setIntField(term266215, term266215.getClass(), "year", 2027);
        setShortField(term266215, term266215.getClass(), "month", (short) 6);
        setShortField(term266215, term266215.getClass(), "day", (short) 13);
        setField(term266214, term266214.getClass(), "date", term266215);
        setByteField(term266219, term266219.getClass(), "hour", (byte) 4);
        setByteField(term266219, term266219.getClass(), "minute", (byte) 7);
        setByteField(term266219, term266219.getClass(), "second", (byte) 55);
        setIntField(term266219, term266219.getClass(), "nano", 288212169);
        setField(term266214, term266214.getClass(), "time", term266219);
        setField(term266198, term266198.getClass(), "registerTime", term266214);
        setIntField(term266225, term266225.getClass(), "year", 2016);
        setShortField(term266225, term266225.getClass(), "month", (short) 8);
        setShortField(term266225, term266225.getClass(), "day", (short) 20);
        setField(term266224, term266224.getClass(), "date", term266225);
        setByteField(term266229, term266229.getClass(), "hour", (byte) 15);
        setByteField(term266229, term266229.getClass(), "minute", (byte) 59);
        setByteField(term266229, term266229.getClass(), "second", (byte) 24);
        setIntField(term266229, term266229.getClass(), "nano", 817884348);
        setField(term266224, term266224.getClass(), "time", term266229);
        setField(term266198, term266198.getClass(), "accessTime", term266224);
        setField(term266196, term266196.getClass(), "card", term266198);
        setField(term266196, term266196.getClass(), "userName", "UKWTVmTWAK");
        setIntField(term266196, term266196.getClass(), "isNetMember", 823553858);
        setIntField(term266196, term266196.getClass(), "iconId", -1875267671);
        setIntField(term266196, term266196.getClass(), "plateId", 1210180896);
        setIntField(term266196, term266196.getClass(), "titleId", -856709958);
        setIntField(term266196, term266196.getClass(), "partnerId", 1421075755);
        setIntField(term266196, term266196.getClass(), "frameId", 583296992);
        setIntField(term266196, term266196.getClass(), "selectMapId", 303697112);
        setIntField(term266196, term266196.getClass(), "totalAwake", 555770564);
        setIntField(term266196, term266196.getClass(), "gradeRating", 715239982);
        setIntField(term266196, term266196.getClass(), "musicRating", 615055377);
        setIntField(term266196, term266196.getClass(), "playerRating", -1316216263);
        setIntField(term266196, term266196.getClass(), "highestRating", 1082693506);
        setIntField(term266196, term266196.getClass(), "gradeRank", 1054381018);
        setIntField(term266196, term266196.getClass(), "classRank", -220010763);
        setIntField(term266196, term266196.getClass(), "courseRank", 1856047628);
        setField(term266196, term266196.getClass(), "charaSlot", term266261);
        setField(term266196, term266196.getClass(), "charaLockSlot", term266269);
        setLongField(term266196, term266196.getClass(), "contentBit", -6738606190759704815L);
        setIntField(term266196, term266196.getClass(), "playCount", -2140050714);
        setField(term266196, term266196.getClass(), "eventWatchedDate", "twYXqgjRmy");
        setField(term266196, term266196.getClass(), "lastGameId", "HFaAuAnTOn");
        setField(term266196, term266196.getClass(), "lastRomVersion", "EJiGWkJgKE");
        setField(term266196, term266196.getClass(), "lastDataVersion", "MJovsjjSeM");
        setField(term266196, term266196.getClass(), "lastLoginDate", "YONpdIaYPl");
        setField(term266196, term266196.getClass(), "lastPlayDate", "xQwJTVPqIz");
        setIntField(term266196, term266196.getClass(), "lastPlayCredit", 1643490260);
        setIntField(term266196, term266196.getClass(), "lastPlayMode", 160723704);
        setIntField(term266196, term266196.getClass(), "lastPlaceId", 890205565);
        setField(term266196, term266196.getClass(), "lastPlaceName", "VkVNOcUvlO");
        setIntField(term266196, term266196.getClass(), "lastAllNetId", -1174535298);
        setIntField(term266196, term266196.getClass(), "lastRegionId", -625809978);
        setField(term266196, term266196.getClass(), "lastRegionName", "DVBrSfNLwF");
        setField(term266196, term266196.getClass(), "lastClientId", "QeeIOyYsmx");
        setField(term266196, term266196.getClass(), "lastCountryCode", "tREUVNKzCo");
        setIntField(term266196, term266196.getClass(), "lastSelectEMoney", -724335844);
        setIntField(term266196, term266196.getClass(), "lastSelectTicket", 1576614706);
        setIntField(term266196, term266196.getClass(), "lastSelectCourse", -1847432199);
        setIntField(term266196, term266196.getClass(), "lastCountCourse", 1319848087);
        setField(term266196, term266196.getClass(), "firstGameId", "oMVmfIrXEu");
        setField(term266196, term266196.getClass(), "firstRomVersion", "wpVzLLfXkK");
        setField(term266196, term266196.getClass(), "firstDataVersion", "SEPrgtTBVv");
        setField(term266196, term266196.getClass(), "firstPlayDate", "vtJRIanbwg");
        setField(term266196, term266196.getClass(), "compatibleCmVersion", "JbrLDrpoAv");
        setField(term266196, term266196.getClass(), "dailyBonusDate", "kLAYfNPTYi");
        setField(term266196, term266196.getClass(), "dailyCourseBonusDate", "bgvEvjROsI");
        setField(term266196, term266196.getClass(), "lastPairLoginDate", "dDgTwPNnoh");
        setField(term266196, term266196.getClass(), "lastTrialPlayDate", "kMDHgEGnfj");
        setIntField(term266196, term266196.getClass(), "playVsCount", 556059164);
        setIntField(term266196, term266196.getClass(), "playSyncCount", -685986401);
        setIntField(term266196, term266196.getClass(), "winCount", -379269911);
        setIntField(term266196, term266196.getClass(), "helpCount", 846636764);
        setIntField(term266196, term266196.getClass(), "comboCount", -88201260);
        setLongField(term266196, term266196.getClass(), "totalDeluxscore", -455586029947611012L);
        setLongField(term266196, term266196.getClass(), "totalBasicDeluxscore", 2537265421354641400L);
        setLongField(term266196, term266196.getClass(), "totalAdvancedDeluxscore", -3275824126621175157L);
        setLongField(term266196, term266196.getClass(), "totalExpertDeluxscore", 1556960302254833608L);
        setLongField(term266196, term266196.getClass(), "totalMasterDeluxscore", -152428419683283784L);
        setLongField(term266196, term266196.getClass(), "totalReMasterDeluxscore", 8961388789119739174L);
        setIntField(term266196, term266196.getClass(), "totalSync", -292257128);
        setIntField(term266196, term266196.getClass(), "totalBasicSync", -577634614);
        setIntField(term266196, term266196.getClass(), "totalAdvancedSync", -1041538419);
        setIntField(term266196, term266196.getClass(), "totalExpertSync", -112544545);
        setIntField(term266196, term266196.getClass(), "totalMasterSync", -1426710489);
        setIntField(term266196, term266196.getClass(), "totalReMasterSync", 815446082);
        setLongField(term266196, term266196.getClass(), "totalAchievement", 3629112577877265594L);
        setLongField(term266196, term266196.getClass(), "totalBasicAchievement", -4857907760514614403L);
        setLongField(term266196, term266196.getClass(), "totalAdvancedAchievement", -1261722990878835267L);
        setLongField(term266196, term266196.getClass(), "totalExpertAchievement", 4942260656603647338L);
        setLongField(term266196, term266196.getClass(), "totalMasterAchievement", -5768952721115002011L);
        setLongField(term266196, term266196.getClass(), "totalReMasterAchievement", 161623609117714777L);
        setLongField(term266196, term266196.getClass(), "playerOldRating", 8645459934108035346L);
        setLongField(term266196, term266196.getClass(), "playerNewRating", -5363902041096313744L);
        setIntField(term266196, term266196.getClass(), "banState", 856438779);
        setLongField(term266196, term266196.getClass(), "dateTime", 5317340010171574630L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "inHvGjtHrL";
        callMethod(klass, "setDailyCourseBonusDate", argTypes, term266196, args);
    }

};


