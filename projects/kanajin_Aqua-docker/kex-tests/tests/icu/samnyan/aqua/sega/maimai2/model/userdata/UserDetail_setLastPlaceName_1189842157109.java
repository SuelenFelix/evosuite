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

public class UserDetail_setLastPlaceName_1189842157109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256961;

    public UserDetail_setLastPlaceName_1189842157109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term256965 = new Long(-997945615782059734L);
        Integer term257028 = new Integer(236114197);
        Integer term257030 = new Integer(-1633292626);
        ArrayList term257026 = new ArrayList();
        ((ArrayList) term257026).add(term257028);
        ((ArrayList) term257026).add(term257030);
        Integer term257036 = new Integer(689769597);
        Integer term257038 = new Integer(-1219602723);
        Integer term257040 = new Integer(1668201364);
        Integer term257042 = new Integer(-548343635);
        Integer term257044 = new Integer(-590979324);
        Integer term257046 = new Integer(-1745427158);
        Integer term257048 = new Integer(1516032954);
        ArrayList term257034 = new ArrayList();
        ((ArrayList) term257034).add(term257036);
        ((ArrayList) term257034).add(term257038);
        ((ArrayList) term257034).add(term257040);
        ((ArrayList) term257034).add(term257042);
        ((ArrayList) term257034).add(term257044);
        ((ArrayList) term257034).add(term257046);
        ((ArrayList) term257034).add(term257048);
        term256961 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term256963 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term256979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term256989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256994 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term256961, term256961.getClass(), "id", -5567713960293143918L);
        setLongField(term256963, term256963.getClass(), "id", 2796443349725503199L);
        setField(term256963, term256963.getClass(), "extId", term256965);
        setField(term256963, term256963.getClass(), "luid", "phnhOsIrPf");
        setIntField(term256980, term256980.getClass(), "year", 2014);
        setShortField(term256980, term256980.getClass(), "month", (short) 3);
        setShortField(term256980, term256980.getClass(), "day", (short) 6);
        setField(term256979, term256979.getClass(), "date", term256980);
        setByteField(term256984, term256984.getClass(), "hour", (byte) 3);
        setByteField(term256984, term256984.getClass(), "minute", (byte) 21);
        setByteField(term256984, term256984.getClass(), "second", (byte) 53);
        setIntField(term256984, term256984.getClass(), "nano", 978038024);
        setField(term256979, term256979.getClass(), "time", term256984);
        setField(term256963, term256963.getClass(), "registerTime", term256979);
        setIntField(term256990, term256990.getClass(), "year", 2013);
        setShortField(term256990, term256990.getClass(), "month", (short) 5);
        setShortField(term256990, term256990.getClass(), "day", (short) 10);
        setField(term256989, term256989.getClass(), "date", term256990);
        setByteField(term256994, term256994.getClass(), "hour", (byte) 8);
        setByteField(term256994, term256994.getClass(), "minute", (byte) 51);
        setByteField(term256994, term256994.getClass(), "second", (byte) 38);
        setIntField(term256994, term256994.getClass(), "nano", 326978944);
        setField(term256989, term256989.getClass(), "time", term256994);
        setField(term256963, term256963.getClass(), "accessTime", term256989);
        setField(term256961, term256961.getClass(), "card", term256963);
        setField(term256961, term256961.getClass(), "userName", "IqCiPyIYlC");
        setIntField(term256961, term256961.getClass(), "isNetMember", 1905421633);
        setIntField(term256961, term256961.getClass(), "iconId", 83824083);
        setIntField(term256961, term256961.getClass(), "plateId", 808572108);
        setIntField(term256961, term256961.getClass(), "titleId", 1104236955);
        setIntField(term256961, term256961.getClass(), "partnerId", 626404062);
        setIntField(term256961, term256961.getClass(), "frameId", 1954724158);
        setIntField(term256961, term256961.getClass(), "selectMapId", 1561676074);
        setIntField(term256961, term256961.getClass(), "totalAwake", 1690665676);
        setIntField(term256961, term256961.getClass(), "gradeRating", -80665419);
        setIntField(term256961, term256961.getClass(), "musicRating", 789488298);
        setIntField(term256961, term256961.getClass(), "playerRating", -1152670111);
        setIntField(term256961, term256961.getClass(), "highestRating", -1200569780);
        setIntField(term256961, term256961.getClass(), "gradeRank", 1982581757);
        setIntField(term256961, term256961.getClass(), "classRank", -100806416);
        setIntField(term256961, term256961.getClass(), "courseRank", -1060172488);
        setField(term256961, term256961.getClass(), "charaSlot", term257026);
        setField(term256961, term256961.getClass(), "charaLockSlot", term257034);
        setLongField(term256961, term256961.getClass(), "contentBit", 8324766592876876646L);
        setIntField(term256961, term256961.getClass(), "playCount", 191812624);
        setField(term256961, term256961.getClass(), "eventWatchedDate", "AaoQDNZhnS");
        setField(term256961, term256961.getClass(), "lastGameId", "IKAtLbhKWa");
        setField(term256961, term256961.getClass(), "lastRomVersion", "DYgUODVEAY");
        setField(term256961, term256961.getClass(), "lastDataVersion", "wVWNIpvTso");
        setField(term256961, term256961.getClass(), "lastLoginDate", "fdTrnfevnD");
        setField(term256961, term256961.getClass(), "lastPlayDate", "pSwgKxEgKt");
        setIntField(term256961, term256961.getClass(), "lastPlayCredit", 1321788637);
        setIntField(term256961, term256961.getClass(), "lastPlayMode", -1233600149);
        setIntField(term256961, term256961.getClass(), "lastPlaceId", -2080709049);
        setField(term256961, term256961.getClass(), "lastPlaceName", "fBoTpMYSyX");
        setIntField(term256961, term256961.getClass(), "lastAllNetId", 148521677);
        setIntField(term256961, term256961.getClass(), "lastRegionId", 2029502457);
        setField(term256961, term256961.getClass(), "lastRegionName", "BbROkBKzRp");
        setField(term256961, term256961.getClass(), "lastClientId", "WqsZmoEMhC");
        setField(term256961, term256961.getClass(), "lastCountryCode", "PZnyLdXxJA");
        setIntField(term256961, term256961.getClass(), "lastSelectEMoney", -171777022);
        setIntField(term256961, term256961.getClass(), "lastSelectTicket", 1235568553);
        setIntField(term256961, term256961.getClass(), "lastSelectCourse", 1684825497);
        setIntField(term256961, term256961.getClass(), "lastCountCourse", 502790478);
        setField(term256961, term256961.getClass(), "firstGameId", "vQxIPNOxke");
        setField(term256961, term256961.getClass(), "firstRomVersion", "sEwNYnInbT");
        setField(term256961, term256961.getClass(), "firstDataVersion", "KLfssEwvtj");
        setField(term256961, term256961.getClass(), "firstPlayDate", "juDedtXBCp");
        setField(term256961, term256961.getClass(), "compatibleCmVersion", "mUfRoHLCvm");
        setField(term256961, term256961.getClass(), "dailyBonusDate", "YIpQzrPaCw");
        setField(term256961, term256961.getClass(), "dailyCourseBonusDate", "UukIqXfDkU");
        setField(term256961, term256961.getClass(), "lastPairLoginDate", "bTTcisLwAU");
        setField(term256961, term256961.getClass(), "lastTrialPlayDate", "vApcsqSBYB");
        setIntField(term256961, term256961.getClass(), "playVsCount", -1072344219);
        setIntField(term256961, term256961.getClass(), "playSyncCount", -2005106192);
        setIntField(term256961, term256961.getClass(), "winCount", -555377710);
        setIntField(term256961, term256961.getClass(), "helpCount", 280612930);
        setIntField(term256961, term256961.getClass(), "comboCount", 993414549);
        setLongField(term256961, term256961.getClass(), "totalDeluxscore", -6460025219676462491L);
        setLongField(term256961, term256961.getClass(), "totalBasicDeluxscore", 1450105026226207533L);
        setLongField(term256961, term256961.getClass(), "totalAdvancedDeluxscore", 3212683535540112605L);
        setLongField(term256961, term256961.getClass(), "totalExpertDeluxscore", 1704868911833426559L);
        setLongField(term256961, term256961.getClass(), "totalMasterDeluxscore", -1946176434063926453L);
        setLongField(term256961, term256961.getClass(), "totalReMasterDeluxscore", -8238231831833507748L);
        setIntField(term256961, term256961.getClass(), "totalSync", 2138835033);
        setIntField(term256961, term256961.getClass(), "totalBasicSync", -2040339650);
        setIntField(term256961, term256961.getClass(), "totalAdvancedSync", -1201443594);
        setIntField(term256961, term256961.getClass(), "totalExpertSync", 49361066);
        setIntField(term256961, term256961.getClass(), "totalMasterSync", -1429526464);
        setIntField(term256961, term256961.getClass(), "totalReMasterSync", 1223961715);
        setLongField(term256961, term256961.getClass(), "totalAchievement", -4623137184267206366L);
        setLongField(term256961, term256961.getClass(), "totalBasicAchievement", 6517402765154529868L);
        setLongField(term256961, term256961.getClass(), "totalAdvancedAchievement", 1936701264244619017L);
        setLongField(term256961, term256961.getClass(), "totalExpertAchievement", -1084499740435844408L);
        setLongField(term256961, term256961.getClass(), "totalMasterAchievement", 6526457439588348386L);
        setLongField(term256961, term256961.getClass(), "totalReMasterAchievement", 1125262857219389912L);
        setLongField(term256961, term256961.getClass(), "playerOldRating", -6146530096098408953L);
        setLongField(term256961, term256961.getClass(), "playerNewRating", -6188106640299508739L);
        setIntField(term256961, term256961.getClass(), "banState", 240428767);
        setLongField(term256961, term256961.getClass(), "dateTime", -8131671587612853546L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bJbKGvPggm";
        callMethod(klass, "setLastPlaceName", argTypes, term256961, args);
    }

};


