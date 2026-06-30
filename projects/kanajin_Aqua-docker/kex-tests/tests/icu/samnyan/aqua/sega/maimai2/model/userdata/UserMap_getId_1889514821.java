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

public class UserMap_getId_1889514821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573812;

    public UserMap_getId_1889514821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term573818 = new Long(-7671399023433976259L);
        Integer term573881 = new Integer(609266606);
        Integer term573883 = new Integer(1221933023);
        Integer term573885 = new Integer(-216688430);
        ArrayList term573879 = new ArrayList();
        ((ArrayList) term573879).add(term573881);
        ((ArrayList) term573879).add(term573883);
        ((ArrayList) term573879).add(term573885);
        Integer term573891 = new Integer(456466881);
        Integer term573893 = new Integer(-106998943);
        Integer term573895 = new Integer(1961013692);
        Integer term573897 = new Integer(-957809597);
        Integer term573899 = new Integer(1086125728);
        Integer term573901 = new Integer(1992510749);
        ArrayList term573889 = new ArrayList();
        ((ArrayList) term573889).add(term573891);
        ((ArrayList) term573889).add(term573893);
        ((ArrayList) term573889).add(term573895);
        ((ArrayList) term573889).add(term573897);
        ((ArrayList) term573889).add(term573899);
        ((ArrayList) term573889).add(term573901);
        term573812 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term573814 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term573816 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term573832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term573833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term573837 = newInstance(Class.forName("java.time.LocalTime"));
        Object term573842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term573843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term573847 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term573812, term573812.getClass(), "id", -1457665152872901755L);
        setLongField(term573814, term573814.getClass(), "id", -4847357553169340361L);
        setLongField(term573816, term573816.getClass(), "id", 3217668533557910042L);
        setField(term573816, term573816.getClass(), "extId", term573818);
        setField(term573816, term573816.getClass(), "luid", "bKzCMZUGUK");
        setIntField(term573833, term573833.getClass(), "year", 2029);
        setShortField(term573833, term573833.getClass(), "month", (short) 6);
        setShortField(term573833, term573833.getClass(), "day", (short) 27);
        setField(term573832, term573832.getClass(), "date", term573833);
        setByteField(term573837, term573837.getClass(), "hour", (byte) 0);
        setByteField(term573837, term573837.getClass(), "minute", (byte) 18);
        setByteField(term573837, term573837.getClass(), "second", (byte) 15);
        setIntField(term573837, term573837.getClass(), "nano", 833456219);
        setField(term573832, term573832.getClass(), "time", term573837);
        setField(term573816, term573816.getClass(), "registerTime", term573832);
        setIntField(term573843, term573843.getClass(), "year", 2011);
        setShortField(term573843, term573843.getClass(), "month", (short) 6);
        setShortField(term573843, term573843.getClass(), "day", (short) 5);
        setField(term573842, term573842.getClass(), "date", term573843);
        setByteField(term573847, term573847.getClass(), "hour", (byte) 16);
        setByteField(term573847, term573847.getClass(), "minute", (byte) 13);
        setByteField(term573847, term573847.getClass(), "second", (byte) 21);
        setIntField(term573847, term573847.getClass(), "nano", 159356548);
        setField(term573842, term573842.getClass(), "time", term573847);
        setField(term573816, term573816.getClass(), "accessTime", term573842);
        setField(term573814, term573814.getClass(), "card", term573816);
        setField(term573814, term573814.getClass(), "userName", "eoUNgaoovV");
        setIntField(term573814, term573814.getClass(), "isNetMember", -765414079);
        setIntField(term573814, term573814.getClass(), "iconId", -236100997);
        setIntField(term573814, term573814.getClass(), "plateId", 468323213);
        setIntField(term573814, term573814.getClass(), "titleId", 1703380060);
        setIntField(term573814, term573814.getClass(), "partnerId", 340743165);
        setIntField(term573814, term573814.getClass(), "frameId", -4478258);
        setIntField(term573814, term573814.getClass(), "selectMapId", -2016201640);
        setIntField(term573814, term573814.getClass(), "totalAwake", -827992684);
        setIntField(term573814, term573814.getClass(), "gradeRating", 1000054106);
        setIntField(term573814, term573814.getClass(), "musicRating", -1366158847);
        setIntField(term573814, term573814.getClass(), "playerRating", -1546036027);
        setIntField(term573814, term573814.getClass(), "highestRating", 199685450);
        setIntField(term573814, term573814.getClass(), "gradeRank", 623085564);
        setIntField(term573814, term573814.getClass(), "classRank", 1578445900);
        setIntField(term573814, term573814.getClass(), "courseRank", 1886162379);
        setField(term573814, term573814.getClass(), "charaSlot", term573879);
        setField(term573814, term573814.getClass(), "charaLockSlot", term573889);
        setLongField(term573814, term573814.getClass(), "contentBit", 6103338369439000690L);
        setIntField(term573814, term573814.getClass(), "playCount", 919814321);
        setField(term573814, term573814.getClass(), "eventWatchedDate", "rbhKVNxIFL");
        setField(term573814, term573814.getClass(), "lastGameId", "imPVCKPCXa");
        setField(term573814, term573814.getClass(), "lastRomVersion", "UtfsGFVUjP");
        setField(term573814, term573814.getClass(), "lastDataVersion", "oaIXbZxkeY");
        setField(term573814, term573814.getClass(), "lastLoginDate", "PZJlSomYvc");
        setField(term573814, term573814.getClass(), "lastPlayDate", "ZmiEFVhzqJ");
        setIntField(term573814, term573814.getClass(), "lastPlayCredit", -681315067);
        setIntField(term573814, term573814.getClass(), "lastPlayMode", -1273972337);
        setIntField(term573814, term573814.getClass(), "lastPlaceId", -1643383019);
        setField(term573814, term573814.getClass(), "lastPlaceName", "WbDJsUeEOW");
        setIntField(term573814, term573814.getClass(), "lastAllNetId", -1659843083);
        setIntField(term573814, term573814.getClass(), "lastRegionId", 1242271946);
        setField(term573814, term573814.getClass(), "lastRegionName", "iIQzZpfDCm");
        setField(term573814, term573814.getClass(), "lastClientId", "baCNXJIFRS");
        setField(term573814, term573814.getClass(), "lastCountryCode", "PgRRZEmkFz");
        setIntField(term573814, term573814.getClass(), "lastSelectEMoney", -908916221);
        setIntField(term573814, term573814.getClass(), "lastSelectTicket", -120905518);
        setIntField(term573814, term573814.getClass(), "lastSelectCourse", -95544448);
        setIntField(term573814, term573814.getClass(), "lastCountCourse", 1930332872);
        setField(term573814, term573814.getClass(), "firstGameId", "sOJIoAClZO");
        setField(term573814, term573814.getClass(), "firstRomVersion", "qKIZBgLKUe");
        setField(term573814, term573814.getClass(), "firstDataVersion", "DWTmcNYhmq");
        setField(term573814, term573814.getClass(), "firstPlayDate", "ttjBTgZYuN");
        setField(term573814, term573814.getClass(), "compatibleCmVersion", "BEuPRcjSWg");
        setField(term573814, term573814.getClass(), "dailyBonusDate", "BqfbOObzOa");
        setField(term573814, term573814.getClass(), "dailyCourseBonusDate", "NiSPrjFkQv");
        setField(term573814, term573814.getClass(), "lastPairLoginDate", "naInjQOjcI");
        setField(term573814, term573814.getClass(), "lastTrialPlayDate", "cjkvzymNGH");
        setIntField(term573814, term573814.getClass(), "playVsCount", -1580758767);
        setIntField(term573814, term573814.getClass(), "playSyncCount", 370665161);
        setIntField(term573814, term573814.getClass(), "winCount", 596766584);
        setIntField(term573814, term573814.getClass(), "helpCount", -2144773928);
        setIntField(term573814, term573814.getClass(), "comboCount", 729059969);
        setLongField(term573814, term573814.getClass(), "totalDeluxscore", -5759312225205693068L);
        setLongField(term573814, term573814.getClass(), "totalBasicDeluxscore", 4435120853546159963L);
        setLongField(term573814, term573814.getClass(), "totalAdvancedDeluxscore", 5392400743828164021L);
        setLongField(term573814, term573814.getClass(), "totalExpertDeluxscore", 2566479071618847760L);
        setLongField(term573814, term573814.getClass(), "totalMasterDeluxscore", -8634837484674985103L);
        setLongField(term573814, term573814.getClass(), "totalReMasterDeluxscore", -6277400052520434118L);
        setIntField(term573814, term573814.getClass(), "totalSync", -897806161);
        setIntField(term573814, term573814.getClass(), "totalBasicSync", -768922740);
        setIntField(term573814, term573814.getClass(), "totalAdvancedSync", -403703390);
        setIntField(term573814, term573814.getClass(), "totalExpertSync", 396293591);
        setIntField(term573814, term573814.getClass(), "totalMasterSync", 1023056828);
        setIntField(term573814, term573814.getClass(), "totalReMasterSync", -1629251344);
        setLongField(term573814, term573814.getClass(), "totalAchievement", 9049447848990404207L);
        setLongField(term573814, term573814.getClass(), "totalBasicAchievement", -5643817975656356750L);
        setLongField(term573814, term573814.getClass(), "totalAdvancedAchievement", 7975766799182361777L);
        setLongField(term573814, term573814.getClass(), "totalExpertAchievement", -3158616159300569888L);
        setLongField(term573814, term573814.getClass(), "totalMasterAchievement", -3226358046179226191L);
        setLongField(term573814, term573814.getClass(), "totalReMasterAchievement", -1631014912066730971L);
        setLongField(term573814, term573814.getClass(), "playerOldRating", -2445318028296706579L);
        setLongField(term573814, term573814.getClass(), "playerNewRating", 9103398580159868538L);
        setIntField(term573814, term573814.getClass(), "banState", -1922405809);
        setLongField(term573814, term573814.getClass(), "dateTime", 3608718137955571365L);
        setField(term573812, term573812.getClass(), "user", term573814);
        setIntField(term573812, term573812.getClass(), "mapId", 764922873);
        setIntField(term573812, term573812.getClass(), "distance", 1380977019);
        setBooleanField(term573812, term573812.getClass(), "isLock", false);
        setBooleanField(term573812, term573812.getClass(), "isClear", true);
        setBooleanField(term573812, term573812.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term573812, args);
    }

};


