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

public class UserDetail_getFirstRomVersion_174479611142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219346;

    public UserDetail_getFirstRomVersion_174479611142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term219350 = new Long(-8993073054427011802L);
        Integer term219413 = new Integer(-108045978);
        Integer term219415 = new Integer(-1242612066);
        ArrayList term219411 = new ArrayList();
        ((ArrayList) term219411).add(term219413);
        ((ArrayList) term219411).add(term219415);
        Integer term219421 = new Integer(-1492896610);
        Integer term219423 = new Integer(1239212151);
        ArrayList term219419 = new ArrayList();
        ((ArrayList) term219419).add(term219421);
        ((ArrayList) term219419).add(term219423);
        term219346 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term219348 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term219364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term219374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219379 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term219346, term219346.getClass(), "id", -648918313748693919L);
        setLongField(term219348, term219348.getClass(), "id", 4588689385775306407L);
        setField(term219348, term219348.getClass(), "extId", term219350);
        setField(term219348, term219348.getClass(), "luid", "BAvlbsjYmi");
        setIntField(term219365, term219365.getClass(), "year", 2021);
        setShortField(term219365, term219365.getClass(), "month", (short) 4);
        setShortField(term219365, term219365.getClass(), "day", (short) 17);
        setField(term219364, term219364.getClass(), "date", term219365);
        setByteField(term219369, term219369.getClass(), "hour", (byte) 22);
        setByteField(term219369, term219369.getClass(), "minute", (byte) 34);
        setByteField(term219369, term219369.getClass(), "second", (byte) 19);
        setIntField(term219369, term219369.getClass(), "nano", 565497804);
        setField(term219364, term219364.getClass(), "time", term219369);
        setField(term219348, term219348.getClass(), "registerTime", term219364);
        setIntField(term219375, term219375.getClass(), "year", 2019);
        setShortField(term219375, term219375.getClass(), "month", (short) 11);
        setShortField(term219375, term219375.getClass(), "day", (short) 26);
        setField(term219374, term219374.getClass(), "date", term219375);
        setByteField(term219379, term219379.getClass(), "hour", (byte) 21);
        setByteField(term219379, term219379.getClass(), "minute", (byte) 16);
        setByteField(term219379, term219379.getClass(), "second", (byte) 42);
        setIntField(term219379, term219379.getClass(), "nano", 559995047);
        setField(term219374, term219374.getClass(), "time", term219379);
        setField(term219348, term219348.getClass(), "accessTime", term219374);
        setField(term219346, term219346.getClass(), "card", term219348);
        setField(term219346, term219346.getClass(), "userName", "JStBEULwgX");
        setIntField(term219346, term219346.getClass(), "isNetMember", 709648293);
        setIntField(term219346, term219346.getClass(), "iconId", 1968045816);
        setIntField(term219346, term219346.getClass(), "plateId", 2026259813);
        setIntField(term219346, term219346.getClass(), "titleId", 1869405361);
        setIntField(term219346, term219346.getClass(), "partnerId", -1535999317);
        setIntField(term219346, term219346.getClass(), "frameId", -1668505013);
        setIntField(term219346, term219346.getClass(), "selectMapId", -180162862);
        setIntField(term219346, term219346.getClass(), "totalAwake", -912795408);
        setIntField(term219346, term219346.getClass(), "gradeRating", -2050437434);
        setIntField(term219346, term219346.getClass(), "musicRating", -22408249);
        setIntField(term219346, term219346.getClass(), "playerRating", 448698422);
        setIntField(term219346, term219346.getClass(), "highestRating", -2016448879);
        setIntField(term219346, term219346.getClass(), "gradeRank", -433794574);
        setIntField(term219346, term219346.getClass(), "classRank", -556957666);
        setIntField(term219346, term219346.getClass(), "courseRank", 255448931);
        setField(term219346, term219346.getClass(), "charaSlot", term219411);
        setField(term219346, term219346.getClass(), "charaLockSlot", term219419);
        setLongField(term219346, term219346.getClass(), "contentBit", -3273202638826133226L);
        setIntField(term219346, term219346.getClass(), "playCount", 389248106);
        setField(term219346, term219346.getClass(), "eventWatchedDate", "UXYPjTUdsg");
        setField(term219346, term219346.getClass(), "lastGameId", "TDsEccJcrC");
        setField(term219346, term219346.getClass(), "lastRomVersion", "ojoZDfrGLF");
        setField(term219346, term219346.getClass(), "lastDataVersion", "umZNYuIHjr");
        setField(term219346, term219346.getClass(), "lastLoginDate", "PYqvSDpKZx");
        setField(term219346, term219346.getClass(), "lastPlayDate", "VsiRrfHzlR");
        setIntField(term219346, term219346.getClass(), "lastPlayCredit", 1115142984);
        setIntField(term219346, term219346.getClass(), "lastPlayMode", 1661328229);
        setIntField(term219346, term219346.getClass(), "lastPlaceId", 900564501);
        setField(term219346, term219346.getClass(), "lastPlaceName", "VMKhtqoDIF");
        setIntField(term219346, term219346.getClass(), "lastAllNetId", 691426483);
        setIntField(term219346, term219346.getClass(), "lastRegionId", -1874483545);
        setField(term219346, term219346.getClass(), "lastRegionName", "QjSslWnjgU");
        setField(term219346, term219346.getClass(), "lastClientId", "PndRwtrGjN");
        setField(term219346, term219346.getClass(), "lastCountryCode", "vhLZTqWVQe");
        setIntField(term219346, term219346.getClass(), "lastSelectEMoney", -12947994);
        setIntField(term219346, term219346.getClass(), "lastSelectTicket", -2140327885);
        setIntField(term219346, term219346.getClass(), "lastSelectCourse", -716761090);
        setIntField(term219346, term219346.getClass(), "lastCountCourse", 164855440);
        setField(term219346, term219346.getClass(), "firstGameId", "iGnSXIdcDH");
        setField(term219346, term219346.getClass(), "firstRomVersion", "sMDtqWSxXO");
        setField(term219346, term219346.getClass(), "firstDataVersion", "ZPzmrQNgdr");
        setField(term219346, term219346.getClass(), "firstPlayDate", "kGVOVrnPKo");
        setField(term219346, term219346.getClass(), "compatibleCmVersion", "jyyZIotbBe");
        setField(term219346, term219346.getClass(), "dailyBonusDate", "TNNIeLnFpD");
        setField(term219346, term219346.getClass(), "dailyCourseBonusDate", "dgoNMuJqBC");
        setField(term219346, term219346.getClass(), "lastPairLoginDate", "QImucoTzzs");
        setField(term219346, term219346.getClass(), "lastTrialPlayDate", "wNQNdmoeNt");
        setIntField(term219346, term219346.getClass(), "playVsCount", -1814635979);
        setIntField(term219346, term219346.getClass(), "playSyncCount", 4956756);
        setIntField(term219346, term219346.getClass(), "winCount", 1025289060);
        setIntField(term219346, term219346.getClass(), "helpCount", -1825138606);
        setIntField(term219346, term219346.getClass(), "comboCount", -1528237952);
        setLongField(term219346, term219346.getClass(), "totalDeluxscore", -6686996941069004372L);
        setLongField(term219346, term219346.getClass(), "totalBasicDeluxscore", -7105219826727107473L);
        setLongField(term219346, term219346.getClass(), "totalAdvancedDeluxscore", -6366920650507521486L);
        setLongField(term219346, term219346.getClass(), "totalExpertDeluxscore", 66583604441572962L);
        setLongField(term219346, term219346.getClass(), "totalMasterDeluxscore", -2760323169777751324L);
        setLongField(term219346, term219346.getClass(), "totalReMasterDeluxscore", -4877120891991443065L);
        setIntField(term219346, term219346.getClass(), "totalSync", -778347388);
        setIntField(term219346, term219346.getClass(), "totalBasicSync", -1582115328);
        setIntField(term219346, term219346.getClass(), "totalAdvancedSync", -847286682);
        setIntField(term219346, term219346.getClass(), "totalExpertSync", 1928848171);
        setIntField(term219346, term219346.getClass(), "totalMasterSync", -646124218);
        setIntField(term219346, term219346.getClass(), "totalReMasterSync", -1021537887);
        setLongField(term219346, term219346.getClass(), "totalAchievement", 317697620496323748L);
        setLongField(term219346, term219346.getClass(), "totalBasicAchievement", 7113434039163821271L);
        setLongField(term219346, term219346.getClass(), "totalAdvancedAchievement", -4716800369751248906L);
        setLongField(term219346, term219346.getClass(), "totalExpertAchievement", 6190867656233459127L);
        setLongField(term219346, term219346.getClass(), "totalMasterAchievement", -7620000718026172257L);
        setLongField(term219346, term219346.getClass(), "totalReMasterAchievement", -3951747327991411147L);
        setLongField(term219346, term219346.getClass(), "playerOldRating", 7278749259716792201L);
        setLongField(term219346, term219346.getClass(), "playerNewRating", -2508804438678717552L);
        setIntField(term219346, term219346.getClass(), "banState", -1125442276);
        setLongField(term219346, term219346.getClass(), "dateTime", 5759451034243251945L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term219346, args);
    }

};


