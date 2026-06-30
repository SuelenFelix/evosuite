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

public class UserCourse_getTotalRestlife_21059972205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74099;

    public UserCourse_getTotalRestlife_21059972205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74105 = new Long(-5386201758403679145L);
        ArrayList term74166 = new ArrayList();
        Integer term74172 = new Integer(1064185088);
        Integer term74174 = new Integer(-1249782654);
        Integer term74176 = new Integer(399302934);
        Integer term74178 = new Integer(-1823255084);
        Integer term74180 = new Integer(793345010);
        ArrayList term74170 = new ArrayList();
        ((ArrayList) term74170).add(term74172);
        ((ArrayList) term74170).add(term74174);
        ((ArrayList) term74170).add(term74176);
        ((ArrayList) term74170).add(term74178);
        ((ArrayList) term74170).add(term74180);
        term74099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term74101 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term74103 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term74119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term74129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74134 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term74099, term74099.getClass(), "id", -2465500898055958051L);
        setLongField(term74101, term74101.getClass(), "id", 3840348555099491893L);
        setLongField(term74103, term74103.getClass(), "id", 4998922959033216897L);
        setField(term74103, term74103.getClass(), "extId", term74105);
        setField(term74103, term74103.getClass(), "luid", "aomDEETHep");
        setIntField(term74120, term74120.getClass(), "year", 2023);
        setShortField(term74120, term74120.getClass(), "month", (short) 8);
        setShortField(term74120, term74120.getClass(), "day", (short) 8);
        setField(term74119, term74119.getClass(), "date", term74120);
        setByteField(term74124, term74124.getClass(), "hour", (byte) 20);
        setByteField(term74124, term74124.getClass(), "minute", (byte) 17);
        setByteField(term74124, term74124.getClass(), "second", (byte) 40);
        setIntField(term74124, term74124.getClass(), "nano", 834219024);
        setField(term74119, term74119.getClass(), "time", term74124);
        setField(term74103, term74103.getClass(), "registerTime", term74119);
        setIntField(term74130, term74130.getClass(), "year", 2012);
        setShortField(term74130, term74130.getClass(), "month", (short) 2);
        setShortField(term74130, term74130.getClass(), "day", (short) 12);
        setField(term74129, term74129.getClass(), "date", term74130);
        setByteField(term74134, term74134.getClass(), "hour", (byte) 16);
        setByteField(term74134, term74134.getClass(), "minute", (byte) 39);
        setByteField(term74134, term74134.getClass(), "second", (byte) 57);
        setIntField(term74134, term74134.getClass(), "nano", 651756700);
        setField(term74129, term74129.getClass(), "time", term74134);
        setField(term74103, term74103.getClass(), "accessTime", term74129);
        setField(term74101, term74101.getClass(), "card", term74103);
        setField(term74101, term74101.getClass(), "userName", "GTMrlIYfIM");
        setIntField(term74101, term74101.getClass(), "isNetMember", 129913260);
        setIntField(term74101, term74101.getClass(), "iconId", 1161032682);
        setIntField(term74101, term74101.getClass(), "plateId", 345139347);
        setIntField(term74101, term74101.getClass(), "titleId", 972415791);
        setIntField(term74101, term74101.getClass(), "partnerId", -263062220);
        setIntField(term74101, term74101.getClass(), "frameId", -814910184);
        setIntField(term74101, term74101.getClass(), "selectMapId", -82425798);
        setIntField(term74101, term74101.getClass(), "totalAwake", 12949829);
        setIntField(term74101, term74101.getClass(), "gradeRating", 169106608);
        setIntField(term74101, term74101.getClass(), "musicRating", 735667683);
        setIntField(term74101, term74101.getClass(), "playerRating", -2099694093);
        setIntField(term74101, term74101.getClass(), "highestRating", -1230860198);
        setIntField(term74101, term74101.getClass(), "gradeRank", -756895441);
        setIntField(term74101, term74101.getClass(), "classRank", -415493508);
        setIntField(term74101, term74101.getClass(), "courseRank", -2039940861);
        setField(term74101, term74101.getClass(), "charaSlot", term74166);
        setField(term74101, term74101.getClass(), "charaLockSlot", term74170);
        setLongField(term74101, term74101.getClass(), "contentBit", 2782559589071225543L);
        setIntField(term74101, term74101.getClass(), "playCount", 1657238527);
        setField(term74101, term74101.getClass(), "eventWatchedDate", "eiDqCOWbLE");
        setField(term74101, term74101.getClass(), "lastGameId", "OBbbsrFNxC");
        setField(term74101, term74101.getClass(), "lastRomVersion", "mvdZyohjrq");
        setField(term74101, term74101.getClass(), "lastDataVersion", "hXsByefZqZ");
        setField(term74101, term74101.getClass(), "lastLoginDate", "PfWKdFFgbz");
        setField(term74101, term74101.getClass(), "lastPlayDate", "rgmFLfFmTW");
        setIntField(term74101, term74101.getClass(), "lastPlayCredit", -1118052096);
        setIntField(term74101, term74101.getClass(), "lastPlayMode", 789771906);
        setIntField(term74101, term74101.getClass(), "lastPlaceId", 1156356127);
        setField(term74101, term74101.getClass(), "lastPlaceName", "GHvFvelXFv");
        setIntField(term74101, term74101.getClass(), "lastAllNetId", -2104118662);
        setIntField(term74101, term74101.getClass(), "lastRegionId", -420723612);
        setField(term74101, term74101.getClass(), "lastRegionName", "MIDoqNmCoh");
        setField(term74101, term74101.getClass(), "lastClientId", "yrOIMfdQSI");
        setField(term74101, term74101.getClass(), "lastCountryCode", "PhtNZAacut");
        setIntField(term74101, term74101.getClass(), "lastSelectEMoney", -1133208152);
        setIntField(term74101, term74101.getClass(), "lastSelectTicket", -696625342);
        setIntField(term74101, term74101.getClass(), "lastSelectCourse", -1414592494);
        setIntField(term74101, term74101.getClass(), "lastCountCourse", 1786579332);
        setField(term74101, term74101.getClass(), "firstGameId", "xbPAqsSBBS");
        setField(term74101, term74101.getClass(), "firstRomVersion", "ivxMfASKCB");
        setField(term74101, term74101.getClass(), "firstDataVersion", "JbksMMXXzT");
        setField(term74101, term74101.getClass(), "firstPlayDate", "WHpoLWpffz");
        setField(term74101, term74101.getClass(), "compatibleCmVersion", "axiXBkomuw");
        setField(term74101, term74101.getClass(), "dailyBonusDate", "nhByIXwUpO");
        setField(term74101, term74101.getClass(), "dailyCourseBonusDate", "vVySvQZVok");
        setField(term74101, term74101.getClass(), "lastPairLoginDate", "fDVzkGiHev");
        setField(term74101, term74101.getClass(), "lastTrialPlayDate", "CanAbWJNgt");
        setIntField(term74101, term74101.getClass(), "playVsCount", 1501260437);
        setIntField(term74101, term74101.getClass(), "playSyncCount", -76595520);
        setIntField(term74101, term74101.getClass(), "winCount", 1443232393);
        setIntField(term74101, term74101.getClass(), "helpCount", -1910414427);
        setIntField(term74101, term74101.getClass(), "comboCount", -2007275509);
        setLongField(term74101, term74101.getClass(), "totalDeluxscore", -3924790970169443418L);
        setLongField(term74101, term74101.getClass(), "totalBasicDeluxscore", -1803333754619597089L);
        setLongField(term74101, term74101.getClass(), "totalAdvancedDeluxscore", -572086959828885449L);
        setLongField(term74101, term74101.getClass(), "totalExpertDeluxscore", -5605174994139612712L);
        setLongField(term74101, term74101.getClass(), "totalMasterDeluxscore", -5580906279881288806L);
        setLongField(term74101, term74101.getClass(), "totalReMasterDeluxscore", -4821939044127073567L);
        setIntField(term74101, term74101.getClass(), "totalSync", -540049509);
        setIntField(term74101, term74101.getClass(), "totalBasicSync", -75757335);
        setIntField(term74101, term74101.getClass(), "totalAdvancedSync", 1493891481);
        setIntField(term74101, term74101.getClass(), "totalExpertSync", 1654753354);
        setIntField(term74101, term74101.getClass(), "totalMasterSync", 609765653);
        setIntField(term74101, term74101.getClass(), "totalReMasterSync", 919376771);
        setLongField(term74101, term74101.getClass(), "totalAchievement", 5690319333104320494L);
        setLongField(term74101, term74101.getClass(), "totalBasicAchievement", 3924949950728854492L);
        setLongField(term74101, term74101.getClass(), "totalAdvancedAchievement", -935483464256316780L);
        setLongField(term74101, term74101.getClass(), "totalExpertAchievement", 8155420036739278471L);
        setLongField(term74101, term74101.getClass(), "totalMasterAchievement", 5083842693203849201L);
        setLongField(term74101, term74101.getClass(), "totalReMasterAchievement", -7658308085805400095L);
        setLongField(term74101, term74101.getClass(), "playerOldRating", -4985422849657460879L);
        setLongField(term74101, term74101.getClass(), "playerNewRating", -5119974436779485754L);
        setIntField(term74101, term74101.getClass(), "banState", 632440696);
        setLongField(term74101, term74101.getClass(), "dateTime", -983800227104783410L);
        setField(term74099, term74099.getClass(), "user", term74101);
        setIntField(term74099, term74099.getClass(), "courseId", 1176303286);
        setBooleanField(term74099, term74099.getClass(), "isLastClear", false);
        setIntField(term74099, term74099.getClass(), "totalRestlife", -1738480762);
        setIntField(term74099, term74099.getClass(), "totalAchievement", -1175470028);
        setIntField(term74099, term74099.getClass(), "totalDeluxscore", -910760048);
        setIntField(term74099, term74099.getClass(), "playCount", 702111671);
        setField(term74099, term74099.getClass(), "clearDate", "tFRLUuSeUt");
        setField(term74099, term74099.getClass(), "lastPlayDate", "KcKxvbBAHa");
        setIntField(term74099, term74099.getClass(), "bestAchievement", 1127359599);
        setField(term74099, term74099.getClass(), "bestAchievementDate", "NbFVXCPmxn");
        setIntField(term74099, term74099.getClass(), "bestDeluxscore", 890298090);
        setField(term74099, term74099.getClass(), "bestDeluxscoreDate", "ovYlGvhKKO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRestlife", argTypes, term74099, args);
    }

};


