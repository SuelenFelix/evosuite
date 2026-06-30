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

public class UserDetail_setId_153785021377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4273167;
     Object term4273518;

    public UserDetail_setId_153785021377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4273171 = new Long(-5192352240739849518L);
        Integer term4273234 = new Integer(606449083);
        Integer term4273236 = new Integer(-84390184);
        ArrayList term4273232 = new ArrayList();
        ((ArrayList) term4273232).add(term4273234);
        ((ArrayList) term4273232).add(term4273236);
        Integer term4273242 = new Integer(1107966197);
        Integer term4273244 = new Integer(-987871994);
        Integer term4273246 = new Integer(810730521);
        Integer term4273248 = new Integer(231201522);
        ArrayList term4273240 = new ArrayList();
        ((ArrayList) term4273240).add(term4273242);
        ((ArrayList) term4273240).add(term4273244);
        ((ArrayList) term4273240).add(term4273246);
        ((ArrayList) term4273240).add(term4273248);
        term4273167 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4273169 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4273185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4273186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4273190 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4273195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4273196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4273200 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4273167, term4273167.getClass(), "id", 7916097544879769800L);
        setLongField(term4273169, term4273169.getClass(), "id", 6008568750171466383L);
        setField(term4273169, term4273169.getClass(), "extId", term4273171);
        setField(term4273169, term4273169.getClass(), "luid", "alQVhfFCps");
        setIntField(term4273186, term4273186.getClass(), "year", 2015);
        setShortField(term4273186, term4273186.getClass(), "month", (short) 12);
        setShortField(term4273186, term4273186.getClass(), "day", (short) 10);
        setField(term4273185, term4273185.getClass(), "date", term4273186);
        setByteField(term4273190, term4273190.getClass(), "hour", (byte) 17);
        setByteField(term4273190, term4273190.getClass(), "minute", (byte) 22);
        setByteField(term4273190, term4273190.getClass(), "second", (byte) 12);
        setIntField(term4273190, term4273190.getClass(), "nano", 947676095);
        setField(term4273185, term4273185.getClass(), "time", term4273190);
        setField(term4273169, term4273169.getClass(), "registerTime", term4273185);
        setIntField(term4273196, term4273196.getClass(), "year", 2010);
        setShortField(term4273196, term4273196.getClass(), "month", (short) 7);
        setShortField(term4273196, term4273196.getClass(), "day", (short) 16);
        setField(term4273195, term4273195.getClass(), "date", term4273196);
        setByteField(term4273200, term4273200.getClass(), "hour", (byte) 22);
        setByteField(term4273200, term4273200.getClass(), "minute", (byte) 15);
        setByteField(term4273200, term4273200.getClass(), "second", (byte) 43);
        setIntField(term4273200, term4273200.getClass(), "nano", 82476267);
        setField(term4273195, term4273195.getClass(), "time", term4273200);
        setField(term4273169, term4273169.getClass(), "accessTime", term4273195);
        setField(term4273167, term4273167.getClass(), "card", term4273169);
        setField(term4273167, term4273167.getClass(), "userName", "RwAGsmJzSO");
        setIntField(term4273167, term4273167.getClass(), "isNetMember", -1311816627);
        setIntField(term4273167, term4273167.getClass(), "iconId", 1434458095);
        setIntField(term4273167, term4273167.getClass(), "plateId", 2126265765);
        setIntField(term4273167, term4273167.getClass(), "titleId", 798081981);
        setIntField(term4273167, term4273167.getClass(), "partnerId", -1844777311);
        setIntField(term4273167, term4273167.getClass(), "frameId", -972200561);
        setIntField(term4273167, term4273167.getClass(), "selectMapId", -1726969222);
        setIntField(term4273167, term4273167.getClass(), "totalAwake", -2092913282);
        setIntField(term4273167, term4273167.getClass(), "gradeRating", -1383205975);
        setIntField(term4273167, term4273167.getClass(), "musicRating", -49628997);
        setIntField(term4273167, term4273167.getClass(), "playerRating", 1159660426);
        setIntField(term4273167, term4273167.getClass(), "highestRating", 1693773187);
        setIntField(term4273167, term4273167.getClass(), "gradeRank", 825699402);
        setIntField(term4273167, term4273167.getClass(), "classRank", 144209871);
        setIntField(term4273167, term4273167.getClass(), "courseRank", -276879770);
        setField(term4273167, term4273167.getClass(), "charaSlot", term4273232);
        setField(term4273167, term4273167.getClass(), "charaLockSlot", term4273240);
        setLongField(term4273167, term4273167.getClass(), "contentBit", -8222557238905889847L);
        setIntField(term4273167, term4273167.getClass(), "playCount", 521769599);
        setField(term4273167, term4273167.getClass(), "eventWatchedDate", "mKxiCrOVcN");
        setField(term4273167, term4273167.getClass(), "lastGameId", "GZdYsFGuKL");
        setField(term4273167, term4273167.getClass(), "lastRomVersion", "GnMPAMnEUM");
        setField(term4273167, term4273167.getClass(), "lastDataVersion", "BRoLGNdASY");
        setField(term4273167, term4273167.getClass(), "lastLoginDate", "MuXJIgrQqt");
        setField(term4273167, term4273167.getClass(), "lastPlayDate", "rZhIMwoxRI");
        setIntField(term4273167, term4273167.getClass(), "lastPlayCredit", -665571253);
        setIntField(term4273167, term4273167.getClass(), "lastPlayMode", 753931482);
        setIntField(term4273167, term4273167.getClass(), "lastPlaceId", -408855077);
        setField(term4273167, term4273167.getClass(), "lastPlaceName", "NMOTzvUXEC");
        setIntField(term4273167, term4273167.getClass(), "lastAllNetId", 1198293648);
        setIntField(term4273167, term4273167.getClass(), "lastRegionId", 1395154655);
        setField(term4273167, term4273167.getClass(), "lastRegionName", "unhMQyclPo");
        setField(term4273167, term4273167.getClass(), "lastClientId", "xnnEZLNhPY");
        setField(term4273167, term4273167.getClass(), "lastCountryCode", "PmwbmyPKqU");
        setIntField(term4273167, term4273167.getClass(), "lastSelectEMoney", 503819428);
        setIntField(term4273167, term4273167.getClass(), "lastSelectTicket", -83407188);
        setIntField(term4273167, term4273167.getClass(), "lastSelectCourse", 953211880);
        setIntField(term4273167, term4273167.getClass(), "lastCountCourse", 2005097603);
        setField(term4273167, term4273167.getClass(), "firstGameId", "aTCgMWsiYH");
        setField(term4273167, term4273167.getClass(), "firstRomVersion", "UkmBpEtYYw");
        setField(term4273167, term4273167.getClass(), "firstDataVersion", "CeKBtKEUrx");
        setField(term4273167, term4273167.getClass(), "firstPlayDate", "uHvBdNtICl");
        setField(term4273167, term4273167.getClass(), "compatibleCmVersion", "HKhFOmakvj");
        setField(term4273167, term4273167.getClass(), "dailyBonusDate", "AYBqIKxvZA");
        setField(term4273167, term4273167.getClass(), "dailyCourseBonusDate", "ogOiDaXebP");
        setField(term4273167, term4273167.getClass(), "lastPairLoginDate", "eRrLWKlMvd");
        setField(term4273167, term4273167.getClass(), "lastTrialPlayDate", "fIiOIdOVer");
        setIntField(term4273167, term4273167.getClass(), "playVsCount", -1138617870);
        setIntField(term4273167, term4273167.getClass(), "playSyncCount", -2090353792);
        setIntField(term4273167, term4273167.getClass(), "winCount", 341064624);
        setIntField(term4273167, term4273167.getClass(), "helpCount", 2145458698);
        setIntField(term4273167, term4273167.getClass(), "comboCount", -1724004088);
        setLongField(term4273167, term4273167.getClass(), "totalDeluxscore", -7135785381430134021L);
        setLongField(term4273167, term4273167.getClass(), "totalBasicDeluxscore", 8601468554260706640L);
        setLongField(term4273167, term4273167.getClass(), "totalAdvancedDeluxscore", 4411619839727507187L);
        setLongField(term4273167, term4273167.getClass(), "totalExpertDeluxscore", 7889224196144927586L);
        setLongField(term4273167, term4273167.getClass(), "totalMasterDeluxscore", -5748268396437940668L);
        setLongField(term4273167, term4273167.getClass(), "totalReMasterDeluxscore", -8413502272683343424L);
        setIntField(term4273167, term4273167.getClass(), "totalSync", 1117271069);
        setIntField(term4273167, term4273167.getClass(), "totalBasicSync", -217641176);
        setIntField(term4273167, term4273167.getClass(), "totalAdvancedSync", -1566918411);
        setIntField(term4273167, term4273167.getClass(), "totalExpertSync", -1686522002);
        setIntField(term4273167, term4273167.getClass(), "totalMasterSync", -33160234);
        setIntField(term4273167, term4273167.getClass(), "totalReMasterSync", 698766098);
        setLongField(term4273167, term4273167.getClass(), "totalAchievement", 6140800356383853938L);
        setLongField(term4273167, term4273167.getClass(), "totalBasicAchievement", 4506685982667477354L);
        setLongField(term4273167, term4273167.getClass(), "totalAdvancedAchievement", 764692543823510235L);
        setLongField(term4273167, term4273167.getClass(), "totalExpertAchievement", 2604675247362376804L);
        setLongField(term4273167, term4273167.getClass(), "totalMasterAchievement", -1832877374341914086L);
        setLongField(term4273167, term4273167.getClass(), "totalReMasterAchievement", 2035576035879924155L);
        setLongField(term4273167, term4273167.getClass(), "playerOldRating", 6927010447458105776L);
        setLongField(term4273167, term4273167.getClass(), "playerNewRating", 4597920292380042698L);
        setIntField(term4273167, term4273167.getClass(), "banState", -1957633784);
        setLongField(term4273167, term4273167.getClass(), "dateTime", -5240994130494681375L);
        term4273518 = new Long(-799818742345596231L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4273518;
        callMethod(klass, "setId", argTypes, term4273167, args);
    }

};


