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

public class UserDetail_getSelectMapId_12108798539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4234595;

    public UserDetail_getSelectMapId_12108798539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4234599 = new Long(-2970231946983830807L);
        Integer term4234662 = new Integer(1859912957);
        Integer term4234664 = new Integer(1423682963);
        Integer term4234666 = new Integer(-672568445);
        Integer term4234668 = new Integer(1927405731);
        Integer term4234670 = new Integer(1901138263);
        Integer term4234672 = new Integer(-1587806226);
        ArrayList term4234660 = new ArrayList();
        ((ArrayList) term4234660).add(term4234662);
        ((ArrayList) term4234660).add(term4234664);
        ((ArrayList) term4234660).add(term4234666);
        ((ArrayList) term4234660).add(term4234668);
        ((ArrayList) term4234660).add(term4234670);
        ((ArrayList) term4234660).add(term4234672);
        Integer term4234678 = new Integer(-1782020561);
        ArrayList term4234676 = new ArrayList();
        ((ArrayList) term4234676).add(term4234678);
        term4234595 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4234597 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4234613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4234614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4234618 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4234623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4234624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4234628 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4234595, term4234595.getClass(), "id", 7610948650881052121L);
        setLongField(term4234597, term4234597.getClass(), "id", 1336021399204963732L);
        setField(term4234597, term4234597.getClass(), "extId", term4234599);
        setField(term4234597, term4234597.getClass(), "luid", "eahCilNycv");
        setIntField(term4234614, term4234614.getClass(), "year", 2019);
        setShortField(term4234614, term4234614.getClass(), "month", (short) 10);
        setShortField(term4234614, term4234614.getClass(), "day", (short) 30);
        setField(term4234613, term4234613.getClass(), "date", term4234614);
        setByteField(term4234618, term4234618.getClass(), "hour", (byte) 6);
        setByteField(term4234618, term4234618.getClass(), "minute", (byte) 5);
        setByteField(term4234618, term4234618.getClass(), "second", (byte) 39);
        setIntField(term4234618, term4234618.getClass(), "nano", 227388840);
        setField(term4234613, term4234613.getClass(), "time", term4234618);
        setField(term4234597, term4234597.getClass(), "registerTime", term4234613);
        setIntField(term4234624, term4234624.getClass(), "year", 2013);
        setShortField(term4234624, term4234624.getClass(), "month", (short) 8);
        setShortField(term4234624, term4234624.getClass(), "day", (short) 6);
        setField(term4234623, term4234623.getClass(), "date", term4234624);
        setByteField(term4234628, term4234628.getClass(), "hour", (byte) 13);
        setByteField(term4234628, term4234628.getClass(), "minute", (byte) 20);
        setByteField(term4234628, term4234628.getClass(), "second", (byte) 43);
        setIntField(term4234628, term4234628.getClass(), "nano", 376829336);
        setField(term4234623, term4234623.getClass(), "time", term4234628);
        setField(term4234597, term4234597.getClass(), "accessTime", term4234623);
        setField(term4234595, term4234595.getClass(), "card", term4234597);
        setField(term4234595, term4234595.getClass(), "userName", "hvPcoCvTQX");
        setIntField(term4234595, term4234595.getClass(), "isNetMember", 1539823786);
        setIntField(term4234595, term4234595.getClass(), "iconId", 681439700);
        setIntField(term4234595, term4234595.getClass(), "plateId", 75132528);
        setIntField(term4234595, term4234595.getClass(), "titleId", 2028633094);
        setIntField(term4234595, term4234595.getClass(), "partnerId", -196124881);
        setIntField(term4234595, term4234595.getClass(), "frameId", 164802279);
        setIntField(term4234595, term4234595.getClass(), "selectMapId", -224976511);
        setIntField(term4234595, term4234595.getClass(), "totalAwake", -1428250598);
        setIntField(term4234595, term4234595.getClass(), "gradeRating", 698094912);
        setIntField(term4234595, term4234595.getClass(), "musicRating", 1547533800);
        setIntField(term4234595, term4234595.getClass(), "playerRating", -129678402);
        setIntField(term4234595, term4234595.getClass(), "highestRating", -1956149494);
        setIntField(term4234595, term4234595.getClass(), "gradeRank", 1814385458);
        setIntField(term4234595, term4234595.getClass(), "classRank", 1578541422);
        setIntField(term4234595, term4234595.getClass(), "courseRank", 617275449);
        setField(term4234595, term4234595.getClass(), "charaSlot", term4234660);
        setField(term4234595, term4234595.getClass(), "charaLockSlot", term4234676);
        setLongField(term4234595, term4234595.getClass(), "contentBit", 5975832211429207550L);
        setIntField(term4234595, term4234595.getClass(), "playCount", -228860129);
        setField(term4234595, term4234595.getClass(), "eventWatchedDate", "zUgVVwpSFr");
        setField(term4234595, term4234595.getClass(), "lastGameId", "tBjurDVsZY");
        setField(term4234595, term4234595.getClass(), "lastRomVersion", "tKDdEEdTkw");
        setField(term4234595, term4234595.getClass(), "lastDataVersion", "zWEphNmtmL");
        setField(term4234595, term4234595.getClass(), "lastLoginDate", "qAWQatFqec");
        setField(term4234595, term4234595.getClass(), "lastPlayDate", "LSLuNvzAak");
        setIntField(term4234595, term4234595.getClass(), "lastPlayCredit", -1228938925);
        setIntField(term4234595, term4234595.getClass(), "lastPlayMode", -918554448);
        setIntField(term4234595, term4234595.getClass(), "lastPlaceId", 748202946);
        setField(term4234595, term4234595.getClass(), "lastPlaceName", "vvUnZBFSah");
        setIntField(term4234595, term4234595.getClass(), "lastAllNetId", 2035930845);
        setIntField(term4234595, term4234595.getClass(), "lastRegionId", -1130793410);
        setField(term4234595, term4234595.getClass(), "lastRegionName", "TXwhfVZlGd");
        setField(term4234595, term4234595.getClass(), "lastClientId", "JNmzNbUZtH");
        setField(term4234595, term4234595.getClass(), "lastCountryCode", "NLnEClSAZt");
        setIntField(term4234595, term4234595.getClass(), "lastSelectEMoney", -1471594169);
        setIntField(term4234595, term4234595.getClass(), "lastSelectTicket", -2015355563);
        setIntField(term4234595, term4234595.getClass(), "lastSelectCourse", 2123873895);
        setIntField(term4234595, term4234595.getClass(), "lastCountCourse", 222119536);
        setField(term4234595, term4234595.getClass(), "firstGameId", "bMVdXuOBAM");
        setField(term4234595, term4234595.getClass(), "firstRomVersion", "WcpachPRoU");
        setField(term4234595, term4234595.getClass(), "firstDataVersion", "uTrydPJRjM");
        setField(term4234595, term4234595.getClass(), "firstPlayDate", "ZivbKGjuVg");
        setField(term4234595, term4234595.getClass(), "compatibleCmVersion", "VwKFHEgGBF");
        setField(term4234595, term4234595.getClass(), "dailyBonusDate", "LLxoRVHMmm");
        setField(term4234595, term4234595.getClass(), "dailyCourseBonusDate", "XkdZgoGhjG");
        setField(term4234595, term4234595.getClass(), "lastPairLoginDate", "ReJYBOauJL");
        setField(term4234595, term4234595.getClass(), "lastTrialPlayDate", "bdEDLzBCGj");
        setIntField(term4234595, term4234595.getClass(), "playVsCount", 2043687223);
        setIntField(term4234595, term4234595.getClass(), "playSyncCount", 1301158355);
        setIntField(term4234595, term4234595.getClass(), "winCount", -103621855);
        setIntField(term4234595, term4234595.getClass(), "helpCount", -1550223078);
        setIntField(term4234595, term4234595.getClass(), "comboCount", -2009486033);
        setLongField(term4234595, term4234595.getClass(), "totalDeluxscore", 8513432514031845152L);
        setLongField(term4234595, term4234595.getClass(), "totalBasicDeluxscore", 1152671432981782214L);
        setLongField(term4234595, term4234595.getClass(), "totalAdvancedDeluxscore", -521641957208405130L);
        setLongField(term4234595, term4234595.getClass(), "totalExpertDeluxscore", -1209354143521907435L);
        setLongField(term4234595, term4234595.getClass(), "totalMasterDeluxscore", 7503799119627108826L);
        setLongField(term4234595, term4234595.getClass(), "totalReMasterDeluxscore", -5027844512633699718L);
        setIntField(term4234595, term4234595.getClass(), "totalSync", -224909579);
        setIntField(term4234595, term4234595.getClass(), "totalBasicSync", -588951145);
        setIntField(term4234595, term4234595.getClass(), "totalAdvancedSync", 203855416);
        setIntField(term4234595, term4234595.getClass(), "totalExpertSync", 1741790992);
        setIntField(term4234595, term4234595.getClass(), "totalMasterSync", -772449923);
        setIntField(term4234595, term4234595.getClass(), "totalReMasterSync", 1320569245);
        setLongField(term4234595, term4234595.getClass(), "totalAchievement", 3048826203958720183L);
        setLongField(term4234595, term4234595.getClass(), "totalBasicAchievement", 7697993879218068405L);
        setLongField(term4234595, term4234595.getClass(), "totalAdvancedAchievement", 4491483840258744259L);
        setLongField(term4234595, term4234595.getClass(), "totalExpertAchievement", -6773740324015553670L);
        setLongField(term4234595, term4234595.getClass(), "totalMasterAchievement", 618601291939296864L);
        setLongField(term4234595, term4234595.getClass(), "totalReMasterAchievement", 6836785796592412020L);
        setLongField(term4234595, term4234595.getClass(), "playerOldRating", -4979304824472773563L);
        setLongField(term4234595, term4234595.getClass(), "playerNewRating", -8290660144873378420L);
        setIntField(term4234595, term4234595.getClass(), "banState", -959495710);
        setLongField(term4234595, term4234595.getClass(), "dateTime", 5989292601684895325L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectMapId", argTypes, term4234595, args);
    }

};


