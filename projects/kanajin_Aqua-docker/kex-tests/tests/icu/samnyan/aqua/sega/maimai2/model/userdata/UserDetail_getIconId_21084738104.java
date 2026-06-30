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

public class UserDetail_getIconId_21084738104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197846;

    public UserDetail_getIconId_21084738104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term197850 = new Long(4458302820344896046L);
        Integer term197913 = new Integer(-500814419);
        Integer term197915 = new Integer(-584375380);
        Integer term197917 = new Integer(1906067765);
        Integer term197919 = new Integer(-1141978353);
        Integer term197921 = new Integer(1877297875);
        Integer term197923 = new Integer(-614739795);
        Integer term197925 = new Integer(1805124024);
        ArrayList term197911 = new ArrayList();
        ((ArrayList) term197911).add(term197913);
        ((ArrayList) term197911).add(term197915);
        ((ArrayList) term197911).add(term197917);
        ((ArrayList) term197911).add(term197919);
        ((ArrayList) term197911).add(term197921);
        ((ArrayList) term197911).add(term197923);
        ((ArrayList) term197911).add(term197925);
        ArrayList term197929 = new ArrayList();
        term197846 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term197848 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term197864 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term197865 = newInstance(Class.forName("java.time.LocalDate"));
        Object term197869 = newInstance(Class.forName("java.time.LocalTime"));
        Object term197874 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term197875 = newInstance(Class.forName("java.time.LocalDate"));
        Object term197879 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term197846, term197846.getClass(), "id", 2907673097447522431L);
        setLongField(term197848, term197848.getClass(), "id", -7550281487458806119L);
        setField(term197848, term197848.getClass(), "extId", term197850);
        setField(term197848, term197848.getClass(), "luid", "dktEAADiuk");
        setIntField(term197865, term197865.getClass(), "year", 2014);
        setShortField(term197865, term197865.getClass(), "month", (short) 6);
        setShortField(term197865, term197865.getClass(), "day", (short) 12);
        setField(term197864, term197864.getClass(), "date", term197865);
        setByteField(term197869, term197869.getClass(), "hour", (byte) 2);
        setByteField(term197869, term197869.getClass(), "minute", (byte) 24);
        setByteField(term197869, term197869.getClass(), "second", (byte) 28);
        setIntField(term197869, term197869.getClass(), "nano", 77504831);
        setField(term197864, term197864.getClass(), "time", term197869);
        setField(term197848, term197848.getClass(), "registerTime", term197864);
        setIntField(term197875, term197875.getClass(), "year", 2028);
        setShortField(term197875, term197875.getClass(), "month", (short) 11);
        setShortField(term197875, term197875.getClass(), "day", (short) 18);
        setField(term197874, term197874.getClass(), "date", term197875);
        setByteField(term197879, term197879.getClass(), "hour", (byte) 18);
        setByteField(term197879, term197879.getClass(), "minute", (byte) 21);
        setByteField(term197879, term197879.getClass(), "second", (byte) 32);
        setIntField(term197879, term197879.getClass(), "nano", 483463169);
        setField(term197874, term197874.getClass(), "time", term197879);
        setField(term197848, term197848.getClass(), "accessTime", term197874);
        setField(term197846, term197846.getClass(), "card", term197848);
        setField(term197846, term197846.getClass(), "userName", "KzSkjXMULH");
        setIntField(term197846, term197846.getClass(), "isNetMember", 1128316994);
        setIntField(term197846, term197846.getClass(), "iconId", -1431321947);
        setIntField(term197846, term197846.getClass(), "plateId", 1629420340);
        setIntField(term197846, term197846.getClass(), "titleId", 1060055367);
        setIntField(term197846, term197846.getClass(), "partnerId", 2032052675);
        setIntField(term197846, term197846.getClass(), "frameId", 534068484);
        setIntField(term197846, term197846.getClass(), "selectMapId", 2023775166);
        setIntField(term197846, term197846.getClass(), "totalAwake", 2041747664);
        setIntField(term197846, term197846.getClass(), "gradeRating", -55507174);
        setIntField(term197846, term197846.getClass(), "musicRating", 1686211970);
        setIntField(term197846, term197846.getClass(), "playerRating", -1718965606);
        setIntField(term197846, term197846.getClass(), "highestRating", 1584286085);
        setIntField(term197846, term197846.getClass(), "gradeRank", 1829584257);
        setIntField(term197846, term197846.getClass(), "classRank", -1981265348);
        setIntField(term197846, term197846.getClass(), "courseRank", -1586349939);
        setField(term197846, term197846.getClass(), "charaSlot", term197911);
        setField(term197846, term197846.getClass(), "charaLockSlot", term197929);
        setLongField(term197846, term197846.getClass(), "contentBit", -4449926577327941560L);
        setIntField(term197846, term197846.getClass(), "playCount", -2147257341);
        setField(term197846, term197846.getClass(), "eventWatchedDate", "zAtXWhPRak");
        setField(term197846, term197846.getClass(), "lastGameId", "KioasZeahx");
        setField(term197846, term197846.getClass(), "lastRomVersion", "dVNgjQwxWt");
        setField(term197846, term197846.getClass(), "lastDataVersion", "EfWpPcTmvF");
        setField(term197846, term197846.getClass(), "lastLoginDate", "yASxuiMlXa");
        setField(term197846, term197846.getClass(), "lastPlayDate", "gHZbqXXAsK");
        setIntField(term197846, term197846.getClass(), "lastPlayCredit", -295336805);
        setIntField(term197846, term197846.getClass(), "lastPlayMode", -752400077);
        setIntField(term197846, term197846.getClass(), "lastPlaceId", 1527625114);
        setField(term197846, term197846.getClass(), "lastPlaceName", "yVPTdGtpeE");
        setIntField(term197846, term197846.getClass(), "lastAllNetId", -824285797);
        setIntField(term197846, term197846.getClass(), "lastRegionId", -1919566665);
        setField(term197846, term197846.getClass(), "lastRegionName", "lGAVkJkYju");
        setField(term197846, term197846.getClass(), "lastClientId", "ySKgFEQiSA");
        setField(term197846, term197846.getClass(), "lastCountryCode", "wTErQjQBYm");
        setIntField(term197846, term197846.getClass(), "lastSelectEMoney", 527364928);
        setIntField(term197846, term197846.getClass(), "lastSelectTicket", -52905236);
        setIntField(term197846, term197846.getClass(), "lastSelectCourse", 1652428393);
        setIntField(term197846, term197846.getClass(), "lastCountCourse", -1884232363);
        setField(term197846, term197846.getClass(), "firstGameId", "AdTPmAbneR");
        setField(term197846, term197846.getClass(), "firstRomVersion", "bxakWPukmz");
        setField(term197846, term197846.getClass(), "firstDataVersion", "RzPPntXKjQ");
        setField(term197846, term197846.getClass(), "firstPlayDate", "DvgaTRaCbe");
        setField(term197846, term197846.getClass(), "compatibleCmVersion", "UJWyNyJzPg");
        setField(term197846, term197846.getClass(), "dailyBonusDate", "NDbflWbnHO");
        setField(term197846, term197846.getClass(), "dailyCourseBonusDate", "fhexkFzkON");
        setField(term197846, term197846.getClass(), "lastPairLoginDate", "IqVjhRLumD");
        setField(term197846, term197846.getClass(), "lastTrialPlayDate", "xDWanrzIKS");
        setIntField(term197846, term197846.getClass(), "playVsCount", -1687662011);
        setIntField(term197846, term197846.getClass(), "playSyncCount", -1841656072);
        setIntField(term197846, term197846.getClass(), "winCount", 475913381);
        setIntField(term197846, term197846.getClass(), "helpCount", -200214552);
        setIntField(term197846, term197846.getClass(), "comboCount", 87117477);
        setLongField(term197846, term197846.getClass(), "totalDeluxscore", -1243122150545245871L);
        setLongField(term197846, term197846.getClass(), "totalBasicDeluxscore", -220453106544991490L);
        setLongField(term197846, term197846.getClass(), "totalAdvancedDeluxscore", -3227110689773365428L);
        setLongField(term197846, term197846.getClass(), "totalExpertDeluxscore", -2520438920123335755L);
        setLongField(term197846, term197846.getClass(), "totalMasterDeluxscore", -4660168183529399369L);
        setLongField(term197846, term197846.getClass(), "totalReMasterDeluxscore", -6630336192289713270L);
        setIntField(term197846, term197846.getClass(), "totalSync", -871200798);
        setIntField(term197846, term197846.getClass(), "totalBasicSync", 5339448);
        setIntField(term197846, term197846.getClass(), "totalAdvancedSync", -1354552611);
        setIntField(term197846, term197846.getClass(), "totalExpertSync", 1188745205);
        setIntField(term197846, term197846.getClass(), "totalMasterSync", 1472049184);
        setIntField(term197846, term197846.getClass(), "totalReMasterSync", 1392982418);
        setLongField(term197846, term197846.getClass(), "totalAchievement", 8056653133846760866L);
        setLongField(term197846, term197846.getClass(), "totalBasicAchievement", 3965567100905628136L);
        setLongField(term197846, term197846.getClass(), "totalAdvancedAchievement", -7834143844726848544L);
        setLongField(term197846, term197846.getClass(), "totalExpertAchievement", -9139306278104558329L);
        setLongField(term197846, term197846.getClass(), "totalMasterAchievement", 1308491220938257201L);
        setLongField(term197846, term197846.getClass(), "totalReMasterAchievement", -7505572726357621067L);
        setLongField(term197846, term197846.getClass(), "playerOldRating", -6106805783768810845L);
        setLongField(term197846, term197846.getClass(), "playerNewRating", 3214381382665107801L);
        setIntField(term197846, term197846.getClass(), "banState", -1572413221);
        setLongField(term197846, term197846.getClass(), "dateTime", -7106226430278364620L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIconId", argTypes, term197846, args);
    }

};


