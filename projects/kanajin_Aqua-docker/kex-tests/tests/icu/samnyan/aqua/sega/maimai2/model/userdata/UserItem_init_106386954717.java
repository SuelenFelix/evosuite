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
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;

public class UserItem_init_106386954717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43215;
     Object term43217;
     Object term43576;
     Object term43578;
     Object term43580;
     Object term43582;

    public UserItem_init_106386954717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43215 = new Long(-4215965963361389968L);
        Long term43221 = new Long(414749984815662075L);
        Integer term43284 = new Integer(2634669);
        Integer term43286 = new Integer(-1912429941);
        Integer term43288 = new Integer(1801052257);
        Integer term43290 = new Integer(-2110556060);
        Integer term43292 = new Integer(313459791);
        ArrayList term43282 = new ArrayList();
        ((ArrayList) term43282).add(term43284);
        ((ArrayList) term43282).add(term43286);
        ((ArrayList) term43282).add(term43288);
        ((ArrayList) term43282).add(term43290);
        ((ArrayList) term43282).add(term43292);
        Integer term43298 = new Integer(752615112);
        Integer term43300 = new Integer(-1674430871);
        Integer term43302 = new Integer(794352120);
        Integer term43304 = new Integer(340719678);
        Integer term43306 = new Integer(299791142);
        ArrayList term43296 = new ArrayList();
        ((ArrayList) term43296).add(term43298);
        ((ArrayList) term43296).add(term43300);
        ((ArrayList) term43296).add(term43302);
        ((ArrayList) term43296).add(term43304);
        ((ArrayList) term43296).add(term43306);
        term43217 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term43219 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term43235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43240 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43250 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term43217, term43217.getClass(), "id", 2070286321904569703L);
        setLongField(term43219, term43219.getClass(), "id", -3945232339387324807L);
        setField(term43219, term43219.getClass(), "extId", term43221);
        setField(term43219, term43219.getClass(), "luid", "WAZFhrxcSM");
        setIntField(term43236, term43236.getClass(), "year", 2012);
        setShortField(term43236, term43236.getClass(), "month", (short) 5);
        setShortField(term43236, term43236.getClass(), "day", (short) 25);
        setField(term43235, term43235.getClass(), "date", term43236);
        setByteField(term43240, term43240.getClass(), "hour", (byte) 5);
        setByteField(term43240, term43240.getClass(), "minute", (byte) 8);
        setByteField(term43240, term43240.getClass(), "second", (byte) 47);
        setIntField(term43240, term43240.getClass(), "nano", 455554221);
        setField(term43235, term43235.getClass(), "time", term43240);
        setField(term43219, term43219.getClass(), "registerTime", term43235);
        setIntField(term43246, term43246.getClass(), "year", 2029);
        setShortField(term43246, term43246.getClass(), "month", (short) 11);
        setShortField(term43246, term43246.getClass(), "day", (short) 18);
        setField(term43245, term43245.getClass(), "date", term43246);
        setByteField(term43250, term43250.getClass(), "hour", (byte) 5);
        setByteField(term43250, term43250.getClass(), "minute", (byte) 36);
        setByteField(term43250, term43250.getClass(), "second", (byte) 57);
        setIntField(term43250, term43250.getClass(), "nano", 394167804);
        setField(term43245, term43245.getClass(), "time", term43250);
        setField(term43219, term43219.getClass(), "accessTime", term43245);
        setField(term43217, term43217.getClass(), "card", term43219);
        setField(term43217, term43217.getClass(), "userName", "gCRUlTuVMX");
        setIntField(term43217, term43217.getClass(), "isNetMember", -20697214);
        setIntField(term43217, term43217.getClass(), "iconId", -374105961);
        setIntField(term43217, term43217.getClass(), "plateId", -198328789);
        setIntField(term43217, term43217.getClass(), "titleId", -158694757);
        setIntField(term43217, term43217.getClass(), "partnerId", -1855067606);
        setIntField(term43217, term43217.getClass(), "frameId", -433967657);
        setIntField(term43217, term43217.getClass(), "selectMapId", 1411661019);
        setIntField(term43217, term43217.getClass(), "totalAwake", 1020857327);
        setIntField(term43217, term43217.getClass(), "gradeRating", 587603547);
        setIntField(term43217, term43217.getClass(), "musicRating", -1049371381);
        setIntField(term43217, term43217.getClass(), "playerRating", -331201186);
        setIntField(term43217, term43217.getClass(), "highestRating", 406731696);
        setIntField(term43217, term43217.getClass(), "gradeRank", 690233885);
        setIntField(term43217, term43217.getClass(), "classRank", -1482271539);
        setIntField(term43217, term43217.getClass(), "courseRank", 52686140);
        setField(term43217, term43217.getClass(), "charaSlot", term43282);
        setField(term43217, term43217.getClass(), "charaLockSlot", term43296);
        setLongField(term43217, term43217.getClass(), "contentBit", -5824480506846704461L);
        setIntField(term43217, term43217.getClass(), "playCount", -352835881);
        setField(term43217, term43217.getClass(), "eventWatchedDate", "tYBgGQtkhi");
        setField(term43217, term43217.getClass(), "lastGameId", "PhGPFLIMKH");
        setField(term43217, term43217.getClass(), "lastRomVersion", "pWCYcLhoms");
        setField(term43217, term43217.getClass(), "lastDataVersion", "IWNJVfvTuw");
        setField(term43217, term43217.getClass(), "lastLoginDate", "DLpKfwPpvr");
        setField(term43217, term43217.getClass(), "lastPlayDate", "DLFXidLbuT");
        setIntField(term43217, term43217.getClass(), "lastPlayCredit", 2119021005);
        setIntField(term43217, term43217.getClass(), "lastPlayMode", 1361925101);
        setIntField(term43217, term43217.getClass(), "lastPlaceId", -1702583840);
        setField(term43217, term43217.getClass(), "lastPlaceName", "FjkxfTXGIH");
        setIntField(term43217, term43217.getClass(), "lastAllNetId", -1496594860);
        setIntField(term43217, term43217.getClass(), "lastRegionId", -1754638525);
        setField(term43217, term43217.getClass(), "lastRegionName", "KJkWSFFnmR");
        setField(term43217, term43217.getClass(), "lastClientId", "FBYRIDZvmW");
        setField(term43217, term43217.getClass(), "lastCountryCode", "IyjLfrDZrV");
        setIntField(term43217, term43217.getClass(), "lastSelectEMoney", -1058018356);
        setIntField(term43217, term43217.getClass(), "lastSelectTicket", -618930598);
        setIntField(term43217, term43217.getClass(), "lastSelectCourse", -1912835189);
        setIntField(term43217, term43217.getClass(), "lastCountCourse", 1508089655);
        setField(term43217, term43217.getClass(), "firstGameId", "BRMTHqqoRg");
        setField(term43217, term43217.getClass(), "firstRomVersion", "nOElYZBeyU");
        setField(term43217, term43217.getClass(), "firstDataVersion", "eUXPtGmoNg");
        setField(term43217, term43217.getClass(), "firstPlayDate", "ZjqXyUmAJY");
        setField(term43217, term43217.getClass(), "compatibleCmVersion", "pjEERkBbYo");
        setField(term43217, term43217.getClass(), "dailyBonusDate", "FQPqmjhWog");
        setField(term43217, term43217.getClass(), "dailyCourseBonusDate", "sYtJsiIiSX");
        setField(term43217, term43217.getClass(), "lastPairLoginDate", "KgfsAwTFFn");
        setField(term43217, term43217.getClass(), "lastTrialPlayDate", "hFnFlgThhp");
        setIntField(term43217, term43217.getClass(), "playVsCount", 1344738281);
        setIntField(term43217, term43217.getClass(), "playSyncCount", 2137586016);
        setIntField(term43217, term43217.getClass(), "winCount", 718944255);
        setIntField(term43217, term43217.getClass(), "helpCount", -255278880);
        setIntField(term43217, term43217.getClass(), "comboCount", 978936508);
        setLongField(term43217, term43217.getClass(), "totalDeluxscore", 3429445910087803709L);
        setLongField(term43217, term43217.getClass(), "totalBasicDeluxscore", 6844542874326058740L);
        setLongField(term43217, term43217.getClass(), "totalAdvancedDeluxscore", -7486371039960699202L);
        setLongField(term43217, term43217.getClass(), "totalExpertDeluxscore", 3936368864173279345L);
        setLongField(term43217, term43217.getClass(), "totalMasterDeluxscore", 6993652740699384445L);
        setLongField(term43217, term43217.getClass(), "totalReMasterDeluxscore", -1750953812188769604L);
        setIntField(term43217, term43217.getClass(), "totalSync", -782282859);
        setIntField(term43217, term43217.getClass(), "totalBasicSync", -289872820);
        setIntField(term43217, term43217.getClass(), "totalAdvancedSync", 999463901);
        setIntField(term43217, term43217.getClass(), "totalExpertSync", -1558642750);
        setIntField(term43217, term43217.getClass(), "totalMasterSync", 1177832973);
        setIntField(term43217, term43217.getClass(), "totalReMasterSync", -808639910);
        setLongField(term43217, term43217.getClass(), "totalAchievement", -2708952612032666340L);
        setLongField(term43217, term43217.getClass(), "totalBasicAchievement", -1148993446345293581L);
        setLongField(term43217, term43217.getClass(), "totalAdvancedAchievement", 6614269735692083780L);
        setLongField(term43217, term43217.getClass(), "totalExpertAchievement", 7437006125284633666L);
        setLongField(term43217, term43217.getClass(), "totalMasterAchievement", 7426144489061842120L);
        setLongField(term43217, term43217.getClass(), "totalReMasterAchievement", -7501037219137334101L);
        setLongField(term43217, term43217.getClass(), "playerOldRating", -5898738968422709494L);
        setLongField(term43217, term43217.getClass(), "playerNewRating", 1222571199408067081L);
        setIntField(term43217, term43217.getClass(), "banState", -2087767976);
        setLongField(term43217, term43217.getClass(), "dateTime", -3672309483214533219L);
        term43576 = new Integer(1541808857);
        term43578 = new Integer(2007310608);
        term43580 = new Integer(462157519);
        term43582 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term43215;
        args[1] = term43217;
        args[2] = term43576;
        args[3] = term43578;
        args[4] = term43580;
        args[5] = term43582;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


