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

public class UserDetail_setLastCountryCode_987814724114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259866;

    public UserDetail_setLastCountryCode_987814724114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term259870 = new Long(4828755228445882127L);
        Integer term259933 = new Integer(-171442968);
        Integer term259935 = new Integer(1345075451);
        Integer term259937 = new Integer(-482097687);
        Integer term259939 = new Integer(-1155698012);
        Integer term259941 = new Integer(-1635314310);
        Integer term259943 = new Integer(-1583672247);
        Integer term259945 = new Integer(1150713854);
        Integer term259947 = new Integer(999843869);
        Integer term259949 = new Integer(1047162942);
        ArrayList term259931 = new ArrayList();
        ((ArrayList) term259931).add(term259933);
        ((ArrayList) term259931).add(term259935);
        ((ArrayList) term259931).add(term259937);
        ((ArrayList) term259931).add(term259939);
        ((ArrayList) term259931).add(term259941);
        ((ArrayList) term259931).add(term259943);
        ((ArrayList) term259931).add(term259945);
        ((ArrayList) term259931).add(term259947);
        ((ArrayList) term259931).add(term259949);
        Integer term259955 = new Integer(555668629);
        Integer term259957 = new Integer(-704789127);
        ArrayList term259953 = new ArrayList();
        ((ArrayList) term259953).add(term259955);
        ((ArrayList) term259953).add(term259957);
        term259866 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term259868 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term259884 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259885 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259889 = newInstance(Class.forName("java.time.LocalTime"));
        Object term259894 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259895 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259899 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term259866, term259866.getClass(), "id", 7888879670294220712L);
        setLongField(term259868, term259868.getClass(), "id", 3733493736694781492L);
        setField(term259868, term259868.getClass(), "extId", term259870);
        setField(term259868, term259868.getClass(), "luid", "vGKebDDKcW");
        setIntField(term259885, term259885.getClass(), "year", 2015);
        setShortField(term259885, term259885.getClass(), "month", (short) 4);
        setShortField(term259885, term259885.getClass(), "day", (short) 6);
        setField(term259884, term259884.getClass(), "date", term259885);
        setByteField(term259889, term259889.getClass(), "hour", (byte) 6);
        setByteField(term259889, term259889.getClass(), "minute", (byte) 39);
        setByteField(term259889, term259889.getClass(), "second", (byte) 45);
        setIntField(term259889, term259889.getClass(), "nano", 97858819);
        setField(term259884, term259884.getClass(), "time", term259889);
        setField(term259868, term259868.getClass(), "registerTime", term259884);
        setIntField(term259895, term259895.getClass(), "year", 2019);
        setShortField(term259895, term259895.getClass(), "month", (short) 3);
        setShortField(term259895, term259895.getClass(), "day", (short) 3);
        setField(term259894, term259894.getClass(), "date", term259895);
        setByteField(term259899, term259899.getClass(), "hour", (byte) 2);
        setByteField(term259899, term259899.getClass(), "minute", (byte) 9);
        setByteField(term259899, term259899.getClass(), "second", (byte) 44);
        setIntField(term259899, term259899.getClass(), "nano", 690452555);
        setField(term259894, term259894.getClass(), "time", term259899);
        setField(term259868, term259868.getClass(), "accessTime", term259894);
        setField(term259866, term259866.getClass(), "card", term259868);
        setField(term259866, term259866.getClass(), "userName", "MkwJQnHQbf");
        setIntField(term259866, term259866.getClass(), "isNetMember", -1636608619);
        setIntField(term259866, term259866.getClass(), "iconId", 949617445);
        setIntField(term259866, term259866.getClass(), "plateId", -313010525);
        setIntField(term259866, term259866.getClass(), "titleId", -443822831);
        setIntField(term259866, term259866.getClass(), "partnerId", 370262041);
        setIntField(term259866, term259866.getClass(), "frameId", -598394758);
        setIntField(term259866, term259866.getClass(), "selectMapId", -239545633);
        setIntField(term259866, term259866.getClass(), "totalAwake", -329411997);
        setIntField(term259866, term259866.getClass(), "gradeRating", -1504402108);
        setIntField(term259866, term259866.getClass(), "musicRating", -812304204);
        setIntField(term259866, term259866.getClass(), "playerRating", 1630465002);
        setIntField(term259866, term259866.getClass(), "highestRating", 1007481312);
        setIntField(term259866, term259866.getClass(), "gradeRank", 1239977029);
        setIntField(term259866, term259866.getClass(), "classRank", -1321116340);
        setIntField(term259866, term259866.getClass(), "courseRank", -474806903);
        setField(term259866, term259866.getClass(), "charaSlot", term259931);
        setField(term259866, term259866.getClass(), "charaLockSlot", term259953);
        setLongField(term259866, term259866.getClass(), "contentBit", 142595323312177494L);
        setIntField(term259866, term259866.getClass(), "playCount", 1981541170);
        setField(term259866, term259866.getClass(), "eventWatchedDate", "yPMIDJRkkP");
        setField(term259866, term259866.getClass(), "lastGameId", "FYrHZjWNQJ");
        setField(term259866, term259866.getClass(), "lastRomVersion", "kroCMCDLFI");
        setField(term259866, term259866.getClass(), "lastDataVersion", "KkIBmxvzcL");
        setField(term259866, term259866.getClass(), "lastLoginDate", "LVDexpaQJR");
        setField(term259866, term259866.getClass(), "lastPlayDate", "vlzfUznWJR");
        setIntField(term259866, term259866.getClass(), "lastPlayCredit", -2009986235);
        setIntField(term259866, term259866.getClass(), "lastPlayMode", -23880680);
        setIntField(term259866, term259866.getClass(), "lastPlaceId", -894843648);
        setField(term259866, term259866.getClass(), "lastPlaceName", "FdzDmAbJCC");
        setIntField(term259866, term259866.getClass(), "lastAllNetId", 142744348);
        setIntField(term259866, term259866.getClass(), "lastRegionId", 1483675783);
        setField(term259866, term259866.getClass(), "lastRegionName", "OSXAuRuAau");
        setField(term259866, term259866.getClass(), "lastClientId", "azsnWqwRkF");
        setField(term259866, term259866.getClass(), "lastCountryCode", "VytBIaPeoV");
        setIntField(term259866, term259866.getClass(), "lastSelectEMoney", -1134662759);
        setIntField(term259866, term259866.getClass(), "lastSelectTicket", 1144602839);
        setIntField(term259866, term259866.getClass(), "lastSelectCourse", 96643570);
        setIntField(term259866, term259866.getClass(), "lastCountCourse", 1111083466);
        setField(term259866, term259866.getClass(), "firstGameId", "eVeQiooIie");
        setField(term259866, term259866.getClass(), "firstRomVersion", "tBvyiKlvwt");
        setField(term259866, term259866.getClass(), "firstDataVersion", "cbrJBcmzzA");
        setField(term259866, term259866.getClass(), "firstPlayDate", "MQEpjCONzM");
        setField(term259866, term259866.getClass(), "compatibleCmVersion", "NYzdiIdifj");
        setField(term259866, term259866.getClass(), "dailyBonusDate", "QShAEmzTpm");
        setField(term259866, term259866.getClass(), "dailyCourseBonusDate", "WfIDYpqgan");
        setField(term259866, term259866.getClass(), "lastPairLoginDate", "jkqkgaaQOn");
        setField(term259866, term259866.getClass(), "lastTrialPlayDate", "VxoGAcPGVp");
        setIntField(term259866, term259866.getClass(), "playVsCount", -287565680);
        setIntField(term259866, term259866.getClass(), "playSyncCount", -505190175);
        setIntField(term259866, term259866.getClass(), "winCount", -1982976693);
        setIntField(term259866, term259866.getClass(), "helpCount", 1819092465);
        setIntField(term259866, term259866.getClass(), "comboCount", 10838230);
        setLongField(term259866, term259866.getClass(), "totalDeluxscore", 885026582656463606L);
        setLongField(term259866, term259866.getClass(), "totalBasicDeluxscore", -5088578181238073745L);
        setLongField(term259866, term259866.getClass(), "totalAdvancedDeluxscore", -9034578861797171378L);
        setLongField(term259866, term259866.getClass(), "totalExpertDeluxscore", 8744900390990951997L);
        setLongField(term259866, term259866.getClass(), "totalMasterDeluxscore", 6540572779459730288L);
        setLongField(term259866, term259866.getClass(), "totalReMasterDeluxscore", 8088189952192731204L);
        setIntField(term259866, term259866.getClass(), "totalSync", -1844417927);
        setIntField(term259866, term259866.getClass(), "totalBasicSync", -1229688588);
        setIntField(term259866, term259866.getClass(), "totalAdvancedSync", -934089499);
        setIntField(term259866, term259866.getClass(), "totalExpertSync", 1156999021);
        setIntField(term259866, term259866.getClass(), "totalMasterSync", 1696896271);
        setIntField(term259866, term259866.getClass(), "totalReMasterSync", 1811241767);
        setLongField(term259866, term259866.getClass(), "totalAchievement", 1452398001485043192L);
        setLongField(term259866, term259866.getClass(), "totalBasicAchievement", 4232329326614848935L);
        setLongField(term259866, term259866.getClass(), "totalAdvancedAchievement", 1917293054453974505L);
        setLongField(term259866, term259866.getClass(), "totalExpertAchievement", -375518387049100086L);
        setLongField(term259866, term259866.getClass(), "totalMasterAchievement", 3139940498178121971L);
        setLongField(term259866, term259866.getClass(), "totalReMasterAchievement", 336768740853246776L);
        setLongField(term259866, term259866.getClass(), "playerOldRating", 6975908019297087988L);
        setLongField(term259866, term259866.getClass(), "playerNewRating", 6015906370152149447L);
        setIntField(term259866, term259866.getClass(), "banState", 1141602746);
        setLongField(term259866, term259866.getClass(), "dateTime", 1880702962439066560L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ltoRvwhmcS";
        callMethod(klass, "setLastCountryCode", argTypes, term259866, args);
    }

};


