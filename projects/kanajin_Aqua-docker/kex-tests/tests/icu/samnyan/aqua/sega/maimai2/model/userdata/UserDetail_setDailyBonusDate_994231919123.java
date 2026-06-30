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

public class UserDetail_setDailyBonusDate_994231919123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4299712;

    public UserDetail_setDailyBonusDate_994231919123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4299716 = new Long(6012110850487716369L);
        Integer term4299779 = new Integer(1444890082);
        Integer term4299781 = new Integer(-463625508);
        Integer term4299783 = new Integer(86106790);
        ArrayList term4299777 = new ArrayList();
        ((ArrayList) term4299777).add(term4299779);
        ((ArrayList) term4299777).add(term4299781);
        ((ArrayList) term4299777).add(term4299783);
        Integer term4299789 = new Integer(-1239672206);
        ArrayList term4299787 = new ArrayList();
        ((ArrayList) term4299787).add(term4299789);
        term4299712 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4299714 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4299730 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4299731 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4299735 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4299740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4299741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4299745 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4299712, term4299712.getClass(), "id", 3607692228771068229L);
        setLongField(term4299714, term4299714.getClass(), "id", -9175579548641006588L);
        setField(term4299714, term4299714.getClass(), "extId", term4299716);
        setField(term4299714, term4299714.getClass(), "luid", "pWhwdGnslN");
        setIntField(term4299731, term4299731.getClass(), "year", 2027);
        setShortField(term4299731, term4299731.getClass(), "month", (short) 5);
        setShortField(term4299731, term4299731.getClass(), "day", (short) 28);
        setField(term4299730, term4299730.getClass(), "date", term4299731);
        setByteField(term4299735, term4299735.getClass(), "hour", (byte) 7);
        setByteField(term4299735, term4299735.getClass(), "minute", (byte) 12);
        setByteField(term4299735, term4299735.getClass(), "second", (byte) 51);
        setIntField(term4299735, term4299735.getClass(), "nano", 702209144);
        setField(term4299730, term4299730.getClass(), "time", term4299735);
        setField(term4299714, term4299714.getClass(), "registerTime", term4299730);
        setIntField(term4299741, term4299741.getClass(), "year", 2029);
        setShortField(term4299741, term4299741.getClass(), "month", (short) 1);
        setShortField(term4299741, term4299741.getClass(), "day", (short) 28);
        setField(term4299740, term4299740.getClass(), "date", term4299741);
        setByteField(term4299745, term4299745.getClass(), "hour", (byte) 0);
        setByteField(term4299745, term4299745.getClass(), "minute", (byte) 47);
        setByteField(term4299745, term4299745.getClass(), "second", (byte) 17);
        setIntField(term4299745, term4299745.getClass(), "nano", 979347143);
        setField(term4299740, term4299740.getClass(), "time", term4299745);
        setField(term4299714, term4299714.getClass(), "accessTime", term4299740);
        setField(term4299712, term4299712.getClass(), "card", term4299714);
        setField(term4299712, term4299712.getClass(), "userName", "qGzKGxGImy");
        setIntField(term4299712, term4299712.getClass(), "isNetMember", -391811070);
        setIntField(term4299712, term4299712.getClass(), "iconId", 2015422523);
        setIntField(term4299712, term4299712.getClass(), "plateId", -836653916);
        setIntField(term4299712, term4299712.getClass(), "titleId", 1985293514);
        setIntField(term4299712, term4299712.getClass(), "partnerId", 1700011177);
        setIntField(term4299712, term4299712.getClass(), "frameId", 9706233);
        setIntField(term4299712, term4299712.getClass(), "selectMapId", 1495242701);
        setIntField(term4299712, term4299712.getClass(), "totalAwake", -407695121);
        setIntField(term4299712, term4299712.getClass(), "gradeRating", 1609004616);
        setIntField(term4299712, term4299712.getClass(), "musicRating", -306064498);
        setIntField(term4299712, term4299712.getClass(), "playerRating", 1322124602);
        setIntField(term4299712, term4299712.getClass(), "highestRating", -1155581831);
        setIntField(term4299712, term4299712.getClass(), "gradeRank", 2015004020);
        setIntField(term4299712, term4299712.getClass(), "classRank", 153280861);
        setIntField(term4299712, term4299712.getClass(), "courseRank", -2137082349);
        setField(term4299712, term4299712.getClass(), "charaSlot", term4299777);
        setField(term4299712, term4299712.getClass(), "charaLockSlot", term4299787);
        setLongField(term4299712, term4299712.getClass(), "contentBit", 2568496793080209347L);
        setIntField(term4299712, term4299712.getClass(), "playCount", 980947413);
        setField(term4299712, term4299712.getClass(), "eventWatchedDate", "UgofnPWqLf");
        setField(term4299712, term4299712.getClass(), "lastGameId", "SxjLNzgvSg");
        setField(term4299712, term4299712.getClass(), "lastRomVersion", "GqDllGWGNd");
        setField(term4299712, term4299712.getClass(), "lastDataVersion", "GNOPAfVxRL");
        setField(term4299712, term4299712.getClass(), "lastLoginDate", "PNxPYpXAfg");
        setField(term4299712, term4299712.getClass(), "lastPlayDate", "AmcEiAdHWu");
        setIntField(term4299712, term4299712.getClass(), "lastPlayCredit", -1094545784);
        setIntField(term4299712, term4299712.getClass(), "lastPlayMode", -1744421273);
        setIntField(term4299712, term4299712.getClass(), "lastPlaceId", -889989131);
        setField(term4299712, term4299712.getClass(), "lastPlaceName", "xhKEwwVkMW");
        setIntField(term4299712, term4299712.getClass(), "lastAllNetId", 1679141484);
        setIntField(term4299712, term4299712.getClass(), "lastRegionId", -1910121455);
        setField(term4299712, term4299712.getClass(), "lastRegionName", "ENoAUaIraq");
        setField(term4299712, term4299712.getClass(), "lastClientId", "wfmCWlbCXX");
        setField(term4299712, term4299712.getClass(), "lastCountryCode", "XVmrtbiFhx");
        setIntField(term4299712, term4299712.getClass(), "lastSelectEMoney", -1098181667);
        setIntField(term4299712, term4299712.getClass(), "lastSelectTicket", 1780543474);
        setIntField(term4299712, term4299712.getClass(), "lastSelectCourse", 251877211);
        setIntField(term4299712, term4299712.getClass(), "lastCountCourse", 1644841835);
        setField(term4299712, term4299712.getClass(), "firstGameId", "lSQDdSEXSy");
        setField(term4299712, term4299712.getClass(), "firstRomVersion", "FPLEEhHzCi");
        setField(term4299712, term4299712.getClass(), "firstDataVersion", "EBFQfZfuCe");
        setField(term4299712, term4299712.getClass(), "firstPlayDate", "iigjYfblga");
        setField(term4299712, term4299712.getClass(), "compatibleCmVersion", "MbOVzpVStf");
        setField(term4299712, term4299712.getClass(), "dailyBonusDate", "AOYyvveZAF");
        setField(term4299712, term4299712.getClass(), "dailyCourseBonusDate", "Gakhtvkspw");
        setField(term4299712, term4299712.getClass(), "lastPairLoginDate", "eqsIpSIAOe");
        setField(term4299712, term4299712.getClass(), "lastTrialPlayDate", "eFHxVVOFlI");
        setIntField(term4299712, term4299712.getClass(), "playVsCount", 1868428277);
        setIntField(term4299712, term4299712.getClass(), "playSyncCount", 929100252);
        setIntField(term4299712, term4299712.getClass(), "winCount", 1667151209);
        setIntField(term4299712, term4299712.getClass(), "helpCount", -15892565);
        setIntField(term4299712, term4299712.getClass(), "comboCount", 204430592);
        setLongField(term4299712, term4299712.getClass(), "totalDeluxscore", 93613696353151560L);
        setLongField(term4299712, term4299712.getClass(), "totalBasicDeluxscore", -3536286097270221952L);
        setLongField(term4299712, term4299712.getClass(), "totalAdvancedDeluxscore", -6088872263736926555L);
        setLongField(term4299712, term4299712.getClass(), "totalExpertDeluxscore", -3737376891830038818L);
        setLongField(term4299712, term4299712.getClass(), "totalMasterDeluxscore", 1219442520181857736L);
        setLongField(term4299712, term4299712.getClass(), "totalReMasterDeluxscore", 4065389294119568532L);
        setIntField(term4299712, term4299712.getClass(), "totalSync", -1551890493);
        setIntField(term4299712, term4299712.getClass(), "totalBasicSync", -2087570379);
        setIntField(term4299712, term4299712.getClass(), "totalAdvancedSync", -2053972289);
        setIntField(term4299712, term4299712.getClass(), "totalExpertSync", -609822276);
        setIntField(term4299712, term4299712.getClass(), "totalMasterSync", 64736699);
        setIntField(term4299712, term4299712.getClass(), "totalReMasterSync", -1680826193);
        setLongField(term4299712, term4299712.getClass(), "totalAchievement", -5951407331685184359L);
        setLongField(term4299712, term4299712.getClass(), "totalBasicAchievement", -1103480826055939443L);
        setLongField(term4299712, term4299712.getClass(), "totalAdvancedAchievement", 529068912009871296L);
        setLongField(term4299712, term4299712.getClass(), "totalExpertAchievement", -4563903555040702705L);
        setLongField(term4299712, term4299712.getClass(), "totalMasterAchievement", 6416839082354528107L);
        setLongField(term4299712, term4299712.getClass(), "totalReMasterAchievement", -1888854583664845792L);
        setLongField(term4299712, term4299712.getClass(), "playerOldRating", -6823288115166583987L);
        setLongField(term4299712, term4299712.getClass(), "playerNewRating", -7102901953369543388L);
        setIntField(term4299712, term4299712.getClass(), "banState", 1118944468);
        setLongField(term4299712, term4299712.getClass(), "dateTime", -1888469722387170583L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MIOEprkjom";
        callMethod(klass, "setDailyBonusDate", argTypes, term4299712, args);
    }

};


