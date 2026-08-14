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

public class UserDetail_setLastCountryCode_987814724113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259811;

    public UserDetail_setLastCountryCode_987814724113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term259815 = new Long(4828755228445882127L);
        Integer term259878 = new Integer(-171442968);
        Integer term259880 = new Integer(1345075451);
        Integer term259882 = new Integer(-482097687);
        Integer term259884 = new Integer(-1155698012);
        Integer term259886 = new Integer(-1635314310);
        Integer term259888 = new Integer(-1583672247);
        Integer term259890 = new Integer(1150713854);
        Integer term259892 = new Integer(999843869);
        Integer term259894 = new Integer(1047162942);
        ArrayList term259876 = new ArrayList();
        ((ArrayList) term259876).add(term259878);
        ((ArrayList) term259876).add(term259880);
        ((ArrayList) term259876).add(term259882);
        ((ArrayList) term259876).add(term259884);
        ((ArrayList) term259876).add(term259886);
        ((ArrayList) term259876).add(term259888);
        ((ArrayList) term259876).add(term259890);
        ((ArrayList) term259876).add(term259892);
        ((ArrayList) term259876).add(term259894);
        Integer term259900 = new Integer(555668629);
        Integer term259902 = new Integer(-704789127);
        ArrayList term259898 = new ArrayList();
        ((ArrayList) term259898).add(term259900);
        ((ArrayList) term259898).add(term259902);
        term259811 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term259813 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term259829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259834 = newInstance(Class.forName("java.time.LocalTime"));
        Object term259839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259844 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term259811, term259811.getClass(), "id", 7888879670294220712L);
        setLongField(term259813, term259813.getClass(), "id", 3733493736694781492L);
        setField(term259813, term259813.getClass(), "extId", term259815);
        setField(term259813, term259813.getClass(), "luid", "vGKebDDKcW");
        setIntField(term259830, term259830.getClass(), "year", 2015);
        setShortField(term259830, term259830.getClass(), "month", (short) 4);
        setShortField(term259830, term259830.getClass(), "day", (short) 6);
        setField(term259829, term259829.getClass(), "date", term259830);
        setByteField(term259834, term259834.getClass(), "hour", (byte) 6);
        setByteField(term259834, term259834.getClass(), "minute", (byte) 39);
        setByteField(term259834, term259834.getClass(), "second", (byte) 45);
        setIntField(term259834, term259834.getClass(), "nano", 97858819);
        setField(term259829, term259829.getClass(), "time", term259834);
        setField(term259813, term259813.getClass(), "registerTime", term259829);
        setIntField(term259840, term259840.getClass(), "year", 2019);
        setShortField(term259840, term259840.getClass(), "month", (short) 3);
        setShortField(term259840, term259840.getClass(), "day", (short) 3);
        setField(term259839, term259839.getClass(), "date", term259840);
        setByteField(term259844, term259844.getClass(), "hour", (byte) 2);
        setByteField(term259844, term259844.getClass(), "minute", (byte) 9);
        setByteField(term259844, term259844.getClass(), "second", (byte) 44);
        setIntField(term259844, term259844.getClass(), "nano", 690452555);
        setField(term259839, term259839.getClass(), "time", term259844);
        setField(term259813, term259813.getClass(), "accessTime", term259839);
        setField(term259811, term259811.getClass(), "card", term259813);
        setField(term259811, term259811.getClass(), "userName", "MkwJQnHQbf");
        setIntField(term259811, term259811.getClass(), "isNetMember", -1636608619);
        setIntField(term259811, term259811.getClass(), "iconId", 949617445);
        setIntField(term259811, term259811.getClass(), "plateId", -313010525);
        setIntField(term259811, term259811.getClass(), "titleId", -443822831);
        setIntField(term259811, term259811.getClass(), "partnerId", 370262041);
        setIntField(term259811, term259811.getClass(), "frameId", -598394758);
        setIntField(term259811, term259811.getClass(), "selectMapId", -239545633);
        setIntField(term259811, term259811.getClass(), "totalAwake", -329411997);
        setIntField(term259811, term259811.getClass(), "gradeRating", -1504402108);
        setIntField(term259811, term259811.getClass(), "musicRating", -812304204);
        setIntField(term259811, term259811.getClass(), "playerRating", 1630465002);
        setIntField(term259811, term259811.getClass(), "highestRating", 1007481312);
        setIntField(term259811, term259811.getClass(), "gradeRank", 1239977029);
        setIntField(term259811, term259811.getClass(), "classRank", -1321116340);
        setIntField(term259811, term259811.getClass(), "courseRank", -474806903);
        setField(term259811, term259811.getClass(), "charaSlot", term259876);
        setField(term259811, term259811.getClass(), "charaLockSlot", term259898);
        setLongField(term259811, term259811.getClass(), "contentBit", 142595323312177494L);
        setIntField(term259811, term259811.getClass(), "playCount", 1981541170);
        setField(term259811, term259811.getClass(), "eventWatchedDate", "yPMIDJRkkP");
        setField(term259811, term259811.getClass(), "lastGameId", "FYrHZjWNQJ");
        setField(term259811, term259811.getClass(), "lastRomVersion", "kroCMCDLFI");
        setField(term259811, term259811.getClass(), "lastDataVersion", "KkIBmxvzcL");
        setField(term259811, term259811.getClass(), "lastLoginDate", "LVDexpaQJR");
        setField(term259811, term259811.getClass(), "lastPlayDate", "vlzfUznWJR");
        setIntField(term259811, term259811.getClass(), "lastPlayCredit", -2009986235);
        setIntField(term259811, term259811.getClass(), "lastPlayMode", -23880680);
        setIntField(term259811, term259811.getClass(), "lastPlaceId", -894843648);
        setField(term259811, term259811.getClass(), "lastPlaceName", "FdzDmAbJCC");
        setIntField(term259811, term259811.getClass(), "lastAllNetId", 142744348);
        setIntField(term259811, term259811.getClass(), "lastRegionId", 1483675783);
        setField(term259811, term259811.getClass(), "lastRegionName", "OSXAuRuAau");
        setField(term259811, term259811.getClass(), "lastClientId", "azsnWqwRkF");
        setField(term259811, term259811.getClass(), "lastCountryCode", "VytBIaPeoV");
        setIntField(term259811, term259811.getClass(), "lastSelectEMoney", -1134662759);
        setIntField(term259811, term259811.getClass(), "lastSelectTicket", 1144602839);
        setIntField(term259811, term259811.getClass(), "lastSelectCourse", 96643570);
        setIntField(term259811, term259811.getClass(), "lastCountCourse", 1111083466);
        setField(term259811, term259811.getClass(), "firstGameId", "eVeQiooIie");
        setField(term259811, term259811.getClass(), "firstRomVersion", "tBvyiKlvwt");
        setField(term259811, term259811.getClass(), "firstDataVersion", "cbrJBcmzzA");
        setField(term259811, term259811.getClass(), "firstPlayDate", "MQEpjCONzM");
        setField(term259811, term259811.getClass(), "compatibleCmVersion", "NYzdiIdifj");
        setField(term259811, term259811.getClass(), "dailyBonusDate", "QShAEmzTpm");
        setField(term259811, term259811.getClass(), "dailyCourseBonusDate", "WfIDYpqgan");
        setField(term259811, term259811.getClass(), "lastPairLoginDate", "jkqkgaaQOn");
        setField(term259811, term259811.getClass(), "lastTrialPlayDate", "VxoGAcPGVp");
        setIntField(term259811, term259811.getClass(), "playVsCount", -287565680);
        setIntField(term259811, term259811.getClass(), "playSyncCount", -505190175);
        setIntField(term259811, term259811.getClass(), "winCount", -1982976693);
        setIntField(term259811, term259811.getClass(), "helpCount", 1819092465);
        setIntField(term259811, term259811.getClass(), "comboCount", 10838230);
        setLongField(term259811, term259811.getClass(), "totalDeluxscore", 885026582656463606L);
        setLongField(term259811, term259811.getClass(), "totalBasicDeluxscore", -5088578181238073745L);
        setLongField(term259811, term259811.getClass(), "totalAdvancedDeluxscore", -9034578861797171378L);
        setLongField(term259811, term259811.getClass(), "totalExpertDeluxscore", 8744900390990951997L);
        setLongField(term259811, term259811.getClass(), "totalMasterDeluxscore", 6540572779459730288L);
        setLongField(term259811, term259811.getClass(), "totalReMasterDeluxscore", 8088189952192731204L);
        setIntField(term259811, term259811.getClass(), "totalSync", -1844417927);
        setIntField(term259811, term259811.getClass(), "totalBasicSync", -1229688588);
        setIntField(term259811, term259811.getClass(), "totalAdvancedSync", -934089499);
        setIntField(term259811, term259811.getClass(), "totalExpertSync", 1156999021);
        setIntField(term259811, term259811.getClass(), "totalMasterSync", 1696896271);
        setIntField(term259811, term259811.getClass(), "totalReMasterSync", 1811241767);
        setLongField(term259811, term259811.getClass(), "totalAchievement", 1452398001485043192L);
        setLongField(term259811, term259811.getClass(), "totalBasicAchievement", 4232329326614848935L);
        setLongField(term259811, term259811.getClass(), "totalAdvancedAchievement", 1917293054453974505L);
        setLongField(term259811, term259811.getClass(), "totalExpertAchievement", -375518387049100086L);
        setLongField(term259811, term259811.getClass(), "totalMasterAchievement", 3139940498178121971L);
        setLongField(term259811, term259811.getClass(), "totalReMasterAchievement", 336768740853246776L);
        setLongField(term259811, term259811.getClass(), "playerOldRating", 6975908019297087988L);
        setLongField(term259811, term259811.getClass(), "playerNewRating", 6015906370152149447L);
        setIntField(term259811, term259811.getClass(), "banState", 1141602746);
        setLongField(term259811, term259811.getClass(), "dateTime", 1880702962439066560L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ltoRvwhmcS";
        callMethod(klass, "setLastCountryCode", argTypes, term259811, args);
    }

};


