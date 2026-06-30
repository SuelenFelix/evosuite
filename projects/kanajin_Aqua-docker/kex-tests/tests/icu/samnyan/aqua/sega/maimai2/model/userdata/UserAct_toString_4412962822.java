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

public class UserAct_toString_4412962822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13221;

    public UserAct_toString_4412962822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13227 = new Long(-4365849114644724155L);
        Integer term13290 = new Integer(-1899301124);
        Integer term13292 = new Integer(-1882480155);
        Integer term13294 = new Integer(-1410220680);
        Integer term13296 = new Integer(389427431);
        Integer term13298 = new Integer(-1945706126);
        Integer term13300 = new Integer(1152356969);
        ArrayList term13288 = new ArrayList();
        ((ArrayList) term13288).add(term13290);
        ((ArrayList) term13288).add(term13292);
        ((ArrayList) term13288).add(term13294);
        ((ArrayList) term13288).add(term13296);
        ((ArrayList) term13288).add(term13298);
        ((ArrayList) term13288).add(term13300);
        Integer term13306 = new Integer(-1667990367);
        Integer term13308 = new Integer(-1214628358);
        Integer term13310 = new Integer(1102721075);
        Integer term13312 = new Integer(-426764678);
        Integer term13314 = new Integer(-1222614956);
        Integer term13316 = new Integer(-1870495012);
        Integer term13318 = new Integer(-1310015129);
        Integer term13320 = new Integer(-2104981311);
        ArrayList term13304 = new ArrayList();
        ((ArrayList) term13304).add(term13306);
        ((ArrayList) term13304).add(term13308);
        ((ArrayList) term13304).add(term13310);
        ((ArrayList) term13304).add(term13312);
        ((ArrayList) term13304).add(term13314);
        ((ArrayList) term13304).add(term13316);
        ((ArrayList) term13304).add(term13318);
        ((ArrayList) term13304).add(term13320);
        term13221 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term13223 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term13225 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term13241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13256 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term13221, term13221.getClass(), "id", 8171709541116491249L);
        setLongField(term13223, term13223.getClass(), "id", 1867943942587005261L);
        setLongField(term13225, term13225.getClass(), "id", -9168517519350392654L);
        setField(term13225, term13225.getClass(), "extId", term13227);
        setField(term13225, term13225.getClass(), "luid", "CAgxWjhxNf");
        setIntField(term13242, term13242.getClass(), "year", 2027);
        setShortField(term13242, term13242.getClass(), "month", (short) 8);
        setShortField(term13242, term13242.getClass(), "day", (short) 23);
        setField(term13241, term13241.getClass(), "date", term13242);
        setByteField(term13246, term13246.getClass(), "hour", (byte) 15);
        setByteField(term13246, term13246.getClass(), "minute", (byte) 12);
        setByteField(term13246, term13246.getClass(), "second", (byte) 6);
        setIntField(term13246, term13246.getClass(), "nano", 541218258);
        setField(term13241, term13241.getClass(), "time", term13246);
        setField(term13225, term13225.getClass(), "registerTime", term13241);
        setIntField(term13252, term13252.getClass(), "year", 2013);
        setShortField(term13252, term13252.getClass(), "month", (short) 5);
        setShortField(term13252, term13252.getClass(), "day", (short) 26);
        setField(term13251, term13251.getClass(), "date", term13252);
        setByteField(term13256, term13256.getClass(), "hour", (byte) 4);
        setByteField(term13256, term13256.getClass(), "minute", (byte) 39);
        setByteField(term13256, term13256.getClass(), "second", (byte) 5);
        setIntField(term13256, term13256.getClass(), "nano", 392869354);
        setField(term13251, term13251.getClass(), "time", term13256);
        setField(term13225, term13225.getClass(), "accessTime", term13251);
        setField(term13223, term13223.getClass(), "card", term13225);
        setField(term13223, term13223.getClass(), "userName", "goAoCMhKBu");
        setIntField(term13223, term13223.getClass(), "isNetMember", 237134844);
        setIntField(term13223, term13223.getClass(), "iconId", 2076413861);
        setIntField(term13223, term13223.getClass(), "plateId", 66817373);
        setIntField(term13223, term13223.getClass(), "titleId", 1459628013);
        setIntField(term13223, term13223.getClass(), "partnerId", -1641507499);
        setIntField(term13223, term13223.getClass(), "frameId", -33436796);
        setIntField(term13223, term13223.getClass(), "selectMapId", -1527326823);
        setIntField(term13223, term13223.getClass(), "totalAwake", 469871899);
        setIntField(term13223, term13223.getClass(), "gradeRating", -1348703436);
        setIntField(term13223, term13223.getClass(), "musicRating", -2027012650);
        setIntField(term13223, term13223.getClass(), "playerRating", 1343432022);
        setIntField(term13223, term13223.getClass(), "highestRating", -1767079160);
        setIntField(term13223, term13223.getClass(), "gradeRank", -201010601);
        setIntField(term13223, term13223.getClass(), "classRank", 2060027076);
        setIntField(term13223, term13223.getClass(), "courseRank", 2084868811);
        setField(term13223, term13223.getClass(), "charaSlot", term13288);
        setField(term13223, term13223.getClass(), "charaLockSlot", term13304);
        setLongField(term13223, term13223.getClass(), "contentBit", 4828755228445882127L);
        setIntField(term13223, term13223.getClass(), "playCount", 314478878);
        setField(term13223, term13223.getClass(), "eventWatchedDate", "BWxJSgKHRT");
        setField(term13223, term13223.getClass(), "lastGameId", "AGXoIndFnm");
        setField(term13223, term13223.getClass(), "lastRomVersion", "mwmFMNEzkK");
        setField(term13223, term13223.getClass(), "lastDataVersion", "kVAmKknVln");
        setField(term13223, term13223.getClass(), "lastLoginDate", "MRFLbEGYKG");
        setField(term13223, term13223.getClass(), "lastPlayDate", "BYrGukTyof");
        setIntField(term13223, term13223.getClass(), "lastPlayCredit", 1425342686);
        setIntField(term13223, term13223.getClass(), "lastPlayMode", -1042470635);
        setIntField(term13223, term13223.getClass(), "lastPlaceId", -524352937);
        setField(term13223, term13223.getClass(), "lastPlaceName", "jiCGTTzKGB");
        setIntField(term13223, term13223.getClass(), "lastAllNetId", 1472218987);
        setIntField(term13223, term13223.getClass(), "lastRegionId", 805176809);
        setField(term13223, term13223.getClass(), "lastRegionName", "MqICFYzDJj");
        setField(term13223, term13223.getClass(), "lastClientId", "YgQvdcBQKw");
        setField(term13223, term13223.getClass(), "lastCountryCode", "FiYYLuailz");
        setIntField(term13223, term13223.getClass(), "lastSelectEMoney", -82632953);
        setIntField(term13223, term13223.getClass(), "lastSelectTicket", -1473876284);
        setIntField(term13223, term13223.getClass(), "lastSelectCourse", -1389314671);
        setIntField(term13223, term13223.getClass(), "lastCountCourse", -499699841);
        setField(term13223, term13223.getClass(), "firstGameId", "XebAeSnCKZ");
        setField(term13223, term13223.getClass(), "firstRomVersion", "GeddnXjHGy");
        setField(term13223, term13223.getClass(), "firstDataVersion", "vLTbaoAxBm");
        setField(term13223, term13223.getClass(), "firstPlayDate", "BXTjEyEZxD");
        setField(term13223, term13223.getClass(), "compatibleCmVersion", "oKhVzOKUFW");
        setField(term13223, term13223.getClass(), "dailyBonusDate", "mNHyqmOAFy");
        setField(term13223, term13223.getClass(), "dailyCourseBonusDate", "UxgSdhxPCH");
        setField(term13223, term13223.getClass(), "lastPairLoginDate", "DAujxZPHJC");
        setField(term13223, term13223.getClass(), "lastTrialPlayDate", "IlBhdrCvHq");
        setIntField(term13223, term13223.getClass(), "playVsCount", 360972386);
        setIntField(term13223, term13223.getClass(), "playSyncCount", -2063884849);
        setIntField(term13223, term13223.getClass(), "winCount", 1054887169);
        setIntField(term13223, term13223.getClass(), "helpCount", 692873905);
        setIntField(term13223, term13223.getClass(), "comboCount", 1734759369);
        setLongField(term13223, term13223.getClass(), "totalDeluxscore", 970120292495348028L);
        setLongField(term13223, term13223.getClass(), "totalBasicDeluxscore", 77619432202128806L);
        setLongField(term13223, term13223.getClass(), "totalAdvancedDeluxscore", -1647156882669215876L);
        setLongField(term13223, term13223.getClass(), "totalExpertDeluxscore", 4115148503664117517L);
        setLongField(term13223, term13223.getClass(), "totalMasterDeluxscore", 8527367353497875781L);
        setLongField(term13223, term13223.getClass(), "totalReMasterDeluxscore", -6489405551733780896L);
        setIntField(term13223, term13223.getClass(), "totalSync", 1841493736);
        setIntField(term13223, term13223.getClass(), "totalBasicSync", 320739944);
        setIntField(term13223, term13223.getClass(), "totalAdvancedSync", 760218111);
        setIntField(term13223, term13223.getClass(), "totalExpertSync", -1986366126);
        setIntField(term13223, term13223.getClass(), "totalMasterSync", -1963228619);
        setIntField(term13223, term13223.getClass(), "totalReMasterSync", -709868952);
        setLongField(term13223, term13223.getClass(), "totalAchievement", 5818741986224130131L);
        setLongField(term13223, term13223.getClass(), "totalBasicAchievement", 370847120687610747L);
        setLongField(term13223, term13223.getClass(), "totalAdvancedAchievement", -6399462725251497844L);
        setLongField(term13223, term13223.getClass(), "totalExpertAchievement", -4855037955202452256L);
        setLongField(term13223, term13223.getClass(), "totalMasterAchievement", -5903549884298836343L);
        setLongField(term13223, term13223.getClass(), "totalReMasterAchievement", -3058119213533262883L);
        setLongField(term13223, term13223.getClass(), "playerOldRating", 1950957495500453461L);
        setLongField(term13223, term13223.getClass(), "playerNewRating", -6423955170741487890L);
        setIntField(term13223, term13223.getClass(), "banState", 847207929);
        setLongField(term13223, term13223.getClass(), "dateTime", -4663904610228258188L);
        setField(term13221, term13221.getClass(), "user", term13223);
        setIntField(term13221, term13221.getClass(), "kind", -1665928103);
        setIntField(term13221, term13221.getClass(), "activityId", 1574458332);
        setLongField(term13221, term13221.getClass(), "sortNumber", 3824691451696451167L);
        setIntField(term13221, term13221.getClass(), "param1", -975856245);
        setIntField(term13221, term13221.getClass(), "param2", -1023366103);
        setIntField(term13221, term13221.getClass(), "param3", 81427089);
        setIntField(term13221, term13221.getClass(), "param4", 755951489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13221, args);
    }

};


