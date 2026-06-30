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

public class UserGeneralData_getId_15124882281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132736;

    public UserGeneralData_getId_15124882281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term132742 = new Long(185793058502220865L);
        Integer term132805 = new Integer(658285959);
        ArrayList term132803 = new ArrayList();
        ((ArrayList) term132803).add(term132805);
        Integer term132811 = new Integer(-89362706);
        Integer term132813 = new Integer(341388367);
        Integer term132815 = new Integer(1078807592);
        Integer term132817 = new Integer(1673044047);
        Integer term132819 = new Integer(-1835617743);
        Integer term132821 = new Integer(-337695922);
        ArrayList term132809 = new ArrayList();
        ((ArrayList) term132809).add(term132811);
        ((ArrayList) term132809).add(term132813);
        ((ArrayList) term132809).add(term132815);
        ((ArrayList) term132809).add(term132817);
        ((ArrayList) term132809).add(term132819);
        ((ArrayList) term132809).add(term132821);
        term132736 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term132738 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term132740 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term132756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132761 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132771 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term132736, term132736.getClass(), "id", 869748810761192708L);
        setLongField(term132738, term132738.getClass(), "id", -6191199874090868625L);
        setLongField(term132740, term132740.getClass(), "id", -1382437482852778669L);
        setField(term132740, term132740.getClass(), "extId", term132742);
        setField(term132740, term132740.getClass(), "luid", "YxeVJOSiti");
        setIntField(term132757, term132757.getClass(), "year", 2021);
        setShortField(term132757, term132757.getClass(), "month", (short) 9);
        setShortField(term132757, term132757.getClass(), "day", (short) 7);
        setField(term132756, term132756.getClass(), "date", term132757);
        setByteField(term132761, term132761.getClass(), "hour", (byte) 16);
        setByteField(term132761, term132761.getClass(), "minute", (byte) 9);
        setByteField(term132761, term132761.getClass(), "second", (byte) 0);
        setIntField(term132761, term132761.getClass(), "nano", 530894568);
        setField(term132756, term132756.getClass(), "time", term132761);
        setField(term132740, term132740.getClass(), "registerTime", term132756);
        setIntField(term132767, term132767.getClass(), "year", 2016);
        setShortField(term132767, term132767.getClass(), "month", (short) 8);
        setShortField(term132767, term132767.getClass(), "day", (short) 27);
        setField(term132766, term132766.getClass(), "date", term132767);
        setByteField(term132771, term132771.getClass(), "hour", (byte) 3);
        setByteField(term132771, term132771.getClass(), "minute", (byte) 10);
        setByteField(term132771, term132771.getClass(), "second", (byte) 27);
        setIntField(term132771, term132771.getClass(), "nano", 429898470);
        setField(term132766, term132766.getClass(), "time", term132771);
        setField(term132740, term132740.getClass(), "accessTime", term132766);
        setField(term132738, term132738.getClass(), "card", term132740);
        setField(term132738, term132738.getClass(), "userName", "IuUPZzTzjB");
        setIntField(term132738, term132738.getClass(), "isNetMember", -1710809144);
        setIntField(term132738, term132738.getClass(), "iconId", -1253292706);
        setIntField(term132738, term132738.getClass(), "plateId", 1627263304);
        setIntField(term132738, term132738.getClass(), "titleId", 2005816851);
        setIntField(term132738, term132738.getClass(), "partnerId", -293521593);
        setIntField(term132738, term132738.getClass(), "frameId", 1850801712);
        setIntField(term132738, term132738.getClass(), "selectMapId", -1360189234);
        setIntField(term132738, term132738.getClass(), "totalAwake", -1602849275);
        setIntField(term132738, term132738.getClass(), "gradeRating", 1177628254);
        setIntField(term132738, term132738.getClass(), "musicRating", 1828135720);
        setIntField(term132738, term132738.getClass(), "playerRating", -1714978703);
        setIntField(term132738, term132738.getClass(), "highestRating", -100914335);
        setIntField(term132738, term132738.getClass(), "gradeRank", 789838565);
        setIntField(term132738, term132738.getClass(), "classRank", 1970218200);
        setIntField(term132738, term132738.getClass(), "courseRank", -742793739);
        setField(term132738, term132738.getClass(), "charaSlot", term132803);
        setField(term132738, term132738.getClass(), "charaLockSlot", term132809);
        setLongField(term132738, term132738.getClass(), "contentBit", 6809947462234647288L);
        setIntField(term132738, term132738.getClass(), "playCount", 160879345);
        setField(term132738, term132738.getClass(), "eventWatchedDate", "YphZwwGqEI");
        setField(term132738, term132738.getClass(), "lastGameId", "SMpEesDFbN");
        setField(term132738, term132738.getClass(), "lastRomVersion", "Nmrdnhkhse");
        setField(term132738, term132738.getClass(), "lastDataVersion", "NUcoviagVt");
        setField(term132738, term132738.getClass(), "lastLoginDate", "LfJIjYgLRK");
        setField(term132738, term132738.getClass(), "lastPlayDate", "ctTLYxopUg");
        setIntField(term132738, term132738.getClass(), "lastPlayCredit", 1294846385);
        setIntField(term132738, term132738.getClass(), "lastPlayMode", -663912774);
        setIntField(term132738, term132738.getClass(), "lastPlaceId", 1537502993);
        setField(term132738, term132738.getClass(), "lastPlaceName", "tccghjUmdc");
        setIntField(term132738, term132738.getClass(), "lastAllNetId", -821343526);
        setIntField(term132738, term132738.getClass(), "lastRegionId", -578811370);
        setField(term132738, term132738.getClass(), "lastRegionName", "iCaFATAsAC");
        setField(term132738, term132738.getClass(), "lastClientId", "HPWJMPlVFI");
        setField(term132738, term132738.getClass(), "lastCountryCode", "ChicGOdcQQ");
        setIntField(term132738, term132738.getClass(), "lastSelectEMoney", 1509308001);
        setIntField(term132738, term132738.getClass(), "lastSelectTicket", -235361641);
        setIntField(term132738, term132738.getClass(), "lastSelectCourse", -1537530133);
        setIntField(term132738, term132738.getClass(), "lastCountCourse", 223751596);
        setField(term132738, term132738.getClass(), "firstGameId", "RDbCrwuOqx");
        setField(term132738, term132738.getClass(), "firstRomVersion", "GpKiABHvoe");
        setField(term132738, term132738.getClass(), "firstDataVersion", "csdvKvMKzx");
        setField(term132738, term132738.getClass(), "firstPlayDate", "xfyCONULzw");
        setField(term132738, term132738.getClass(), "compatibleCmVersion", "SmpXEpmGyR");
        setField(term132738, term132738.getClass(), "dailyBonusDate", "foXieiGQTk");
        setField(term132738, term132738.getClass(), "dailyCourseBonusDate", "XgtGzhZjwe");
        setField(term132738, term132738.getClass(), "lastPairLoginDate", "kuzULljuRL");
        setField(term132738, term132738.getClass(), "lastTrialPlayDate", "DNgbgDcryI");
        setIntField(term132738, term132738.getClass(), "playVsCount", 302291440);
        setIntField(term132738, term132738.getClass(), "playSyncCount", -1607360552);
        setIntField(term132738, term132738.getClass(), "winCount", -343779783);
        setIntField(term132738, term132738.getClass(), "helpCount", 1396187222);
        setIntField(term132738, term132738.getClass(), "comboCount", 1061941712);
        setLongField(term132738, term132738.getClass(), "totalDeluxscore", -1602487942528769713L);
        setLongField(term132738, term132738.getClass(), "totalBasicDeluxscore", 5681877231898605362L);
        setLongField(term132738, term132738.getClass(), "totalAdvancedDeluxscore", -1243477321420442347L);
        setLongField(term132738, term132738.getClass(), "totalExpertDeluxscore", 6793438085217832796L);
        setLongField(term132738, term132738.getClass(), "totalMasterDeluxscore", 7073518113220832191L);
        setLongField(term132738, term132738.getClass(), "totalReMasterDeluxscore", 1710603693265995602L);
        setIntField(term132738, term132738.getClass(), "totalSync", 2121750597);
        setIntField(term132738, term132738.getClass(), "totalBasicSync", 972099051);
        setIntField(term132738, term132738.getClass(), "totalAdvancedSync", -834814848);
        setIntField(term132738, term132738.getClass(), "totalExpertSync", -18540131);
        setIntField(term132738, term132738.getClass(), "totalMasterSync", 2028220249);
        setIntField(term132738, term132738.getClass(), "totalReMasterSync", 1647906129);
        setLongField(term132738, term132738.getClass(), "totalAchievement", 5228934009912684336L);
        setLongField(term132738, term132738.getClass(), "totalBasicAchievement", -6606858516878797846L);
        setLongField(term132738, term132738.getClass(), "totalAdvancedAchievement", -7728586487276085232L);
        setLongField(term132738, term132738.getClass(), "totalExpertAchievement", 54155422839698591L);
        setLongField(term132738, term132738.getClass(), "totalMasterAchievement", -1026186200177503723L);
        setLongField(term132738, term132738.getClass(), "totalReMasterAchievement", 344313079707718516L);
        setLongField(term132738, term132738.getClass(), "playerOldRating", 8300529555075057796L);
        setLongField(term132738, term132738.getClass(), "playerNewRating", -1884742219305402606L);
        setIntField(term132738, term132738.getClass(), "banState", 711901095);
        setLongField(term132738, term132738.getClass(), "dateTime", 1614804836897257207L);
        setField(term132736, term132736.getClass(), "user", term132738);
        setField(term132736, term132736.getClass(), "propertyKey", "NHOLoiInVI");
        setField(term132736, term132736.getClass(), "propertyValue", "PVcjWjrzGf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term132736, args);
    }

};


