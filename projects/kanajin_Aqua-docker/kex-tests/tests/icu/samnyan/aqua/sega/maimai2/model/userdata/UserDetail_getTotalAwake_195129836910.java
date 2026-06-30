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

public class UserDetail_getTotalAwake_195129836910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4235158;

    public UserDetail_getTotalAwake_195129836910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4235162 = new Long(2308033960283885298L);
        Integer term4235225 = new Integer(-1107385404);
        Integer term4235227 = new Integer(-524207375);
        Integer term4235229 = new Integer(-590671889);
        ArrayList term4235223 = new ArrayList();
        ((ArrayList) term4235223).add(term4235225);
        ((ArrayList) term4235223).add(term4235227);
        ((ArrayList) term4235223).add(term4235229);
        Integer term4235235 = new Integer(-1418367417);
        Integer term4235237 = new Integer(-2130236957);
        Integer term4235239 = new Integer(-1477513467);
        Integer term4235241 = new Integer(1784364775);
        Integer term4235243 = new Integer(-1405043904);
        ArrayList term4235233 = new ArrayList();
        ((ArrayList) term4235233).add(term4235235);
        ((ArrayList) term4235233).add(term4235237);
        ((ArrayList) term4235233).add(term4235239);
        ((ArrayList) term4235233).add(term4235241);
        ((ArrayList) term4235233).add(term4235243);
        term4235158 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4235160 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4235176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4235177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4235181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4235186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4235187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4235191 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4235158, term4235158.getClass(), "id", -5042788551541790870L);
        setLongField(term4235160, term4235160.getClass(), "id", 3356835023190864366L);
        setField(term4235160, term4235160.getClass(), "extId", term4235162);
        setField(term4235160, term4235160.getClass(), "luid", "JonadqIwPi");
        setIntField(term4235177, term4235177.getClass(), "year", 2025);
        setShortField(term4235177, term4235177.getClass(), "month", (short) 3);
        setShortField(term4235177, term4235177.getClass(), "day", (short) 13);
        setField(term4235176, term4235176.getClass(), "date", term4235177);
        setByteField(term4235181, term4235181.getClass(), "hour", (byte) 19);
        setByteField(term4235181, term4235181.getClass(), "minute", (byte) 6);
        setByteField(term4235181, term4235181.getClass(), "second", (byte) 40);
        setIntField(term4235181, term4235181.getClass(), "nano", 939244025);
        setField(term4235176, term4235176.getClass(), "time", term4235181);
        setField(term4235160, term4235160.getClass(), "registerTime", term4235176);
        setIntField(term4235187, term4235187.getClass(), "year", 2026);
        setShortField(term4235187, term4235187.getClass(), "month", (short) 6);
        setShortField(term4235187, term4235187.getClass(), "day", (short) 16);
        setField(term4235186, term4235186.getClass(), "date", term4235187);
        setByteField(term4235191, term4235191.getClass(), "hour", (byte) 4);
        setByteField(term4235191, term4235191.getClass(), "minute", (byte) 16);
        setByteField(term4235191, term4235191.getClass(), "second", (byte) 8);
        setIntField(term4235191, term4235191.getClass(), "nano", 638893804);
        setField(term4235186, term4235186.getClass(), "time", term4235191);
        setField(term4235160, term4235160.getClass(), "accessTime", term4235186);
        setField(term4235158, term4235158.getClass(), "card", term4235160);
        setField(term4235158, term4235158.getClass(), "userName", "IpKTNjwSXE");
        setIntField(term4235158, term4235158.getClass(), "isNetMember", 1647521963);
        setIntField(term4235158, term4235158.getClass(), "iconId", -1317309779);
        setIntField(term4235158, term4235158.getClass(), "plateId", -1530548042);
        setIntField(term4235158, term4235158.getClass(), "titleId", 71817441);
        setIntField(term4235158, term4235158.getClass(), "partnerId", 2075356879);
        setIntField(term4235158, term4235158.getClass(), "frameId", -1637097219);
        setIntField(term4235158, term4235158.getClass(), "selectMapId", -1211679047);
        setIntField(term4235158, term4235158.getClass(), "totalAwake", 1902822020);
        setIntField(term4235158, term4235158.getClass(), "gradeRating", 1118083202);
        setIntField(term4235158, term4235158.getClass(), "musicRating", -1325164537);
        setIntField(term4235158, term4235158.getClass(), "playerRating", 282501297);
        setIntField(term4235158, term4235158.getClass(), "highestRating", -1759016012);
        setIntField(term4235158, term4235158.getClass(), "gradeRank", -924279155);
        setIntField(term4235158, term4235158.getClass(), "classRank", -199494714);
        setIntField(term4235158, term4235158.getClass(), "courseRank", -1593250299);
        setField(term4235158, term4235158.getClass(), "charaSlot", term4235223);
        setField(term4235158, term4235158.getClass(), "charaLockSlot", term4235233);
        setLongField(term4235158, term4235158.getClass(), "contentBit", 2130507953557492283L);
        setIntField(term4235158, term4235158.getClass(), "playCount", -404742330);
        setField(term4235158, term4235158.getClass(), "eventWatchedDate", "hsuyEqIbEs");
        setField(term4235158, term4235158.getClass(), "lastGameId", "nodriKVgao");
        setField(term4235158, term4235158.getClass(), "lastRomVersion", "gpFvEqQPmW");
        setField(term4235158, term4235158.getClass(), "lastDataVersion", "mUKNQptmXd");
        setField(term4235158, term4235158.getClass(), "lastLoginDate", "yCVgGEJZxQ");
        setField(term4235158, term4235158.getClass(), "lastPlayDate", "jauOfqjIpr");
        setIntField(term4235158, term4235158.getClass(), "lastPlayCredit", -626157763);
        setIntField(term4235158, term4235158.getClass(), "lastPlayMode", -1273357569);
        setIntField(term4235158, term4235158.getClass(), "lastPlaceId", -893531176);
        setField(term4235158, term4235158.getClass(), "lastPlaceName", "TZSfNtHIuW");
        setIntField(term4235158, term4235158.getClass(), "lastAllNetId", -185553008);
        setIntField(term4235158, term4235158.getClass(), "lastRegionId", -1852364184);
        setField(term4235158, term4235158.getClass(), "lastRegionName", "htepURcZMD");
        setField(term4235158, term4235158.getClass(), "lastClientId", "BGhDLCCLbx");
        setField(term4235158, term4235158.getClass(), "lastCountryCode", "uDQzlcyVyc");
        setIntField(term4235158, term4235158.getClass(), "lastSelectEMoney", 1783469310);
        setIntField(term4235158, term4235158.getClass(), "lastSelectTicket", -1386945870);
        setIntField(term4235158, term4235158.getClass(), "lastSelectCourse", 1574184254);
        setIntField(term4235158, term4235158.getClass(), "lastCountCourse", -431736402);
        setField(term4235158, term4235158.getClass(), "firstGameId", "ErGWupMgEx");
        setField(term4235158, term4235158.getClass(), "firstRomVersion", "XTQlicDwat");
        setField(term4235158, term4235158.getClass(), "firstDataVersion", "TMzCEwwRRF");
        setField(term4235158, term4235158.getClass(), "firstPlayDate", "VOKHVFFVxR");
        setField(term4235158, term4235158.getClass(), "compatibleCmVersion", "edtxojsPVh");
        setField(term4235158, term4235158.getClass(), "dailyBonusDate", "WOljeSUAaO");
        setField(term4235158, term4235158.getClass(), "dailyCourseBonusDate", "ydhodsnVWm");
        setField(term4235158, term4235158.getClass(), "lastPairLoginDate", "ARtTamrCZm");
        setField(term4235158, term4235158.getClass(), "lastTrialPlayDate", "VLbeLElevI");
        setIntField(term4235158, term4235158.getClass(), "playVsCount", -558496123);
        setIntField(term4235158, term4235158.getClass(), "playSyncCount", -149779873);
        setIntField(term4235158, term4235158.getClass(), "winCount", -819976346);
        setIntField(term4235158, term4235158.getClass(), "helpCount", 2068859136);
        setIntField(term4235158, term4235158.getClass(), "comboCount", -1389147647);
        setLongField(term4235158, term4235158.getClass(), "totalDeluxscore", -1359620738349291522L);
        setLongField(term4235158, term4235158.getClass(), "totalBasicDeluxscore", 2470579243022232756L);
        setLongField(term4235158, term4235158.getClass(), "totalAdvancedDeluxscore", 7356590376038830833L);
        setLongField(term4235158, term4235158.getClass(), "totalExpertDeluxscore", -4624837632371540649L);
        setLongField(term4235158, term4235158.getClass(), "totalMasterDeluxscore", 5526289798851488374L);
        setLongField(term4235158, term4235158.getClass(), "totalReMasterDeluxscore", 2105040297940048629L);
        setIntField(term4235158, term4235158.getClass(), "totalSync", 944295959);
        setIntField(term4235158, term4235158.getClass(), "totalBasicSync", 665915609);
        setIntField(term4235158, term4235158.getClass(), "totalAdvancedSync", -253465754);
        setIntField(term4235158, term4235158.getClass(), "totalExpertSync", 1268930303);
        setIntField(term4235158, term4235158.getClass(), "totalMasterSync", 1820867294);
        setIntField(term4235158, term4235158.getClass(), "totalReMasterSync", 1997498043);
        setLongField(term4235158, term4235158.getClass(), "totalAchievement", -8490708168937703004L);
        setLongField(term4235158, term4235158.getClass(), "totalBasicAchievement", 8853006913001830771L);
        setLongField(term4235158, term4235158.getClass(), "totalAdvancedAchievement", 8829851041490436959L);
        setLongField(term4235158, term4235158.getClass(), "totalExpertAchievement", 2685924228479041232L);
        setLongField(term4235158, term4235158.getClass(), "totalMasterAchievement", 6929711243872512L);
        setLongField(term4235158, term4235158.getClass(), "totalReMasterAchievement", -1822630114084084634L);
        setLongField(term4235158, term4235158.getClass(), "playerOldRating", -6856530514523629771L);
        setLongField(term4235158, term4235158.getClass(), "playerNewRating", -2516609596348209041L);
        setIntField(term4235158, term4235158.getClass(), "banState", 115587068);
        setLongField(term4235158, term4235158.getClass(), "dateTime", -6664423526130762460L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAwake", argTypes, term4235158, args);
    }

};


