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

public class UserGeneralData_canEqual_125159573810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138907;
     Object term139286;

    public UserGeneralData_canEqual_125159573810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138913 = new Long(5904678961906211249L);
        Integer term138976 = new Integer(72767889);
        ArrayList term138974 = new ArrayList();
        ((ArrayList) term138974).add(term138976);
        Integer term138982 = new Integer(1699515029);
        Integer term138984 = new Integer(673153263);
        Integer term138986 = new Integer(-1355715967);
        Integer term138988 = new Integer(-972516789);
        Integer term138990 = new Integer(720077443);
        Integer term138992 = new Integer(-884523977);
        ArrayList term138980 = new ArrayList();
        ((ArrayList) term138980).add(term138982);
        ((ArrayList) term138980).add(term138984);
        ((ArrayList) term138980).add(term138986);
        ((ArrayList) term138980).add(term138988);
        ((ArrayList) term138980).add(term138990);
        ((ArrayList) term138980).add(term138992);
        term138907 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term138909 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term138911 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term138927 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138928 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138932 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138942 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term138907, term138907.getClass(), "id", 4436561124357681867L);
        setLongField(term138909, term138909.getClass(), "id", 7785246707179468138L);
        setLongField(term138911, term138911.getClass(), "id", -8533120697864087610L);
        setField(term138911, term138911.getClass(), "extId", term138913);
        setField(term138911, term138911.getClass(), "luid", "XDCvxTTtyO");
        setIntField(term138928, term138928.getClass(), "year", 2014);
        setShortField(term138928, term138928.getClass(), "month", (short) 11);
        setShortField(term138928, term138928.getClass(), "day", (short) 17);
        setField(term138927, term138927.getClass(), "date", term138928);
        setByteField(term138932, term138932.getClass(), "hour", (byte) 16);
        setByteField(term138932, term138932.getClass(), "minute", (byte) 57);
        setByteField(term138932, term138932.getClass(), "second", (byte) 36);
        setIntField(term138932, term138932.getClass(), "nano", 336508243);
        setField(term138927, term138927.getClass(), "time", term138932);
        setField(term138911, term138911.getClass(), "registerTime", term138927);
        setIntField(term138938, term138938.getClass(), "year", 2020);
        setShortField(term138938, term138938.getClass(), "month", (short) 5);
        setShortField(term138938, term138938.getClass(), "day", (short) 21);
        setField(term138937, term138937.getClass(), "date", term138938);
        setByteField(term138942, term138942.getClass(), "hour", (byte) 1);
        setByteField(term138942, term138942.getClass(), "minute", (byte) 0);
        setByteField(term138942, term138942.getClass(), "second", (byte) 30);
        setIntField(term138942, term138942.getClass(), "nano", 495919259);
        setField(term138937, term138937.getClass(), "time", term138942);
        setField(term138911, term138911.getClass(), "accessTime", term138937);
        setField(term138909, term138909.getClass(), "card", term138911);
        setField(term138909, term138909.getClass(), "userName", "kOpXEPJinJ");
        setIntField(term138909, term138909.getClass(), "isNetMember", -967088595);
        setIntField(term138909, term138909.getClass(), "iconId", 1703596113);
        setIntField(term138909, term138909.getClass(), "plateId", -1570405490);
        setIntField(term138909, term138909.getClass(), "titleId", 2093699918);
        setIntField(term138909, term138909.getClass(), "partnerId", -1477783757);
        setIntField(term138909, term138909.getClass(), "frameId", -1106829807);
        setIntField(term138909, term138909.getClass(), "selectMapId", 1056213101);
        setIntField(term138909, term138909.getClass(), "totalAwake", 1985766183);
        setIntField(term138909, term138909.getClass(), "gradeRating", -789887248);
        setIntField(term138909, term138909.getClass(), "musicRating", -833940690);
        setIntField(term138909, term138909.getClass(), "playerRating", -202105331);
        setIntField(term138909, term138909.getClass(), "highestRating", 1446394868);
        setIntField(term138909, term138909.getClass(), "gradeRank", -385831603);
        setIntField(term138909, term138909.getClass(), "classRank", -1896400624);
        setIntField(term138909, term138909.getClass(), "courseRank", -186142402);
        setField(term138909, term138909.getClass(), "charaSlot", term138974);
        setField(term138909, term138909.getClass(), "charaLockSlot", term138980);
        setLongField(term138909, term138909.getClass(), "contentBit", -2662490208363678899L);
        setIntField(term138909, term138909.getClass(), "playCount", -87117118);
        setField(term138909, term138909.getClass(), "eventWatchedDate", "rttNPStAfM");
        setField(term138909, term138909.getClass(), "lastGameId", "THLYTYdxwA");
        setField(term138909, term138909.getClass(), "lastRomVersion", "nMaKkGsKjH");
        setField(term138909, term138909.getClass(), "lastDataVersion", "bzgnEgNnJB");
        setField(term138909, term138909.getClass(), "lastLoginDate", "trgyZVXoXP");
        setField(term138909, term138909.getClass(), "lastPlayDate", "zggGcOxpDe");
        setIntField(term138909, term138909.getClass(), "lastPlayCredit", 240936347);
        setIntField(term138909, term138909.getClass(), "lastPlayMode", -1531057884);
        setIntField(term138909, term138909.getClass(), "lastPlaceId", -942173626);
        setField(term138909, term138909.getClass(), "lastPlaceName", "XdJngfMEyc");
        setIntField(term138909, term138909.getClass(), "lastAllNetId", 209865960);
        setIntField(term138909, term138909.getClass(), "lastRegionId", -1616150864);
        setField(term138909, term138909.getClass(), "lastRegionName", "fBrxpovrjQ");
        setField(term138909, term138909.getClass(), "lastClientId", "vWNTKunytj");
        setField(term138909, term138909.getClass(), "lastCountryCode", "pbUCEQENML");
        setIntField(term138909, term138909.getClass(), "lastSelectEMoney", -1945453513);
        setIntField(term138909, term138909.getClass(), "lastSelectTicket", -1022307429);
        setIntField(term138909, term138909.getClass(), "lastSelectCourse", 1058681211);
        setIntField(term138909, term138909.getClass(), "lastCountCourse", -1476609706);
        setField(term138909, term138909.getClass(), "firstGameId", "iMEaCLgkkA");
        setField(term138909, term138909.getClass(), "firstRomVersion", "GTYlwBwnyr");
        setField(term138909, term138909.getClass(), "firstDataVersion", "EWesRocaYe");
        setField(term138909, term138909.getClass(), "firstPlayDate", "LXbvqrOwML");
        setField(term138909, term138909.getClass(), "compatibleCmVersion", "oJtyLMFIaY");
        setField(term138909, term138909.getClass(), "dailyBonusDate", "OvGOlSMJSa");
        setField(term138909, term138909.getClass(), "dailyCourseBonusDate", "bxfVqYYRGF");
        setField(term138909, term138909.getClass(), "lastPairLoginDate", "wFXqDDYRYm");
        setField(term138909, term138909.getClass(), "lastTrialPlayDate", "kzyZeMslFg");
        setIntField(term138909, term138909.getClass(), "playVsCount", -807331064);
        setIntField(term138909, term138909.getClass(), "playSyncCount", 4051182);
        setIntField(term138909, term138909.getClass(), "winCount", -868532730);
        setIntField(term138909, term138909.getClass(), "helpCount", -90828570);
        setIntField(term138909, term138909.getClass(), "comboCount", -340081641);
        setLongField(term138909, term138909.getClass(), "totalDeluxscore", -4424831168975735932L);
        setLongField(term138909, term138909.getClass(), "totalBasicDeluxscore", 6693935559545558408L);
        setLongField(term138909, term138909.getClass(), "totalAdvancedDeluxscore", -6433100511031376773L);
        setLongField(term138909, term138909.getClass(), "totalExpertDeluxscore", -7914310730896725122L);
        setLongField(term138909, term138909.getClass(), "totalMasterDeluxscore", 2540539108605766178L);
        setLongField(term138909, term138909.getClass(), "totalReMasterDeluxscore", -8724394930084436347L);
        setIntField(term138909, term138909.getClass(), "totalSync", -1412324757);
        setIntField(term138909, term138909.getClass(), "totalBasicSync", 140849786);
        setIntField(term138909, term138909.getClass(), "totalAdvancedSync", 34056751);
        setIntField(term138909, term138909.getClass(), "totalExpertSync", 1802001091);
        setIntField(term138909, term138909.getClass(), "totalMasterSync", -1767833537);
        setIntField(term138909, term138909.getClass(), "totalReMasterSync", -215734173);
        setLongField(term138909, term138909.getClass(), "totalAchievement", 8450461365517127787L);
        setLongField(term138909, term138909.getClass(), "totalBasicAchievement", -1798490101551867119L);
        setLongField(term138909, term138909.getClass(), "totalAdvancedAchievement", 2857537321280049041L);
        setLongField(term138909, term138909.getClass(), "totalExpertAchievement", 631345976660422673L);
        setLongField(term138909, term138909.getClass(), "totalMasterAchievement", 1665453023351702547L);
        setLongField(term138909, term138909.getClass(), "totalReMasterAchievement", -1593642402870239080L);
        setLongField(term138909, term138909.getClass(), "playerOldRating", 4413528788382655231L);
        setLongField(term138909, term138909.getClass(), "playerNewRating", 6376234063744922560L);
        setIntField(term138909, term138909.getClass(), "banState", -1841017701);
        setLongField(term138909, term138909.getClass(), "dateTime", -6464012852650897805L);
        setField(term138907, term138907.getClass(), "user", term138909);
        setField(term138907, term138907.getClass(), "propertyKey", "SjqDahcFQi");
        setField(term138907, term138907.getClass(), "propertyValue", "DVOSJnQsiN");
        term139286 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term139286;
        callMethod(klass, "canEqual", argTypes, term138907, args);
    }

};


