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

public class UserDetail_getFirstRomVersion_174479611143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219401;

    public UserDetail_getFirstRomVersion_174479611143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term219405 = new Long(-8993073054427011802L);
        Integer term219468 = new Integer(-108045978);
        Integer term219470 = new Integer(-1242612066);
        ArrayList term219466 = new ArrayList();
        ((ArrayList) term219466).add(term219468);
        ((ArrayList) term219466).add(term219470);
        Integer term219476 = new Integer(-1492896610);
        Integer term219478 = new Integer(1239212151);
        ArrayList term219474 = new ArrayList();
        ((ArrayList) term219474).add(term219476);
        ((ArrayList) term219474).add(term219478);
        term219401 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term219403 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term219419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219424 = newInstance(Class.forName("java.time.LocalTime"));
        Object term219429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219434 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term219401, term219401.getClass(), "id", -648918313748693919L);
        setLongField(term219403, term219403.getClass(), "id", 4588689385775306407L);
        setField(term219403, term219403.getClass(), "extId", term219405);
        setField(term219403, term219403.getClass(), "luid", "BAvlbsjYmi");
        setIntField(term219420, term219420.getClass(), "year", 2021);
        setShortField(term219420, term219420.getClass(), "month", (short) 4);
        setShortField(term219420, term219420.getClass(), "day", (short) 17);
        setField(term219419, term219419.getClass(), "date", term219420);
        setByteField(term219424, term219424.getClass(), "hour", (byte) 22);
        setByteField(term219424, term219424.getClass(), "minute", (byte) 34);
        setByteField(term219424, term219424.getClass(), "second", (byte) 19);
        setIntField(term219424, term219424.getClass(), "nano", 565497804);
        setField(term219419, term219419.getClass(), "time", term219424);
        setField(term219403, term219403.getClass(), "registerTime", term219419);
        setIntField(term219430, term219430.getClass(), "year", 2019);
        setShortField(term219430, term219430.getClass(), "month", (short) 11);
        setShortField(term219430, term219430.getClass(), "day", (short) 26);
        setField(term219429, term219429.getClass(), "date", term219430);
        setByteField(term219434, term219434.getClass(), "hour", (byte) 21);
        setByteField(term219434, term219434.getClass(), "minute", (byte) 16);
        setByteField(term219434, term219434.getClass(), "second", (byte) 42);
        setIntField(term219434, term219434.getClass(), "nano", 559995047);
        setField(term219429, term219429.getClass(), "time", term219434);
        setField(term219403, term219403.getClass(), "accessTime", term219429);
        setField(term219401, term219401.getClass(), "card", term219403);
        setField(term219401, term219401.getClass(), "userName", "JStBEULwgX");
        setIntField(term219401, term219401.getClass(), "isNetMember", 709648293);
        setIntField(term219401, term219401.getClass(), "iconId", 1968045816);
        setIntField(term219401, term219401.getClass(), "plateId", 2026259813);
        setIntField(term219401, term219401.getClass(), "titleId", 1869405361);
        setIntField(term219401, term219401.getClass(), "partnerId", -1535999317);
        setIntField(term219401, term219401.getClass(), "frameId", -1668505013);
        setIntField(term219401, term219401.getClass(), "selectMapId", -180162862);
        setIntField(term219401, term219401.getClass(), "totalAwake", -912795408);
        setIntField(term219401, term219401.getClass(), "gradeRating", -2050437434);
        setIntField(term219401, term219401.getClass(), "musicRating", -22408249);
        setIntField(term219401, term219401.getClass(), "playerRating", 448698422);
        setIntField(term219401, term219401.getClass(), "highestRating", -2016448879);
        setIntField(term219401, term219401.getClass(), "gradeRank", -433794574);
        setIntField(term219401, term219401.getClass(), "classRank", -556957666);
        setIntField(term219401, term219401.getClass(), "courseRank", 255448931);
        setField(term219401, term219401.getClass(), "charaSlot", term219466);
        setField(term219401, term219401.getClass(), "charaLockSlot", term219474);
        setLongField(term219401, term219401.getClass(), "contentBit", -3273202638826133226L);
        setIntField(term219401, term219401.getClass(), "playCount", 389248106);
        setField(term219401, term219401.getClass(), "eventWatchedDate", "UXYPjTUdsg");
        setField(term219401, term219401.getClass(), "lastGameId", "TDsEccJcrC");
        setField(term219401, term219401.getClass(), "lastRomVersion", "ojoZDfrGLF");
        setField(term219401, term219401.getClass(), "lastDataVersion", "umZNYuIHjr");
        setField(term219401, term219401.getClass(), "lastLoginDate", "PYqvSDpKZx");
        setField(term219401, term219401.getClass(), "lastPlayDate", "VsiRrfHzlR");
        setIntField(term219401, term219401.getClass(), "lastPlayCredit", 1115142984);
        setIntField(term219401, term219401.getClass(), "lastPlayMode", 1661328229);
        setIntField(term219401, term219401.getClass(), "lastPlaceId", 900564501);
        setField(term219401, term219401.getClass(), "lastPlaceName", "VMKhtqoDIF");
        setIntField(term219401, term219401.getClass(), "lastAllNetId", 691426483);
        setIntField(term219401, term219401.getClass(), "lastRegionId", -1874483545);
        setField(term219401, term219401.getClass(), "lastRegionName", "QjSslWnjgU");
        setField(term219401, term219401.getClass(), "lastClientId", "PndRwtrGjN");
        setField(term219401, term219401.getClass(), "lastCountryCode", "vhLZTqWVQe");
        setIntField(term219401, term219401.getClass(), "lastSelectEMoney", -12947994);
        setIntField(term219401, term219401.getClass(), "lastSelectTicket", -2140327885);
        setIntField(term219401, term219401.getClass(), "lastSelectCourse", -716761090);
        setIntField(term219401, term219401.getClass(), "lastCountCourse", 164855440);
        setField(term219401, term219401.getClass(), "firstGameId", "iGnSXIdcDH");
        setField(term219401, term219401.getClass(), "firstRomVersion", "sMDtqWSxXO");
        setField(term219401, term219401.getClass(), "firstDataVersion", "ZPzmrQNgdr");
        setField(term219401, term219401.getClass(), "firstPlayDate", "kGVOVrnPKo");
        setField(term219401, term219401.getClass(), "compatibleCmVersion", "jyyZIotbBe");
        setField(term219401, term219401.getClass(), "dailyBonusDate", "TNNIeLnFpD");
        setField(term219401, term219401.getClass(), "dailyCourseBonusDate", "dgoNMuJqBC");
        setField(term219401, term219401.getClass(), "lastPairLoginDate", "QImucoTzzs");
        setField(term219401, term219401.getClass(), "lastTrialPlayDate", "wNQNdmoeNt");
        setIntField(term219401, term219401.getClass(), "playVsCount", -1814635979);
        setIntField(term219401, term219401.getClass(), "playSyncCount", 4956756);
        setIntField(term219401, term219401.getClass(), "winCount", 1025289060);
        setIntField(term219401, term219401.getClass(), "helpCount", -1825138606);
        setIntField(term219401, term219401.getClass(), "comboCount", -1528237952);
        setLongField(term219401, term219401.getClass(), "totalDeluxscore", -6686996941069004372L);
        setLongField(term219401, term219401.getClass(), "totalBasicDeluxscore", -7105219826727107473L);
        setLongField(term219401, term219401.getClass(), "totalAdvancedDeluxscore", -6366920650507521486L);
        setLongField(term219401, term219401.getClass(), "totalExpertDeluxscore", 66583604441572962L);
        setLongField(term219401, term219401.getClass(), "totalMasterDeluxscore", -2760323169777751324L);
        setLongField(term219401, term219401.getClass(), "totalReMasterDeluxscore", -4877120891991443065L);
        setIntField(term219401, term219401.getClass(), "totalSync", -778347388);
        setIntField(term219401, term219401.getClass(), "totalBasicSync", -1582115328);
        setIntField(term219401, term219401.getClass(), "totalAdvancedSync", -847286682);
        setIntField(term219401, term219401.getClass(), "totalExpertSync", 1928848171);
        setIntField(term219401, term219401.getClass(), "totalMasterSync", -646124218);
        setIntField(term219401, term219401.getClass(), "totalReMasterSync", -1021537887);
        setLongField(term219401, term219401.getClass(), "totalAchievement", 317697620496323748L);
        setLongField(term219401, term219401.getClass(), "totalBasicAchievement", 7113434039163821271L);
        setLongField(term219401, term219401.getClass(), "totalAdvancedAchievement", -4716800369751248906L);
        setLongField(term219401, term219401.getClass(), "totalExpertAchievement", 6190867656233459127L);
        setLongField(term219401, term219401.getClass(), "totalMasterAchievement", -7620000718026172257L);
        setLongField(term219401, term219401.getClass(), "totalReMasterAchievement", -3951747327991411147L);
        setLongField(term219401, term219401.getClass(), "playerOldRating", 7278749259716792201L);
        setLongField(term219401, term219401.getClass(), "playerNewRating", -2508804438678717552L);
        setIntField(term219401, term219401.getClass(), "banState", -1125442276);
        setLongField(term219401, term219401.getClass(), "dateTime", 5759451034243251945L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term219401, args);
    }

};


