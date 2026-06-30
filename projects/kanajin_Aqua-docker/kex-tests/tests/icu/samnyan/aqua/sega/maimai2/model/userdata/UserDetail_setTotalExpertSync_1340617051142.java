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

public class UserDetail_setTotalExpertSync_1340617051142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275936;
     Object term276299;

    public UserDetail_setTotalExpertSync_1340617051142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term275940 = new Long(-6254265799185295775L);
        Integer term276003 = new Integer(-460205484);
        Integer term276005 = new Integer(-1144163240);
        Integer term276007 = new Integer(2135238175);
        Integer term276009 = new Integer(-407365393);
        Integer term276011 = new Integer(1408195458);
        Integer term276013 = new Integer(1129173756);
        Integer term276015 = new Integer(267573446);
        ArrayList term276001 = new ArrayList();
        ((ArrayList) term276001).add(term276003);
        ((ArrayList) term276001).add(term276005);
        ((ArrayList) term276001).add(term276007);
        ((ArrayList) term276001).add(term276009);
        ((ArrayList) term276001).add(term276011);
        ((ArrayList) term276001).add(term276013);
        ((ArrayList) term276001).add(term276015);
        Integer term276021 = new Integer(-1319954987);
        Integer term276023 = new Integer(701324276);
        Integer term276025 = new Integer(-2141408767);
        Integer term276027 = new Integer(2033366485);
        Integer term276029 = new Integer(688731975);
        ArrayList term276019 = new ArrayList();
        ((ArrayList) term276019).add(term276021);
        ((ArrayList) term276019).add(term276023);
        ((ArrayList) term276019).add(term276025);
        ((ArrayList) term276019).add(term276027);
        ((ArrayList) term276019).add(term276029);
        term275936 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term275938 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term275954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275959 = newInstance(Class.forName("java.time.LocalTime"));
        Object term275964 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275965 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275969 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term275936, term275936.getClass(), "id", 8876130768964930404L);
        setLongField(term275938, term275938.getClass(), "id", -2196282296874268749L);
        setField(term275938, term275938.getClass(), "extId", term275940);
        setField(term275938, term275938.getClass(), "luid", "snxtaDACxI");
        setIntField(term275955, term275955.getClass(), "year", 2021);
        setShortField(term275955, term275955.getClass(), "month", (short) 4);
        setShortField(term275955, term275955.getClass(), "day", (short) 3);
        setField(term275954, term275954.getClass(), "date", term275955);
        setByteField(term275959, term275959.getClass(), "hour", (byte) 12);
        setByteField(term275959, term275959.getClass(), "minute", (byte) 34);
        setByteField(term275959, term275959.getClass(), "second", (byte) 25);
        setIntField(term275959, term275959.getClass(), "nano", 691683257);
        setField(term275954, term275954.getClass(), "time", term275959);
        setField(term275938, term275938.getClass(), "registerTime", term275954);
        setIntField(term275965, term275965.getClass(), "year", 2010);
        setShortField(term275965, term275965.getClass(), "month", (short) 9);
        setShortField(term275965, term275965.getClass(), "day", (short) 12);
        setField(term275964, term275964.getClass(), "date", term275965);
        setByteField(term275969, term275969.getClass(), "hour", (byte) 19);
        setByteField(term275969, term275969.getClass(), "minute", (byte) 55);
        setByteField(term275969, term275969.getClass(), "second", (byte) 15);
        setIntField(term275969, term275969.getClass(), "nano", 784115402);
        setField(term275964, term275964.getClass(), "time", term275969);
        setField(term275938, term275938.getClass(), "accessTime", term275964);
        setField(term275936, term275936.getClass(), "card", term275938);
        setField(term275936, term275936.getClass(), "userName", "duHWXIEHJg");
        setIntField(term275936, term275936.getClass(), "isNetMember", -2092774130);
        setIntField(term275936, term275936.getClass(), "iconId", -1169966252);
        setIntField(term275936, term275936.getClass(), "plateId", -818418397);
        setIntField(term275936, term275936.getClass(), "titleId", -2117133876);
        setIntField(term275936, term275936.getClass(), "partnerId", -1419806086);
        setIntField(term275936, term275936.getClass(), "frameId", -506269910);
        setIntField(term275936, term275936.getClass(), "selectMapId", 937160250);
        setIntField(term275936, term275936.getClass(), "totalAwake", 1724814262);
        setIntField(term275936, term275936.getClass(), "gradeRating", -362349898);
        setIntField(term275936, term275936.getClass(), "musicRating", -569261309);
        setIntField(term275936, term275936.getClass(), "playerRating", -853939727);
        setIntField(term275936, term275936.getClass(), "highestRating", 416632574);
        setIntField(term275936, term275936.getClass(), "gradeRank", 759801111);
        setIntField(term275936, term275936.getClass(), "classRank", -844675169);
        setIntField(term275936, term275936.getClass(), "courseRank", -714313525);
        setField(term275936, term275936.getClass(), "charaSlot", term276001);
        setField(term275936, term275936.getClass(), "charaLockSlot", term276019);
        setLongField(term275936, term275936.getClass(), "contentBit", 8161723171808749414L);
        setIntField(term275936, term275936.getClass(), "playCount", 1266686205);
        setField(term275936, term275936.getClass(), "eventWatchedDate", "ZIBJhPTjUC");
        setField(term275936, term275936.getClass(), "lastGameId", "HfVZfQLaid");
        setField(term275936, term275936.getClass(), "lastRomVersion", "oGqNndpbAv");
        setField(term275936, term275936.getClass(), "lastDataVersion", "LKqZFyBPlu");
        setField(term275936, term275936.getClass(), "lastLoginDate", "uAbRBIwjeP");
        setField(term275936, term275936.getClass(), "lastPlayDate", "elwCYVqzgd");
        setIntField(term275936, term275936.getClass(), "lastPlayCredit", 342577277);
        setIntField(term275936, term275936.getClass(), "lastPlayMode", 782543565);
        setIntField(term275936, term275936.getClass(), "lastPlaceId", -1895763167);
        setField(term275936, term275936.getClass(), "lastPlaceName", "KpeLAmTSZv");
        setIntField(term275936, term275936.getClass(), "lastAllNetId", 25974685);
        setIntField(term275936, term275936.getClass(), "lastRegionId", -748415491);
        setField(term275936, term275936.getClass(), "lastRegionName", "oQHSSTasHn");
        setField(term275936, term275936.getClass(), "lastClientId", "UwaZEvHuEW");
        setField(term275936, term275936.getClass(), "lastCountryCode", "DgPLwibCes");
        setIntField(term275936, term275936.getClass(), "lastSelectEMoney", -106467519);
        setIntField(term275936, term275936.getClass(), "lastSelectTicket", -891158934);
        setIntField(term275936, term275936.getClass(), "lastSelectCourse", 59717458);
        setIntField(term275936, term275936.getClass(), "lastCountCourse", 1161304512);
        setField(term275936, term275936.getClass(), "firstGameId", "MPlJZtSIPY");
        setField(term275936, term275936.getClass(), "firstRomVersion", "lXAoNyaPgl");
        setField(term275936, term275936.getClass(), "firstDataVersion", "nltplwQYWi");
        setField(term275936, term275936.getClass(), "firstPlayDate", "lNObKuUwLW");
        setField(term275936, term275936.getClass(), "compatibleCmVersion", "YiMvbxuceI");
        setField(term275936, term275936.getClass(), "dailyBonusDate", "itdajcOwPM");
        setField(term275936, term275936.getClass(), "dailyCourseBonusDate", "iNatfbDqSr");
        setField(term275936, term275936.getClass(), "lastPairLoginDate", "nvFBEPJXDP");
        setField(term275936, term275936.getClass(), "lastTrialPlayDate", "mUquGBKYgP");
        setIntField(term275936, term275936.getClass(), "playVsCount", 1179045291);
        setIntField(term275936, term275936.getClass(), "playSyncCount", 187796156);
        setIntField(term275936, term275936.getClass(), "winCount", 236799050);
        setIntField(term275936, term275936.getClass(), "helpCount", 2059959850);
        setIntField(term275936, term275936.getClass(), "comboCount", -926051580);
        setLongField(term275936, term275936.getClass(), "totalDeluxscore", -8881978677676263555L);
        setLongField(term275936, term275936.getClass(), "totalBasicDeluxscore", -4301796834555723485L);
        setLongField(term275936, term275936.getClass(), "totalAdvancedDeluxscore", 1008522736363382122L);
        setLongField(term275936, term275936.getClass(), "totalExpertDeluxscore", 8273282359330391824L);
        setLongField(term275936, term275936.getClass(), "totalMasterDeluxscore", -4887332090508106929L);
        setLongField(term275936, term275936.getClass(), "totalReMasterDeluxscore", -1215614544251852617L);
        setIntField(term275936, term275936.getClass(), "totalSync", -696509293);
        setIntField(term275936, term275936.getClass(), "totalBasicSync", 355853026);
        setIntField(term275936, term275936.getClass(), "totalAdvancedSync", -1598167746);
        setIntField(term275936, term275936.getClass(), "totalExpertSync", 1736642602);
        setIntField(term275936, term275936.getClass(), "totalMasterSync", 58048208);
        setIntField(term275936, term275936.getClass(), "totalReMasterSync", 1074355036);
        setLongField(term275936, term275936.getClass(), "totalAchievement", -435558521951399005L);
        setLongField(term275936, term275936.getClass(), "totalBasicAchievement", 7481966885540014554L);
        setLongField(term275936, term275936.getClass(), "totalAdvancedAchievement", -1996675334260413630L);
        setLongField(term275936, term275936.getClass(), "totalExpertAchievement", 852205516604605405L);
        setLongField(term275936, term275936.getClass(), "totalMasterAchievement", 7668468729288543085L);
        setLongField(term275936, term275936.getClass(), "totalReMasterAchievement", 4893413470713559397L);
        setLongField(term275936, term275936.getClass(), "playerOldRating", -5716605880716134379L);
        setLongField(term275936, term275936.getClass(), "playerNewRating", -571217323782832069L);
        setIntField(term275936, term275936.getClass(), "banState", 55518272);
        setLongField(term275936, term275936.getClass(), "dateTime", 1899181225864408664L);
        term276299 = new Integer(786099887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276299;
        callMethod(klass, "setTotalExpertSync", argTypes, term275936, args);
    }

};


