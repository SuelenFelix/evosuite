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

public class UserDetail_setLastDataVersion_102322257102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4287535;

    public UserDetail_setLastDataVersion_102322257102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4287539 = new Long(-3750069780213532199L);
        Integer term4287602 = new Integer(-1303194402);
        Integer term4287604 = new Integer(-1332211856);
        Integer term4287606 = new Integer(213669888);
        ArrayList term4287600 = new ArrayList();
        ((ArrayList) term4287600).add(term4287602);
        ((ArrayList) term4287600).add(term4287604);
        ((ArrayList) term4287600).add(term4287606);
        Integer term4287612 = new Integer(-1050684350);
        ArrayList term4287610 = new ArrayList();
        ((ArrayList) term4287610).add(term4287612);
        term4287535 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4287537 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4287553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4287554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4287558 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4287563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4287564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4287568 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4287535, term4287535.getClass(), "id", 2327070328949707017L);
        setLongField(term4287537, term4287537.getClass(), "id", -5917857342407161654L);
        setField(term4287537, term4287537.getClass(), "extId", term4287539);
        setField(term4287537, term4287537.getClass(), "luid", "lCgkKIMtKy");
        setIntField(term4287554, term4287554.getClass(), "year", 2012);
        setShortField(term4287554, term4287554.getClass(), "month", (short) 10);
        setShortField(term4287554, term4287554.getClass(), "day", (short) 25);
        setField(term4287553, term4287553.getClass(), "date", term4287554);
        setByteField(term4287558, term4287558.getClass(), "hour", (byte) 23);
        setByteField(term4287558, term4287558.getClass(), "minute", (byte) 11);
        setByteField(term4287558, term4287558.getClass(), "second", (byte) 28);
        setIntField(term4287558, term4287558.getClass(), "nano", 377290028);
        setField(term4287553, term4287553.getClass(), "time", term4287558);
        setField(term4287537, term4287537.getClass(), "registerTime", term4287553);
        setIntField(term4287564, term4287564.getClass(), "year", 2015);
        setShortField(term4287564, term4287564.getClass(), "month", (short) 7);
        setShortField(term4287564, term4287564.getClass(), "day", (short) 15);
        setField(term4287563, term4287563.getClass(), "date", term4287564);
        setByteField(term4287568, term4287568.getClass(), "hour", (byte) 3);
        setByteField(term4287568, term4287568.getClass(), "minute", (byte) 24);
        setByteField(term4287568, term4287568.getClass(), "second", (byte) 7);
        setIntField(term4287568, term4287568.getClass(), "nano", 356619096);
        setField(term4287563, term4287563.getClass(), "time", term4287568);
        setField(term4287537, term4287537.getClass(), "accessTime", term4287563);
        setField(term4287535, term4287535.getClass(), "card", term4287537);
        setField(term4287535, term4287535.getClass(), "userName", "MmJpLMnINe");
        setIntField(term4287535, term4287535.getClass(), "isNetMember", 186605181);
        setIntField(term4287535, term4287535.getClass(), "iconId", -497014437);
        setIntField(term4287535, term4287535.getClass(), "plateId", -67880031);
        setIntField(term4287535, term4287535.getClass(), "titleId", 646219453);
        setIntField(term4287535, term4287535.getClass(), "partnerId", 1634100814);
        setIntField(term4287535, term4287535.getClass(), "frameId", 1905177215);
        setIntField(term4287535, term4287535.getClass(), "selectMapId", -451057099);
        setIntField(term4287535, term4287535.getClass(), "totalAwake", -384578848);
        setIntField(term4287535, term4287535.getClass(), "gradeRating", 174880709);
        setIntField(term4287535, term4287535.getClass(), "musicRating", -365769269);
        setIntField(term4287535, term4287535.getClass(), "playerRating", -1421462087);
        setIntField(term4287535, term4287535.getClass(), "highestRating", -1390427380);
        setIntField(term4287535, term4287535.getClass(), "gradeRank", 2135500692);
        setIntField(term4287535, term4287535.getClass(), "classRank", -1903555960);
        setIntField(term4287535, term4287535.getClass(), "courseRank", -1374492593);
        setField(term4287535, term4287535.getClass(), "charaSlot", term4287600);
        setField(term4287535, term4287535.getClass(), "charaLockSlot", term4287610);
        setLongField(term4287535, term4287535.getClass(), "contentBit", -6285262364361908761L);
        setIntField(term4287535, term4287535.getClass(), "playCount", -181624187);
        setField(term4287535, term4287535.getClass(), "eventWatchedDate", "asjjHmNtEA");
        setField(term4287535, term4287535.getClass(), "lastGameId", "lvLBOqyefB");
        setField(term4287535, term4287535.getClass(), "lastRomVersion", "nvSryUuepo");
        setField(term4287535, term4287535.getClass(), "lastDataVersion", "JNAYnbnFAv");
        setField(term4287535, term4287535.getClass(), "lastLoginDate", "pMIFanJzyt");
        setField(term4287535, term4287535.getClass(), "lastPlayDate", "VhdUTTfrBc");
        setIntField(term4287535, term4287535.getClass(), "lastPlayCredit", -2041991034);
        setIntField(term4287535, term4287535.getClass(), "lastPlayMode", 287681855);
        setIntField(term4287535, term4287535.getClass(), "lastPlaceId", 163459541);
        setField(term4287535, term4287535.getClass(), "lastPlaceName", "mSoEOmcghq");
        setIntField(term4287535, term4287535.getClass(), "lastAllNetId", 979386977);
        setIntField(term4287535, term4287535.getClass(), "lastRegionId", 977030481);
        setField(term4287535, term4287535.getClass(), "lastRegionName", "TXAMdlaqJq");
        setField(term4287535, term4287535.getClass(), "lastClientId", "EEfJZytnZr");
        setField(term4287535, term4287535.getClass(), "lastCountryCode", "hDGSulaGTL");
        setIntField(term4287535, term4287535.getClass(), "lastSelectEMoney", 458620963);
        setIntField(term4287535, term4287535.getClass(), "lastSelectTicket", 172356);
        setIntField(term4287535, term4287535.getClass(), "lastSelectCourse", -81090286);
        setIntField(term4287535, term4287535.getClass(), "lastCountCourse", 108063374);
        setField(term4287535, term4287535.getClass(), "firstGameId", "olyMpSgrjH");
        setField(term4287535, term4287535.getClass(), "firstRomVersion", "epOmknTgGG");
        setField(term4287535, term4287535.getClass(), "firstDataVersion", "ahBqEDLKvA");
        setField(term4287535, term4287535.getClass(), "firstPlayDate", "DCWnUPUnaA");
        setField(term4287535, term4287535.getClass(), "compatibleCmVersion", "wVAufNMlPL");
        setField(term4287535, term4287535.getClass(), "dailyBonusDate", "QOkXZJxNnA");
        setField(term4287535, term4287535.getClass(), "dailyCourseBonusDate", "ZdxjQUHcaE");
        setField(term4287535, term4287535.getClass(), "lastPairLoginDate", "avuRfyjsUK");
        setField(term4287535, term4287535.getClass(), "lastTrialPlayDate", "wKshGGKVht");
        setIntField(term4287535, term4287535.getClass(), "playVsCount", -854214962);
        setIntField(term4287535, term4287535.getClass(), "playSyncCount", -321400744);
        setIntField(term4287535, term4287535.getClass(), "winCount", 1479997252);
        setIntField(term4287535, term4287535.getClass(), "helpCount", 428111108);
        setIntField(term4287535, term4287535.getClass(), "comboCount", 1687902512);
        setLongField(term4287535, term4287535.getClass(), "totalDeluxscore", -3144188291034280071L);
        setLongField(term4287535, term4287535.getClass(), "totalBasicDeluxscore", 3287133272902251206L);
        setLongField(term4287535, term4287535.getClass(), "totalAdvancedDeluxscore", -8419179399202801406L);
        setLongField(term4287535, term4287535.getClass(), "totalExpertDeluxscore", 7828828338208488635L);
        setLongField(term4287535, term4287535.getClass(), "totalMasterDeluxscore", -8113382637851926300L);
        setLongField(term4287535, term4287535.getClass(), "totalReMasterDeluxscore", 4220935187228221851L);
        setIntField(term4287535, term4287535.getClass(), "totalSync", 1986274677);
        setIntField(term4287535, term4287535.getClass(), "totalBasicSync", 683527657);
        setIntField(term4287535, term4287535.getClass(), "totalAdvancedSync", -2036578260);
        setIntField(term4287535, term4287535.getClass(), "totalExpertSync", 597813699);
        setIntField(term4287535, term4287535.getClass(), "totalMasterSync", -1037152311);
        setIntField(term4287535, term4287535.getClass(), "totalReMasterSync", -1085308527);
        setLongField(term4287535, term4287535.getClass(), "totalAchievement", 6742012110855952162L);
        setLongField(term4287535, term4287535.getClass(), "totalBasicAchievement", 7720457184982312349L);
        setLongField(term4287535, term4287535.getClass(), "totalAdvancedAchievement", 5755609117671913615L);
        setLongField(term4287535, term4287535.getClass(), "totalExpertAchievement", 7292792613061871421L);
        setLongField(term4287535, term4287535.getClass(), "totalMasterAchievement", -1328631589437929652L);
        setLongField(term4287535, term4287535.getClass(), "totalReMasterAchievement", -985480104009370270L);
        setLongField(term4287535, term4287535.getClass(), "playerOldRating", 4692307585059800975L);
        setLongField(term4287535, term4287535.getClass(), "playerNewRating", -9174645690417396798L);
        setIntField(term4287535, term4287535.getClass(), "banState", -485785359);
        setLongField(term4287535, term4287535.getClass(), "dateTime", -5215000248051145563L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WnorgVNLGC";
        callMethod(klass, "setLastDataVersion", argTypes, term4287535, args);
    }

};


