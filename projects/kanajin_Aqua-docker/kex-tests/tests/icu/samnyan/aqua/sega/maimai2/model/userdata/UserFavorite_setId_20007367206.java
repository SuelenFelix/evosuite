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

public class UserFavorite_setId_20007367206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566756;
     Object term567125;

    public UserFavorite_setId_20007367206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term566762 = new Long(-8859332911664940963L);
        Integer term566825 = new Integer(843041661);
        Integer term566827 = new Integer(-1872674019);
        Integer term566829 = new Integer(580191788);
        Integer term566831 = new Integer(-1340848376);
        Integer term566833 = new Integer(-1482512097);
        Integer term566835 = new Integer(-2076427376);
        Integer term566837 = new Integer(-852476369);
        ArrayList term566823 = new ArrayList();
        ((ArrayList) term566823).add(term566825);
        ((ArrayList) term566823).add(term566827);
        ((ArrayList) term566823).add(term566829);
        ((ArrayList) term566823).add(term566831);
        ((ArrayList) term566823).add(term566833);
        ((ArrayList) term566823).add(term566835);
        ((ArrayList) term566823).add(term566837);
        Integer term566843 = new Integer(596868453);
        ArrayList term566841 = new ArrayList();
        ((ArrayList) term566841).add(term566843);
        Integer term567117 = new Integer(-1890744188);
        Integer term567119 = new Integer(2118439468);
        Integer term567121 = new Integer(-241809702);
        ArrayList term567115 = new ArrayList();
        ((ArrayList) term567115).add(term567117);
        ((ArrayList) term567115).add(term567119);
        ((ArrayList) term567115).add(term567121);
        term566756 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite"));
        Object term566758 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term566760 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term566776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term566777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term566781 = newInstance(Class.forName("java.time.LocalTime"));
        Object term566786 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term566787 = newInstance(Class.forName("java.time.LocalDate"));
        Object term566791 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term566756, term566756.getClass(), "id", -7535396291064866707L);
        setLongField(term566758, term566758.getClass(), "id", 5363298273614881459L);
        setLongField(term566760, term566760.getClass(), "id", -8541494599358035618L);
        setField(term566760, term566760.getClass(), "extId", term566762);
        setField(term566760, term566760.getClass(), "luid", "UNMfEvrRbR");
        setIntField(term566777, term566777.getClass(), "year", 2011);
        setShortField(term566777, term566777.getClass(), "month", (short) 4);
        setShortField(term566777, term566777.getClass(), "day", (short) 28);
        setField(term566776, term566776.getClass(), "date", term566777);
        setByteField(term566781, term566781.getClass(), "hour", (byte) 14);
        setByteField(term566781, term566781.getClass(), "minute", (byte) 2);
        setByteField(term566781, term566781.getClass(), "second", (byte) 4);
        setIntField(term566781, term566781.getClass(), "nano", 157796716);
        setField(term566776, term566776.getClass(), "time", term566781);
        setField(term566760, term566760.getClass(), "registerTime", term566776);
        setIntField(term566787, term566787.getClass(), "year", 2018);
        setShortField(term566787, term566787.getClass(), "month", (short) 3);
        setShortField(term566787, term566787.getClass(), "day", (short) 4);
        setField(term566786, term566786.getClass(), "date", term566787);
        setByteField(term566791, term566791.getClass(), "hour", (byte) 14);
        setByteField(term566791, term566791.getClass(), "minute", (byte) 21);
        setByteField(term566791, term566791.getClass(), "second", (byte) 25);
        setIntField(term566791, term566791.getClass(), "nano", 988206373);
        setField(term566786, term566786.getClass(), "time", term566791);
        setField(term566760, term566760.getClass(), "accessTime", term566786);
        setField(term566758, term566758.getClass(), "card", term566760);
        setField(term566758, term566758.getClass(), "userName", "cWZFBFUtRq");
        setIntField(term566758, term566758.getClass(), "isNetMember", 1419353814);
        setIntField(term566758, term566758.getClass(), "iconId", -787300796);
        setIntField(term566758, term566758.getClass(), "plateId", 1126389662);
        setIntField(term566758, term566758.getClass(), "titleId", -223254190);
        setIntField(term566758, term566758.getClass(), "partnerId", -404657226);
        setIntField(term566758, term566758.getClass(), "frameId", 1991004739);
        setIntField(term566758, term566758.getClass(), "selectMapId", 1717165905);
        setIntField(term566758, term566758.getClass(), "totalAwake", 1436729090);
        setIntField(term566758, term566758.getClass(), "gradeRating", 1104333310);
        setIntField(term566758, term566758.getClass(), "musicRating", -557362545);
        setIntField(term566758, term566758.getClass(), "playerRating", -951488013);
        setIntField(term566758, term566758.getClass(), "highestRating", -524286953);
        setIntField(term566758, term566758.getClass(), "gradeRank", 1012470935);
        setIntField(term566758, term566758.getClass(), "classRank", 116762512);
        setIntField(term566758, term566758.getClass(), "courseRank", 596963159);
        setField(term566758, term566758.getClass(), "charaSlot", term566823);
        setField(term566758, term566758.getClass(), "charaLockSlot", term566841);
        setLongField(term566758, term566758.getClass(), "contentBit", 8529976758702779539L);
        setIntField(term566758, term566758.getClass(), "playCount", -2026568548);
        setField(term566758, term566758.getClass(), "eventWatchedDate", "JATsJMUffI");
        setField(term566758, term566758.getClass(), "lastGameId", "lpZaVKLGnz");
        setField(term566758, term566758.getClass(), "lastRomVersion", "CbTzEovelY");
        setField(term566758, term566758.getClass(), "lastDataVersion", "AzJzHNCIbb");
        setField(term566758, term566758.getClass(), "lastLoginDate", "ublQWwwjDz");
        setField(term566758, term566758.getClass(), "lastPlayDate", "LAQTAjhmOq");
        setIntField(term566758, term566758.getClass(), "lastPlayCredit", -150349361);
        setIntField(term566758, term566758.getClass(), "lastPlayMode", -835585613);
        setIntField(term566758, term566758.getClass(), "lastPlaceId", -1660400958);
        setField(term566758, term566758.getClass(), "lastPlaceName", "LCLhxCcvvp");
        setIntField(term566758, term566758.getClass(), "lastAllNetId", 1276947688);
        setIntField(term566758, term566758.getClass(), "lastRegionId", 2016281472);
        setField(term566758, term566758.getClass(), "lastRegionName", "jourImKrQO");
        setField(term566758, term566758.getClass(), "lastClientId", "YQqHaNrGZV");
        setField(term566758, term566758.getClass(), "lastCountryCode", "OBdPteZDPV");
        setIntField(term566758, term566758.getClass(), "lastSelectEMoney", -117038907);
        setIntField(term566758, term566758.getClass(), "lastSelectTicket", 2137745834);
        setIntField(term566758, term566758.getClass(), "lastSelectCourse", 1176369938);
        setIntField(term566758, term566758.getClass(), "lastCountCourse", 1718803825);
        setField(term566758, term566758.getClass(), "firstGameId", "XdXWnfZcAH");
        setField(term566758, term566758.getClass(), "firstRomVersion", "QHjztNhEIN");
        setField(term566758, term566758.getClass(), "firstDataVersion", "DLOkxuOgAE");
        setField(term566758, term566758.getClass(), "firstPlayDate", "EDNEytIwph");
        setField(term566758, term566758.getClass(), "compatibleCmVersion", "BXWaPfQRPB");
        setField(term566758, term566758.getClass(), "dailyBonusDate", "YCEDDPVtCV");
        setField(term566758, term566758.getClass(), "dailyCourseBonusDate", "OVCCpcKCVF");
        setField(term566758, term566758.getClass(), "lastPairLoginDate", "UjWAefdZPM");
        setField(term566758, term566758.getClass(), "lastTrialPlayDate", "hoVCTFodui");
        setIntField(term566758, term566758.getClass(), "playVsCount", -371673979);
        setIntField(term566758, term566758.getClass(), "playSyncCount", 165522112);
        setIntField(term566758, term566758.getClass(), "winCount", -2040392795);
        setIntField(term566758, term566758.getClass(), "helpCount", -1539662341);
        setIntField(term566758, term566758.getClass(), "comboCount", 1277858419);
        setLongField(term566758, term566758.getClass(), "totalDeluxscore", -6619950651122219977L);
        setLongField(term566758, term566758.getClass(), "totalBasicDeluxscore", -8522537392403352331L);
        setLongField(term566758, term566758.getClass(), "totalAdvancedDeluxscore", 1414301354647098495L);
        setLongField(term566758, term566758.getClass(), "totalExpertDeluxscore", 8746894259059272902L);
        setLongField(term566758, term566758.getClass(), "totalMasterDeluxscore", 2957382012631120398L);
        setLongField(term566758, term566758.getClass(), "totalReMasterDeluxscore", -9001182453948398083L);
        setIntField(term566758, term566758.getClass(), "totalSync", -709600976);
        setIntField(term566758, term566758.getClass(), "totalBasicSync", -74814064);
        setIntField(term566758, term566758.getClass(), "totalAdvancedSync", 987387119);
        setIntField(term566758, term566758.getClass(), "totalExpertSync", -725193490);
        setIntField(term566758, term566758.getClass(), "totalMasterSync", -1548316633);
        setIntField(term566758, term566758.getClass(), "totalReMasterSync", -666285728);
        setLongField(term566758, term566758.getClass(), "totalAchievement", -6008263650671054313L);
        setLongField(term566758, term566758.getClass(), "totalBasicAchievement", -5531042566662287801L);
        setLongField(term566758, term566758.getClass(), "totalAdvancedAchievement", -3640046141733548952L);
        setLongField(term566758, term566758.getClass(), "totalExpertAchievement", 8122012580787556326L);
        setLongField(term566758, term566758.getClass(), "totalMasterAchievement", 8240822067240898800L);
        setLongField(term566758, term566758.getClass(), "totalReMasterAchievement", 4292541076228971734L);
        setLongField(term566758, term566758.getClass(), "playerOldRating", 5982175367043676545L);
        setLongField(term566758, term566758.getClass(), "playerNewRating", -1785350925668587471L);
        setIntField(term566758, term566758.getClass(), "banState", 9266359);
        setLongField(term566758, term566758.getClass(), "dateTime", -873518246175898665L);
        setField(term566756, term566756.getClass(), "user", term566758);
        setLongField(term566756, term566756.getClass(), "favUserId", 936297822171550163L);
        setIntField(term566756, term566756.getClass(), "itemKind", -1905150083);
        setField(term566756, term566756.getClass(), "itemIdList", term567115);
        term567125 = new Long(2444769866970996697L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term567125;
        callMethod(klass, "setId", argTypes, term566756, args);
    }

};


