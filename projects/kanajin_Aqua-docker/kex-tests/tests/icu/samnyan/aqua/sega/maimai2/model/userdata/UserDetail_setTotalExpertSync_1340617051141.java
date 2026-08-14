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

public class UserDetail_setTotalExpertSync_1340617051141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275881;
     Object term276244;

    public UserDetail_setTotalExpertSync_1340617051141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term275885 = new Long(-6254265799185295775L);
        Integer term275948 = new Integer(-460205484);
        Integer term275950 = new Integer(-1144163240);
        Integer term275952 = new Integer(2135238175);
        Integer term275954 = new Integer(-407365393);
        Integer term275956 = new Integer(1408195458);
        Integer term275958 = new Integer(1129173756);
        Integer term275960 = new Integer(267573446);
        ArrayList term275946 = new ArrayList();
        ((ArrayList) term275946).add(term275948);
        ((ArrayList) term275946).add(term275950);
        ((ArrayList) term275946).add(term275952);
        ((ArrayList) term275946).add(term275954);
        ((ArrayList) term275946).add(term275956);
        ((ArrayList) term275946).add(term275958);
        ((ArrayList) term275946).add(term275960);
        Integer term275966 = new Integer(-1319954987);
        Integer term275968 = new Integer(701324276);
        Integer term275970 = new Integer(-2141408767);
        Integer term275972 = new Integer(2033366485);
        Integer term275974 = new Integer(688731975);
        ArrayList term275964 = new ArrayList();
        ((ArrayList) term275964).add(term275966);
        ((ArrayList) term275964).add(term275968);
        ((ArrayList) term275964).add(term275970);
        ((ArrayList) term275964).add(term275972);
        ((ArrayList) term275964).add(term275974);
        term275881 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term275883 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term275899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275904 = newInstance(Class.forName("java.time.LocalTime"));
        Object term275909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275914 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term275881, term275881.getClass(), "id", 8876130768964930404L);
        setLongField(term275883, term275883.getClass(), "id", -2196282296874268749L);
        setField(term275883, term275883.getClass(), "extId", term275885);
        setField(term275883, term275883.getClass(), "luid", "snxtaDACxI");
        setIntField(term275900, term275900.getClass(), "year", 2021);
        setShortField(term275900, term275900.getClass(), "month", (short) 4);
        setShortField(term275900, term275900.getClass(), "day", (short) 3);
        setField(term275899, term275899.getClass(), "date", term275900);
        setByteField(term275904, term275904.getClass(), "hour", (byte) 12);
        setByteField(term275904, term275904.getClass(), "minute", (byte) 34);
        setByteField(term275904, term275904.getClass(), "second", (byte) 25);
        setIntField(term275904, term275904.getClass(), "nano", 691683257);
        setField(term275899, term275899.getClass(), "time", term275904);
        setField(term275883, term275883.getClass(), "registerTime", term275899);
        setIntField(term275910, term275910.getClass(), "year", 2010);
        setShortField(term275910, term275910.getClass(), "month", (short) 9);
        setShortField(term275910, term275910.getClass(), "day", (short) 12);
        setField(term275909, term275909.getClass(), "date", term275910);
        setByteField(term275914, term275914.getClass(), "hour", (byte) 19);
        setByteField(term275914, term275914.getClass(), "minute", (byte) 55);
        setByteField(term275914, term275914.getClass(), "second", (byte) 15);
        setIntField(term275914, term275914.getClass(), "nano", 784115402);
        setField(term275909, term275909.getClass(), "time", term275914);
        setField(term275883, term275883.getClass(), "accessTime", term275909);
        setField(term275881, term275881.getClass(), "card", term275883);
        setField(term275881, term275881.getClass(), "userName", "duHWXIEHJg");
        setIntField(term275881, term275881.getClass(), "isNetMember", -2092774130);
        setIntField(term275881, term275881.getClass(), "iconId", -1169966252);
        setIntField(term275881, term275881.getClass(), "plateId", -818418397);
        setIntField(term275881, term275881.getClass(), "titleId", -2117133876);
        setIntField(term275881, term275881.getClass(), "partnerId", -1419806086);
        setIntField(term275881, term275881.getClass(), "frameId", -506269910);
        setIntField(term275881, term275881.getClass(), "selectMapId", 937160250);
        setIntField(term275881, term275881.getClass(), "totalAwake", 1724814262);
        setIntField(term275881, term275881.getClass(), "gradeRating", -362349898);
        setIntField(term275881, term275881.getClass(), "musicRating", -569261309);
        setIntField(term275881, term275881.getClass(), "playerRating", -853939727);
        setIntField(term275881, term275881.getClass(), "highestRating", 416632574);
        setIntField(term275881, term275881.getClass(), "gradeRank", 759801111);
        setIntField(term275881, term275881.getClass(), "classRank", -844675169);
        setIntField(term275881, term275881.getClass(), "courseRank", -714313525);
        setField(term275881, term275881.getClass(), "charaSlot", term275946);
        setField(term275881, term275881.getClass(), "charaLockSlot", term275964);
        setLongField(term275881, term275881.getClass(), "contentBit", 8161723171808749414L);
        setIntField(term275881, term275881.getClass(), "playCount", 1266686205);
        setField(term275881, term275881.getClass(), "eventWatchedDate", "ZIBJhPTjUC");
        setField(term275881, term275881.getClass(), "lastGameId", "HfVZfQLaid");
        setField(term275881, term275881.getClass(), "lastRomVersion", "oGqNndpbAv");
        setField(term275881, term275881.getClass(), "lastDataVersion", "LKqZFyBPlu");
        setField(term275881, term275881.getClass(), "lastLoginDate", "uAbRBIwjeP");
        setField(term275881, term275881.getClass(), "lastPlayDate", "elwCYVqzgd");
        setIntField(term275881, term275881.getClass(), "lastPlayCredit", 342577277);
        setIntField(term275881, term275881.getClass(), "lastPlayMode", 782543565);
        setIntField(term275881, term275881.getClass(), "lastPlaceId", -1895763167);
        setField(term275881, term275881.getClass(), "lastPlaceName", "KpeLAmTSZv");
        setIntField(term275881, term275881.getClass(), "lastAllNetId", 25974685);
        setIntField(term275881, term275881.getClass(), "lastRegionId", -748415491);
        setField(term275881, term275881.getClass(), "lastRegionName", "oQHSSTasHn");
        setField(term275881, term275881.getClass(), "lastClientId", "UwaZEvHuEW");
        setField(term275881, term275881.getClass(), "lastCountryCode", "DgPLwibCes");
        setIntField(term275881, term275881.getClass(), "lastSelectEMoney", -106467519);
        setIntField(term275881, term275881.getClass(), "lastSelectTicket", -891158934);
        setIntField(term275881, term275881.getClass(), "lastSelectCourse", 59717458);
        setIntField(term275881, term275881.getClass(), "lastCountCourse", 1161304512);
        setField(term275881, term275881.getClass(), "firstGameId", "MPlJZtSIPY");
        setField(term275881, term275881.getClass(), "firstRomVersion", "lXAoNyaPgl");
        setField(term275881, term275881.getClass(), "firstDataVersion", "nltplwQYWi");
        setField(term275881, term275881.getClass(), "firstPlayDate", "lNObKuUwLW");
        setField(term275881, term275881.getClass(), "compatibleCmVersion", "YiMvbxuceI");
        setField(term275881, term275881.getClass(), "dailyBonusDate", "itdajcOwPM");
        setField(term275881, term275881.getClass(), "dailyCourseBonusDate", "iNatfbDqSr");
        setField(term275881, term275881.getClass(), "lastPairLoginDate", "nvFBEPJXDP");
        setField(term275881, term275881.getClass(), "lastTrialPlayDate", "mUquGBKYgP");
        setIntField(term275881, term275881.getClass(), "playVsCount", 1179045291);
        setIntField(term275881, term275881.getClass(), "playSyncCount", 187796156);
        setIntField(term275881, term275881.getClass(), "winCount", 236799050);
        setIntField(term275881, term275881.getClass(), "helpCount", 2059959850);
        setIntField(term275881, term275881.getClass(), "comboCount", -926051580);
        setLongField(term275881, term275881.getClass(), "totalDeluxscore", -8881978677676263555L);
        setLongField(term275881, term275881.getClass(), "totalBasicDeluxscore", -4301796834555723485L);
        setLongField(term275881, term275881.getClass(), "totalAdvancedDeluxscore", 1008522736363382122L);
        setLongField(term275881, term275881.getClass(), "totalExpertDeluxscore", 8273282359330391824L);
        setLongField(term275881, term275881.getClass(), "totalMasterDeluxscore", -4887332090508106929L);
        setLongField(term275881, term275881.getClass(), "totalReMasterDeluxscore", -1215614544251852617L);
        setIntField(term275881, term275881.getClass(), "totalSync", -696509293);
        setIntField(term275881, term275881.getClass(), "totalBasicSync", 355853026);
        setIntField(term275881, term275881.getClass(), "totalAdvancedSync", -1598167746);
        setIntField(term275881, term275881.getClass(), "totalExpertSync", 1736642602);
        setIntField(term275881, term275881.getClass(), "totalMasterSync", 58048208);
        setIntField(term275881, term275881.getClass(), "totalReMasterSync", 1074355036);
        setLongField(term275881, term275881.getClass(), "totalAchievement", -435558521951399005L);
        setLongField(term275881, term275881.getClass(), "totalBasicAchievement", 7481966885540014554L);
        setLongField(term275881, term275881.getClass(), "totalAdvancedAchievement", -1996675334260413630L);
        setLongField(term275881, term275881.getClass(), "totalExpertAchievement", 852205516604605405L);
        setLongField(term275881, term275881.getClass(), "totalMasterAchievement", 7668468729288543085L);
        setLongField(term275881, term275881.getClass(), "totalReMasterAchievement", 4893413470713559397L);
        setLongField(term275881, term275881.getClass(), "playerOldRating", -5716605880716134379L);
        setLongField(term275881, term275881.getClass(), "playerNewRating", -571217323782832069L);
        setIntField(term275881, term275881.getClass(), "banState", 55518272);
        setLongField(term275881, term275881.getClass(), "dateTime", 1899181225864408664L);
        term276244 = new Integer(786099887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276244;
        callMethod(klass, "setTotalExpertSync", argTypes, term275881, args);
    }

};


