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

public class UserDetail_setLastPlaceName_1189842157108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256906;

    public UserDetail_setLastPlaceName_1189842157108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term256910 = new Long(-997945615782059734L);
        Integer term256973 = new Integer(236114197);
        Integer term256975 = new Integer(-1633292626);
        ArrayList term256971 = new ArrayList();
        ((ArrayList) term256971).add(term256973);
        ((ArrayList) term256971).add(term256975);
        Integer term256981 = new Integer(689769597);
        Integer term256983 = new Integer(-1219602723);
        Integer term256985 = new Integer(1668201364);
        Integer term256987 = new Integer(-548343635);
        Integer term256989 = new Integer(-590979324);
        Integer term256991 = new Integer(-1745427158);
        Integer term256993 = new Integer(1516032954);
        ArrayList term256979 = new ArrayList();
        ((ArrayList) term256979).add(term256981);
        ((ArrayList) term256979).add(term256983);
        ((ArrayList) term256979).add(term256985);
        ((ArrayList) term256979).add(term256987);
        ((ArrayList) term256979).add(term256989);
        ((ArrayList) term256979).add(term256991);
        ((ArrayList) term256979).add(term256993);
        term256906 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term256908 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term256924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term256934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256939 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term256906, term256906.getClass(), "id", -5567713960293143918L);
        setLongField(term256908, term256908.getClass(), "id", 2796443349725503199L);
        setField(term256908, term256908.getClass(), "extId", term256910);
        setField(term256908, term256908.getClass(), "luid", "phnhOsIrPf");
        setIntField(term256925, term256925.getClass(), "year", 2014);
        setShortField(term256925, term256925.getClass(), "month", (short) 3);
        setShortField(term256925, term256925.getClass(), "day", (short) 6);
        setField(term256924, term256924.getClass(), "date", term256925);
        setByteField(term256929, term256929.getClass(), "hour", (byte) 3);
        setByteField(term256929, term256929.getClass(), "minute", (byte) 21);
        setByteField(term256929, term256929.getClass(), "second", (byte) 53);
        setIntField(term256929, term256929.getClass(), "nano", 978038024);
        setField(term256924, term256924.getClass(), "time", term256929);
        setField(term256908, term256908.getClass(), "registerTime", term256924);
        setIntField(term256935, term256935.getClass(), "year", 2013);
        setShortField(term256935, term256935.getClass(), "month", (short) 5);
        setShortField(term256935, term256935.getClass(), "day", (short) 10);
        setField(term256934, term256934.getClass(), "date", term256935);
        setByteField(term256939, term256939.getClass(), "hour", (byte) 8);
        setByteField(term256939, term256939.getClass(), "minute", (byte) 51);
        setByteField(term256939, term256939.getClass(), "second", (byte) 38);
        setIntField(term256939, term256939.getClass(), "nano", 326978944);
        setField(term256934, term256934.getClass(), "time", term256939);
        setField(term256908, term256908.getClass(), "accessTime", term256934);
        setField(term256906, term256906.getClass(), "card", term256908);
        setField(term256906, term256906.getClass(), "userName", "IqCiPyIYlC");
        setIntField(term256906, term256906.getClass(), "isNetMember", 1905421633);
        setIntField(term256906, term256906.getClass(), "iconId", 83824083);
        setIntField(term256906, term256906.getClass(), "plateId", 808572108);
        setIntField(term256906, term256906.getClass(), "titleId", 1104236955);
        setIntField(term256906, term256906.getClass(), "partnerId", 626404062);
        setIntField(term256906, term256906.getClass(), "frameId", 1954724158);
        setIntField(term256906, term256906.getClass(), "selectMapId", 1561676074);
        setIntField(term256906, term256906.getClass(), "totalAwake", 1690665676);
        setIntField(term256906, term256906.getClass(), "gradeRating", -80665419);
        setIntField(term256906, term256906.getClass(), "musicRating", 789488298);
        setIntField(term256906, term256906.getClass(), "playerRating", -1152670111);
        setIntField(term256906, term256906.getClass(), "highestRating", -1200569780);
        setIntField(term256906, term256906.getClass(), "gradeRank", 1982581757);
        setIntField(term256906, term256906.getClass(), "classRank", -100806416);
        setIntField(term256906, term256906.getClass(), "courseRank", -1060172488);
        setField(term256906, term256906.getClass(), "charaSlot", term256971);
        setField(term256906, term256906.getClass(), "charaLockSlot", term256979);
        setLongField(term256906, term256906.getClass(), "contentBit", 8324766592876876646L);
        setIntField(term256906, term256906.getClass(), "playCount", 191812624);
        setField(term256906, term256906.getClass(), "eventWatchedDate", "AaoQDNZhnS");
        setField(term256906, term256906.getClass(), "lastGameId", "IKAtLbhKWa");
        setField(term256906, term256906.getClass(), "lastRomVersion", "DYgUODVEAY");
        setField(term256906, term256906.getClass(), "lastDataVersion", "wVWNIpvTso");
        setField(term256906, term256906.getClass(), "lastLoginDate", "fdTrnfevnD");
        setField(term256906, term256906.getClass(), "lastPlayDate", "pSwgKxEgKt");
        setIntField(term256906, term256906.getClass(), "lastPlayCredit", 1321788637);
        setIntField(term256906, term256906.getClass(), "lastPlayMode", -1233600149);
        setIntField(term256906, term256906.getClass(), "lastPlaceId", -2080709049);
        setField(term256906, term256906.getClass(), "lastPlaceName", "fBoTpMYSyX");
        setIntField(term256906, term256906.getClass(), "lastAllNetId", 148521677);
        setIntField(term256906, term256906.getClass(), "lastRegionId", 2029502457);
        setField(term256906, term256906.getClass(), "lastRegionName", "BbROkBKzRp");
        setField(term256906, term256906.getClass(), "lastClientId", "WqsZmoEMhC");
        setField(term256906, term256906.getClass(), "lastCountryCode", "PZnyLdXxJA");
        setIntField(term256906, term256906.getClass(), "lastSelectEMoney", -171777022);
        setIntField(term256906, term256906.getClass(), "lastSelectTicket", 1235568553);
        setIntField(term256906, term256906.getClass(), "lastSelectCourse", 1684825497);
        setIntField(term256906, term256906.getClass(), "lastCountCourse", 502790478);
        setField(term256906, term256906.getClass(), "firstGameId", "vQxIPNOxke");
        setField(term256906, term256906.getClass(), "firstRomVersion", "sEwNYnInbT");
        setField(term256906, term256906.getClass(), "firstDataVersion", "KLfssEwvtj");
        setField(term256906, term256906.getClass(), "firstPlayDate", "juDedtXBCp");
        setField(term256906, term256906.getClass(), "compatibleCmVersion", "mUfRoHLCvm");
        setField(term256906, term256906.getClass(), "dailyBonusDate", "YIpQzrPaCw");
        setField(term256906, term256906.getClass(), "dailyCourseBonusDate", "UukIqXfDkU");
        setField(term256906, term256906.getClass(), "lastPairLoginDate", "bTTcisLwAU");
        setField(term256906, term256906.getClass(), "lastTrialPlayDate", "vApcsqSBYB");
        setIntField(term256906, term256906.getClass(), "playVsCount", -1072344219);
        setIntField(term256906, term256906.getClass(), "playSyncCount", -2005106192);
        setIntField(term256906, term256906.getClass(), "winCount", -555377710);
        setIntField(term256906, term256906.getClass(), "helpCount", 280612930);
        setIntField(term256906, term256906.getClass(), "comboCount", 993414549);
        setLongField(term256906, term256906.getClass(), "totalDeluxscore", -6460025219676462491L);
        setLongField(term256906, term256906.getClass(), "totalBasicDeluxscore", 1450105026226207533L);
        setLongField(term256906, term256906.getClass(), "totalAdvancedDeluxscore", 3212683535540112605L);
        setLongField(term256906, term256906.getClass(), "totalExpertDeluxscore", 1704868911833426559L);
        setLongField(term256906, term256906.getClass(), "totalMasterDeluxscore", -1946176434063926453L);
        setLongField(term256906, term256906.getClass(), "totalReMasterDeluxscore", -8238231831833507748L);
        setIntField(term256906, term256906.getClass(), "totalSync", 2138835033);
        setIntField(term256906, term256906.getClass(), "totalBasicSync", -2040339650);
        setIntField(term256906, term256906.getClass(), "totalAdvancedSync", -1201443594);
        setIntField(term256906, term256906.getClass(), "totalExpertSync", 49361066);
        setIntField(term256906, term256906.getClass(), "totalMasterSync", -1429526464);
        setIntField(term256906, term256906.getClass(), "totalReMasterSync", 1223961715);
        setLongField(term256906, term256906.getClass(), "totalAchievement", -4623137184267206366L);
        setLongField(term256906, term256906.getClass(), "totalBasicAchievement", 6517402765154529868L);
        setLongField(term256906, term256906.getClass(), "totalAdvancedAchievement", 1936701264244619017L);
        setLongField(term256906, term256906.getClass(), "totalExpertAchievement", -1084499740435844408L);
        setLongField(term256906, term256906.getClass(), "totalMasterAchievement", 6526457439588348386L);
        setLongField(term256906, term256906.getClass(), "totalReMasterAchievement", 1125262857219389912L);
        setLongField(term256906, term256906.getClass(), "playerOldRating", -6146530096098408953L);
        setLongField(term256906, term256906.getClass(), "playerNewRating", -6188106640299508739L);
        setIntField(term256906, term256906.getClass(), "banState", 240428767);
        setLongField(term256906, term256906.getClass(), "dateTime", -8131671587612853546L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bJbKGvPggm";
        callMethod(klass, "setLastPlaceName", argTypes, term256906, args);
    }

};


