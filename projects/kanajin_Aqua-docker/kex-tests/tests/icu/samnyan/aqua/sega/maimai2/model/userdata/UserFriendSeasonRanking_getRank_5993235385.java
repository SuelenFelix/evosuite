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

public class UserFriendSeasonRanking_getRank_5993235385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17661;

    public UserFriendSeasonRanking_getRank_5993235385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17667 = new Long(6855071767938501807L);
        Integer term17730 = new Integer(1743683601);
        Integer term17732 = new Integer(-945116798);
        Integer term17734 = new Integer(1593461795);
        Integer term17736 = new Integer(515182546);
        Integer term17738 = new Integer(-936895502);
        Integer term17740 = new Integer(-129547140);
        ArrayList term17728 = new ArrayList();
        ((ArrayList) term17728).add(term17730);
        ((ArrayList) term17728).add(term17732);
        ((ArrayList) term17728).add(term17734);
        ((ArrayList) term17728).add(term17736);
        ((ArrayList) term17728).add(term17738);
        ((ArrayList) term17728).add(term17740);
        Integer term17746 = new Integer(199287428);
        Integer term17748 = new Integer(-1195339592);
        Integer term17750 = new Integer(-376422566);
        Integer term17752 = new Integer(306847454);
        Integer term17754 = new Integer(1745276158);
        Integer term17756 = new Integer(2009020256);
        Integer term17758 = new Integer(2049577015);
        ArrayList term17744 = new ArrayList();
        ((ArrayList) term17744).add(term17746);
        ((ArrayList) term17744).add(term17748);
        ((ArrayList) term17744).add(term17750);
        ((ArrayList) term17744).add(term17752);
        ((ArrayList) term17744).add(term17754);
        ((ArrayList) term17744).add(term17756);
        ((ArrayList) term17744).add(term17758);
        term17661 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term17663 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term17665 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term17681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17696 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term17661, term17661.getClass(), "id", -8957441653116712448L);
        setLongField(term17663, term17663.getClass(), "id", -5761087225966065493L);
        setLongField(term17665, term17665.getClass(), "id", 493557348274366095L);
        setField(term17665, term17665.getClass(), "extId", term17667);
        setField(term17665, term17665.getClass(), "luid", "RbQmXqfXAT");
        setIntField(term17682, term17682.getClass(), "year", 2016);
        setShortField(term17682, term17682.getClass(), "month", (short) 2);
        setShortField(term17682, term17682.getClass(), "day", (short) 25);
        setField(term17681, term17681.getClass(), "date", term17682);
        setByteField(term17686, term17686.getClass(), "hour", (byte) 8);
        setByteField(term17686, term17686.getClass(), "minute", (byte) 54);
        setByteField(term17686, term17686.getClass(), "second", (byte) 40);
        setIntField(term17686, term17686.getClass(), "nano", 124525896);
        setField(term17681, term17681.getClass(), "time", term17686);
        setField(term17665, term17665.getClass(), "registerTime", term17681);
        setIntField(term17692, term17692.getClass(), "year", 2029);
        setShortField(term17692, term17692.getClass(), "month", (short) 1);
        setShortField(term17692, term17692.getClass(), "day", (short) 10);
        setField(term17691, term17691.getClass(), "date", term17692);
        setByteField(term17696, term17696.getClass(), "hour", (byte) 8);
        setByteField(term17696, term17696.getClass(), "minute", (byte) 46);
        setByteField(term17696, term17696.getClass(), "second", (byte) 35);
        setIntField(term17696, term17696.getClass(), "nano", 58807194);
        setField(term17691, term17691.getClass(), "time", term17696);
        setField(term17665, term17665.getClass(), "accessTime", term17691);
        setField(term17663, term17663.getClass(), "card", term17665);
        setField(term17663, term17663.getClass(), "userName", "fcCAsvfBbe");
        setIntField(term17663, term17663.getClass(), "isNetMember", -1062027102);
        setIntField(term17663, term17663.getClass(), "iconId", 1763217806);
        setIntField(term17663, term17663.getClass(), "plateId", 1644949396);
        setIntField(term17663, term17663.getClass(), "titleId", -2017073245);
        setIntField(term17663, term17663.getClass(), "partnerId", 522440332);
        setIntField(term17663, term17663.getClass(), "frameId", 1516598327);
        setIntField(term17663, term17663.getClass(), "selectMapId", 82353584);
        setIntField(term17663, term17663.getClass(), "totalAwake", -758778797);
        setIntField(term17663, term17663.getClass(), "gradeRating", 765680355);
        setIntField(term17663, term17663.getClass(), "musicRating", -1012090049);
        setIntField(term17663, term17663.getClass(), "playerRating", -2025214553);
        setIntField(term17663, term17663.getClass(), "highestRating", -154750730);
        setIntField(term17663, term17663.getClass(), "gradeRank", -2047179134);
        setIntField(term17663, term17663.getClass(), "classRank", 44908093);
        setIntField(term17663, term17663.getClass(), "courseRank", 887198203);
        setField(term17663, term17663.getClass(), "charaSlot", term17728);
        setField(term17663, term17663.getClass(), "charaLockSlot", term17744);
        setLongField(term17663, term17663.getClass(), "contentBit", 8699742215739444902L);
        setIntField(term17663, term17663.getClass(), "playCount", 12581312);
        setField(term17663, term17663.getClass(), "eventWatchedDate", "mUNcKUxghj");
        setField(term17663, term17663.getClass(), "lastGameId", "lnvLKbtveE");
        setField(term17663, term17663.getClass(), "lastRomVersion", "FfrrEhTHzQ");
        setField(term17663, term17663.getClass(), "lastDataVersion", "LXnDNrMsqT");
        setField(term17663, term17663.getClass(), "lastLoginDate", "ZLQamJFBmu");
        setField(term17663, term17663.getClass(), "lastPlayDate", "ZWcOCwKNvd");
        setIntField(term17663, term17663.getClass(), "lastPlayCredit", 2087383644);
        setIntField(term17663, term17663.getClass(), "lastPlayMode", 405527523);
        setIntField(term17663, term17663.getClass(), "lastPlaceId", -1123526433);
        setField(term17663, term17663.getClass(), "lastPlaceName", "GTmoNrziyc");
        setIntField(term17663, term17663.getClass(), "lastAllNetId", 910269225);
        setIntField(term17663, term17663.getClass(), "lastRegionId", -298852874);
        setField(term17663, term17663.getClass(), "lastRegionName", "LvztehSlhM");
        setField(term17663, term17663.getClass(), "lastClientId", "njvnWFTMxN");
        setField(term17663, term17663.getClass(), "lastCountryCode", "fLRqcTSfzF");
        setIntField(term17663, term17663.getClass(), "lastSelectEMoney", 1094297953);
        setIntField(term17663, term17663.getClass(), "lastSelectTicket", -329141819);
        setIntField(term17663, term17663.getClass(), "lastSelectCourse", -963204620);
        setIntField(term17663, term17663.getClass(), "lastCountCourse", 172898580);
        setField(term17663, term17663.getClass(), "firstGameId", "EBYHwsuWAU");
        setField(term17663, term17663.getClass(), "firstRomVersion", "PtIjKpiSix");
        setField(term17663, term17663.getClass(), "firstDataVersion", "NZdTuwSCIM");
        setField(term17663, term17663.getClass(), "firstPlayDate", "dDHcmzPAmP");
        setField(term17663, term17663.getClass(), "compatibleCmVersion", "HEaTkWYBgv");
        setField(term17663, term17663.getClass(), "dailyBonusDate", "MpJsPKLTIU");
        setField(term17663, term17663.getClass(), "dailyCourseBonusDate", "IiNCZfdouL");
        setField(term17663, term17663.getClass(), "lastPairLoginDate", "AhOHzCsHKW");
        setField(term17663, term17663.getClass(), "lastTrialPlayDate", "UqgLPaaAHi");
        setIntField(term17663, term17663.getClass(), "playVsCount", -777833461);
        setIntField(term17663, term17663.getClass(), "playSyncCount", 1583691829);
        setIntField(term17663, term17663.getClass(), "winCount", -1468541076);
        setIntField(term17663, term17663.getClass(), "helpCount", -1796760393);
        setIntField(term17663, term17663.getClass(), "comboCount", -2099267271);
        setLongField(term17663, term17663.getClass(), "totalDeluxscore", 8261619652909874476L);
        setLongField(term17663, term17663.getClass(), "totalBasicDeluxscore", -3692936312179064102L);
        setLongField(term17663, term17663.getClass(), "totalAdvancedDeluxscore", 5498944509671266637L);
        setLongField(term17663, term17663.getClass(), "totalExpertDeluxscore", -6838909359433858599L);
        setLongField(term17663, term17663.getClass(), "totalMasterDeluxscore", 4947643967691976731L);
        setLongField(term17663, term17663.getClass(), "totalReMasterDeluxscore", 4548576710115075073L);
        setIntField(term17663, term17663.getClass(), "totalSync", 1134565344);
        setIntField(term17663, term17663.getClass(), "totalBasicSync", -1747434000);
        setIntField(term17663, term17663.getClass(), "totalAdvancedSync", 1611620166);
        setIntField(term17663, term17663.getClass(), "totalExpertSync", 249657454);
        setIntField(term17663, term17663.getClass(), "totalMasterSync", 1734630901);
        setIntField(term17663, term17663.getClass(), "totalReMasterSync", -703815246);
        setLongField(term17663, term17663.getClass(), "totalAchievement", -1486519351300660432L);
        setLongField(term17663, term17663.getClass(), "totalBasicAchievement", 4777103307547199454L);
        setLongField(term17663, term17663.getClass(), "totalAdvancedAchievement", 6462632207326555041L);
        setLongField(term17663, term17663.getClass(), "totalExpertAchievement", -3188913050877092148L);
        setLongField(term17663, term17663.getClass(), "totalMasterAchievement", -6759247883224780481L);
        setLongField(term17663, term17663.getClass(), "totalReMasterAchievement", -3724162247917461536L);
        setLongField(term17663, term17663.getClass(), "playerOldRating", 7893661350133453338L);
        setLongField(term17663, term17663.getClass(), "playerNewRating", 9056245012917372169L);
        setIntField(term17663, term17663.getClass(), "banState", 157300746);
        setLongField(term17663, term17663.getClass(), "dateTime", 7848004402682338886L);
        setField(term17661, term17661.getClass(), "user", term17663);
        setIntField(term17661, term17661.getClass(), "seasonId", -1600748613);
        setIntField(term17661, term17661.getClass(), "point", -1509192782);
        setIntField(term17661, term17661.getClass(), "rank", -867925573);
        setBooleanField(term17661, term17661.getClass(), "rewardGet", true);
        setField(term17661, term17661.getClass(), "userName", "xypryEkUPF");
        setField(term17661, term17661.getClass(), "recordDate", "zyZTzHNjQr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRank", argTypes, term17661, args);
    }

};


